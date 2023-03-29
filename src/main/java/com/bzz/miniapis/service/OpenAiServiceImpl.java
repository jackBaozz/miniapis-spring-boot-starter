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


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 使用https://github.com/TheoKanning/openai-java的项目封装的另一种JDK实现
 *
 * 未测试, 不知是否是最新接口(谨慎使用)
 */
public class OpenAiServiceImpl {

    private final Logger log = LoggerFactory.getLogger(OpenAiServiceImpl.class);

    private static Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .disableHtmlEscaping() //避免转换为Unicode转义字符
            .create();

    private OpenAiService service = new OpenAiService("your_token");

    /**
     * 需要自己处理返回的choices
     */
    private void getResponseAsync() {
        CompletionRequest completionRequest = CompletionRequest.builder()
                .prompt("Somebody once told me the world is gonna roll me")
                .model("ada")
                .echo(true)
                .build();
        service.createCompletion(completionRequest).getChoices().forEach(System.out::println);
    }
}
