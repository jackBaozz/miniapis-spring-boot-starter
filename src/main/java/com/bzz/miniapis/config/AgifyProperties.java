package com.bzz.miniapis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Agify API 配置属性
 *
 * @author bzz
 */
@ConfigurationProperties(prefix = "miniapis.agify")
public class AgifyProperties {

    /**
     * 是否开启 Agify API
     */
    private boolean enabled = true;

    /**
     * Agify API 基础URL
     */
    private String url = "https://api.agify.io";

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
