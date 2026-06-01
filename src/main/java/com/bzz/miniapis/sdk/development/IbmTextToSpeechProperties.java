package com.bzz.miniapis.sdk.development;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "miniapis.development.ibmtexttospeech")
public class IbmTextToSpeechProperties {
    private boolean enabled = true;
    private String url = "https://cloud.ibm.com/docs/text-to-speech/getting-started.html";
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
