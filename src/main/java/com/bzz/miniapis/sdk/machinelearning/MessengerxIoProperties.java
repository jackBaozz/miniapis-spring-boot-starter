package com.bzz.miniapis.sdk.machinelearning;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.machinelearning.messengerxio")
public class MessengerxIoProperties {
    private boolean enabled = true;
    private String url = "https://messengerx.rtfd.io";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
