package com.bzz.miniapis.sdk.artdesign;

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
        AmThysteProperties.class,
        ArtInstituteOfChicagoProperties.class,
        ColormindProperties.class,
        ColourloversProperties.class,
        CooperHewittProperties.class,
        DribbbleProperties.class,
        EmojihubProperties.class,
        EuropeanaProperties.class,
        HarvardArtMuseumsProperties.class,
        IconHorseProperties.class,
        IconfinderProperties.class,
        Icons8Properties.class,
        LordiconProperties.class,
        MetropolitanMuseumOfArtProperties.class,
        NounProjectProperties.class,
        PhpNoiseProperties.class,
        PixelEncounterProperties.class,
        RijksmuseumProperties.class,
        WordCloudProperties.class,
        XcolorsProperties.class
})
public class ArtDesignAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.amthyste.enabled", havingValue = "true", matchIfMissing = true)
    public AmThysteClient amthysteClient(AmThysteProperties properties) {
        return createClient(AmThysteClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.artinstituteofchicago.enabled", havingValue = "true", matchIfMissing = true)
    public ArtInstituteOfChicagoClient artinstituteofchicagoClient(ArtInstituteOfChicagoProperties properties) {
        return createClient(ArtInstituteOfChicagoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.colormind.enabled", havingValue = "true", matchIfMissing = true)
    public ColormindClient colormindClient(ColormindProperties properties) {
        return createClient(ColormindClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.colourlovers.enabled", havingValue = "true", matchIfMissing = true)
    public ColourloversClient colourloversClient(ColourloversProperties properties) {
        return createClient(ColourloversClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.cooperhewitt.enabled", havingValue = "true", matchIfMissing = true)
    public CooperHewittClient cooperhewittClient(CooperHewittProperties properties) {
        return createClient(CooperHewittClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.dribbble.enabled", havingValue = "true", matchIfMissing = true)
    public DribbbleClient dribbbleClient(DribbbleProperties properties) {
        return createClient(DribbbleClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.emojihub.enabled", havingValue = "true", matchIfMissing = true)
    public EmojihubClient emojihubClient(EmojihubProperties properties) {
        return createClient(EmojihubClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.europeana.enabled", havingValue = "true", matchIfMissing = true)
    public EuropeanaClient europeanaClient(EuropeanaProperties properties) {
        return createClient(EuropeanaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.harvardartmuseums.enabled", havingValue = "true", matchIfMissing = true)
    public HarvardArtMuseumsClient harvardartmuseumsClient(HarvardArtMuseumsProperties properties) {
        return createClient(HarvardArtMuseumsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.iconhorse.enabled", havingValue = "true", matchIfMissing = true)
    public IconHorseClient iconhorseClient(IconHorseProperties properties) {
        return createClient(IconHorseClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.iconfinder.enabled", havingValue = "true", matchIfMissing = true)
    public IconfinderClient iconfinderClient(IconfinderProperties properties) {
        return createClient(IconfinderClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.icons8.enabled", havingValue = "true", matchIfMissing = true)
    public Icons8Client icons8Client(Icons8Properties properties) {
        return createClient(Icons8Client.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.lordicon.enabled", havingValue = "true", matchIfMissing = true)
    public LordiconClient lordiconClient(LordiconProperties properties) {
        return createClient(LordiconClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.metropolitanmuseumofart.enabled", havingValue = "true", matchIfMissing = true)
    public MetropolitanMuseumOfArtClient metropolitanmuseumofartClient(MetropolitanMuseumOfArtProperties properties) {
        return createClient(MetropolitanMuseumOfArtClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.nounproject.enabled", havingValue = "true", matchIfMissing = true)
    public NounProjectClient nounprojectClient(NounProjectProperties properties) {
        return createClient(NounProjectClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.phpnoise.enabled", havingValue = "true", matchIfMissing = true)
    public PhpNoiseClient phpnoiseClient(PhpNoiseProperties properties) {
        return createClient(PhpNoiseClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.pixelencounter.enabled", havingValue = "true", matchIfMissing = true)
    public PixelEncounterClient pixelencounterClient(PixelEncounterProperties properties) {
        return createClient(PixelEncounterClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.rijksmuseum.enabled", havingValue = "true", matchIfMissing = true)
    public RijksmuseumClient rijksmuseumClient(RijksmuseumProperties properties) {
        return createClient(RijksmuseumClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.wordcloud.enabled", havingValue = "true", matchIfMissing = true)
    public WordCloudClient wordcloudClient(WordCloudProperties properties) {
        return createClient(WordCloudClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.artdesign.xcolors.enabled", havingValue = "true", matchIfMissing = true)
    public XcolorsClient xcolorsClient(XcolorsProperties properties) {
        return createClient(XcolorsClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
