package com.bzz.miniapis.sdk.phone;

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
        NumlookupProperties.class,
        NumverifyProperties.class,
        CloudmersiveValidateProperties.class,
        PhoneSpecificationProperties.class,
        PhoneValidationProperties.class,
        VeriphoneProperties.class
})
public class PhoneAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.phone.numlookup.enabled", havingValue = "true", matchIfMissing = true)
    public NumlookupClient numlookupClient(NumlookupProperties properties) {
        return createClient(NumlookupClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.phone.numverify.enabled", havingValue = "true", matchIfMissing = true)
    public NumverifyClient numverifyClient(NumverifyProperties properties) {
        return createClient(NumverifyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.phone.cloudmersivevalidate.enabled", havingValue = "true", matchIfMissing = true)
    public CloudmersiveValidateClient cloudmersivevalidateClient(CloudmersiveValidateProperties properties) {
        return createClient(CloudmersiveValidateClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.phone.phonespecification.enabled", havingValue = "true", matchIfMissing = true)
    public PhoneSpecificationClient phonespecificationClient(PhoneSpecificationProperties properties) {
        return createClient(PhoneSpecificationClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.phone.phonevalidation.enabled", havingValue = "true", matchIfMissing = true)
    public PhoneValidationClient phonevalidationClient(PhoneValidationProperties properties) {
        return createClient(PhoneValidationClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.phone.veriphone.enabled", havingValue = "true", matchIfMissing = true)
    public VeriphoneClient veriphoneClient(VeriphoneProperties properties) {
        return createClient(VeriphoneClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
