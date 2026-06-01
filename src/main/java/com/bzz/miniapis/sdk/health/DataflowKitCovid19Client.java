package com.bzz.miniapis.sdk.health;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface DataflowKitCovid19Client {
    @GetExchange("/")
    Object execute();
}
