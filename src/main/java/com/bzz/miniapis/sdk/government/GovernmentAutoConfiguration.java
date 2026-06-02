package com.bzz.miniapis.sdk.government;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        BrazilProperties.class,
        BankNegaraMalaysiaOpenDataProperties.class,
        CityBerlinProperties.class,
        BclawsProperties.class,
        CityLvivProperties.class,
        DataUsaProperties.class,
        DataParliamentUkProperties.class,
        BrazilCentralBankOpenDataProperties.class,
        GazetteDataUkProperties.class,
        CityHelsinkiProperties.class,
        DeutscherBundestagDipProperties.class,
        CensusGovProperties.class,
        InterpolRedNoticesProperties.class,
        FederalRegisterProperties.class,
        DataGovProperties.class,
        LocalgovJpProperties.class,
        EpaProperties.class,
        FbiWantedProperties.class,
        CityTorontoOpenDataProperties.class,
        BrazilReceitaWsProperties.class,
        CpfhubProperties.class,
        CityGdaSkProperties.class,
        NationalParkServiceUsProperties.class,
        OpenGovernmentAustriaProperties.class,
        OpenGovernmentAustraliaProperties.class,
        CityNantesOpenDataProperties.class,
        OpenGovernmentFranceProperties.class,
        CityNewYorkOpenDataProperties.class,
        FoodStandardsAgencyProperties.class,
        IndianPincodeProperties.class,
        ColoradoInformationMarketplaceProperties.class,
        OpenGovernmentArgentinaProperties.class,
        CodeGovProperties.class,
        DistrictOfColumbiaOpenDataProperties.class,
        OpenGovernmentNewSouthWalesProperties.class,
        FecProperties.class,
        OpenGovernmentGermanyProperties.class,
        OpenGovernmentCyprusProperties.class,
        OpenGovernmentCzechRepublicProperties.class,
        OpenGovernmentIrelandProperties.class,
        OpenGovernmentNewZealandProperties.class,
        OpenGovernmentQueenslandGovernmentProperties.class,
        CityGdyniaProperties.class,
        OpenGovernmentActProperties.class,
        CityPragueOpenDataProperties.class,
        OpenGovernmentThailandProperties.class,
        BrazilianChamberOfDeputiesOpenDataProperties.class,
        OpenGovernmentSouthAustralianGovernmentProperties.class,
        GunPolicyProperties.class,
        IstanbulBbOpenDataProperties.class,
        OpenGovernmentMexicoProperties.class,
        OpenGovernmentLithuaniaProperties.class,
        OpenGovernmentLuxembourgProperties.class,
        OpenGovernmentCanadaProperties.class,
        OpenGovernmentWestAustraliaProperties.class,
        OpenGovernmentSpainProperties.class,
        OpenGovernmentNorwayProperties.class,
        OpenGovernmentEstoniaProperties.class,
        OpenGovernmentPolandProperties.class,
        OpenGovernmentColombiaProperties.class,
        OpenGovernmentNetherlandsProperties.class,
        OpenGovernmentPeruProperties.class,
        OpenGovernmentItalyProperties.class,
        OpenGovernmentSwedenProperties.class,
        OpenGovernmentVictoriaStateGovernmentProperties.class,
        OpenGovernmentPortugalProperties.class,
        UsPresidentialElectionDataByTogatechProperties.class,
        OpenGovernmentGreeceProperties.class,
        OpenGovernmentBelgiumProperties.class,
        OpenGovernmentTaiwanProperties.class,
        OpenGovernmentSingaporeProperties.class,
        RepresentByOpenNorthProperties.class,
        OpenGovernmentSloveniaProperties.class,
        UsaGovProperties.class,
        UkCompaniesHouseProperties.class,
        OpenGovernmentMexico2Properties.class,
        UsaspendingGovProperties.class,
        OpenGovernmentUkProperties.class,
        OpenGovernmentSwitzerlandProperties.class,
        OpenGovernmentUsaProperties.class,
        OpenGovernmentFinlandProperties.class,
        OpenGovernmentIndiaProperties.class
})
public class GovernmentAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.brazil.enabled", havingValue = "true", matchIfMissing = true)
    public BrazilClient brazilClient(BrazilProperties properties) {
        return new BrazilClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.banknegaramalaysiaopendata.enabled", havingValue = "true", matchIfMissing = true)
    public BankNegaraMalaysiaOpenDataClient banknegaramalaysiaopendataClient(BankNegaraMalaysiaOpenDataProperties properties) {
        return new BankNegaraMalaysiaOpenDataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.cityberlin.enabled", havingValue = "true", matchIfMissing = true)
    public CityBerlinClient cityberlinClient(CityBerlinProperties properties) {
        return new CityBerlinClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.bclaws.enabled", havingValue = "true", matchIfMissing = true)
    public BclawsClient bclawsClient(BclawsProperties properties) {
        return new BclawsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.citylviv.enabled", havingValue = "true", matchIfMissing = true)
    public CityLvivClient citylvivClient(CityLvivProperties properties) {
        return new CityLvivClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.datausa.enabled", havingValue = "true", matchIfMissing = true)
    public DataUsaClient datausaClient(DataUsaProperties properties) {
        return new DataUsaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.dataparliamentuk.enabled", havingValue = "true", matchIfMissing = true)
    public DataParliamentUkClient dataparliamentukClient(DataParliamentUkProperties properties) {
        return new DataParliamentUkClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.brazilcentralbankopendata.enabled", havingValue = "true", matchIfMissing = true)
    public BrazilCentralBankOpenDataClient brazilcentralbankopendataClient(BrazilCentralBankOpenDataProperties properties) {
        return new BrazilCentralBankOpenDataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.gazettedatauk.enabled", havingValue = "true", matchIfMissing = true)
    public GazetteDataUkClient gazettedataukClient(GazetteDataUkProperties properties) {
        return new GazetteDataUkClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.cityhelsinki.enabled", havingValue = "true", matchIfMissing = true)
    public CityHelsinkiClient cityhelsinkiClient(CityHelsinkiProperties properties) {
        return new CityHelsinkiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.deutscherbundestagdip.enabled", havingValue = "true", matchIfMissing = true)
    public DeutscherBundestagDipClient deutscherbundestagdipClient(DeutscherBundestagDipProperties properties) {
        return new DeutscherBundestagDipClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.censusgov.enabled", havingValue = "true", matchIfMissing = true)
    public CensusGovClient censusgovClient(CensusGovProperties properties) {
        return new CensusGovClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.interpolrednotices.enabled", havingValue = "true", matchIfMissing = true)
    public InterpolRedNoticesClient interpolrednoticesClient(InterpolRedNoticesProperties properties) {
        return new InterpolRedNoticesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.federalregister.enabled", havingValue = "true", matchIfMissing = true)
    public FederalRegisterClient federalregisterClient(FederalRegisterProperties properties) {
        return new FederalRegisterClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.datagov.enabled", havingValue = "true", matchIfMissing = true)
    public DataGovClient datagovClient(DataGovProperties properties) {
        return new DataGovClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.localgovjp.enabled", havingValue = "true", matchIfMissing = true)
    public LocalgovJpClient localgovjpClient(LocalgovJpProperties properties) {
        return new LocalgovJpClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.epa.enabled", havingValue = "true", matchIfMissing = true)
    public EpaClient epaClient(EpaProperties properties) {
        return new EpaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.fbiwanted.enabled", havingValue = "true", matchIfMissing = true)
    public FbiWantedClient fbiwantedClient(FbiWantedProperties properties) {
        return new FbiWantedClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.citytorontoopendata.enabled", havingValue = "true", matchIfMissing = true)
    public CityTorontoOpenDataClient citytorontoopendataClient(CityTorontoOpenDataProperties properties) {
        return new CityTorontoOpenDataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.brazilreceitaws.enabled", havingValue = "true", matchIfMissing = true)
    public BrazilReceitaWsClient brazilreceitawsClient(BrazilReceitaWsProperties properties) {
        return new BrazilReceitaWsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.cpfhub.enabled", havingValue = "true", matchIfMissing = true)
    public CpfhubClient cpfhubClient(CpfhubProperties properties) {
        return new CpfhubClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.citygdask.enabled", havingValue = "true", matchIfMissing = true)
    public CityGdaSkClient citygdaskClient(CityGdaSkProperties properties) {
        return new CityGdaSkClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.nationalparkserviceus.enabled", havingValue = "true", matchIfMissing = true)
    public NationalParkServiceUsClient nationalparkserviceusClient(NationalParkServiceUsProperties properties) {
        return new NationalParkServiceUsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentaustria.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentAustriaClient opengovernmentaustriaClient(OpenGovernmentAustriaProperties properties) {
        return new OpenGovernmentAustriaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentaustralia.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentAustraliaClient opengovernmentaustraliaClient(OpenGovernmentAustraliaProperties properties) {
        return new OpenGovernmentAustraliaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.citynantesopendata.enabled", havingValue = "true", matchIfMissing = true)
    public CityNantesOpenDataClient citynantesopendataClient(CityNantesOpenDataProperties properties) {
        return new CityNantesOpenDataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentfrance.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentFranceClient opengovernmentfranceClient(OpenGovernmentFranceProperties properties) {
        return new OpenGovernmentFranceClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.citynewyorkopendata.enabled", havingValue = "true", matchIfMissing = true)
    public CityNewYorkOpenDataClient citynewyorkopendataClient(CityNewYorkOpenDataProperties properties) {
        return new CityNewYorkOpenDataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.foodstandardsagency.enabled", havingValue = "true", matchIfMissing = true)
    public FoodStandardsAgencyClient foodstandardsagencyClient(FoodStandardsAgencyProperties properties) {
        return new FoodStandardsAgencyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.indianpincode.enabled", havingValue = "true", matchIfMissing = true)
    public IndianPincodeClient indianpincodeClient(IndianPincodeProperties properties) {
        return new IndianPincodeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.coloradoinformationmarketplace.enabled", havingValue = "true", matchIfMissing = true)
    public ColoradoInformationMarketplaceClient coloradoinformationmarketplaceClient(ColoradoInformationMarketplaceProperties properties) {
        return new ColoradoInformationMarketplaceClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentargentina.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentArgentinaClient opengovernmentargentinaClient(OpenGovernmentArgentinaProperties properties) {
        return new OpenGovernmentArgentinaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.codegov.enabled", havingValue = "true", matchIfMissing = true)
    public CodeGovClient codegovClient(CodeGovProperties properties) {
        return new CodeGovClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.districtofcolumbiaopendata.enabled", havingValue = "true", matchIfMissing = true)
    public DistrictOfColumbiaOpenDataClient districtofcolumbiaopendataClient(DistrictOfColumbiaOpenDataProperties properties) {
        return new DistrictOfColumbiaOpenDataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentnewsouthwales.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentNewSouthWalesClient opengovernmentnewsouthwalesClient(OpenGovernmentNewSouthWalesProperties properties) {
        return new OpenGovernmentNewSouthWalesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.fec.enabled", havingValue = "true", matchIfMissing = true)
    public FecClient fecClient(FecProperties properties) {
        return new FecClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentgermany.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentGermanyClient opengovernmentgermanyClient(OpenGovernmentGermanyProperties properties) {
        return new OpenGovernmentGermanyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentcyprus.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentCyprusClient opengovernmentcyprusClient(OpenGovernmentCyprusProperties properties) {
        return new OpenGovernmentCyprusClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentczechrepublic.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentCzechRepublicClient opengovernmentczechrepublicClient(OpenGovernmentCzechRepublicProperties properties) {
        return new OpenGovernmentCzechRepublicClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentireland.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentIrelandClient opengovernmentirelandClient(OpenGovernmentIrelandProperties properties) {
        return new OpenGovernmentIrelandClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentnewzealand.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentNewZealandClient opengovernmentnewzealandClient(OpenGovernmentNewZealandProperties properties) {
        return new OpenGovernmentNewZealandClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentqueenslandgovernment.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentQueenslandGovernmentClient opengovernmentqueenslandgovernmentClient(OpenGovernmentQueenslandGovernmentProperties properties) {
        return new OpenGovernmentQueenslandGovernmentClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.citygdynia.enabled", havingValue = "true", matchIfMissing = true)
    public CityGdyniaClient citygdyniaClient(CityGdyniaProperties properties) {
        return new CityGdyniaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentact.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentActClient opengovernmentactClient(OpenGovernmentActProperties properties) {
        return new OpenGovernmentActClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.citypragueopendata.enabled", havingValue = "true", matchIfMissing = true)
    public CityPragueOpenDataClient citypragueopendataClient(CityPragueOpenDataProperties properties) {
        return new CityPragueOpenDataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentthailand.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentThailandClient opengovernmentthailandClient(OpenGovernmentThailandProperties properties) {
        return new OpenGovernmentThailandClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.brazilianchamberofdeputiesopendata.enabled", havingValue = "true", matchIfMissing = true)
    public BrazilianChamberOfDeputiesOpenDataClient brazilianchamberofdeputiesopendataClient(BrazilianChamberOfDeputiesOpenDataProperties properties) {
        return new BrazilianChamberOfDeputiesOpenDataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentsouthaustraliangovernment.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentSouthAustralianGovernmentClient opengovernmentsouthaustraliangovernmentClient(OpenGovernmentSouthAustralianGovernmentProperties properties) {
        return new OpenGovernmentSouthAustralianGovernmentClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.gunpolicy.enabled", havingValue = "true", matchIfMissing = true)
    public GunPolicyClient gunpolicyClient(GunPolicyProperties properties) {
        return new GunPolicyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.istanbulbbopendata.enabled", havingValue = "true", matchIfMissing = true)
    public IstanbulBbOpenDataClient istanbulbbopendataClient(IstanbulBbOpenDataProperties properties) {
        return new IstanbulBbOpenDataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentmexico.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentMexicoClient opengovernmentmexicoClient(OpenGovernmentMexicoProperties properties) {
        return new OpenGovernmentMexicoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentlithuania.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentLithuaniaClient opengovernmentlithuaniaClient(OpenGovernmentLithuaniaProperties properties) {
        return new OpenGovernmentLithuaniaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentluxembourg.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentLuxembourgClient opengovernmentluxembourgClient(OpenGovernmentLuxembourgProperties properties) {
        return new OpenGovernmentLuxembourgClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentcanada.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentCanadaClient opengovernmentcanadaClient(OpenGovernmentCanadaProperties properties) {
        return new OpenGovernmentCanadaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentwestaustralia.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentWestAustraliaClient opengovernmentwestaustraliaClient(OpenGovernmentWestAustraliaProperties properties) {
        return new OpenGovernmentWestAustraliaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentspain.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentSpainClient opengovernmentspainClient(OpenGovernmentSpainProperties properties) {
        return new OpenGovernmentSpainClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentnorway.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentNorwayClient opengovernmentnorwayClient(OpenGovernmentNorwayProperties properties) {
        return new OpenGovernmentNorwayClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentestonia.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentEstoniaClient opengovernmentestoniaClient(OpenGovernmentEstoniaProperties properties) {
        return new OpenGovernmentEstoniaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentpoland.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentPolandClient opengovernmentpolandClient(OpenGovernmentPolandProperties properties) {
        return new OpenGovernmentPolandClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentcolombia.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentColombiaClient opengovernmentcolombiaClient(OpenGovernmentColombiaProperties properties) {
        return new OpenGovernmentColombiaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentnetherlands.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentNetherlandsClient opengovernmentnetherlandsClient(OpenGovernmentNetherlandsProperties properties) {
        return new OpenGovernmentNetherlandsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentperu.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentPeruClient opengovernmentperuClient(OpenGovernmentPeruProperties properties) {
        return new OpenGovernmentPeruClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentitaly.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentItalyClient opengovernmentitalyClient(OpenGovernmentItalyProperties properties) {
        return new OpenGovernmentItalyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentsweden.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentSwedenClient opengovernmentswedenClient(OpenGovernmentSwedenProperties properties) {
        return new OpenGovernmentSwedenClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentvictoriastategovernment.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentVictoriaStateGovernmentClient opengovernmentvictoriastategovernmentClient(OpenGovernmentVictoriaStateGovernmentProperties properties) {
        return new OpenGovernmentVictoriaStateGovernmentClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentportugal.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentPortugalClient opengovernmentportugalClient(OpenGovernmentPortugalProperties properties) {
        return new OpenGovernmentPortugalClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.uspresidentialelectiondatabytogatech.enabled", havingValue = "true", matchIfMissing = true)
    public UsPresidentialElectionDataByTogatechClient uspresidentialelectiondatabytogatechClient(UsPresidentialElectionDataByTogatechProperties properties) {
        return new UsPresidentialElectionDataByTogatechClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentgreece.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentGreeceClient opengovernmentgreeceClient(OpenGovernmentGreeceProperties properties) {
        return new OpenGovernmentGreeceClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentbelgium.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentBelgiumClient opengovernmentbelgiumClient(OpenGovernmentBelgiumProperties properties) {
        return new OpenGovernmentBelgiumClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmenttaiwan.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentTaiwanClient opengovernmenttaiwanClient(OpenGovernmentTaiwanProperties properties) {
        return new OpenGovernmentTaiwanClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentsingapore.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentSingaporeClient opengovernmentsingaporeClient(OpenGovernmentSingaporeProperties properties) {
        return new OpenGovernmentSingaporeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.representbyopennorth.enabled", havingValue = "true", matchIfMissing = true)
    public RepresentByOpenNorthClient representbyopennorthClient(RepresentByOpenNorthProperties properties) {
        return new RepresentByOpenNorthClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentslovenia.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentSloveniaClient opengovernmentsloveniaClient(OpenGovernmentSloveniaProperties properties) {
        return new OpenGovernmentSloveniaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.usagov.enabled", havingValue = "true", matchIfMissing = true)
    public UsaGovClient usagovClient(UsaGovProperties properties) {
        return new UsaGovClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.ukcompanieshouse.enabled", havingValue = "true", matchIfMissing = true)
    public UkCompaniesHouseClient ukcompanieshouseClient(UkCompaniesHouseProperties properties) {
        return new UkCompaniesHouseClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentmexico2.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentMexico2Client opengovernmentmexico2Client(OpenGovernmentMexico2Properties properties) {
        return new OpenGovernmentMexico2Client(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.usaspendinggov.enabled", havingValue = "true", matchIfMissing = true)
    public UsaspendingGovClient usaspendinggovClient(UsaspendingGovProperties properties) {
        return new UsaspendingGovClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentuk.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentUkClient opengovernmentukClient(OpenGovernmentUkProperties properties) {
        return new OpenGovernmentUkClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentswitzerland.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentSwitzerlandClient opengovernmentswitzerlandClient(OpenGovernmentSwitzerlandProperties properties) {
        return new OpenGovernmentSwitzerlandClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentusa.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentUsaClient opengovernmentusaClient(OpenGovernmentUsaProperties properties) {
        return new OpenGovernmentUsaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentfinland.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentFinlandClient opengovernmentfinlandClient(OpenGovernmentFinlandProperties properties) {
        return new OpenGovernmentFinlandClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.government.opengovernmentindia.enabled", havingValue = "true", matchIfMissing = true)
    public OpenGovernmentIndiaClient opengovernmentindiaClient(OpenGovernmentIndiaProperties properties) {
        return new OpenGovernmentIndiaClient(properties.getUrl());
    }

}
