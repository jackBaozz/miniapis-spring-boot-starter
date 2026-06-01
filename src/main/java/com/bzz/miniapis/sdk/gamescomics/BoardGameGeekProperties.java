package com.bzz.miniapis.sdk.gamescomics;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.gamescomics.boardgamegeek")
public class BoardGameGeekProperties {
    private boolean enabled = true;
    private String url = "https://boardgamegeek.com/wiki/page/BGG_XML_API2";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
