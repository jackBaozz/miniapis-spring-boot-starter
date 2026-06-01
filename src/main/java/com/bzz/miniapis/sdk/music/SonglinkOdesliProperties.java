package com.bzz.miniapis.sdk.music;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.music.songlinkodesli")
public class SonglinkOdesliProperties {
    private boolean enabled = true;
    private String url = "https://www.notion.so/API-d0ebe08a5e304a55928405eb682f6741";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
