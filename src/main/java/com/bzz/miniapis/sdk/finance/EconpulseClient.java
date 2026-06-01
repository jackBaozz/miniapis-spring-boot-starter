package com.bzz.miniapis.sdk.finance;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface EconpulseClient {
    @GetExchange("/")
    Object execute();
}
