package com.bzz.miniapis.sdk.currencyexchange;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface Api1ForgeClient {
    @GetExchange("/")
    Object execute();
}
