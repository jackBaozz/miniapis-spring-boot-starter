package com.bzz.miniapis.sdk.weather;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.weather.pirateweather")
public class PirateWeatherProperties {
    private boolean enabled = true;
    private String url = "https://pirateweather.net/en/latest/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
