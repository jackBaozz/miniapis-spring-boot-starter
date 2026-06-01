package com.bzz.miniapis.sdk.opendata;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.opendata.peakmetrics")
public class PeakmetricsProperties {
    private boolean enabled = true;
    private String url = "https://rapidapi.com/peakmetrics-peakmetrics-default/api/peakmetrics-news";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
