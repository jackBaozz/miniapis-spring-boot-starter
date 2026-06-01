package com.bzz.miniapis.sdk.government;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.government.deutscherbundestagdip")
public class DeutscherBundestagDipProperties {
    private boolean enabled = true;
    private String url = "https://dip.bundestag.de/documents/informationsblatt_zur_dip_api_v01.pdf";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
