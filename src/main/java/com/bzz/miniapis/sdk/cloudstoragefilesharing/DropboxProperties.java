package com.bzz.miniapis.sdk.cloudstoragefilesharing;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.cloudstoragefilesharing.dropbox")
public class DropboxProperties {
    private boolean enabled = true;
    private String url = "https://www.dropbox.com/developers";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
