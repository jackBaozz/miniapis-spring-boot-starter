package com.bzz.miniapis.sdk.government;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.government.opengovernmentswitzerland")
public class OpenGovernmentSwitzerlandProperties {
    private boolean enabled = true;
    private String url = "https://handbook.opendata.swiss/de/content/nutzen/api-nutzen.html";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
