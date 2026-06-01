package com.bzz.miniapis.sdk.entertainment;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.entertainment.justmemewtf")
public class JustmemeWtfProperties {
    private boolean enabled = true;
    private String url = "https://justmeme.wtf/api-docs";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
