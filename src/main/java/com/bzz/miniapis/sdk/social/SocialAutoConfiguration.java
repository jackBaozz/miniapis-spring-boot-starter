package com.bzz.miniapis.sdk.social;

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
        Api4ChanProperties.class,
        AyrshareProperties.class,
        AztroProperties.class,
        BloggerProperties.class,
        BlueskyProperties.class,
        CiscoSparkProperties.class,
        DangerousDiscordDatabaseProperties.class,
        DiscordProperties.class,
        DisqusProperties.class,
        DogeMemeProperties.class,
        FacebookProperties.class,
        FoursquareProperties.class,
        FuckOffAsAServiceProperties.class,
        FullContactProperties.class,
        GetxapiProperties.class,
        HackernewsProperties.class,
        HashnodeProperties.class,
        InstagramProperties.class,
        KakaoProperties.class,
        LanyardProperties.class,
        LineProperties.class,
        LinkedinProperties.class,
        MeetupComProperties.class,
        MicrosoftGraphProperties.class,
        NaverProperties.class,
        OpenCollectiveProperties.class,
        PinterestProperties.class,
        ProductHuntProperties.class,
        RedditProperties.class,
        RevoltProperties.class,
        SaiditProperties.class,
        SlackProperties.class,
        TamtamProperties.class,
        TelegramBotProperties.class,
        TelegramMtprotoProperties.class,
        TelegraphProperties.class,
        TiktokProperties.class,
        TrashNothingProperties.class,
        TumblrProperties.class,
        TwitchProperties.class,
        TwitterProperties.class,
        VkProperties.class
})
public class SocialAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.api4chan.enabled", havingValue = "true", matchIfMissing = true)
    public Api4ChanClient api4chanClient(Api4ChanProperties properties) {
        return createClient(Api4ChanClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.ayrshare.enabled", havingValue = "true", matchIfMissing = true)
    public AyrshareClient ayrshareClient(AyrshareProperties properties) {
        return createClient(AyrshareClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.aztro.enabled", havingValue = "true", matchIfMissing = true)
    public AztroClient aztroClient(AztroProperties properties) {
        return createClient(AztroClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.blogger.enabled", havingValue = "true", matchIfMissing = true)
    public BloggerClient bloggerClient(BloggerProperties properties) {
        return createClient(BloggerClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.bluesky.enabled", havingValue = "true", matchIfMissing = true)
    public BlueskyClient blueskyClient(BlueskyProperties properties) {
        return createClient(BlueskyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.ciscospark.enabled", havingValue = "true", matchIfMissing = true)
    public CiscoSparkClient ciscosparkClient(CiscoSparkProperties properties) {
        return createClient(CiscoSparkClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.dangerousdiscorddatabase.enabled", havingValue = "true", matchIfMissing = true)
    public DangerousDiscordDatabaseClient dangerousdiscorddatabaseClient(DangerousDiscordDatabaseProperties properties) {
        return createClient(DangerousDiscordDatabaseClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.discord.enabled", havingValue = "true", matchIfMissing = true)
    public DiscordClient discordClient(DiscordProperties properties) {
        return createClient(DiscordClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.disqus.enabled", havingValue = "true", matchIfMissing = true)
    public DisqusClient disqusClient(DisqusProperties properties) {
        return createClient(DisqusClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.dogememe.enabled", havingValue = "true", matchIfMissing = true)
    public DogeMemeClient dogememeClient(DogeMemeProperties properties) {
        return createClient(DogeMemeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.facebook.enabled", havingValue = "true", matchIfMissing = true)
    public FacebookClient facebookClient(FacebookProperties properties) {
        return createClient(FacebookClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.foursquare.enabled", havingValue = "true", matchIfMissing = true)
    public FoursquareClient foursquareClient(FoursquareProperties properties) {
        return createClient(FoursquareClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.fuckoffasaservice.enabled", havingValue = "true", matchIfMissing = true)
    public FuckOffAsAServiceClient fuckoffasaserviceClient(FuckOffAsAServiceProperties properties) {
        return createClient(FuckOffAsAServiceClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.fullcontact.enabled", havingValue = "true", matchIfMissing = true)
    public FullContactClient fullcontactClient(FullContactProperties properties) {
        return createClient(FullContactClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.getxapi.enabled", havingValue = "true", matchIfMissing = true)
    public GetxapiClient getxapiClient(GetxapiProperties properties) {
        return createClient(GetxapiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.hackernews.enabled", havingValue = "true", matchIfMissing = true)
    public HackernewsClient hackernewsClient(HackernewsProperties properties) {
        return createClient(HackernewsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.hashnode.enabled", havingValue = "true", matchIfMissing = true)
    public HashnodeClient hashnodeClient(HashnodeProperties properties) {
        return createClient(HashnodeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.instagram.enabled", havingValue = "true", matchIfMissing = true)
    public InstagramClient instagramClient(InstagramProperties properties) {
        return createClient(InstagramClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.kakao.enabled", havingValue = "true", matchIfMissing = true)
    public KakaoClient kakaoClient(KakaoProperties properties) {
        return createClient(KakaoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.lanyard.enabled", havingValue = "true", matchIfMissing = true)
    public LanyardClient lanyardClient(LanyardProperties properties) {
        return createClient(LanyardClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.line.enabled", havingValue = "true", matchIfMissing = true)
    public LineClient lineClient(LineProperties properties) {
        return createClient(LineClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.linkedin.enabled", havingValue = "true", matchIfMissing = true)
    public LinkedinClient linkedinClient(LinkedinProperties properties) {
        return createClient(LinkedinClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.meetupcom.enabled", havingValue = "true", matchIfMissing = true)
    public MeetupComClient meetupcomClient(MeetupComProperties properties) {
        return createClient(MeetupComClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.microsoftgraph.enabled", havingValue = "true", matchIfMissing = true)
    public MicrosoftGraphClient microsoftgraphClient(MicrosoftGraphProperties properties) {
        return createClient(MicrosoftGraphClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.naver.enabled", havingValue = "true", matchIfMissing = true)
    public NaverClient naverClient(NaverProperties properties) {
        return createClient(NaverClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.opencollective.enabled", havingValue = "true", matchIfMissing = true)
    public OpenCollectiveClient opencollectiveClient(OpenCollectiveProperties properties) {
        return createClient(OpenCollectiveClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.pinterest.enabled", havingValue = "true", matchIfMissing = true)
    public PinterestClient pinterestClient(PinterestProperties properties) {
        return createClient(PinterestClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.producthunt.enabled", havingValue = "true", matchIfMissing = true)
    public ProductHuntClient producthuntClient(ProductHuntProperties properties) {
        return createClient(ProductHuntClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.reddit.enabled", havingValue = "true", matchIfMissing = true)
    public RedditClient redditClient(RedditProperties properties) {
        return createClient(RedditClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.revolt.enabled", havingValue = "true", matchIfMissing = true)
    public RevoltClient revoltClient(RevoltProperties properties) {
        return createClient(RevoltClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.saidit.enabled", havingValue = "true", matchIfMissing = true)
    public SaiditClient saiditClient(SaiditProperties properties) {
        return createClient(SaiditClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.slack.enabled", havingValue = "true", matchIfMissing = true)
    public SlackClient slackClient(SlackProperties properties) {
        return createClient(SlackClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.tamtam.enabled", havingValue = "true", matchIfMissing = true)
    public TamtamClient tamtamClient(TamtamProperties properties) {
        return createClient(TamtamClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.telegrambot.enabled", havingValue = "true", matchIfMissing = true)
    public TelegramBotClient telegrambotClient(TelegramBotProperties properties) {
        return createClient(TelegramBotClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.telegrammtproto.enabled", havingValue = "true", matchIfMissing = true)
    public TelegramMtprotoClient telegrammtprotoClient(TelegramMtprotoProperties properties) {
        return createClient(TelegramMtprotoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.telegraph.enabled", havingValue = "true", matchIfMissing = true)
    public TelegraphClient telegraphClient(TelegraphProperties properties) {
        return createClient(TelegraphClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.tiktok.enabled", havingValue = "true", matchIfMissing = true)
    public TiktokClient tiktokClient(TiktokProperties properties) {
        return createClient(TiktokClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.trashnothing.enabled", havingValue = "true", matchIfMissing = true)
    public TrashNothingClient trashnothingClient(TrashNothingProperties properties) {
        return createClient(TrashNothingClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.tumblr.enabled", havingValue = "true", matchIfMissing = true)
    public TumblrClient tumblrClient(TumblrProperties properties) {
        return createClient(TumblrClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.twitch.enabled", havingValue = "true", matchIfMissing = true)
    public TwitchClient twitchClient(TwitchProperties properties) {
        return createClient(TwitchClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.twitter.enabled", havingValue = "true", matchIfMissing = true)
    public TwitterClient twitterClient(TwitterProperties properties) {
        return createClient(TwitterClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.vk.enabled", havingValue = "true", matchIfMissing = true)
    public VkClient vkClient(VkProperties properties) {
        return createClient(VkClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
