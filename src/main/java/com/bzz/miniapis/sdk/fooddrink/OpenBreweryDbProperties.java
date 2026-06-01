package com.bzz.miniapis.sdk.fooddrink;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.fooddrink.openbrewerydb")
public class OpenBreweryDbProperties {
    private boolean enabled = true;
    private String url = "https://www.openbrewerydb.org";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
