package com.bzz.miniapis.sdk.social;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.social.dangerousdiscorddatabase")
public class DangerousDiscordDatabaseProperties {
    private boolean enabled = true;
    private String url = "https://discord.riverside.rocks/docs/index.php";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
