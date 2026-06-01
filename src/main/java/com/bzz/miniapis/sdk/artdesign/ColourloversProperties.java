package com.bzz.miniapis.sdk.artdesign;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.artdesign.colourlovers")
public class ColourloversProperties {
    private boolean enabled = true;
    private String url = "http://www.colourlovers.com/api";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
