package com.bzz.miniapis.sdk.machinelearning;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        DeepaiProperties.class,
        AiForThaiProperties.class,
        HuggingFaceProperties.class,
        GroqProperties.class,
        InferdoProperties.class,
        KeenIoProperties.class,
        ClarifaiProperties.class,
        CloudmersiveProperties.class,
        RoboflowUniverseProperties.class,
        PerspectiveProperties.class,
        ExudeApiProperties.class,
        TimeDoorProperties.class,
        TensorfeedProperties.class,
        ImaggaProperties.class,
        DialogflowProperties.class,
        WolframalphaProperties.class,
        UnpluggProperties.class,
        DeepcodeProperties.class,
        SkybiometryProperties.class,
        IrisnetProperties.class,
        HirakFaceapiProperties.class,
        MachinetutorsProperties.class,
        NlpCloudProperties.class,
        MessengerxIoProperties.class
})
public class MachineLearningAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.deepai.enabled", havingValue = "true", matchIfMissing = true)
    public DeepaiClient deepaiClient(DeepaiProperties properties) {
        return new DeepaiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.aiforthai.enabled", havingValue = "true", matchIfMissing = true)
    public AiForThaiClient aiforthaiClient(AiForThaiProperties properties) {
        return new AiForThaiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.huggingface.enabled", havingValue = "true", matchIfMissing = true)
    public HuggingFaceClient huggingfaceClient(HuggingFaceProperties properties) {
        return new HuggingFaceClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.groq.enabled", havingValue = "true", matchIfMissing = true)
    public GroqClient groqClient(GroqProperties properties) {
        return new GroqClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.inferdo.enabled", havingValue = "true", matchIfMissing = true)
    public InferdoClient inferdoClient(InferdoProperties properties) {
        return new InferdoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.keenio.enabled", havingValue = "true", matchIfMissing = true)
    public KeenIoClient keenioClient(KeenIoProperties properties) {
        return new KeenIoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.clarifai.enabled", havingValue = "true", matchIfMissing = true)
    public ClarifaiClient clarifaiClient(ClarifaiProperties properties) {
        return new ClarifaiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.cloudmersive.enabled", havingValue = "true", matchIfMissing = true)
    public CloudmersiveClient cloudmersiveClient(CloudmersiveProperties properties) {
        return new CloudmersiveClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.roboflowuniverse.enabled", havingValue = "true", matchIfMissing = true)
    public RoboflowUniverseClient roboflowuniverseClient(RoboflowUniverseProperties properties) {
        return new RoboflowUniverseClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.perspective.enabled", havingValue = "true", matchIfMissing = true)
    public PerspectiveClient perspectiveClient(PerspectiveProperties properties) {
        return new PerspectiveClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.exudeapi.enabled", havingValue = "true", matchIfMissing = true)
    public ExudeApiClient exudeapiClient(ExudeApiProperties properties) {
        return new ExudeApiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.timedoor.enabled", havingValue = "true", matchIfMissing = true)
    public TimeDoorClient timedoorClient(TimeDoorProperties properties) {
        return new TimeDoorClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.tensorfeed.enabled", havingValue = "true", matchIfMissing = true)
    public TensorfeedClient tensorfeedClient(TensorfeedProperties properties) {
        return new TensorfeedClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.imagga.enabled", havingValue = "true", matchIfMissing = true)
    public ImaggaClient imaggaClient(ImaggaProperties properties) {
        return new ImaggaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.dialogflow.enabled", havingValue = "true", matchIfMissing = true)
    public DialogflowClient dialogflowClient(DialogflowProperties properties) {
        return new DialogflowClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.wolframalpha.enabled", havingValue = "true", matchIfMissing = true)
    public WolframalphaClient wolframalphaClient(WolframalphaProperties properties) {
        return new WolframalphaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.unplugg.enabled", havingValue = "true", matchIfMissing = true)
    public UnpluggClient unpluggClient(UnpluggProperties properties) {
        return new UnpluggClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.deepcode.enabled", havingValue = "true", matchIfMissing = true)
    public DeepcodeClient deepcodeClient(DeepcodeProperties properties) {
        return new DeepcodeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.skybiometry.enabled", havingValue = "true", matchIfMissing = true)
    public SkybiometryClient skybiometryClient(SkybiometryProperties properties) {
        return new SkybiometryClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.irisnet.enabled", havingValue = "true", matchIfMissing = true)
    public IrisnetClient irisnetClient(IrisnetProperties properties) {
        return new IrisnetClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.hirakfaceapi.enabled", havingValue = "true", matchIfMissing = true)
    public HirakFaceapiClient hirakfaceapiClient(HirakFaceapiProperties properties) {
        return new HirakFaceapiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.machinetutors.enabled", havingValue = "true", matchIfMissing = true)
    public MachinetutorsClient machinetutorsClient(MachinetutorsProperties properties) {
        return new MachinetutorsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.nlpcloud.enabled", havingValue = "true", matchIfMissing = true)
    public NlpCloudClient nlpcloudClient(NlpCloudProperties properties) {
        return new NlpCloudClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.machinelearning.messengerxio.enabled", havingValue = "true", matchIfMissing = true)
    public MessengerxIoClient messengerxioClient(MessengerxIoProperties properties) {
        return new MessengerxIoClient(properties.getUrl());
    }

}
