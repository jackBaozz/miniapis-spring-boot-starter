package com.bzz.miniapis.sdk.health;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.health.covidtrackingproject")
public class CovidTrackingProjectProperties {
    private boolean enabled = true;
    private String url = "https://covidtracking.com/data/api/version-2";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
