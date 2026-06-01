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

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 * Open-Meteo Current Weather DTO
 *
 * @author bzz
 */
public class CurrentWeather implements Serializable {
    private static final long serialVersionUID = 1L;

    private Double temperature;

    @JsonProperty("windspeed")
    private Double windSpeed;

    @JsonProperty("winddirection")
    private Double windDirection;

    @JsonProperty("weathercode")
    private Integer weatherCode;

    @JsonProperty("is_day")
    private Integer isDay;

    private String time;

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Double getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(Double windDirection) {
        this.windDirection = windDirection;
    }

    public Integer getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(Integer weatherCode) {
        this.weatherCode = weatherCode;
    }

    public Integer getIsDay() {
        return isDay;
    }

    public void setIsDay(Integer isDay) {
        this.isDay = isDay;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "CurrentWeather{" +
                "temperature=" + temperature +
                ", windSpeed=" + windSpeed +
                ", windDirection=" + windDirection +
                ", weatherCode=" + weatherCode +
                ", isDay=" + isDay +
                ", time='" + time + '\'' +
                '}';
    }
}
