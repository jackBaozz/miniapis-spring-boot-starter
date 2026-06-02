package com.bzz.miniapis.sdk.email;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        EmailValidationProperties.class,
        CloudmersiveValidateProperties.class,
        EmailjsProperties.class,
        MailTmProperties.class,
        MailGwProperties.class,
        MailboxlayerProperties.class,
        GuerrillaMailProperties.class,
        MailtrapProperties.class,
        DropmailProperties.class,
        KickboxProperties.class,
        ImprovmxProperties.class,
        MailboxvalidatorProperties.class,
        DisifyProperties.class,
        PoststackProperties.class,
        MailcheckAiProperties.class,
        SendgridProperties.class,
        VerifierProperties.class,
        SendinblueProperties.class
})
public class EmailAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.emailvalidation.enabled", havingValue = "true", matchIfMissing = true)
    public EmailValidationClient emailvalidationClient(EmailValidationProperties properties) {
        return new EmailValidationClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.cloudmersivevalidate.enabled", havingValue = "true", matchIfMissing = true)
    public CloudmersiveValidateClient cloudmersivevalidateClient(CloudmersiveValidateProperties properties) {
        return new CloudmersiveValidateClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.emailjs.enabled", havingValue = "true", matchIfMissing = true)
    public EmailjsClient emailjsClient(EmailjsProperties properties) {
        return new EmailjsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.mailtm.enabled", havingValue = "true", matchIfMissing = true)
    public MailTmClient mailtmClient(MailTmProperties properties) {
        return new MailTmClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.mailgw.enabled", havingValue = "true", matchIfMissing = true)
    public MailGwClient mailgwClient(MailGwProperties properties) {
        return new MailGwClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.mailboxlayer.enabled", havingValue = "true", matchIfMissing = true)
    public MailboxlayerClient mailboxlayerClient(MailboxlayerProperties properties) {
        return new MailboxlayerClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.guerrillamail.enabled", havingValue = "true", matchIfMissing = true)
    public GuerrillaMailClient guerrillamailClient(GuerrillaMailProperties properties) {
        return new GuerrillaMailClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.mailtrap.enabled", havingValue = "true", matchIfMissing = true)
    public MailtrapClient mailtrapClient(MailtrapProperties properties) {
        return new MailtrapClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.dropmail.enabled", havingValue = "true", matchIfMissing = true)
    public DropmailClient dropmailClient(DropmailProperties properties) {
        return new DropmailClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.kickbox.enabled", havingValue = "true", matchIfMissing = true)
    public KickboxClient kickboxClient(KickboxProperties properties) {
        return new KickboxClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.improvmx.enabled", havingValue = "true", matchIfMissing = true)
    public ImprovmxClient improvmxClient(ImprovmxProperties properties) {
        return new ImprovmxClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.mailboxvalidator.enabled", havingValue = "true", matchIfMissing = true)
    public MailboxvalidatorClient mailboxvalidatorClient(MailboxvalidatorProperties properties) {
        return new MailboxvalidatorClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.disify.enabled", havingValue = "true", matchIfMissing = true)
    public DisifyClient disifyClient(DisifyProperties properties) {
        return new DisifyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.poststack.enabled", havingValue = "true", matchIfMissing = true)
    public PoststackClient poststackClient(PoststackProperties properties) {
        return new PoststackClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.mailcheckai.enabled", havingValue = "true", matchIfMissing = true)
    public MailcheckAiClient mailcheckaiClient(MailcheckAiProperties properties) {
        return new MailcheckAiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.sendgrid.enabled", havingValue = "true", matchIfMissing = true)
    public SendgridClient sendgridClient(SendgridProperties properties) {
        return new SendgridClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.verifier.enabled", havingValue = "true", matchIfMissing = true)
    public VerifierClient verifierClient(VerifierProperties properties) {
        return new VerifierClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.sendinblue.enabled", havingValue = "true", matchIfMissing = true)
    public SendinblueClient sendinblueClient(SendinblueProperties properties) {
        return new SendinblueClient(properties.getUrl());
    }

}
