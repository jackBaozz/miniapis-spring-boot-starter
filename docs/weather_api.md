# Open-Meteo 天气预报集成服务

## 1. 接口概述
`Open-Meteo` 提供极其简单好用的免费全球天气预报接口。无需注册或申请任何 API Key，可以直接根据地理经纬度坐标获取实时气象数据、风速、风向、昼夜判定等天气数据。

* **分类**: 地理与气象
* **官方网站**: https://open-meteo.com
* **默认 Base URL**: `https://api.open-meteo.com`
* **鉴权方式**: 完全免费，免 Key 访问

---

## 2. 接口明细规格

### 2.1 获取地理经纬度天气预测数据 (Get Forecast)
* **请求路径**: `GET /v1/forecast`
* **Query 查询参数**:
  * `latitude` (Double, 必须): 待查询位置的纬度，取值范围为 `[-90, 90]`。例如北京为 `39.9042`。
  * `longitude` (Double, 必须): 待查询位置的经度，取值范围为 `[-180, 180]`。例如北京为 `116.4074`。
  * `current_weather` (Boolean, 必须): 是否需要返回当前实时的天气信息。建议传 `true`。
* **响应格式**: JSON Object (对应 DTO: `WeatherForecast`)
* **响应数据结构**:
```json
{
  "latitude": 39.9,
  "longitude": 116.4,
  "generationtime_ms": 0.0543,
  "utc_offset_seconds": 0,
  "timezone": "GMT",
  "timezone_abbreviation": "GMT",
  "elevation": 43.0,
  "current_weather": {
    "temperature": 25.4,
    "windspeed": 12.5,
    "winddirection": 180.0,
    "weathercode": 0,
    "time": "2026-06-01T13:00",
    "is_day": 1
  }
}
```

---

## 3. 本 SDK 数据模型 (DTO)

### `WeatherForecast.java`
* `latitude`: 返回的纬度
* `longitude`: 返回的经度
* `generationTimeMs`: 接口响应耗时 (毫秒)
* `utcOffsetSeconds`: UTC 时间偏移量 (秒)
* `timezone`: 时区
* `timezoneAbbreviation`: 时区缩写
* `elevation`: 海拔高度 (米)
* `currentWeather`: 当前实时天气模型 (`CurrentWeather`)

### `CurrentWeather.java`
* `temperature`: 实时温度 (°C)
* `windspeed`: 风速 (km/h)
* `winddirection`: 风向角度 (°)
* `weathercode`: 天气代码 (符合 WMO 世界气象组织标准)
* `time`: 观测时间 (格式: `yyyy-MM-dd'T'HH:mm`)
* `isDay`: 昼夜状态 (`1` 表示白天，`0` 表示黑夜)

---

## 4. SDK 调用指南

### 4.1 配置文件设定
若需要自定义或关闭该服务，可在 `application.yml` 配置：
```yaml
miniapis:
  weather:
    enabled: true                 # 是否开启装配，默认为 true
    url: "https://api.open-meteo.com" # 覆盖接口地址
```

### 4.2 Java 注入与调用
在你的 Spring Bean 中注入并使用 `OpenMeteoClient`：

```java
import com.bzz.miniapis.sdk.weather.OpenMeteoClient;
import com.bzz.miniapis.sdk.weather.WeatherForecast;
import com.bzz.miniapis.sdk.weather.CurrentWeather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weather")
public class WeatherDemoController {

    @Autowired
    private OpenMeteoClient weatherClient;

    /**
     * 根据经纬度查询当前温度
     * 示例：/api/weather/temp?lat=39.9042&lon=116.4074 (北京)
     */
    @GetMapping("/temp")
    public String getCurrentTemperature(@RequestParam Double lat, @RequestParam Double lon) {
        WeatherForecast forecast = weatherClient.getForecast(lat, lon, true);
        if (forecast != null && forecast.getCurrentWeather() != null) {
            CurrentWeather current = forecast.getCurrentWeather();
            return String.format("坐标 (lat=%f, lon=%f) 当前温度为: %.2f °C, 风速: %.2f km/h", 
                    lat, lon, current.getTemperature(), current.getWindspeed());
        }
        return "获取天气数据失败";
    }
}
```
