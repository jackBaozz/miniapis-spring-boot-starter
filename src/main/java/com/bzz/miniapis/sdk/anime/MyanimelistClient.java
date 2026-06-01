package com.bzz.miniapis.sdk.anime;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface MyanimelistClient {
    @GetExchange("/")
    Object execute();
}
