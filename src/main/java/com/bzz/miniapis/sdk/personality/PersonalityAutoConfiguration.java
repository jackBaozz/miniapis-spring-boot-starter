package com.bzz.miniapis.sdk.personality;

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
        AdviceSlipProperties.class,
        DevToProperties.class,
        DictumProperties.class,
        FavqsComProperties.class,
        FoaasProperties.class,
        IcanhazdadjokeProperties.class,
        KanyeRestProperties.class,
        KimiquotesProperties.class,
        MediumProperties.class,
        ProgrammingQuotesProperties.class,
        QuotableQuotesProperties.class,
        QuoteclearProperties.class,
        QuotesOnDesignProperties.class,
        StoicismQuoteProperties.class,
        TheySaidSoQuotesProperties.class,
        TraitifyProperties.class,
        UdemyInstructorProperties.class,
        ZenQuotesProperties.class
})
public class PersonalityAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.adviceslip.enabled", havingValue = "true", matchIfMissing = true)
    public AdviceSlipClient adviceslipClient(AdviceSlipProperties properties) {
        return createClient(AdviceSlipClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.devto.enabled", havingValue = "true", matchIfMissing = true)
    public DevToClient devtoClient(DevToProperties properties) {
        return createClient(DevToClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.dictum.enabled", havingValue = "true", matchIfMissing = true)
    public DictumClient dictumClient(DictumProperties properties) {
        return createClient(DictumClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.favqscom.enabled", havingValue = "true", matchIfMissing = true)
    public FavqsComClient favqscomClient(FavqsComProperties properties) {
        return createClient(FavqsComClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.foaas.enabled", havingValue = "true", matchIfMissing = true)
    public FoaasClient foaasClient(FoaasProperties properties) {
        return createClient(FoaasClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.icanhazdadjoke.enabled", havingValue = "true", matchIfMissing = true)
    public IcanhazdadjokeClient icanhazdadjokeClient(IcanhazdadjokeProperties properties) {
        return createClient(IcanhazdadjokeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.kanyerest.enabled", havingValue = "true", matchIfMissing = true)
    public KanyeRestClient kanyerestClient(KanyeRestProperties properties) {
        return createClient(KanyeRestClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.kimiquotes.enabled", havingValue = "true", matchIfMissing = true)
    public KimiquotesClient kimiquotesClient(KimiquotesProperties properties) {
        return createClient(KimiquotesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.medium.enabled", havingValue = "true", matchIfMissing = true)
    public MediumClient mediumClient(MediumProperties properties) {
        return createClient(MediumClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.programmingquotes.enabled", havingValue = "true", matchIfMissing = true)
    public ProgrammingQuotesClient programmingquotesClient(ProgrammingQuotesProperties properties) {
        return createClient(ProgrammingQuotesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.quotablequotes.enabled", havingValue = "true", matchIfMissing = true)
    public QuotableQuotesClient quotablequotesClient(QuotableQuotesProperties properties) {
        return createClient(QuotableQuotesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.quoteclear.enabled", havingValue = "true", matchIfMissing = true)
    public QuoteclearClient quoteclearClient(QuoteclearProperties properties) {
        return createClient(QuoteclearClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.quotesondesign.enabled", havingValue = "true", matchIfMissing = true)
    public QuotesOnDesignClient quotesondesignClient(QuotesOnDesignProperties properties) {
        return createClient(QuotesOnDesignClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.stoicismquote.enabled", havingValue = "true", matchIfMissing = true)
    public StoicismQuoteClient stoicismquoteClient(StoicismQuoteProperties properties) {
        return createClient(StoicismQuoteClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.theysaidsoquotes.enabled", havingValue = "true", matchIfMissing = true)
    public TheySaidSoQuotesClient theysaidsoquotesClient(TheySaidSoQuotesProperties properties) {
        return createClient(TheySaidSoQuotesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.traitify.enabled", havingValue = "true", matchIfMissing = true)
    public TraitifyClient traitifyClient(TraitifyProperties properties) {
        return createClient(TraitifyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.udemyinstructor.enabled", havingValue = "true", matchIfMissing = true)
    public UdemyInstructorClient udemyinstructorClient(UdemyInstructorProperties properties) {
        return createClient(UdemyInstructorClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.zenquotes.enabled", havingValue = "true", matchIfMissing = true)
    public ZenQuotesClient zenquotesClient(ZenQuotesProperties properties) {
        return createClient(ZenQuotesClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
