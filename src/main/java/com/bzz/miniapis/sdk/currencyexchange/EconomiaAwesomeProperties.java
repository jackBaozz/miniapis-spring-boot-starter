package com.bzz.miniapis.sdk.currencyexchange;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.currencyexchange.economiaawesome")
public class EconomiaAwesomeProperties {
    private boolean enabled = true;
    private String url = "https://docs.awesomeapi.com.br/api-de-moedas";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
