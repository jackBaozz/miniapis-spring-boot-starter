package com.bzz.miniapis.sdk.photography;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        FlickrProperties.class,
        GooglePhotosProperties.class,
        ReadmeTypingSvgProperties.class,
        LoremPicsumProperties.class,
        PexelsProperties.class,
        PixabayProperties.class,
        DuplyProperties.class,
        PhotoroomProperties.class,
        CheetahoProperties.class,
        ObjectcutProperties.class,
        GiphyProperties.class,
        RemoveBgProperties.class,
        ScreenshotlayerProperties.class,
        ShutterstockProperties.class,
        ApitemplateIoProperties.class,
        DagpiProperties.class,
        ImgurProperties.class,
        PlacekeanuProperties.class,
        WebdamProperties.class,
        ImseaProperties.class,
        DynapicturesProperties.class,
        ImageUploadProperties.class,
        WallhavenProperties.class,
        SirvProperties.class,
        GettyImagesProperties.class,
        UnsplashProperties.class
})
public class PhotographyAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.flickr.enabled", havingValue = "true", matchIfMissing = true)
    public FlickrClient flickrClient(FlickrProperties properties) {
        return new FlickrClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.googlephotos.enabled", havingValue = "true", matchIfMissing = true)
    public GooglePhotosClient googlephotosClient(GooglePhotosProperties properties) {
        return new GooglePhotosClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.readmetypingsvg.enabled", havingValue = "true", matchIfMissing = true)
    public ReadmeTypingSvgClient readmetypingsvgClient(ReadmeTypingSvgProperties properties) {
        return new ReadmeTypingSvgClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.lorempicsum.enabled", havingValue = "true", matchIfMissing = true)
    public LoremPicsumClient lorempicsumClient(LoremPicsumProperties properties) {
        return new LoremPicsumClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.pexels.enabled", havingValue = "true", matchIfMissing = true)
    public PexelsClient pexelsClient(PexelsProperties properties) {
        return new PexelsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.pixabay.enabled", havingValue = "true", matchIfMissing = true)
    public PixabayClient pixabayClient(PixabayProperties properties) {
        return new PixabayClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.duply.enabled", havingValue = "true", matchIfMissing = true)
    public DuplyClient duplyClient(DuplyProperties properties) {
        return new DuplyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.photoroom.enabled", havingValue = "true", matchIfMissing = true)
    public PhotoroomClient photoroomClient(PhotoroomProperties properties) {
        return new PhotoroomClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.cheetaho.enabled", havingValue = "true", matchIfMissing = true)
    public CheetahoClient cheetahoClient(CheetahoProperties properties) {
        return new CheetahoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.objectcut.enabled", havingValue = "true", matchIfMissing = true)
    public ObjectcutClient objectcutClient(ObjectcutProperties properties) {
        return new ObjectcutClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.giphy.enabled", havingValue = "true", matchIfMissing = true)
    public GiphyClient giphyClient(GiphyProperties properties) {
        return new GiphyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.removebg.enabled", havingValue = "true", matchIfMissing = true)
    public RemoveBgClient removebgClient(RemoveBgProperties properties) {
        return new RemoveBgClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.screenshotlayer.enabled", havingValue = "true", matchIfMissing = true)
    public ScreenshotlayerClient screenshotlayerClient(ScreenshotlayerProperties properties) {
        return new ScreenshotlayerClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.shutterstock.enabled", havingValue = "true", matchIfMissing = true)
    public ShutterstockClient shutterstockClient(ShutterstockProperties properties) {
        return new ShutterstockClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.apitemplateio.enabled", havingValue = "true", matchIfMissing = true)
    public ApitemplateIoClient apitemplateioClient(ApitemplateIoProperties properties) {
        return new ApitemplateIoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.dagpi.enabled", havingValue = "true", matchIfMissing = true)
    public DagpiClient dagpiClient(DagpiProperties properties) {
        return new DagpiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.imgur.enabled", havingValue = "true", matchIfMissing = true)
    public ImgurClient imgurClient(ImgurProperties properties) {
        return new ImgurClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.placekeanu.enabled", havingValue = "true", matchIfMissing = true)
    public PlacekeanuClient placekeanuClient(PlacekeanuProperties properties) {
        return new PlacekeanuClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.webdam.enabled", havingValue = "true", matchIfMissing = true)
    public WebdamClient webdamClient(WebdamProperties properties) {
        return new WebdamClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.imsea.enabled", havingValue = "true", matchIfMissing = true)
    public ImseaClient imseaClient(ImseaProperties properties) {
        return new ImseaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.dynapictures.enabled", havingValue = "true", matchIfMissing = true)
    public DynapicturesClient dynapicturesClient(DynapicturesProperties properties) {
        return new DynapicturesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.imageupload.enabled", havingValue = "true", matchIfMissing = true)
    public ImageUploadClient imageuploadClient(ImageUploadProperties properties) {
        return new ImageUploadClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.wallhaven.enabled", havingValue = "true", matchIfMissing = true)
    public WallhavenClient wallhavenClient(WallhavenProperties properties) {
        return new WallhavenClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.sirv.enabled", havingValue = "true", matchIfMissing = true)
    public SirvClient sirvClient(SirvProperties properties) {
        return new SirvClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.gettyimages.enabled", havingValue = "true", matchIfMissing = true)
    public GettyImagesClient gettyimagesClient(GettyImagesProperties properties) {
        return new GettyImagesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.photography.unsplash.enabled", havingValue = "true", matchIfMissing = true)
    public UnsplashClient unsplashClient(UnsplashProperties properties) {
        return new UnsplashClient(properties.getUrl());
    }

}
