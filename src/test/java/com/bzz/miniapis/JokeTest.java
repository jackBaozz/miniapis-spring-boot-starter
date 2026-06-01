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
import com.bzz.miniapis.sdk.joke.Joke;
import com.bzz.miniapis.sdk.joke.JokeClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {MiniapisAutoConfiguration.class})
@TestPropertySource(locations = "classpath:test.properties")
public class JokeTest {

    @Autowired
    private JokeClient jokeClient;

    @Test
    public void testGetRandomJoke() {
        assertNotNull(jokeClient);
        Joke joke = jokeClient.getRandomJoke();
        assertNotNull(joke);
        assertNotNull(joke.getId());
        assertNotNull(joke.getType());
        assertNotNull(joke.getSetup());
        assertNotNull(joke.getPunchline());
        System.out.println("Official Joke API = " + joke);
    }
}
