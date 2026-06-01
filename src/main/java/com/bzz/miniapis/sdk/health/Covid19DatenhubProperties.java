package com.bzz.miniapis.sdk.health;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.health.covid19datenhub")
public class Covid19DatenhubProperties {
    private boolean enabled = true;
    private String url = "https://npgeo-corona-npgeo-de.hub.arcgis.com";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
