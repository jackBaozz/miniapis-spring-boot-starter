package com.bzz.miniapis.sdk.transportation;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.transportation.transportforberlingermany")
public class TransportForBerlinGermanyProperties {
    private boolean enabled = true;
    private String url = "https://github.com/derhuerst/vbb-rest/blob/3/docs/index.md";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
