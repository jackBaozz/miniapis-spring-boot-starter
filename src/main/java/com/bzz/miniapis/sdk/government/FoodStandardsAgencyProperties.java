package com.bzz.miniapis.sdk.government;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.government.foodstandardsagency")
public class FoodStandardsAgencyProperties {
    private boolean enabled = true;
    private String url = "http://ratings.food.gov.uk/open-data/en-GB";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
