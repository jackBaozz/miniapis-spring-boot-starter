package com.bzz.miniapis.sdk.datavalidation;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.datavalidation.purgomalum")
public class PurgomalumProperties {
    private boolean enabled = true;
    private String url = "http://www.purgomalum.com";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
