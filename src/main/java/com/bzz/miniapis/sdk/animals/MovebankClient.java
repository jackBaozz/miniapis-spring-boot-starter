package com.bzz.miniapis.sdk.animals;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface MovebankClient {
    @GetExchange("/")
    Object execute();
}
