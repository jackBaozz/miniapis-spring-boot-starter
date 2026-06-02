package com.bzz.miniapis.sdk.personality;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        DictumProperties.class,
        QuotableQuotesProperties.class,
        ProgrammingQuotesProperties.class,
        MediumProperties.class,
        StoicismQuoteProperties.class,
        DevToProperties.class,
        UdemyInstructorProperties.class,
        IcanhazdadjokeProperties.class,
        QuotesOnDesignProperties.class,
        KimiquotesProperties.class,
        FavqsComProperties.class,
        TraitifyProperties.class,
        QuoteclearProperties.class,
        TheySaidSoQuotesProperties.class,
        AdviceSlipProperties.class,
        KanyeRestProperties.class,
        FoaasProperties.class,
        ZenQuotesProperties.class
})
public class PersonalityAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.dictum.enabled", havingValue = "true", matchIfMissing = true)
    public DictumClient dictumClient(DictumProperties properties) {
        return new DictumClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.quotablequotes.enabled", havingValue = "true", matchIfMissing = true)
    public QuotableQuotesClient quotablequotesClient(QuotableQuotesProperties properties) {
        return new QuotableQuotesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.programmingquotes.enabled", havingValue = "true", matchIfMissing = true)
    public ProgrammingQuotesClient programmingquotesClient(ProgrammingQuotesProperties properties) {
        return new ProgrammingQuotesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.medium.enabled", havingValue = "true", matchIfMissing = true)
    public MediumClient mediumClient(MediumProperties properties) {
        return new MediumClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.stoicismquote.enabled", havingValue = "true", matchIfMissing = true)
    public StoicismQuoteClient stoicismquoteClient(StoicismQuoteProperties properties) {
        return new StoicismQuoteClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.devto.enabled", havingValue = "true", matchIfMissing = true)
    public DevToClient devtoClient(DevToProperties properties) {
        return new DevToClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.udemyinstructor.enabled", havingValue = "true", matchIfMissing = true)
    public UdemyInstructorClient udemyinstructorClient(UdemyInstructorProperties properties) {
        return new UdemyInstructorClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.icanhazdadjoke.enabled", havingValue = "true", matchIfMissing = true)
    public IcanhazdadjokeClient icanhazdadjokeClient(IcanhazdadjokeProperties properties) {
        return new IcanhazdadjokeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.quotesondesign.enabled", havingValue = "true", matchIfMissing = true)
    public QuotesOnDesignClient quotesondesignClient(QuotesOnDesignProperties properties) {
        return new QuotesOnDesignClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.kimiquotes.enabled", havingValue = "true", matchIfMissing = true)
    public KimiquotesClient kimiquotesClient(KimiquotesProperties properties) {
        return new KimiquotesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.favqscom.enabled", havingValue = "true", matchIfMissing = true)
    public FavqsComClient favqscomClient(FavqsComProperties properties) {
        return new FavqsComClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.traitify.enabled", havingValue = "true", matchIfMissing = true)
    public TraitifyClient traitifyClient(TraitifyProperties properties) {
        return new TraitifyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.quoteclear.enabled", havingValue = "true", matchIfMissing = true)
    public QuoteclearClient quoteclearClient(QuoteclearProperties properties) {
        return new QuoteclearClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.theysaidsoquotes.enabled", havingValue = "true", matchIfMissing = true)
    public TheySaidSoQuotesClient theysaidsoquotesClient(TheySaidSoQuotesProperties properties) {
        return new TheySaidSoQuotesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.adviceslip.enabled", havingValue = "true", matchIfMissing = true)
    public AdviceSlipClient adviceslipClient(AdviceSlipProperties properties) {
        return new AdviceSlipClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.kanyerest.enabled", havingValue = "true", matchIfMissing = true)
    public KanyeRestClient kanyerestClient(KanyeRestProperties properties) {
        return new KanyeRestClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.foaas.enabled", havingValue = "true", matchIfMissing = true)
    public FoaasClient foaasClient(FoaasProperties properties) {
        return new FoaasClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.personality.zenquotes.enabled", havingValue = "true", matchIfMissing = true)
    public ZenQuotesClient zenquotesClient(ZenQuotesProperties properties) {
        return new ZenQuotesClient(properties.getUrl());
    }

}
