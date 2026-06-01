package com.bzz.miniapis.sdk.calendar;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.calendar.festivopublicholidays")
public class FestivoPublicHolidaysProperties {
    private boolean enabled = true;
    private String url = "https://docs.getfestivo.com/docs/products/public-holidays-api/intro";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
