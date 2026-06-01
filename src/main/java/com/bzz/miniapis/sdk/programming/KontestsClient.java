package com.bzz.miniapis.sdk.programming;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface KontestsClient {
    @GetExchange("/")
    Object execute();
}
