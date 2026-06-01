package com.bzz.miniapis.sdk.entertainment;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.entertainment.mememaker")
public class MemeMakerProperties {
    private boolean enabled = true;
    private String url = "https://mememaker.github.io/API/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
