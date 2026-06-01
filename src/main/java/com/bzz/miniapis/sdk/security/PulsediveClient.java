package com.bzz.miniapis.sdk.security;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface PulsediveClient {
    @GetExchange("/")
    Object execute();
}
