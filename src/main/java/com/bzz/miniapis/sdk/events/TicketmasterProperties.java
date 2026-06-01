package com.bzz.miniapis.sdk.events;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.events.ticketmaster")
public class TicketmasterProperties {
    private boolean enabled = true;
    private String url = "http://developer.ticketmaster.com/products-and-docs/apis/getting-started/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
