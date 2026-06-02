package com.bzz.miniapis.sdk.books;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        CrossrefMetadataSearchProperties.class,
        GurbaninowProperties.class,
        PoetrydbProperties.class,
        QuranApiProperties.class,
        AmanahSunnahProperties.class,
        RunyankoleBibleProperties.class,
        OpenLibraryProperties.class,
        TheBibleProperties.class,
        GoogleBooksProperties.class,
        BibleApiProperties.class,
        VedicSocietyProperties.class,
        ThirukkuralProperties.class,
        GanjoorProperties.class,
        RigVedaProperties.class,
        GutendexProperties.class,
        WizardWorldProperties.class,
        UrantiaPapersProperties.class,
        BhagavadGitaProperties.class,
        ABBliaDigitalProperties.class,
        BhagavadGitaTeluguProperties.class,
        PenguinPublishingProperties.class,
        WolneLekturyProperties.class,
        QuranCloudProperties.class,
        QuranProperties.class
})
public class BooksAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.crossrefmetadatasearch.enabled", havingValue = "true", matchIfMissing = true)
    public CrossrefMetadataSearchClient crossrefmetadatasearchClient(CrossrefMetadataSearchProperties properties) {
        return new CrossrefMetadataSearchClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.gurbaninow.enabled", havingValue = "true", matchIfMissing = true)
    public GurbaninowClient gurbaninowClient(GurbaninowProperties properties) {
        return new GurbaninowClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.poetrydb.enabled", havingValue = "true", matchIfMissing = true)
    public PoetrydbClient poetrydbClient(PoetrydbProperties properties) {
        return new PoetrydbClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.quranapi.enabled", havingValue = "true", matchIfMissing = true)
    public QuranApiClient quranapiClient(QuranApiProperties properties) {
        return new QuranApiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.amanahsunnah.enabled", havingValue = "true", matchIfMissing = true)
    public AmanahSunnahClient amanahsunnahClient(AmanahSunnahProperties properties) {
        return new AmanahSunnahClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.runyankolebible.enabled", havingValue = "true", matchIfMissing = true)
    public RunyankoleBibleClient runyankolebibleClient(RunyankoleBibleProperties properties) {
        return new RunyankoleBibleClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.openlibrary.enabled", havingValue = "true", matchIfMissing = true)
    public OpenLibraryClient openlibraryClient(OpenLibraryProperties properties) {
        return new OpenLibraryClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.thebible.enabled", havingValue = "true", matchIfMissing = true)
    public TheBibleClient thebibleClient(TheBibleProperties properties) {
        return new TheBibleClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.googlebooks.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleBooksClient googlebooksClient(GoogleBooksProperties properties) {
        return new GoogleBooksClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.bibleapi.enabled", havingValue = "true", matchIfMissing = true)
    public BibleApiClient bibleapiClient(BibleApiProperties properties) {
        return new BibleApiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.vedicsociety.enabled", havingValue = "true", matchIfMissing = true)
    public VedicSocietyClient vedicsocietyClient(VedicSocietyProperties properties) {
        return new VedicSocietyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.thirukkural.enabled", havingValue = "true", matchIfMissing = true)
    public ThirukkuralClient thirukkuralClient(ThirukkuralProperties properties) {
        return new ThirukkuralClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.ganjoor.enabled", havingValue = "true", matchIfMissing = true)
    public GanjoorClient ganjoorClient(GanjoorProperties properties) {
        return new GanjoorClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.rigveda.enabled", havingValue = "true", matchIfMissing = true)
    public RigVedaClient rigvedaClient(RigVedaProperties properties) {
        return new RigVedaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.gutendex.enabled", havingValue = "true", matchIfMissing = true)
    public GutendexClient gutendexClient(GutendexProperties properties) {
        return new GutendexClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.wizardworld.enabled", havingValue = "true", matchIfMissing = true)
    public WizardWorldClient wizardworldClient(WizardWorldProperties properties) {
        return new WizardWorldClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.urantiapapers.enabled", havingValue = "true", matchIfMissing = true)
    public UrantiaPapersClient urantiapapersClient(UrantiaPapersProperties properties) {
        return new UrantiaPapersClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.bhagavadgita.enabled", havingValue = "true", matchIfMissing = true)
    public BhagavadGitaClient bhagavadgitaClient(BhagavadGitaProperties properties) {
        return new BhagavadGitaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.abbliadigital.enabled", havingValue = "true", matchIfMissing = true)
    public ABBliaDigitalClient abbliadigitalClient(ABBliaDigitalProperties properties) {
        return new ABBliaDigitalClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.bhagavadgitatelugu.enabled", havingValue = "true", matchIfMissing = true)
    public BhagavadGitaTeluguClient bhagavadgitateluguClient(BhagavadGitaTeluguProperties properties) {
        return new BhagavadGitaTeluguClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.penguinpublishing.enabled", havingValue = "true", matchIfMissing = true)
    public PenguinPublishingClient penguinpublishingClient(PenguinPublishingProperties properties) {
        return new PenguinPublishingClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.wolnelektury.enabled", havingValue = "true", matchIfMissing = true)
    public WolneLekturyClient wolnelekturyClient(WolneLekturyProperties properties) {
        return new WolneLekturyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.qurancloud.enabled", havingValue = "true", matchIfMissing = true)
    public QuranCloudClient qurancloudClient(QuranCloudProperties properties) {
        return new QuranCloudClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.quran.enabled", havingValue = "true", matchIfMissing = true)
    public QuranClient quranClient(QuranProperties properties) {
        return new QuranClient(properties.getUrl());
    }

}
