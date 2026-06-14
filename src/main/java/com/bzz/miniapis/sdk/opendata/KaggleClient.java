package com.bzz.miniapis.sdk.opendata;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import com.bzz.miniapis.config.ProxyConfigHolder;

public class KaggleClient {
    private final String baseUrl;

    public KaggleClient(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String execute() {
        HttpURLConnection con = null;
        try {
            URL url = new URL(this.baseUrl);
            Proxy proxy = ProxyConfigHolder.getProxy();
            if (proxy != null) {
                con = (HttpURLConnection) url.openConnection(proxy);
            } else {
                con = (HttpURLConnection) url.openConnection();
            }
            con.setRequestMethod("GET");
            con.setConnectTimeout(5000);
            con.setReadTimeout(5000);
            
            // Allow User-Agent header as some APIs block default Java User-Agent
            con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko)");

            int status = con.getResponseCode();
            if (status > 299) {
                return null;
            }

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            return content.toString();
        } catch (Exception e) {
            return null;
        } finally {
            if (con != null) {
                con.disconnect();
            }
        }
    }
}
