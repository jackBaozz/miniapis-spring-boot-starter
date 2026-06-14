package com.bzz.miniapis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 代理配置属性
 */
@ConfigurationProperties(prefix = "miniapis.proxy")
public class ProxyProperties {

    /**
     * 是否启用代理，默认不启用
     */
    private boolean enabled = false;

    /**
     * 代理类型，支持 HTTP, SOCKS 等，默认 HTTP
     */
    private String type = "HTTP";

    /**
     * 代理主机地址
     */
    private String host;

    /**
     * 代理端口
     */
    private Integer port;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
