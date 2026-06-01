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
import com.bzz.miniapis.entity.chatgpt.ChatGPTRequest;
import com.bzz.miniapis.entity.chatgpt.ChatGPTResponse;

/**
 * ChatGPT 服务接口
 *
 * @author bzz
 */
public interface ChatGPTService {

    /**
     * 同步调用 ChatGPT API
     *
     * @param request 请求实体，其中如果没有设置 apiKey 和 apiUrl，将使用默认配置
     * @return ChatGPT 响应大对象
     */
    ChatGPTResponse getResponse(ChatGPTRequest request);

    /**
     * 异步调用 ChatGPT API，结果通过回调返回
     *
     * @param request  请求实体
     * @param callback 回调处理对象
     */
    void getResponseAsync(ChatGPTRequest request, ChatGPTApiCallback callback);
}
