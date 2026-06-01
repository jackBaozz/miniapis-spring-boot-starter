package com.bzz.miniapis.sdk.patent;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.patent.uspto")
public class UsptoProperties {
    private boolean enabled = true;
    private String url = "https://www.uspto.gov/learning-and-resources/open-data-and-mobility";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
