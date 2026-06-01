package com.bzz.miniapis.sdk.news;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface GnewsClient {
    @GetExchange("/")
    Object execute();
}
