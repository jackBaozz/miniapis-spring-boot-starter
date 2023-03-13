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

package com.bzz.miniapis;


import com.bzz.miniapis.aop.DoCheckPoint;
import com.bzz.miniapis.callback.ChatGPTApiCallback;
import com.bzz.miniapis.config.CheckAutoConfigure;
import com.bzz.miniapis.entity.ChatGPTMessageModel;
import com.bzz.miniapis.entity.ChatGPTRequest;
import com.bzz.miniapis.entity.ChatGPTResponse;
import com.bzz.miniapis.entity.CommonResponse;
import com.bzz.miniapis.service.ChatGPTServiceImpl;
import com.bzz.miniapis.web.TestController;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {CheckAutoConfigure.class, DoCheckPoint.class, TestController.class})
@TestPropertySource(locations = "classpath:test.properties")
@AutoConfigureMockMvc
public class ChatGPTTest {

    private static Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .disableHtmlEscaping() //避免转换为Unicode转义字符
            .create();

    private ChatGPTServiceImpl service;

    private ChatGPTRequest requestModel;

    private ChatGPTMessageModel messageModel;


    @Value("${miniapis.enabled}")
    private boolean mainSwitch;

    /**
     * 只校验功能开关
     */
    @Value("${miniapis.check.enabled}")
    private boolean enabled;

    @Before
    public void before() {
        System.out.println("miniapis.enabled=" + mainSwitch);
        //发送的消息
        messageModel = new ChatGPTMessageModel();
        messageModel.setRole("user");
        messageModel.setContent("Hello! how are you?");

        ChatGPTMessageModel[] messages = new ChatGPTMessageModel[]{messageModel};
        requestModel = new ChatGPTRequest();
        //构件请求参数
        requestModel.setMessages(messages);

        //初始化实现类
        service = new ChatGPTServiceImpl(requestModel);

    }

    /**
     * check.enabled=true的时候
     */
    @Test
    public void test1() throws Throwable {
        service.getResponseAsync(new ChatGPTApiCallback() {
            @Override
            public void onSuccess(ChatGPTResponse response) {
                System.out.println("onSuccess ------ ");
                System.out.println(gson.toJson(response));
            }

            @Override
            public void onFailure(String errorMessage) {
                System.out.println("onFailure ------ ");
                System.out.println(errorMessage);
            }

            @Override
            public void onFailure(CommonResponse response) {
                System.out.println("onFailure ------ ");
                System.out.println(gson.toJson(response));
            }
        });
    }


}
