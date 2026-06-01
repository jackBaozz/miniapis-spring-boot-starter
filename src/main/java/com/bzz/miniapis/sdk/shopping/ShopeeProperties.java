package com.bzz.miniapis.sdk.shopping;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.shopping.shopee")
public class ShopeeProperties {
    private boolean enabled = true;
    private String url = "https://open.shopee.com/documents?version=1";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
