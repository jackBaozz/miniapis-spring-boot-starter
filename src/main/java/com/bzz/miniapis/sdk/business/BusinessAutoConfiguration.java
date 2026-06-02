package com.bzz.miniapis.sdk.business;

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
        ApacheSupersetProperties.class,
        CharitySearchProperties.class,
        ClearbitLogoProperties.class,
        DomainsdbInfoProperties.class,
        FreelancerProperties.class,
        GmailProperties.class,
        GoogleAnalyticsProperties.class,
        InstatusProperties.class,
        MailchimpProperties.class,
        MailjetProperties.class,
        MarkerapiProperties.class,
        RedashProperties.class,
        SmartsheetProperties.class,
        SquareProperties.class,
        SwiftkanbanProperties.class,
        TombaEmailFinderProperties.class,
        TrelloProperties.class
})
public class BusinessAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.apachesuperset.enabled", havingValue = "true", matchIfMissing = true)
    public ApacheSupersetClient apachesupersetClient(ApacheSupersetProperties properties) {
        return createClient(ApacheSupersetClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.charitysearch.enabled", havingValue = "true", matchIfMissing = true)
    public CharitySearchClient charitysearchClient(CharitySearchProperties properties) {
        return createClient(CharitySearchClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.clearbitlogo.enabled", havingValue = "true", matchIfMissing = true)
    public ClearbitLogoClient clearbitlogoClient(ClearbitLogoProperties properties) {
        return createClient(ClearbitLogoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.domainsdbinfo.enabled", havingValue = "true", matchIfMissing = true)
    public DomainsdbInfoClient domainsdbinfoClient(DomainsdbInfoProperties properties) {
        return createClient(DomainsdbInfoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.freelancer.enabled", havingValue = "true", matchIfMissing = true)
    public FreelancerClient freelancerClient(FreelancerProperties properties) {
        return createClient(FreelancerClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.gmail.enabled", havingValue = "true", matchIfMissing = true)
    public GmailClient gmailClient(GmailProperties properties) {
        return createClient(GmailClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.googleanalytics.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleAnalyticsClient googleanalyticsClient(GoogleAnalyticsProperties properties) {
        return createClient(GoogleAnalyticsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.instatus.enabled", havingValue = "true", matchIfMissing = true)
    public InstatusClient instatusClient(InstatusProperties properties) {
        return createClient(InstatusClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.mailchimp.enabled", havingValue = "true", matchIfMissing = true)
    public MailchimpClient mailchimpClient(MailchimpProperties properties) {
        return createClient(MailchimpClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.mailjet.enabled", havingValue = "true", matchIfMissing = true)
    public MailjetClient mailjetClient(MailjetProperties properties) {
        return createClient(MailjetClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.markerapi.enabled", havingValue = "true", matchIfMissing = true)
    public MarkerapiClient markerapiClient(MarkerapiProperties properties) {
        return createClient(MarkerapiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.redash.enabled", havingValue = "true", matchIfMissing = true)
    public RedashClient redashClient(RedashProperties properties) {
        return createClient(RedashClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.smartsheet.enabled", havingValue = "true", matchIfMissing = true)
    public SmartsheetClient smartsheetClient(SmartsheetProperties properties) {
        return createClient(SmartsheetClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.square.enabled", havingValue = "true", matchIfMissing = true)
    public SquareClient squareClient(SquareProperties properties) {
        return createClient(SquareClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.swiftkanban.enabled", havingValue = "true", matchIfMissing = true)
    public SwiftkanbanClient swiftkanbanClient(SwiftkanbanProperties properties) {
        return createClient(SwiftkanbanClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.tombaemailfinder.enabled", havingValue = "true", matchIfMissing = true)
    public TombaEmailFinderClient tombaemailfinderClient(TombaEmailFinderProperties properties) {
        return createClient(TombaEmailFinderClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.trello.enabled", havingValue = "true", matchIfMissing = true)
    public TrelloClient trelloClient(TrelloProperties properties) {
        return createClient(TrelloClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
