package com.bzz.miniapis.sdk.health;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.health.covid19trackercanada")
public class Covid19TrackerCanadaProperties {
    private boolean enabled = true;
    private String url = "https://api.covid19tracker.ca/docs/1.0/overview";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
