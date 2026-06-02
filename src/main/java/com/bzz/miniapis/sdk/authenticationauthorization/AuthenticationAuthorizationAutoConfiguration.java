package com.bzz.miniapis.sdk.authenticationauthorization;

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
        Auth0Properties.class,
        GetotpProperties.class,
        MicroUserServiceProperties.class,
        MojoauthProperties.class,
        StytchProperties.class,
        WarrantProperties.class
})
public class AuthenticationAuthorizationAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.authenticationauthorization.auth0.enabled", havingValue = "true", matchIfMissing = true)
    public Auth0Client auth0Client(Auth0Properties properties) {
        return createClient(Auth0Client.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.authenticationauthorization.getotp.enabled", havingValue = "true", matchIfMissing = true)
    public GetotpClient getotpClient(GetotpProperties properties) {
        return createClient(GetotpClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.authenticationauthorization.microuserservice.enabled", havingValue = "true", matchIfMissing = true)
    public MicroUserServiceClient microuserserviceClient(MicroUserServiceProperties properties) {
        return createClient(MicroUserServiceClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.authenticationauthorization.mojoauth.enabled", havingValue = "true", matchIfMissing = true)
    public MojoauthClient mojoauthClient(MojoauthProperties properties) {
        return createClient(MojoauthClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.authenticationauthorization.stytch.enabled", havingValue = "true", matchIfMissing = true)
    public StytchClient stytchClient(StytchProperties properties) {
        return createClient(StytchClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.authenticationauthorization.warrant.enabled", havingValue = "true", matchIfMissing = true)
    public WarrantClient warrantClient(WarrantProperties properties) {
        return createClient(WarrantClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
