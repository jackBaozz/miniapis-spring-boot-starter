package com.bzz.miniapis.sdk.documentsproductivity;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        AirtableProperties.class,
        AsanaProperties.class,
        CraftmypdfProperties.class,
        Api2ConvertProperties.class,
        TodoistProperties.class,
        NotionProperties.class,
        PandadocProperties.class,
        ApilayerPdflayerProperties.class,
        CodeStatsProperties.class,
        Html2PdfProperties.class,
        VectorExpressV20Properties.class,
        RenderlyProperties.class,
        FlowdashProperties.class,
        CloudmersiveDocumentAndDataConversionProperties.class,
        PodioProperties.class,
        ClickupProperties.class,
        BuildpdfProperties.class,
        JiraProperties.class,
        StaffsignProperties.class,
        ZubeProperties.class,
        ClockifyProperties.class,
        CloudconvertProperties.class,
        PrexviewProperties.class,
        WakatimeProperties.class,
        SmartImageEnhancementProperties.class,
        RestpackProperties.class,
        IlovepdfProperties.class,
        MattermostProperties.class
})
public class DocumentsProductivityAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.airtable.enabled", havingValue = "true", matchIfMissing = true)
    public AirtableClient airtableClient(AirtableProperties properties) {
        return new AirtableClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.asana.enabled", havingValue = "true", matchIfMissing = true)
    public AsanaClient asanaClient(AsanaProperties properties) {
        return new AsanaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.craftmypdf.enabled", havingValue = "true", matchIfMissing = true)
    public CraftmypdfClient craftmypdfClient(CraftmypdfProperties properties) {
        return new CraftmypdfClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.api2convert.enabled", havingValue = "true", matchIfMissing = true)
    public Api2ConvertClient api2convertClient(Api2ConvertProperties properties) {
        return new Api2ConvertClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.todoist.enabled", havingValue = "true", matchIfMissing = true)
    public TodoistClient todoistClient(TodoistProperties properties) {
        return new TodoistClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.notion.enabled", havingValue = "true", matchIfMissing = true)
    public NotionClient notionClient(NotionProperties properties) {
        return new NotionClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.pandadoc.enabled", havingValue = "true", matchIfMissing = true)
    public PandadocClient pandadocClient(PandadocProperties properties) {
        return new PandadocClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.apilayerpdflayer.enabled", havingValue = "true", matchIfMissing = true)
    public ApilayerPdflayerClient apilayerpdflayerClient(ApilayerPdflayerProperties properties) {
        return new ApilayerPdflayerClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.codestats.enabled", havingValue = "true", matchIfMissing = true)
    public CodeStatsClient codestatsClient(CodeStatsProperties properties) {
        return new CodeStatsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.html2pdf.enabled", havingValue = "true", matchIfMissing = true)
    public Html2PdfClient html2pdfClient(Html2PdfProperties properties) {
        return new Html2PdfClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.vectorexpressv20.enabled", havingValue = "true", matchIfMissing = true)
    public VectorExpressV20Client vectorexpressv20Client(VectorExpressV20Properties properties) {
        return new VectorExpressV20Client(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.renderly.enabled", havingValue = "true", matchIfMissing = true)
    public RenderlyClient renderlyClient(RenderlyProperties properties) {
        return new RenderlyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.flowdash.enabled", havingValue = "true", matchIfMissing = true)
    public FlowdashClient flowdashClient(FlowdashProperties properties) {
        return new FlowdashClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.cloudmersivedocumentanddataconversion.enabled", havingValue = "true", matchIfMissing = true)
    public CloudmersiveDocumentAndDataConversionClient cloudmersivedocumentanddataconversionClient(CloudmersiveDocumentAndDataConversionProperties properties) {
        return new CloudmersiveDocumentAndDataConversionClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.podio.enabled", havingValue = "true", matchIfMissing = true)
    public PodioClient podioClient(PodioProperties properties) {
        return new PodioClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.clickup.enabled", havingValue = "true", matchIfMissing = true)
    public ClickupClient clickupClient(ClickupProperties properties) {
        return new ClickupClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.buildpdf.enabled", havingValue = "true", matchIfMissing = true)
    public BuildpdfClient buildpdfClient(BuildpdfProperties properties) {
        return new BuildpdfClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.jira.enabled", havingValue = "true", matchIfMissing = true)
    public JiraClient jiraClient(JiraProperties properties) {
        return new JiraClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.staffsign.enabled", havingValue = "true", matchIfMissing = true)
    public StaffsignClient staffsignClient(StaffsignProperties properties) {
        return new StaffsignClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.zube.enabled", havingValue = "true", matchIfMissing = true)
    public ZubeClient zubeClient(ZubeProperties properties) {
        return new ZubeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.clockify.enabled", havingValue = "true", matchIfMissing = true)
    public ClockifyClient clockifyClient(ClockifyProperties properties) {
        return new ClockifyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.cloudconvert.enabled", havingValue = "true", matchIfMissing = true)
    public CloudconvertClient cloudconvertClient(CloudconvertProperties properties) {
        return new CloudconvertClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.prexview.enabled", havingValue = "true", matchIfMissing = true)
    public PrexviewClient prexviewClient(PrexviewProperties properties) {
        return new PrexviewClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.wakatime.enabled", havingValue = "true", matchIfMissing = true)
    public WakatimeClient wakatimeClient(WakatimeProperties properties) {
        return new WakatimeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.smartimageenhancement.enabled", havingValue = "true", matchIfMissing = true)
    public SmartImageEnhancementClient smartimageenhancementClient(SmartImageEnhancementProperties properties) {
        return new SmartImageEnhancementClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.restpack.enabled", havingValue = "true", matchIfMissing = true)
    public RestpackClient restpackClient(RestpackProperties properties) {
        return new RestpackClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.ilovepdf.enabled", havingValue = "true", matchIfMissing = true)
    public IlovepdfClient ilovepdfClient(IlovepdfProperties properties) {
        return new IlovepdfClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.documentsproductivity.mattermost.enabled", havingValue = "true", matchIfMissing = true)
    public MattermostClient mattermostClient(MattermostProperties properties) {
        return new MattermostClient(properties.getUrl());
    }

}
