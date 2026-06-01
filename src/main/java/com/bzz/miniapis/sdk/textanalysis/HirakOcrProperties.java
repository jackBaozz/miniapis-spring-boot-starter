package com.bzz.miniapis.sdk.textanalysis;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.textanalysis.hirakocr")
public class HirakOcrProperties {
    private boolean enabled = true;
    private String url = "https://ocr.hirak.site/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
