package com.bzz.miniapis.sdk.machinelearning;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface ExudeApiClient {
    @GetExchange("/")
    Object execute();
}
