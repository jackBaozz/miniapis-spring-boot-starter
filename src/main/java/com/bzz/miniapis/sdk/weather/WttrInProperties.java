package com.bzz.miniapis.sdk.weather;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.weather.wttrin")
public class WttrInProperties {
    private boolean enabled = true;
    private String url = "https://wttr.in/:help";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
