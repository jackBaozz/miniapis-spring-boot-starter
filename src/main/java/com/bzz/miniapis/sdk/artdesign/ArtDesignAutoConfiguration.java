package com.bzz.miniapis.sdk.artdesign;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        EmojihubProperties.class,
        HarvardArtMuseumsProperties.class,
        ColormindProperties.class,
        ArtInstituteOfChicagoProperties.class,
        EuropeanaProperties.class,
        Icons8Properties.class,
        MetropolitanMuseumOfArtProperties.class,
        IconHorseProperties.class,
        ColourloversProperties.class,
        NounProjectProperties.class,
        LordiconProperties.class,
        CooperHewittProperties.class,
        RijksmuseumProperties.class,
        WordCloudProperties.class,
        DribbbleProperties.class,
        PhpNoiseProperties.class,
        XcolorsProperties.class,
        PixelEncounterProperties.class,
        IconfinderProperties.class
})
public class ArtDesignAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.emojihub.enabled", havingValue = "true", matchIfMissing = true)
    public EmojihubClient emojihubClient(EmojihubProperties properties) {
        return new EmojihubClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.harvardartmuseums.enabled", havingValue = "true", matchIfMissing = true)
    public HarvardArtMuseumsClient harvardartmuseumsClient(HarvardArtMuseumsProperties properties) {
        return new HarvardArtMuseumsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.colormind.enabled", havingValue = "true", matchIfMissing = true)
    public ColormindClient colormindClient(ColormindProperties properties) {
        return new ColormindClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.artinstituteofchicago.enabled", havingValue = "true", matchIfMissing = true)
    public ArtInstituteOfChicagoClient artinstituteofchicagoClient(ArtInstituteOfChicagoProperties properties) {
        return new ArtInstituteOfChicagoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.europeana.enabled", havingValue = "true", matchIfMissing = true)
    public EuropeanaClient europeanaClient(EuropeanaProperties properties) {
        return new EuropeanaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.icons8.enabled", havingValue = "true", matchIfMissing = true)
    public Icons8Client icons8Client(Icons8Properties properties) {
        return new Icons8Client(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.metropolitanmuseumofart.enabled", havingValue = "true", matchIfMissing = true)
    public MetropolitanMuseumOfArtClient metropolitanmuseumofartClient(MetropolitanMuseumOfArtProperties properties) {
        return new MetropolitanMuseumOfArtClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.iconhorse.enabled", havingValue = "true", matchIfMissing = true)
    public IconHorseClient iconhorseClient(IconHorseProperties properties) {
        return new IconHorseClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.colourlovers.enabled", havingValue = "true", matchIfMissing = true)
    public ColourloversClient colourloversClient(ColourloversProperties properties) {
        return new ColourloversClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.nounproject.enabled", havingValue = "true", matchIfMissing = true)
    public NounProjectClient nounprojectClient(NounProjectProperties properties) {
        return new NounProjectClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.lordicon.enabled", havingValue = "true", matchIfMissing = true)
    public LordiconClient lordiconClient(LordiconProperties properties) {
        return new LordiconClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.cooperhewitt.enabled", havingValue = "true", matchIfMissing = true)
    public CooperHewittClient cooperhewittClient(CooperHewittProperties properties) {
        return new CooperHewittClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.rijksmuseum.enabled", havingValue = "true", matchIfMissing = true)
    public RijksmuseumClient rijksmuseumClient(RijksmuseumProperties properties) {
        return new RijksmuseumClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.wordcloud.enabled", havingValue = "true", matchIfMissing = true)
    public WordCloudClient wordcloudClient(WordCloudProperties properties) {
        return new WordCloudClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.dribbble.enabled", havingValue = "true", matchIfMissing = true)
    public DribbbleClient dribbbleClient(DribbbleProperties properties) {
        return new DribbbleClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.phpnoise.enabled", havingValue = "true", matchIfMissing = true)
    public PhpNoiseClient phpnoiseClient(PhpNoiseProperties properties) {
        return new PhpNoiseClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.xcolors.enabled", havingValue = "true", matchIfMissing = true)
    public XcolorsClient xcolorsClient(XcolorsProperties properties) {
        return new XcolorsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.pixelencounter.enabled", havingValue = "true", matchIfMissing = true)
    public PixelEncounterClient pixelencounterClient(PixelEncounterProperties properties) {
        return new PixelEncounterClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.iconfinder.enabled", havingValue = "true", matchIfMissing = true)
    public IconfinderClient iconfinderClient(IconfinderProperties properties) {
        return new IconfinderClient(properties.getUrl());
    }

}
