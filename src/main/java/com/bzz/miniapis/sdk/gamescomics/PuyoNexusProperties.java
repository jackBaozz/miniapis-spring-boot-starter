package com.bzz.miniapis.sdk.gamescomics;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.gamescomics.puyonexus")
public class PuyoNexusProperties {
    private boolean enabled = true;
    private String url = "https://github.com/deltadex7/puyodb-api-deno";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
