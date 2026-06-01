package com.bzz.miniapis.sdk.music;

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
        Api7DigitalProperties.class,
        AiMasteringProperties.class,
        AudiomackProperties.class,
        BandcampProperties.class,
        BandsintownProperties.class,
        DeezerProperties.class,
        DiscogsProperties.class,
        FreesoundProperties.class,
        GaanaProperties.class,
        GeniusProperties.class,
        GenrenatorProperties.class,
        ItunesSearchProperties.class,
        JamendoProperties.class,
        JiosaavnProperties.class,
        KkboxProperties.class,
        KsoftSiLyricsProperties.class,
        LastfmProperties.class,
        LyricsOvhProperties.class,
        MixcloudProperties.class,
        MusicbrainzProperties.class,
        MusixmatchProperties.class,
        NapsterProperties.class,
        OpenwhydProperties.class,
        PhishinProperties.class,
        RadioBrowserProperties.class,
        SongkickProperties.class,
        SonglinkOdesliProperties.class,
        SongsterrProperties.class,
        SoundcloudProperties.class,
        SpotifyProperties.class,
        SunorProperties.class,
        TastediveProperties.class,
        TheaudiodbProperties.class,
        VagalumeProperties.class,
        VeromeProperties.class
})
public class MusicAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.api7digital.enabled", havingValue = "true", matchIfMissing = true)
    public Api7DigitalClient api7digitalClient(Api7DigitalProperties properties) {
        return createClient(Api7DigitalClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.aimastering.enabled", havingValue = "true", matchIfMissing = true)
    public AiMasteringClient aimasteringClient(AiMasteringProperties properties) {
        return createClient(AiMasteringClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.audiomack.enabled", havingValue = "true", matchIfMissing = true)
    public AudiomackClient audiomackClient(AudiomackProperties properties) {
        return createClient(AudiomackClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.bandcamp.enabled", havingValue = "true", matchIfMissing = true)
    public BandcampClient bandcampClient(BandcampProperties properties) {
        return createClient(BandcampClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.bandsintown.enabled", havingValue = "true", matchIfMissing = true)
    public BandsintownClient bandsintownClient(BandsintownProperties properties) {
        return createClient(BandsintownClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.deezer.enabled", havingValue = "true", matchIfMissing = true)
    public DeezerClient deezerClient(DeezerProperties properties) {
        return createClient(DeezerClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.discogs.enabled", havingValue = "true", matchIfMissing = true)
    public DiscogsClient discogsClient(DiscogsProperties properties) {
        return createClient(DiscogsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.freesound.enabled", havingValue = "true", matchIfMissing = true)
    public FreesoundClient freesoundClient(FreesoundProperties properties) {
        return createClient(FreesoundClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.gaana.enabled", havingValue = "true", matchIfMissing = true)
    public GaanaClient gaanaClient(GaanaProperties properties) {
        return createClient(GaanaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.genius.enabled", havingValue = "true", matchIfMissing = true)
    public GeniusClient geniusClient(GeniusProperties properties) {
        return createClient(GeniusClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.genrenator.enabled", havingValue = "true", matchIfMissing = true)
    public GenrenatorClient genrenatorClient(GenrenatorProperties properties) {
        return createClient(GenrenatorClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.itunessearch.enabled", havingValue = "true", matchIfMissing = true)
    public ItunesSearchClient itunessearchClient(ItunesSearchProperties properties) {
        return createClient(ItunesSearchClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.jamendo.enabled", havingValue = "true", matchIfMissing = true)
    public JamendoClient jamendoClient(JamendoProperties properties) {
        return createClient(JamendoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.jiosaavn.enabled", havingValue = "true", matchIfMissing = true)
    public JiosaavnClient jiosaavnClient(JiosaavnProperties properties) {
        return createClient(JiosaavnClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.kkbox.enabled", havingValue = "true", matchIfMissing = true)
    public KkboxClient kkboxClient(KkboxProperties properties) {
        return createClient(KkboxClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.ksoftsilyrics.enabled", havingValue = "true", matchIfMissing = true)
    public KsoftSiLyricsClient ksoftsilyricsClient(KsoftSiLyricsProperties properties) {
        return createClient(KsoftSiLyricsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.lastfm.enabled", havingValue = "true", matchIfMissing = true)
    public LastfmClient lastfmClient(LastfmProperties properties) {
        return createClient(LastfmClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.lyricsovh.enabled", havingValue = "true", matchIfMissing = true)
    public LyricsOvhClient lyricsovhClient(LyricsOvhProperties properties) {
        return createClient(LyricsOvhClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.mixcloud.enabled", havingValue = "true", matchIfMissing = true)
    public MixcloudClient mixcloudClient(MixcloudProperties properties) {
        return createClient(MixcloudClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.musicbrainz.enabled", havingValue = "true", matchIfMissing = true)
    public MusicbrainzClient musicbrainzClient(MusicbrainzProperties properties) {
        return createClient(MusicbrainzClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.musixmatch.enabled", havingValue = "true", matchIfMissing = true)
    public MusixmatchClient musixmatchClient(MusixmatchProperties properties) {
        return createClient(MusixmatchClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.napster.enabled", havingValue = "true", matchIfMissing = true)
    public NapsterClient napsterClient(NapsterProperties properties) {
        return createClient(NapsterClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.openwhyd.enabled", havingValue = "true", matchIfMissing = true)
    public OpenwhydClient openwhydClient(OpenwhydProperties properties) {
        return createClient(OpenwhydClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.phishin.enabled", havingValue = "true", matchIfMissing = true)
    public PhishinClient phishinClient(PhishinProperties properties) {
        return createClient(PhishinClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.radiobrowser.enabled", havingValue = "true", matchIfMissing = true)
    public RadioBrowserClient radiobrowserClient(RadioBrowserProperties properties) {
        return createClient(RadioBrowserClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.songkick.enabled", havingValue = "true", matchIfMissing = true)
    public SongkickClient songkickClient(SongkickProperties properties) {
        return createClient(SongkickClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.songlinkodesli.enabled", havingValue = "true", matchIfMissing = true)
    public SonglinkOdesliClient songlinkodesliClient(SonglinkOdesliProperties properties) {
        return createClient(SonglinkOdesliClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.songsterr.enabled", havingValue = "true", matchIfMissing = true)
    public SongsterrClient songsterrClient(SongsterrProperties properties) {
        return createClient(SongsterrClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.soundcloud.enabled", havingValue = "true", matchIfMissing = true)
    public SoundcloudClient soundcloudClient(SoundcloudProperties properties) {
        return createClient(SoundcloudClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.spotify.enabled", havingValue = "true", matchIfMissing = true)
    public SpotifyClient spotifyClient(SpotifyProperties properties) {
        return createClient(SpotifyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.sunor.enabled", havingValue = "true", matchIfMissing = true)
    public SunorClient sunorClient(SunorProperties properties) {
        return createClient(SunorClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.tastedive.enabled", havingValue = "true", matchIfMissing = true)
    public TastediveClient tastediveClient(TastediveProperties properties) {
        return createClient(TastediveClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.theaudiodb.enabled", havingValue = "true", matchIfMissing = true)
    public TheaudiodbClient theaudiodbClient(TheaudiodbProperties properties) {
        return createClient(TheaudiodbClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.vagalume.enabled", havingValue = "true", matchIfMissing = true)
    public VagalumeClient vagalumeClient(VagalumeProperties properties) {
        return createClient(VagalumeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.verome.enabled", havingValue = "true", matchIfMissing = true)
    public VeromeClient veromeClient(VeromeProperties properties) {
        return createClient(VeromeClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
