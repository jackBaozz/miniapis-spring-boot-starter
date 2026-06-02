package com.bzz.miniapis.sdk.weather;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        ColorfulcloudsProperties.class,
        QweatherProperties.class,
        AqicnProperties.class,
        HongKongObervatoryProperties.class,
        AemetProperties.class,
        RainviewerProperties.class,
        Api7TimerProperties.class,
        WeatherApiProperties.class,
        OpenMeteoProperties.class,
        MeteorologiskInstituttProperties.class,
        UsWeatherProperties.class,
        PirateWeatherProperties.class,
        OpenweathermapProperties.class,
        AccuweatherProperties.class,
        OpensensemapProperties.class,
        ForecaProperties.class,
        Weatherapi2Properties.class,
        OikolabProperties.class,
        WttrInProperties.class,
        WeatherstackProperties.class,
        YandexWeatherProperties.class,
        TomorrowProperties.class,
        ApixuProperties.class,
        WeatherbitProperties.class,
        StormGlassProperties.class,
        MicroWeatherProperties.class,
        IpmaProperties.class,
        OpenuvProperties.class,
        AviationweatherProperties.class,
        OdweatherProperties.class,
        HgWeatherProperties.class
})
public class WeatherAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.colorfulclouds.enabled", havingValue = "true", matchIfMissing = true)
    public ColorfulcloudsClient colorfulcloudsClient(ColorfulcloudsProperties properties) {
        return new ColorfulcloudsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.qweather.enabled", havingValue = "true", matchIfMissing = true)
    public QweatherClient qweatherClient(QweatherProperties properties) {
        return new QweatherClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.aqicn.enabled", havingValue = "true", matchIfMissing = true)
    public AqicnClient aqicnClient(AqicnProperties properties) {
        return new AqicnClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.hongkongobervatory.enabled", havingValue = "true", matchIfMissing = true)
    public HongKongObervatoryClient hongkongobervatoryClient(HongKongObervatoryProperties properties) {
        return new HongKongObervatoryClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.aemet.enabled", havingValue = "true", matchIfMissing = true)
    public AemetClient aemetClient(AemetProperties properties) {
        return new AemetClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.rainviewer.enabled", havingValue = "true", matchIfMissing = true)
    public RainviewerClient rainviewerClient(RainviewerProperties properties) {
        return new RainviewerClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.api7timer.enabled", havingValue = "true", matchIfMissing = true)
    public Api7TimerClient api7timerClient(Api7TimerProperties properties) {
        return new Api7TimerClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.weatherapi.enabled", havingValue = "true", matchIfMissing = true)
    public WeatherApiClient weatherapiClient(WeatherApiProperties properties) {
        return new WeatherApiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.openmeteo.enabled", havingValue = "true", matchIfMissing = true)
    public OpenMeteoClient openmeteoClient(OpenMeteoProperties properties) {
        return new OpenMeteoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.meteorologiskinstitutt.enabled", havingValue = "true", matchIfMissing = true)
    public MeteorologiskInstituttClient meteorologiskinstituttClient(MeteorologiskInstituttProperties properties) {
        return new MeteorologiskInstituttClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.usweather.enabled", havingValue = "true", matchIfMissing = true)
    public UsWeatherClient usweatherClient(UsWeatherProperties properties) {
        return new UsWeatherClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.pirateweather.enabled", havingValue = "true", matchIfMissing = true)
    public PirateWeatherClient pirateweatherClient(PirateWeatherProperties properties) {
        return new PirateWeatherClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.openweathermap.enabled", havingValue = "true", matchIfMissing = true)
    public OpenweathermapClient openweathermapClient(OpenweathermapProperties properties) {
        return new OpenweathermapClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.accuweather.enabled", havingValue = "true", matchIfMissing = true)
    public AccuweatherClient accuweatherClient(AccuweatherProperties properties) {
        return new AccuweatherClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.opensensemap.enabled", havingValue = "true", matchIfMissing = true)
    public OpensensemapClient opensensemapClient(OpensensemapProperties properties) {
        return new OpensensemapClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.foreca.enabled", havingValue = "true", matchIfMissing = true)
    public ForecaClient forecaClient(ForecaProperties properties) {
        return new ForecaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.weatherapi2.enabled", havingValue = "true", matchIfMissing = true)
    public Weatherapi2Client weatherapi2Client(Weatherapi2Properties properties) {
        return new Weatherapi2Client(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.oikolab.enabled", havingValue = "true", matchIfMissing = true)
    public OikolabClient oikolabClient(OikolabProperties properties) {
        return new OikolabClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.wttrin.enabled", havingValue = "true", matchIfMissing = true)
    public WttrInClient wttrinClient(WttrInProperties properties) {
        return new WttrInClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.weatherstack.enabled", havingValue = "true", matchIfMissing = true)
    public WeatherstackClient weatherstackClient(WeatherstackProperties properties) {
        return new WeatherstackClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.yandexweather.enabled", havingValue = "true", matchIfMissing = true)
    public YandexWeatherClient yandexweatherClient(YandexWeatherProperties properties) {
        return new YandexWeatherClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.tomorrow.enabled", havingValue = "true", matchIfMissing = true)
    public TomorrowClient tomorrowClient(TomorrowProperties properties) {
        return new TomorrowClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.apixu.enabled", havingValue = "true", matchIfMissing = true)
    public ApixuClient apixuClient(ApixuProperties properties) {
        return new ApixuClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.weatherbit.enabled", havingValue = "true", matchIfMissing = true)
    public WeatherbitClient weatherbitClient(WeatherbitProperties properties) {
        return new WeatherbitClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.stormglass.enabled", havingValue = "true", matchIfMissing = true)
    public StormGlassClient stormglassClient(StormGlassProperties properties) {
        return new StormGlassClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.microweather.enabled", havingValue = "true", matchIfMissing = true)
    public MicroWeatherClient microweatherClient(MicroWeatherProperties properties) {
        return new MicroWeatherClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.ipma.enabled", havingValue = "true", matchIfMissing = true)
    public IpmaClient ipmaClient(IpmaProperties properties) {
        return new IpmaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.openuv.enabled", havingValue = "true", matchIfMissing = true)
    public OpenuvClient openuvClient(OpenuvProperties properties) {
        return new OpenuvClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.aviationweather.enabled", havingValue = "true", matchIfMissing = true)
    public AviationweatherClient aviationweatherClient(AviationweatherProperties properties) {
        return new AviationweatherClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.odweather.enabled", havingValue = "true", matchIfMissing = true)
    public OdweatherClient odweatherClient(OdweatherProperties properties) {
        return new OdweatherClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.hgweather.enabled", havingValue = "true", matchIfMissing = true)
    public HgWeatherClient hgweatherClient(HgWeatherProperties properties) {
        return new HgWeatherClient(properties.getUrl());
    }

}
