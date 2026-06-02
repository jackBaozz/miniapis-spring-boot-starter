package com.bzz.miniapis.sdk.sportsfitness;

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
        ApiFootballProperties.class,
        ApimedicProperties.class,
        BalldontlieProperties.class,
        CityBikesProperties.class,
        CloudbetProperties.class,
        CollegefootballdataComProperties.class,
        DiscgolfProperties.class,
        ErgastF1Properties.class,
        FitbitProperties.class,
        FootballProperties.class,
        FootballSoccerVideosProperties.class,
        FootballStandingsProperties.class,
        FootballDataProperties.class,
        JcdecauxBikeProperties.class,
        MlbRecordsAndStatsProperties.class,
        NbaDataProperties.class,
        NbaStatsProperties.class,
        NhlRecordsAndStatsProperties.class,
        OddsmagnetProperties.class,
        OpenligadbProperties.class,
        PremierLeagueStandingsProperties.class,
        RacinghubProperties.class,
        SportDataProperties.class,
        SportmonksCricketProperties.class,
        SportmonksFootballProperties.class,
        SquiggleProperties.class,
        StravaProperties.class,
        ThesportsdbProperties.class,
        TourneyradarProperties.class,
        TredictProperties.class,
        WgerProperties.class
})
public class SportsFitnessAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.apifootball.enabled", havingValue = "true", matchIfMissing = true)
    public ApiFootballClient apifootballClient(ApiFootballProperties properties) {
        return createClient(ApiFootballClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.apimedic.enabled", havingValue = "true", matchIfMissing = true)
    public ApimedicClient apimedicClient(ApimedicProperties properties) {
        return createClient(ApimedicClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.balldontlie.enabled", havingValue = "true", matchIfMissing = true)
    public BalldontlieClient balldontlieClient(BalldontlieProperties properties) {
        return createClient(BalldontlieClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.citybikes.enabled", havingValue = "true", matchIfMissing = true)
    public CityBikesClient citybikesClient(CityBikesProperties properties) {
        return createClient(CityBikesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.cloudbet.enabled", havingValue = "true", matchIfMissing = true)
    public CloudbetClient cloudbetClient(CloudbetProperties properties) {
        return createClient(CloudbetClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.collegefootballdatacom.enabled", havingValue = "true", matchIfMissing = true)
    public CollegefootballdataComClient collegefootballdatacomClient(CollegefootballdataComProperties properties) {
        return createClient(CollegefootballdataComClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.discgolf.enabled", havingValue = "true", matchIfMissing = true)
    public DiscgolfClient discgolfClient(DiscgolfProperties properties) {
        return createClient(DiscgolfClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.ergastf1.enabled", havingValue = "true", matchIfMissing = true)
    public ErgastF1Client ergastf1Client(ErgastF1Properties properties) {
        return createClient(ErgastF1Client.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.fitbit.enabled", havingValue = "true", matchIfMissing = true)
    public FitbitClient fitbitClient(FitbitProperties properties) {
        return createClient(FitbitClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.football.enabled", havingValue = "true", matchIfMissing = true)
    public FootballClient footballClient(FootballProperties properties) {
        return createClient(FootballClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.footballsoccervideos.enabled", havingValue = "true", matchIfMissing = true)
    public FootballSoccerVideosClient footballsoccervideosClient(FootballSoccerVideosProperties properties) {
        return createClient(FootballSoccerVideosClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.footballstandings.enabled", havingValue = "true", matchIfMissing = true)
    public FootballStandingsClient footballstandingsClient(FootballStandingsProperties properties) {
        return createClient(FootballStandingsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.footballdata.enabled", havingValue = "true", matchIfMissing = true)
    public FootballDataClient footballdataClient(FootballDataProperties properties) {
        return createClient(FootballDataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.jcdecauxbike.enabled", havingValue = "true", matchIfMissing = true)
    public JcdecauxBikeClient jcdecauxbikeClient(JcdecauxBikeProperties properties) {
        return createClient(JcdecauxBikeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.mlbrecordsandstats.enabled", havingValue = "true", matchIfMissing = true)
    public MlbRecordsAndStatsClient mlbrecordsandstatsClient(MlbRecordsAndStatsProperties properties) {
        return createClient(MlbRecordsAndStatsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.nbadata.enabled", havingValue = "true", matchIfMissing = true)
    public NbaDataClient nbadataClient(NbaDataProperties properties) {
        return createClient(NbaDataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.nbastats.enabled", havingValue = "true", matchIfMissing = true)
    public NbaStatsClient nbastatsClient(NbaStatsProperties properties) {
        return createClient(NbaStatsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.nhlrecordsandstats.enabled", havingValue = "true", matchIfMissing = true)
    public NhlRecordsAndStatsClient nhlrecordsandstatsClient(NhlRecordsAndStatsProperties properties) {
        return createClient(NhlRecordsAndStatsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.oddsmagnet.enabled", havingValue = "true", matchIfMissing = true)
    public OddsmagnetClient oddsmagnetClient(OddsmagnetProperties properties) {
        return createClient(OddsmagnetClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.openligadb.enabled", havingValue = "true", matchIfMissing = true)
    public OpenligadbClient openligadbClient(OpenligadbProperties properties) {
        return createClient(OpenligadbClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.premierleaguestandings.enabled", havingValue = "true", matchIfMissing = true)
    public PremierLeagueStandingsClient premierleaguestandingsClient(PremierLeagueStandingsProperties properties) {
        return createClient(PremierLeagueStandingsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.racinghub.enabled", havingValue = "true", matchIfMissing = true)
    public RacinghubClient racinghubClient(RacinghubProperties properties) {
        return createClient(RacinghubClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.sportdata.enabled", havingValue = "true", matchIfMissing = true)
    public SportDataClient sportdataClient(SportDataProperties properties) {
        return createClient(SportDataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.sportmonkscricket.enabled", havingValue = "true", matchIfMissing = true)
    public SportmonksCricketClient sportmonkscricketClient(SportmonksCricketProperties properties) {
        return createClient(SportmonksCricketClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.sportmonksfootball.enabled", havingValue = "true", matchIfMissing = true)
    public SportmonksFootballClient sportmonksfootballClient(SportmonksFootballProperties properties) {
        return createClient(SportmonksFootballClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.squiggle.enabled", havingValue = "true", matchIfMissing = true)
    public SquiggleClient squiggleClient(SquiggleProperties properties) {
        return createClient(SquiggleClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.strava.enabled", havingValue = "true", matchIfMissing = true)
    public StravaClient stravaClient(StravaProperties properties) {
        return createClient(StravaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.thesportsdb.enabled", havingValue = "true", matchIfMissing = true)
    public ThesportsdbClient thesportsdbClient(ThesportsdbProperties properties) {
        return createClient(ThesportsdbClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.tourneyradar.enabled", havingValue = "true", matchIfMissing = true)
    public TourneyradarClient tourneyradarClient(TourneyradarProperties properties) {
        return createClient(TourneyradarClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.tredict.enabled", havingValue = "true", matchIfMissing = true)
    public TredictClient tredictClient(TredictProperties properties) {
        return createClient(TredictClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.wger.enabled", havingValue = "true", matchIfMissing = true)
    public WgerClient wgerClient(WgerProperties properties) {
        return createClient(WgerClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
