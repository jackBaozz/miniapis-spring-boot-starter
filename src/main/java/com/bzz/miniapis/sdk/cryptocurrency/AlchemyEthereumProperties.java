package com.bzz.miniapis.sdk.cryptocurrency;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.cryptocurrency.alchemyethereum")
public class AlchemyEthereumProperties {
    private boolean enabled = true;
    private String url = "https://docs.alchemy.com/alchemy/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
