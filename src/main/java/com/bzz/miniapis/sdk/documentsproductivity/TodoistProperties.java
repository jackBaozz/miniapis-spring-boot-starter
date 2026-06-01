package com.bzz.miniapis.sdk.documentsproductivity;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.documentsproductivity.todoist")
public class TodoistProperties {
    private boolean enabled = true;
    private String url = "https://developer.todoist.com";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
