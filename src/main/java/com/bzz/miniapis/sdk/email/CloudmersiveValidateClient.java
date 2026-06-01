package com.bzz.miniapis.sdk.email;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface CloudmersiveValidateClient {
    @GetExchange("/")
    Object execute();
}
