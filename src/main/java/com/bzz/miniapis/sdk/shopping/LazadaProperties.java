package com.bzz.miniapis.sdk.shopping;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.shopping.lazada")
public class LazadaProperties {
    private boolean enabled = true;
    private String url = "https://open.lazada.com/doc/doc.htm";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
