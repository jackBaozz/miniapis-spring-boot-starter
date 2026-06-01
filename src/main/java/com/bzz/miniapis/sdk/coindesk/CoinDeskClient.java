package com.bzz.miniapis.sdk.coindesk;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

/**
 * CoinDesk 声明式客户端
 *
 * @author bzz
 */
@HttpExchange
public interface CoinDeskClient {

    /**
     * 获取比特币当前价格
     */
    @GetExchange("/v1/bpi/currentprice.json")
    CoinDeskResponse getCurrentPrice();
}
