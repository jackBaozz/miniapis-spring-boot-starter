package com.bzz.miniapis.sdk.sciencemath;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.sciencemath.usgsearthquakehazardsprogram")
public class UsgsEarthquakeHazardsProgramProperties {
    private boolean enabled = true;
    private String url = "https://earthquake.usgs.gov/fdsnws/event/1/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
