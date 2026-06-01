package com.bzz.miniapis.sdk.transportation;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.transportation.sabrefordevelopers")
public class SabreForDevelopersProperties {
    private boolean enabled = true;
    private String url = "https://developer.sabre.com/guides/travel-agency/quickstart/getting-started-in-travel";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
