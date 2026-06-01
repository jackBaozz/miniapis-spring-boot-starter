package com.bzz.miniapis.sdk.social;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.social.tamtam")
public class TamtamProperties {
    private boolean enabled = true;
    private String url = "https://dev.tamtam.chat/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
