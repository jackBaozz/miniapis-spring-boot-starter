package com.bzz.miniapis.sdk.dogfacts;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.HttpExchange;

/**
 * Dogfacts 声明式客户端
 * Auto-generated
 */
@HttpExchange
public interface DogfactsClient {

    /**
     * Auto-generated endpoint
     */
    @GetExchange("/api/facts")
    java.util.Map<String, Object> getFacts();
}
