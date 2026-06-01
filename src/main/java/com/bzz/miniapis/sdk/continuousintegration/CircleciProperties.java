package com.bzz.miniapis.sdk.continuousintegration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.continuousintegration.circleci")
public class CircleciProperties {
    private boolean enabled = true;
    private String url = "https://circleci.com/docs/api/v1-reference/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
