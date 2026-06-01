package com.bzz.miniapis.sdk.photography;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.photography.readmetypingsvg")
public class ReadmeTypingSvgProperties {
    private boolean enabled = true;
    private String url = "https://github.com/DenverCoder1/readme-typing-svg";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
