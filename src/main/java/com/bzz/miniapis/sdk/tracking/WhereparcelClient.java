package com.bzz.miniapis.sdk.tracking;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface WhereparcelClient {
    @GetExchange("/")
    Object execute();
}
