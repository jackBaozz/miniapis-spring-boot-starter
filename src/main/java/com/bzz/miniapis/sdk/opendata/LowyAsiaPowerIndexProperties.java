package com.bzz.miniapis.sdk.opendata;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.opendata.lowyasiapowerindex")
public class LowyAsiaPowerIndexProperties {
    private boolean enabled = true;
    private String url = "https://github.com/0x0is1/lowy-index-api-docs";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
