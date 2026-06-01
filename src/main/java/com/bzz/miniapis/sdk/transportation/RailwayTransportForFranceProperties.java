package com.bzz.miniapis.sdk.transportation;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.transportation.railwaytransportforfrance")
public class RailwayTransportForFranceProperties {
    private boolean enabled = true;
    private String url = "https://www.digital.sncf.com/startup/api";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
