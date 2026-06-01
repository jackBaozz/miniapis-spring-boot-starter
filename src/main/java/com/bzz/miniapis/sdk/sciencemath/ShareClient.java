package com.bzz.miniapis.sdk.sciencemath;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface ShareClient {
    @GetExchange("/")
    Object execute();
}
