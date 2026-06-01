package com.bzz.miniapis.sdk.security;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.security.intelligencex")
public class IntelligenceXProperties {
    private boolean enabled = true;
    private String url = "https://github.com/IntelligenceX/SDK/blob/master/Intelligence%20X%20API.pdf";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
