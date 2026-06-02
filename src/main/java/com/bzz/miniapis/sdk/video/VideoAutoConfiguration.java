package com.bzz.miniapis.sdk.video;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        BreakingBadQuotesProperties.class,
        AnApiOfIceAndFireProperties.class,
        DuneProperties.class,
        ImdbotProperties.class,
        McuCountdownProperties.class,
        LuciferQuotesProperties.class,
        MovieQuoteProperties.class,
        StrangerThingsQuotesProperties.class,
        RonSwansonQuotesProperties.class,
        FinalSpaceProperties.class,
        HarryPotterCharactesProperties.class,
        OpenMovieDatabaseProperties.class,
        CatchTheShowProperties.class,
        SimklProperties.class,
        TvdbProperties.class,
        WebSeriesQuotesGeneratorProperties.class,
        Json2VideoProperties.class,
        UnogsProperties.class,
        GameOfThronesQuotesProperties.class,
        TraileraddictProperties.class,
        YoutubeProperties.class,
        TraktProperties.class,
        HyperserveProperties.class,
        TheVampireDiariesProperties.class,
        SwapiGraphqlProperties.class,
        OwenWilsonWowProperties.class,
        MotivationalQuotesProperties.class,
        WatchmodeProperties.class,
        VimeoProperties.class,
        TheLordOfTheRingsProperties.class,
        SwapiProperties.class,
        StapiProperties.class,
        TmdbProperties.class,
        StreamProperties.class,
        TvmazeProperties.class,
        ThronesapiProperties.class,
        Swapi2Properties.class,
        StrombergQuotesProperties.class,
        DailymotionProperties.class
})
public class VideoAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.breakingbadquotes.enabled", havingValue = "true", matchIfMissing = true)
    public BreakingBadQuotesClient breakingbadquotesClient(BreakingBadQuotesProperties properties) {
        return new BreakingBadQuotesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.anapioficeandfire.enabled", havingValue = "true", matchIfMissing = true)
    public AnApiOfIceAndFireClient anapioficeandfireClient(AnApiOfIceAndFireProperties properties) {
        return new AnApiOfIceAndFireClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.dune.enabled", havingValue = "true", matchIfMissing = true)
    public DuneClient duneClient(DuneProperties properties) {
        return new DuneClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.imdbot.enabled", havingValue = "true", matchIfMissing = true)
    public ImdbotClient imdbotClient(ImdbotProperties properties) {
        return new ImdbotClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.mcucountdown.enabled", havingValue = "true", matchIfMissing = true)
    public McuCountdownClient mcucountdownClient(McuCountdownProperties properties) {
        return new McuCountdownClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.luciferquotes.enabled", havingValue = "true", matchIfMissing = true)
    public LuciferQuotesClient luciferquotesClient(LuciferQuotesProperties properties) {
        return new LuciferQuotesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.moviequote.enabled", havingValue = "true", matchIfMissing = true)
    public MovieQuoteClient moviequoteClient(MovieQuoteProperties properties) {
        return new MovieQuoteClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.strangerthingsquotes.enabled", havingValue = "true", matchIfMissing = true)
    public StrangerThingsQuotesClient strangerthingsquotesClient(StrangerThingsQuotesProperties properties) {
        return new StrangerThingsQuotesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.ronswansonquotes.enabled", havingValue = "true", matchIfMissing = true)
    public RonSwansonQuotesClient ronswansonquotesClient(RonSwansonQuotesProperties properties) {
        return new RonSwansonQuotesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.finalspace.enabled", havingValue = "true", matchIfMissing = true)
    public FinalSpaceClient finalspaceClient(FinalSpaceProperties properties) {
        return new FinalSpaceClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.harrypottercharactes.enabled", havingValue = "true", matchIfMissing = true)
    public HarryPotterCharactesClient harrypottercharactesClient(HarryPotterCharactesProperties properties) {
        return new HarryPotterCharactesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.openmoviedatabase.enabled", havingValue = "true", matchIfMissing = true)
    public OpenMovieDatabaseClient openmoviedatabaseClient(OpenMovieDatabaseProperties properties) {
        return new OpenMovieDatabaseClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.catchtheshow.enabled", havingValue = "true", matchIfMissing = true)
    public CatchTheShowClient catchtheshowClient(CatchTheShowProperties properties) {
        return new CatchTheShowClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.simkl.enabled", havingValue = "true", matchIfMissing = true)
    public SimklClient simklClient(SimklProperties properties) {
        return new SimklClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.tvdb.enabled", havingValue = "true", matchIfMissing = true)
    public TvdbClient tvdbClient(TvdbProperties properties) {
        return new TvdbClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.webseriesquotesgenerator.enabled", havingValue = "true", matchIfMissing = true)
    public WebSeriesQuotesGeneratorClient webseriesquotesgeneratorClient(WebSeriesQuotesGeneratorProperties properties) {
        return new WebSeriesQuotesGeneratorClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.json2video.enabled", havingValue = "true", matchIfMissing = true)
    public Json2VideoClient json2videoClient(Json2VideoProperties properties) {
        return new Json2VideoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.unogs.enabled", havingValue = "true", matchIfMissing = true)
    public UnogsClient unogsClient(UnogsProperties properties) {
        return new UnogsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.gameofthronesquotes.enabled", havingValue = "true", matchIfMissing = true)
    public GameOfThronesQuotesClient gameofthronesquotesClient(GameOfThronesQuotesProperties properties) {
        return new GameOfThronesQuotesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.traileraddict.enabled", havingValue = "true", matchIfMissing = true)
    public TraileraddictClient traileraddictClient(TraileraddictProperties properties) {
        return new TraileraddictClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.youtube.enabled", havingValue = "true", matchIfMissing = true)
    public YoutubeClient youtubeClient(YoutubeProperties properties) {
        return new YoutubeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.trakt.enabled", havingValue = "true", matchIfMissing = true)
    public TraktClient traktClient(TraktProperties properties) {
        return new TraktClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.hyperserve.enabled", havingValue = "true", matchIfMissing = true)
    public HyperserveClient hyperserveClient(HyperserveProperties properties) {
        return new HyperserveClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.thevampirediaries.enabled", havingValue = "true", matchIfMissing = true)
    public TheVampireDiariesClient thevampirediariesClient(TheVampireDiariesProperties properties) {
        return new TheVampireDiariesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.swapigraphql.enabled", havingValue = "true", matchIfMissing = true)
    public SwapiGraphqlClient swapigraphqlClient(SwapiGraphqlProperties properties) {
        return new SwapiGraphqlClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.owenwilsonwow.enabled", havingValue = "true", matchIfMissing = true)
    public OwenWilsonWowClient owenwilsonwowClient(OwenWilsonWowProperties properties) {
        return new OwenWilsonWowClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.motivationalquotes.enabled", havingValue = "true", matchIfMissing = true)
    public MotivationalQuotesClient motivationalquotesClient(MotivationalQuotesProperties properties) {
        return new MotivationalQuotesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.watchmode.enabled", havingValue = "true", matchIfMissing = true)
    public WatchmodeClient watchmodeClient(WatchmodeProperties properties) {
        return new WatchmodeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.vimeo.enabled", havingValue = "true", matchIfMissing = true)
    public VimeoClient vimeoClient(VimeoProperties properties) {
        return new VimeoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.thelordoftherings.enabled", havingValue = "true", matchIfMissing = true)
    public TheLordOfTheRingsClient thelordoftheringsClient(TheLordOfTheRingsProperties properties) {
        return new TheLordOfTheRingsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.swapi.enabled", havingValue = "true", matchIfMissing = true)
    public SwapiClient swapiClient(SwapiProperties properties) {
        return new SwapiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.stapi.enabled", havingValue = "true", matchIfMissing = true)
    public StapiClient stapiClient(StapiProperties properties) {
        return new StapiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.tmdb.enabled", havingValue = "true", matchIfMissing = true)
    public TmdbClient tmdbClient(TmdbProperties properties) {
        return new TmdbClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.stream.enabled", havingValue = "true", matchIfMissing = true)
    public StreamClient streamClient(StreamProperties properties) {
        return new StreamClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.tvmaze.enabled", havingValue = "true", matchIfMissing = true)
    public TvmazeClient tvmazeClient(TvmazeProperties properties) {
        return new TvmazeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.thronesapi.enabled", havingValue = "true", matchIfMissing = true)
    public ThronesapiClient thronesapiClient(ThronesapiProperties properties) {
        return new ThronesapiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.swapi2.enabled", havingValue = "true", matchIfMissing = true)
    public Swapi2Client swapi2Client(Swapi2Properties properties) {
        return new Swapi2Client(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.strombergquotes.enabled", havingValue = "true", matchIfMissing = true)
    public StrombergQuotesClient strombergquotesClient(StrombergQuotesProperties properties) {
        return new StrombergQuotesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.video.dailymotion.enabled", havingValue = "true", matchIfMissing = true)
    public DailymotionClient dailymotionClient(DailymotionProperties properties) {
        return new DailymotionClient(properties.getUrl());
    }

}
