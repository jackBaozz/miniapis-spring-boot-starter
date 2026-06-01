package com.bzz.miniapis.sdk.entertainment;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface TastediveClient {
    @GetExchange("/")
    Object execute();
}
