package com.bzz.miniapis.sdk.sciencemath;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.sciencemath.usgswaterservices")
public class UsgsWaterServicesProperties {
    private boolean enabled = true;
    private String url = "https://waterservices.usgs.gov/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
