package com.bzz.miniapis.sdk.vehicle;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.vehicle.kelleybluebook")
public class KelleyBlueBookProperties {
    private boolean enabled = true;
    private String url = "http://developer.kbb.com/#!/data/1-Default";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
