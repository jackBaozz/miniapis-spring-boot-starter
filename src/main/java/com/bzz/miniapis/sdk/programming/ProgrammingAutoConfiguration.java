package com.bzz.miniapis.sdk.programming;

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
        CodeforcesProperties.class,
        HackerearthProperties.class,
        Judge0CeProperties.class,
        KontestsProperties.class,
        MintlifyProperties.class
})
public class ProgrammingAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.programming.codeforces.enabled", havingValue = "true", matchIfMissing = true)
    public CodeforcesClient codeforcesClient(CodeforcesProperties properties) {
        return createClient(CodeforcesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.programming.hackerearth.enabled", havingValue = "true", matchIfMissing = true)
    public HackerearthClient hackerearthClient(HackerearthProperties properties) {
        return createClient(HackerearthClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.programming.judge0ce.enabled", havingValue = "true", matchIfMissing = true)
    public Judge0CeClient judge0ceClient(Judge0CeProperties properties) {
        return createClient(Judge0CeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.programming.kontests.enabled", havingValue = "true", matchIfMissing = true)
    public KontestsClient kontestsClient(KontestsProperties properties) {
        return createClient(KontestsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.programming.mintlify.enabled", havingValue = "true", matchIfMissing = true)
    public MintlifyClient mintlifyClient(MintlifyProperties properties) {
        return createClient(MintlifyClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
