package com.bzz.miniapis.sdk.email;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface MailcheckAiClient {
    @GetExchange("/")
    Object execute();
}
