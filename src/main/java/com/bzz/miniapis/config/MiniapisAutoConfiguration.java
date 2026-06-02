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

import com.bzz.miniapis.aop.DoCheckPoint;
import com.bzz.miniapis.service.ChatGPTService;
import com.bzz.miniapis.service.ChatGPTServiceImpl;
import com.theokanning.openai.service.OpenAiService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * miniapis 统一自动装配类
 *
 * @author bzz
 */
@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        CheckProperties.class,
        ChatGPTProperties.class,
        OpenAiProperties.class
})
public class MiniapisAutoConfiguration {

    /**
     * 参数校验 AOP 切面
     */
    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.check.enabled", havingValue = "true", matchIfMissing = true)
    public DoCheckPoint point() {
        return new DoCheckPoint();
    }

    /**
     * ChatGPT 自研 Service 客户端
     */
    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.chatgpt.enabled", havingValue = "true", matchIfMissing = true)
    public ChatGPTService chatGPTService(ChatGPTProperties chatGPTProperties) {
        return new ChatGPTServiceImpl(chatGPTProperties);
    }

    /**
     * OpenAI 官方 SDK 客户端 Bean
     */
    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.openai.api-key")
    @ConditionalOnClass(OpenAiService.class)
    public OpenAiService openAiService(OpenAiProperties openAiProperties) {
        return new OpenAiService(openAiProperties.getApiKey());
    }

}
