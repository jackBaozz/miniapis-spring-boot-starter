package com.bzz.miniapis.sdk.calendar;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface NagerDateClient {
    @GetExchange("/")
    Object execute();
}
