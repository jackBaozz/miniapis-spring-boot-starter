package com.bzz.miniapis.sdk.shopping;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.shopping.bestbuy")
public class BestBuyProperties {
    private boolean enabled = true;
    private String url = "https://bestbuyapis.github.io/api-documentation/#overview";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
