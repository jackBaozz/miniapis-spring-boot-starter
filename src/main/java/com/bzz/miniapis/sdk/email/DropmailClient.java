package com.bzz.miniapis.sdk.email;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface DropmailClient {
    @GetExchange("/")
    Object execute();
}
