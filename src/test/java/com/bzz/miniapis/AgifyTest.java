package com.bzz.miniapis;

import com.bzz.miniapis.sdk.agify.AgifyClient;
import com.bzz.miniapis.sdk.agify.AgifyResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = com.bzz.miniapis.config.MiniapisAutoConfiguration.class, properties = "miniapis.enabled=true")
public class AgifyTest {

    @Autowired
    private AgifyClient agifyClient;

    @Test
    public void testPredictAge() {
        AgifyResponse response = agifyClient.predictAge("bella");
        System.out.println("Name: " + response.getName());
        System.out.println("Predicted Age: " + response.getAge());
        assert response.getName().equals("bella");
        assert response.getAge() != null;
    }
}
