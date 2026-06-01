package com.bzz.miniapis.sdk.photography;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.photography.bruzu")
public class BruzuProperties {
    private boolean enabled = true;
    private String url = "https://docs.bruzu.com";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
