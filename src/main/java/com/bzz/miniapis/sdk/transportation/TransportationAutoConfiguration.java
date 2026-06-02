package com.bzz.miniapis.sdk.transportation;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        AirportsapiProperties.class,
        CommunityTransitProperties.class,
        AmadeusForDevelopersProperties.class,
        GrabProperties.class,
        BicBoxtechProperties.class,
        BlablacarProperties.class,
        Az511Properties.class,
        IcelandicApisProperties.class,
        CompareFlightPricesProperties.class,
        TransportForBerlinGermanyProperties.class,
        ApimetroProperties.class,
        BcFerriesProperties.class,
        ApilayerAviationstackProperties.class,
        LandTransportAuthorityDatamallSingaporeProperties.class,
        AdsBExchangeProperties.class,
        NavitiaProperties.class,
        TransportForBudapestHungaryProperties.class,
        OpenskyNetworkProperties.class,
        BayAreaRapidTransitProperties.class,
        TransportForDenverUsProperties.class,
        OriznVisaProperties.class,
        GraphhopperProperties.class,
        TransportForBelgiumProperties.class,
        BostonMbtaTransitProperties.class,
        SabreForDevelopersProperties.class,
        TransportForChicagoUsProperties.class,
        TankerkoenigProperties.class,
        CtsProperties.class,
        TransportForFinlandProperties.class,
        AisHubProperties.class,
        TransportForAucklandNewZealandProperties.class,
        RefugeRestroomsProperties.class,
        TransportForTheNetherlandsProperties.class,
        SchipholAirportProperties.class,
        RailwayTransportForFranceProperties.class,
        TransitlandProperties.class,
        TransportForPhiladelphiaUsProperties.class,
        TransportForNorwayProperties.class,
        IziProperties.class,
        TransportForBordeauxFranceProperties.class,
        OpenChargeMapProperties.class,
        TransportForSwitzerlandProperties.class,
        TransportForSpainProperties.class,
        TransportForLosAngelesUsProperties.class,
        TransportForSwitzerland2Properties.class,
        MetroLisboaProperties.class,
        VelibMetropolisParisFranceProperties.class,
        TransportForSwedenProperties.class,
        TransportForTorontoCanadaProperties.class,
        TransportForOttawaCanadaProperties.class,
        TransportForUkProperties.class,
        TransportForUnitedStatesProperties.class,
        TripadvisorProperties.class,
        TransportForAtlantaUsProperties.class,
        TransportForManchesterEnglandProperties.class,
        TransportForVancouverCanadaProperties.class,
        TransportForParisFranceProperties.class,
        TransportForWashingtonUsProperties.class,
        TransportForLondonEnglandProperties.class,
        UberProperties.class,
        TransportForHonoluluUsProperties.class,
        TransportForLisbonPortugalProperties.class,
        TransportRestProperties.class,
        TransportForHessenGermanyProperties.class,
        TransportForSaoPauloBrazilProperties.class,
        TransportForTheNetherlands2Properties.class,
        TransportForGrenobleFranceProperties.class
})
public class TransportationAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.airportsapi.enabled", havingValue = "true", matchIfMissing = true)
    public AirportsapiClient airportsapiClient(AirportsapiProperties properties) {
        return new AirportsapiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.communitytransit.enabled", havingValue = "true", matchIfMissing = true)
    public CommunityTransitClient communitytransitClient(CommunityTransitProperties properties) {
        return new CommunityTransitClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.amadeusfordevelopers.enabled", havingValue = "true", matchIfMissing = true)
    public AmadeusForDevelopersClient amadeusfordevelopersClient(AmadeusForDevelopersProperties properties) {
        return new AmadeusForDevelopersClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.grab.enabled", havingValue = "true", matchIfMissing = true)
    public GrabClient grabClient(GrabProperties properties) {
        return new GrabClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.bicboxtech.enabled", havingValue = "true", matchIfMissing = true)
    public BicBoxtechClient bicboxtechClient(BicBoxtechProperties properties) {
        return new BicBoxtechClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.blablacar.enabled", havingValue = "true", matchIfMissing = true)
    public BlablacarClient blablacarClient(BlablacarProperties properties) {
        return new BlablacarClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.az511.enabled", havingValue = "true", matchIfMissing = true)
    public Az511Client az511Client(Az511Properties properties) {
        return new Az511Client(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.icelandicapis.enabled", havingValue = "true", matchIfMissing = true)
    public IcelandicApisClient icelandicapisClient(IcelandicApisProperties properties) {
        return new IcelandicApisClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.compareflightprices.enabled", havingValue = "true", matchIfMissing = true)
    public CompareFlightPricesClient compareflightpricesClient(CompareFlightPricesProperties properties) {
        return new CompareFlightPricesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforberlingermany.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForBerlinGermanyClient transportforberlingermanyClient(TransportForBerlinGermanyProperties properties) {
        return new TransportForBerlinGermanyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.apimetro.enabled", havingValue = "true", matchIfMissing = true)
    public ApimetroClient apimetroClient(ApimetroProperties properties) {
        return new ApimetroClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.bcferries.enabled", havingValue = "true", matchIfMissing = true)
    public BcFerriesClient bcferriesClient(BcFerriesProperties properties) {
        return new BcFerriesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.apilayeraviationstack.enabled", havingValue = "true", matchIfMissing = true)
    public ApilayerAviationstackClient apilayeraviationstackClient(ApilayerAviationstackProperties properties) {
        return new ApilayerAviationstackClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.landtransportauthoritydatamallsingapore.enabled", havingValue = "true", matchIfMissing = true)
    public LandTransportAuthorityDatamallSingaporeClient landtransportauthoritydatamallsingaporeClient(LandTransportAuthorityDatamallSingaporeProperties properties) {
        return new LandTransportAuthorityDatamallSingaporeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.adsbexchange.enabled", havingValue = "true", matchIfMissing = true)
    public AdsBExchangeClient adsbexchangeClient(AdsBExchangeProperties properties) {
        return new AdsBExchangeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.navitia.enabled", havingValue = "true", matchIfMissing = true)
    public NavitiaClient navitiaClient(NavitiaProperties properties) {
        return new NavitiaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforbudapesthungary.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForBudapestHungaryClient transportforbudapesthungaryClient(TransportForBudapestHungaryProperties properties) {
        return new TransportForBudapestHungaryClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.openskynetwork.enabled", havingValue = "true", matchIfMissing = true)
    public OpenskyNetworkClient openskynetworkClient(OpenskyNetworkProperties properties) {
        return new OpenskyNetworkClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.bayarearapidtransit.enabled", havingValue = "true", matchIfMissing = true)
    public BayAreaRapidTransitClient bayarearapidtransitClient(BayAreaRapidTransitProperties properties) {
        return new BayAreaRapidTransitClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportfordenverus.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForDenverUsClient transportfordenverusClient(TransportForDenverUsProperties properties) {
        return new TransportForDenverUsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.oriznvisa.enabled", havingValue = "true", matchIfMissing = true)
    public OriznVisaClient oriznvisaClient(OriznVisaProperties properties) {
        return new OriznVisaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.graphhopper.enabled", havingValue = "true", matchIfMissing = true)
    public GraphhopperClient graphhopperClient(GraphhopperProperties properties) {
        return new GraphhopperClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforbelgium.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForBelgiumClient transportforbelgiumClient(TransportForBelgiumProperties properties) {
        return new TransportForBelgiumClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.bostonmbtatransit.enabled", havingValue = "true", matchIfMissing = true)
    public BostonMbtaTransitClient bostonmbtatransitClient(BostonMbtaTransitProperties properties) {
        return new BostonMbtaTransitClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.sabrefordevelopers.enabled", havingValue = "true", matchIfMissing = true)
    public SabreForDevelopersClient sabrefordevelopersClient(SabreForDevelopersProperties properties) {
        return new SabreForDevelopersClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforchicagous.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForChicagoUsClient transportforchicagousClient(TransportForChicagoUsProperties properties) {
        return new TransportForChicagoUsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.tankerkoenig.enabled", havingValue = "true", matchIfMissing = true)
    public TankerkoenigClient tankerkoenigClient(TankerkoenigProperties properties) {
        return new TankerkoenigClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.cts.enabled", havingValue = "true", matchIfMissing = true)
    public CtsClient ctsClient(CtsProperties properties) {
        return new CtsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforfinland.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForFinlandClient transportforfinlandClient(TransportForFinlandProperties properties) {
        return new TransportForFinlandClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.aishub.enabled", havingValue = "true", matchIfMissing = true)
    public AisHubClient aishubClient(AisHubProperties properties) {
        return new AisHubClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforaucklandnewzealand.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForAucklandNewZealandClient transportforaucklandnewzealandClient(TransportForAucklandNewZealandProperties properties) {
        return new TransportForAucklandNewZealandClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.refugerestrooms.enabled", havingValue = "true", matchIfMissing = true)
    public RefugeRestroomsClient refugerestroomsClient(RefugeRestroomsProperties properties) {
        return new RefugeRestroomsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforthenetherlands.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForTheNetherlandsClient transportforthenetherlandsClient(TransportForTheNetherlandsProperties properties) {
        return new TransportForTheNetherlandsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.schipholairport.enabled", havingValue = "true", matchIfMissing = true)
    public SchipholAirportClient schipholairportClient(SchipholAirportProperties properties) {
        return new SchipholAirportClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.railwaytransportforfrance.enabled", havingValue = "true", matchIfMissing = true)
    public RailwayTransportForFranceClient railwaytransportforfranceClient(RailwayTransportForFranceProperties properties) {
        return new RailwayTransportForFranceClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transitland.enabled", havingValue = "true", matchIfMissing = true)
    public TransitlandClient transitlandClient(TransitlandProperties properties) {
        return new TransitlandClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforphiladelphiaus.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForPhiladelphiaUsClient transportforphiladelphiausClient(TransportForPhiladelphiaUsProperties properties) {
        return new TransportForPhiladelphiaUsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportfornorway.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForNorwayClient transportfornorwayClient(TransportForNorwayProperties properties) {
        return new TransportForNorwayClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.izi.enabled", havingValue = "true", matchIfMissing = true)
    public IziClient iziClient(IziProperties properties) {
        return new IziClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforbordeauxfrance.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForBordeauxFranceClient transportforbordeauxfranceClient(TransportForBordeauxFranceProperties properties) {
        return new TransportForBordeauxFranceClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.openchargemap.enabled", havingValue = "true", matchIfMissing = true)
    public OpenChargeMapClient openchargemapClient(OpenChargeMapProperties properties) {
        return new OpenChargeMapClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforswitzerland.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForSwitzerlandClient transportforswitzerlandClient(TransportForSwitzerlandProperties properties) {
        return new TransportForSwitzerlandClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforspain.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForSpainClient transportforspainClient(TransportForSpainProperties properties) {
        return new TransportForSpainClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforlosangelesus.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForLosAngelesUsClient transportforlosangelesusClient(TransportForLosAngelesUsProperties properties) {
        return new TransportForLosAngelesUsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforswitzerland2.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForSwitzerland2Client transportforswitzerland2Client(TransportForSwitzerland2Properties properties) {
        return new TransportForSwitzerland2Client(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.metrolisboa.enabled", havingValue = "true", matchIfMissing = true)
    public MetroLisboaClient metrolisboaClient(MetroLisboaProperties properties) {
        return new MetroLisboaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.velibmetropolisparisfrance.enabled", havingValue = "true", matchIfMissing = true)
    public VelibMetropolisParisFranceClient velibmetropolisparisfranceClient(VelibMetropolisParisFranceProperties properties) {
        return new VelibMetropolisParisFranceClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforsweden.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForSwedenClient transportforswedenClient(TransportForSwedenProperties properties) {
        return new TransportForSwedenClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportfortorontocanada.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForTorontoCanadaClient transportfortorontocanadaClient(TransportForTorontoCanadaProperties properties) {
        return new TransportForTorontoCanadaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforottawacanada.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForOttawaCanadaClient transportforottawacanadaClient(TransportForOttawaCanadaProperties properties) {
        return new TransportForOttawaCanadaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforuk.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForUkClient transportforukClient(TransportForUkProperties properties) {
        return new TransportForUkClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforunitedstates.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForUnitedStatesClient transportforunitedstatesClient(TransportForUnitedStatesProperties properties) {
        return new TransportForUnitedStatesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.tripadvisor.enabled", havingValue = "true", matchIfMissing = true)
    public TripadvisorClient tripadvisorClient(TripadvisorProperties properties) {
        return new TripadvisorClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforatlantaus.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForAtlantaUsClient transportforatlantausClient(TransportForAtlantaUsProperties properties) {
        return new TransportForAtlantaUsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportformanchesterengland.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForManchesterEnglandClient transportformanchesterenglandClient(TransportForManchesterEnglandProperties properties) {
        return new TransportForManchesterEnglandClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforvancouvercanada.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForVancouverCanadaClient transportforvancouvercanadaClient(TransportForVancouverCanadaProperties properties) {
        return new TransportForVancouverCanadaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforparisfrance.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForParisFranceClient transportforparisfranceClient(TransportForParisFranceProperties properties) {
        return new TransportForParisFranceClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforwashingtonus.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForWashingtonUsClient transportforwashingtonusClient(TransportForWashingtonUsProperties properties) {
        return new TransportForWashingtonUsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforlondonengland.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForLondonEnglandClient transportforlondonenglandClient(TransportForLondonEnglandProperties properties) {
        return new TransportForLondonEnglandClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.uber.enabled", havingValue = "true", matchIfMissing = true)
    public UberClient uberClient(UberProperties properties) {
        return new UberClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforhonoluluus.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForHonoluluUsClient transportforhonoluluusClient(TransportForHonoluluUsProperties properties) {
        return new TransportForHonoluluUsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforlisbonportugal.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForLisbonPortugalClient transportforlisbonportugalClient(TransportForLisbonPortugalProperties properties) {
        return new TransportForLisbonPortugalClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportrest.enabled", havingValue = "true", matchIfMissing = true)
    public TransportRestClient transportrestClient(TransportRestProperties properties) {
        return new TransportRestClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforhessengermany.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForHessenGermanyClient transportforhessengermanyClient(TransportForHessenGermanyProperties properties) {
        return new TransportForHessenGermanyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforsaopaulobrazil.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForSaoPauloBrazilClient transportforsaopaulobrazilClient(TransportForSaoPauloBrazilProperties properties) {
        return new TransportForSaoPauloBrazilClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforthenetherlands2.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForTheNetherlands2Client transportforthenetherlands2Client(TransportForTheNetherlands2Properties properties) {
        return new TransportForTheNetherlands2Client(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforgrenoblefrance.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForGrenobleFranceClient transportforgrenoblefranceClient(TransportForGrenobleFranceProperties properties) {
        return new TransportForGrenobleFranceClient(properties.getUrl());
    }

}
