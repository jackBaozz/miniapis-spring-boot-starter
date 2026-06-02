package com.bzz.miniapis.sdk.continuousintegration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        CircleciProperties.class,
        BitriseProperties.class,
        AzureDevopsHealthProperties.class,
        BuddyProperties.class,
        CodeshipProperties.class,
        TravisCiProperties.class
})
public class ContinuousIntegrationAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.continuousintegration.circleci.enabled", havingValue = "true", matchIfMissing = true)
    public CircleciClient circleciClient(CircleciProperties properties) {
        return new CircleciClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.continuousintegration.bitrise.enabled", havingValue = "true", matchIfMissing = true)
    public BitriseClient bitriseClient(BitriseProperties properties) {
        return new BitriseClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.continuousintegration.azuredevopshealth.enabled", havingValue = "true", matchIfMissing = true)
    public AzureDevopsHealthClient azuredevopshealthClient(AzureDevopsHealthProperties properties) {
        return new AzureDevopsHealthClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.continuousintegration.buddy.enabled", havingValue = "true", matchIfMissing = true)
    public BuddyClient buddyClient(BuddyProperties properties) {
        return new BuddyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.continuousintegration.codeship.enabled", havingValue = "true", matchIfMissing = true)
    public CodeshipClient codeshipClient(CodeshipProperties properties) {
        return new CodeshipClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.continuousintegration.travisci.enabled", havingValue = "true", matchIfMissing = true)
    public TravisCiClient travisciClient(TravisCiProperties properties) {
        return new TravisCiClient(properties.getUrl());
    }

}
