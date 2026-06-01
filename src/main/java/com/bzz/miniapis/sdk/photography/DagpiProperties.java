package com.bzz.miniapis.sdk.photography;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.photography.dagpi")
public class DagpiProperties {
    private boolean enabled = true;
    private String url = "https://dagpi.xyz";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
