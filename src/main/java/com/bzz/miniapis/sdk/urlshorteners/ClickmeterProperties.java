package com.bzz.miniapis.sdk.urlshorteners;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.urlshorteners.clickmeter")
public class ClickmeterProperties {
    private boolean enabled = true;
    private String url = "https://support.clickmeter.com/hc/en-us/categories/201474986";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
