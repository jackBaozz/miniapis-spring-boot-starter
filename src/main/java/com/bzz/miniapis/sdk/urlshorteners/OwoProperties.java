package com.bzz.miniapis.sdk.urlshorteners;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.urlshorteners.owo")
public class OwoProperties {
    private boolean enabled = true;
    private String url = "https://owo.vc/api";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
