package com.bzz.miniapis.sdk.development;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.development.databricks")
public class DatabricksProperties {
    private boolean enabled = true;
    private String url = "https://docs.databricks.com/dev-tools/api/latest/index.html";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
