package com.bzz.miniapis.sdk.music;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface DiscogsClient {
    @GetExchange("/")
    Object execute();
}
