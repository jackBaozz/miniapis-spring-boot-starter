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

package com.bzz.miniapis.sdk.weather;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

/**
 * Open-Meteo 天气 声明式客户端
 *
 * @author bzz
 */
@HttpExchange
public interface OpenMeteoClient {

    /**
     * 获取指定经纬度的天气预测信息
     *
     * @param latitude       纬度
     * @param longitude      经度
     * @param currentWeather 是否获取当前天气信息
     */
    @GetExchange("/v1/forecast")
    WeatherForecast getForecast(
            @RequestParam("latitude") Double latitude,
            @RequestParam("longitude") Double longitude,
            @RequestParam("current_weather") Boolean currentWeather
    );
}
