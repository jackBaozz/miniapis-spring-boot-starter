package com.bzz.miniapis.sdk.vehicle;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.vehicle.nhtsa")
public class NhtsaProperties {
    private boolean enabled = true;
    private String url = "https://vpic.nhtsa.dot.gov/api/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
