package com.bzz.miniapis.sdk.vehicle;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface RevcardataClient {
    @GetExchange("/")
    Object execute();
}
