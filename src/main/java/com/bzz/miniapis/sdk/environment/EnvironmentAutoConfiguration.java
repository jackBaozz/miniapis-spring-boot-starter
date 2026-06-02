package com.bzz.miniapis.sdk.environment;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        IqairProperties.class,
        OpenaqProperties.class,
        WebsiteCarbonProperties.class,
        Pm25OpenDataPortalProperties.class,
        GrNstromindexProperties.class,
        UkCarbonIntensityProperties.class,
        CarbonInterfaceProperties.class,
        BreezometerPollenProperties.class,
        SrpEnergyProperties.class,
        DanishDataServiceEnergiProperties.class,
        ClimatiqProperties.class,
        Co2OffsetProperties.class,
        LuchtmeetnetProperties.class,
        CloverlyProperties.class
})
public class EnvironmentAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.iqair.enabled", havingValue = "true", matchIfMissing = true)
    public IqairClient iqairClient(IqairProperties properties) {
        return new IqairClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.openaq.enabled", havingValue = "true", matchIfMissing = true)
    public OpenaqClient openaqClient(OpenaqProperties properties) {
        return new OpenaqClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.websitecarbon.enabled", havingValue = "true", matchIfMissing = true)
    public WebsiteCarbonClient websitecarbonClient(WebsiteCarbonProperties properties) {
        return new WebsiteCarbonClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.pm25opendataportal.enabled", havingValue = "true", matchIfMissing = true)
    public Pm25OpenDataPortalClient pm25opendataportalClient(Pm25OpenDataPortalProperties properties) {
        return new Pm25OpenDataPortalClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.grnstromindex.enabled", havingValue = "true", matchIfMissing = true)
    public GrNstromindexClient grnstromindexClient(GrNstromindexProperties properties) {
        return new GrNstromindexClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.ukcarbonintensity.enabled", havingValue = "true", matchIfMissing = true)
    public UkCarbonIntensityClient ukcarbonintensityClient(UkCarbonIntensityProperties properties) {
        return new UkCarbonIntensityClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.carboninterface.enabled", havingValue = "true", matchIfMissing = true)
    public CarbonInterfaceClient carboninterfaceClient(CarbonInterfaceProperties properties) {
        return new CarbonInterfaceClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.breezometerpollen.enabled", havingValue = "true", matchIfMissing = true)
    public BreezometerPollenClient breezometerpollenClient(BreezometerPollenProperties properties) {
        return new BreezometerPollenClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.srpenergy.enabled", havingValue = "true", matchIfMissing = true)
    public SrpEnergyClient srpenergyClient(SrpEnergyProperties properties) {
        return new SrpEnergyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.danishdataserviceenergi.enabled", havingValue = "true", matchIfMissing = true)
    public DanishDataServiceEnergiClient danishdataserviceenergiClient(DanishDataServiceEnergiProperties properties) {
        return new DanishDataServiceEnergiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.climatiq.enabled", havingValue = "true", matchIfMissing = true)
    public ClimatiqClient climatiqClient(ClimatiqProperties properties) {
        return new ClimatiqClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.co2offset.enabled", havingValue = "true", matchIfMissing = true)
    public Co2OffsetClient co2offsetClient(Co2OffsetProperties properties) {
        return new Co2OffsetClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.luchtmeetnet.enabled", havingValue = "true", matchIfMissing = true)
    public LuchtmeetnetClient luchtmeetnetClient(LuchtmeetnetProperties properties) {
        return new LuchtmeetnetClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.environment.cloverly.enabled", havingValue = "true", matchIfMissing = true)
    public CloverlyClient cloverlyClient(CloverlyProperties properties) {
        return new CloverlyClient(properties.getUrl());
    }

}
