package com.bzz.miniapis.sdk.testdata;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface WhatTheCommitClient {
    @GetExchange("/")
    Object execute();
}
