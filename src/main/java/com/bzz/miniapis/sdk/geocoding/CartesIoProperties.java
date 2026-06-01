package com.bzz.miniapis.sdk.geocoding;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.geocoding.cartesio")
public class CartesIoProperties {
    private boolean enabled = true;
    private String url = "https://github.com/M-Media-Group/Cartes.io/wiki/API";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
