package com.bzz.miniapis.sdk.animals;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.animals.zooanimals")
public class ZooAnimalsProperties {
    private boolean enabled = true;
    private String url = "https://zoo-animal-api.herokuapp.com/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
