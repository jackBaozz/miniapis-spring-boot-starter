package com.bzz.miniapis.sdk.testdata;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        JsonplaceholderProperties.class,
        FakestoreapiProperties.class,
        EnglishRandomWordsProperties.class,
        ItsthisforthatProperties.class,
        RandomuserProperties.class,
        MockarooProperties.class,
        MailsacProperties.class,
        UuidGeneratorProperties.class,
        BaconIpsumProperties.class,
        ThisPersonDoesNotExistProperties.class,
        RandommerProperties.class,
        SpanishRandomNamesProperties.class,
        DicebearAvatarsProperties.class,
        SpanishRandomWordsProperties.class,
        GeneradordniProperties.class,
        YesNoProperties.class,
        FakerapiProperties.class,
        WhatTheCommitProperties.class,
        RobohashProperties.class,
        FakejsonProperties.class
})
public class TestDataAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.jsonplaceholder.enabled", havingValue = "true", matchIfMissing = true)
    public JsonplaceholderClient jsonplaceholderClient(JsonplaceholderProperties properties) {
        return new JsonplaceholderClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.fakestoreapi.enabled", havingValue = "true", matchIfMissing = true)
    public FakestoreapiClient fakestoreapiClient(FakestoreapiProperties properties) {
        return new FakestoreapiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.englishrandomwords.enabled", havingValue = "true", matchIfMissing = true)
    public EnglishRandomWordsClient englishrandomwordsClient(EnglishRandomWordsProperties properties) {
        return new EnglishRandomWordsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.itsthisforthat.enabled", havingValue = "true", matchIfMissing = true)
    public ItsthisforthatClient itsthisforthatClient(ItsthisforthatProperties properties) {
        return new ItsthisforthatClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.randomuser.enabled", havingValue = "true", matchIfMissing = true)
    public RandomuserClient randomuserClient(RandomuserProperties properties) {
        return new RandomuserClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.mockaroo.enabled", havingValue = "true", matchIfMissing = true)
    public MockarooClient mockarooClient(MockarooProperties properties) {
        return new MockarooClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.mailsac.enabled", havingValue = "true", matchIfMissing = true)
    public MailsacClient mailsacClient(MailsacProperties properties) {
        return new MailsacClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.uuidgenerator.enabled", havingValue = "true", matchIfMissing = true)
    public UuidGeneratorClient uuidgeneratorClient(UuidGeneratorProperties properties) {
        return new UuidGeneratorClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.baconipsum.enabled", havingValue = "true", matchIfMissing = true)
    public BaconIpsumClient baconipsumClient(BaconIpsumProperties properties) {
        return new BaconIpsumClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.thispersondoesnotexist.enabled", havingValue = "true", matchIfMissing = true)
    public ThisPersonDoesNotExistClient thispersondoesnotexistClient(ThisPersonDoesNotExistProperties properties) {
        return new ThisPersonDoesNotExistClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.randommer.enabled", havingValue = "true", matchIfMissing = true)
    public RandommerClient randommerClient(RandommerProperties properties) {
        return new RandommerClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.spanishrandomnames.enabled", havingValue = "true", matchIfMissing = true)
    public SpanishRandomNamesClient spanishrandomnamesClient(SpanishRandomNamesProperties properties) {
        return new SpanishRandomNamesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.dicebearavatars.enabled", havingValue = "true", matchIfMissing = true)
    public DicebearAvatarsClient dicebearavatarsClient(DicebearAvatarsProperties properties) {
        return new DicebearAvatarsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.spanishrandomwords.enabled", havingValue = "true", matchIfMissing = true)
    public SpanishRandomWordsClient spanishrandomwordsClient(SpanishRandomWordsProperties properties) {
        return new SpanishRandomWordsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.generadordni.enabled", havingValue = "true", matchIfMissing = true)
    public GeneradordniClient generadordniClient(GeneradordniProperties properties) {
        return new GeneradordniClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.yesno.enabled", havingValue = "true", matchIfMissing = true)
    public YesNoClient yesnoClient(YesNoProperties properties) {
        return new YesNoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.fakerapi.enabled", havingValue = "true", matchIfMissing = true)
    public FakerapiClient fakerapiClient(FakerapiProperties properties) {
        return new FakerapiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.whatthecommit.enabled", havingValue = "true", matchIfMissing = true)
    public WhatTheCommitClient whatthecommitClient(WhatTheCommitProperties properties) {
        return new WhatTheCommitClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.robohash.enabled", havingValue = "true", matchIfMissing = true)
    public RobohashClient robohashClient(RobohashProperties properties) {
        return new RobohashClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.testdata.fakejson.enabled", havingValue = "true", matchIfMissing = true)
    public FakejsonClient fakejsonClient(FakejsonProperties properties) {
        return new FakejsonClient(properties.getUrl());
    }

}
