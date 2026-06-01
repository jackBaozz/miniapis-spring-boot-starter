package com.bzz.miniapis.sdk.vehicle;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.vehicle.mercedesbenz")
public class MercedesBenzProperties {
    private boolean enabled = true;
    private String url = "https://developer.mercedes-benz.com/apis";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
