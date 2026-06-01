package com.bzz.miniapis.sdk.government;

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
        BankNegaraMalaysiaOpenDataProperties.class,
        BclawsProperties.class,
        BrazilProperties.class,
        BrazilCentralBankOpenDataProperties.class,
        BrazilReceitaWsProperties.class,
        BrazilianChamberOfDeputiesOpenDataProperties.class,
        CpfhubProperties.class,
        CensusGovProperties.class,
        CityBerlinProperties.class,
        CityGdaSkProperties.class,
        CityGdyniaProperties.class,
        CityHelsinkiProperties.class,
        CityLvivProperties.class,
        CityNantesOpenDataProperties.class,
        CityNewYorkOpenDataProperties.class,
        CityPragueOpenDataProperties.class,
        CityTorontoOpenDataProperties.class,
        CodeGovProperties.class,
        ColoradoInformationMarketplaceProperties.class,
        DataUsaProperties.class,
        DataGovProperties.class,
        DataParliamentUkProperties.class,
        DeutscherBundestagDipProperties.class,
        DistrictOfColumbiaOpenDataProperties.class,
        EpaProperties.class,
        FbiWantedProperties.class,
        FecProperties.class,
        FederalRegisterProperties.class,
        FoodStandardsAgencyProperties.class,
        GazetteDataUkProperties.class,
        GunPolicyProperties.class,
        IndianPincodeProperties.class,
        IneiProperties.class,
        InterpolRedNoticesProperties.class,
        IstanbulBbOpenDataProperties.class,
        LocalgovJpProperties.class,
        NationalParkServiceUsProperties.class,
        OpenGovernmentActProperties.class,
        OpenGovernmentArgentinaProperties.class,
        OpenGovernmentAustraliaProperties.class,
        OpenGovernmentAustriaProperties.class,
        OpenGovernmentBelgiumProperties.class,
        OpenGovernmentCanadaProperties.class,
        OpenGovernmentColombiaProperties.class,
        OpenGovernmentCyprusProperties.class,
        OpenGovernmentCzechRepublicProperties.class,
        OpenGovernmentDenmarkProperties.class,
        OpenGovernmentEstoniaProperties.class,
        OpenGovernmentFinlandProperties.class,
        OpenGovernmentFranceProperties.class,
        OpenGovernmentGermanyProperties.class,
        OpenGovernmentGreeceProperties.class,
        OpenGovernmentIndiaProperties.class,
        OpenGovernmentIrelandProperties.class,
        OpenGovernmentItalyProperties.class,
        OpenGovernmentKoreaProperties.class,
        OpenGovernmentLithuaniaProperties.class,
        OpenGovernmentLuxembourgProperties.class,
        OpenGovernmentMexicoProperties.class,
        OpenGovernmentMexicoProperties.class,
        OpenGovernmentNetherlandsProperties.class,
        OpenGovernmentNewSouthWalesProperties.class,
        OpenGovernmentNewZealandProperties.class,
        OpenGovernmentNorwayProperties.class,
        OpenGovernmentPeruProperties.class,
        OpenGovernmentPolandProperties.class,
        OpenGovernmentPortugalProperties.class,
        OpenGovernmentQueenslandGovernmentProperties.class,
        OpenGovernmentRomaniaProperties.class,
        OpenGovernmentSaudiArabiaProperties.class,
        OpenGovernmentSingaporeProperties.class,
        OpenGovernmentSlovakiaProperties.class,
        OpenGovernmentSloveniaProperties.class,
        OpenGovernmentSouthAustralianGovernmentProperties.class,
        OpenGovernmentSpainProperties.class,
        OpenGovernmentSwedenProperties.class,
        OpenGovernmentSwitzerlandProperties.class,
        OpenGovernmentTaiwanProperties.class,
        OpenGovernmentThailandProperties.class,
        OpenGovernmentUkProperties.class,
        OpenGovernmentUsaProperties.class,
        OpenGovernmentVictoriaStateGovernmentProperties.class,
        OpenGovernmentWestAustraliaProperties.class,
        OpenregistryProperties.class,
        PrcExamScheduleProperties.class,
        RepresentByOpenNorthProperties.class,
        UkCompaniesHouseProperties.class,
        UsPresidentialElectionDataByTogatechProperties.class,
        UsaGovProperties.class,
        UsaspendingGovProperties.class
})
public class GovernmentAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.banknegaramalaysiaopendata.enabled", havingValue = "true", matchIfMissing = true)
    public BankNegaraMalaysiaOpenDataClient banknegaramalaysiaopendataClient(BankNegaraMalaysiaOpenDataProperties properties) {
        return createClient(BankNegaraMalaysiaOpenDataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.bclaws.enabled", havingValue = "true", matchIfMissing = true)
    public BclawsClient bclawsClient(BclawsProperties properties) {
        return createClient(BclawsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.brazil.enabled", havingValue = "true", matchIfMissing = true)
    public BrazilClient brazilClient(BrazilProperties properties) {
        return createClient(BrazilClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.brazilcentralbankopendata.enabled", havingValue = "true", matchIfMissing = true)
    public BrazilCentralBankOpenDataClient brazilcentralbankopendataClient(BrazilCentralBankOpenDataProperties properties) {
        return createClient(BrazilCentralBankOpenDataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.brazilreceitaws.enabled", havingValue = "true", matchIfMissing = true)
    public BrazilReceitaWsClient brazilreceitawsClient(BrazilReceitaWsProperties properties) {
        return createClient(BrazilReceitaWsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.brazilianchamberofdeputiesopendata.enabled", havingValue = "true", matchIfMissing = true)
    public BrazilianChamberOfDeputiesOpenDataClient brazilianchamberofdeputiesopendataClient(BrazilianChamberOfDeputiesOpenDataProperties properties) {
        return createClient(BrazilianChamberOfDeputiesOpenDataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.cpfhub.enabled", havingValue = "true", matchIfMissing = true)
    public CpfhubClient cpfhubClient(CpfhubProperties properties) {
        return createClient(CpfhubClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.censusgov.enabled", havingValue = "true", matchIfMissing = true)
    public CensusGovClient censusgovClient(CensusGovProperties properties) {
        return createClient(CensusGovClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.cityberlin.enabled", havingValue = "true", matchIfMissing = true)
    public CityBerlinClient cityberlinClient(CityBerlinProperties properties) {
        return createClient(CityBerlinClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.citygdask.enabled", havingValue = "true", matchIfMissing = true)
    public CityGdaSkClient citygdaskClient(CityGdaSkProperties properties) {
        return createClient(CityGdaSkClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.citygdynia.enabled", havingValue = "true", matchIfMissing = true)
    public CityGdyniaClient citygdyniaClient(CityGdyniaProperties properties) {
        return createClient(CityGdyniaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.cityhelsinki.enabled", havingValue = "true", matchIfMissing = true)
    public CityHelsinkiClient cityhelsinkiClient(CityHelsinkiProperties properties) {
        return createClient(CityHelsinkiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.citylviv.enabled", havingValue = "true", matchIfMissing = true)
    public CityLvivClient citylvivClient(CityLvivProperties properties) {
        return createClient(CityLvivClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.citynantesopendata.enabled", havingValue = "true", matchIfMissing = true)
    public CityNantesOpenDataClient citynantesopendataClient(CityNantesOpenDataProperties properties) {
        return createClient(CityNantesOpenDataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.citynewyorkopendata.enabled", havingValue = "true", matchIfMissing = true)
    public CityNewYorkOpenDataClient citynewyorkopendataClient(CityNewYorkOpenDataProperties properties) {
        return createClient(CityNewYorkOpenDataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.citypragueopendata.enabled", havingValue = "true", matchIfMissing = true)
    public CityPragueOpenDataClient citypragueopendataClient(CityPragueOpenDataProperties properties) {
        return createClient(CityPragueOpenDataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.citytorontoopendata.enabled", havingValue = "true", matchIfMissing = true)
    public CityTorontoOpenDataClient citytorontoopendataClient(CityTorontoOpenDataProperties properties) {
        return createClient(CityTorontoOpenDataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.codegov.enabled", havingValue = "true", matchIfMissing = true)
    public CodeGovClient codegovClient(CodeGovProperties properties) {
        return createClient(CodeGovClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.coloradoinformationmarketplace.enabled", havingValue = "true", matchIfMissing = true)
    public ColoradoInformationMarketplaceClient coloradoinformationmarketplaceClient(ColoradoInformationMarketplaceProperties properties) {
        return createClient(ColoradoInformationMarketplaceClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.datausa.enabled", havingValue = "true", matchIfMissing = true)
    public DataUsaClient datausaClient(DataUsaProperties properties) {
        return createClient(DataUsaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.datagov.enabled", havingValue = "true", matchIfMissing = true)
    public DataGovClient datagovClient(DataGovProperties properties) {
        return createClient(DataGovClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.dataparliamentuk.enabled", havingValue = "true", matchIfMissing = true)
    public DataParliamentUkClient dataparliamentukClient(DataParliamentUkProperties properties) {
        return createClient(DataParliamentUkClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.deutscherbundestagdip.enabled", havingValue = "true", matchIfMissing = true)
    public DeutscherBundestagDipClient deutscherbundestagdipClient(DeutscherBundestagDipProperties properties) {
        return createClient(DeutscherBundestagDipClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.districtofcolumbiaopendata.enabled", havingValue = "true", matchIfMissing = true)
    public DistrictOfColumbiaOpenDataClient districtofcolumbiaopendataClient(DistrictOfColumbiaOpenDataProperties properties) {
        return createClient(DistrictOfColumbiaOpenDataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.epa.enabled", havingValue = "true", matchIfMissing = true)
    public EpaClient epaClient(EpaProperties properties) {
        return createClient(EpaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.fbiwanted.enabled", havingValue = "true", matchIfMissing = true)
    public FbiWantedClient fbiwantedClient(FbiWantedProperties properties) {
        return createClient(FbiWantedClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.fec.enabled", havingValue = "true", matchIfMissing = true)
    public FecClient fecClient(FecProperties properties) {
        return createClient(FecClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.federalregister.enabled", havingValue = "true", matchIfMissing = true)
    public FederalRegisterClient federalregisterClient(FederalRegisterProperties properties) {
        return createClient(FederalRegisterClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.foodstandardsagency.enabled", havingValue = "true", matchIfMissing = true)
    public FoodStandardsAgencyClient foodstandardsagencyClient(FoodStandardsAgencyProperties properties) {
        return createClient(FoodStandardsAgencyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.gazettedatauk.enabled", havingValue = "true", matchIfMissing = true)
    public GazetteDataUkClient gazettedataukClient(GazetteDataUkProperties properties) {
        return createClient(GazetteDataUkClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.gunpolicy.enabled", havingValue = "true", matchIfMissing = true)
    public GunPolicyClient gunpolicyClient(GunPolicyProperties properties) {
        return createClient(GunPolicyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.indianpincode.enabled", havingValue = "true", matchIfMissing = true)
    public IndianPincodeClient indianpincodeClient(IndianPincodeProperties properties) {
        return createClient(IndianPincodeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.inei.enabled", havingValue = "true", matchIfMissing = true)
    public IneiClient ineiClient(IneiProperties properties) {
        return createClient(IneiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.interpolrednotices.enabled", havingValue = "true", matchIfMissing = true)
    public InterpolRedNoticesClient interpolrednoticesClient(InterpolRedNoticesProperties properties) {
        return createClient(InterpolRedNoticesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.istanbulbbopendata.enabled", havingValue = "true", matchIfMissing = true)
    public IstanbulBbOpenDataClient istanbulbbopendataClient(IstanbulBbOpenDataProperties properties) {
        return createClient(IstanbulBbOpenDataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.localgovjp.enabled", havingValue = "true", matchIfMissing = true)
    public LocalgovJpClient localgovjpClient(LocalgovJpProperties properties) {
        return createClient(LocalgovJpClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.nationalparkserviceus.enabled", havingValue = "true", matchIfMissing = true)
    public NationalParkServiceUsClient nationalparkserviceusClient(NationalParkServiceUsProperties properties) {
        return createClient(NationalParkServiceUsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentact.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentActClient opengovernmentactClient(OpenGovernmentActProperties properties) {
        return createClient(OpenGovernmentActClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentargentina.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentArgentinaClient opengovernmentargentinaClient(OpenGovernmentArgentinaProperties properties) {
        return createClient(OpenGovernmentArgentinaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentaustralia.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentAustraliaClient opengovernmentaustraliaClient(OpenGovernmentAustraliaProperties properties) {
        return createClient(OpenGovernmentAustraliaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentaustria.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentAustriaClient opengovernmentaustriaClient(OpenGovernmentAustriaProperties properties) {
        return createClient(OpenGovernmentAustriaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentbelgium.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentBelgiumClient opengovernmentbelgiumClient(OpenGovernmentBelgiumProperties properties) {
        return createClient(OpenGovernmentBelgiumClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentcanada.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentCanadaClient opengovernmentcanadaClient(OpenGovernmentCanadaProperties properties) {
        return createClient(OpenGovernmentCanadaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentcolombia.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentColombiaClient opengovernmentcolombiaClient(OpenGovernmentColombiaProperties properties) {
        return createClient(OpenGovernmentColombiaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentcyprus.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentCyprusClient opengovernmentcyprusClient(OpenGovernmentCyprusProperties properties) {
        return createClient(OpenGovernmentCyprusClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentczechrepublic.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentCzechRepublicClient opengovernmentczechrepublicClient(OpenGovernmentCzechRepublicProperties properties) {
        return createClient(OpenGovernmentCzechRepublicClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentdenmark.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentDenmarkClient opengovernmentdenmarkClient(OpenGovernmentDenmarkProperties properties) {
        return createClient(OpenGovernmentDenmarkClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentestonia.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentEstoniaClient opengovernmentestoniaClient(OpenGovernmentEstoniaProperties properties) {
        return createClient(OpenGovernmentEstoniaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentfinland.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentFinlandClient opengovernmentfinlandClient(OpenGovernmentFinlandProperties properties) {
        return createClient(OpenGovernmentFinlandClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentfrance.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentFranceClient opengovernmentfranceClient(OpenGovernmentFranceProperties properties) {
        return createClient(OpenGovernmentFranceClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentgermany.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentGermanyClient opengovernmentgermanyClient(OpenGovernmentGermanyProperties properties) {
        return createClient(OpenGovernmentGermanyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentgreece.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentGreeceClient opengovernmentgreeceClient(OpenGovernmentGreeceProperties properties) {
        return createClient(OpenGovernmentGreeceClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentindia.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentIndiaClient opengovernmentindiaClient(OpenGovernmentIndiaProperties properties) {
        return createClient(OpenGovernmentIndiaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentireland.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentIrelandClient opengovernmentirelandClient(OpenGovernmentIrelandProperties properties) {
        return createClient(OpenGovernmentIrelandClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentitaly.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentItalyClient opengovernmentitalyClient(OpenGovernmentItalyProperties properties) {
        return createClient(OpenGovernmentItalyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentkorea.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentKoreaClient opengovernmentkoreaClient(OpenGovernmentKoreaProperties properties) {
        return createClient(OpenGovernmentKoreaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentlithuania.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentLithuaniaClient opengovernmentlithuaniaClient(OpenGovernmentLithuaniaProperties properties) {
        return createClient(OpenGovernmentLithuaniaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentluxembourg.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentLuxembourgClient opengovernmentluxembourgClient(OpenGovernmentLuxembourgProperties properties) {
        return createClient(OpenGovernmentLuxembourgClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentmexico.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentMexicoClient opengovernmentmexicoClient(OpenGovernmentMexicoProperties properties) {
        return createClient(OpenGovernmentMexicoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentmexico2.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentMexicoClient opengovernmentmexico2Client(OpenGovernmentMexicoProperties properties) {
        return createClient(OpenGovernmentMexicoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentnetherlands.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentNetherlandsClient opengovernmentnetherlandsClient(OpenGovernmentNetherlandsProperties properties) {
        return createClient(OpenGovernmentNetherlandsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentnewsouthwales.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentNewSouthWalesClient opengovernmentnewsouthwalesClient(OpenGovernmentNewSouthWalesProperties properties) {
        return createClient(OpenGovernmentNewSouthWalesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentnewzealand.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentNewZealandClient opengovernmentnewzealandClient(OpenGovernmentNewZealandProperties properties) {
        return createClient(OpenGovernmentNewZealandClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentnorway.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentNorwayClient opengovernmentnorwayClient(OpenGovernmentNorwayProperties properties) {
        return createClient(OpenGovernmentNorwayClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentperu.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentPeruClient opengovernmentperuClient(OpenGovernmentPeruProperties properties) {
        return createClient(OpenGovernmentPeruClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentpoland.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentPolandClient opengovernmentpolandClient(OpenGovernmentPolandProperties properties) {
        return createClient(OpenGovernmentPolandClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentportugal.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentPortugalClient opengovernmentportugalClient(OpenGovernmentPortugalProperties properties) {
        return createClient(OpenGovernmentPortugalClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentqueenslandgovernment.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentQueenslandGovernmentClient opengovernmentqueenslandgovernmentClient(OpenGovernmentQueenslandGovernmentProperties properties) {
        return createClient(OpenGovernmentQueenslandGovernmentClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentromania.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentRomaniaClient opengovernmentromaniaClient(OpenGovernmentRomaniaProperties properties) {
        return createClient(OpenGovernmentRomaniaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentsaudiarabia.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentSaudiArabiaClient opengovernmentsaudiarabiaClient(OpenGovernmentSaudiArabiaProperties properties) {
        return createClient(OpenGovernmentSaudiArabiaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentsingapore.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentSingaporeClient opengovernmentsingaporeClient(OpenGovernmentSingaporeProperties properties) {
        return createClient(OpenGovernmentSingaporeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentslovakia.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentSlovakiaClient opengovernmentslovakiaClient(OpenGovernmentSlovakiaProperties properties) {
        return createClient(OpenGovernmentSlovakiaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentslovenia.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentSloveniaClient opengovernmentsloveniaClient(OpenGovernmentSloveniaProperties properties) {
        return createClient(OpenGovernmentSloveniaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentsouthaustraliangovernment.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentSouthAustralianGovernmentClient opengovernmentsouthaustraliangovernmentClient(OpenGovernmentSouthAustralianGovernmentProperties properties) {
        return createClient(OpenGovernmentSouthAustralianGovernmentClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentspain.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentSpainClient opengovernmentspainClient(OpenGovernmentSpainProperties properties) {
        return createClient(OpenGovernmentSpainClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentsweden.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentSwedenClient opengovernmentswedenClient(OpenGovernmentSwedenProperties properties) {
        return createClient(OpenGovernmentSwedenClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentswitzerland.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentSwitzerlandClient opengovernmentswitzerlandClient(OpenGovernmentSwitzerlandProperties properties) {
        return createClient(OpenGovernmentSwitzerlandClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmenttaiwan.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentTaiwanClient opengovernmenttaiwanClient(OpenGovernmentTaiwanProperties properties) {
        return createClient(OpenGovernmentTaiwanClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentthailand.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentThailandClient opengovernmentthailandClient(OpenGovernmentThailandProperties properties) {
        return createClient(OpenGovernmentThailandClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentuk.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentUkClient opengovernmentukClient(OpenGovernmentUkProperties properties) {
        return createClient(OpenGovernmentUkClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentusa.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentUsaClient opengovernmentusaClient(OpenGovernmentUsaProperties properties) {
        return createClient(OpenGovernmentUsaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentvictoriastategovernment.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentVictoriaStateGovernmentClient opengovernmentvictoriastategovernmentClient(OpenGovernmentVictoriaStateGovernmentProperties properties) {
        return createClient(OpenGovernmentVictoriaStateGovernmentClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentwestaustralia.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentWestAustraliaClient opengovernmentwestaustraliaClient(OpenGovernmentWestAustraliaProperties properties) {
        return createClient(OpenGovernmentWestAustraliaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.openregistry.enabled", havingValue = "true", matchIfMissing = true)
    public OpenregistryClient openregistryClient(OpenregistryProperties properties) {
        return createClient(OpenregistryClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.prcexamschedule.enabled", havingValue = "true", matchIfMissing = true)
    public PrcExamScheduleClient prcexamscheduleClient(PrcExamScheduleProperties properties) {
        return createClient(PrcExamScheduleClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.representbyopennorth.enabled", havingValue = "true", matchIfMissing = true)
    public RepresentByOpenNorthClient representbyopennorthClient(RepresentByOpenNorthProperties properties) {
        return createClient(RepresentByOpenNorthClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.ukcompanieshouse.enabled", havingValue = "true", matchIfMissing = true)
    public UkCompaniesHouseClient ukcompanieshouseClient(UkCompaniesHouseProperties properties) {
        return createClient(UkCompaniesHouseClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.uspresidentialelectiondatabytogatech.enabled", havingValue = "true", matchIfMissing = true)
    public UsPresidentialElectionDataByTogatechClient uspresidentialelectiondatabytogatechClient(UsPresidentialElectionDataByTogatechProperties properties) {
        return createClient(UsPresidentialElectionDataByTogatechClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.usagov.enabled", havingValue = "true", matchIfMissing = true)
    public UsaGovClient usagovClient(UsaGovProperties properties) {
        return createClient(UsaGovClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.usaspendinggov.enabled", havingValue = "true", matchIfMissing = true)
    public UsaspendingGovClient usaspendinggovClient(UsaspendingGovProperties properties) {
        return createClient(UsaspendingGovClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
