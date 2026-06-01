package com.bzz.miniapis.sdk.machinelearning;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.machinelearning.aiforthai")
public class AiForThaiProperties {
    private boolean enabled = true;
    private String url = "https://aiforthai.in.th/index.php";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
