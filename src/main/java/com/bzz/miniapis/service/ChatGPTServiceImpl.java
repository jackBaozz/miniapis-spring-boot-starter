/*
 * Copyright 2023 bzz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bzz.miniapis.service;

import com.bzz.miniapis.callback.ChatGPTApiCallback;
import com.bzz.miniapis.config.ChatGPTProperties;
import com.bzz.miniapis.entity.CommonResponse;
import com.bzz.miniapis.entity.chatgpt.ChatGPTRequest;
import com.bzz.miniapis.entity.chatgpt.ChatGPTResponse;
import com.bzz.miniapis.utils.ExceptionUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.annotation.PreDestroy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ChatGPT 服务实现类
 *
 * @author bzz
 */
public class ChatGPTServiceImpl implements ChatGPTService {

    private final Logger log = LoggerFactory.getLogger(ChatGPTServiceImpl.class);

    private static final Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .disableHtmlEscaping() //避免转换为Unicode转义字符
            .create();

    private final ChatGPTProperties properties;
    private final ExecutorService executorService;

    public ChatGPTServiceImpl(ChatGPTProperties properties) {
        this.properties = properties;
        this.executorService = Executors.newCachedThreadPool();
    }

    @Override
    public ChatGPTResponse getResponse(ChatGPTRequest request) {
        populateDefaults(request);
        try {
            CommonResponse commonResponse = postChatGPTResponse(request);
            if (commonResponse != null && commonResponse.getStatusCode() == 200) {
                Type type = new TypeToken<ChatGPTResponse>() {}.getType();
                return gson.fromJson(commonResponse.getResponse(), type);
            } else {
                String errorMsg = commonResponse != null ? commonResponse.toString() : "Response is null";
                log.error("Sync ChatGPT request failed: {}", errorMsg);
                throw new RuntimeException("ChatGPT API call failed: " + errorMsg);
            }
        } catch (IOException e) {
            log.error("Sync ChatGPT request exception", e);
            throw new RuntimeException("ChatGPT API connection error", e);
        }
    }

    @Override
    public void getResponseAsync(ChatGPTRequest request, ChatGPTApiCallback callback) {
        populateDefaults(request);
        
        executorService.submit(() -> {
            try {
                CommonResponse commonResponse = postChatGPTResponse(request);
                if (commonResponse != null) {
                    if (commonResponse.getStatusCode() == 200) {
                        Type type = new TypeToken<ChatGPTResponse>() {}.getType();
                        ChatGPTResponse response = gson.fromJson(commonResponse.getResponse(), type);
                        callback.onSuccess(response);
                    } else {
                        log.error("Async callback.onFailure --- {" + commonResponse.toString() + "}");
                        callback.onFailure(commonResponse);
                    }
                } else {
                    log.error("Async callback.onFailure --- {commonResponse is null}");
                    callback.onFailure("commonResponse is null");
                }
            } catch (IOException e) {
                log.error("Async ChatGPT request exception", e);
                callback.onFailure(e.getMessage());
            }
        });
    }

    /**
     * 关闭服务，释放线程池资源
     */
    @PreDestroy
    public void shutdown() {
        if (executorService != null && !executorService.isShutdown()) {
            executorService.shutdown();
        }
    }

    private void populateDefaults(ChatGPTRequest request) {
        if (request.getApiSecretKey() == null || request.getApiSecretKey().isEmpty()) {
            request.setApiSecretKey(properties.getApiKey());
        }
        if (request.getOriginApiUrl() == null || request.getOriginApiUrl().isEmpty() || "https://api.openai.com/v1/chat/completions".equals(request.getOriginApiUrl())) {
            if (properties.getApiUrl() != null && !properties.getApiUrl().isEmpty()) {
                request.setOriginApiUrl(properties.getApiUrl());
            }
        }
    }

    /**
     * 使用jdk自带的http客户端去发送post请求
     */
    private CommonResponse postChatGPTResponse(ChatGPTRequest requestModel) throws IOException {
        try {
            URL url = new URL(requestModel.getOriginApiUrl());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setConnectTimeout(60000);//连接超时 单位毫秒
            conn.setReadTimeout(60000);//读取超时 单位毫秒
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestProperty("Charset", "UTF-8");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Authorization", "Bearer " + requestModel.getApiSecretKey());
            String requestBody = gson.toJson(requestModel);
            log.debug("requestBody --- {" + requestBody + "}");

            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = requestBody.getBytes("utf-8");
                os.write(input, 0, input.length);
            }
            //获取到返回的内容
            int statusCode = conn.getResponseCode();
            String statusMessage = conn.getResponseMessage();
            String response = this.readResponse(conn);
            return new CommonResponse(statusCode, statusMessage, response);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 解析返回的内容
     */
    private String readResponse(HttpURLConnection conn) throws IOException {
        StringBuilder response = new StringBuilder();
        try (BufferedReader correctReader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"))) {
            String responseLine;
            while ((responseLine = correctReader.readLine()) != null) {
                response.append(responseLine.trim());
            }
        } catch (IOException e) {
            log.error("readResponse IOException = {}", ExceptionUtil.simpleMessage(e));
            BufferedReader errorReader = new BufferedReader(new InputStreamReader(conn.getErrorStream(), "utf-8"));
            String errorLine;
            while ((errorLine = errorReader.readLine()) != null) {
                response.append(errorLine.trim());
            }
            errorReader.close();
        } finally {
            if (log.isDebugEnabled()) {
                log.debug("readResponse = {}", response.toString());
            }
        }
        return response.toString();
    }
}
