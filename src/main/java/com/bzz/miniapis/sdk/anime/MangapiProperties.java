package com.bzz.miniapis.sdk.anime;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.anime.mangapi")
public class MangapiProperties {
    private boolean enabled = true;
    private String url = "https://rapidapi.com/pierre.carcellermeunier/api/mangapi3/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
