package com.bzz.miniapis.sdk.entertainment;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.entertainment.memesio")
public class MemesioProperties {
    private boolean enabled = true;
    private String url = "https://memesio.com/developers/api";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
