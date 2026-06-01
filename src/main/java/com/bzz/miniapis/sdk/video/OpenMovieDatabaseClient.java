package com.bzz.miniapis.sdk.video;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface OpenMovieDatabaseClient {
    @GetExchange("/")
    Object execute();
}
