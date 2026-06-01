package com.bzz.miniapis.sdk.programming;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.programming.codeforces")
public class CodeforcesProperties {
    private boolean enabled = true;
    private String url = "https://codeforces.com/apiHelp";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
