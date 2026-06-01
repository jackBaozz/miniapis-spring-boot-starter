package com.bzz.miniapis.sdk.continuousintegration;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface TravisCiClient {
    @GetExchange("/")
    Object execute();
}
