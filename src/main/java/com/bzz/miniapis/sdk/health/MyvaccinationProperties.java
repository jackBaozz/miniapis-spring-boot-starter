package com.bzz.miniapis.sdk.health;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.health.myvaccination")
public class MyvaccinationProperties {
    private boolean enabled = true;
    private String url = "https://documenter.getpostman.com/view/16605343/Tzm8GG7u";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
