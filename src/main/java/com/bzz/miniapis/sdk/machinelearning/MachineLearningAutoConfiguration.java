package com.bzz.miniapis.sdk.machinelearning;

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
        AiForThaiProperties.class,
        ClarifaiProperties.class,
        CloudmersiveProperties.class,
        DeepaiProperties.class,
        DeepcodeProperties.class,
        DialogflowProperties.class,
        ExudeApiProperties.class,
        GroqProperties.class,
        HirakFaceapiProperties.class,
        HuggingFaceProperties.class,
        ImaggaProperties.class,
        InferdoProperties.class,
        IrisnetProperties.class,
        KeenIoProperties.class,
        MachinetutorsProperties.class,
        MessengerxIoProperties.class,
        NlpCloudProperties.class,
        PerspectiveProperties.class,
        RoboflowUniverseProperties.class,
        SkybiometryProperties.class,
        TensorfeedProperties.class,
        TimeDoorProperties.class,
        UnpluggProperties.class,
        WolframalphaProperties.class
})
public class MachineLearningAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.aiforthai.enabled", havingValue = "true", matchIfMissing = true)
    public AiForThaiClient aiforthaiClient(AiForThaiProperties properties) {
        return createClient(AiForThaiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.clarifai.enabled", havingValue = "true", matchIfMissing = true)
    public ClarifaiClient clarifaiClient(ClarifaiProperties properties) {
        return createClient(ClarifaiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.cloudmersive.enabled", havingValue = "true", matchIfMissing = true)
    public CloudmersiveClient cloudmersiveClient(CloudmersiveProperties properties) {
        return createClient(CloudmersiveClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.deepai.enabled", havingValue = "true", matchIfMissing = true)
    public DeepaiClient deepaiClient(DeepaiProperties properties) {
        return createClient(DeepaiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.deepcode.enabled", havingValue = "true", matchIfMissing = true)
    public DeepcodeClient deepcodeClient(DeepcodeProperties properties) {
        return createClient(DeepcodeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.dialogflow.enabled", havingValue = "true", matchIfMissing = true)
    public DialogflowClient dialogflowClient(DialogflowProperties properties) {
        return createClient(DialogflowClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.exudeapi.enabled", havingValue = "true", matchIfMissing = true)
    public ExudeApiClient exudeapiClient(ExudeApiProperties properties) {
        return createClient(ExudeApiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.groq.enabled", havingValue = "true", matchIfMissing = true)
    public GroqClient groqClient(GroqProperties properties) {
        return createClient(GroqClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.hirakfaceapi.enabled", havingValue = "true", matchIfMissing = true)
    public HirakFaceapiClient hirakfaceapiClient(HirakFaceapiProperties properties) {
        return createClient(HirakFaceapiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.huggingface.enabled", havingValue = "true", matchIfMissing = true)
    public HuggingFaceClient huggingfaceClient(HuggingFaceProperties properties) {
        return createClient(HuggingFaceClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.imagga.enabled", havingValue = "true", matchIfMissing = true)
    public ImaggaClient imaggaClient(ImaggaProperties properties) {
        return createClient(ImaggaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.inferdo.enabled", havingValue = "true", matchIfMissing = true)
    public InferdoClient inferdoClient(InferdoProperties properties) {
        return createClient(InferdoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.irisnet.enabled", havingValue = "true", matchIfMissing = true)
    public IrisnetClient irisnetClient(IrisnetProperties properties) {
        return createClient(IrisnetClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.keenio.enabled", havingValue = "true", matchIfMissing = true)
    public KeenIoClient keenioClient(KeenIoProperties properties) {
        return createClient(KeenIoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.machinetutors.enabled", havingValue = "true", matchIfMissing = true)
    public MachinetutorsClient machinetutorsClient(MachinetutorsProperties properties) {
        return createClient(MachinetutorsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.messengerxio.enabled", havingValue = "true", matchIfMissing = true)
    public MessengerxIoClient messengerxioClient(MessengerxIoProperties properties) {
        return createClient(MessengerxIoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.nlpcloud.enabled", havingValue = "true", matchIfMissing = true)
    public NlpCloudClient nlpcloudClient(NlpCloudProperties properties) {
        return createClient(NlpCloudClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.perspective.enabled", havingValue = "true", matchIfMissing = true)
    public PerspectiveClient perspectiveClient(PerspectiveProperties properties) {
        return createClient(PerspectiveClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.roboflowuniverse.enabled", havingValue = "true", matchIfMissing = true)
    public RoboflowUniverseClient roboflowuniverseClient(RoboflowUniverseProperties properties) {
        return createClient(RoboflowUniverseClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.skybiometry.enabled", havingValue = "true", matchIfMissing = true)
    public SkybiometryClient skybiometryClient(SkybiometryProperties properties) {
        return createClient(SkybiometryClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.tensorfeed.enabled", havingValue = "true", matchIfMissing = true)
    public TensorfeedClient tensorfeedClient(TensorfeedProperties properties) {
        return createClient(TensorfeedClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.timedoor.enabled", havingValue = "true", matchIfMissing = true)
    public TimeDoorClient timedoorClient(TimeDoorProperties properties) {
        return createClient(TimeDoorClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.unplugg.enabled", havingValue = "true", matchIfMissing = true)
    public UnpluggClient unpluggClient(UnpluggProperties properties) {
        return createClient(UnpluggClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.wolframalpha.enabled", havingValue = "true", matchIfMissing = true)
    public WolframalphaClient wolframalphaClient(WolframalphaProperties properties) {
        return createClient(WolframalphaClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
