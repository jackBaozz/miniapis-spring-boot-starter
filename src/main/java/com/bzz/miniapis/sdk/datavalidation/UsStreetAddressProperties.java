package com.bzz.miniapis.sdk.datavalidation;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.datavalidation.usstreetaddress")
public class UsStreetAddressProperties {
    private boolean enabled = true;
    private String url = "https://www.smarty.com/docs/cloud/us-street-api";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
