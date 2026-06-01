package com.bzz.miniapis.sdk.shopping;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface BestBuyClient {
    @GetExchange("/")
    Object execute();
}
