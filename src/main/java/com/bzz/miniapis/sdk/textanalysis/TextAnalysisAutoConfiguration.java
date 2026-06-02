package com.bzz.miniapis.sdk.textanalysis;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        CloudmersiveNaturalLanguageProcessingProperties.class,
        CodeDetectionProperties.class,
        AudexumProperties.class,
        LectoTranslationProperties.class,
        DetectLanguageProperties.class,
        GeoscoreProperties.class,
        ApilayerLanguagelayerProperties.class,
        EliProperties.class,
        GoogleCloudNaturalProperties.class,
        LibretranslateProperties.class,
        TisaneProperties.class,
        WatsonNaturalLanguageUnderstandingProperties.class,
        SemantriaProperties.class,
        HirakOcrProperties.class,
        HirakTranslationProperties.class
})
public class TextAnalysisAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.cloudmersivenaturallanguageprocessing.enabled", havingValue = "true", matchIfMissing = true)
    public CloudmersiveNaturalLanguageProcessingClient cloudmersivenaturallanguageprocessingClient(CloudmersiveNaturalLanguageProcessingProperties properties) {
        return new CloudmersiveNaturalLanguageProcessingClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.codedetection.enabled", havingValue = "true", matchIfMissing = true)
    public CodeDetectionClient codedetectionClient(CodeDetectionProperties properties) {
        return new CodeDetectionClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.audexum.enabled", havingValue = "true", matchIfMissing = true)
    public AudexumClient audexumClient(AudexumProperties properties) {
        return new AudexumClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.lectotranslation.enabled", havingValue = "true", matchIfMissing = true)
    public LectoTranslationClient lectotranslationClient(LectoTranslationProperties properties) {
        return new LectoTranslationClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.detectlanguage.enabled", havingValue = "true", matchIfMissing = true)
    public DetectLanguageClient detectlanguageClient(DetectLanguageProperties properties) {
        return new DetectLanguageClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.geoscore.enabled", havingValue = "true", matchIfMissing = true)
    public GeoscoreClient geoscoreClient(GeoscoreProperties properties) {
        return new GeoscoreClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.apilayerlanguagelayer.enabled", havingValue = "true", matchIfMissing = true)
    public ApilayerLanguagelayerClient apilayerlanguagelayerClient(ApilayerLanguagelayerProperties properties) {
        return new ApilayerLanguagelayerClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.eli.enabled", havingValue = "true", matchIfMissing = true)
    public EliClient eliClient(EliProperties properties) {
        return new EliClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.googlecloudnatural.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleCloudNaturalClient googlecloudnaturalClient(GoogleCloudNaturalProperties properties) {
        return new GoogleCloudNaturalClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.libretranslate.enabled", havingValue = "true", matchIfMissing = true)
    public LibretranslateClient libretranslateClient(LibretranslateProperties properties) {
        return new LibretranslateClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.tisane.enabled", havingValue = "true", matchIfMissing = true)
    public TisaneClient tisaneClient(TisaneProperties properties) {
        return new TisaneClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.watsonnaturallanguageunderstanding.enabled", havingValue = "true", matchIfMissing = true)
    public WatsonNaturalLanguageUnderstandingClient watsonnaturallanguageunderstandingClient(WatsonNaturalLanguageUnderstandingProperties properties) {
        return new WatsonNaturalLanguageUnderstandingClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.semantria.enabled", havingValue = "true", matchIfMissing = true)
    public SemantriaClient semantriaClient(SemantriaProperties properties) {
        return new SemantriaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.hirakocr.enabled", havingValue = "true", matchIfMissing = true)
    public HirakOcrClient hirakocrClient(HirakOcrProperties properties) {
        return new HirakOcrClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.textanalysis.hiraktranslation.enabled", havingValue = "true", matchIfMissing = true)
    public HirakTranslationClient hiraktranslationClient(HirakTranslationProperties properties) {
        return new HirakTranslationClient(properties.getUrl());
    }

}
