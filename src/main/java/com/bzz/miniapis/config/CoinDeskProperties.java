package com.bzz.miniapis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * CoinDesk API 配置属性
 *
 * @author bzz
 */
@ConfigurationProperties(prefix = "miniapis.coindesk")
public class CoinDeskProperties {

    /**
     * 是否开启 CoinDesk API
     */
    private boolean enabled = true;

    /**
     * CoinDesk API 基础URL
     */
    private String url = "https://api.coindesk.com";

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
