package com.bzz.miniapis.sdk.animals;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.animals.fishwatch")
public class FishwatchProperties {
    private boolean enabled = true;
    private String url = "https://www.fishwatch.gov/developers";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
