package com.bzz.miniapis.sdk.geocoding;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.geocoding.postcodedatanl")
public class PostcodedataNlProperties {
    private boolean enabled = true;
    private String url = "http://api.postcodedata.nl/v1/postcode/?postcode=1211EP&streetnumber=60&ref=domeinnaam.nl&type=json";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
