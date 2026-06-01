package com.bzz.miniapis.sdk.calendar;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.calendar.googlecalendar")
public class GoogleCalendarProperties {
    private boolean enabled = true;
    private String url = "https://developers.google.com/google-apps/calendar/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
