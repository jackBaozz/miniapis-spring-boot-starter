package com.bzz.miniapis.sdk.textanalysis;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.textanalysis.googlecloudnatural")
public class GoogleCloudNaturalProperties {
    private boolean enabled = true;
    private String url = "https://cloud.google.com/natural-language/docs/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
