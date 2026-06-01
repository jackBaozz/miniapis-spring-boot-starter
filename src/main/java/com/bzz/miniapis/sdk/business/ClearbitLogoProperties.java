package com.bzz.miniapis.sdk.business;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.business.clearbitlogo")
public class ClearbitLogoProperties {
    private boolean enabled = true;
    private String url = "https://clearbit.com/docs#logo-api";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
