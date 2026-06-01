package com.bzz.miniapis.sdk.transportation;

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
        AdsBExchangeProperties.class,
        AirportsapiProperties.class,
        AisHubProperties.class,
        AmadeusForDevelopersProperties.class,
        ApilayerAviationstackProperties.class,
        ApimetroProperties.class,
        AviationapiProperties.class,
        Az511Properties.class,
        BayAreaRapidTransitProperties.class,
        BcFerriesProperties.class,
        BicBoxtechProperties.class,
        BlablacarProperties.class,
        BostonMbtaTransitProperties.class,
        CommunityTransitProperties.class,
        CompareFlightPricesProperties.class,
        CtsProperties.class,
        GrabProperties.class,
        GraphhopperProperties.class,
        IcelandicApisProperties.class,
        ImpalaHotelBookingsProperties.class,
        IziProperties.class,
        LandTransportAuthorityDatamallSingaporeProperties.class,
        MetroLisboaProperties.class,
        NavitiaProperties.class,
        OpenChargeMapProperties.class,
        OriznVisaProperties.class,
        OpenskyNetworkProperties.class,
        RailwayTransportForFranceProperties.class,
        RefugeRestroomsProperties.class,
        SabreForDevelopersProperties.class,
        SchipholAirportProperties.class,
        TankerkoenigProperties.class,
        TransitlandProperties.class,
        TransportForAtlantaUsProperties.class,
        TransportForAucklandNewZealandProperties.class,
        TransportForBelgiumProperties.class,
        TransportForBerlinGermanyProperties.class,
        TransportForBordeauxFranceProperties.class,
        TransportForBudapestHungaryProperties.class,
        TransportForChicagoUsProperties.class,
        TransportForCzechRepublicProperties.class,
        TransportForDenverUsProperties.class,
        TransportForFinlandProperties.class,
        TransportForGermanyProperties.class,
        TransportForGrenobleFranceProperties.class,
        TransportForHessenGermanyProperties.class,
        TransportForHonoluluUsProperties.class,
        TransportForLisbonPortugalProperties.class,
        TransportForLondonEnglandProperties.class,
        TransportForLosAngelesUsProperties.class,
        TransportForManchesterEnglandProperties.class,
        TransportForNorwayProperties.class,
        TransportForOttawaCanadaProperties.class,
        TransportForParisFranceProperties.class,
        TransportForPhiladelphiaUsProperties.class,
        TransportForSaoPauloBrazilProperties.class,
        TransportForSpainProperties.class,
        TransportForSwedenProperties.class,
        TransportForSwitzerlandProperties.class,
        TransportForSwitzerlandProperties.class,
        TransportForTheNetherlandsProperties.class,
        TransportForTheNetherlandsProperties.class,
        TransportForTorontoCanadaProperties.class,
        TransportForUkProperties.class,
        TransportForUnitedStatesProperties.class,
        TransportForVancouverCanadaProperties.class,
        TransportForWashingtonUsProperties.class,
        TransportRestProperties.class,
        TripadvisorProperties.class,
        UberProperties.class,
        VelibMetropolisParisFranceProperties.class
})
public class TransportationAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.adsbexchange.enabled", havingValue = "true", matchIfMissing = true)
    public AdsBExchangeClient adsbexchangeClient(AdsBExchangeProperties properties) {
        return createClient(AdsBExchangeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.airportsapi.enabled", havingValue = "true", matchIfMissing = true)
    public AirportsapiClient airportsapiClient(AirportsapiProperties properties) {
        return createClient(AirportsapiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.aishub.enabled", havingValue = "true", matchIfMissing = true)
    public AisHubClient aishubClient(AisHubProperties properties) {
        return createClient(AisHubClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.amadeusfordevelopers.enabled", havingValue = "true", matchIfMissing = true)
    public AmadeusForDevelopersClient amadeusfordevelopersClient(AmadeusForDevelopersProperties properties) {
        return createClient(AmadeusForDevelopersClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.apilayeraviationstack.enabled", havingValue = "true", matchIfMissing = true)
    public ApilayerAviationstackClient apilayeraviationstackClient(ApilayerAviationstackProperties properties) {
        return createClient(ApilayerAviationstackClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.apimetro.enabled", havingValue = "true", matchIfMissing = true)
    public ApimetroClient apimetroClient(ApimetroProperties properties) {
        return createClient(ApimetroClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.aviationapi.enabled", havingValue = "true", matchIfMissing = true)
    public AviationapiClient aviationapiClient(AviationapiProperties properties) {
        return createClient(AviationapiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.az511.enabled", havingValue = "true", matchIfMissing = true)
    public Az511Client az511Client(Az511Properties properties) {
        return createClient(Az511Client.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.bayarearapidtransit.enabled", havingValue = "true", matchIfMissing = true)
    public BayAreaRapidTransitClient bayarearapidtransitClient(BayAreaRapidTransitProperties properties) {
        return createClient(BayAreaRapidTransitClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.bcferries.enabled", havingValue = "true", matchIfMissing = true)
    public BcFerriesClient bcferriesClient(BcFerriesProperties properties) {
        return createClient(BcFerriesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.bicboxtech.enabled", havingValue = "true", matchIfMissing = true)
    public BicBoxtechClient bicboxtechClient(BicBoxtechProperties properties) {
        return createClient(BicBoxtechClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.blablacar.enabled", havingValue = "true", matchIfMissing = true)
    public BlablacarClient blablacarClient(BlablacarProperties properties) {
        return createClient(BlablacarClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.bostonmbtatransit.enabled", havingValue = "true", matchIfMissing = true)
    public BostonMbtaTransitClient bostonmbtatransitClient(BostonMbtaTransitProperties properties) {
        return createClient(BostonMbtaTransitClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.communitytransit.enabled", havingValue = "true", matchIfMissing = true)
    public CommunityTransitClient communitytransitClient(CommunityTransitProperties properties) {
        return createClient(CommunityTransitClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.compareflightprices.enabled", havingValue = "true", matchIfMissing = true)
    public CompareFlightPricesClient compareflightpricesClient(CompareFlightPricesProperties properties) {
        return createClient(CompareFlightPricesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.cts.enabled", havingValue = "true", matchIfMissing = true)
    public CtsClient ctsClient(CtsProperties properties) {
        return createClient(CtsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.grab.enabled", havingValue = "true", matchIfMissing = true)
    public GrabClient grabClient(GrabProperties properties) {
        return createClient(GrabClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.graphhopper.enabled", havingValue = "true", matchIfMissing = true)
    public GraphhopperClient graphhopperClient(GraphhopperProperties properties) {
        return createClient(GraphhopperClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.icelandicapis.enabled", havingValue = "true", matchIfMissing = true)
    public IcelandicApisClient icelandicapisClient(IcelandicApisProperties properties) {
        return createClient(IcelandicApisClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.impalahotelbookings.enabled", havingValue = "true", matchIfMissing = true)
    public ImpalaHotelBookingsClient impalahotelbookingsClient(ImpalaHotelBookingsProperties properties) {
        return createClient(ImpalaHotelBookingsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.izi.enabled", havingValue = "true", matchIfMissing = true)
    public IziClient iziClient(IziProperties properties) {
        return createClient(IziClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.landtransportauthoritydatamallsingapore.enabled", havingValue = "true", matchIfMissing = true)
    public LandTransportAuthorityDatamallSingaporeClient landtransportauthoritydatamallsingaporeClient(LandTransportAuthorityDatamallSingaporeProperties properties) {
        return createClient(LandTransportAuthorityDatamallSingaporeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.metrolisboa.enabled", havingValue = "true", matchIfMissing = true)
    public MetroLisboaClient metrolisboaClient(MetroLisboaProperties properties) {
        return createClient(MetroLisboaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.navitia.enabled", havingValue = "true", matchIfMissing = true)
    public NavitiaClient navitiaClient(NavitiaProperties properties) {
        return createClient(NavitiaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.openchargemap.enabled", havingValue = "true", matchIfMissing = true)
    public OpenChargeMapClient openchargemapClient(OpenChargeMapProperties properties) {
        return createClient(OpenChargeMapClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.oriznvisa.enabled", havingValue = "true", matchIfMissing = true)
    public OriznVisaClient oriznvisaClient(OriznVisaProperties properties) {
        return createClient(OriznVisaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.openskynetwork.enabled", havingValue = "true", matchIfMissing = true)
    public OpenskyNetworkClient openskynetworkClient(OpenskyNetworkProperties properties) {
        return createClient(OpenskyNetworkClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.railwaytransportforfrance.enabled", havingValue = "true", matchIfMissing = true)
    public RailwayTransportForFranceClient railwaytransportforfranceClient(RailwayTransportForFranceProperties properties) {
        return createClient(RailwayTransportForFranceClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.refugerestrooms.enabled", havingValue = "true", matchIfMissing = true)
    public RefugeRestroomsClient refugerestroomsClient(RefugeRestroomsProperties properties) {
        return createClient(RefugeRestroomsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.sabrefordevelopers.enabled", havingValue = "true", matchIfMissing = true)
    public SabreForDevelopersClient sabrefordevelopersClient(SabreForDevelopersProperties properties) {
        return createClient(SabreForDevelopersClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.schipholairport.enabled", havingValue = "true", matchIfMissing = true)
    public SchipholAirportClient schipholairportClient(SchipholAirportProperties properties) {
        return createClient(SchipholAirportClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.tankerkoenig.enabled", havingValue = "true", matchIfMissing = true)
    public TankerkoenigClient tankerkoenigClient(TankerkoenigProperties properties) {
        return createClient(TankerkoenigClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transitland.enabled", havingValue = "true", matchIfMissing = true)
    public TransitlandClient transitlandClient(TransitlandProperties properties) {
        return createClient(TransitlandClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforatlantaus.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForAtlantaUsClient transportforatlantausClient(TransportForAtlantaUsProperties properties) {
        return createClient(TransportForAtlantaUsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforaucklandnewzealand.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForAucklandNewZealandClient transportforaucklandnewzealandClient(TransportForAucklandNewZealandProperties properties) {
        return createClient(TransportForAucklandNewZealandClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforbelgium.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForBelgiumClient transportforbelgiumClient(TransportForBelgiumProperties properties) {
        return createClient(TransportForBelgiumClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforberlingermany.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForBerlinGermanyClient transportforberlingermanyClient(TransportForBerlinGermanyProperties properties) {
        return createClient(TransportForBerlinGermanyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforbordeauxfrance.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForBordeauxFranceClient transportforbordeauxfranceClient(TransportForBordeauxFranceProperties properties) {
        return createClient(TransportForBordeauxFranceClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforbudapesthungary.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForBudapestHungaryClient transportforbudapesthungaryClient(TransportForBudapestHungaryProperties properties) {
        return createClient(TransportForBudapestHungaryClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforchicagous.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForChicagoUsClient transportforchicagousClient(TransportForChicagoUsProperties properties) {
        return createClient(TransportForChicagoUsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforczechrepublic.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForCzechRepublicClient transportforczechrepublicClient(TransportForCzechRepublicProperties properties) {
        return createClient(TransportForCzechRepublicClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportfordenverus.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForDenverUsClient transportfordenverusClient(TransportForDenverUsProperties properties) {
        return createClient(TransportForDenverUsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforfinland.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForFinlandClient transportforfinlandClient(TransportForFinlandProperties properties) {
        return createClient(TransportForFinlandClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforgermany.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForGermanyClient transportforgermanyClient(TransportForGermanyProperties properties) {
        return createClient(TransportForGermanyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforgrenoblefrance.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForGrenobleFranceClient transportforgrenoblefranceClient(TransportForGrenobleFranceProperties properties) {
        return createClient(TransportForGrenobleFranceClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforhessengermany.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForHessenGermanyClient transportforhessengermanyClient(TransportForHessenGermanyProperties properties) {
        return createClient(TransportForHessenGermanyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforhonoluluus.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForHonoluluUsClient transportforhonoluluusClient(TransportForHonoluluUsProperties properties) {
        return createClient(TransportForHonoluluUsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforlisbonportugal.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForLisbonPortugalClient transportforlisbonportugalClient(TransportForLisbonPortugalProperties properties) {
        return createClient(TransportForLisbonPortugalClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforlondonengland.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForLondonEnglandClient transportforlondonenglandClient(TransportForLondonEnglandProperties properties) {
        return createClient(TransportForLondonEnglandClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforlosangelesus.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForLosAngelesUsClient transportforlosangelesusClient(TransportForLosAngelesUsProperties properties) {
        return createClient(TransportForLosAngelesUsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportformanchesterengland.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForManchesterEnglandClient transportformanchesterenglandClient(TransportForManchesterEnglandProperties properties) {
        return createClient(TransportForManchesterEnglandClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportfornorway.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForNorwayClient transportfornorwayClient(TransportForNorwayProperties properties) {
        return createClient(TransportForNorwayClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforottawacanada.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForOttawaCanadaClient transportforottawacanadaClient(TransportForOttawaCanadaProperties properties) {
        return createClient(TransportForOttawaCanadaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforparisfrance.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForParisFranceClient transportforparisfranceClient(TransportForParisFranceProperties properties) {
        return createClient(TransportForParisFranceClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforphiladelphiaus.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForPhiladelphiaUsClient transportforphiladelphiausClient(TransportForPhiladelphiaUsProperties properties) {
        return createClient(TransportForPhiladelphiaUsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforsaopaulobrazil.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForSaoPauloBrazilClient transportforsaopaulobrazilClient(TransportForSaoPauloBrazilProperties properties) {
        return createClient(TransportForSaoPauloBrazilClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforspain.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForSpainClient transportforspainClient(TransportForSpainProperties properties) {
        return createClient(TransportForSpainClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforsweden.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForSwedenClient transportforswedenClient(TransportForSwedenProperties properties) {
        return createClient(TransportForSwedenClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforswitzerland.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForSwitzerlandClient transportforswitzerlandClient(TransportForSwitzerlandProperties properties) {
        return createClient(TransportForSwitzerlandClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforswitzerland2.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForSwitzerlandClient transportforswitzerland2Client(TransportForSwitzerlandProperties properties) {
        return createClient(TransportForSwitzerlandClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforthenetherlands.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForTheNetherlandsClient transportforthenetherlandsClient(TransportForTheNetherlandsProperties properties) {
        return createClient(TransportForTheNetherlandsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforthenetherlands2.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForTheNetherlandsClient transportforthenetherlands2Client(TransportForTheNetherlandsProperties properties) {
        return createClient(TransportForTheNetherlandsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportfortorontocanada.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForTorontoCanadaClient transportfortorontocanadaClient(TransportForTorontoCanadaProperties properties) {
        return createClient(TransportForTorontoCanadaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforuk.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForUkClient transportforukClient(TransportForUkProperties properties) {
        return createClient(TransportForUkClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforunitedstates.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForUnitedStatesClient transportforunitedstatesClient(TransportForUnitedStatesProperties properties) {
        return createClient(TransportForUnitedStatesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforvancouvercanada.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForVancouverCanadaClient transportforvancouvercanadaClient(TransportForVancouverCanadaProperties properties) {
        return createClient(TransportForVancouverCanadaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportforwashingtonus.enabled", havingValue = "true", matchIfMissing = true)
    public TransportForWashingtonUsClient transportforwashingtonusClient(TransportForWashingtonUsProperties properties) {
        return createClient(TransportForWashingtonUsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.transportrest.enabled", havingValue = "true", matchIfMissing = true)
    public TransportRestClient transportrestClient(TransportRestProperties properties) {
        return createClient(TransportRestClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.tripadvisor.enabled", havingValue = "true", matchIfMissing = true)
    public TripadvisorClient tripadvisorClient(TripadvisorProperties properties) {
        return createClient(TripadvisorClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.uber.enabled", havingValue = "true", matchIfMissing = true)
    public UberClient uberClient(UberProperties properties) {
        return createClient(UberClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.transportation.velibmetropolisparisfrance.enabled", havingValue = "true", matchIfMissing = true)
    public VelibMetropolisParisFranceClient velibmetropolisparisfranceClient(VelibMetropolisParisFranceProperties properties) {
        return createClient(VelibMetropolisParisFranceClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
