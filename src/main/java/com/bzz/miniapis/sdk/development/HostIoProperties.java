package com.bzz.miniapis.sdk.development;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.development.hostio")
public class HostIoProperties {
    private boolean enabled = true;
    private String url = "https://host.io";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
