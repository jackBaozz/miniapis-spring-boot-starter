package com.bzz.miniapis.sdk.gamescomics;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.gamescomics.funfacts")
public class FunFactsProperties {
    private boolean enabled = true;
    private String url = "https://asli-fun-fact-api.herokuapp.com/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
