package com.bzz.miniapis.sdk.finance;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.finance.alpaca")
public class AlpacaProperties {
    private boolean enabled = true;
    private String url = "https://alpaca.markets/docs/api-documentation/api-v2/market-data/alpaca-data-api-v2/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
