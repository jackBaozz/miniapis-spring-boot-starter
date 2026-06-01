package com.bzz.miniapis.sdk.health;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface CoronavirusClient {
    @GetExchange("/")
    Object execute();
}
