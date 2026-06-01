package com.bzz.miniapis.sdk.cloudstoragefilesharing;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.cloudstoragefilesharing.quip")
public class QuipProperties {
    private boolean enabled = true;
    private String url = "https://quip.com/dev/automation/documentation";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
