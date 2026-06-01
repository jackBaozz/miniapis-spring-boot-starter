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

package com.bzz.miniapis.sdk.ipify;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

/**
 * ipify 声明式客户端
 *
 * @author bzz
 */
@HttpExchange
public interface IpifyClient {

    /**
     * 获取客户端公共 IP 地址
     *
     * @param format 返回格式，例如 "json" 会返回 JSON 对象
     */
    @GetExchange("/")
    IpResponse getIp(@RequestParam("format") String format);
}
