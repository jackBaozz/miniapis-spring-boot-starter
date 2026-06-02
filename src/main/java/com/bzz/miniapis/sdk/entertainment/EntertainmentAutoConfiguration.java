package com.bzz.miniapis.sdk.entertainment;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        CorporateBuzzWordsProperties.class,
        NamomemesProperties.class,
        YoMommaJokesProperties.class,
        TechyProperties.class,
        ImgflipProperties.class,
        JustmemeWtfProperties.class,
        AnycrapProperties.class,
        MemeMakerProperties.class,
        ExcuserProperties.class,
        ChucknorrisIoProperties.class,
        MemesioProperties.class,
        TastediveProperties.class,
        RandomUselessFactsProperties.class,
        FunFactProperties.class
})
public class EntertainmentAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.corporatebuzzwords.enabled", havingValue = "true", matchIfMissing = true)
    public CorporateBuzzWordsClient corporatebuzzwordsClient(CorporateBuzzWordsProperties properties) {
        return new CorporateBuzzWordsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.namomemes.enabled", havingValue = "true", matchIfMissing = true)
    public NamomemesClient namomemesClient(NamomemesProperties properties) {
        return new NamomemesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.yomommajokes.enabled", havingValue = "true", matchIfMissing = true)
    public YoMommaJokesClient yomommajokesClient(YoMommaJokesProperties properties) {
        return new YoMommaJokesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.techy.enabled", havingValue = "true", matchIfMissing = true)
    public TechyClient techyClient(TechyProperties properties) {
        return new TechyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.imgflip.enabled", havingValue = "true", matchIfMissing = true)
    public ImgflipClient imgflipClient(ImgflipProperties properties) {
        return new ImgflipClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.justmemewtf.enabled", havingValue = "true", matchIfMissing = true)
    public JustmemeWtfClient justmemewtfClient(JustmemeWtfProperties properties) {
        return new JustmemeWtfClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.anycrap.enabled", havingValue = "true", matchIfMissing = true)
    public AnycrapClient anycrapClient(AnycrapProperties properties) {
        return new AnycrapClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.mememaker.enabled", havingValue = "true", matchIfMissing = true)
    public MemeMakerClient mememakerClient(MemeMakerProperties properties) {
        return new MemeMakerClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.excuser.enabled", havingValue = "true", matchIfMissing = true)
    public ExcuserClient excuserClient(ExcuserProperties properties) {
        return new ExcuserClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.chucknorrisio.enabled", havingValue = "true", matchIfMissing = true)
    public ChucknorrisIoClient chucknorrisioClient(ChucknorrisIoProperties properties) {
        return new ChucknorrisIoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.memesio.enabled", havingValue = "true", matchIfMissing = true)
    public MemesioClient memesioClient(MemesioProperties properties) {
        return new MemesioClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.tastedive.enabled", havingValue = "true", matchIfMissing = true)
    public TastediveClient tastediveClient(TastediveProperties properties) {
        return new TastediveClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.randomuselessfacts.enabled", havingValue = "true", matchIfMissing = true)
    public RandomUselessFactsClient randomuselessfactsClient(RandomUselessFactsProperties properties) {
        return new RandomUselessFactsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.funfact.enabled", havingValue = "true", matchIfMissing = true)
    public FunFactClient funfactClient(FunFactProperties properties) {
        return new FunFactClient(properties.getUrl());
    }

}
