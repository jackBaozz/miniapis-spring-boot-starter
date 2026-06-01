package com.bzz.miniapis.sdk.animals;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.animals.iucn")
public class IucnProperties {
    private boolean enabled = true;
    private String url = "http://apiv3.iucnredlist.org/api/v3/docs";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
