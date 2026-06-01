package com.bzz.miniapis.sdk.catfact;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

/**
 * CatFact 声明式客户端
 *
 * @author bzz
 */
@HttpExchange
public interface CatFactClient {

    /**
     * 随机获取一个关于猫的事实
     */
    @GetExchange("/fact")
    CatFact getRandomFact();
}
