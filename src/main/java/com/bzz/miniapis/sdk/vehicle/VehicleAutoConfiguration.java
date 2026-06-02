package com.bzz.miniapis.sdk.vehicle;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        BrazilianVehiclesAndPricesProperties.class,
        HelipaddySitesProperties.class,
        RevcardataProperties.class,
        MercedesBenzProperties.class,
        KelleyBlueBookProperties.class,
        SmartcarProperties.class,
        NhtsaProperties.class
})
public class VehicleAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.vehicle.brazilianvehiclesandprices.enabled", havingValue = "true", matchIfMissing = true)
    public BrazilianVehiclesAndPricesClient brazilianvehiclesandpricesClient(BrazilianVehiclesAndPricesProperties properties) {
        return new BrazilianVehiclesAndPricesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.vehicle.helipaddysites.enabled", havingValue = "true", matchIfMissing = true)
    public HelipaddySitesClient helipaddysitesClient(HelipaddySitesProperties properties) {
        return new HelipaddySitesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.vehicle.revcardata.enabled", havingValue = "true", matchIfMissing = true)
    public RevcardataClient revcardataClient(RevcardataProperties properties) {
        return new RevcardataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.vehicle.mercedesbenz.enabled", havingValue = "true", matchIfMissing = true)
    public MercedesBenzClient mercedesbenzClient(MercedesBenzProperties properties) {
        return new MercedesBenzClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.vehicle.kelleybluebook.enabled", havingValue = "true", matchIfMissing = true)
    public KelleyBlueBookClient kelleybluebookClient(KelleyBlueBookProperties properties) {
        return new KelleyBlueBookClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.vehicle.smartcar.enabled", havingValue = "true", matchIfMissing = true)
    public SmartcarClient smartcarClient(SmartcarProperties properties) {
        return new SmartcarClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.vehicle.nhtsa.enabled", havingValue = "true", matchIfMissing = true)
    public NhtsaClient nhtsaClient(NhtsaProperties properties) {
        return new NhtsaClient(properties.getUrl());
    }

}
