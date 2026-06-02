package com.bzz.miniapis.sdk.programming;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        HackerearthProperties.class,
        CodeforcesProperties.class,
        Judge0CeProperties.class,
        MintlifyProperties.class
})
public class ProgrammingAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.programming.hackerearth.enabled", havingValue = "true", matchIfMissing = true)
    public HackerearthClient hackerearthClient(HackerearthProperties properties) {
        return new HackerearthClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.programming.codeforces.enabled", havingValue = "true", matchIfMissing = true)
    public CodeforcesClient codeforcesClient(CodeforcesProperties properties) {
        return new CodeforcesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.programming.judge0ce.enabled", havingValue = "true", matchIfMissing = true)
    public Judge0CeClient judge0ceClient(Judge0CeProperties properties) {
        return new Judge0CeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.programming.mintlify.enabled", havingValue = "true", matchIfMissing = true)
    public MintlifyClient mintlifyClient(MintlifyProperties properties) {
        return new MintlifyClient(properties.getUrl());
    }

}
