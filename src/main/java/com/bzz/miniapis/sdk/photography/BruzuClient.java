package com.bzz.miniapis.sdk.photography;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface BruzuClient {
    @GetExchange("/")
    Object execute();
}
