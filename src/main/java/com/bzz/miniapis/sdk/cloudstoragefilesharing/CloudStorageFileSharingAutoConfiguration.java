package com.bzz.miniapis.sdk.cloudstoragefilesharing;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        FileupProperties.class,
        DropboxProperties.class,
        GofileProperties.class,
        FileIoProperties.class,
        DdownloadProperties.class,
        GyazoProperties.class,
        BoxProperties.class,
        PastebinProperties.class,
        PinataProperties.class,
        ImgbbProperties.class,
        GoogleDriveProperties.class,
        TheNullPointerProperties.class,
        QuipProperties.class,
        PantryProperties.class,
        FilestackProperties.class,
        OnedriveProperties.class,
        StorjProperties.class,
        Web3StorageProperties.class
})
public class CloudStorageFileSharingAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.fileup.enabled", havingValue = "true", matchIfMissing = true)
    public FileupClient fileupClient(FileupProperties properties) {
        return new FileupClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.dropbox.enabled", havingValue = "true", matchIfMissing = true)
    public DropboxClient dropboxClient(DropboxProperties properties) {
        return new DropboxClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.gofile.enabled", havingValue = "true", matchIfMissing = true)
    public GofileClient gofileClient(GofileProperties properties) {
        return new GofileClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.fileio.enabled", havingValue = "true", matchIfMissing = true)
    public FileIoClient fileioClient(FileIoProperties properties) {
        return new FileIoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.ddownload.enabled", havingValue = "true", matchIfMissing = true)
    public DdownloadClient ddownloadClient(DdownloadProperties properties) {
        return new DdownloadClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.gyazo.enabled", havingValue = "true", matchIfMissing = true)
    public GyazoClient gyazoClient(GyazoProperties properties) {
        return new GyazoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.box.enabled", havingValue = "true", matchIfMissing = true)
    public BoxClient boxClient(BoxProperties properties) {
        return new BoxClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.pastebin.enabled", havingValue = "true", matchIfMissing = true)
    public PastebinClient pastebinClient(PastebinProperties properties) {
        return new PastebinClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.pinata.enabled", havingValue = "true", matchIfMissing = true)
    public PinataClient pinataClient(PinataProperties properties) {
        return new PinataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.imgbb.enabled", havingValue = "true", matchIfMissing = true)
    public ImgbbClient imgbbClient(ImgbbProperties properties) {
        return new ImgbbClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.googledrive.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleDriveClient googledriveClient(GoogleDriveProperties properties) {
        return new GoogleDriveClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.thenullpointer.enabled", havingValue = "true", matchIfMissing = true)
    public TheNullPointerClient thenullpointerClient(TheNullPointerProperties properties) {
        return new TheNullPointerClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.quip.enabled", havingValue = "true", matchIfMissing = true)
    public QuipClient quipClient(QuipProperties properties) {
        return new QuipClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.pantry.enabled", havingValue = "true", matchIfMissing = true)
    public PantryClient pantryClient(PantryProperties properties) {
        return new PantryClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.filestack.enabled", havingValue = "true", matchIfMissing = true)
    public FilestackClient filestackClient(FilestackProperties properties) {
        return new FilestackClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.onedrive.enabled", havingValue = "true", matchIfMissing = true)
    public OnedriveClient onedriveClient(OnedriveProperties properties) {
        return new OnedriveClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.storj.enabled", havingValue = "true", matchIfMissing = true)
    public StorjClient storjClient(StorjProperties properties) {
        return new StorjClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.web3storage.enabled", havingValue = "true", matchIfMissing = true)
    public Web3StorageClient web3storageClient(Web3StorageProperties properties) {
        return new Web3StorageClient(properties.getUrl());
    }

}
