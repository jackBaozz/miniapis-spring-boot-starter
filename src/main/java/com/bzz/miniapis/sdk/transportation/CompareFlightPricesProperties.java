package com.bzz.miniapis.sdk.transportation;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.transportation.compareflightprices")
public class CompareFlightPricesProperties {
    private boolean enabled = true;
    private String url = "https://rapidapi.com/obryan-software-obryan-software-default/api/compare-flight-prices/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
