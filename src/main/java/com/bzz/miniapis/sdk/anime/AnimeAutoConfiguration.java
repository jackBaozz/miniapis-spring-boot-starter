package com.bzz.miniapis.sdk.anime;

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
        AniapiProperties.class,
        AnidbProperties.class,
        AnilistProperties.class,
        AnimechanProperties.class,
        AnimefactsProperties.class,
        AnimenewsnetworkProperties.class,
        CatboyProperties.class,
        DanbooruAnimeProperties.class,
        JikanProperties.class,
        KitsuProperties.class,
        MangadexProperties.class,
        MangapiProperties.class,
        MyanimelistProperties.class,
        NekosbestProperties.class,
        ShikimoriProperties.class,
        StudioGhibliProperties.class,
        TraceMoeProperties.class,
        WaifuImProperties.class,
        WaifuPicsProperties.class
})
public class AnimeAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.aniapi.enabled", havingValue = "true", matchIfMissing = true)
    public AniapiClient aniapiClient(AniapiProperties properties) {
        return createClient(AniapiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.anidb.enabled", havingValue = "true", matchIfMissing = true)
    public AnidbClient anidbClient(AnidbProperties properties) {
        return createClient(AnidbClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.anilist.enabled", havingValue = "true", matchIfMissing = true)
    public AnilistClient anilistClient(AnilistProperties properties) {
        return createClient(AnilistClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.animechan.enabled", havingValue = "true", matchIfMissing = true)
    public AnimechanClient animechanClient(AnimechanProperties properties) {
        return createClient(AnimechanClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.animefacts.enabled", havingValue = "true", matchIfMissing = true)
    public AnimefactsClient animefactsClient(AnimefactsProperties properties) {
        return createClient(AnimefactsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.animenewsnetwork.enabled", havingValue = "true", matchIfMissing = true)
    public AnimenewsnetworkClient animenewsnetworkClient(AnimenewsnetworkProperties properties) {
        return createClient(AnimenewsnetworkClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.catboy.enabled", havingValue = "true", matchIfMissing = true)
    public CatboyClient catboyClient(CatboyProperties properties) {
        return createClient(CatboyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.danbooruanime.enabled", havingValue = "true", matchIfMissing = true)
    public DanbooruAnimeClient danbooruanimeClient(DanbooruAnimeProperties properties) {
        return createClient(DanbooruAnimeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.jikan.enabled", havingValue = "true", matchIfMissing = true)
    public JikanClient jikanClient(JikanProperties properties) {
        return createClient(JikanClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.kitsu.enabled", havingValue = "true", matchIfMissing = true)
    public KitsuClient kitsuClient(KitsuProperties properties) {
        return createClient(KitsuClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.mangadex.enabled", havingValue = "true", matchIfMissing = true)
    public MangadexClient mangadexClient(MangadexProperties properties) {
        return createClient(MangadexClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.mangapi.enabled", havingValue = "true", matchIfMissing = true)
    public MangapiClient mangapiClient(MangapiProperties properties) {
        return createClient(MangapiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.myanimelist.enabled", havingValue = "true", matchIfMissing = true)
    public MyanimelistClient myanimelistClient(MyanimelistProperties properties) {
        return createClient(MyanimelistClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.nekosbest.enabled", havingValue = "true", matchIfMissing = true)
    public NekosbestClient nekosbestClient(NekosbestProperties properties) {
        return createClient(NekosbestClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.shikimori.enabled", havingValue = "true", matchIfMissing = true)
    public ShikimoriClient shikimoriClient(ShikimoriProperties properties) {
        return createClient(ShikimoriClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.studioghibli.enabled", havingValue = "true", matchIfMissing = true)
    public StudioGhibliClient studioghibliClient(StudioGhibliProperties properties) {
        return createClient(StudioGhibliClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.tracemoe.enabled", havingValue = "true", matchIfMissing = true)
    public TraceMoeClient tracemoeClient(TraceMoeProperties properties) {
        return createClient(TraceMoeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.waifuim.enabled", havingValue = "true", matchIfMissing = true)
    public WaifuImClient waifuimClient(WaifuImProperties properties) {
        return createClient(WaifuImClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.waifupics.enabled", havingValue = "true", matchIfMissing = true)
    public WaifuPicsClient waifupicsClient(WaifuPicsProperties properties) {
        return createClient(WaifuPicsClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
