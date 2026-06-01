package com.bzz.miniapis.sdk.blockchain;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.blockchain.watchdata")
public class WatchdataProperties {
    private boolean enabled = true;
    private String url = "https://docs.watchdata.io";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
