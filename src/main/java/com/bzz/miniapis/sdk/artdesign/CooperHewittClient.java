package com.bzz.miniapis.sdk.artdesign;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface CooperHewittClient {
    @GetExchange("/")
    Object execute();
}
