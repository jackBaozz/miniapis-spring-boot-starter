package com.bzz.miniapis.sdk.environment;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.environment.iqair")
public class IqairProperties {
    private boolean enabled = true;
    private String url = "https://www.iqair.com/air-pollution-data-api";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
