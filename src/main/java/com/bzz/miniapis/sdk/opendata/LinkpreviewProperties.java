package com.bzz.miniapis.sdk.opendata;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.opendata.linkpreview")
public class LinkpreviewProperties {
    private boolean enabled = true;
    private String url = "https://www.linkpreview.net";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
