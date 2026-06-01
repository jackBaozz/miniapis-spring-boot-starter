package com.bzz.miniapis.sdk.business;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.business.swiftkanban")
public class SwiftkanbanProperties {
    private boolean enabled = true;
    private String url = "https://www.digite.com/knowledge-base/swiftkanban/article/api-for-swift-kanban-web-services/#restapi";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
