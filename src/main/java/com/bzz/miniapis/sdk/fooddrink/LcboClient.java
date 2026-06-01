package com.bzz.miniapis.sdk.fooddrink;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface LcboClient {
    @GetExchange("/")
    Object execute();
}
