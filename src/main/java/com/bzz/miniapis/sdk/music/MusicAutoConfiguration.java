package com.bzz.miniapis.sdk.music;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        GaanaProperties.class,
        JiosaavnProperties.class,
        GeniusProperties.class,
        BandcampProperties.class,
        KkboxProperties.class,
        JamendoProperties.class,
        DiscogsProperties.class,
        LastfmProperties.class,
        LyricsOvhProperties.class,
        AiMasteringProperties.class,
        MixcloudProperties.class,
        OpenwhydProperties.class,
        TastediveProperties.class,
        SonglinkOdesliProperties.class,
        FreesoundProperties.class,
        SongkickProperties.class,
        SoundcloudProperties.class,
        VeromeProperties.class,
        RadioBrowserProperties.class,
        DeezerProperties.class,
        SongsterrProperties.class,
        GenrenatorProperties.class,
        MusicbrainzProperties.class,
        TheaudiodbProperties.class,
        AudiomackProperties.class,
        SunorProperties.class,
        Api7DigitalProperties.class,
        MusixmatchProperties.class,
        SpotifyProperties.class,
        PhishinProperties.class,
        BandsintownProperties.class
})
public class MusicAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.gaana.enabled", havingValue = "true", matchIfMissing = true)
    public GaanaClient gaanaClient(GaanaProperties properties) {
        return new GaanaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.jiosaavn.enabled", havingValue = "true", matchIfMissing = true)
    public JiosaavnClient jiosaavnClient(JiosaavnProperties properties) {
        return new JiosaavnClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.genius.enabled", havingValue = "true", matchIfMissing = true)
    public GeniusClient geniusClient(GeniusProperties properties) {
        return new GeniusClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.bandcamp.enabled", havingValue = "true", matchIfMissing = true)
    public BandcampClient bandcampClient(BandcampProperties properties) {
        return new BandcampClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.kkbox.enabled", havingValue = "true", matchIfMissing = true)
    public KkboxClient kkboxClient(KkboxProperties properties) {
        return new KkboxClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.jamendo.enabled", havingValue = "true", matchIfMissing = true)
    public JamendoClient jamendoClient(JamendoProperties properties) {
        return new JamendoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.discogs.enabled", havingValue = "true", matchIfMissing = true)
    public DiscogsClient discogsClient(DiscogsProperties properties) {
        return new DiscogsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.lastfm.enabled", havingValue = "true", matchIfMissing = true)
    public LastfmClient lastfmClient(LastfmProperties properties) {
        return new LastfmClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.lyricsovh.enabled", havingValue = "true", matchIfMissing = true)
    public LyricsOvhClient lyricsovhClient(LyricsOvhProperties properties) {
        return new LyricsOvhClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.aimastering.enabled", havingValue = "true", matchIfMissing = true)
    public AiMasteringClient aimasteringClient(AiMasteringProperties properties) {
        return new AiMasteringClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.mixcloud.enabled", havingValue = "true", matchIfMissing = true)
    public MixcloudClient mixcloudClient(MixcloudProperties properties) {
        return new MixcloudClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.openwhyd.enabled", havingValue = "true", matchIfMissing = true)
    public OpenwhydClient openwhydClient(OpenwhydProperties properties) {
        return new OpenwhydClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.tastedive.enabled", havingValue = "true", matchIfMissing = true)
    public TastediveClient tastediveClient(TastediveProperties properties) {
        return new TastediveClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.songlinkodesli.enabled", havingValue = "true", matchIfMissing = true)
    public SonglinkOdesliClient songlinkodesliClient(SonglinkOdesliProperties properties) {
        return new SonglinkOdesliClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.freesound.enabled", havingValue = "true", matchIfMissing = true)
    public FreesoundClient freesoundClient(FreesoundProperties properties) {
        return new FreesoundClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.songkick.enabled", havingValue = "true", matchIfMissing = true)
    public SongkickClient songkickClient(SongkickProperties properties) {
        return new SongkickClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.soundcloud.enabled", havingValue = "true", matchIfMissing = true)
    public SoundcloudClient soundcloudClient(SoundcloudProperties properties) {
        return new SoundcloudClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.verome.enabled", havingValue = "true", matchIfMissing = true)
    public VeromeClient veromeClient(VeromeProperties properties) {
        return new VeromeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.radiobrowser.enabled", havingValue = "true", matchIfMissing = true)
    public RadioBrowserClient radiobrowserClient(RadioBrowserProperties properties) {
        return new RadioBrowserClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.deezer.enabled", havingValue = "true", matchIfMissing = true)
    public DeezerClient deezerClient(DeezerProperties properties) {
        return new DeezerClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.songsterr.enabled", havingValue = "true", matchIfMissing = true)
    public SongsterrClient songsterrClient(SongsterrProperties properties) {
        return new SongsterrClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.genrenator.enabled", havingValue = "true", matchIfMissing = true)
    public GenrenatorClient genrenatorClient(GenrenatorProperties properties) {
        return new GenrenatorClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.musicbrainz.enabled", havingValue = "true", matchIfMissing = true)
    public MusicbrainzClient musicbrainzClient(MusicbrainzProperties properties) {
        return new MusicbrainzClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.theaudiodb.enabled", havingValue = "true", matchIfMissing = true)
    public TheaudiodbClient theaudiodbClient(TheaudiodbProperties properties) {
        return new TheaudiodbClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.audiomack.enabled", havingValue = "true", matchIfMissing = true)
    public AudiomackClient audiomackClient(AudiomackProperties properties) {
        return new AudiomackClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.sunor.enabled", havingValue = "true", matchIfMissing = true)
    public SunorClient sunorClient(SunorProperties properties) {
        return new SunorClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.api7digital.enabled", havingValue = "true", matchIfMissing = true)
    public Api7DigitalClient api7digitalClient(Api7DigitalProperties properties) {
        return new Api7DigitalClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.musixmatch.enabled", havingValue = "true", matchIfMissing = true)
    public MusixmatchClient musixmatchClient(MusixmatchProperties properties) {
        return new MusixmatchClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.spotify.enabled", havingValue = "true", matchIfMissing = true)
    public SpotifyClient spotifyClient(SpotifyProperties properties) {
        return new SpotifyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.phishin.enabled", havingValue = "true", matchIfMissing = true)
    public PhishinClient phishinClient(PhishinProperties properties) {
        return new PhishinClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.music.bandsintown.enabled", havingValue = "true", matchIfMissing = true)
    public BandsintownClient bandsintownClient(BandsintownProperties properties) {
        return new BandsintownClient(properties.getUrl());
    }

}
