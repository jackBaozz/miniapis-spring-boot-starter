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
import com.bzz.miniapis.sdk.weather.OpenMeteoClient;
import com.bzz.miniapis.sdk.weather.WeatherForecast;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {MiniapisAutoConfiguration.class})
@TestPropertySource(locations = "classpath:test.properties")
public class WeatherTest {

    @Autowired
    private OpenMeteoClient weatherClient;

    @Test
    public void testGetForecast() {
        assertNotNull(weatherClient);
        // 北京: 39.9, 116.4
        WeatherForecast forecast = weatherClient.getForecast(39.9, 116.4, true);
        assertNotNull(forecast);
        assertEquals(39.9, forecast.getLatitude(), 0.5); // Open-Meteo normalizes coordinates slightly
        assertEquals(116.4, forecast.getLongitude(), 0.5);
        assertNotNull(forecast.getCurrentWeather());
        assertNotNull(forecast.getCurrentWeather().getTemperature());
        assertNotNull(forecast.getCurrentWeather().getTime());
        System.out.println("Open-Meteo WeatherForecast = " + forecast);
    }
}
