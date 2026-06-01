package com.bzz.miniapis.sdk.fooddrink;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface WhiskyhunterClient {
    @GetExchange("/")
    Object execute();
}
