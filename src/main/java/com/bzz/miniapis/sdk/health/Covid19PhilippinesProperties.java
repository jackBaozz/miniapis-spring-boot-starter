package com.bzz.miniapis.sdk.health;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.health.covid19philippines")
public class Covid19PhilippinesProperties {
    private boolean enabled = true;
    private String url = "https://github.com/Simperfy/Covid-19-API-Philippines-DOH";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
