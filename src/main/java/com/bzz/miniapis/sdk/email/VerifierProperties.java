package com.bzz.miniapis.sdk.email;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.email.verifier")
public class VerifierProperties {
    private boolean enabled = true;
    private String url = "https://verifier.meetchopra.com/docs#/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
