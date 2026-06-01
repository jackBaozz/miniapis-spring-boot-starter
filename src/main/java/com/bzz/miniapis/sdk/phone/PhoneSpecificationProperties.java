package com.bzz.miniapis.sdk.phone;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.phone.phonespecification")
public class PhoneSpecificationProperties {
    private boolean enabled = true;
    private String url = "https://github.com/azharimm/phone-specs-api";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
