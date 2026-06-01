package com.bzz.miniapis.sdk.sciencemath;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.sciencemath.codecogs")
public class CodecogsProperties {
    private boolean enabled = true;
    private String url = "https://editor.codecogs.com/docs/4-LaTeX_rendering.php";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
