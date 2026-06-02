package com.bzz.miniapis.sdk.datavalidation;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        UsExtractProperties.class,
        UsStreetAddressProperties.class,
        PurgomalumProperties.class,
        UsAutocompleteProperties.class,
        VatlayerProperties.class,
        LobComProperties.class,
        PostmanEchoProperties.class
})
public class DataValidationAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.datavalidation.usextract.enabled", havingValue = "true", matchIfMissing = true)
    public UsExtractClient usextractClient(UsExtractProperties properties) {
        return new UsExtractClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.datavalidation.usstreetaddress.enabled", havingValue = "true", matchIfMissing = true)
    public UsStreetAddressClient usstreetaddressClient(UsStreetAddressProperties properties) {
        return new UsStreetAddressClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.datavalidation.purgomalum.enabled", havingValue = "true", matchIfMissing = true)
    public PurgomalumClient purgomalumClient(PurgomalumProperties properties) {
        return new PurgomalumClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.datavalidation.usautocomplete.enabled", havingValue = "true", matchIfMissing = true)
    public UsAutocompleteClient usautocompleteClient(UsAutocompleteProperties properties) {
        return new UsAutocompleteClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.datavalidation.vatlayer.enabled", havingValue = "true", matchIfMissing = true)
    public VatlayerClient vatlayerClient(VatlayerProperties properties) {
        return new VatlayerClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.datavalidation.lobcom.enabled", havingValue = "true", matchIfMissing = true)
    public LobComClient lobcomClient(LobComProperties properties) {
        return new LobComClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.datavalidation.postmanecho.enabled", havingValue = "true", matchIfMissing = true)
    public PostmanEchoClient postmanechoClient(PostmanEchoProperties properties) {
        return new PostmanEchoClient(properties.getUrl());
    }

}
