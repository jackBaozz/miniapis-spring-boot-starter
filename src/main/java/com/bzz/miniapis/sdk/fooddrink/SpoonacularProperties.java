package com.bzz.miniapis.sdk.fooddrink;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.fooddrink.spoonacular")
public class SpoonacularProperties {
    private boolean enabled = true;
    private String url = "https://spoonacular.com/food-api";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
