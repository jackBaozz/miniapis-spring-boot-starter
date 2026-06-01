package com.bzz.miniapis.sdk.vehicle;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.vehicle.smartcar")
public class SmartcarProperties {
    private boolean enabled = true;
    private String url = "https://smartcar.com/docs/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
