package com.bzz.miniapis;

import com.bzz.miniapis.sdk.catfact.CatFact;
import com.bzz.miniapis.sdk.catfact.CatFactClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = com.bzz.miniapis.config.MiniapisAutoConfiguration.class, properties = "miniapis.enabled=true")
public class CatFactTest {

    @Autowired
    private CatFactClient catFactClient;

    @Test
    public void testGetRandomFact() {
        CatFact randomFact = catFactClient.getRandomFact();
        System.out.println("CatFact: " + randomFact.getFact());
        assert randomFact.getFact() != null;
    }
}
