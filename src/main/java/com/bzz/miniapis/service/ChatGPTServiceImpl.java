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
import com.bzz.miniapis.entity.CommonResponse;
import com.bzz.miniapis.entity.chatgpt.ChatGPTRequest;
import com.bzz.miniapis.entity.chatgpt.ChatGPTResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ChatGPTServiceImpl {

    private final Logger log = LoggerFactory.getLogger(ChatGPTServiceImpl.class);

    private static Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .disableHtmlEscaping() //避免转换为Unicode转义字符
            .create();

    private ChatGPTRequest requestModel;

    private final ExecutorService executorService;

    public void setRequestModel(ChatGPTRequest requestModel) {
        this.requestModel = requestModel;
    }

    /**
     * 初始化类对象
     *
     * @param requestModel
     */
    public ChatGPTServiceImpl(ChatGPTRequest requestModel) {
        //初始化参数
        this.requestModel = requestModel;
        //初始化线程池
        this.executorService = Executors.newCachedThreadPool();
    }


    public void getResponseAsync(ChatGPTApiCallback callback) {
        getResponseAsync(requestModel, callback);
    }

    /**
     * 传入请求对象, 发起API接口调用
     *
     * @param requestModel 请求的参数
     * @param callback     callback处理函数,需要调用者实现逻辑
     */
    public void getResponseAsync(ChatGPTRequest requestModel, ChatGPTApiCallback callback) {
        //callback调用
        try {
            CommonResponse commonResponse = postChatGPTResponse(requestModel);
            if (commonResponse != null) {
                if (commonResponse.getStatusCode() == 200) {
                    //返回字符串包装为ChatGPTResponse对象
                    Type type = new TypeToken<ChatGPTResponse>() {
                    }.getType();
                    ChatGPTResponse response = gson.fromJson(commonResponse.getResponse(), type);
                    callback.onSuccess(response);
                } else {
                    log.error("callback.onFailure --- {" + commonResponse.toString() + "}");
                    callback.onFailure(commonResponse);
                }
            } else {
                log.error("callback.onFailure --- {commonResponse is null}");
                callback.onFailure("commonResponse is null");
            }
        } catch (IOException e) {
            callback.onFailure(e.getMessage());
        }

        //线程池调用
//        executorService.submit(() -> {
//            try {
//                CommonResponse commonResponse = postChatGPTResponse(requestModel);
//                if (commonResponse != null) {
//                    if (commonResponse.getStatusCode() == 200) {
//                        Type type = new TypeToken<ChatGPTApiResponse>() {
//                        }.getType();
//                        ChatGPTApiResponse response = gson.fromJson(commonResponse.getResponse(), type);
//                        callback.onSuccess(response);
//                    } else {
//                        callback.onFailure(commonResponse);
//                    }
//                } else {
//                    callback.onFailure("commonResponse is null");
//                }
//            } catch (IOException e) {
//                callback.onFailure(e.getMessage());
//            }
//        });
    }

    private CommonResponse postChatGPTResponse(ChatGPTRequest requestModel) throws IOException {
        URL url = new URL(requestModel.getOriginApiUrl());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setConnectTimeout(30000);//连接超时 单位毫秒
        conn.setReadTimeout(30000);//读取超时 单位毫秒
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
        String response = readResponse(conn);
        return new CommonResponse(statusCode, statusMessage, response);
    }

    /**
     * 读取返回的内容
     *
     * @param conn
     * @return string
     * @throws IOException
     */
    private String readResponse(HttpURLConnection conn) throws IOException {
        StringBuilder response = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"))) {
            String responseLine;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
        } catch (IOException e) {
            BufferedReader errorReader = new BufferedReader(new InputStreamReader(conn.getErrorStream(), "utf-8"));
            String errorLine;
            while ((errorLine = errorReader.readLine()) != null) {
                response.append(errorLine.trim());
            }
            errorReader.close();
        }
        log.debug("readResponse --- {" + response.toString() + "}");
        return response.toString();
    }

}
