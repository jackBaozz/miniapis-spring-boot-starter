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

package com.bzz.miniapis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 随机笑话 API 配置属性
 *
 * @author bzz
 */
@ConfigurationProperties("miniapis.joke")
public class JokeProperties {

    /**
     * 是否启用随机笑话 API，默认为 true
     */
    private boolean enabled = true;

    /**
     * 随机笑话接口基础 URL
     */
    private String url = "https://official-joke-api.appspot.com";

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
