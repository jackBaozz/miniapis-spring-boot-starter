package com.bzz.miniapis.sdk.environment;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.environment.ukcarbonintensity")
public class UkCarbonIntensityProperties {
    private boolean enabled = true;
    private String url = "https://carbon-intensity.github.io/api-definitions/#carbon-intensity-api-v1-0-0";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
