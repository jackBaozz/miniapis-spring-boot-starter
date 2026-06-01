package com.bzz.miniapis.sdk.cryptocurrency;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.cryptocurrency.huobi")
public class HuobiProperties {
    private boolean enabled = true;
    private String url = "https://huobiapi.github.io/docs/spot/v1/en/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
