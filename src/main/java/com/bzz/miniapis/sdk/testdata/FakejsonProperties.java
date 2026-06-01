package com.bzz.miniapis.sdk.testdata;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.testdata.fakejson")
public class FakejsonProperties {
    private boolean enabled = true;
    private String url = "https://fakejson.com";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
