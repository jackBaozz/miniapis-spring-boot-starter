package com.bzz.miniapis.sdk.urlshorteners;

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
        Api1PtProperties.class,
        BitlyProperties.class,
        CleanuriProperties.class,
        ClickmeterProperties.class,
        ClicoProperties.class,
        CuttLyProperties.class,
        DrivetUrlShortenerProperties.class,
        FreeUrlShortenerProperties.class,
        GitIoProperties.class,
        GotinyProperties.class,
        KuttProperties.class,
        MgnetMeProperties.class,
        OwoProperties.class,
        RebrandlyProperties.class,
        RedirhubProperties.class,
        ShortLinkProperties.class,
        ShrtcodeProperties.class,
        ShrtlnkProperties.class,
        TinyurlProperties.class,
        UrlbaeProperties.class
})
public class UrlShortenersAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.api1pt.enabled", havingValue = "true", matchIfMissing = true)
    public Api1PtClient api1ptClient(Api1PtProperties properties) {
        return createClient(Api1PtClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.bitly.enabled", havingValue = "true", matchIfMissing = true)
    public BitlyClient bitlyClient(BitlyProperties properties) {
        return createClient(BitlyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.cleanuri.enabled", havingValue = "true", matchIfMissing = true)
    public CleanuriClient cleanuriClient(CleanuriProperties properties) {
        return createClient(CleanuriClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.clickmeter.enabled", havingValue = "true", matchIfMissing = true)
    public ClickmeterClient clickmeterClient(ClickmeterProperties properties) {
        return createClient(ClickmeterClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.clico.enabled", havingValue = "true", matchIfMissing = true)
    public ClicoClient clicoClient(ClicoProperties properties) {
        return createClient(ClicoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.cuttly.enabled", havingValue = "true", matchIfMissing = true)
    public CuttLyClient cuttlyClient(CuttLyProperties properties) {
        return createClient(CuttLyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.driveturlshortener.enabled", havingValue = "true", matchIfMissing = true)
    public DrivetUrlShortenerClient driveturlshortenerClient(DrivetUrlShortenerProperties properties) {
        return createClient(DrivetUrlShortenerClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.freeurlshortener.enabled", havingValue = "true", matchIfMissing = true)
    public FreeUrlShortenerClient freeurlshortenerClient(FreeUrlShortenerProperties properties) {
        return createClient(FreeUrlShortenerClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.gitio.enabled", havingValue = "true", matchIfMissing = true)
    public GitIoClient gitioClient(GitIoProperties properties) {
        return createClient(GitIoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.gotiny.enabled", havingValue = "true", matchIfMissing = true)
    public GotinyClient gotinyClient(GotinyProperties properties) {
        return createClient(GotinyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.kutt.enabled", havingValue = "true", matchIfMissing = true)
    public KuttClient kuttClient(KuttProperties properties) {
        return createClient(KuttClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.mgnetme.enabled", havingValue = "true", matchIfMissing = true)
    public MgnetMeClient mgnetmeClient(MgnetMeProperties properties) {
        return createClient(MgnetMeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.owo.enabled", havingValue = "true", matchIfMissing = true)
    public OwoClient owoClient(OwoProperties properties) {
        return createClient(OwoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.rebrandly.enabled", havingValue = "true", matchIfMissing = true)
    public RebrandlyClient rebrandlyClient(RebrandlyProperties properties) {
        return createClient(RebrandlyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.redirhub.enabled", havingValue = "true", matchIfMissing = true)
    public RedirhubClient redirhubClient(RedirhubProperties properties) {
        return createClient(RedirhubClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.shortlink.enabled", havingValue = "true", matchIfMissing = true)
    public ShortLinkClient shortlinkClient(ShortLinkProperties properties) {
        return createClient(ShortLinkClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.shrtcode.enabled", havingValue = "true", matchIfMissing = true)
    public ShrtcodeClient shrtcodeClient(ShrtcodeProperties properties) {
        return createClient(ShrtcodeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.shrtlnk.enabled", havingValue = "true", matchIfMissing = true)
    public ShrtlnkClient shrtlnkClient(ShrtlnkProperties properties) {
        return createClient(ShrtlnkClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.tinyurl.enabled", havingValue = "true", matchIfMissing = true)
    public TinyurlClient tinyurlClient(TinyurlProperties properties) {
        return createClient(TinyurlClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.urlbae.enabled", havingValue = "true", matchIfMissing = true)
    public UrlbaeClient urlbaeClient(UrlbaeProperties properties) {
        return createClient(UrlbaeClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
