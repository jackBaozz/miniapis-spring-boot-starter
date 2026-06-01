package com.bzz.miniapis.sdk.government;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.government.federalregister")
public class FederalRegisterProperties {
    private boolean enabled = true;
    private String url = "https://www.federalregister.gov/reader-aids/developer-resources/rest-api";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
