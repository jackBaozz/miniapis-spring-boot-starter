package com.bzz.miniapis.sdk.testdata;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.testdata.spanishrandomnames")
public class SpanishRandomNamesProperties {
    private boolean enabled = true;
    private String url = "https://random-names-api.herokuapp.com/public";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
