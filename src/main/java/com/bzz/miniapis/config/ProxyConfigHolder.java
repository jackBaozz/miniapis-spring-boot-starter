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

import java.net.InetSocketAddress;
import java.net.Proxy;

/**
 * 全局代理配置持有类
 */
public class ProxyConfigHolder {

    private static volatile Proxy proxy = null;

    /**
     * 获取全局代理对象，若未启用或未配置则返回 null
     */
    public static Proxy getProxy() {
        return proxy;
    }

    /**
     * 设置全局代理对象
     */
    public static void setProxy(Proxy p) {
        proxy = p;
    }

    /**
     * 根据 ProxyProperties 初始化代理
     */
    public static void initialize(ProxyProperties properties) {
        if (properties == null || !properties.isEnabled()) {
            proxy = null;
            return;
        }
        if (properties.getHost() == null || properties.getHost().trim().isEmpty() || properties.getPort() == null) {
            proxy = null;
            return;
        }

        Proxy.Type type = Proxy.Type.HTTP;
        String typeStr = properties.getType();
        if (typeStr != null) {
            typeStr = typeStr.trim().toUpperCase();
            if (typeStr.contains("SOCKS")) {
                type = Proxy.Type.SOCKS;
            }
        }

        proxy = new Proxy(type, new InetSocketAddress(properties.getHost().trim(), properties.getPort()));
    }
}
