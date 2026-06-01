package com.bzz.miniapis.sdk.opendata;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.opendata.genesis")
public class GenesisProperties {
    private boolean enabled = true;
    private String url = "https://www.destatis.de/EN/Service/OpenData/api-webservice.html";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
