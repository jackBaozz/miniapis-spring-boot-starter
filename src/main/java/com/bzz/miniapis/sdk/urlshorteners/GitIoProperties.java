package com.bzz.miniapis.sdk.urlshorteners;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.urlshorteners.gitio")
public class GitIoProperties {
    private boolean enabled = true;
    private String url = "https://github.blog/2011-11-10-git-io-github-url-shortener/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
