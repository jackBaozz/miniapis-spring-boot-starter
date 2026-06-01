package com.bzz.miniapis.sdk.documentsproductivity;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface ClickupClient {
    @GetExchange("/")
    Object execute();
}
