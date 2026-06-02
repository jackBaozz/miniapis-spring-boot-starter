package com.bzz.miniapis.sdk.patent;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        EpoProperties.class,
        TipoProperties.class,
        UsptoProperties.class,
        PatentsviewProperties.class
})
public class PatentAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.patent.epo.enabled", havingValue = "true", matchIfMissing = true)
    public EpoClient epoClient(EpoProperties properties) {
        return new EpoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.patent.tipo.enabled", havingValue = "true", matchIfMissing = true)
    public TipoClient tipoClient(TipoProperties properties) {
        return new TipoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.patent.uspto.enabled", havingValue = "true", matchIfMissing = true)
    public UsptoClient usptoClient(UsptoProperties properties) {
        return new UsptoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.patent.patentsview.enabled", havingValue = "true", matchIfMissing = true)
    public PatentsviewClient patentsviewClient(PatentsviewProperties properties) {
        return new PatentsviewClient(properties.getUrl());
    }

}
