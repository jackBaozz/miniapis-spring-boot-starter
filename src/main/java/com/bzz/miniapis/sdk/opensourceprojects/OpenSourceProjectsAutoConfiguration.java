package com.bzz.miniapis.sdk.opensourceprojects;

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
        CountlyProperties.class,
        CreativeCommonsCatalogProperties.class,
        DatamuseProperties.class,
        DrupalOrgProperties.class,
        EvilInsultGeneratorProperties.class,
        GithubContributionChartGeneratorProperties.class,
        GithubReadmeStatsProperties.class,
        MetabaseProperties.class,
        ShieldsProperties.class
})
public class OpenSourceProjectsAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opensourceprojects.countly.enabled", havingValue = "true", matchIfMissing = true)
    public CountlyClient countlyClient(CountlyProperties properties) {
        return createClient(CountlyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opensourceprojects.creativecommonscatalog.enabled", havingValue = "true", matchIfMissing = true)
    public CreativeCommonsCatalogClient creativecommonscatalogClient(CreativeCommonsCatalogProperties properties) {
        return createClient(CreativeCommonsCatalogClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opensourceprojects.datamuse.enabled", havingValue = "true", matchIfMissing = true)
    public DatamuseClient datamuseClient(DatamuseProperties properties) {
        return createClient(DatamuseClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opensourceprojects.drupalorg.enabled", havingValue = "true", matchIfMissing = true)
    public DrupalOrgClient drupalorgClient(DrupalOrgProperties properties) {
        return createClient(DrupalOrgClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opensourceprojects.evilinsultgenerator.enabled", havingValue = "true", matchIfMissing = true)
    public EvilInsultGeneratorClient evilinsultgeneratorClient(EvilInsultGeneratorProperties properties) {
        return createClient(EvilInsultGeneratorClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opensourceprojects.githubcontributionchartgenerator.enabled", havingValue = "true", matchIfMissing = true)
    public GithubContributionChartGeneratorClient githubcontributionchartgeneratorClient(GithubContributionChartGeneratorProperties properties) {
        return createClient(GithubContributionChartGeneratorClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opensourceprojects.githubreadmestats.enabled", havingValue = "true", matchIfMissing = true)
    public GithubReadmeStatsClient githubreadmestatsClient(GithubReadmeStatsProperties properties) {
        return createClient(GithubReadmeStatsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opensourceprojects.metabase.enabled", havingValue = "true", matchIfMissing = true)
    public MetabaseClient metabaseClient(MetabaseProperties properties) {
        return createClient(MetabaseClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.opensourceprojects.shields.enabled", havingValue = "true", matchIfMissing = true)
    public ShieldsClient shieldsClient(ShieldsProperties properties) {
        return createClient(ShieldsClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
