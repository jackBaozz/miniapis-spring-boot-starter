package com.bzz.miniapis.sdk.personality;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.personality.vadiveluhttpcodes")
public class VadiveluHttpCodesProperties {
    private boolean enabled = true;
    private String url = "https://vadivelu.anoram.com/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
