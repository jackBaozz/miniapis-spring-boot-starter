package com.bzz.miniapis.sdk.cloudstoragefilesharing;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface DropboxClient {
    @GetExchange("/")
    Object execute();
}
