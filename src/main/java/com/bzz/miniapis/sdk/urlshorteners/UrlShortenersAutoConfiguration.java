package com.bzz.miniapis.sdk.urlshorteners;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        Api1PtProperties.class,
        GotinyProperties.class,
        GitIoProperties.class,
        ShortLinkProperties.class,
        CuttLyProperties.class,
        FreeUrlShortenerProperties.class,
        TinyurlProperties.class,
        ClicoProperties.class,
        ShrtcodeProperties.class,
        OwoProperties.class,
        CleanuriProperties.class,
        BitlyProperties.class,
        RebrandlyProperties.class,
        MgnetMeProperties.class,
        ShrtlnkProperties.class,
        UrlbaeProperties.class,
        RedirhubProperties.class,
        DrivetUrlShortenerProperties.class
})
public class UrlShortenersAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.api1pt.enabled", havingValue = "true", matchIfMissing = true)
    public Api1PtClient api1ptClient(Api1PtProperties properties) {
        return new Api1PtClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.gotiny.enabled", havingValue = "true", matchIfMissing = true)
    public GotinyClient gotinyClient(GotinyProperties properties) {
        return new GotinyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.gitio.enabled", havingValue = "true", matchIfMissing = true)
    public GitIoClient gitioClient(GitIoProperties properties) {
        return new GitIoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.shortlink.enabled", havingValue = "true", matchIfMissing = true)
    public ShortLinkClient shortlinkClient(ShortLinkProperties properties) {
        return new ShortLinkClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.cuttly.enabled", havingValue = "true", matchIfMissing = true)
    public CuttLyClient cuttlyClient(CuttLyProperties properties) {
        return new CuttLyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.freeurlshortener.enabled", havingValue = "true", matchIfMissing = true)
    public FreeUrlShortenerClient freeurlshortenerClient(FreeUrlShortenerProperties properties) {
        return new FreeUrlShortenerClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.tinyurl.enabled", havingValue = "true", matchIfMissing = true)
    public TinyurlClient tinyurlClient(TinyurlProperties properties) {
        return new TinyurlClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.clico.enabled", havingValue = "true", matchIfMissing = true)
    public ClicoClient clicoClient(ClicoProperties properties) {
        return new ClicoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.shrtcode.enabled", havingValue = "true", matchIfMissing = true)
    public ShrtcodeClient shrtcodeClient(ShrtcodeProperties properties) {
        return new ShrtcodeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.owo.enabled", havingValue = "true", matchIfMissing = true)
    public OwoClient owoClient(OwoProperties properties) {
        return new OwoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.cleanuri.enabled", havingValue = "true", matchIfMissing = true)
    public CleanuriClient cleanuriClient(CleanuriProperties properties) {
        return new CleanuriClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.bitly.enabled", havingValue = "true", matchIfMissing = true)
    public BitlyClient bitlyClient(BitlyProperties properties) {
        return new BitlyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.rebrandly.enabled", havingValue = "true", matchIfMissing = true)
    public RebrandlyClient rebrandlyClient(RebrandlyProperties properties) {
        return new RebrandlyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.mgnetme.enabled", havingValue = "true", matchIfMissing = true)
    public MgnetMeClient mgnetmeClient(MgnetMeProperties properties) {
        return new MgnetMeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.shrtlnk.enabled", havingValue = "true", matchIfMissing = true)
    public ShrtlnkClient shrtlnkClient(ShrtlnkProperties properties) {
        return new ShrtlnkClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.urlbae.enabled", havingValue = "true", matchIfMissing = true)
    public UrlbaeClient urlbaeClient(UrlbaeProperties properties) {
        return new UrlbaeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.redirhub.enabled", havingValue = "true", matchIfMissing = true)
    public RedirhubClient redirhubClient(RedirhubProperties properties) {
        return new RedirhubClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.urlshorteners.driveturlshortener.enabled", havingValue = "true", matchIfMissing = true)
    public DrivetUrlShortenerClient driveturlshortenerClient(DrivetUrlShortenerProperties properties) {
        return new DrivetUrlShortenerClient(properties.getUrl());
    }

}
