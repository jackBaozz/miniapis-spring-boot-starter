package com.bzz.miniapis.sdk.security;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        BotdProperties.class,
        ApplicationEnvironmentVerificationProperties.class,
        EscapeProperties.class,
        DehashLtProperties.class,
        BitwardenProperties.class,
        CensysProperties.class,
        IntelligenceXProperties.class,
        MozillaHttpScannerProperties.class,
        DeadDropProperties.class,
        MozillaTlsScannerProperties.class,
        HaveibeenpwnedProperties.class,
        PasswordinatorProperties.class,
        FilterlistsProperties.class,
        GreynoiseProperties.class,
        LoginradiusProperties.class,
        HackeroneProperties.class,
        GitguardianProperties.class,
        SecuritytrailsProperties.class,
        BugcrowdProperties.class,
        ClassifyProperties.class,
        PhishstatsProperties.class,
        SpyseProperties.class,
        MicrosoftSecurityResponseCenterMsrcProperties.class,
        VuldbProperties.class,
        IplogsProperties.class,
        NationalVulnerabilityDatabaseProperties.class,
        BinaryedgeProperties.class,
        CompleteCriminalChecksProperties.class,
        ShodanProperties.class,
        UkPoliceProperties.class,
        FullhuntProperties.class,
        EmailrepProperties.class,
        HashableProperties.class,
        FingerprintjsProProperties.class,
        PulsediveProperties.class,
        PrivacyComProperties.class
})
public class SecurityAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.botd.enabled", havingValue = "true", matchIfMissing = true)
    public BotdClient botdClient(BotdProperties properties) {
        return new BotdClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.applicationenvironmentverification.enabled", havingValue = "true", matchIfMissing = true)
    public ApplicationEnvironmentVerificationClient applicationenvironmentverificationClient(ApplicationEnvironmentVerificationProperties properties) {
        return new ApplicationEnvironmentVerificationClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.escape.enabled", havingValue = "true", matchIfMissing = true)
    public EscapeClient escapeClient(EscapeProperties properties) {
        return new EscapeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.dehashlt.enabled", havingValue = "true", matchIfMissing = true)
    public DehashLtClient dehashltClient(DehashLtProperties properties) {
        return new DehashLtClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.bitwarden.enabled", havingValue = "true", matchIfMissing = true)
    public BitwardenClient bitwardenClient(BitwardenProperties properties) {
        return new BitwardenClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.censys.enabled", havingValue = "true", matchIfMissing = true)
    public CensysClient censysClient(CensysProperties properties) {
        return new CensysClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.intelligencex.enabled", havingValue = "true", matchIfMissing = true)
    public IntelligenceXClient intelligencexClient(IntelligenceXProperties properties) {
        return new IntelligenceXClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.mozillahttpscanner.enabled", havingValue = "true", matchIfMissing = true)
    public MozillaHttpScannerClient mozillahttpscannerClient(MozillaHttpScannerProperties properties) {
        return new MozillaHttpScannerClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.deaddrop.enabled", havingValue = "true", matchIfMissing = true)
    public DeadDropClient deaddropClient(DeadDropProperties properties) {
        return new DeadDropClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.mozillatlsscanner.enabled", havingValue = "true", matchIfMissing = true)
    public MozillaTlsScannerClient mozillatlsscannerClient(MozillaTlsScannerProperties properties) {
        return new MozillaTlsScannerClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.haveibeenpwned.enabled", havingValue = "true", matchIfMissing = true)
    public HaveibeenpwnedClient haveibeenpwnedClient(HaveibeenpwnedProperties properties) {
        return new HaveibeenpwnedClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.passwordinator.enabled", havingValue = "true", matchIfMissing = true)
    public PasswordinatorClient passwordinatorClient(PasswordinatorProperties properties) {
        return new PasswordinatorClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.filterlists.enabled", havingValue = "true", matchIfMissing = true)
    public FilterlistsClient filterlistsClient(FilterlistsProperties properties) {
        return new FilterlistsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.greynoise.enabled", havingValue = "true", matchIfMissing = true)
    public GreynoiseClient greynoiseClient(GreynoiseProperties properties) {
        return new GreynoiseClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.loginradius.enabled", havingValue = "true", matchIfMissing = true)
    public LoginradiusClient loginradiusClient(LoginradiusProperties properties) {
        return new LoginradiusClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.hackerone.enabled", havingValue = "true", matchIfMissing = true)
    public HackeroneClient hackeroneClient(HackeroneProperties properties) {
        return new HackeroneClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.gitguardian.enabled", havingValue = "true", matchIfMissing = true)
    public GitguardianClient gitguardianClient(GitguardianProperties properties) {
        return new GitguardianClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.securitytrails.enabled", havingValue = "true", matchIfMissing = true)
    public SecuritytrailsClient securitytrailsClient(SecuritytrailsProperties properties) {
        return new SecuritytrailsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.bugcrowd.enabled", havingValue = "true", matchIfMissing = true)
    public BugcrowdClient bugcrowdClient(BugcrowdProperties properties) {
        return new BugcrowdClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.classify.enabled", havingValue = "true", matchIfMissing = true)
    public ClassifyClient classifyClient(ClassifyProperties properties) {
        return new ClassifyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.phishstats.enabled", havingValue = "true", matchIfMissing = true)
    public PhishstatsClient phishstatsClient(PhishstatsProperties properties) {
        return new PhishstatsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.spyse.enabled", havingValue = "true", matchIfMissing = true)
    public SpyseClient spyseClient(SpyseProperties properties) {
        return new SpyseClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.microsoftsecurityresponsecentermsrc.enabled", havingValue = "true", matchIfMissing = true)
    public MicrosoftSecurityResponseCenterMsrcClient microsoftsecurityresponsecentermsrcClient(MicrosoftSecurityResponseCenterMsrcProperties properties) {
        return new MicrosoftSecurityResponseCenterMsrcClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.vuldb.enabled", havingValue = "true", matchIfMissing = true)
    public VuldbClient vuldbClient(VuldbProperties properties) {
        return new VuldbClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.iplogs.enabled", havingValue = "true", matchIfMissing = true)
    public IplogsClient iplogsClient(IplogsProperties properties) {
        return new IplogsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.nationalvulnerabilitydatabase.enabled", havingValue = "true", matchIfMissing = true)
    public NationalVulnerabilityDatabaseClient nationalvulnerabilitydatabaseClient(NationalVulnerabilityDatabaseProperties properties) {
        return new NationalVulnerabilityDatabaseClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.binaryedge.enabled", havingValue = "true", matchIfMissing = true)
    public BinaryedgeClient binaryedgeClient(BinaryedgeProperties properties) {
        return new BinaryedgeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.completecriminalchecks.enabled", havingValue = "true", matchIfMissing = true)
    public CompleteCriminalChecksClient completecriminalchecksClient(CompleteCriminalChecksProperties properties) {
        return new CompleteCriminalChecksClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.shodan.enabled", havingValue = "true", matchIfMissing = true)
    public ShodanClient shodanClient(ShodanProperties properties) {
        return new ShodanClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.ukpolice.enabled", havingValue = "true", matchIfMissing = true)
    public UkPoliceClient ukpoliceClient(UkPoliceProperties properties) {
        return new UkPoliceClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.fullhunt.enabled", havingValue = "true", matchIfMissing = true)
    public FullhuntClient fullhuntClient(FullhuntProperties properties) {
        return new FullhuntClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.emailrep.enabled", havingValue = "true", matchIfMissing = true)
    public EmailrepClient emailrepClient(EmailrepProperties properties) {
        return new EmailrepClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.hashable.enabled", havingValue = "true", matchIfMissing = true)
    public HashableClient hashableClient(HashableProperties properties) {
        return new HashableClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.fingerprintjspro.enabled", havingValue = "true", matchIfMissing = true)
    public FingerprintjsProClient fingerprintjsproClient(FingerprintjsProProperties properties) {
        return new FingerprintjsProClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.pulsedive.enabled", havingValue = "true", matchIfMissing = true)
    public PulsediveClient pulsediveClient(PulsediveProperties properties) {
        return new PulsediveClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.security.privacycom.enabled", havingValue = "true", matchIfMissing = true)
    public PrivacyComClient privacycomClient(PrivacyComProperties properties) {
        return new PrivacyComClient(properties.getUrl());
    }

}
