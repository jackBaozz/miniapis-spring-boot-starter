package com.bzz.miniapis.sdk.transportation;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface Az511Client {
    @GetExchange("/")
    Object execute();
}
