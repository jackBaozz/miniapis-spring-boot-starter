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

package com.bzz.miniapis.entity;

import java.io.Serializable;

/**
 * ChatGPT的最终选择(输出结果)
 *
 * @author bzz
 * @since 2013.3.16
 */
public class ChatGPTChoicesModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private int index;
    private String finish_reason;

    private ChatGPTMessageModel message;


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getFinish_reason() {
        return finish_reason;
    }

    public void setFinish_reason(String finish_reason) {
        this.finish_reason = finish_reason;
    }

    public ChatGPTMessageModel getMessage() {
        return message;
    }

    public void setMessage(ChatGPTMessageModel message) {
        this.message = message;
    }
}
