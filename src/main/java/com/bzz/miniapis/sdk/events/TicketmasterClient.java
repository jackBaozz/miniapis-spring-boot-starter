package com.bzz.miniapis.sdk.events;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface TicketmasterClient {
    @GetExchange("/")
    Object execute();
}
