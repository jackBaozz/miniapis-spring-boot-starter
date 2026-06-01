package com.bzz.miniapis.sdk.news;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.news.floridaman")
public class FloridaManProperties {
    private boolean enabled = true;
    private String url = "https://github.com/juliayxhuang/florida-man-api#readme";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
