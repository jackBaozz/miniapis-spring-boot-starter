package com.bzz.miniapis.sdk.documentsproductivity;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.documentsproductivity.buildpdf")
public class BuildpdfProperties {
    private boolean enabled = true;
    private String url = "https://buildpdf.co/api/docs";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
