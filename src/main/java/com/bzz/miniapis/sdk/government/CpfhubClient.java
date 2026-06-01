package com.bzz.miniapis.sdk.government;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface CpfhubClient {
    @GetExchange("/")
    Object execute();
}
