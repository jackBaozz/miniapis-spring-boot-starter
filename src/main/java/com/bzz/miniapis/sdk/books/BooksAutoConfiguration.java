package com.bzz.miniapis.sdk.books;

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
        ABBliaDigitalProperties.class,
        AmanahSunnahProperties.class,
        BhagavadGitaTeluguProperties.class,
        BibleApiProperties.class,
        CrossrefMetadataSearchProperties.class,
        GanjoorProperties.class,
        GoogleBooksProperties.class,
        GurbaninowProperties.class,
        GutendexProperties.class,
        OpenLibraryProperties.class,
        PenguinPublishingProperties.class,
        PoetrydbProperties.class,
        QuranProperties.class,
        QuranCloudProperties.class,
        QuranApiProperties.class,
        RigVedaProperties.class,
        RunyankoleBibleProperties.class,
        TheBibleProperties.class,
        ThirukkuralProperties.class,
        UrantiaPapersProperties.class,
        VedicSocietyProperties.class,
        WizardWorldProperties.class,
        WolneLekturyProperties.class
})
public class BooksAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.abbliadigital.enabled", havingValue = "true", matchIfMissing = true)
    public ABBliaDigitalClient abbliadigitalClient(ABBliaDigitalProperties properties) {
        return createClient(ABBliaDigitalClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.amanahsunnah.enabled", havingValue = "true", matchIfMissing = true)
    public AmanahSunnahClient amanahsunnahClient(AmanahSunnahProperties properties) {
        return createClient(AmanahSunnahClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.bhagavadgitatelugu.enabled", havingValue = "true", matchIfMissing = true)
    public BhagavadGitaTeluguClient bhagavadgitateluguClient(BhagavadGitaTeluguProperties properties) {
        return createClient(BhagavadGitaTeluguClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.bibleapi.enabled", havingValue = "true", matchIfMissing = true)
    public BibleApiClient bibleapiClient(BibleApiProperties properties) {
        return createClient(BibleApiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.crossrefmetadatasearch.enabled", havingValue = "true", matchIfMissing = true)
    public CrossrefMetadataSearchClient crossrefmetadatasearchClient(CrossrefMetadataSearchProperties properties) {
        return createClient(CrossrefMetadataSearchClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.ganjoor.enabled", havingValue = "true", matchIfMissing = true)
    public GanjoorClient ganjoorClient(GanjoorProperties properties) {
        return createClient(GanjoorClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.googlebooks.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleBooksClient googlebooksClient(GoogleBooksProperties properties) {
        return createClient(GoogleBooksClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.gurbaninow.enabled", havingValue = "true", matchIfMissing = true)
    public GurbaninowClient gurbaninowClient(GurbaninowProperties properties) {
        return createClient(GurbaninowClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.gutendex.enabled", havingValue = "true", matchIfMissing = true)
    public GutendexClient gutendexClient(GutendexProperties properties) {
        return createClient(GutendexClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.openlibrary.enabled", havingValue = "true", matchIfMissing = true)
    public OpenLibraryClient openlibraryClient(OpenLibraryProperties properties) {
        return createClient(OpenLibraryClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.penguinpublishing.enabled", havingValue = "true", matchIfMissing = true)
    public PenguinPublishingClient penguinpublishingClient(PenguinPublishingProperties properties) {
        return createClient(PenguinPublishingClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.poetrydb.enabled", havingValue = "true", matchIfMissing = true)
    public PoetrydbClient poetrydbClient(PoetrydbProperties properties) {
        return createClient(PoetrydbClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.quran.enabled", havingValue = "true", matchIfMissing = true)
    public QuranClient quranClient(QuranProperties properties) {
        return createClient(QuranClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.qurancloud.enabled", havingValue = "true", matchIfMissing = true)
    public QuranCloudClient qurancloudClient(QuranCloudProperties properties) {
        return createClient(QuranCloudClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.quranapi.enabled", havingValue = "true", matchIfMissing = true)
    public QuranApiClient quranapiClient(QuranApiProperties properties) {
        return createClient(QuranApiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.rigveda.enabled", havingValue = "true", matchIfMissing = true)
    public RigVedaClient rigvedaClient(RigVedaProperties properties) {
        return createClient(RigVedaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.runyankolebible.enabled", havingValue = "true", matchIfMissing = true)
    public RunyankoleBibleClient runyankolebibleClient(RunyankoleBibleProperties properties) {
        return createClient(RunyankoleBibleClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.thebible.enabled", havingValue = "true", matchIfMissing = true)
    public TheBibleClient thebibleClient(TheBibleProperties properties) {
        return createClient(TheBibleClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.thirukkural.enabled", havingValue = "true", matchIfMissing = true)
    public ThirukkuralClient thirukkuralClient(ThirukkuralProperties properties) {
        return createClient(ThirukkuralClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.urantiapapers.enabled", havingValue = "true", matchIfMissing = true)
    public UrantiaPapersClient urantiapapersClient(UrantiaPapersProperties properties) {
        return createClient(UrantiaPapersClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.vedicsociety.enabled", havingValue = "true", matchIfMissing = true)
    public VedicSocietyClient vedicsocietyClient(VedicSocietyProperties properties) {
        return createClient(VedicSocietyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.wizardworld.enabled", havingValue = "true", matchIfMissing = true)
    public WizardWorldClient wizardworldClient(WizardWorldProperties properties) {
        return createClient(WizardWorldClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.books.wolnelektury.enabled", havingValue = "true", matchIfMissing = true)
    public WolneLekturyClient wolnelekturyClient(WolneLekturyProperties properties) {
        return createClient(WolneLekturyClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
