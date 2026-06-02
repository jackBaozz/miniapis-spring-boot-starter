package com.bzz.miniapis.sdk.dictionaries;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        ChineseTextProjectProperties.class,
        CollinsProperties.class,
        MerriamWebsterProperties.class,
        OwlbotProperties.class,
        FreeDictionaryProperties.class,
        WordnikProperties.class,
        SynonymsProperties.class,
        ChineseCharacterWebProperties.class,
        WiktionaryProperties.class,
        LinguaRobotProperties.class,
        IndonesiaDictionaryProperties.class,
        WordsProperties.class,
        OxfordProperties.class
})
public class DictionariesAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.chinesetextproject.enabled", havingValue = "true", matchIfMissing = true)
    public ChineseTextProjectClient chinesetextprojectClient(ChineseTextProjectProperties properties) {
        return new ChineseTextProjectClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.collins.enabled", havingValue = "true", matchIfMissing = true)
    public CollinsClient collinsClient(CollinsProperties properties) {
        return new CollinsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.merriamwebster.enabled", havingValue = "true", matchIfMissing = true)
    public MerriamWebsterClient merriamwebsterClient(MerriamWebsterProperties properties) {
        return new MerriamWebsterClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.owlbot.enabled", havingValue = "true", matchIfMissing = true)
    public OwlbotClient owlbotClient(OwlbotProperties properties) {
        return new OwlbotClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.freedictionary.enabled", havingValue = "true", matchIfMissing = true)
    public FreeDictionaryClient freedictionaryClient(FreeDictionaryProperties properties) {
        return new FreeDictionaryClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.wordnik.enabled", havingValue = "true", matchIfMissing = true)
    public WordnikClient wordnikClient(WordnikProperties properties) {
        return new WordnikClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.synonyms.enabled", havingValue = "true", matchIfMissing = true)
    public SynonymsClient synonymsClient(SynonymsProperties properties) {
        return new SynonymsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.chinesecharacterweb.enabled", havingValue = "true", matchIfMissing = true)
    public ChineseCharacterWebClient chinesecharacterwebClient(ChineseCharacterWebProperties properties) {
        return new ChineseCharacterWebClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.wiktionary.enabled", havingValue = "true", matchIfMissing = true)
    public WiktionaryClient wiktionaryClient(WiktionaryProperties properties) {
        return new WiktionaryClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.linguarobot.enabled", havingValue = "true", matchIfMissing = true)
    public LinguaRobotClient linguarobotClient(LinguaRobotProperties properties) {
        return new LinguaRobotClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.indonesiadictionary.enabled", havingValue = "true", matchIfMissing = true)
    public IndonesiaDictionaryClient indonesiadictionaryClient(IndonesiaDictionaryProperties properties) {
        return new IndonesiaDictionaryClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.words.enabled", havingValue = "true", matchIfMissing = true)
    public WordsClient wordsClient(WordsProperties properties) {
        return new WordsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.dictionaries.oxford.enabled", havingValue = "true", matchIfMissing = true)
    public OxfordClient oxfordClient(OxfordProperties properties) {
        return new OxfordClient(properties.getUrl());
    }

}
