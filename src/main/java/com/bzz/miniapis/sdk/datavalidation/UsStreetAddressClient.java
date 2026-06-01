package com.bzz.miniapis.sdk.datavalidation;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface UsStreetAddressClient {
    @GetExchange("/")
    Object execute();
}
