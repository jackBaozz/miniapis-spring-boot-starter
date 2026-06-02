package com.bzz.miniapis.sdk.social;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        Api4ChanProperties.class,
        BlueskyProperties.class,
        HackernewsProperties.class,
        BloggerProperties.class,
        LanyardProperties.class,
        DisqusProperties.class,
        FullContactProperties.class,
        FacebookProperties.class,
        AyrshareProperties.class,
        LineProperties.class,
        FuckOffAsAServiceProperties.class,
        NaverProperties.class,
        SaiditProperties.class,
        TiktokProperties.class,
        DiscordProperties.class,
        RedditProperties.class,
        HashnodeProperties.class,
        KakaoProperties.class,
        TwitchProperties.class,
        ProductHuntProperties.class,
        LinkedinProperties.class,
        TelegramMtprotoProperties.class,
        GetxapiProperties.class,
        MicrosoftGraphProperties.class,
        TelegramBotProperties.class,
        TelegraphProperties.class,
        TumblrProperties.class,
        InstagramProperties.class,
        VkProperties.class,
        TrashNothingProperties.class,
        PinterestProperties.class,
        MeetupComProperties.class,
        OpenCollectiveProperties.class,
        CiscoSparkProperties.class,
        TwitterProperties.class,
        FoursquareProperties.class,
        AztroProperties.class,
        TamtamProperties.class,
        SlackProperties.class,
        RevoltProperties.class
})
public class SocialAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.api4chan.enabled", havingValue = "true", matchIfMissing = true)
    public Api4ChanClient api4chanClient(Api4ChanProperties properties) {
        return new Api4ChanClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.bluesky.enabled", havingValue = "true", matchIfMissing = true)
    public BlueskyClient blueskyClient(BlueskyProperties properties) {
        return new BlueskyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.hackernews.enabled", havingValue = "true", matchIfMissing = true)
    public HackernewsClient hackernewsClient(HackernewsProperties properties) {
        return new HackernewsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.blogger.enabled", havingValue = "true", matchIfMissing = true)
    public BloggerClient bloggerClient(BloggerProperties properties) {
        return new BloggerClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.lanyard.enabled", havingValue = "true", matchIfMissing = true)
    public LanyardClient lanyardClient(LanyardProperties properties) {
        return new LanyardClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.disqus.enabled", havingValue = "true", matchIfMissing = true)
    public DisqusClient disqusClient(DisqusProperties properties) {
        return new DisqusClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.fullcontact.enabled", havingValue = "true", matchIfMissing = true)
    public FullContactClient fullcontactClient(FullContactProperties properties) {
        return new FullContactClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.facebook.enabled", havingValue = "true", matchIfMissing = true)
    public FacebookClient facebookClient(FacebookProperties properties) {
        return new FacebookClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.ayrshare.enabled", havingValue = "true", matchIfMissing = true)
    public AyrshareClient ayrshareClient(AyrshareProperties properties) {
        return new AyrshareClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.line.enabled", havingValue = "true", matchIfMissing = true)
    public LineClient lineClient(LineProperties properties) {
        return new LineClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.fuckoffasaservice.enabled", havingValue = "true", matchIfMissing = true)
    public FuckOffAsAServiceClient fuckoffasaserviceClient(FuckOffAsAServiceProperties properties) {
        return new FuckOffAsAServiceClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.naver.enabled", havingValue = "true", matchIfMissing = true)
    public NaverClient naverClient(NaverProperties properties) {
        return new NaverClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.saidit.enabled", havingValue = "true", matchIfMissing = true)
    public SaiditClient saiditClient(SaiditProperties properties) {
        return new SaiditClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.tiktok.enabled", havingValue = "true", matchIfMissing = true)
    public TiktokClient tiktokClient(TiktokProperties properties) {
        return new TiktokClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.discord.enabled", havingValue = "true", matchIfMissing = true)
    public DiscordClient discordClient(DiscordProperties properties) {
        return new DiscordClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.reddit.enabled", havingValue = "true", matchIfMissing = true)
    public RedditClient redditClient(RedditProperties properties) {
        return new RedditClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.hashnode.enabled", havingValue = "true", matchIfMissing = true)
    public HashnodeClient hashnodeClient(HashnodeProperties properties) {
        return new HashnodeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.kakao.enabled", havingValue = "true", matchIfMissing = true)
    public KakaoClient kakaoClient(KakaoProperties properties) {
        return new KakaoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.twitch.enabled", havingValue = "true", matchIfMissing = true)
    public TwitchClient twitchClient(TwitchProperties properties) {
        return new TwitchClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.producthunt.enabled", havingValue = "true", matchIfMissing = true)
    public ProductHuntClient producthuntClient(ProductHuntProperties properties) {
        return new ProductHuntClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.linkedin.enabled", havingValue = "true", matchIfMissing = true)
    public LinkedinClient linkedinClient(LinkedinProperties properties) {
        return new LinkedinClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.telegrammtproto.enabled", havingValue = "true", matchIfMissing = true)
    public TelegramMtprotoClient telegrammtprotoClient(TelegramMtprotoProperties properties) {
        return new TelegramMtprotoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.getxapi.enabled", havingValue = "true", matchIfMissing = true)
    public GetxapiClient getxapiClient(GetxapiProperties properties) {
        return new GetxapiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.microsoftgraph.enabled", havingValue = "true", matchIfMissing = true)
    public MicrosoftGraphClient microsoftgraphClient(MicrosoftGraphProperties properties) {
        return new MicrosoftGraphClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.telegrambot.enabled", havingValue = "true", matchIfMissing = true)
    public TelegramBotClient telegrambotClient(TelegramBotProperties properties) {
        return new TelegramBotClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.telegraph.enabled", havingValue = "true", matchIfMissing = true)
    public TelegraphClient telegraphClient(TelegraphProperties properties) {
        return new TelegraphClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.tumblr.enabled", havingValue = "true", matchIfMissing = true)
    public TumblrClient tumblrClient(TumblrProperties properties) {
        return new TumblrClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.instagram.enabled", havingValue = "true", matchIfMissing = true)
    public InstagramClient instagramClient(InstagramProperties properties) {
        return new InstagramClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.vk.enabled", havingValue = "true", matchIfMissing = true)
    public VkClient vkClient(VkProperties properties) {
        return new VkClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.trashnothing.enabled", havingValue = "true", matchIfMissing = true)
    public TrashNothingClient trashnothingClient(TrashNothingProperties properties) {
        return new TrashNothingClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.pinterest.enabled", havingValue = "true", matchIfMissing = true)
    public PinterestClient pinterestClient(PinterestProperties properties) {
        return new PinterestClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.meetupcom.enabled", havingValue = "true", matchIfMissing = true)
    public MeetupComClient meetupcomClient(MeetupComProperties properties) {
        return new MeetupComClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.opencollective.enabled", havingValue = "true", matchIfMissing = true)
    public OpenCollectiveClient opencollectiveClient(OpenCollectiveProperties properties) {
        return new OpenCollectiveClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.ciscospark.enabled", havingValue = "true", matchIfMissing = true)
    public CiscoSparkClient ciscosparkClient(CiscoSparkProperties properties) {
        return new CiscoSparkClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.twitter.enabled", havingValue = "true", matchIfMissing = true)
    public TwitterClient twitterClient(TwitterProperties properties) {
        return new TwitterClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.foursquare.enabled", havingValue = "true", matchIfMissing = true)
    public FoursquareClient foursquareClient(FoursquareProperties properties) {
        return new FoursquareClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.aztro.enabled", havingValue = "true", matchIfMissing = true)
    public AztroClient aztroClient(AztroProperties properties) {
        return new AztroClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.tamtam.enabled", havingValue = "true", matchIfMissing = true)
    public TamtamClient tamtamClient(TamtamProperties properties) {
        return new TamtamClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.slack.enabled", havingValue = "true", matchIfMissing = true)
    public SlackClient slackClient(SlackProperties properties) {
        return new SlackClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.social.revolt.enabled", havingValue = "true", matchIfMissing = true)
    public RevoltClient revoltClient(RevoltProperties properties) {
        return new RevoltClient(properties.getUrl());
    }

}
