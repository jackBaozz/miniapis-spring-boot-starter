package com.bzz.miniapis.sdk.dictionaries;

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
        ChineseCharacterWebProperties.class,
        ChineseTextProjectProperties.class,
        CollinsProperties.class,
        FreeDictionaryProperties.class,
        IndonesiaDictionaryProperties.class,
        LinguaRobotProperties.class,
        MerriamWebsterProperties.class,
        OwlbotProperties.class,
        OxfordProperties.class,
        SynonymsProperties.class,
        WiktionaryProperties.class,
        WordnikProperties.class,
        WordsProperties.class
})
public class DictionariesAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.chinesecharacterweb.enabled", havingValue = "true", matchIfMissing = true)
    public ChineseCharacterWebClient chinesecharacterwebClient(ChineseCharacterWebProperties properties) {
        return createClient(ChineseCharacterWebClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.chinesetextproject.enabled", havingValue = "true", matchIfMissing = true)
    public ChineseTextProjectClient chinesetextprojectClient(ChineseTextProjectProperties properties) {
        return createClient(ChineseTextProjectClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.collins.enabled", havingValue = "true", matchIfMissing = true)
    public CollinsClient collinsClient(CollinsProperties properties) {
        return createClient(CollinsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.freedictionary.enabled", havingValue = "true", matchIfMissing = true)
    public FreeDictionaryClient freedictionaryClient(FreeDictionaryProperties properties) {
        return createClient(FreeDictionaryClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.indonesiadictionary.enabled", havingValue = "true", matchIfMissing = true)
    public IndonesiaDictionaryClient indonesiadictionaryClient(IndonesiaDictionaryProperties properties) {
        return createClient(IndonesiaDictionaryClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.linguarobot.enabled", havingValue = "true", matchIfMissing = true)
    public LinguaRobotClient linguarobotClient(LinguaRobotProperties properties) {
        return createClient(LinguaRobotClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.merriamwebster.enabled", havingValue = "true", matchIfMissing = true)
    public MerriamWebsterClient merriamwebsterClient(MerriamWebsterProperties properties) {
        return createClient(MerriamWebsterClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.owlbot.enabled", havingValue = "true", matchIfMissing = true)
    public OwlbotClient owlbotClient(OwlbotProperties properties) {
        return createClient(OwlbotClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.oxford.enabled", havingValue = "true", matchIfMissing = true)
    public OxfordClient oxfordClient(OxfordProperties properties) {
        return createClient(OxfordClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.synonyms.enabled", havingValue = "true", matchIfMissing = true)
    public SynonymsClient synonymsClient(SynonymsProperties properties) {
        return createClient(SynonymsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.wiktionary.enabled", havingValue = "true", matchIfMissing = true)
    public WiktionaryClient wiktionaryClient(WiktionaryProperties properties) {
        return createClient(WiktionaryClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.wordnik.enabled", havingValue = "true", matchIfMissing = true)
    public WordnikClient wordnikClient(WordnikProperties properties) {
        return createClient(WordnikClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.words.enabled", havingValue = "true", matchIfMissing = true)
    public WordsClient wordsClient(WordsProperties properties) {
        return createClient(WordsClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
