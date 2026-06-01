package com.bzz.miniapis.sdk.fooddrink;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.fooddrink.systembolaget")
public class SystembolagetProperties {
    private boolean enabled = true;
    private String url = "https://api-portal.systembolaget.se";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
