package com.bzz.miniapis.sdk.fooddrink;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.fooddrink.zestful")
public class ZestfulProperties {
    private boolean enabled = true;
    private String url = "https://zestfuldata.com/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
