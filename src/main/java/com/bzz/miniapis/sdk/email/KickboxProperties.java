package com.bzz.miniapis.sdk.email;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.email.kickbox")
public class KickboxProperties {
    private boolean enabled = true;
    private String url = "https://open.kickbox.com/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
