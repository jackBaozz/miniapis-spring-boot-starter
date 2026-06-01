package com.bzz.miniapis.sdk.environment;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.environment.pvwatts")
public class PvwattsProperties {
    private boolean enabled = true;
    private String url = "https://developer.nrel.gov/docs/solar/pvwatts/v6/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
