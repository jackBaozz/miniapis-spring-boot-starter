package com.bzz.miniapis.sdk.health;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.health.covidid")
public class CovidIdProperties {
    private boolean enabled = true;
    private String url = "https://data.covid19.go.id/public/api/prov.json";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
