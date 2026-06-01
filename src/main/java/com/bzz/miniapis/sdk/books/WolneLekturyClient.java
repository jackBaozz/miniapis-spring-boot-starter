package com.bzz.miniapis.sdk.books;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface WolneLekturyClient {
    @GetExchange("/")
    Object execute();
}
