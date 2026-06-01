package com.bzz.miniapis.sdk.security;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface FullhuntClient {
    @GetExchange("/")
    Object execute();
}
