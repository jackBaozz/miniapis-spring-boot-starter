package com.bzz.miniapis.sdk.calendar;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.calendar.nagerdate")
public class NagerDateProperties {
    private boolean enabled = true;
    private String url = "https://date.nager.at";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
