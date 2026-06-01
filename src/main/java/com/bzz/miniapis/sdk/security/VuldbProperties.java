package com.bzz.miniapis.sdk.security;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.security.vuldb")
public class VuldbProperties {
    private boolean enabled = true;
    private String url = "https://vuldb.com/?doc.api";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
