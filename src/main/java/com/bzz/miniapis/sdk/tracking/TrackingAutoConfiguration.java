package com.bzz.miniapis.sdk.tracking;

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
        AftershipProperties.class,
        CorreiosProperties.class,
        PixelaProperties.class,
        PostalpincodeProperties.class,
        PostmonProperties.class,
        PostnordProperties.class,
        WecantrackProperties.class,
        WhatpulseProperties.class,
        WhereparcelProperties.class
})
public class TrackingAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.tracking.aftership.enabled", havingValue = "true", matchIfMissing = true)
    public AftershipClient aftershipClient(AftershipProperties properties) {
        return createClient(AftershipClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.tracking.correios.enabled", havingValue = "true", matchIfMissing = true)
    public CorreiosClient correiosClient(CorreiosProperties properties) {
        return createClient(CorreiosClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.tracking.pixela.enabled", havingValue = "true", matchIfMissing = true)
    public PixelaClient pixelaClient(PixelaProperties properties) {
        return createClient(PixelaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.tracking.postalpincode.enabled", havingValue = "true", matchIfMissing = true)
    public PostalpincodeClient postalpincodeClient(PostalpincodeProperties properties) {
        return createClient(PostalpincodeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.tracking.postmon.enabled", havingValue = "true", matchIfMissing = true)
    public PostmonClient postmonClient(PostmonProperties properties) {
        return createClient(PostmonClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.tracking.postnord.enabled", havingValue = "true", matchIfMissing = true)
    public PostnordClient postnordClient(PostnordProperties properties) {
        return createClient(PostnordClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.tracking.wecantrack.enabled", havingValue = "true", matchIfMissing = true)
    public WecantrackClient wecantrackClient(WecantrackProperties properties) {
        return createClient(WecantrackClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.tracking.whatpulse.enabled", havingValue = "true", matchIfMissing = true)
    public WhatpulseClient whatpulseClient(WhatpulseProperties properties) {
        return createClient(WhatpulseClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.tracking.whereparcel.enabled", havingValue = "true", matchIfMissing = true)
    public WhereparcelClient whereparcelClient(WhereparcelProperties properties) {
        return createClient(WhereparcelClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
