package com.bzz.miniapis.sdk.environment;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.environment.srpenergy")
public class SrpEnergyProperties {
    private boolean enabled = true;
    private String url = "https://srpenergy-api-client-python.readthedocs.io/en/latest/api.html";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
