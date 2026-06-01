package com.bzz.miniapis.sdk.business;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.business.tombaemailfinder")
public class TombaEmailFinderProperties {
    private boolean enabled = true;
    private String url = "https://tomba.io/api";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
