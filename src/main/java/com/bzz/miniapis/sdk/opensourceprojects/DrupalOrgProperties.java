package com.bzz.miniapis.sdk.opensourceprojects;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.opensourceprojects.drupalorg")
public class DrupalOrgProperties {
    private boolean enabled = true;
    private String url = "https://www.drupal.org/drupalorg/docs/api";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
