package com.bzz.miniapis.sdk.news;

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
        MediastackProperties.class,
        AssociatedPressProperties.class,
        ChroniclingAmericaProperties.class,
        CurrentsProperties.class,
        FeedbinProperties.class,
        FloridaManProperties.class,
        GnewsProperties.class,
        GraphsForCoronavirusProperties.class,
        InshortsNewsProperties.class,
        MarketauxProperties.class,
        NewYorkTimesProperties.class,
        NewsProperties.class,
        NewsdataProperties.class,
        NewsxProperties.class,
        NprOneProperties.class,
        SpaceflightNewsProperties.class,
        TheGuardianProperties.class,
        TheOldReaderProperties.class,
        ThenewsProperties.class,
        TroveProperties.class
})
public class NewsAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.mediastack.enabled", havingValue = "true", matchIfMissing = true)
    public MediastackClient mediastackClient(MediastackProperties properties) {
        return createClient(MediastackClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.associatedpress.enabled", havingValue = "true", matchIfMissing = true)
    public AssociatedPressClient associatedpressClient(AssociatedPressProperties properties) {
        return createClient(AssociatedPressClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.chroniclingamerica.enabled", havingValue = "true", matchIfMissing = true)
    public ChroniclingAmericaClient chroniclingamericaClient(ChroniclingAmericaProperties properties) {
        return createClient(ChroniclingAmericaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.currents.enabled", havingValue = "true", matchIfMissing = true)
    public CurrentsClient currentsClient(CurrentsProperties properties) {
        return createClient(CurrentsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.feedbin.enabled", havingValue = "true", matchIfMissing = true)
    public FeedbinClient feedbinClient(FeedbinProperties properties) {
        return createClient(FeedbinClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.floridaman.enabled", havingValue = "true", matchIfMissing = true)
    public FloridaManClient floridamanClient(FloridaManProperties properties) {
        return createClient(FloridaManClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.gnews.enabled", havingValue = "true", matchIfMissing = true)
    public GnewsClient gnewsClient(GnewsProperties properties) {
        return createClient(GnewsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.graphsforcoronavirus.enabled", havingValue = "true", matchIfMissing = true)
    public GraphsForCoronavirusClient graphsforcoronavirusClient(GraphsForCoronavirusProperties properties) {
        return createClient(GraphsForCoronavirusClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.inshortsnews.enabled", havingValue = "true", matchIfMissing = true)
    public InshortsNewsClient inshortsnewsClient(InshortsNewsProperties properties) {
        return createClient(InshortsNewsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.marketaux.enabled", havingValue = "true", matchIfMissing = true)
    public MarketauxClient marketauxClient(MarketauxProperties properties) {
        return createClient(MarketauxClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.newyorktimes.enabled", havingValue = "true", matchIfMissing = true)
    public NewYorkTimesClient newyorktimesClient(NewYorkTimesProperties properties) {
        return createClient(NewYorkTimesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.news.enabled", havingValue = "true", matchIfMissing = true)
    public NewsClient newsClient(NewsProperties properties) {
        return createClient(NewsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.newsdata.enabled", havingValue = "true", matchIfMissing = true)
    public NewsdataClient newsdataClient(NewsdataProperties properties) {
        return createClient(NewsdataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.newsx.enabled", havingValue = "true", matchIfMissing = true)
    public NewsxClient newsxClient(NewsxProperties properties) {
        return createClient(NewsxClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.nprone.enabled", havingValue = "true", matchIfMissing = true)
    public NprOneClient nproneClient(NprOneProperties properties) {
        return createClient(NprOneClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.spaceflightnews.enabled", havingValue = "true", matchIfMissing = true)
    public SpaceflightNewsClient spaceflightnewsClient(SpaceflightNewsProperties properties) {
        return createClient(SpaceflightNewsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.theguardian.enabled", havingValue = "true", matchIfMissing = true)
    public TheGuardianClient theguardianClient(TheGuardianProperties properties) {
        return createClient(TheGuardianClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.theoldreader.enabled", havingValue = "true", matchIfMissing = true)
    public TheOldReaderClient theoldreaderClient(TheOldReaderProperties properties) {
        return createClient(TheOldReaderClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.thenews.enabled", havingValue = "true", matchIfMissing = true)
    public ThenewsClient thenewsClient(ThenewsProperties properties) {
        return createClient(ThenewsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.trove.enabled", havingValue = "true", matchIfMissing = true)
    public TroveClient troveClient(TroveProperties properties) {
        return createClient(TroveClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
