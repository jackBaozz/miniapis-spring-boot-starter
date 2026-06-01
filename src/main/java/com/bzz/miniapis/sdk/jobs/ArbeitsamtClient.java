package com.bzz.miniapis.sdk.jobs;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface ArbeitsamtClient {
    @GetExchange("/")
    Object execute();
}
