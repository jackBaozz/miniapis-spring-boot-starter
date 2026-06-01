package com.bzz.miniapis.sdk.animals;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.animals.randomduck")
public class RandomduckProperties {
    private boolean enabled = true;
    private String url = "https://random-d.uk/api";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
