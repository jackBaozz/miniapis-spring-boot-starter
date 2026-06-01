package com.bzz.miniapis.sdk.personality;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.personality.forismatic")
public class ForismaticProperties {
    private boolean enabled = true;
    private String url = "http://forismatic.com/en/api/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
