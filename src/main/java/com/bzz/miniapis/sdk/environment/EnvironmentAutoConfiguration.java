package com.bzz.miniapis.sdk.environment;

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
        BreezometerPollenProperties.class,
        CarbonInterfaceProperties.class,
        ClimatiqProperties.class,
        CloverlyProperties.class,
        Co2OffsetProperties.class,
        DanishDataServiceEnergiProperties.class,
        GrNstromindexProperties.class,
        IqairProperties.class,
        LuchtmeetnetProperties.class,
        NationalGridEsoProperties.class,
        OpenaqProperties.class,
        Pm25OpenDataPortalProperties.class,
        Pm25InProperties.class,
        PvwattsProperties.class,
        SrpEnergyProperties.class,
        UkCarbonIntensityProperties.class,
        WebsiteCarbonProperties.class
})
public class EnvironmentAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.breezometerpollen.enabled", havingValue = "true", matchIfMissing = true)
    public BreezometerPollenClient breezometerpollenClient(BreezometerPollenProperties properties) {
        return createClient(BreezometerPollenClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.carboninterface.enabled", havingValue = "true", matchIfMissing = true)
    public CarbonInterfaceClient carboninterfaceClient(CarbonInterfaceProperties properties) {
        return createClient(CarbonInterfaceClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.climatiq.enabled", havingValue = "true", matchIfMissing = true)
    public ClimatiqClient climatiqClient(ClimatiqProperties properties) {
        return createClient(ClimatiqClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.cloverly.enabled", havingValue = "true", matchIfMissing = true)
    public CloverlyClient cloverlyClient(CloverlyProperties properties) {
        return createClient(CloverlyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.co2offset.enabled", havingValue = "true", matchIfMissing = true)
    public Co2OffsetClient co2offsetClient(Co2OffsetProperties properties) {
        return createClient(Co2OffsetClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.danishdataserviceenergi.enabled", havingValue = "true", matchIfMissing = true)
    public DanishDataServiceEnergiClient danishdataserviceenergiClient(DanishDataServiceEnergiProperties properties) {
        return createClient(DanishDataServiceEnergiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.grnstromindex.enabled", havingValue = "true", matchIfMissing = true)
    public GrNstromindexClient grnstromindexClient(GrNstromindexProperties properties) {
        return createClient(GrNstromindexClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.iqair.enabled", havingValue = "true", matchIfMissing = true)
    public IqairClient iqairClient(IqairProperties properties) {
        return createClient(IqairClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.luchtmeetnet.enabled", havingValue = "true", matchIfMissing = true)
    public LuchtmeetnetClient luchtmeetnetClient(LuchtmeetnetProperties properties) {
        return createClient(LuchtmeetnetClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.nationalgrideso.enabled", havingValue = "true", matchIfMissing = true)
    public NationalGridEsoClient nationalgridesoClient(NationalGridEsoProperties properties) {
        return createClient(NationalGridEsoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.openaq.enabled", havingValue = "true", matchIfMissing = true)
    public OpenaqClient openaqClient(OpenaqProperties properties) {
        return createClient(OpenaqClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.pm25opendataportal.enabled", havingValue = "true", matchIfMissing = true)
    public Pm25OpenDataPortalClient pm25opendataportalClient(Pm25OpenDataPortalProperties properties) {
        return createClient(Pm25OpenDataPortalClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.pm25in.enabled", havingValue = "true", matchIfMissing = true)
    public Pm25InClient pm25inClient(Pm25InProperties properties) {
        return createClient(Pm25InClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.pvwatts.enabled", havingValue = "true", matchIfMissing = true)
    public PvwattsClient pvwattsClient(PvwattsProperties properties) {
        return createClient(PvwattsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.srpenergy.enabled", havingValue = "true", matchIfMissing = true)
    public SrpEnergyClient srpenergyClient(SrpEnergyProperties properties) {
        return createClient(SrpEnergyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.ukcarbonintensity.enabled", havingValue = "true", matchIfMissing = true)
    public UkCarbonIntensityClient ukcarbonintensityClient(UkCarbonIntensityProperties properties) {
        return createClient(UkCarbonIntensityClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.websitecarbon.enabled", havingValue = "true", matchIfMissing = true)
    public WebsiteCarbonClient websitecarbonClient(WebsiteCarbonProperties properties) {
        return createClient(WebsiteCarbonClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
