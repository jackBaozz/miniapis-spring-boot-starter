package com.bzz.miniapis.sdk.documentsproductivity;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.documentsproductivity.flowdash")
public class FlowdashProperties {
    private boolean enabled = true;
    private String url = "https://docs.flowdash.com/docs/api-introduction";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
