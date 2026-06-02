package com.bzz.miniapis.sdk.documentsproductivity;

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
        AirtableProperties.class,
        Api2ConvertProperties.class,
        ApilayerPdflayerProperties.class,
        AsanaProperties.class,
        BuildpdfProperties.class,
        ClickupProperties.class,
        ClockifyProperties.class,
        CloudconvertProperties.class,
        CloudmersiveDocumentAndDataConversionProperties.class,
        CodeStatsProperties.class,
        CraftmypdfProperties.class,
        FlowdashProperties.class,
        Html2PdfProperties.class,
        IlovepdfProperties.class,
        JiraProperties.class,
        MattermostProperties.class,
        NotionProperties.class,
        PandadocProperties.class,
        PodioProperties.class,
        PrexviewProperties.class,
        RenderlyProperties.class,
        RestpackProperties.class,
        TodoistProperties.class,
        SmartImageEnhancementProperties.class,
        StaffsignProperties.class,
        VectorExpressV20Properties.class,
        WakatimeProperties.class,
        ZubeProperties.class
})
public class DocumentsProductivityAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.airtable.enabled", havingValue = "true", matchIfMissing = true)
    public AirtableClient airtableClient(AirtableProperties properties) {
        return createClient(AirtableClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.api2convert.enabled", havingValue = "true", matchIfMissing = true)
    public Api2ConvertClient api2convertClient(Api2ConvertProperties properties) {
        return createClient(Api2ConvertClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.apilayerpdflayer.enabled", havingValue = "true", matchIfMissing = true)
    public ApilayerPdflayerClient apilayerpdflayerClient(ApilayerPdflayerProperties properties) {
        return createClient(ApilayerPdflayerClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.asana.enabled", havingValue = "true", matchIfMissing = true)
    public AsanaClient asanaClient(AsanaProperties properties) {
        return createClient(AsanaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.buildpdf.enabled", havingValue = "true", matchIfMissing = true)
    public BuildpdfClient buildpdfClient(BuildpdfProperties properties) {
        return createClient(BuildpdfClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.clickup.enabled", havingValue = "true", matchIfMissing = true)
    public ClickupClient clickupClient(ClickupProperties properties) {
        return createClient(ClickupClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.clockify.enabled", havingValue = "true", matchIfMissing = true)
    public ClockifyClient clockifyClient(ClockifyProperties properties) {
        return createClient(ClockifyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.cloudconvert.enabled", havingValue = "true", matchIfMissing = true)
    public CloudconvertClient cloudconvertClient(CloudconvertProperties properties) {
        return createClient(CloudconvertClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.cloudmersivedocumentanddataconversion.enabled", havingValue = "true", matchIfMissing = true)
    public CloudmersiveDocumentAndDataConversionClient cloudmersivedocumentanddataconversionClient(CloudmersiveDocumentAndDataConversionProperties properties) {
        return createClient(CloudmersiveDocumentAndDataConversionClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.codestats.enabled", havingValue = "true", matchIfMissing = true)
    public CodeStatsClient codestatsClient(CodeStatsProperties properties) {
        return createClient(CodeStatsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.craftmypdf.enabled", havingValue = "true", matchIfMissing = true)
    public CraftmypdfClient craftmypdfClient(CraftmypdfProperties properties) {
        return createClient(CraftmypdfClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.flowdash.enabled", havingValue = "true", matchIfMissing = true)
    public FlowdashClient flowdashClient(FlowdashProperties properties) {
        return createClient(FlowdashClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.html2pdf.enabled", havingValue = "true", matchIfMissing = true)
    public Html2PdfClient html2pdfClient(Html2PdfProperties properties) {
        return createClient(Html2PdfClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.ilovepdf.enabled", havingValue = "true", matchIfMissing = true)
    public IlovepdfClient ilovepdfClient(IlovepdfProperties properties) {
        return createClient(IlovepdfClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.jira.enabled", havingValue = "true", matchIfMissing = true)
    public JiraClient jiraClient(JiraProperties properties) {
        return createClient(JiraClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.mattermost.enabled", havingValue = "true", matchIfMissing = true)
    public MattermostClient mattermostClient(MattermostProperties properties) {
        return createClient(MattermostClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.notion.enabled", havingValue = "true", matchIfMissing = true)
    public NotionClient notionClient(NotionProperties properties) {
        return createClient(NotionClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.pandadoc.enabled", havingValue = "true", matchIfMissing = true)
    public PandadocClient pandadocClient(PandadocProperties properties) {
        return createClient(PandadocClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.podio.enabled", havingValue = "true", matchIfMissing = true)
    public PodioClient podioClient(PodioProperties properties) {
        return createClient(PodioClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.prexview.enabled", havingValue = "true", matchIfMissing = true)
    public PrexviewClient prexviewClient(PrexviewProperties properties) {
        return createClient(PrexviewClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.renderly.enabled", havingValue = "true", matchIfMissing = true)
    public RenderlyClient renderlyClient(RenderlyProperties properties) {
        return createClient(RenderlyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.restpack.enabled", havingValue = "true", matchIfMissing = true)
    public RestpackClient restpackClient(RestpackProperties properties) {
        return createClient(RestpackClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.todoist.enabled", havingValue = "true", matchIfMissing = true)
    public TodoistClient todoistClient(TodoistProperties properties) {
        return createClient(TodoistClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.smartimageenhancement.enabled", havingValue = "true", matchIfMissing = true)
    public SmartImageEnhancementClient smartimageenhancementClient(SmartImageEnhancementProperties properties) {
        return createClient(SmartImageEnhancementClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.staffsign.enabled", havingValue = "true", matchIfMissing = true)
    public StaffsignClient staffsignClient(StaffsignProperties properties) {
        return createClient(StaffsignClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.vectorexpressv20.enabled", havingValue = "true", matchIfMissing = true)
    public VectorExpressV20Client vectorexpressv20Client(VectorExpressV20Properties properties) {
        return createClient(VectorExpressV20Client.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.wakatime.enabled", havingValue = "true", matchIfMissing = true)
    public WakatimeClient wakatimeClient(WakatimeProperties properties) {
        return createClient(WakatimeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.zube.enabled", havingValue = "true", matchIfMissing = true)
    public ZubeClient zubeClient(ZubeProperties properties) {
        return createClient(ZubeClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
