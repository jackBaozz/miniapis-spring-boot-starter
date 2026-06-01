package com.bzz.miniapis.sdk.jobs;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.jobs.arbeitnow")
public class ArbeitnowProperties {
    private boolean enabled = true;
    private String url = "https://documenter.getpostman.com/view/18545278/UVJbJdKh";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
