package com.bzz.miniapis.sdk.security;

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
        ApplicationEnvironmentVerificationProperties.class,
        BinaryedgeProperties.class,
        BitwardenProperties.class,
        BotdProperties.class,
        BugcrowdProperties.class,
        CensysProperties.class,
        ClassifyProperties.class,
        CompleteCriminalChecksProperties.class,
        DeadDropProperties.class,
        DehashLtProperties.class,
        EmailrepProperties.class,
        EscapeProperties.class,
        FilterlistsProperties.class,
        FingerprintjsProProperties.class,
        FullhuntProperties.class,
        GitguardianProperties.class,
        GreynoiseProperties.class,
        HackeroneProperties.class,
        HashableProperties.class,
        HaveibeenpwnedProperties.class,
        IntelligenceXProperties.class,
        IplogsProperties.class,
        LoginradiusProperties.class,
        MicrosoftSecurityResponseCenterMsrcProperties.class,
        MozillaHttpScannerProperties.class,
        MozillaTlsScannerProperties.class,
        NationalVulnerabilityDatabaseProperties.class,
        PasswordinatorProperties.class,
        PhishstatsProperties.class,
        PrivacyComProperties.class,
        PulsediveProperties.class,
        SecuritytrailsProperties.class,
        ShodanProperties.class,
        SpyseProperties.class,
        UkPoliceProperties.class,
        VuldbProperties.class
})
public class SecurityAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.applicationenvironmentverification.enabled", havingValue = "true", matchIfMissing = true)
    public ApplicationEnvironmentVerificationClient applicationenvironmentverificationClient(ApplicationEnvironmentVerificationProperties properties) {
        return createClient(ApplicationEnvironmentVerificationClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.binaryedge.enabled", havingValue = "true", matchIfMissing = true)
    public BinaryedgeClient binaryedgeClient(BinaryedgeProperties properties) {
        return createClient(BinaryedgeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.bitwarden.enabled", havingValue = "true", matchIfMissing = true)
    public BitwardenClient bitwardenClient(BitwardenProperties properties) {
        return createClient(BitwardenClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.botd.enabled", havingValue = "true", matchIfMissing = true)
    public BotdClient botdClient(BotdProperties properties) {
        return createClient(BotdClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.bugcrowd.enabled", havingValue = "true", matchIfMissing = true)
    public BugcrowdClient bugcrowdClient(BugcrowdProperties properties) {
        return createClient(BugcrowdClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.censys.enabled", havingValue = "true", matchIfMissing = true)
    public CensysClient censysClient(CensysProperties properties) {
        return createClient(CensysClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.classify.enabled", havingValue = "true", matchIfMissing = true)
    public ClassifyClient classifyClient(ClassifyProperties properties) {
        return createClient(ClassifyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.completecriminalchecks.enabled", havingValue = "true", matchIfMissing = true)
    public CompleteCriminalChecksClient completecriminalchecksClient(CompleteCriminalChecksProperties properties) {
        return createClient(CompleteCriminalChecksClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.deaddrop.enabled", havingValue = "true", matchIfMissing = true)
    public DeadDropClient deaddropClient(DeadDropProperties properties) {
        return createClient(DeadDropClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.dehashlt.enabled", havingValue = "true", matchIfMissing = true)
    public DehashLtClient dehashltClient(DehashLtProperties properties) {
        return createClient(DehashLtClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.emailrep.enabled", havingValue = "true", matchIfMissing = true)
    public EmailrepClient emailrepClient(EmailrepProperties properties) {
        return createClient(EmailrepClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.escape.enabled", havingValue = "true", matchIfMissing = true)
    public EscapeClient escapeClient(EscapeProperties properties) {
        return createClient(EscapeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.filterlists.enabled", havingValue = "true", matchIfMissing = true)
    public FilterlistsClient filterlistsClient(FilterlistsProperties properties) {
        return createClient(FilterlistsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.fingerprintjspro.enabled", havingValue = "true", matchIfMissing = true)
    public FingerprintjsProClient fingerprintjsproClient(FingerprintjsProProperties properties) {
        return createClient(FingerprintjsProClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.fullhunt.enabled", havingValue = "true", matchIfMissing = true)
    public FullhuntClient fullhuntClient(FullhuntProperties properties) {
        return createClient(FullhuntClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.gitguardian.enabled", havingValue = "true", matchIfMissing = true)
    public GitguardianClient gitguardianClient(GitguardianProperties properties) {
        return createClient(GitguardianClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.greynoise.enabled", havingValue = "true", matchIfMissing = true)
    public GreynoiseClient greynoiseClient(GreynoiseProperties properties) {
        return createClient(GreynoiseClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.hackerone.enabled", havingValue = "true", matchIfMissing = true)
    public HackeroneClient hackeroneClient(HackeroneProperties properties) {
        return createClient(HackeroneClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.hashable.enabled", havingValue = "true", matchIfMissing = true)
    public HashableClient hashableClient(HashableProperties properties) {
        return createClient(HashableClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.haveibeenpwned.enabled", havingValue = "true", matchIfMissing = true)
    public HaveibeenpwnedClient haveibeenpwnedClient(HaveibeenpwnedProperties properties) {
        return createClient(HaveibeenpwnedClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.intelligencex.enabled", havingValue = "true", matchIfMissing = true)
    public IntelligenceXClient intelligencexClient(IntelligenceXProperties properties) {
        return createClient(IntelligenceXClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.iplogs.enabled", havingValue = "true", matchIfMissing = true)
    public IplogsClient iplogsClient(IplogsProperties properties) {
        return createClient(IplogsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.loginradius.enabled", havingValue = "true", matchIfMissing = true)
    public LoginradiusClient loginradiusClient(LoginradiusProperties properties) {
        return createClient(LoginradiusClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.microsoftsecurityresponsecentermsrc.enabled", havingValue = "true", matchIfMissing = true)
    public MicrosoftSecurityResponseCenterMsrcClient microsoftsecurityresponsecentermsrcClient(MicrosoftSecurityResponseCenterMsrcProperties properties) {
        return createClient(MicrosoftSecurityResponseCenterMsrcClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.mozillahttpscanner.enabled", havingValue = "true", matchIfMissing = true)
    public MozillaHttpScannerClient mozillahttpscannerClient(MozillaHttpScannerProperties properties) {
        return createClient(MozillaHttpScannerClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.mozillatlsscanner.enabled", havingValue = "true", matchIfMissing = true)
    public MozillaTlsScannerClient mozillatlsscannerClient(MozillaTlsScannerProperties properties) {
        return createClient(MozillaTlsScannerClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.nationalvulnerabilitydatabase.enabled", havingValue = "true", matchIfMissing = true)
    public NationalVulnerabilityDatabaseClient nationalvulnerabilitydatabaseClient(NationalVulnerabilityDatabaseProperties properties) {
        return createClient(NationalVulnerabilityDatabaseClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.passwordinator.enabled", havingValue = "true", matchIfMissing = true)
    public PasswordinatorClient passwordinatorClient(PasswordinatorProperties properties) {
        return createClient(PasswordinatorClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.phishstats.enabled", havingValue = "true", matchIfMissing = true)
    public PhishstatsClient phishstatsClient(PhishstatsProperties properties) {
        return createClient(PhishstatsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.privacycom.enabled", havingValue = "true", matchIfMissing = true)
    public PrivacyComClient privacycomClient(PrivacyComProperties properties) {
        return createClient(PrivacyComClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.pulsedive.enabled", havingValue = "true", matchIfMissing = true)
    public PulsediveClient pulsediveClient(PulsediveProperties properties) {
        return createClient(PulsediveClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.securitytrails.enabled", havingValue = "true", matchIfMissing = true)
    public SecuritytrailsClient securitytrailsClient(SecuritytrailsProperties properties) {
        return createClient(SecuritytrailsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.shodan.enabled", havingValue = "true", matchIfMissing = true)
    public ShodanClient shodanClient(ShodanProperties properties) {
        return createClient(ShodanClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.spyse.enabled", havingValue = "true", matchIfMissing = true)
    public SpyseClient spyseClient(SpyseProperties properties) {
        return createClient(SpyseClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.ukpolice.enabled", havingValue = "true", matchIfMissing = true)
    public UkPoliceClient ukpoliceClient(UkPoliceProperties properties) {
        return createClient(UkPoliceClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.vuldb.enabled", havingValue = "true", matchIfMissing = true)
    public VuldbClient vuldbClient(VuldbProperties properties) {
        return createClient(VuldbClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
