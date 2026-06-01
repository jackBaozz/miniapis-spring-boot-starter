package com.bzz.miniapis.sdk.news;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.news.marketaux")
public class MarketauxProperties {
    private boolean enabled = true;
    private String url = "https://www.marketaux.com/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
