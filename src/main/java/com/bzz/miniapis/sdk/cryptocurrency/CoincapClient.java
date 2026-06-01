package com.bzz.miniapis.sdk.cryptocurrency;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface CoincapClient {
    @GetExchange("/")
    Object execute();
}
