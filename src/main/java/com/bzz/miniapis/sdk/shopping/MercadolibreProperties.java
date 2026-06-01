package com.bzz.miniapis.sdk.shopping;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.shopping.mercadolibre")
public class MercadolibreProperties {
    private boolean enabled = true;
    private String url = "https://developers.mercadolibre.cl/es_ar/api-docs-es";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
