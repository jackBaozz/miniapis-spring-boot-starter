package com.bzz.miniapis.sdk.news;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.news.theguardian")
public class TheGuardianProperties {
    private boolean enabled = true;
    private String url = "http://open-platform.theguardian.com/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
