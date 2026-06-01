package com.bzz.miniapis.sdk.textanalysis;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.textanalysis.cloudmersivenaturallanguageprocessing")
public class CloudmersiveNaturalLanguageProcessingProperties {
    private boolean enabled = true;
    private String url = "https://www.cloudmersive.com/nlp-api";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
