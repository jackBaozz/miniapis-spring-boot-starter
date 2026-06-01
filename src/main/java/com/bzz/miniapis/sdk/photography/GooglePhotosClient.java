package com.bzz.miniapis.sdk.photography;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface GooglePhotosClient {
    @GetExchange("/")
    Object execute();
}
