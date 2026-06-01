package com.bzz.miniapis.sdk.jobs;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.jobs.whatjobs")
public class WhatjobsProperties {
    private boolean enabled = true;
    private String url = "https://www.whatjobs.com/affiliates";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
