package com.bzz.miniapis.sdk.news;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        FeedbinProperties.class,
        FloridaManProperties.class,
        InshortsNewsProperties.class,
        TheOldReaderProperties.class,
        NewYorkTimesProperties.class,
        NewsProperties.class,
        SpaceflightNewsProperties.class,
        GnewsProperties.class,
        AssociatedPressProperties.class,
        TroveProperties.class,
        MediastackProperties.class,
        NewsxProperties.class,
        CurrentsProperties.class,
        ChroniclingAmericaProperties.class,
        MarketauxProperties.class,
        NewsdataProperties.class,
        ThenewsProperties.class,
        TheGuardianProperties.class
})
public class NewsAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.feedbin.enabled", havingValue = "true", matchIfMissing = true)
    public FeedbinClient feedbinClient(FeedbinProperties properties) {
        return new FeedbinClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.floridaman.enabled", havingValue = "true", matchIfMissing = true)
    public FloridaManClient floridamanClient(FloridaManProperties properties) {
        return new FloridaManClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.inshortsnews.enabled", havingValue = "true", matchIfMissing = true)
    public InshortsNewsClient inshortsnewsClient(InshortsNewsProperties properties) {
        return new InshortsNewsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.theoldreader.enabled", havingValue = "true", matchIfMissing = true)
    public TheOldReaderClient theoldreaderClient(TheOldReaderProperties properties) {
        return new TheOldReaderClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.newyorktimes.enabled", havingValue = "true", matchIfMissing = true)
    public NewYorkTimesClient newyorktimesClient(NewYorkTimesProperties properties) {
        return new NewYorkTimesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.news.enabled", havingValue = "true", matchIfMissing = true)
    public NewsClient newsClient(NewsProperties properties) {
        return new NewsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.spaceflightnews.enabled", havingValue = "true", matchIfMissing = true)
    public SpaceflightNewsClient spaceflightnewsClient(SpaceflightNewsProperties properties) {
        return new SpaceflightNewsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.gnews.enabled", havingValue = "true", matchIfMissing = true)
    public GnewsClient gnewsClient(GnewsProperties properties) {
        return new GnewsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.associatedpress.enabled", havingValue = "true", matchIfMissing = true)
    public AssociatedPressClient associatedpressClient(AssociatedPressProperties properties) {
        return new AssociatedPressClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.trove.enabled", havingValue = "true", matchIfMissing = true)
    public TroveClient troveClient(TroveProperties properties) {
        return new TroveClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.mediastack.enabled", havingValue = "true", matchIfMissing = true)
    public MediastackClient mediastackClient(MediastackProperties properties) {
        return new MediastackClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.newsx.enabled", havingValue = "true", matchIfMissing = true)
    public NewsxClient newsxClient(NewsxProperties properties) {
        return new NewsxClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.currents.enabled", havingValue = "true", matchIfMissing = true)
    public CurrentsClient currentsClient(CurrentsProperties properties) {
        return new CurrentsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.chroniclingamerica.enabled", havingValue = "true", matchIfMissing = true)
    public ChroniclingAmericaClient chroniclingamericaClient(ChroniclingAmericaProperties properties) {
        return new ChroniclingAmericaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.marketaux.enabled", havingValue = "true", matchIfMissing = true)
    public MarketauxClient marketauxClient(MarketauxProperties properties) {
        return new MarketauxClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.newsdata.enabled", havingValue = "true", matchIfMissing = true)
    public NewsdataClient newsdataClient(NewsdataProperties properties) {
        return new NewsdataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.thenews.enabled", havingValue = "true", matchIfMissing = true)
    public ThenewsClient thenewsClient(ThenewsProperties properties) {
        return new ThenewsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.news.theguardian.enabled", havingValue = "true", matchIfMissing = true)
    public TheGuardianClient theguardianClient(TheGuardianProperties properties) {
        return new TheGuardianClient(properties.getUrl());
    }

}
