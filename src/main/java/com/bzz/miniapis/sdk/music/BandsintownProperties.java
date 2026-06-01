package com.bzz.miniapis.sdk.music;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.music.bandsintown")
public class BandsintownProperties {
    private boolean enabled = true;
    private String url = "https://app.swaggerhub.com/apis/Bandsintown/PublicAPI/3.0.0";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
