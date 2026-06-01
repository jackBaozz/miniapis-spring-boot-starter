package com.bzz.miniapis.sdk.opensourceprojects;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface DrupalOrgClient {
    @GetExchange("/")
    Object execute();
}
