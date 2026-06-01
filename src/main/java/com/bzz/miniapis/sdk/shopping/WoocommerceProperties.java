package com.bzz.miniapis.sdk.shopping;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.shopping.woocommerce")
public class WoocommerceProperties {
    private boolean enabled = true;
    private String url = "https://woocommerce.github.io/woocommerce-rest-api-docs/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
