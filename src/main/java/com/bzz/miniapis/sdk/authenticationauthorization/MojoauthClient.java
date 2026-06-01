package com.bzz.miniapis.sdk.authenticationauthorization;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface MojoauthClient {
    @GetExchange("/")
    Object execute();
}
