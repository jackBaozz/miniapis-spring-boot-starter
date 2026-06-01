package com.bzz.miniapis.sdk.textanalysis;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface GeoscoreClient {
    @GetExchange("/")
    Object execute();
}
