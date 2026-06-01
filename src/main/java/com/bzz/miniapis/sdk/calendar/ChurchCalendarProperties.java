package com.bzz.miniapis.sdk.calendar;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.calendar.churchcalendar")
public class ChurchCalendarProperties {
    private boolean enabled = true;
    private String url = "http://calapi.inadiutorium.cz/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
