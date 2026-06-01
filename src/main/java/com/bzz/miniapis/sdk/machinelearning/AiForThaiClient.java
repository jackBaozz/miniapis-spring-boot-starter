package com.bzz.miniapis.sdk.machinelearning;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface AiForThaiClient {
    @GetExchange("/")
    Object execute();
}
