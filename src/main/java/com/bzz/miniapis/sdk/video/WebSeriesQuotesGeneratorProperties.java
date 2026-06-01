package com.bzz.miniapis.sdk.video;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.video.webseriesquotesgenerator")
public class WebSeriesQuotesGeneratorProperties {
    private boolean enabled = true;
    private String url = "https://github.com/yogeshwaran01/web-series-quotes";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
