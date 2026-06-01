package com.bzz.miniapis.sdk.health;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.health.medlineplusgenetics")
public class MedlineplusGeneticsProperties {
    private boolean enabled = true;
    private String url = "https://medlineplus.gov/about/developers/geneticsdatafilesapi/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
