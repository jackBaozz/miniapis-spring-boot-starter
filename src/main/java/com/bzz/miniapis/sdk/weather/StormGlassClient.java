package com.bzz.miniapis.sdk.weather;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface StormGlassClient {
    @GetExchange("/")
    Object execute();
}
