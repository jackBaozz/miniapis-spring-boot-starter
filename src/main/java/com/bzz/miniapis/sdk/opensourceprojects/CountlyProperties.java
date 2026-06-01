package com.bzz.miniapis.sdk.opensourceprojects;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.opensourceprojects.countly")
public class CountlyProperties {
    private boolean enabled = true;
    private String url = "https://api.count.ly/reference";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
