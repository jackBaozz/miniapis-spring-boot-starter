package com.bzz.miniapis;

import com.bzz.miniapis.sdk.dogfacts.DogfactsClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = com.bzz.miniapis.config.MiniapisAutoConfiguration.class, properties = "miniapis.enabled=true")
public class DogfactsTest {

    @Autowired
    private DogfactsClient client;

    @Test
    public void test_getFacts() {
        java.util.Map<String, Object> response = client.getFacts();
        System.out.println("Dogfacts Response: " + response);
        assert response != null;
    }
}
