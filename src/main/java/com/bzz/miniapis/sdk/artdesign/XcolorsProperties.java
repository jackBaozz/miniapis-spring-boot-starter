package com.bzz.miniapis.sdk.artdesign;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.artdesign.xcolors")
public class XcolorsProperties {
    private boolean enabled = true;
    private String url = "https://x-colors.herokuapp.com/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
