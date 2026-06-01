package com.bzz.miniapis.sdk.opendata;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.opendata.recreationinformationdatabase")
public class RecreationInformationDatabaseProperties {
    private boolean enabled = true;
    private String url = "https://ridb.recreation.gov/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
