package com.bzz.miniapis.sdk.jobs;

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
        AiDevJobsProperties.class,
        AdzunaProperties.class,
        ArbeitnowProperties.class,
        ArbeitsamtProperties.class,
        CareerjetProperties.class,
        DevitjobsUkProperties.class,
        FindworkProperties.class,
        HerohuntPeopleSearchProperties.class,
        Jobs2CareersProperties.class,
        JoobleProperties.class,
        JujuProperties.class,
        OpenSkillsProperties.class,
        ReedProperties.class,
        TheMuseProperties.class,
        UpworkProperties.class,
        UsajobsProperties.class,
        WhatjobsProperties.class,
        ZiprecruiterProperties.class
})
public class JobsAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.aidevjobs.enabled", havingValue = "true", matchIfMissing = true)
    public AiDevJobsClient aidevjobsClient(AiDevJobsProperties properties) {
        return createClient(AiDevJobsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.adzuna.enabled", havingValue = "true", matchIfMissing = true)
    public AdzunaClient adzunaClient(AdzunaProperties properties) {
        return createClient(AdzunaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.arbeitnow.enabled", havingValue = "true", matchIfMissing = true)
    public ArbeitnowClient arbeitnowClient(ArbeitnowProperties properties) {
        return createClient(ArbeitnowClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.arbeitsamt.enabled", havingValue = "true", matchIfMissing = true)
    public ArbeitsamtClient arbeitsamtClient(ArbeitsamtProperties properties) {
        return createClient(ArbeitsamtClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.careerjet.enabled", havingValue = "true", matchIfMissing = true)
    public CareerjetClient careerjetClient(CareerjetProperties properties) {
        return createClient(CareerjetClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.devitjobsuk.enabled", havingValue = "true", matchIfMissing = true)
    public DevitjobsUkClient devitjobsukClient(DevitjobsUkProperties properties) {
        return createClient(DevitjobsUkClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.findwork.enabled", havingValue = "true", matchIfMissing = true)
    public FindworkClient findworkClient(FindworkProperties properties) {
        return createClient(FindworkClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.herohuntpeoplesearch.enabled", havingValue = "true", matchIfMissing = true)
    public HerohuntPeopleSearchClient herohuntpeoplesearchClient(HerohuntPeopleSearchProperties properties) {
        return createClient(HerohuntPeopleSearchClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.jobs2careers.enabled", havingValue = "true", matchIfMissing = true)
    public Jobs2CareersClient jobs2careersClient(Jobs2CareersProperties properties) {
        return createClient(Jobs2CareersClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.jooble.enabled", havingValue = "true", matchIfMissing = true)
    public JoobleClient joobleClient(JoobleProperties properties) {
        return createClient(JoobleClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.juju.enabled", havingValue = "true", matchIfMissing = true)
    public JujuClient jujuClient(JujuProperties properties) {
        return createClient(JujuClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.openskills.enabled", havingValue = "true", matchIfMissing = true)
    public OpenSkillsClient openskillsClient(OpenSkillsProperties properties) {
        return createClient(OpenSkillsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.reed.enabled", havingValue = "true", matchIfMissing = true)
    public ReedClient reedClient(ReedProperties properties) {
        return createClient(ReedClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.themuse.enabled", havingValue = "true", matchIfMissing = true)
    public TheMuseClient themuseClient(TheMuseProperties properties) {
        return createClient(TheMuseClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.upwork.enabled", havingValue = "true", matchIfMissing = true)
    public UpworkClient upworkClient(UpworkProperties properties) {
        return createClient(UpworkClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.usajobs.enabled", havingValue = "true", matchIfMissing = true)
    public UsajobsClient usajobsClient(UsajobsProperties properties) {
        return createClient(UsajobsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.whatjobs.enabled", havingValue = "true", matchIfMissing = true)
    public WhatjobsClient whatjobsClient(WhatjobsProperties properties) {
        return createClient(WhatjobsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.ziprecruiter.enabled", havingValue = "true", matchIfMissing = true)
    public ZiprecruiterClient ziprecruiterClient(ZiprecruiterProperties properties) {
        return createClient(ZiprecruiterClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
