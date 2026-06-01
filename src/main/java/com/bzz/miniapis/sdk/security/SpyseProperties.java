package com.bzz.miniapis.sdk.security;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.security.spyse")
public class SpyseProperties {
    private boolean enabled = true;
    private String url = "https://spyse-dev.readme.io/reference/quick-start";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
