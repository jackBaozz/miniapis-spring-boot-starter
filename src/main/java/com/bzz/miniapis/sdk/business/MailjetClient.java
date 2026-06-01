package com.bzz.miniapis.sdk.business;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface MailjetClient {
    @GetExchange("/")
    Object execute();
}
