package com.bzz.miniapis.sdk.social;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface BlueskyClient {
    @GetExchange("/")
    Object execute();
}
