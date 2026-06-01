package com.bzz.miniapis.sdk.machinelearning;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.machinelearning.perspective")
public class PerspectiveProperties {
    private boolean enabled = true;
    private String url = "https://perspectiveapi.com";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
