package com.bzz.miniapis.sdk.video;

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
        AnApiOfIceAndFireProperties.class,
        BobSBurgersProperties.class,
        BreakingBadProperties.class,
        BreakingBadQuotesProperties.class,
        CatalogopolisProperties.class,
        CatchTheShowProperties.class,
        CzechTelevisionProperties.class,
        DailymotionProperties.class,
        DuneProperties.class,
        FinalSpaceProperties.class,
        GameOfThronesQuotesProperties.class,
        HarryPotterCharactesProperties.class,
        HyperserveProperties.class,
        ImdbApiProperties.class,
        ImdbotProperties.class,
        Json2VideoProperties.class,
        LuciferQuotesProperties.class,
        McuCountdownProperties.class,
        MotivationalQuotesProperties.class,
        MovieQuoteProperties.class,
        OpenMovieDatabaseProperties.class,
        OwenWilsonWowProperties.class,
        RonSwansonQuotesProperties.class,
        SimklProperties.class,
        StapiProperties.class,
        StrangerThingsQuotesProperties.class,
        StreamProperties.class,
        StrombergQuotesProperties.class,
        SwapiProperties.class,
        SwapiProperties.class,
        SwapiGraphqlProperties.class,
        TheLordOfTheRingsProperties.class,
        TheVampireDiariesProperties.class,
        ThronesapiProperties.class,
        TmdbProperties.class,
        TraileraddictProperties.class,
        TraktProperties.class,
        TvdbProperties.class,
        TvmazeProperties.class,
        UnogsProperties.class,
        VimeoProperties.class,
        WatchmodeProperties.class,
        WebSeriesQuotesGeneratorProperties.class,
        YoutubeProperties.class
})
public class VideoAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.anapioficeandfire.enabled", havingValue = "true", matchIfMissing = true)
    public AnApiOfIceAndFireClient anapioficeandfireClient(AnApiOfIceAndFireProperties properties) {
        return createClient(AnApiOfIceAndFireClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.bobsburgers.enabled", havingValue = "true", matchIfMissing = true)
    public BobSBurgersClient bobsburgersClient(BobSBurgersProperties properties) {
        return createClient(BobSBurgersClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.breakingbad.enabled", havingValue = "true", matchIfMissing = true)
    public BreakingBadClient breakingbadClient(BreakingBadProperties properties) {
        return createClient(BreakingBadClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.breakingbadquotes.enabled", havingValue = "true", matchIfMissing = true)
    public BreakingBadQuotesClient breakingbadquotesClient(BreakingBadQuotesProperties properties) {
        return createClient(BreakingBadQuotesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.catalogopolis.enabled", havingValue = "true", matchIfMissing = true)
    public CatalogopolisClient catalogopolisClient(CatalogopolisProperties properties) {
        return createClient(CatalogopolisClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.catchtheshow.enabled", havingValue = "true", matchIfMissing = true)
    public CatchTheShowClient catchtheshowClient(CatchTheShowProperties properties) {
        return createClient(CatchTheShowClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.czechtelevision.enabled", havingValue = "true", matchIfMissing = true)
    public CzechTelevisionClient czechtelevisionClient(CzechTelevisionProperties properties) {
        return createClient(CzechTelevisionClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.dailymotion.enabled", havingValue = "true", matchIfMissing = true)
    public DailymotionClient dailymotionClient(DailymotionProperties properties) {
        return createClient(DailymotionClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.dune.enabled", havingValue = "true", matchIfMissing = true)
    public DuneClient duneClient(DuneProperties properties) {
        return createClient(DuneClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.finalspace.enabled", havingValue = "true", matchIfMissing = true)
    public FinalSpaceClient finalspaceClient(FinalSpaceProperties properties) {
        return createClient(FinalSpaceClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.gameofthronesquotes.enabled", havingValue = "true", matchIfMissing = true)
    public GameOfThronesQuotesClient gameofthronesquotesClient(GameOfThronesQuotesProperties properties) {
        return createClient(GameOfThronesQuotesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.harrypottercharactes.enabled", havingValue = "true", matchIfMissing = true)
    public HarryPotterCharactesClient harrypottercharactesClient(HarryPotterCharactesProperties properties) {
        return createClient(HarryPotterCharactesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.hyperserve.enabled", havingValue = "true", matchIfMissing = true)
    public HyperserveClient hyperserveClient(HyperserveProperties properties) {
        return createClient(HyperserveClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.imdbapi.enabled", havingValue = "true", matchIfMissing = true)
    public ImdbApiClient imdbapiClient(ImdbApiProperties properties) {
        return createClient(ImdbApiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.imdbot.enabled", havingValue = "true", matchIfMissing = true)
    public ImdbotClient imdbotClient(ImdbotProperties properties) {
        return createClient(ImdbotClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.json2video.enabled", havingValue = "true", matchIfMissing = true)
    public Json2VideoClient json2videoClient(Json2VideoProperties properties) {
        return createClient(Json2VideoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.luciferquotes.enabled", havingValue = "true", matchIfMissing = true)
    public LuciferQuotesClient luciferquotesClient(LuciferQuotesProperties properties) {
        return createClient(LuciferQuotesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.mcucountdown.enabled", havingValue = "true", matchIfMissing = true)
    public McuCountdownClient mcucountdownClient(McuCountdownProperties properties) {
        return createClient(McuCountdownClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.motivationalquotes.enabled", havingValue = "true", matchIfMissing = true)
    public MotivationalQuotesClient motivationalquotesClient(MotivationalQuotesProperties properties) {
        return createClient(MotivationalQuotesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.moviequote.enabled", havingValue = "true", matchIfMissing = true)
    public MovieQuoteClient moviequoteClient(MovieQuoteProperties properties) {
        return createClient(MovieQuoteClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.openmoviedatabase.enabled", havingValue = "true", matchIfMissing = true)
    public OpenMovieDatabaseClient openmoviedatabaseClient(OpenMovieDatabaseProperties properties) {
        return createClient(OpenMovieDatabaseClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.owenwilsonwow.enabled", havingValue = "true", matchIfMissing = true)
    public OwenWilsonWowClient owenwilsonwowClient(OwenWilsonWowProperties properties) {
        return createClient(OwenWilsonWowClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.ronswansonquotes.enabled", havingValue = "true", matchIfMissing = true)
    public RonSwansonQuotesClient ronswansonquotesClient(RonSwansonQuotesProperties properties) {
        return createClient(RonSwansonQuotesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.simkl.enabled", havingValue = "true", matchIfMissing = true)
    public SimklClient simklClient(SimklProperties properties) {
        return createClient(SimklClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.stapi.enabled", havingValue = "true", matchIfMissing = true)
    public StapiClient stapiClient(StapiProperties properties) {
        return createClient(StapiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.strangerthingsquotes.enabled", havingValue = "true", matchIfMissing = true)
    public StrangerThingsQuotesClient strangerthingsquotesClient(StrangerThingsQuotesProperties properties) {
        return createClient(StrangerThingsQuotesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.stream.enabled", havingValue = "true", matchIfMissing = true)
    public StreamClient streamClient(StreamProperties properties) {
        return createClient(StreamClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.strombergquotes.enabled", havingValue = "true", matchIfMissing = true)
    public StrombergQuotesClient strombergquotesClient(StrombergQuotesProperties properties) {
        return createClient(StrombergQuotesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.swapi.enabled", havingValue = "true", matchIfMissing = true)
    public SwapiClient swapiClient(SwapiProperties properties) {
        return createClient(SwapiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.swapi2.enabled", havingValue = "true", matchIfMissing = true)
    public SwapiClient swapi2Client(SwapiProperties properties) {
        return createClient(SwapiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.swapigraphql.enabled", havingValue = "true", matchIfMissing = true)
    public SwapiGraphqlClient swapigraphqlClient(SwapiGraphqlProperties properties) {
        return createClient(SwapiGraphqlClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.thelordoftherings.enabled", havingValue = "true", matchIfMissing = true)
    public TheLordOfTheRingsClient thelordoftheringsClient(TheLordOfTheRingsProperties properties) {
        return createClient(TheLordOfTheRingsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.thevampirediaries.enabled", havingValue = "true", matchIfMissing = true)
    public TheVampireDiariesClient thevampirediariesClient(TheVampireDiariesProperties properties) {
        return createClient(TheVampireDiariesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.thronesapi.enabled", havingValue = "true", matchIfMissing = true)
    public ThronesapiClient thronesapiClient(ThronesapiProperties properties) {
        return createClient(ThronesapiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.tmdb.enabled", havingValue = "true", matchIfMissing = true)
    public TmdbClient tmdbClient(TmdbProperties properties) {
        return createClient(TmdbClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.traileraddict.enabled", havingValue = "true", matchIfMissing = true)
    public TraileraddictClient traileraddictClient(TraileraddictProperties properties) {
        return createClient(TraileraddictClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.trakt.enabled", havingValue = "true", matchIfMissing = true)
    public TraktClient traktClient(TraktProperties properties) {
        return createClient(TraktClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.tvdb.enabled", havingValue = "true", matchIfMissing = true)
    public TvdbClient tvdbClient(TvdbProperties properties) {
        return createClient(TvdbClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.tvmaze.enabled", havingValue = "true", matchIfMissing = true)
    public TvmazeClient tvmazeClient(TvmazeProperties properties) {
        return createClient(TvmazeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.unogs.enabled", havingValue = "true", matchIfMissing = true)
    public UnogsClient unogsClient(UnogsProperties properties) {
        return createClient(UnogsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.vimeo.enabled", havingValue = "true", matchIfMissing = true)
    public VimeoClient vimeoClient(VimeoProperties properties) {
        return createClient(VimeoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.watchmode.enabled", havingValue = "true", matchIfMissing = true)
    public WatchmodeClient watchmodeClient(WatchmodeProperties properties) {
        return createClient(WatchmodeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.webseriesquotesgenerator.enabled", havingValue = "true", matchIfMissing = true)
    public WebSeriesQuotesGeneratorClient webseriesquotesgeneratorClient(WebSeriesQuotesGeneratorProperties properties) {
        return createClient(WebSeriesQuotesGeneratorClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.youtube.enabled", havingValue = "true", matchIfMissing = true)
    public YoutubeClient youtubeClient(YoutubeProperties properties) {
        return createClient(YoutubeClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
