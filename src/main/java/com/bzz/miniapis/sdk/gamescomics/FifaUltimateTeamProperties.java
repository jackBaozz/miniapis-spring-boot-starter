package com.bzz.miniapis.sdk.gamescomics;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.gamescomics.fifaultimateteam")
public class FifaUltimateTeamProperties {
    private boolean enabled = true;
    private String url = "https://www.easports.com/fifa/ultimate-team/api/fut/item";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
