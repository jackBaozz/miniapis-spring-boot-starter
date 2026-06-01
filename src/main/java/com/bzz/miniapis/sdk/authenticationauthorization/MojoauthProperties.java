package com.bzz.miniapis.sdk.authenticationauthorization;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.authenticationauthorization.mojoauth")
public class MojoauthProperties {
    private boolean enabled = true;
    private String url = "https://mojoauth.com";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
