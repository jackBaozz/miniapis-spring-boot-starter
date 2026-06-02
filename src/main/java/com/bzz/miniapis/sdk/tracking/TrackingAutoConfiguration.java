package com.bzz.miniapis.sdk.tracking;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        PixelaProperties.class,
        PostnordProperties.class,
        WecantrackProperties.class,
        WhereparcelProperties.class,
        PostalpincodeProperties.class,
        AftershipProperties.class,
        PostmonProperties.class,
        WhatpulseProperties.class,
        CorreiosProperties.class
})
public class TrackingAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.tracking.pixela.enabled", havingValue = "true", matchIfMissing = true)
    public PixelaClient pixelaClient(PixelaProperties properties) {
        return new PixelaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.tracking.postnord.enabled", havingValue = "true", matchIfMissing = true)
    public PostnordClient postnordClient(PostnordProperties properties) {
        return new PostnordClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.tracking.wecantrack.enabled", havingValue = "true", matchIfMissing = true)
    public WecantrackClient wecantrackClient(WecantrackProperties properties) {
        return new WecantrackClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.tracking.whereparcel.enabled", havingValue = "true", matchIfMissing = true)
    public WhereparcelClient whereparcelClient(WhereparcelProperties properties) {
        return new WhereparcelClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.tracking.postalpincode.enabled", havingValue = "true", matchIfMissing = true)
    public PostalpincodeClient postalpincodeClient(PostalpincodeProperties properties) {
        return new PostalpincodeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.tracking.aftership.enabled", havingValue = "true", matchIfMissing = true)
    public AftershipClient aftershipClient(AftershipProperties properties) {
        return new AftershipClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.tracking.postmon.enabled", havingValue = "true", matchIfMissing = true)
    public PostmonClient postmonClient(PostmonProperties properties) {
        return new PostmonClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.tracking.whatpulse.enabled", havingValue = "true", matchIfMissing = true)
    public WhatpulseClient whatpulseClient(WhatpulseProperties properties) {
        return new WhatpulseClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.tracking.correios.enabled", havingValue = "true", matchIfMissing = true)
    public CorreiosClient correiosClient(CorreiosProperties properties) {
        return new CorreiosClient(properties.getUrl());
    }

}
