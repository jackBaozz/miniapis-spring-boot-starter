package com.bzz.miniapis.sdk.currencyexchange;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.currencyexchange.exchangeratesapiio")
public class ExchangeratesapiIoProperties {
    private boolean enabled = true;
    private String url = "https://exchangeratesapi.io?utm_source=Github&utm_medium=Referral&utm_campaign=Public-apis-repo-Best-sellers";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
