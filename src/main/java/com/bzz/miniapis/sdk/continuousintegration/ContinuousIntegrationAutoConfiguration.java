package com.bzz.miniapis.sdk.continuousintegration;

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
        AzureDevopsHealthProperties.class,
        BitriseProperties.class,
        BuddyProperties.class,
        CircleciProperties.class,
        CodeshipProperties.class,
        TravisCiProperties.class
})
public class ContinuousIntegrationAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.continuousintegration.azuredevopshealth.enabled", havingValue = "true", matchIfMissing = true)
    public AzureDevopsHealthClient azuredevopshealthClient(AzureDevopsHealthProperties properties) {
        return createClient(AzureDevopsHealthClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.continuousintegration.bitrise.enabled", havingValue = "true", matchIfMissing = true)
    public BitriseClient bitriseClient(BitriseProperties properties) {
        return createClient(BitriseClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.continuousintegration.buddy.enabled", havingValue = "true", matchIfMissing = true)
    public BuddyClient buddyClient(BuddyProperties properties) {
        return createClient(BuddyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.continuousintegration.circleci.enabled", havingValue = "true", matchIfMissing = true)
    public CircleciClient circleciClient(CircleciProperties properties) {
        return createClient(CircleciClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.continuousintegration.codeship.enabled", havingValue = "true", matchIfMissing = true)
    public CodeshipClient codeshipClient(CodeshipProperties properties) {
        return createClient(CodeshipClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.continuousintegration.travisci.enabled", havingValue = "true", matchIfMissing = true)
    public TravisCiClient travisciClient(TravisCiProperties properties) {
        return createClient(TravisCiClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
