package com.bzz.miniapis.sdk.gamescomics;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface GraphqlPokemonClient {
    @GetExchange("/")
    Object execute();
}
