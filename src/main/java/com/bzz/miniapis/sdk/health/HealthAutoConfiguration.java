package com.bzz.miniapis.sdk.health;

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
        CmsGovProperties.class,
        CoronavirusProperties.class,
        CoronavirusInTheUkProperties.class,
        CovidTrackingProjectProperties.class,
        Covid19Properties.class,
        Covid19Properties.class,
        Covid19DatenhubProperties.class,
        Covid19GovernmentResponseProperties.class,
        Covid19IndiaProperties.class,
        Covid19JhuCsseProperties.class,
        Covid19LiveDataProperties.class,
        Covid19PhilippinesProperties.class,
        Covid19TrackerCanadaProperties.class,
        Covid19TrackerSriLankaProperties.class,
        CovidIdProperties.class,
        DataflowKitCovid19Properties.class,
        EdamamProperties.class,
        FooddataCentralProperties.class,
        HealthcareGovProperties.class,
        HumanitarianDataExchangeProperties.class,
        InfermedicaProperties.class,
        LapisProperties.class,
        LexigramProperties.class,
        MakeupProperties.class,
        MedlineplusGeneticsProperties.class,
        MyvaccinationProperties.class,
        NppesProperties.class,
        NutritionixProperties.class,
        OpenDataNhsScotlandProperties.class,
        OpenDiseaseProperties.class,
        OpenfdaProperties.class,
        OrionHealthProperties.class,
        QuarantineProperties.class
})
public class HealthAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.cmsgov.enabled", havingValue = "true", matchIfMissing = true)
    public CmsGovClient cmsgovClient(CmsGovProperties properties) {
        return createClient(CmsGovClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.coronavirus.enabled", havingValue = "true", matchIfMissing = true)
    public CoronavirusClient coronavirusClient(CoronavirusProperties properties) {
        return createClient(CoronavirusClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.coronavirusintheuk.enabled", havingValue = "true", matchIfMissing = true)
    public CoronavirusInTheUkClient coronavirusintheukClient(CoronavirusInTheUkProperties properties) {
        return createClient(CoronavirusInTheUkClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.covidtrackingproject.enabled", havingValue = "true", matchIfMissing = true)
    public CovidTrackingProjectClient covidtrackingprojectClient(CovidTrackingProjectProperties properties) {
        return createClient(CovidTrackingProjectClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.covid19.enabled", havingValue = "true", matchIfMissing = true)
    public Covid19Client covid19Client(Covid19Properties properties) {
        return createClient(Covid19Client.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.covid192.enabled", havingValue = "true", matchIfMissing = true)
    public Covid19Client covid192Client(Covid19Properties properties) {
        return createClient(Covid19Client.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.covid19datenhub.enabled", havingValue = "true", matchIfMissing = true)
    public Covid19DatenhubClient covid19datenhubClient(Covid19DatenhubProperties properties) {
        return createClient(Covid19DatenhubClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.covid19governmentresponse.enabled", havingValue = "true", matchIfMissing = true)
    public Covid19GovernmentResponseClient covid19governmentresponseClient(Covid19GovernmentResponseProperties properties) {
        return createClient(Covid19GovernmentResponseClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.covid19india.enabled", havingValue = "true", matchIfMissing = true)
    public Covid19IndiaClient covid19indiaClient(Covid19IndiaProperties properties) {
        return createClient(Covid19IndiaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.covid19jhucsse.enabled", havingValue = "true", matchIfMissing = true)
    public Covid19JhuCsseClient covid19jhucsseClient(Covid19JhuCsseProperties properties) {
        return createClient(Covid19JhuCsseClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.covid19livedata.enabled", havingValue = "true", matchIfMissing = true)
    public Covid19LiveDataClient covid19livedataClient(Covid19LiveDataProperties properties) {
        return createClient(Covid19LiveDataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.covid19philippines.enabled", havingValue = "true", matchIfMissing = true)
    public Covid19PhilippinesClient covid19philippinesClient(Covid19PhilippinesProperties properties) {
        return createClient(Covid19PhilippinesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.covid19trackercanada.enabled", havingValue = "true", matchIfMissing = true)
    public Covid19TrackerCanadaClient covid19trackercanadaClient(Covid19TrackerCanadaProperties properties) {
        return createClient(Covid19TrackerCanadaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.covid19trackersrilanka.enabled", havingValue = "true", matchIfMissing = true)
    public Covid19TrackerSriLankaClient covid19trackersrilankaClient(Covid19TrackerSriLankaProperties properties) {
        return createClient(Covid19TrackerSriLankaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.covidid.enabled", havingValue = "true", matchIfMissing = true)
    public CovidIdClient covididClient(CovidIdProperties properties) {
        return createClient(CovidIdClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.dataflowkitcovid19.enabled", havingValue = "true", matchIfMissing = true)
    public DataflowKitCovid19Client dataflowkitcovid19Client(DataflowKitCovid19Properties properties) {
        return createClient(DataflowKitCovid19Client.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.edamam.enabled", havingValue = "true", matchIfMissing = true)
    public EdamamClient edamamClient(EdamamProperties properties) {
        return createClient(EdamamClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.fooddatacentral.enabled", havingValue = "true", matchIfMissing = true)
    public FooddataCentralClient fooddatacentralClient(FooddataCentralProperties properties) {
        return createClient(FooddataCentralClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.healthcaregov.enabled", havingValue = "true", matchIfMissing = true)
    public HealthcareGovClient healthcaregovClient(HealthcareGovProperties properties) {
        return createClient(HealthcareGovClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.humanitariandataexchange.enabled", havingValue = "true", matchIfMissing = true)
    public HumanitarianDataExchangeClient humanitariandataexchangeClient(HumanitarianDataExchangeProperties properties) {
        return createClient(HumanitarianDataExchangeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.infermedica.enabled", havingValue = "true", matchIfMissing = true)
    public InfermedicaClient infermedicaClient(InfermedicaProperties properties) {
        return createClient(InfermedicaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.lapis.enabled", havingValue = "true", matchIfMissing = true)
    public LapisClient lapisClient(LapisProperties properties) {
        return createClient(LapisClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.lexigram.enabled", havingValue = "true", matchIfMissing = true)
    public LexigramClient lexigramClient(LexigramProperties properties) {
        return createClient(LexigramClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.makeup.enabled", havingValue = "true", matchIfMissing = true)
    public MakeupClient makeupClient(MakeupProperties properties) {
        return createClient(MakeupClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.medlineplusgenetics.enabled", havingValue = "true", matchIfMissing = true)
    public MedlineplusGeneticsClient medlineplusgeneticsClient(MedlineplusGeneticsProperties properties) {
        return createClient(MedlineplusGeneticsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.myvaccination.enabled", havingValue = "true", matchIfMissing = true)
    public MyvaccinationClient myvaccinationClient(MyvaccinationProperties properties) {
        return createClient(MyvaccinationClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.nppes.enabled", havingValue = "true", matchIfMissing = true)
    public NppesClient nppesClient(NppesProperties properties) {
        return createClient(NppesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.nutritionix.enabled", havingValue = "true", matchIfMissing = true)
    public NutritionixClient nutritionixClient(NutritionixProperties properties) {
        return createClient(NutritionixClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.opendatanhsscotland.enabled", havingValue = "true", matchIfMissing = true)
    public OpenDataNhsScotlandClient opendatanhsscotlandClient(OpenDataNhsScotlandProperties properties) {
        return createClient(OpenDataNhsScotlandClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.opendisease.enabled", havingValue = "true", matchIfMissing = true)
    public OpenDiseaseClient opendiseaseClient(OpenDiseaseProperties properties) {
        return createClient(OpenDiseaseClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.openfda.enabled", havingValue = "true", matchIfMissing = true)
    public OpenfdaClient openfdaClient(OpenfdaProperties properties) {
        return createClient(OpenfdaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.orionhealth.enabled", havingValue = "true", matchIfMissing = true)
    public OrionHealthClient orionhealthClient(OrionHealthProperties properties) {
        return createClient(OrionHealthClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.quarantine.enabled", havingValue = "true", matchIfMissing = true)
    public QuarantineClient quarantineClient(QuarantineProperties properties) {
        return createClient(QuarantineClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
