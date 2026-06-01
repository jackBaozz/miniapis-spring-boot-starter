package com.bzz.miniapis.sdk.tracking;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.tracking.postalpincode")
public class PostalpincodeProperties {
    private boolean enabled = true;
    private String url = "http://www.postalpincode.in/Api-Details";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
