package com.bzz.miniapis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Dogfacts API 配置属性
 * Auto-generated
 */
@ConfigurationProperties(prefix = "miniapis.dogfacts")
public class DogfactsProperties {

    private boolean enabled = true;
    private String url = "https://dog-api.kinduff.com";

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
