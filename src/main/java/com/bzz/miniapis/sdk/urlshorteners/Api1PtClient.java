package com.bzz.miniapis.sdk.urlshorteners;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface Api1PtClient {
    @GetExchange("/")
    Object execute();
}
