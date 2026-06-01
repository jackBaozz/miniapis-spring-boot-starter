package com.bzz.miniapis.sdk.vehicle;

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
        BrazilianVehiclesAndPricesProperties.class,
        HelipaddySitesProperties.class,
        KelleyBlueBookProperties.class,
        MercedesBenzProperties.class,
        NhtsaProperties.class,
        RevcardataProperties.class,
        SmartcarProperties.class
})
public class VehicleAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.vehicle.brazilianvehiclesandprices.enabled", havingValue = "true", matchIfMissing = true)
    public BrazilianVehiclesAndPricesClient brazilianvehiclesandpricesClient(BrazilianVehiclesAndPricesProperties properties) {
        return createClient(BrazilianVehiclesAndPricesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.vehicle.helipaddysites.enabled", havingValue = "true", matchIfMissing = true)
    public HelipaddySitesClient helipaddysitesClient(HelipaddySitesProperties properties) {
        return createClient(HelipaddySitesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.vehicle.kelleybluebook.enabled", havingValue = "true", matchIfMissing = true)
    public KelleyBlueBookClient kelleybluebookClient(KelleyBlueBookProperties properties) {
        return createClient(KelleyBlueBookClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.vehicle.mercedesbenz.enabled", havingValue = "true", matchIfMissing = true)
    public MercedesBenzClient mercedesbenzClient(MercedesBenzProperties properties) {
        return createClient(MercedesBenzClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.vehicle.nhtsa.enabled", havingValue = "true", matchIfMissing = true)
    public NhtsaClient nhtsaClient(NhtsaProperties properties) {
        return createClient(NhtsaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.vehicle.revcardata.enabled", havingValue = "true", matchIfMissing = true)
    public RevcardataClient revcardataClient(RevcardataProperties properties) {
        return createClient(RevcardataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.vehicle.smartcar.enabled", havingValue = "true", matchIfMissing = true)
    public SmartcarClient smartcarClient(SmartcarProperties properties) {
        return createClient(SmartcarClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
