package com.bzz.miniapis.sdk.tracking;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.tracking.wecantrack")
public class WecantrackProperties {
    private boolean enabled = true;
    private String url = "https://docs.wecantrack.com";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
