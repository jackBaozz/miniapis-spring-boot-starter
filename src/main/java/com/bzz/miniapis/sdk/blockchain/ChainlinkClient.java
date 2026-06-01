package com.bzz.miniapis.sdk.blockchain;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface ChainlinkClient {
    @GetExchange("/")
    Object execute();
}
