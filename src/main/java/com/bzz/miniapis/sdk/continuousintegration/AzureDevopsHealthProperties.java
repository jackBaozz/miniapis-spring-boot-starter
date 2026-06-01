package com.bzz.miniapis.sdk.continuousintegration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.continuousintegration.azuredevopshealth")
public class AzureDevopsHealthProperties {
    private boolean enabled = true;
    private String url = "https://docs.microsoft.com/en-us/rest/api/resourcehealth";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
