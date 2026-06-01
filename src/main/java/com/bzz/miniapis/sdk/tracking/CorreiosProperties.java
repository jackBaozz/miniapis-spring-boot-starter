package com.bzz.miniapis.sdk.tracking;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.tracking.correios")
public class CorreiosProperties {
    private boolean enabled = true;
    private String url = "https://cws.correios.com.br/ajuda";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
