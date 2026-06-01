package com.bzz.miniapis.sdk.cryptocurrency;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.cryptocurrency.bitfinex")
public class BitfinexProperties {
    private boolean enabled = true;
    private String url = "https://docs.bitfinex.com/docs";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
