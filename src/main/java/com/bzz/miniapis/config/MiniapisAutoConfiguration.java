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
        ProxyProperties.class
})
public class MiniapisAutoConfiguration {

    public MiniapisAutoConfiguration(ProxyProperties proxyProperties) {
        ProxyConfigHolder.initialize(proxyProperties);
    }

    /**
     * 参数校验 AOP 切面
     */
    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.check.enabled", havingValue = "true")
    public DoCheckPoint point() {
        return new DoCheckPoint();
    }

}
