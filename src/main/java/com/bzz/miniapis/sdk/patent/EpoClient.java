package com.bzz.miniapis.sdk.patent;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface EpoClient {
    @GetExchange("/")
    Object execute();
}
