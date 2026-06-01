package com.bzz.miniapis.sdk.sportsfitness;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.sportsfitness.nbastats")
public class NbaStatsProperties {
    private boolean enabled = true;
    private String url = "https://any-api.com/nba_com/nba_com/docs/API_Description";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
