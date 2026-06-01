package com.bzz.miniapis.sdk.health;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.health.coronavirus")
public class CoronavirusProperties {
    private boolean enabled = true;
    private String url = "https://pipedream.com/@pravin/http-api-for-latest-wuhan-coronavirus-data-2019-ncov-p_G6CLVM/readme";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
