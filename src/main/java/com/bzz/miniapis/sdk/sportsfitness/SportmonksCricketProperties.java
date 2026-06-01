package com.bzz.miniapis.sdk.sportsfitness;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.sportsfitness.sportmonkscricket")
public class SportmonksCricketProperties {
    private boolean enabled = true;
    private String url = "https://docs.sportmonks.com/cricket/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
