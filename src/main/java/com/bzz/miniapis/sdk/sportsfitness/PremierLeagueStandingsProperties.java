package com.bzz.miniapis.sdk.sportsfitness;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.sportsfitness.premierleaguestandings")
public class PremierLeagueStandingsProperties {
    private boolean enabled = true;
    private String url = "https://rapidapi.com/heisenbug/api/premier-league-live-scores/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
