package com.bzz.miniapis.sdk.anime;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        AnimechanProperties.class,
        AnilistProperties.class,
        AnimefactsProperties.class,
        DanbooruAnimeProperties.class,
        TraceMoeProperties.class,
        NekosbestProperties.class,
        KitsuProperties.class,
        AnidbProperties.class,
        AnimenewsnetworkProperties.class,
        MyanimelistProperties.class,
        MangadexProperties.class,
        CatboyProperties.class,
        ShikimoriProperties.class,
        MangapiProperties.class,
        JikanProperties.class,
        StudioGhibliProperties.class,
        WaifuPicsProperties.class,
        WaifuImProperties.class,
        AniapiProperties.class
})
public class AnimeAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.animechan.enabled", havingValue = "true", matchIfMissing = true)
    public AnimechanClient animechanClient(AnimechanProperties properties) {
        return new AnimechanClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.anilist.enabled", havingValue = "true", matchIfMissing = true)
    public AnilistClient anilistClient(AnilistProperties properties) {
        return new AnilistClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.animefacts.enabled", havingValue = "true", matchIfMissing = true)
    public AnimefactsClient animefactsClient(AnimefactsProperties properties) {
        return new AnimefactsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.danbooruanime.enabled", havingValue = "true", matchIfMissing = true)
    public DanbooruAnimeClient danbooruanimeClient(DanbooruAnimeProperties properties) {
        return new DanbooruAnimeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.tracemoe.enabled", havingValue = "true", matchIfMissing = true)
    public TraceMoeClient tracemoeClient(TraceMoeProperties properties) {
        return new TraceMoeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.nekosbest.enabled", havingValue = "true", matchIfMissing = true)
    public NekosbestClient nekosbestClient(NekosbestProperties properties) {
        return new NekosbestClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.kitsu.enabled", havingValue = "true", matchIfMissing = true)
    public KitsuClient kitsuClient(KitsuProperties properties) {
        return new KitsuClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.anidb.enabled", havingValue = "true", matchIfMissing = true)
    public AnidbClient anidbClient(AnidbProperties properties) {
        return new AnidbClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.animenewsnetwork.enabled", havingValue = "true", matchIfMissing = true)
    public AnimenewsnetworkClient animenewsnetworkClient(AnimenewsnetworkProperties properties) {
        return new AnimenewsnetworkClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.myanimelist.enabled", havingValue = "true", matchIfMissing = true)
    public MyanimelistClient myanimelistClient(MyanimelistProperties properties) {
        return new MyanimelistClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.mangadex.enabled", havingValue = "true", matchIfMissing = true)
    public MangadexClient mangadexClient(MangadexProperties properties) {
        return new MangadexClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.catboy.enabled", havingValue = "true", matchIfMissing = true)
    public CatboyClient catboyClient(CatboyProperties properties) {
        return new CatboyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.shikimori.enabled", havingValue = "true", matchIfMissing = true)
    public ShikimoriClient shikimoriClient(ShikimoriProperties properties) {
        return new ShikimoriClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.mangapi.enabled", havingValue = "true", matchIfMissing = true)
    public MangapiClient mangapiClient(MangapiProperties properties) {
        return new MangapiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.jikan.enabled", havingValue = "true", matchIfMissing = true)
    public JikanClient jikanClient(JikanProperties properties) {
        return new JikanClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.studioghibli.enabled", havingValue = "true", matchIfMissing = true)
    public StudioGhibliClient studioghibliClient(StudioGhibliProperties properties) {
        return new StudioGhibliClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.waifupics.enabled", havingValue = "true", matchIfMissing = true)
    public WaifuPicsClient waifupicsClient(WaifuPicsProperties properties) {
        return new WaifuPicsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.waifuim.enabled", havingValue = "true", matchIfMissing = true)
    public WaifuImClient waifuimClient(WaifuImProperties properties) {
        return new WaifuImClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.anime.aniapi.enabled", havingValue = "true", matchIfMissing = true)
    public AniapiClient aniapiClient(AniapiProperties properties) {
        return new AniapiClient(properties.getUrl());
    }

}
