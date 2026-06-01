package com.bzz.miniapis.sdk.blockchain;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface SteemClient {
    @GetExchange("/")
    Object execute();
}
