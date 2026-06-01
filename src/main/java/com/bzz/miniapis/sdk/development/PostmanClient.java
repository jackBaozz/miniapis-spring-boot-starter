package com.bzz.miniapis.sdk.development;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface PostmanClient {
    @GetExchange("/")
    Object execute();
}
