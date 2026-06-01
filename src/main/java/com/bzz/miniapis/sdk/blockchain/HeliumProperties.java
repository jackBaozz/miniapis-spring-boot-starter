package com.bzz.miniapis.sdk.blockchain;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.blockchain.helium")
public class HeliumProperties {
    private boolean enabled = true;
    private String url = "https://docs.helium.com/api/blockchain/introduction/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
