package com.bzz.miniapis.sdk.music;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.music.musicbrainz")
public class MusicbrainzProperties {
    private boolean enabled = true;
    private String url = "https://musicbrainz.org/doc/Development/XML_Web_Service/Version_2";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
