package com.bzz.miniapis.sdk.anime;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.anime.animefacts")
public class AnimefactsProperties {
    private boolean enabled = true;
    private String url = "https://chandan-02.github.io/anime-facts-rest-api/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
