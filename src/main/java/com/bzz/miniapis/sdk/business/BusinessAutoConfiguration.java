package com.bzz.miniapis.sdk.business;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        MailjetProperties.class,
        MailchimpProperties.class,
        InstatusProperties.class,
        ApacheSupersetProperties.class,
        GoogleAnalyticsProperties.class,
        DomainsdbInfoProperties.class,
        GmailProperties.class,
        SquareProperties.class,
        FreelancerProperties.class,
        TombaEmailFinderProperties.class,
        RedashProperties.class,
        MarkerapiProperties.class,
        TrelloProperties.class,
        SmartsheetProperties.class,
        CharitySearchProperties.class,
        SwiftkanbanProperties.class,
        ClearbitLogoProperties.class
})
public class BusinessAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.mailjet.enabled", havingValue = "true", matchIfMissing = true)
    public MailjetClient mailjetClient(MailjetProperties properties) {
        return new MailjetClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.mailchimp.enabled", havingValue = "true", matchIfMissing = true)
    public MailchimpClient mailchimpClient(MailchimpProperties properties) {
        return new MailchimpClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.instatus.enabled", havingValue = "true", matchIfMissing = true)
    public InstatusClient instatusClient(InstatusProperties properties) {
        return new InstatusClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.apachesuperset.enabled", havingValue = "true", matchIfMissing = true)
    public ApacheSupersetClient apachesupersetClient(ApacheSupersetProperties properties) {
        return new ApacheSupersetClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.googleanalytics.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleAnalyticsClient googleanalyticsClient(GoogleAnalyticsProperties properties) {
        return new GoogleAnalyticsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.domainsdbinfo.enabled", havingValue = "true", matchIfMissing = true)
    public DomainsdbInfoClient domainsdbinfoClient(DomainsdbInfoProperties properties) {
        return new DomainsdbInfoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.gmail.enabled", havingValue = "true", matchIfMissing = true)
    public GmailClient gmailClient(GmailProperties properties) {
        return new GmailClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.square.enabled", havingValue = "true", matchIfMissing = true)
    public SquareClient squareClient(SquareProperties properties) {
        return new SquareClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.freelancer.enabled", havingValue = "true", matchIfMissing = true)
    public FreelancerClient freelancerClient(FreelancerProperties properties) {
        return new FreelancerClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.tombaemailfinder.enabled", havingValue = "true", matchIfMissing = true)
    public TombaEmailFinderClient tombaemailfinderClient(TombaEmailFinderProperties properties) {
        return new TombaEmailFinderClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.redash.enabled", havingValue = "true", matchIfMissing = true)
    public RedashClient redashClient(RedashProperties properties) {
        return new RedashClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.markerapi.enabled", havingValue = "true", matchIfMissing = true)
    public MarkerapiClient markerapiClient(MarkerapiProperties properties) {
        return new MarkerapiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.trello.enabled", havingValue = "true", matchIfMissing = true)
    public TrelloClient trelloClient(TrelloProperties properties) {
        return new TrelloClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.smartsheet.enabled", havingValue = "true", matchIfMissing = true)
    public SmartsheetClient smartsheetClient(SmartsheetProperties properties) {
        return new SmartsheetClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.charitysearch.enabled", havingValue = "true", matchIfMissing = true)
    public CharitySearchClient charitysearchClient(CharitySearchProperties properties) {
        return new CharitySearchClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.swiftkanban.enabled", havingValue = "true", matchIfMissing = true)
    public SwiftkanbanClient swiftkanbanClient(SwiftkanbanProperties properties) {
        return new SwiftkanbanClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.business.clearbitlogo.enabled", havingValue = "true", matchIfMissing = true)
    public ClearbitLogoClient clearbitlogoClient(ClearbitLogoProperties properties) {
        return new ClearbitLogoClient(properties.getUrl());
    }

}
