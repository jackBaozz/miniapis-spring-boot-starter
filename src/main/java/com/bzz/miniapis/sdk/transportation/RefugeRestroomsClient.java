package com.bzz.miniapis.sdk.transportation;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface RefugeRestroomsClient {
    @GetExchange("/")
    Object execute();
}
