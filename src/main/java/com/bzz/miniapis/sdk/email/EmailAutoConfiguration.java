package com.bzz.miniapis.sdk.email;

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
        MailboxlayerProperties.class,
        CloudmersiveValidateProperties.class,
        DisifyProperties.class,
        DropmailProperties.class,
        EmailjsProperties.class,
        EmailValidationProperties.class,
        EvaProperties.class,
        GuerrillaMailProperties.class,
        ImprovmxProperties.class,
        KickboxProperties.class,
        MailGwProperties.class,
        MailTmProperties.class,
        MailboxvalidatorProperties.class,
        MailcheckAiProperties.class,
        MailtrapProperties.class,
        PoststackProperties.class,
        SendgridProperties.class,
        SendinblueProperties.class,
        VerifierProperties.class
})
public class EmailAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.mailboxlayer.enabled", havingValue = "true", matchIfMissing = true)
    public MailboxlayerClient mailboxlayerClient(MailboxlayerProperties properties) {
        return createClient(MailboxlayerClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.cloudmersivevalidate.enabled", havingValue = "true", matchIfMissing = true)
    public CloudmersiveValidateClient cloudmersivevalidateClient(CloudmersiveValidateProperties properties) {
        return createClient(CloudmersiveValidateClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.disify.enabled", havingValue = "true", matchIfMissing = true)
    public DisifyClient disifyClient(DisifyProperties properties) {
        return createClient(DisifyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.dropmail.enabled", havingValue = "true", matchIfMissing = true)
    public DropmailClient dropmailClient(DropmailProperties properties) {
        return createClient(DropmailClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.emailjs.enabled", havingValue = "true", matchIfMissing = true)
    public EmailjsClient emailjsClient(EmailjsProperties properties) {
        return createClient(EmailjsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.emailvalidation.enabled", havingValue = "true", matchIfMissing = true)
    public EmailValidationClient emailvalidationClient(EmailValidationProperties properties) {
        return createClient(EmailValidationClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.eva.enabled", havingValue = "true", matchIfMissing = true)
    public EvaClient evaClient(EvaProperties properties) {
        return createClient(EvaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.guerrillamail.enabled", havingValue = "true", matchIfMissing = true)
    public GuerrillaMailClient guerrillamailClient(GuerrillaMailProperties properties) {
        return createClient(GuerrillaMailClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.improvmx.enabled", havingValue = "true", matchIfMissing = true)
    public ImprovmxClient improvmxClient(ImprovmxProperties properties) {
        return createClient(ImprovmxClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.kickbox.enabled", havingValue = "true", matchIfMissing = true)
    public KickboxClient kickboxClient(KickboxProperties properties) {
        return createClient(KickboxClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.mailgw.enabled", havingValue = "true", matchIfMissing = true)
    public MailGwClient mailgwClient(MailGwProperties properties) {
        return createClient(MailGwClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.mailtm.enabled", havingValue = "true", matchIfMissing = true)
    public MailTmClient mailtmClient(MailTmProperties properties) {
        return createClient(MailTmClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.mailboxvalidator.enabled", havingValue = "true", matchIfMissing = true)
    public MailboxvalidatorClient mailboxvalidatorClient(MailboxvalidatorProperties properties) {
        return createClient(MailboxvalidatorClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.mailcheckai.enabled", havingValue = "true", matchIfMissing = true)
    public MailcheckAiClient mailcheckaiClient(MailcheckAiProperties properties) {
        return createClient(MailcheckAiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.mailtrap.enabled", havingValue = "true", matchIfMissing = true)
    public MailtrapClient mailtrapClient(MailtrapProperties properties) {
        return createClient(MailtrapClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.poststack.enabled", havingValue = "true", matchIfMissing = true)
    public PoststackClient poststackClient(PoststackProperties properties) {
        return createClient(PoststackClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.sendgrid.enabled", havingValue = "true", matchIfMissing = true)
    public SendgridClient sendgridClient(SendgridProperties properties) {
        return createClient(SendgridClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.sendinblue.enabled", havingValue = "true", matchIfMissing = true)
    public SendinblueClient sendinblueClient(SendinblueProperties properties) {
        return createClient(SendinblueClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.email.verifier.enabled", havingValue = "true", matchIfMissing = true)
    public VerifierClient verifierClient(VerifierProperties properties) {
        return createClient(VerifierClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
