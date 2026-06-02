package com.bzz.miniapis.sdk.health;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        Covid19Properties.class,
        Covid19LiveDataProperties.class,
        Covid19PhilippinesProperties.class,
        CoronavirusProperties.class,
        Covid19IndiaProperties.class,
        Covid19JhuCsseProperties.class,
        CmsGovProperties.class,
        Covid19DatenhubProperties.class,
        CoronavirusInTheUkProperties.class,
        MyvaccinationProperties.class,
        DataflowKitCovid19Properties.class,
        CovidTrackingProjectProperties.class,
        HumanitarianDataExchangeProperties.class,
        HealthcareGovProperties.class,
        OpenfdaProperties.class,
        Covid19TrackerCanadaProperties.class,
        OrionHealthProperties.class,
        NutritionixProperties.class,
        MedlineplusGeneticsProperties.class,
        FooddataCentralProperties.class,
        LexigramProperties.class,
        OpenDiseaseProperties.class,
        InfermedicaProperties.class,
        NppesProperties.class,
        OpenDataNhsScotlandProperties.class,
        EdamamProperties.class,
        Covid19TrackerSriLankaProperties.class,
        MakeupProperties.class,
        LapisProperties.class,
        Covid19GovernmentResponseProperties.class
})
public class HealthAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.covid19.enabled", havingValue = "true", matchIfMissing = true)
    public Covid19Client covid19Client(Covid19Properties properties) {
        return new Covid19Client(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.covid19livedata.enabled", havingValue = "true", matchIfMissing = true)
    public Covid19LiveDataClient covid19livedataClient(Covid19LiveDataProperties properties) {
        return new Covid19LiveDataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.covid19philippines.enabled", havingValue = "true", matchIfMissing = true)
    public Covid19PhilippinesClient covid19philippinesClient(Covid19PhilippinesProperties properties) {
        return new Covid19PhilippinesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.coronavirus.enabled", havingValue = "true", matchIfMissing = true)
    public CoronavirusClient coronavirusClient(CoronavirusProperties properties) {
        return new CoronavirusClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.covid19india.enabled", havingValue = "true", matchIfMissing = true)
    public Covid19IndiaClient covid19indiaClient(Covid19IndiaProperties properties) {
        return new Covid19IndiaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.covid19jhucsse.enabled", havingValue = "true", matchIfMissing = true)
    public Covid19JhuCsseClient covid19jhucsseClient(Covid19JhuCsseProperties properties) {
        return new Covid19JhuCsseClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.cmsgov.enabled", havingValue = "true", matchIfMissing = true)
    public CmsGovClient cmsgovClient(CmsGovProperties properties) {
        return new CmsGovClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.covid19datenhub.enabled", havingValue = "true", matchIfMissing = true)
    public Covid19DatenhubClient covid19datenhubClient(Covid19DatenhubProperties properties) {
        return new Covid19DatenhubClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.coronavirusintheuk.enabled", havingValue = "true", matchIfMissing = true)
    public CoronavirusInTheUkClient coronavirusintheukClient(CoronavirusInTheUkProperties properties) {
        return new CoronavirusInTheUkClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.myvaccination.enabled", havingValue = "true", matchIfMissing = true)
    public MyvaccinationClient myvaccinationClient(MyvaccinationProperties properties) {
        return new MyvaccinationClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.dataflowkitcovid19.enabled", havingValue = "true", matchIfMissing = true)
    public DataflowKitCovid19Client dataflowkitcovid19Client(DataflowKitCovid19Properties properties) {
        return new DataflowKitCovid19Client(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.covidtrackingproject.enabled", havingValue = "true", matchIfMissing = true)
    public CovidTrackingProjectClient covidtrackingprojectClient(CovidTrackingProjectProperties properties) {
        return new CovidTrackingProjectClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.humanitariandataexchange.enabled", havingValue = "true", matchIfMissing = true)
    public HumanitarianDataExchangeClient humanitariandataexchangeClient(HumanitarianDataExchangeProperties properties) {
        return new HumanitarianDataExchangeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.healthcaregov.enabled", havingValue = "true", matchIfMissing = true)
    public HealthcareGovClient healthcaregovClient(HealthcareGovProperties properties) {
        return new HealthcareGovClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.openfda.enabled", havingValue = "true", matchIfMissing = true)
    public OpenfdaClient openfdaClient(OpenfdaProperties properties) {
        return new OpenfdaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.covid19trackercanada.enabled", havingValue = "true", matchIfMissing = true)
    public Covid19TrackerCanadaClient covid19trackercanadaClient(Covid19TrackerCanadaProperties properties) {
        return new Covid19TrackerCanadaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.orionhealth.enabled", havingValue = "true", matchIfMissing = true)
    public OrionHealthClient orionhealthClient(OrionHealthProperties properties) {
        return new OrionHealthClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.nutritionix.enabled", havingValue = "true", matchIfMissing = true)
    public NutritionixClient nutritionixClient(NutritionixProperties properties) {
        return new NutritionixClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.medlineplusgenetics.enabled", havingValue = "true", matchIfMissing = true)
    public MedlineplusGeneticsClient medlineplusgeneticsClient(MedlineplusGeneticsProperties properties) {
        return new MedlineplusGeneticsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.fooddatacentral.enabled", havingValue = "true", matchIfMissing = true)
    public FooddataCentralClient fooddatacentralClient(FooddataCentralProperties properties) {
        return new FooddataCentralClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.lexigram.enabled", havingValue = "true", matchIfMissing = true)
    public LexigramClient lexigramClient(LexigramProperties properties) {
        return new LexigramClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.opendisease.enabled", havingValue = "true", matchIfMissing = true)
    public OpenDiseaseClient opendiseaseClient(OpenDiseaseProperties properties) {
        return new OpenDiseaseClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.infermedica.enabled", havingValue = "true", matchIfMissing = true)
    public InfermedicaClient infermedicaClient(InfermedicaProperties properties) {
        return new InfermedicaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.nppes.enabled", havingValue = "true", matchIfMissing = true)
    public NppesClient nppesClient(NppesProperties properties) {
        return new NppesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.opendatanhsscotland.enabled", havingValue = "true", matchIfMissing = true)
    public OpenDataNhsScotlandClient opendatanhsscotlandClient(OpenDataNhsScotlandProperties properties) {
        return new OpenDataNhsScotlandClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.edamam.enabled", havingValue = "true", matchIfMissing = true)
    public EdamamClient edamamClient(EdamamProperties properties) {
        return new EdamamClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.covid19trackersrilanka.enabled", havingValue = "true", matchIfMissing = true)
    public Covid19TrackerSriLankaClient covid19trackersrilankaClient(Covid19TrackerSriLankaProperties properties) {
        return new Covid19TrackerSriLankaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.makeup.enabled", havingValue = "true", matchIfMissing = true)
    public MakeupClient makeupClient(MakeupProperties properties) {
        return new MakeupClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.lapis.enabled", havingValue = "true", matchIfMissing = true)
    public LapisClient lapisClient(LapisProperties properties) {
        return new LapisClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.health.covid19governmentresponse.enabled", havingValue = "true", matchIfMissing = true)
    public Covid19GovernmentResponseClient covid19governmentresponseClient(Covid19GovernmentResponseProperties properties) {
        return new Covid19GovernmentResponseClient(properties.getUrl());
    }

}
