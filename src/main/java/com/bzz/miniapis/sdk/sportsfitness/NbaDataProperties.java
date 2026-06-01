package com.bzz.miniapis.sdk.sportsfitness;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.sportsfitness.nbadata")
public class NbaDataProperties {
    private boolean enabled = true;
    private String url = "https://rapidapi.com/api-sports/api/api-nba/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
