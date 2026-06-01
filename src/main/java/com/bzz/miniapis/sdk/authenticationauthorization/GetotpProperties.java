package com.bzz.miniapis.sdk.authenticationauthorization;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.authenticationauthorization.getotp")
public class GetotpProperties {
    private boolean enabled = true;
    private String url = "https://otp.dev/en/docs/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
