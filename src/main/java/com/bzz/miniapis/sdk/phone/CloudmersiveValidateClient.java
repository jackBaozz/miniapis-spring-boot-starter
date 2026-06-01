package com.bzz.miniapis.sdk.phone;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface CloudmersiveValidateClient {
    @GetExchange("/")
    Object execute();
}
