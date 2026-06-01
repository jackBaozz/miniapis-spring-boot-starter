package com.bzz.miniapis.sdk.opendata;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface UniversityOfOsloClient {
    @GetExchange("/")
    Object execute();
}
