package com.bzz.miniapis.sdk.cloudstoragefilesharing;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface GyazoClient {
    @GetExchange("/")
    Object execute();
}
