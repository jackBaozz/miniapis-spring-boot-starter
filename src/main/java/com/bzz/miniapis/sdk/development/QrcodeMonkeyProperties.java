package com.bzz.miniapis.sdk.development;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.development.qrcodemonkey")
public class QrcodeMonkeyProperties {
    private boolean enabled = true;
    private String url = "https://www.qrcode-monkey.com/qr-code-api-with-logo/";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
