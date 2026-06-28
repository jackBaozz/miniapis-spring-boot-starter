package com.bzz.miniapis.sdk.cloudstoragefilesharing;

public class FileIoClient {
        public static String execute(String targetUrl) {
        try {
            java.net.http.HttpClient.Builder builder = java.net.http.HttpClient.newBuilder()
                    .connectTimeout(java.time.Duration.ofSeconds(5));
                    
            java.net.Proxy proxy = com.bzz.miniapis.config.ProxyConfigHolder.getProxy();
            if (proxy != null && proxy.type() != java.net.Proxy.Type.DIRECT) {
                // Java 11 HttpClient uses ProxySelector
                java.net.InetSocketAddress addr = (java.net.InetSocketAddress) proxy.address();
                builder.proxy(java.net.ProxySelector.of(addr));
            }
            
            java.net.http.HttpClient client = builder.build();
            
            java.net.http.HttpRequest request = java.net.http.HttpRequest.newBuilder()
                    .uri(java.net.URI.create(targetUrl))
                    .GET()
                    .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36")
                    .build();
                    
            java.net.http.HttpResponse<String> response = client.send(request, java.net.http.HttpResponse.BodyHandlers.ofString());
            
            if (response.statusCode() > 299) {
                return null;
            }
            return response.body();
        } catch (Exception e) {
            return null;
        }
        }
}
