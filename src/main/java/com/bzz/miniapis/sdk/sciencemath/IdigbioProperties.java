package com.bzz.miniapis.sdk.sciencemath;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.sciencemath.idigbio")
public class IdigbioProperties {
    private boolean enabled = true;
    private String url = "https://github.com/idigbio/idigbio-search-api/wiki";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
