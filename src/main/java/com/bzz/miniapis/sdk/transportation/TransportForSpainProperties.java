package com.bzz.miniapis.sdk.transportation;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.transportation.transportforspain")
public class TransportForSpainProperties {
    private boolean enabled = true;
    private String url = "https://data.renfe.com/api/1/util/snippet/api_info.html?resource_id=a2368cff-1562-4dde-8466-9635ea3a572a";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
