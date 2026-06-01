package com.bzz.miniapis.sdk.fooddrink;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.fooddrink.whatsonthemenu")
public class WhatSOnTheMenuProperties {
    private boolean enabled = true;
    private String url = "http://nypl.github.io/menus-api/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
