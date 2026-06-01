package com.bzz.miniapis.sdk.government;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.government.brazilcentralbankopendata")
public class BrazilCentralBankOpenDataProperties {
    private boolean enabled = true;
    private String url = "https://dadosabertos.bcb.gov.br/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
