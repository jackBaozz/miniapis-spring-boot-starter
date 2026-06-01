package com.bzz.miniapis.sdk.transportation;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.transportation.transportfordenverus")
public class TransportForDenverUsProperties {
    private boolean enabled = true;
    private String url = "http://www.rtd-denver.com/gtfs-developer-guide.shtml";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
