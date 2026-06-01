package com.bzz.miniapis;

import com.bzz.miniapis.sdk.coindesk.CoinDeskClient;
import com.bzz.miniapis.sdk.coindesk.CoinDeskResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = com.bzz.miniapis.config.MiniapisAutoConfiguration.class, properties = "miniapis.enabled=true")
public class CoinDeskTest {

    @Autowired
    private CoinDeskClient coinDeskClient;

    @Test
    public void testGetCurrentPrice() {
        CoinDeskResponse currentPrice = coinDeskClient.getCurrentPrice();
        System.out.println("Bitcoin Price Update: " + currentPrice.getTime().getUpdated());
        System.out.println("USD Rate: " + currentPrice.getBpi().get("USD").getRate());
        assert currentPrice.getBpi().containsKey("USD");
    }
}
