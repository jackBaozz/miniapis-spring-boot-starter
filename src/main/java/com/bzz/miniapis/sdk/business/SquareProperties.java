package com.bzz.miniapis.sdk.business;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.business.square")
public class SquareProperties {
    private boolean enabled = true;
    private String url = "https://developer.squareup.com/reference/square";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
