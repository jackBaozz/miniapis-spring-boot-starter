package com.bzz.miniapis.sdk.sportsfitness;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface PremierLeagueStandingsClient {
    @GetExchange("/")
    Object execute();
}
