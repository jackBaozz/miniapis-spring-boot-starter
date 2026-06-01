package com.bzz.miniapis.sdk.datavalidation;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.datavalidation.usextract")
public class UsExtractProperties {
    private boolean enabled = true;
    private String url = "https://www.smarty.com/products/apis/us-extract-api";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
