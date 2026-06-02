package com.bzz.miniapis.sdk.jobs;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        OpenSkillsProperties.class,
        JoobleProperties.class,
        ZiprecruiterProperties.class,
        ArbeitsamtProperties.class,
        CareerjetProperties.class,
        HerohuntPeopleSearchProperties.class,
        ArbeitnowProperties.class,
        JujuProperties.class,
        ReedProperties.class,
        FindworkProperties.class,
        AiDevJobsProperties.class,
        UpworkProperties.class,
        AdzunaProperties.class,
        TheMuseProperties.class,
        WhatjobsProperties.class,
        UsajobsProperties.class,
        Jobs2CareersProperties.class,
        DevitjobsUkProperties.class
})
public class JobsAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.openskills.enabled", havingValue = "true", matchIfMissing = true)
    public OpenSkillsClient openskillsClient(OpenSkillsProperties properties) {
        return new OpenSkillsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.jooble.enabled", havingValue = "true", matchIfMissing = true)
    public JoobleClient joobleClient(JoobleProperties properties) {
        return new JoobleClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.ziprecruiter.enabled", havingValue = "true", matchIfMissing = true)
    public ZiprecruiterClient ziprecruiterClient(ZiprecruiterProperties properties) {
        return new ZiprecruiterClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.arbeitsamt.enabled", havingValue = "true", matchIfMissing = true)
    public ArbeitsamtClient arbeitsamtClient(ArbeitsamtProperties properties) {
        return new ArbeitsamtClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.careerjet.enabled", havingValue = "true", matchIfMissing = true)
    public CareerjetClient careerjetClient(CareerjetProperties properties) {
        return new CareerjetClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.herohuntpeoplesearch.enabled", havingValue = "true", matchIfMissing = true)
    public HerohuntPeopleSearchClient herohuntpeoplesearchClient(HerohuntPeopleSearchProperties properties) {
        return new HerohuntPeopleSearchClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.arbeitnow.enabled", havingValue = "true", matchIfMissing = true)
    public ArbeitnowClient arbeitnowClient(ArbeitnowProperties properties) {
        return new ArbeitnowClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.juju.enabled", havingValue = "true", matchIfMissing = true)
    public JujuClient jujuClient(JujuProperties properties) {
        return new JujuClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.reed.enabled", havingValue = "true", matchIfMissing = true)
    public ReedClient reedClient(ReedProperties properties) {
        return new ReedClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.findwork.enabled", havingValue = "true", matchIfMissing = true)
    public FindworkClient findworkClient(FindworkProperties properties) {
        return new FindworkClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.aidevjobs.enabled", havingValue = "true", matchIfMissing = true)
    public AiDevJobsClient aidevjobsClient(AiDevJobsProperties properties) {
        return new AiDevJobsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.upwork.enabled", havingValue = "true", matchIfMissing = true)
    public UpworkClient upworkClient(UpworkProperties properties) {
        return new UpworkClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.adzuna.enabled", havingValue = "true", matchIfMissing = true)
    public AdzunaClient adzunaClient(AdzunaProperties properties) {
        return new AdzunaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.themuse.enabled", havingValue = "true", matchIfMissing = true)
    public TheMuseClient themuseClient(TheMuseProperties properties) {
        return new TheMuseClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.whatjobs.enabled", havingValue = "true", matchIfMissing = true)
    public WhatjobsClient whatjobsClient(WhatjobsProperties properties) {
        return new WhatjobsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.usajobs.enabled", havingValue = "true", matchIfMissing = true)
    public UsajobsClient usajobsClient(UsajobsProperties properties) {
        return new UsajobsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.jobs2careers.enabled", havingValue = "true", matchIfMissing = true)
    public Jobs2CareersClient jobs2careersClient(Jobs2CareersProperties properties) {
        return new Jobs2CareersClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.jobs.devitjobsuk.enabled", havingValue = "true", matchIfMissing = true)
    public DevitjobsUkClient devitjobsukClient(DevitjobsUkProperties properties) {
        return new DevitjobsUkClient(properties.getUrl());
    }

}
