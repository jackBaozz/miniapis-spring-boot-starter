package com.bzz.miniapis.sdk.social;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface TwitchClient {
    @GetExchange("/")
    Object execute();
}
