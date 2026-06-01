package com.bzz.miniapis.sdk.environment;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.environment.breezometerpollen")
public class BreezometerPollenProperties {
    private boolean enabled = true;
    private String url = "https://docs.breezometer.com/api-documentation/pollen-api/v2/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
