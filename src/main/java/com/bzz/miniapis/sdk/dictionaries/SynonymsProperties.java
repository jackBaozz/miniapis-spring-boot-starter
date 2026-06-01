package com.bzz.miniapis.sdk.dictionaries;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.dictionaries.synonyms")
public class SynonymsProperties {
    private boolean enabled = true;
    private String url = "https://www.synonyms.com/synonyms_api.php";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
