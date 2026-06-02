package com.bzz.miniapis.sdk.testdata;

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
        BaconIpsumProperties.class,
        DicebearAvatarsProperties.class,
        EnglishRandomWordsProperties.class,
        FakejsonProperties.class,
        FakerapiProperties.class,
        FakestoreapiProperties.class,
        GeneradordniProperties.class,
        ItsthisforthatProperties.class,
        JsonplaceholderProperties.class,
        MailsacProperties.class,
        MockarooProperties.class,
        RandommerProperties.class,
        RandomuserProperties.class,
        RobohashProperties.class,
        SpanishRandomNamesProperties.class,
        SpanishRandomWordsProperties.class,
        ThisPersonDoesNotExistProperties.class,
        UuidGeneratorProperties.class,
        WhatTheCommitProperties.class,
        YesNoProperties.class
})
public class TestDataAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.baconipsum.enabled", havingValue = "true", matchIfMissing = true)
    public BaconIpsumClient baconipsumClient(BaconIpsumProperties properties) {
        return createClient(BaconIpsumClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.dicebearavatars.enabled", havingValue = "true", matchIfMissing = true)
    public DicebearAvatarsClient dicebearavatarsClient(DicebearAvatarsProperties properties) {
        return createClient(DicebearAvatarsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.englishrandomwords.enabled", havingValue = "true", matchIfMissing = true)
    public EnglishRandomWordsClient englishrandomwordsClient(EnglishRandomWordsProperties properties) {
        return createClient(EnglishRandomWordsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.fakejson.enabled", havingValue = "true", matchIfMissing = true)
    public FakejsonClient fakejsonClient(FakejsonProperties properties) {
        return createClient(FakejsonClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.fakerapi.enabled", havingValue = "true", matchIfMissing = true)
    public FakerapiClient fakerapiClient(FakerapiProperties properties) {
        return createClient(FakerapiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.fakestoreapi.enabled", havingValue = "true", matchIfMissing = true)
    public FakestoreapiClient fakestoreapiClient(FakestoreapiProperties properties) {
        return createClient(FakestoreapiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.generadordni.enabled", havingValue = "true", matchIfMissing = true)
    public GeneradordniClient generadordniClient(GeneradordniProperties properties) {
        return createClient(GeneradordniClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.itsthisforthat.enabled", havingValue = "true", matchIfMissing = true)
    public ItsthisforthatClient itsthisforthatClient(ItsthisforthatProperties properties) {
        return createClient(ItsthisforthatClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.jsonplaceholder.enabled", havingValue = "true", matchIfMissing = true)
    public JsonplaceholderClient jsonplaceholderClient(JsonplaceholderProperties properties) {
        return createClient(JsonplaceholderClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.mailsac.enabled", havingValue = "true", matchIfMissing = true)
    public MailsacClient mailsacClient(MailsacProperties properties) {
        return createClient(MailsacClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.mockaroo.enabled", havingValue = "true", matchIfMissing = true)
    public MockarooClient mockarooClient(MockarooProperties properties) {
        return createClient(MockarooClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.randommer.enabled", havingValue = "true", matchIfMissing = true)
    public RandommerClient randommerClient(RandommerProperties properties) {
        return createClient(RandommerClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.randomuser.enabled", havingValue = "true", matchIfMissing = true)
    public RandomuserClient randomuserClient(RandomuserProperties properties) {
        return createClient(RandomuserClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.robohash.enabled", havingValue = "true", matchIfMissing = true)
    public RobohashClient robohashClient(RobohashProperties properties) {
        return createClient(RobohashClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.spanishrandomnames.enabled", havingValue = "true", matchIfMissing = true)
    public SpanishRandomNamesClient spanishrandomnamesClient(SpanishRandomNamesProperties properties) {
        return createClient(SpanishRandomNamesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.spanishrandomwords.enabled", havingValue = "true", matchIfMissing = true)
    public SpanishRandomWordsClient spanishrandomwordsClient(SpanishRandomWordsProperties properties) {
        return createClient(SpanishRandomWordsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.thispersondoesnotexist.enabled", havingValue = "true", matchIfMissing = true)
    public ThisPersonDoesNotExistClient thispersondoesnotexistClient(ThisPersonDoesNotExistProperties properties) {
        return createClient(ThisPersonDoesNotExistClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.uuidgenerator.enabled", havingValue = "true", matchIfMissing = true)
    public UuidGeneratorClient uuidgeneratorClient(UuidGeneratorProperties properties) {
        return createClient(UuidGeneratorClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.whatthecommit.enabled", havingValue = "true", matchIfMissing = true)
    public WhatTheCommitClient whatthecommitClient(WhatTheCommitProperties properties) {
        return createClient(WhatTheCommitClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.yesno.enabled", havingValue = "true", matchIfMissing = true)
    public YesNoClient yesnoClient(YesNoProperties properties) {
        return createClient(YesNoClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
