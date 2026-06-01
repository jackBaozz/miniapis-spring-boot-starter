package com.bzz.miniapis.sdk.phone;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.phone.numlookup")
public class NumlookupProperties {
    private boolean enabled = true;
    private String url = "https://numlookupapi.com";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
