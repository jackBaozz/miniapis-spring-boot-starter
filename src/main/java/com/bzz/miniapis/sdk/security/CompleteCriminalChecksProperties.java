package com.bzz.miniapis.sdk.security;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.security.completecriminalchecks")
public class CompleteCriminalChecksProperties {
    private boolean enabled = true;
    private String url = "https://completecriminalchecks.com/Developers";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
