package com.bzz.miniapis.sdk.gamescomics;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface SakuraCardcaptorClient {
    @GetExchange("/")
    Object execute();
}
