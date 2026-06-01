package com.bzz.miniapis.sdk.opendata;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.opendata.api18f")
public class Api18FProperties {
    private boolean enabled = true;
    private String url = "http://18f.github.io/API-All-the-X/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
