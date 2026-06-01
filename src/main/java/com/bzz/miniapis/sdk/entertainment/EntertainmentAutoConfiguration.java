package com.bzz.miniapis.sdk.entertainment;

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
        AnycrapProperties.class,
        ChucknorrisIoProperties.class,
        CorporateBuzzWordsProperties.class,
        ExcuserProperties.class,
        FunFactProperties.class,
        ImgflipProperties.class,
        JustmemeWtfProperties.class,
        MemeMakerProperties.class,
        MemesioProperties.class,
        NamomemesProperties.class,
        RandomUselessFactsProperties.class,
        TastediveProperties.class,
        TechyProperties.class,
        YoMommaJokesProperties.class
})
public class EntertainmentAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.anycrap.enabled", havingValue = "true", matchIfMissing = true)
    public AnycrapClient anycrapClient(AnycrapProperties properties) {
        return createClient(AnycrapClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.chucknorrisio.enabled", havingValue = "true", matchIfMissing = true)
    public ChucknorrisIoClient chucknorrisioClient(ChucknorrisIoProperties properties) {
        return createClient(ChucknorrisIoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.corporatebuzzwords.enabled", havingValue = "true", matchIfMissing = true)
    public CorporateBuzzWordsClient corporatebuzzwordsClient(CorporateBuzzWordsProperties properties) {
        return createClient(CorporateBuzzWordsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.excuser.enabled", havingValue = "true", matchIfMissing = true)
    public ExcuserClient excuserClient(ExcuserProperties properties) {
        return createClient(ExcuserClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.funfact.enabled", havingValue = "true", matchIfMissing = true)
    public FunFactClient funfactClient(FunFactProperties properties) {
        return createClient(FunFactClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.imgflip.enabled", havingValue = "true", matchIfMissing = true)
    public ImgflipClient imgflipClient(ImgflipProperties properties) {
        return createClient(ImgflipClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.justmemewtf.enabled", havingValue = "true", matchIfMissing = true)
    public JustmemeWtfClient justmemewtfClient(JustmemeWtfProperties properties) {
        return createClient(JustmemeWtfClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.mememaker.enabled", havingValue = "true", matchIfMissing = true)
    public MemeMakerClient mememakerClient(MemeMakerProperties properties) {
        return createClient(MemeMakerClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.memesio.enabled", havingValue = "true", matchIfMissing = true)
    public MemesioClient memesioClient(MemesioProperties properties) {
        return createClient(MemesioClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.namomemes.enabled", havingValue = "true", matchIfMissing = true)
    public NamomemesClient namomemesClient(NamomemesProperties properties) {
        return createClient(NamomemesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.randomuselessfacts.enabled", havingValue = "true", matchIfMissing = true)
    public RandomUselessFactsClient randomuselessfactsClient(RandomUselessFactsProperties properties) {
        return createClient(RandomUselessFactsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.tastedive.enabled", havingValue = "true", matchIfMissing = true)
    public TastediveClient tastediveClient(TastediveProperties properties) {
        return createClient(TastediveClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.techy.enabled", havingValue = "true", matchIfMissing = true)
    public TechyClient techyClient(TechyProperties properties) {
        return createClient(TechyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.entertainment.yomommajokes.enabled", havingValue = "true", matchIfMissing = true)
    public YoMommaJokesClient yomommajokesClient(YoMommaJokesProperties properties) {
        return createClient(YoMommaJokesClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
