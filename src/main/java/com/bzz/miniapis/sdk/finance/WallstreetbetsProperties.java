package com.bzz.miniapis.sdk.finance;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.finance.wallstreetbets")
public class WallstreetbetsProperties {
    private boolean enabled = true;
    private String url = "https://dashboard.nbshare.io/apps/reddit/api/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
