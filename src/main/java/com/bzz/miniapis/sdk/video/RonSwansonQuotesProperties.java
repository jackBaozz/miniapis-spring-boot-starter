package com.bzz.miniapis.sdk.video;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.video.ronswansonquotes")
public class RonSwansonQuotesProperties {
    private boolean enabled = true;
    private String url = "https://github.com/jamesseanwright/ron-swanson-quotes#ron-swanson-quotes-api";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
