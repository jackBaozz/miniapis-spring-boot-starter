package com.bzz.miniapis.sdk.books;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.books.ganjoor")
public class GanjoorProperties {
    private boolean enabled = true;
    private String url = "https://api.ganjoor.net";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
