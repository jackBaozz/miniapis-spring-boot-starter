package com.bzz.miniapis.sdk.music;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.music.radiobrowser")
public class RadioBrowserProperties {
    private boolean enabled = true;
    private String url = "https://api.radio-browser.info/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
