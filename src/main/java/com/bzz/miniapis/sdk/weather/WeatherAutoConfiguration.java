package com.bzz.miniapis.sdk.weather;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        WeatherstackProperties.class,
        Api7TimerProperties.class,
        AccuweatherProperties.class,
        AemetProperties.class,
        ApixuProperties.class,
        AqicnProperties.class,
        AviationweatherProperties.class,
        ColorfulcloudsProperties.class,
        EuskalmetProperties.class,
        ForecaProperties.class,
        HgWeatherProperties.class,
        HongKongObervatoryProperties.class,
        IpmaProperties.class,
        MetaweatherProperties.class,
        MeteorologiskInstituttProperties.class,
        MicroWeatherProperties.class,
        OdweatherProperties.class,
        OikolabProperties.class,
        OpenMeteoProperties.class,
        OpensensemapProperties.class,
        OpenuvProperties.class,
        OpenweathermapProperties.class,
        PirateWeatherProperties.class,
        QweatherProperties.class,
        RainviewerProperties.class,
        StormGlassProperties.class,
        TomorrowProperties.class,
        UsWeatherProperties.class,
        VisualCrossingProperties.class,
        WeatherApiProperties.class,
        WeatherbitProperties.class,
        WttrInProperties.class,
        YandexWeatherProperties.class
})
public class WeatherAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.weatherstack.enabled", havingValue = "true", matchIfMissing = true)
    public WeatherstackClient weatherstackClient(WeatherstackProperties properties) {
        return createClient(WeatherstackClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.api7timer.enabled", havingValue = "true", matchIfMissing = true)
    public Api7TimerClient api7timerClient(Api7TimerProperties properties) {
        return createClient(Api7TimerClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.accuweather.enabled", havingValue = "true", matchIfMissing = true)
    public AccuweatherClient accuweatherClient(AccuweatherProperties properties) {
        return createClient(AccuweatherClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.aemet.enabled", havingValue = "true", matchIfMissing = true)
    public AemetClient aemetClient(AemetProperties properties) {
        return createClient(AemetClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.apixu.enabled", havingValue = "true", matchIfMissing = true)
    public ApixuClient apixuClient(ApixuProperties properties) {
        return createClient(ApixuClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.aqicn.enabled", havingValue = "true", matchIfMissing = true)
    public AqicnClient aqicnClient(AqicnProperties properties) {
        return createClient(AqicnClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.aviationweather.enabled", havingValue = "true", matchIfMissing = true)
    public AviationweatherClient aviationweatherClient(AviationweatherProperties properties) {
        return createClient(AviationweatherClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.colorfulclouds.enabled", havingValue = "true", matchIfMissing = true)
    public ColorfulcloudsClient colorfulcloudsClient(ColorfulcloudsProperties properties) {
        return createClient(ColorfulcloudsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.euskalmet.enabled", havingValue = "true", matchIfMissing = true)
    public EuskalmetClient euskalmetClient(EuskalmetProperties properties) {
        return createClient(EuskalmetClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.foreca.enabled", havingValue = "true", matchIfMissing = true)
    public ForecaClient forecaClient(ForecaProperties properties) {
        return createClient(ForecaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.hgweather.enabled", havingValue = "true", matchIfMissing = true)
    public HgWeatherClient hgweatherClient(HgWeatherProperties properties) {
        return createClient(HgWeatherClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.hongkongobervatory.enabled", havingValue = "true", matchIfMissing = true)
    public HongKongObervatoryClient hongkongobervatoryClient(HongKongObervatoryProperties properties) {
        return createClient(HongKongObervatoryClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.ipma.enabled", havingValue = "true", matchIfMissing = true)
    public IpmaClient ipmaClient(IpmaProperties properties) {
        return createClient(IpmaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.metaweather.enabled", havingValue = "true", matchIfMissing = true)
    public MetaweatherClient metaweatherClient(MetaweatherProperties properties) {
        return createClient(MetaweatherClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.meteorologiskinstitutt.enabled", havingValue = "true", matchIfMissing = true)
    public MeteorologiskInstituttClient meteorologiskinstituttClient(MeteorologiskInstituttProperties properties) {
        return createClient(MeteorologiskInstituttClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.microweather.enabled", havingValue = "true", matchIfMissing = true)
    public MicroWeatherClient microweatherClient(MicroWeatherProperties properties) {
        return createClient(MicroWeatherClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.odweather.enabled", havingValue = "true", matchIfMissing = true)
    public OdweatherClient odweatherClient(OdweatherProperties properties) {
        return createClient(OdweatherClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.oikolab.enabled", havingValue = "true", matchIfMissing = true)
    public OikolabClient oikolabClient(OikolabProperties properties) {
        return createClient(OikolabClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.openmeteo.enabled", havingValue = "true", matchIfMissing = true)
    public OpenMeteoClient openmeteoClient(OpenMeteoProperties properties) {
        return createClient(OpenMeteoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.opensensemap.enabled", havingValue = "true", matchIfMissing = true)
    public OpensensemapClient opensensemapClient(OpensensemapProperties properties) {
        return createClient(OpensensemapClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.openuv.enabled", havingValue = "true", matchIfMissing = true)
    public OpenuvClient openuvClient(OpenuvProperties properties) {
        return createClient(OpenuvClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.openweathermap.enabled", havingValue = "true", matchIfMissing = true)
    public OpenweathermapClient openweathermapClient(OpenweathermapProperties properties) {
        return createClient(OpenweathermapClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.pirateweather.enabled", havingValue = "true", matchIfMissing = true)
    public PirateWeatherClient pirateweatherClient(PirateWeatherProperties properties) {
        return createClient(PirateWeatherClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.qweather.enabled", havingValue = "true", matchIfMissing = true)
    public QweatherClient qweatherClient(QweatherProperties properties) {
        return createClient(QweatherClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.rainviewer.enabled", havingValue = "true", matchIfMissing = true)
    public RainviewerClient rainviewerClient(RainviewerProperties properties) {
        return createClient(RainviewerClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.stormglass.enabled", havingValue = "true", matchIfMissing = true)
    public StormGlassClient stormglassClient(StormGlassProperties properties) {
        return createClient(StormGlassClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.tomorrow.enabled", havingValue = "true", matchIfMissing = true)
    public TomorrowClient tomorrowClient(TomorrowProperties properties) {
        return createClient(TomorrowClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.usweather.enabled", havingValue = "true", matchIfMissing = true)
    public UsWeatherClient usweatherClient(UsWeatherProperties properties) {
        return createClient(UsWeatherClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.visualcrossing.enabled", havingValue = "true", matchIfMissing = true)
    public VisualCrossingClient visualcrossingClient(VisualCrossingProperties properties) {
        return createClient(VisualCrossingClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.weatherapi.enabled", havingValue = "true", matchIfMissing = true)
    public WeatherApiClient weatherapiClient(WeatherApiProperties properties) {
        return createClient(WeatherApiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.weatherbit.enabled", havingValue = "true", matchIfMissing = true)
    public WeatherbitClient weatherbitClient(WeatherbitProperties properties) {
        return createClient(WeatherbitClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.wttrin.enabled", havingValue = "true", matchIfMissing = true)
    public WttrInClient wttrinClient(WttrInProperties properties) {
        return createClient(WttrInClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.weather.yandexweather.enabled", havingValue = "true", matchIfMissing = true)
    public YandexWeatherClient yandexweatherClient(YandexWeatherProperties properties) {
        return createClient(YandexWeatherClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
