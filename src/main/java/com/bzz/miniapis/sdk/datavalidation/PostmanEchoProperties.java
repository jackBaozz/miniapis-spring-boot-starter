package com.bzz.miniapis.sdk.datavalidation;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.datavalidation.postmanecho")
public class PostmanEchoProperties {
    private boolean enabled = true;
    private String url = "https://www.postman-echo.com";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
