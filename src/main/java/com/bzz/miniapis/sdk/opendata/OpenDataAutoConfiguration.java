package com.bzz.miniapis.sdk.opendata;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        Api18FProperties.class,
        LowyAsiaPowerIndexProperties.class,
        CartoProperties.class,
        KaggleProperties.class,
        CollegescorecardEdGovProperties.class,
        MicrolinkIoProperties.class,
        BotsarchiveProperties.class,
        NasdaqDataLinkProperties.class,
        JoshuaProjectProperties.class,
        OnyxBazaarProperties.class,
        UniversitiesListProperties.class,
        SocrataProperties.class,
        LinkpreviewProperties.class,
        PeakmetricsProperties.class,
        BlackHistoryFactsProperties.class,
        ArchiveOrgProperties.class,
        YelpProperties.class,
        OpencorporatesProperties.class,
        ModelpartfinderErrorCodesProperties.class,
        OpensanctionsProperties.class,
        CallookInfoProperties.class,
        OpenDataMinneapolisProperties.class,
        OpenScholarshipsProperties.class,
        NobelPrizeProperties.class,
        WikipediaProperties.class,
        RecreationInformationDatabaseProperties.class,
        AcrelensProperties.class,
        WikidataProperties.class,
        ScoopItProperties.class,
        GenesisProperties.class,
        OpenafricaProperties.class,
        UpcDatabaseProperties.class,
        UniversityOfOsloProperties.class,
        VoidlyProperties.class,
        UmeOpenDataProperties.class,
        EnigmaPublicProperties.class,
        UrbanObservatoryProperties.class,
        FrenchAddressSearchProperties.class,
        ApiSetuProperties.class
})
public class OpenDataAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.api18f.enabled", havingValue = "true", matchIfMissing = true)
    public Api18FClient api18fClient(Api18FProperties properties) {
        return new Api18FClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.lowyasiapowerindex.enabled", havingValue = "true", matchIfMissing = true)
    public LowyAsiaPowerIndexClient lowyasiapowerindexClient(LowyAsiaPowerIndexProperties properties) {
        return new LowyAsiaPowerIndexClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.carto.enabled", havingValue = "true", matchIfMissing = true)
    public CartoClient cartoClient(CartoProperties properties) {
        return new CartoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.kaggle.enabled", havingValue = "true", matchIfMissing = true)
    public KaggleClient kaggleClient(KaggleProperties properties) {
        return new KaggleClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.collegescorecardedgov.enabled", havingValue = "true", matchIfMissing = true)
    public CollegescorecardEdGovClient collegescorecardedgovClient(CollegescorecardEdGovProperties properties) {
        return new CollegescorecardEdGovClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.microlinkio.enabled", havingValue = "true", matchIfMissing = true)
    public MicrolinkIoClient microlinkioClient(MicrolinkIoProperties properties) {
        return new MicrolinkIoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.botsarchive.enabled", havingValue = "true", matchIfMissing = true)
    public BotsarchiveClient botsarchiveClient(BotsarchiveProperties properties) {
        return new BotsarchiveClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.nasdaqdatalink.enabled", havingValue = "true", matchIfMissing = true)
    public NasdaqDataLinkClient nasdaqdatalinkClient(NasdaqDataLinkProperties properties) {
        return new NasdaqDataLinkClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.joshuaproject.enabled", havingValue = "true", matchIfMissing = true)
    public JoshuaProjectClient joshuaprojectClient(JoshuaProjectProperties properties) {
        return new JoshuaProjectClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.onyxbazaar.enabled", havingValue = "true", matchIfMissing = true)
    public OnyxBazaarClient onyxbazaarClient(OnyxBazaarProperties properties) {
        return new OnyxBazaarClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.universitieslist.enabled", havingValue = "true", matchIfMissing = true)
    public UniversitiesListClient universitieslistClient(UniversitiesListProperties properties) {
        return new UniversitiesListClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.socrata.enabled", havingValue = "true", matchIfMissing = true)
    public SocrataClient socrataClient(SocrataProperties properties) {
        return new SocrataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.linkpreview.enabled", havingValue = "true", matchIfMissing = true)
    public LinkpreviewClient linkpreviewClient(LinkpreviewProperties properties) {
        return new LinkpreviewClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.peakmetrics.enabled", havingValue = "true", matchIfMissing = true)
    public PeakmetricsClient peakmetricsClient(PeakmetricsProperties properties) {
        return new PeakmetricsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.blackhistoryfacts.enabled", havingValue = "true", matchIfMissing = true)
    public BlackHistoryFactsClient blackhistoryfactsClient(BlackHistoryFactsProperties properties) {
        return new BlackHistoryFactsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.archiveorg.enabled", havingValue = "true", matchIfMissing = true)
    public ArchiveOrgClient archiveorgClient(ArchiveOrgProperties properties) {
        return new ArchiveOrgClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.yelp.enabled", havingValue = "true", matchIfMissing = true)
    public YelpClient yelpClient(YelpProperties properties) {
        return new YelpClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.opencorporates.enabled", havingValue = "true", matchIfMissing = true)
    public OpencorporatesClient opencorporatesClient(OpencorporatesProperties properties) {
        return new OpencorporatesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.modelpartfindererrorcodes.enabled", havingValue = "true", matchIfMissing = true)
    public ModelpartfinderErrorCodesClient modelpartfindererrorcodesClient(ModelpartfinderErrorCodesProperties properties) {
        return new ModelpartfinderErrorCodesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.opensanctions.enabled", havingValue = "true", matchIfMissing = true)
    public OpensanctionsClient opensanctionsClient(OpensanctionsProperties properties) {
        return new OpensanctionsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.callookinfo.enabled", havingValue = "true", matchIfMissing = true)
    public CallookInfoClient callookinfoClient(CallookInfoProperties properties) {
        return new CallookInfoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.opendataminneapolis.enabled", havingValue = "true", matchIfMissing = true)
    public OpenDataMinneapolisClient opendataminneapolisClient(OpenDataMinneapolisProperties properties) {
        return new OpenDataMinneapolisClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.openscholarships.enabled", havingValue = "true", matchIfMissing = true)
    public OpenScholarshipsClient openscholarshipsClient(OpenScholarshipsProperties properties) {
        return new OpenScholarshipsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.nobelprize.enabled", havingValue = "true", matchIfMissing = true)
    public NobelPrizeClient nobelprizeClient(NobelPrizeProperties properties) {
        return new NobelPrizeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.wikipedia.enabled", havingValue = "true", matchIfMissing = true)
    public WikipediaClient wikipediaClient(WikipediaProperties properties) {
        return new WikipediaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.recreationinformationdatabase.enabled", havingValue = "true", matchIfMissing = true)
    public RecreationInformationDatabaseClient recreationinformationdatabaseClient(RecreationInformationDatabaseProperties properties) {
        return new RecreationInformationDatabaseClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.acrelens.enabled", havingValue = "true", matchIfMissing = true)
    public AcrelensClient acrelensClient(AcrelensProperties properties) {
        return new AcrelensClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.wikidata.enabled", havingValue = "true", matchIfMissing = true)
    public WikidataClient wikidataClient(WikidataProperties properties) {
        return new WikidataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.scoopit.enabled", havingValue = "true", matchIfMissing = true)
    public ScoopItClient scoopitClient(ScoopItProperties properties) {
        return new ScoopItClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.genesis.enabled", havingValue = "true", matchIfMissing = true)
    public GenesisClient genesisClient(GenesisProperties properties) {
        return new GenesisClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.openafrica.enabled", havingValue = "true", matchIfMissing = true)
    public OpenafricaClient openafricaClient(OpenafricaProperties properties) {
        return new OpenafricaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.upcdatabase.enabled", havingValue = "true", matchIfMissing = true)
    public UpcDatabaseClient upcdatabaseClient(UpcDatabaseProperties properties) {
        return new UpcDatabaseClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.universityofoslo.enabled", havingValue = "true", matchIfMissing = true)
    public UniversityOfOsloClient universityofosloClient(UniversityOfOsloProperties properties) {
        return new UniversityOfOsloClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.voidly.enabled", havingValue = "true", matchIfMissing = true)
    public VoidlyClient voidlyClient(VoidlyProperties properties) {
        return new VoidlyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.umeopendata.enabled", havingValue = "true", matchIfMissing = true)
    public UmeOpenDataClient umeopendataClient(UmeOpenDataProperties properties) {
        return new UmeOpenDataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.enigmapublic.enabled", havingValue = "true", matchIfMissing = true)
    public EnigmaPublicClient enigmapublicClient(EnigmaPublicProperties properties) {
        return new EnigmaPublicClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.urbanobservatory.enabled", havingValue = "true", matchIfMissing = true)
    public UrbanObservatoryClient urbanobservatoryClient(UrbanObservatoryProperties properties) {
        return new UrbanObservatoryClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.frenchaddresssearch.enabled", havingValue = "true", matchIfMissing = true)
    public FrenchAddressSearchClient frenchaddresssearchClient(FrenchAddressSearchProperties properties) {
        return new FrenchAddressSearchClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.apisetu.enabled", havingValue = "true", matchIfMissing = true)
    public ApiSetuClient apisetuClient(ApiSetuProperties properties) {
        return new ApiSetuClient(properties.getUrl());
    }

}
