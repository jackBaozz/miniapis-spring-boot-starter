package com.bzz.miniapis.sdk.textanalysis;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.textanalysis.eli")
public class EliProperties {
    private boolean enabled = true;
    private String url = "https://nlp.insightera.co.th/docs/v1.0";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
