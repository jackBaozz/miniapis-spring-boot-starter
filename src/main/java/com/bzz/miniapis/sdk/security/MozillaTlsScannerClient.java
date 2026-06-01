package com.bzz.miniapis.sdk.security;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface MozillaTlsScannerClient {
    @GetExchange("/")
    Object execute();
}
