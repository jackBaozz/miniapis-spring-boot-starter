package com.bzz.miniapis.sdk.anime;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.anime.aniapi")
public class AniapiProperties {
    private boolean enabled = true;
    private String url = "https://aniapi.com/docs/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
