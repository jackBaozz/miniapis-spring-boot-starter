package com.bzz.miniapis.sdk.books;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.books.poetrydb")
public class PoetrydbProperties {
    private boolean enabled = true;
    private String url = "https://github.com/thundercomb/poetrydb#readme";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
