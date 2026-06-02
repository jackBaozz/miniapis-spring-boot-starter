package com.bzz.miniapis.sdk.opensourceprojects;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        GithubReadmeStatsProperties.class,
        GithubContributionChartGeneratorProperties.class,
        DrupalOrgProperties.class,
        ShieldsProperties.class,
        CountlyProperties.class,
        EvilInsultGeneratorProperties.class,
        MetabaseProperties.class,
        DatamuseProperties.class,
        CreativeCommonsCatalogProperties.class
})
public class OpenSourceProjectsAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opensourceprojects.githubreadmestats.enabled", havingValue = "true", matchIfMissing = true)
    public GithubReadmeStatsClient githubreadmestatsClient(GithubReadmeStatsProperties properties) {
        return new GithubReadmeStatsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opensourceprojects.githubcontributionchartgenerator.enabled", havingValue = "true", matchIfMissing = true)
    public GithubContributionChartGeneratorClient githubcontributionchartgeneratorClient(GithubContributionChartGeneratorProperties properties) {
        return new GithubContributionChartGeneratorClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opensourceprojects.drupalorg.enabled", havingValue = "true", matchIfMissing = true)
    public DrupalOrgClient drupalorgClient(DrupalOrgProperties properties) {
        return new DrupalOrgClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opensourceprojects.shields.enabled", havingValue = "true", matchIfMissing = true)
    public ShieldsClient shieldsClient(ShieldsProperties properties) {
        return new ShieldsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opensourceprojects.countly.enabled", havingValue = "true", matchIfMissing = true)
    public CountlyClient countlyClient(CountlyProperties properties) {
        return new CountlyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opensourceprojects.evilinsultgenerator.enabled", havingValue = "true", matchIfMissing = true)
    public EvilInsultGeneratorClient evilinsultgeneratorClient(EvilInsultGeneratorProperties properties) {
        return new EvilInsultGeneratorClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opensourceprojects.metabase.enabled", havingValue = "true", matchIfMissing = true)
    public MetabaseClient metabaseClient(MetabaseProperties properties) {
        return new MetabaseClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opensourceprojects.datamuse.enabled", havingValue = "true", matchIfMissing = true)
    public DatamuseClient datamuseClient(DatamuseProperties properties) {
        return new DatamuseClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opensourceprojects.creativecommonscatalog.enabled", havingValue = "true", matchIfMissing = true)
    public CreativeCommonsCatalogClient creativecommonscatalogClient(CreativeCommonsCatalogProperties properties) {
        return new CreativeCommonsCatalogClient(properties.getUrl());
    }

}
