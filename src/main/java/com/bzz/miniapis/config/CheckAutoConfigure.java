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
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置类
 */
@Configuration
// 注意@ConditionalOnProperty注解要放在后面两个注解的前面，这样才会优先通过配置文件判断是否要开启自动装配。
@ConditionalOnProperty(value = "check.enabled", havingValue = "true")
@ConditionalOnClass(CheckProperties.class)
@EnableConfigurationProperties(CheckProperties.class)
public class CheckAutoConfigure {

    /**
     * 使用配置Bean的方式使用DoCheckPoint切面
     */
    @Bean
    @ConditionalOnMissingBean
    public DoCheckPoint point() {
        return new DoCheckPoint();
    }

}
