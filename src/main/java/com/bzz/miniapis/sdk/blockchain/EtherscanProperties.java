package com.bzz.miniapis.sdk.blockchain;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.blockchain.etherscan")
public class EtherscanProperties {
    private boolean enabled = true;
    private String url = "https://etherscan.io/apis";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
