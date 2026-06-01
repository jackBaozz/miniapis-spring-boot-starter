package com.bzz.miniapis.sdk.textanalysis;

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
        CodeDetectionProperties.class,
        ApilayerLanguagelayerProperties.class,
        AylienTextAnalysisProperties.class,
        AudexumProperties.class,
        CloudmersiveNaturalLanguageProcessingProperties.class,
        DetectLanguageProperties.class,
        EliProperties.class,
        GoogleCloudNaturalProperties.class,
        GeoscoreProperties.class,
        HirakOcrProperties.class,
        HirakTranslationProperties.class,
        LectoTranslationProperties.class,
        LibretranslateProperties.class,
        SemantriaProperties.class,
        SentimentAnalysisProperties.class,
        TisaneProperties.class,
        WatsonNaturalLanguageUnderstandingProperties.class
})
public class TextAnalysisAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.codedetection.enabled", havingValue = "true", matchIfMissing = true)
    public CodeDetectionClient codedetectionClient(CodeDetectionProperties properties) {
        return createClient(CodeDetectionClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.apilayerlanguagelayer.enabled", havingValue = "true", matchIfMissing = true)
    public ApilayerLanguagelayerClient apilayerlanguagelayerClient(ApilayerLanguagelayerProperties properties) {
        return createClient(ApilayerLanguagelayerClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.aylientextanalysis.enabled", havingValue = "true", matchIfMissing = true)
    public AylienTextAnalysisClient aylientextanalysisClient(AylienTextAnalysisProperties properties) {
        return createClient(AylienTextAnalysisClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.audexum.enabled", havingValue = "true", matchIfMissing = true)
    public AudexumClient audexumClient(AudexumProperties properties) {
        return createClient(AudexumClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.cloudmersivenaturallanguageprocessing.enabled", havingValue = "true", matchIfMissing = true)
    public CloudmersiveNaturalLanguageProcessingClient cloudmersivenaturallanguageprocessingClient(CloudmersiveNaturalLanguageProcessingProperties properties) {
        return createClient(CloudmersiveNaturalLanguageProcessingClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.detectlanguage.enabled", havingValue = "true", matchIfMissing = true)
    public DetectLanguageClient detectlanguageClient(DetectLanguageProperties properties) {
        return createClient(DetectLanguageClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.eli.enabled", havingValue = "true", matchIfMissing = true)
    public EliClient eliClient(EliProperties properties) {
        return createClient(EliClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.googlecloudnatural.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleCloudNaturalClient googlecloudnaturalClient(GoogleCloudNaturalProperties properties) {
        return createClient(GoogleCloudNaturalClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.geoscore.enabled", havingValue = "true", matchIfMissing = true)
    public GeoscoreClient geoscoreClient(GeoscoreProperties properties) {
        return createClient(GeoscoreClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.hirakocr.enabled", havingValue = "true", matchIfMissing = true)
    public HirakOcrClient hirakocrClient(HirakOcrProperties properties) {
        return createClient(HirakOcrClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.hiraktranslation.enabled", havingValue = "true", matchIfMissing = true)
    public HirakTranslationClient hiraktranslationClient(HirakTranslationProperties properties) {
        return createClient(HirakTranslationClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.lectotranslation.enabled", havingValue = "true", matchIfMissing = true)
    public LectoTranslationClient lectotranslationClient(LectoTranslationProperties properties) {
        return createClient(LectoTranslationClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.libretranslate.enabled", havingValue = "true", matchIfMissing = true)
    public LibretranslateClient libretranslateClient(LibretranslateProperties properties) {
        return createClient(LibretranslateClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.semantria.enabled", havingValue = "true", matchIfMissing = true)
    public SemantriaClient semantriaClient(SemantriaProperties properties) {
        return createClient(SemantriaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.sentimentanalysis.enabled", havingValue = "true", matchIfMissing = true)
    public SentimentAnalysisClient sentimentanalysisClient(SentimentAnalysisProperties properties) {
        return createClient(SentimentAnalysisClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.tisane.enabled", havingValue = "true", matchIfMissing = true)
    public TisaneClient tisaneClient(TisaneProperties properties) {
        return createClient(TisaneClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.watsonnaturallanguageunderstanding.enabled", havingValue = "true", matchIfMissing = true)
    public WatsonNaturalLanguageUnderstandingClient watsonnaturallanguageunderstandingClient(WatsonNaturalLanguageUnderstandingProperties properties) {
        return createClient(WatsonNaturalLanguageUnderstandingClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
