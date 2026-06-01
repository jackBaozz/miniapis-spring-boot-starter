package com.bzz.miniapis.sdk.personality;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface TheySaidSoQuotesClient {
    @GetExchange("/")
    Object execute();
}
