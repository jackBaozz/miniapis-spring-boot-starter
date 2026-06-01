package com.bzz.miniapis.sdk.textanalysis;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.textanalysis.lectotranslation")
public class LectoTranslationProperties {
    private boolean enabled = true;
    private String url = "https://rapidapi.com/lecto-lecto-default/api/lecto-translation/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
