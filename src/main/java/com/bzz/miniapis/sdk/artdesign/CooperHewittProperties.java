package com.bzz.miniapis.sdk.artdesign;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.artdesign.cooperhewitt")
public class CooperHewittProperties {
    private boolean enabled = true;
    private String url = "https://collection.cooperhewitt.org/api";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
