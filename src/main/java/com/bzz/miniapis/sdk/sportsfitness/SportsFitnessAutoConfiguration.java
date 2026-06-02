package com.bzz.miniapis.sdk.sportsfitness;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        ApiFootballProperties.class,
        FootballStandingsProperties.class,
        CloudbetProperties.class,
        MlbRecordsAndStatsProperties.class,
        BalldontlieProperties.class,
        FootballSoccerVideosProperties.class,
        ApimedicProperties.class,
        FitbitProperties.class,
        FootballProperties.class,
        StravaProperties.class,
        NhlRecordsAndStatsProperties.class,
        CityBikesProperties.class,
        DiscgolfProperties.class,
        PremierLeagueStandingsProperties.class,
        ThesportsdbProperties.class,
        SquiggleProperties.class,
        CollegefootballdataComProperties.class,
        RacinghubProperties.class,
        FootballDataProperties.class,
        TredictProperties.class,
        SportDataProperties.class,
        NbaDataProperties.class,
        ErgastF1Properties.class,
        SportmonksCricketProperties.class,
        WgerProperties.class,
        SportmonksFootballProperties.class,
        TourneyradarProperties.class,
        OpenligadbProperties.class,
        NbaStatsProperties.class,
        JcdecauxBikeProperties.class,
        OddsmagnetProperties.class
})
public class SportsFitnessAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.apifootball.enabled", havingValue = "true", matchIfMissing = true)
    public ApiFootballClient apifootballClient(ApiFootballProperties properties) {
        return new ApiFootballClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.footballstandings.enabled", havingValue = "true", matchIfMissing = true)
    public FootballStandingsClient footballstandingsClient(FootballStandingsProperties properties) {
        return new FootballStandingsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.cloudbet.enabled", havingValue = "true", matchIfMissing = true)
    public CloudbetClient cloudbetClient(CloudbetProperties properties) {
        return new CloudbetClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.mlbrecordsandstats.enabled", havingValue = "true", matchIfMissing = true)
    public MlbRecordsAndStatsClient mlbrecordsandstatsClient(MlbRecordsAndStatsProperties properties) {
        return new MlbRecordsAndStatsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.balldontlie.enabled", havingValue = "true", matchIfMissing = true)
    public BalldontlieClient balldontlieClient(BalldontlieProperties properties) {
        return new BalldontlieClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.footballsoccervideos.enabled", havingValue = "true", matchIfMissing = true)
    public FootballSoccerVideosClient footballsoccervideosClient(FootballSoccerVideosProperties properties) {
        return new FootballSoccerVideosClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.apimedic.enabled", havingValue = "true", matchIfMissing = true)
    public ApimedicClient apimedicClient(ApimedicProperties properties) {
        return new ApimedicClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.fitbit.enabled", havingValue = "true", matchIfMissing = true)
    public FitbitClient fitbitClient(FitbitProperties properties) {
        return new FitbitClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.football.enabled", havingValue = "true", matchIfMissing = true)
    public FootballClient footballClient(FootballProperties properties) {
        return new FootballClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.strava.enabled", havingValue = "true", matchIfMissing = true)
    public StravaClient stravaClient(StravaProperties properties) {
        return new StravaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.nhlrecordsandstats.enabled", havingValue = "true", matchIfMissing = true)
    public NhlRecordsAndStatsClient nhlrecordsandstatsClient(NhlRecordsAndStatsProperties properties) {
        return new NhlRecordsAndStatsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.citybikes.enabled", havingValue = "true", matchIfMissing = true)
    public CityBikesClient citybikesClient(CityBikesProperties properties) {
        return new CityBikesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.discgolf.enabled", havingValue = "true", matchIfMissing = true)
    public DiscgolfClient discgolfClient(DiscgolfProperties properties) {
        return new DiscgolfClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.premierleaguestandings.enabled", havingValue = "true", matchIfMissing = true)
    public PremierLeagueStandingsClient premierleaguestandingsClient(PremierLeagueStandingsProperties properties) {
        return new PremierLeagueStandingsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.thesportsdb.enabled", havingValue = "true", matchIfMissing = true)
    public ThesportsdbClient thesportsdbClient(ThesportsdbProperties properties) {
        return new ThesportsdbClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.squiggle.enabled", havingValue = "true", matchIfMissing = true)
    public SquiggleClient squiggleClient(SquiggleProperties properties) {
        return new SquiggleClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.collegefootballdatacom.enabled", havingValue = "true", matchIfMissing = true)
    public CollegefootballdataComClient collegefootballdatacomClient(CollegefootballdataComProperties properties) {
        return new CollegefootballdataComClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.racinghub.enabled", havingValue = "true", matchIfMissing = true)
    public RacinghubClient racinghubClient(RacinghubProperties properties) {
        return new RacinghubClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.footballdata.enabled", havingValue = "true", matchIfMissing = true)
    public FootballDataClient footballdataClient(FootballDataProperties properties) {
        return new FootballDataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.tredict.enabled", havingValue = "true", matchIfMissing = true)
    public TredictClient tredictClient(TredictProperties properties) {
        return new TredictClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.sportdata.enabled", havingValue = "true", matchIfMissing = true)
    public SportDataClient sportdataClient(SportDataProperties properties) {
        return new SportDataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.nbadata.enabled", havingValue = "true", matchIfMissing = true)
    public NbaDataClient nbadataClient(NbaDataProperties properties) {
        return new NbaDataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.ergastf1.enabled", havingValue = "true", matchIfMissing = true)
    public ErgastF1Client ergastf1Client(ErgastF1Properties properties) {
        return new ErgastF1Client(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.sportmonkscricket.enabled", havingValue = "true", matchIfMissing = true)
    public SportmonksCricketClient sportmonkscricketClient(SportmonksCricketProperties properties) {
        return new SportmonksCricketClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.wger.enabled", havingValue = "true", matchIfMissing = true)
    public WgerClient wgerClient(WgerProperties properties) {
        return new WgerClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.sportmonksfootball.enabled", havingValue = "true", matchIfMissing = true)
    public SportmonksFootballClient sportmonksfootballClient(SportmonksFootballProperties properties) {
        return new SportmonksFootballClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.tourneyradar.enabled", havingValue = "true", matchIfMissing = true)
    public TourneyradarClient tourneyradarClient(TourneyradarProperties properties) {
        return new TourneyradarClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.openligadb.enabled", havingValue = "true", matchIfMissing = true)
    public OpenligadbClient openligadbClient(OpenligadbProperties properties) {
        return new OpenligadbClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.nbastats.enabled", havingValue = "true", matchIfMissing = true)
    public NbaStatsClient nbastatsClient(NbaStatsProperties properties) {
        return new NbaStatsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.jcdecauxbike.enabled", havingValue = "true", matchIfMissing = true)
    public JcdecauxBikeClient jcdecauxbikeClient(JcdecauxBikeProperties properties) {
        return new JcdecauxBikeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sportsfitness.oddsmagnet.enabled", havingValue = "true", matchIfMissing = true)
    public OddsmagnetClient oddsmagnetClient(OddsmagnetProperties properties) {
        return new OddsmagnetClient(properties.getUrl());
    }

}
