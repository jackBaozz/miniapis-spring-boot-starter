package com.bzz.miniapis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * CatFact API 配置属性
 *
 * @author bzz
 */
@ConfigurationProperties(prefix = "miniapis.catfact")
public class CatFactProperties {

    /**
     * 是否开启 CatFact API
     */
    private boolean enabled = true;

    /**
     * CatFact API 基础URL
     */
    private String url = "https://catfact.ninja";

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
