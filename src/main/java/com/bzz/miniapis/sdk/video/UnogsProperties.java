package com.bzz.miniapis.sdk.video;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.video.unogs")
public class UnogsProperties {
    private boolean enabled = true;
    private String url = "https://rapidapi.com/unogs/api/unogsng";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
