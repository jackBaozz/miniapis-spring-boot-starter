package com.bzz.miniapis.sdk.programming;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.programming.mintlify")
public class MintlifyProperties {
    private boolean enabled = true;
    private String url = "https://docs.mintlify.com";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
