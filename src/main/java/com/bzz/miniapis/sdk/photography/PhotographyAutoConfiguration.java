package com.bzz.miniapis.sdk.photography;

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
        ScreenshotlayerProperties.class,
        ApitemplateIoProperties.class,
        BruzuProperties.class,
        CheetahoProperties.class,
        DagpiProperties.class,
        DuplyProperties.class,
        DynapicturesProperties.class,
        FlickrProperties.class,
        GettyImagesProperties.class,
        GfycatProperties.class,
        GiphyProperties.class,
        GooglePhotosProperties.class,
        ImageUploadProperties.class,
        ImgurProperties.class,
        ImseaProperties.class,
        LoremPicsumProperties.class,
        ObjectcutProperties.class,
        PexelsProperties.class,
        PhotoroomProperties.class,
        PixabayProperties.class,
        PlacekeanuProperties.class,
        ReadmeTypingSvgProperties.class,
        RemoveBgProperties.class,
        ResmushItProperties.class,
        ShutterstockProperties.class,
        SirvProperties.class,
        UnsplashProperties.class,
        WallhavenProperties.class,
        WebdamProperties.class
})
public class PhotographyAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.screenshotlayer.enabled", havingValue = "true", matchIfMissing = true)
    public ScreenshotlayerClient screenshotlayerClient(ScreenshotlayerProperties properties) {
        return createClient(ScreenshotlayerClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.apitemplateio.enabled", havingValue = "true", matchIfMissing = true)
    public ApitemplateIoClient apitemplateioClient(ApitemplateIoProperties properties) {
        return createClient(ApitemplateIoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.bruzu.enabled", havingValue = "true", matchIfMissing = true)
    public BruzuClient bruzuClient(BruzuProperties properties) {
        return createClient(BruzuClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.cheetaho.enabled", havingValue = "true", matchIfMissing = true)
    public CheetahoClient cheetahoClient(CheetahoProperties properties) {
        return createClient(CheetahoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.dagpi.enabled", havingValue = "true", matchIfMissing = true)
    public DagpiClient dagpiClient(DagpiProperties properties) {
        return createClient(DagpiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.duply.enabled", havingValue = "true", matchIfMissing = true)
    public DuplyClient duplyClient(DuplyProperties properties) {
        return createClient(DuplyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.dynapictures.enabled", havingValue = "true", matchIfMissing = true)
    public DynapicturesClient dynapicturesClient(DynapicturesProperties properties) {
        return createClient(DynapicturesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.flickr.enabled", havingValue = "true", matchIfMissing = true)
    public FlickrClient flickrClient(FlickrProperties properties) {
        return createClient(FlickrClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.gettyimages.enabled", havingValue = "true", matchIfMissing = true)
    public GettyImagesClient gettyimagesClient(GettyImagesProperties properties) {
        return createClient(GettyImagesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.gfycat.enabled", havingValue = "true", matchIfMissing = true)
    public GfycatClient gfycatClient(GfycatProperties properties) {
        return createClient(GfycatClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.giphy.enabled", havingValue = "true", matchIfMissing = true)
    public GiphyClient giphyClient(GiphyProperties properties) {
        return createClient(GiphyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.googlephotos.enabled", havingValue = "true", matchIfMissing = true)
    public GooglePhotosClient googlephotosClient(GooglePhotosProperties properties) {
        return createClient(GooglePhotosClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.imageupload.enabled", havingValue = "true", matchIfMissing = true)
    public ImageUploadClient imageuploadClient(ImageUploadProperties properties) {
        return createClient(ImageUploadClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.imgur.enabled", havingValue = "true", matchIfMissing = true)
    public ImgurClient imgurClient(ImgurProperties properties) {
        return createClient(ImgurClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.imsea.enabled", havingValue = "true", matchIfMissing = true)
    public ImseaClient imseaClient(ImseaProperties properties) {
        return createClient(ImseaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.lorempicsum.enabled", havingValue = "true", matchIfMissing = true)
    public LoremPicsumClient lorempicsumClient(LoremPicsumProperties properties) {
        return createClient(LoremPicsumClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.objectcut.enabled", havingValue = "true", matchIfMissing = true)
    public ObjectcutClient objectcutClient(ObjectcutProperties properties) {
        return createClient(ObjectcutClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.pexels.enabled", havingValue = "true", matchIfMissing = true)
    public PexelsClient pexelsClient(PexelsProperties properties) {
        return createClient(PexelsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.photoroom.enabled", havingValue = "true", matchIfMissing = true)
    public PhotoroomClient photoroomClient(PhotoroomProperties properties) {
        return createClient(PhotoroomClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.pixabay.enabled", havingValue = "true", matchIfMissing = true)
    public PixabayClient pixabayClient(PixabayProperties properties) {
        return createClient(PixabayClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.placekeanu.enabled", havingValue = "true", matchIfMissing = true)
    public PlacekeanuClient placekeanuClient(PlacekeanuProperties properties) {
        return createClient(PlacekeanuClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.readmetypingsvg.enabled", havingValue = "true", matchIfMissing = true)
    public ReadmeTypingSvgClient readmetypingsvgClient(ReadmeTypingSvgProperties properties) {
        return createClient(ReadmeTypingSvgClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.removebg.enabled", havingValue = "true", matchIfMissing = true)
    public RemoveBgClient removebgClient(RemoveBgProperties properties) {
        return createClient(RemoveBgClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.resmushit.enabled", havingValue = "true", matchIfMissing = true)
    public ResmushItClient resmushitClient(ResmushItProperties properties) {
        return createClient(ResmushItClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.shutterstock.enabled", havingValue = "true", matchIfMissing = true)
    public ShutterstockClient shutterstockClient(ShutterstockProperties properties) {
        return createClient(ShutterstockClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.sirv.enabled", havingValue = "true", matchIfMissing = true)
    public SirvClient sirvClient(SirvProperties properties) {
        return createClient(SirvClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.unsplash.enabled", havingValue = "true", matchIfMissing = true)
    public UnsplashClient unsplashClient(UnsplashProperties properties) {
        return createClient(UnsplashClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.wallhaven.enabled", havingValue = "true", matchIfMissing = true)
    public WallhavenClient wallhavenClient(WallhavenProperties properties) {
        return createClient(WallhavenClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.webdam.enabled", havingValue = "true", matchIfMissing = true)
    public WebdamClient webdamClient(WebdamProperties properties) {
        return createClient(WebdamClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
