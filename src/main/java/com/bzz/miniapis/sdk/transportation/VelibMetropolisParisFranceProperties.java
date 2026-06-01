package com.bzz.miniapis.sdk.transportation;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.transportation.velibmetropolisparisfrance")
public class VelibMetropolisParisFranceProperties {
    private boolean enabled = true;
    private String url = "https://www.velib-metropole.fr/donnees-open-data-gbfs-du-service-velib-metropole";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
