package com.bzz.miniapis.sdk.geocoding;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.geocoding.openrouteserviceorg")
public class OpenrouteserviceOrgProperties {
    private boolean enabled = true;
    private String url = "https://openrouteservice.org/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
