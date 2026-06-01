package com.bzz.miniapis.sdk.personality;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.personality.udemyinstructor")
public class UdemyInstructorProperties {
    private boolean enabled = true;
    private String url = "https://www.udemy.com/developers/instructor/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
