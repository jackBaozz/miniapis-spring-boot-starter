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
import java.util.List;

/**
 * ChatGPT返回的大对象
 */
public class ChatGPTApiResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id : cmpl-uqkvlQyYK7bGYrRHQ0eXlWi7
     * object : text_completion
     * created : 1589478378
     * model : text-davinci-003
     * choices : [{"text":"\n\nThis is indeed a test","index":0,"logprobs":null,"finish_reason":"length"}]
     * usage : {"prompt_tokens":5,"completion_tokens":7,"total_tokens":12}
     */

    private String id;
    private String object;
    private int created;
    private String model;
    private ChatGPTUsageModel usage;
    private List<ChatGPTChoicesModel> choices;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ChatGPTUsageModel getUsage() {
        return usage;
    }

    public void setUsage(ChatGPTUsageModel usage) {
        this.usage = usage;
    }

    public List<ChatGPTChoicesModel> getChoices() {
        return choices;
    }

    public void setChoices(List<ChatGPTChoicesModel> choices) {
        this.choices = choices;
    }

}
