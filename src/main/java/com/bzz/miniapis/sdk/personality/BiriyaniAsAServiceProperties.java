package com.bzz.miniapis.sdk.personality;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.personality.biriyaniasaservice")
public class BiriyaniAsAServiceProperties {
    private boolean enabled = true;
    private String url = "https://biriyani.anoram.com/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
