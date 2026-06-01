package com.bzz.miniapis.sdk.dictionaries;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.dictionaries.merriamwebster")
public class MerriamWebsterProperties {
    private boolean enabled = true;
    private String url = "https://dictionaryapi.com/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
