package com.bzz.miniapis.sdk.opendata;

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
        Api18FProperties.class,
        AcrelensProperties.class,
        ApiSetuProperties.class,
        ArchiveOrgProperties.class,
        BlackHistoryFactsProperties.class,
        BotsarchiveProperties.class,
        CallookInfoProperties.class,
        CartoProperties.class,
        CollegescorecardEdGovProperties.class,
        EnigmaPublicProperties.class,
        FrenchAddressSearchProperties.class,
        GenesisProperties.class,
        JoshuaProjectProperties.class,
        KaggleProperties.class,
        LinkpreviewProperties.class,
        LowyAsiaPowerIndexProperties.class,
        MicrolinkIoProperties.class,
        ModelpartfinderErrorCodesProperties.class,
        NasdaqDataLinkProperties.class,
        NobelPrizeProperties.class,
        OnyxBazaarProperties.class,
        OpenDataMinneapolisProperties.class,
        OpenScholarshipsProperties.class,
        OpenafricaProperties.class,
        OpencorporatesProperties.class,
        OpensanctionsProperties.class,
        PeakmetricsProperties.class,
        RecreationInformationDatabaseProperties.class,
        ScoopItProperties.class,
        SocrataProperties.class,
        UmeOpenDataProperties.class,
        UniversitiesListProperties.class,
        UniversityOfOsloProperties.class,
        UpcDatabaseProperties.class,
        UrbanObservatoryProperties.class,
        VoidlyProperties.class,
        WikidataProperties.class,
        WikipediaProperties.class,
        YelpProperties.class
})
public class OpenDataAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.api18f.enabled", havingValue = "true", matchIfMissing = true)
    public Api18FClient api18fClient(Api18FProperties properties) {
        return createClient(Api18FClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.acrelens.enabled", havingValue = "true", matchIfMissing = true)
    public AcrelensClient acrelensClient(AcrelensProperties properties) {
        return createClient(AcrelensClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.apisetu.enabled", havingValue = "true", matchIfMissing = true)
    public ApiSetuClient apisetuClient(ApiSetuProperties properties) {
        return createClient(ApiSetuClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.archiveorg.enabled", havingValue = "true", matchIfMissing = true)
    public ArchiveOrgClient archiveorgClient(ArchiveOrgProperties properties) {
        return createClient(ArchiveOrgClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.blackhistoryfacts.enabled", havingValue = "true", matchIfMissing = true)
    public BlackHistoryFactsClient blackhistoryfactsClient(BlackHistoryFactsProperties properties) {
        return createClient(BlackHistoryFactsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.botsarchive.enabled", havingValue = "true", matchIfMissing = true)
    public BotsarchiveClient botsarchiveClient(BotsarchiveProperties properties) {
        return createClient(BotsarchiveClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.callookinfo.enabled", havingValue = "true", matchIfMissing = true)
    public CallookInfoClient callookinfoClient(CallookInfoProperties properties) {
        return createClient(CallookInfoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.carto.enabled", havingValue = "true", matchIfMissing = true)
    public CartoClient cartoClient(CartoProperties properties) {
        return createClient(CartoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.collegescorecardedgov.enabled", havingValue = "true", matchIfMissing = true)
    public CollegescorecardEdGovClient collegescorecardedgovClient(CollegescorecardEdGovProperties properties) {
        return createClient(CollegescorecardEdGovClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.enigmapublic.enabled", havingValue = "true", matchIfMissing = true)
    public EnigmaPublicClient enigmapublicClient(EnigmaPublicProperties properties) {
        return createClient(EnigmaPublicClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.frenchaddresssearch.enabled", havingValue = "true", matchIfMissing = true)
    public FrenchAddressSearchClient frenchaddresssearchClient(FrenchAddressSearchProperties properties) {
        return createClient(FrenchAddressSearchClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.genesis.enabled", havingValue = "true", matchIfMissing = true)
    public GenesisClient genesisClient(GenesisProperties properties) {
        return createClient(GenesisClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.joshuaproject.enabled", havingValue = "true", matchIfMissing = true)
    public JoshuaProjectClient joshuaprojectClient(JoshuaProjectProperties properties) {
        return createClient(JoshuaProjectClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.kaggle.enabled", havingValue = "true", matchIfMissing = true)
    public KaggleClient kaggleClient(KaggleProperties properties) {
        return createClient(KaggleClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.linkpreview.enabled", havingValue = "true", matchIfMissing = true)
    public LinkpreviewClient linkpreviewClient(LinkpreviewProperties properties) {
        return createClient(LinkpreviewClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.lowyasiapowerindex.enabled", havingValue = "true", matchIfMissing = true)
    public LowyAsiaPowerIndexClient lowyasiapowerindexClient(LowyAsiaPowerIndexProperties properties) {
        return createClient(LowyAsiaPowerIndexClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.microlinkio.enabled", havingValue = "true", matchIfMissing = true)
    public MicrolinkIoClient microlinkioClient(MicrolinkIoProperties properties) {
        return createClient(MicrolinkIoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.modelpartfindererrorcodes.enabled", havingValue = "true", matchIfMissing = true)
    public ModelpartfinderErrorCodesClient modelpartfindererrorcodesClient(ModelpartfinderErrorCodesProperties properties) {
        return createClient(ModelpartfinderErrorCodesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.nasdaqdatalink.enabled", havingValue = "true", matchIfMissing = true)
    public NasdaqDataLinkClient nasdaqdatalinkClient(NasdaqDataLinkProperties properties) {
        return createClient(NasdaqDataLinkClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.nobelprize.enabled", havingValue = "true", matchIfMissing = true)
    public NobelPrizeClient nobelprizeClient(NobelPrizeProperties properties) {
        return createClient(NobelPrizeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.onyxbazaar.enabled", havingValue = "true", matchIfMissing = true)
    public OnyxBazaarClient onyxbazaarClient(OnyxBazaarProperties properties) {
        return createClient(OnyxBazaarClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.opendataminneapolis.enabled", havingValue = "true", matchIfMissing = true)
    public OpenDataMinneapolisClient opendataminneapolisClient(OpenDataMinneapolisProperties properties) {
        return createClient(OpenDataMinneapolisClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.openscholarships.enabled", havingValue = "true", matchIfMissing = true)
    public OpenScholarshipsClient openscholarshipsClient(OpenScholarshipsProperties properties) {
        return createClient(OpenScholarshipsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.openafrica.enabled", havingValue = "true", matchIfMissing = true)
    public OpenafricaClient openafricaClient(OpenafricaProperties properties) {
        return createClient(OpenafricaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.opencorporates.enabled", havingValue = "true", matchIfMissing = true)
    public OpencorporatesClient opencorporatesClient(OpencorporatesProperties properties) {
        return createClient(OpencorporatesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.opensanctions.enabled", havingValue = "true", matchIfMissing = true)
    public OpensanctionsClient opensanctionsClient(OpensanctionsProperties properties) {
        return createClient(OpensanctionsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.peakmetrics.enabled", havingValue = "true", matchIfMissing = true)
    public PeakmetricsClient peakmetricsClient(PeakmetricsProperties properties) {
        return createClient(PeakmetricsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.recreationinformationdatabase.enabled", havingValue = "true", matchIfMissing = true)
    public RecreationInformationDatabaseClient recreationinformationdatabaseClient(RecreationInformationDatabaseProperties properties) {
        return createClient(RecreationInformationDatabaseClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.scoopit.enabled", havingValue = "true", matchIfMissing = true)
    public ScoopItClient scoopitClient(ScoopItProperties properties) {
        return createClient(ScoopItClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.socrata.enabled", havingValue = "true", matchIfMissing = true)
    public SocrataClient socrataClient(SocrataProperties properties) {
        return createClient(SocrataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.umeopendata.enabled", havingValue = "true", matchIfMissing = true)
    public UmeOpenDataClient umeopendataClient(UmeOpenDataProperties properties) {
        return createClient(UmeOpenDataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.universitieslist.enabled", havingValue = "true", matchIfMissing = true)
    public UniversitiesListClient universitieslistClient(UniversitiesListProperties properties) {
        return createClient(UniversitiesListClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.universityofoslo.enabled", havingValue = "true", matchIfMissing = true)
    public UniversityOfOsloClient universityofosloClient(UniversityOfOsloProperties properties) {
        return createClient(UniversityOfOsloClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.upcdatabase.enabled", havingValue = "true", matchIfMissing = true)
    public UpcDatabaseClient upcdatabaseClient(UpcDatabaseProperties properties) {
        return createClient(UpcDatabaseClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.urbanobservatory.enabled", havingValue = "true", matchIfMissing = true)
    public UrbanObservatoryClient urbanobservatoryClient(UrbanObservatoryProperties properties) {
        return createClient(UrbanObservatoryClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.voidly.enabled", havingValue = "true", matchIfMissing = true)
    public VoidlyClient voidlyClient(VoidlyProperties properties) {
        return createClient(VoidlyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.wikidata.enabled", havingValue = "true", matchIfMissing = true)
    public WikidataClient wikidataClient(WikidataProperties properties) {
        return createClient(WikidataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.wikipedia.enabled", havingValue = "true", matchIfMissing = true)
    public WikipediaClient wikipediaClient(WikipediaProperties properties) {
        return createClient(WikipediaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opendata.yelp.enabled", havingValue = "true", matchIfMissing = true)
    public YelpClient yelpClient(YelpProperties properties) {
        return createClient(YelpClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
