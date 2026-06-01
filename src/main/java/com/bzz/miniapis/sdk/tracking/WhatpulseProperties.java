package com.bzz.miniapis.sdk.tracking;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.tracking.whatpulse")
public class WhatpulseProperties {
    private boolean enabled = true;
    private String url = "https://developer.whatpulse.org/#web-api";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
