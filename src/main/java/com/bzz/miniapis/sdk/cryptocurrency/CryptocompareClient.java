package com.bzz.miniapis.sdk.cryptocurrency;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface CryptocompareClient {
    @GetExchange("/")
    Object execute();
}
