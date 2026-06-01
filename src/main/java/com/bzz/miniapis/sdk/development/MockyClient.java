package com.bzz.miniapis.sdk.development;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface MockyClient {
    @GetExchange("/")
    Object execute();
}
