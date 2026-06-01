package com.bzz.miniapis.sdk.environment;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface IqairClient {
    @GetExchange("/")
    Object execute();
}
