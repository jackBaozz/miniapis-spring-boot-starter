package com.bzz.miniapis.sdk.government;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.government.districtofcolumbiaopendata")
public class DistrictOfColumbiaOpenDataProperties {
    private boolean enabled = true;
    private String url = "http://opendata.dc.gov/pages/using-apis";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
