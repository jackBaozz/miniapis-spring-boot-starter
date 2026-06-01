package com.bzz.miniapis.sdk.music;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.music.deezer")
public class DeezerProperties {
    private boolean enabled = true;
    private String url = "https://developers.deezer.com/api";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
