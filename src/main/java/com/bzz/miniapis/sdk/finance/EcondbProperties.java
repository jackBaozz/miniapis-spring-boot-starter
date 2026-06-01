package com.bzz.miniapis.sdk.finance;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.finance.econdb")
public class EcondbProperties {
    private boolean enabled = true;
    private String url = "https://www.econdb.com/api/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
