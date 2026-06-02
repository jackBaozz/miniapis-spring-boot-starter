package com.bzz.miniapis.sdk.authenticationauthorization;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        Auth0Properties.class,
        MojoauthProperties.class,
        WarrantProperties.class,
        GetotpProperties.class,
        StytchProperties.class,
        MicroUserServiceProperties.class
})
public class AuthenticationAuthorizationAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.authenticationauthorization.auth0.enabled", havingValue = "true", matchIfMissing = true)
    public Auth0Client auth0Client(Auth0Properties properties) {
        return new Auth0Client(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.authenticationauthorization.mojoauth.enabled", havingValue = "true", matchIfMissing = true)
    public MojoauthClient mojoauthClient(MojoauthProperties properties) {
        return new MojoauthClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.authenticationauthorization.warrant.enabled", havingValue = "true", matchIfMissing = true)
    public WarrantClient warrantClient(WarrantProperties properties) {
        return new WarrantClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.authenticationauthorization.getotp.enabled", havingValue = "true", matchIfMissing = true)
    public GetotpClient getotpClient(GetotpProperties properties) {
        return new GetotpClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.authenticationauthorization.stytch.enabled", havingValue = "true", matchIfMissing = true)
    public StytchClient stytchClient(StytchProperties properties) {
        return new StytchClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.authenticationauthorization.microuserservice.enabled", havingValue = "true", matchIfMissing = true)
    public MicroUserServiceClient microuserserviceClient(MicroUserServiceProperties properties) {
        return new MicroUserServiceClient(properties.getUrl());
    }

}
