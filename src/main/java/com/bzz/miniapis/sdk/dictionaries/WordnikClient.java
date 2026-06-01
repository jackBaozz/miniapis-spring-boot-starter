package com.bzz.miniapis.sdk.dictionaries;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface WordnikClient {
    @GetExchange("/")
    Object execute();
}
