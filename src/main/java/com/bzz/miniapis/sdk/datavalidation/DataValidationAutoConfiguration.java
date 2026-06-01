package com.bzz.miniapis.sdk.datavalidation;

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
        VatlayerProperties.class,
        LobComProperties.class,
        PostmanEchoProperties.class,
        PurgomalumProperties.class,
        UsAutocompleteProperties.class,
        UsExtractProperties.class,
        UsStreetAddressProperties.class
})
public class DataValidationAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.datavalidation.vatlayer.enabled", havingValue = "true", matchIfMissing = true)
    public VatlayerClient vatlayerClient(VatlayerProperties properties) {
        return createClient(VatlayerClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.datavalidation.lobcom.enabled", havingValue = "true", matchIfMissing = true)
    public LobComClient lobcomClient(LobComProperties properties) {
        return createClient(LobComClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.datavalidation.postmanecho.enabled", havingValue = "true", matchIfMissing = true)
    public PostmanEchoClient postmanechoClient(PostmanEchoProperties properties) {
        return createClient(PostmanEchoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.datavalidation.purgomalum.enabled", havingValue = "true", matchIfMissing = true)
    public PurgomalumClient purgomalumClient(PurgomalumProperties properties) {
        return createClient(PurgomalumClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.datavalidation.usautocomplete.enabled", havingValue = "true", matchIfMissing = true)
    public UsAutocompleteClient usautocompleteClient(UsAutocompleteProperties properties) {
        return createClient(UsAutocompleteClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.datavalidation.usextract.enabled", havingValue = "true", matchIfMissing = true)
    public UsExtractClient usextractClient(UsExtractProperties properties) {
        return createClient(UsExtractClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.datavalidation.usstreetaddress.enabled", havingValue = "true", matchIfMissing = true)
    public UsStreetAddressClient usstreetaddressClient(UsStreetAddressProperties properties) {
        return createClient(UsStreetAddressClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
