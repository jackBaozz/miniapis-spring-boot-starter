package com.bzz.miniapis.sdk.books;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.books.abbliadigital")
public class ABBliaDigitalProperties {
    private boolean enabled = true;
    private String url = "https://www.abibliadigital.com.br/en";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
