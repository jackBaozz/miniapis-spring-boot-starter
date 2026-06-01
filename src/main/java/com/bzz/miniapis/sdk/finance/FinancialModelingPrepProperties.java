package com.bzz.miniapis.sdk.finance;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.finance.financialmodelingprep")
public class FinancialModelingPrepProperties {
    private boolean enabled = true;
    private String url = "https://site.financialmodelingprep.com/developer/docs";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
