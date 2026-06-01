package com.bzz.miniapis.sdk.transportation;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.transportation.openskynetwork")
public class OpenskyNetworkProperties {
    private boolean enabled = true;
    private String url = "https://opensky-network.org/apidoc/index.html";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
