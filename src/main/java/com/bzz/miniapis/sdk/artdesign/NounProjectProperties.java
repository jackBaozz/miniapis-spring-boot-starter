package com.bzz.miniapis.sdk.artdesign;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.artdesign.nounproject")
public class NounProjectProperties {
    private boolean enabled = true;
    private String url = "http://api.thenounproject.com/index.html";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
