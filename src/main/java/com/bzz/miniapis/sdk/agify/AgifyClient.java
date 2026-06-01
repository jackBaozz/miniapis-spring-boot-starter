package com.bzz.miniapis.sdk.agify;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

/**
 * Agify 声明式客户端
 *
 * @author bzz
 */
@HttpExchange
public interface AgifyClient {

    /**
     * 预测年龄
     *
     * @param name 要预测的名字
     */
    @GetExchange("/")
    AgifyResponse predictAge(@RequestParam("name") String name);
}
