package com.bzz.miniapis.sdk.patent;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.patent.tipo")
public class TipoProperties {
    private boolean enabled = true;
    private String url = "https://tiponet.tipo.gov.tw/Gazette/OpenData/OD/OD05.aspx?QryDS=API00";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
