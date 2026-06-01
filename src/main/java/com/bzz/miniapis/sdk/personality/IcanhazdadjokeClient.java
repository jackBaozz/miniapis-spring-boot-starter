package com.bzz.miniapis.sdk.personality;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface IcanhazdadjokeClient {
    @GetExchange("/")
    Object execute();
}
