package com.bzz.miniapis.sdk.urlshorteners;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.urlshorteners.clico")
public class ClicoProperties {
    private boolean enabled = true;
    private String url = "https://cli.com/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
