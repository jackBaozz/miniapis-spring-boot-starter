package com.bzz.miniapis.sdk.cloudstoragefilesharing;

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
        BoxProperties.class,
        DdownloadProperties.class,
        DropboxProperties.class,
        FileIoProperties.class,
        FilestackProperties.class,
        FileupProperties.class,
        GofileProperties.class,
        GoogleDriveProperties.class,
        GyazoProperties.class,
        ImgbbProperties.class,
        OnedriveProperties.class,
        PantryProperties.class,
        PastebinProperties.class,
        PinataProperties.class,
        QuipProperties.class,
        StorjProperties.class,
        TheNullPointerProperties.class,
        Web3StorageProperties.class
})
public class CloudStorageFileSharingAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.box.enabled", havingValue = "true", matchIfMissing = true)
    public BoxClient boxClient(BoxProperties properties) {
        return createClient(BoxClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.ddownload.enabled", havingValue = "true", matchIfMissing = true)
    public DdownloadClient ddownloadClient(DdownloadProperties properties) {
        return createClient(DdownloadClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.dropbox.enabled", havingValue = "true", matchIfMissing = true)
    public DropboxClient dropboxClient(DropboxProperties properties) {
        return createClient(DropboxClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.fileio.enabled", havingValue = "true", matchIfMissing = true)
    public FileIoClient fileioClient(FileIoProperties properties) {
        return createClient(FileIoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.filestack.enabled", havingValue = "true", matchIfMissing = true)
    public FilestackClient filestackClient(FilestackProperties properties) {
        return createClient(FilestackClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.fileup.enabled", havingValue = "true", matchIfMissing = true)
    public FileupClient fileupClient(FileupProperties properties) {
        return createClient(FileupClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.gofile.enabled", havingValue = "true", matchIfMissing = true)
    public GofileClient gofileClient(GofileProperties properties) {
        return createClient(GofileClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.googledrive.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleDriveClient googledriveClient(GoogleDriveProperties properties) {
        return createClient(GoogleDriveClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.gyazo.enabled", havingValue = "true", matchIfMissing = true)
    public GyazoClient gyazoClient(GyazoProperties properties) {
        return createClient(GyazoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.imgbb.enabled", havingValue = "true", matchIfMissing = true)
    public ImgbbClient imgbbClient(ImgbbProperties properties) {
        return createClient(ImgbbClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.onedrive.enabled", havingValue = "true", matchIfMissing = true)
    public OnedriveClient onedriveClient(OnedriveProperties properties) {
        return createClient(OnedriveClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.pantry.enabled", havingValue = "true", matchIfMissing = true)
    public PantryClient pantryClient(PantryProperties properties) {
        return createClient(PantryClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.pastebin.enabled", havingValue = "true", matchIfMissing = true)
    public PastebinClient pastebinClient(PastebinProperties properties) {
        return createClient(PastebinClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.pinata.enabled", havingValue = "true", matchIfMissing = true)
    public PinataClient pinataClient(PinataProperties properties) {
        return createClient(PinataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.quip.enabled", havingValue = "true", matchIfMissing = true)
    public QuipClient quipClient(QuipProperties properties) {
        return createClient(QuipClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.storj.enabled", havingValue = "true", matchIfMissing = true)
    public StorjClient storjClient(StorjProperties properties) {
        return createClient(StorjClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.thenullpointer.enabled", havingValue = "true", matchIfMissing = true)
    public TheNullPointerClient thenullpointerClient(TheNullPointerProperties properties) {
        return createClient(TheNullPointerClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cloudstoragefilesharing.web3storage.enabled", havingValue = "true", matchIfMissing = true)
    public Web3StorageClient web3storageClient(Web3StorageProperties properties) {
        return createClient(Web3StorageClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
