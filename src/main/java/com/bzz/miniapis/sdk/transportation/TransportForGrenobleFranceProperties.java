package com.bzz.miniapis.sdk.transportation;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.transportation.transportforgrenoblefrance")
public class TransportForGrenobleFranceProperties {
    private boolean enabled = true;
    private String url = "https://www.mobilites-m.fr/pages/opendata/OpenDataApi.html";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
