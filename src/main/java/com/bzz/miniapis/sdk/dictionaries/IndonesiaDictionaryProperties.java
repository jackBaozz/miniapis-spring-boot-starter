package com.bzz.miniapis.sdk.dictionaries;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.dictionaries.indonesiadictionary")
public class IndonesiaDictionaryProperties {
    private boolean enabled = true;
    private String url = "https://new-kbbi-api.herokuapp.com/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
