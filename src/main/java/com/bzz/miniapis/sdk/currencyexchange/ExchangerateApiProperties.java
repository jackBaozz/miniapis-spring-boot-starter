package com.bzz.miniapis.sdk.currencyexchange;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.currencyexchange.exchangerateapi")
public class ExchangerateApiProperties {
    private boolean enabled = true;
    private String url = "https://www.exchangerate-api.com";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
