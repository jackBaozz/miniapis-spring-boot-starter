package com.bzz.miniapis.sdk.patent;

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
        EpoProperties.class,
        PatentsviewProperties.class,
        TipoProperties.class,
        UsptoProperties.class
})
public class PatentAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.patent.epo.enabled", havingValue = "true", matchIfMissing = true)
    public EpoClient epoClient(EpoProperties properties) {
        return createClient(EpoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.patent.patentsview.enabled", havingValue = "true", matchIfMissing = true)
    public PatentsviewClient patentsviewClient(PatentsviewProperties properties) {
        return createClient(PatentsviewClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.patent.tipo.enabled", havingValue = "true", matchIfMissing = true)
    public TipoClient tipoClient(TipoProperties properties) {
        return createClient(TipoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.patent.uspto.enabled", havingValue = "true", matchIfMissing = true)
    public UsptoClient usptoClient(UsptoProperties properties) {
        return createClient(UsptoClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
