/*
 * Copyright 2023 bzz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bzz.miniapis;

import com.bzz.miniapis.config.MiniapisAutoConfiguration;
import com.bzz.miniapis.sdk.ipify.IpResponse;
import com.bzz.miniapis.sdk.ipify.IpifyClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {MiniapisAutoConfiguration.class})
@TestPropertySource(locations = "classpath:test.properties")
public class IpifyTest {

    @Autowired
    private IpifyClient ipifyClient;

    @Test
    public void testGetIp() {
        assertNotNull(ipifyClient);
        IpResponse response = ipifyClient.getIp("json");
        assertNotNull(response);
        assertNotNull(response.getIp());
        // Simple regex check for IPv4 or IPv6
        assertTrue(response.getIp().contains(".") || response.getIp().contains(":"));
        System.out.println("ipify IP = " + response.getIp());
    }
}
