package com.bzz.miniapis.sdk.development;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.development.json2jsonp")
public class Json2JsonpProperties {
    private boolean enabled = true;
    private String url = "https://json2jsonp.com/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
