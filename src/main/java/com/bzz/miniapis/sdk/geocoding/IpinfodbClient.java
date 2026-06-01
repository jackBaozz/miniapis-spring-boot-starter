package com.bzz.miniapis.sdk.geocoding;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface IpinfodbClient {
    @GetExchange("/")
    Object execute();
}
