package com.bzz.miniapis.sdk.phone;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        PhoneSpecificationProperties.class,
        PhoneValidationProperties.class,
        CloudmersiveValidateProperties.class,
        VeriphoneProperties.class,
        NumlookupProperties.class,
        NumverifyProperties.class
})
public class PhoneAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.phone.phonespecification.enabled", havingValue = "true", matchIfMissing = true)
    public PhoneSpecificationClient phonespecificationClient(PhoneSpecificationProperties properties) {
        return new PhoneSpecificationClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.phone.phonevalidation.enabled", havingValue = "true", matchIfMissing = true)
    public PhoneValidationClient phonevalidationClient(PhoneValidationProperties properties) {
        return new PhoneValidationClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.phone.cloudmersivevalidate.enabled", havingValue = "true", matchIfMissing = true)
    public CloudmersiveValidateClient cloudmersivevalidateClient(CloudmersiveValidateProperties properties) {
        return new CloudmersiveValidateClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.phone.veriphone.enabled", havingValue = "true", matchIfMissing = true)
    public VeriphoneClient veriphoneClient(VeriphoneProperties properties) {
        return new VeriphoneClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.phone.numlookup.enabled", havingValue = "true", matchIfMissing = true)
    public NumlookupClient numlookupClient(NumlookupProperties properties) {
        return new NumlookupClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.phone.numverify.enabled", havingValue = "true", matchIfMissing = true)
    public NumverifyClient numverifyClient(NumverifyProperties properties) {
        return new NumverifyClient(properties.getUrl());
    }

}
