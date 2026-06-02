package com.bzz.miniapis.sdk.development;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        CiprandProperties.class,
        CloudflareTraceProperties.class,
        CodexProperties.class,
        ApicagentProperties.class,
        AzureDevopsProperties.class,
        CdnjsProperties.class,
        ApiflashProperties.class,
        CorsProxyProperties.class,
        BaseProperties.class,
        BlynkCloudProperties.class,
        DockerHubProperties.class,
        ApiGrTisProperties.class,
        UserstackProperties.class,
        BlitappProperties.class,
        GhostProperties.class,
        DatabricksProperties.class,
        ContentfulImagesProperties.class,
        DomaindbInfoProperties.class,
        BrewpageProperties.class,
        BitbucketProperties.class,
        GoogleFontsProperties.class,
        AgifyIoProperties.class,
        GitlabProperties.class,
        BrowshotProperties.class,
        Api24PullRequestsProperties.class,
        DigitaloceanStatusProperties.class,
        HostIoProperties.class,
        GoogleFirebaseProperties.class,
        ExtendsclassJsonStorageProperties.class,
        ApisGuruProperties.class,
        GoogleDocsProperties.class,
        JsdelivrProperties.class,
        GoogleSheetsProperties.class,
        GoogleKeepProperties.class,
        IpifyProperties.class,
        HasuraProperties.class,
        GoogleSlidesProperties.class,
        IbmTextToSpeechProperties.class,
        IpinfoProperties.class,
        JsonplaceholderProperties.class,
        GetpingProperties.class,
        LicenseApiProperties.class,
        GorestProperties.class,
        Ip2WhoisInformationLookupProperties.class,
        IcanhazipProperties.class,
        IpfindIoProperties.class,
        HunterProperties.class,
        HttpbinProperties.class,
        NpmRegistryProperties.class,
        ImageChartsProperties.class,
        JsonbinIoProperties.class,
        GenderizeIoProperties.class,
        MyIpProperties.class,
        HttpbinCloudflareProperties.class,
        PostmanProperties.class,
        LogsToProperties.class,
        GeekflareProperties.class,
        QrcodeMonkeyProperties.class,
        Json2JsonpProperties.class,
        MockyProperties.class,
        KrokiProperties.class,
        QuickchartProperties.class,
        MacAddressVendorLookupProperties.class,
        OpenapihubProperties.class,
        IftttProperties.class,
        IcanhazepochProperties.class,
        ReqresProperties.class,
        PagecdnProperties.class,
        MicroDbProperties.class,
        ScraperapiProperties.class,
        ImportIoProperties.class,
        SonarProperties.class,
        ScreenshotProperties.class,
        ScrapingdogProperties.class,
        RssFeedToJsonProperties.class,
        QrBarcodeProperties.class,
        OnesignalProperties.class,
        NetworkcalcProperties.class,
        MicroenvProperties.class,
        HostTComProperties.class,
        ScreenshotapiNetProperties.class,
        NetlifyProperties.class,
        ScrapeninjaProperties.class,
        WandboxProperties.class,
        ScrapestackProperties.class,
        NationalizeIoProperties.class,
        OpenPageRankProperties.class,
        PusherBeamsProperties.class,
        ProxykingdomProperties.class,
        ScrapingantProperties.class,
        StaticallyProperties.class,
        HerokuProperties.class,
        SonarqubeProperties.class,
        GithubProperties.class,
        StackexchangeProperties.class,
        SerpstackProperties.class,
        QrCodeProperties.class,
        ZenrowsProperties.class,
        QrCode2Properties.class,
        TalordataProperties.class,
        SerialifColorProperties.class,
        SupportivekoalaProperties.class,
        ThunderbitProperties.class,
        SavepageIoProperties.class,
        IpFastComProperties.class,
        SuprsonicProperties.class,
        ProxycrawlProperties.class,
        ShoutcloudProperties.class,
        WebscrapingAiProperties.class,
        ScraperboxProperties.class,
        ChangelogsMdProperties.class,
        Http2ProProperties.class,
        SheetsuProperties.class,
        TykProperties.class,
        IsitdownstatusProperties.class,
        OpengraphrProperties.class
})
public class DevelopmentAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.ciprand.enabled", havingValue = "true", matchIfMissing = true)
    public CiprandClient ciprandClient(CiprandProperties properties) {
        return new CiprandClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.cloudflaretrace.enabled", havingValue = "true", matchIfMissing = true)
    public CloudflareTraceClient cloudflaretraceClient(CloudflareTraceProperties properties) {
        return new CloudflareTraceClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.codex.enabled", havingValue = "true", matchIfMissing = true)
    public CodexClient codexClient(CodexProperties properties) {
        return new CodexClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.apicagent.enabled", havingValue = "true", matchIfMissing = true)
    public ApicagentClient apicagentClient(ApicagentProperties properties) {
        return new ApicagentClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.azuredevops.enabled", havingValue = "true", matchIfMissing = true)
    public AzureDevopsClient azuredevopsClient(AzureDevopsProperties properties) {
        return new AzureDevopsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.cdnjs.enabled", havingValue = "true", matchIfMissing = true)
    public CdnjsClient cdnjsClient(CdnjsProperties properties) {
        return new CdnjsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.apiflash.enabled", havingValue = "true", matchIfMissing = true)
    public ApiflashClient apiflashClient(ApiflashProperties properties) {
        return new ApiflashClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.corsproxy.enabled", havingValue = "true", matchIfMissing = true)
    public CorsProxyClient corsproxyClient(CorsProxyProperties properties) {
        return new CorsProxyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.base.enabled", havingValue = "true", matchIfMissing = true)
    public BaseClient baseClient(BaseProperties properties) {
        return new BaseClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.blynkcloud.enabled", havingValue = "true", matchIfMissing = true)
    public BlynkCloudClient blynkcloudClient(BlynkCloudProperties properties) {
        return new BlynkCloudClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.dockerhub.enabled", havingValue = "true", matchIfMissing = true)
    public DockerHubClient dockerhubClient(DockerHubProperties properties) {
        return new DockerHubClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.apigrtis.enabled", havingValue = "true", matchIfMissing = true)
    public ApiGrTisClient apigrtisClient(ApiGrTisProperties properties) {
        return new ApiGrTisClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.userstack.enabled", havingValue = "true", matchIfMissing = true)
    public UserstackClient userstackClient(UserstackProperties properties) {
        return new UserstackClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.blitapp.enabled", havingValue = "true", matchIfMissing = true)
    public BlitappClient blitappClient(BlitappProperties properties) {
        return new BlitappClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.ghost.enabled", havingValue = "true", matchIfMissing = true)
    public GhostClient ghostClient(GhostProperties properties) {
        return new GhostClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.databricks.enabled", havingValue = "true", matchIfMissing = true)
    public DatabricksClient databricksClient(DatabricksProperties properties) {
        return new DatabricksClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.contentfulimages.enabled", havingValue = "true", matchIfMissing = true)
    public ContentfulImagesClient contentfulimagesClient(ContentfulImagesProperties properties) {
        return new ContentfulImagesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.domaindbinfo.enabled", havingValue = "true", matchIfMissing = true)
    public DomaindbInfoClient domaindbinfoClient(DomaindbInfoProperties properties) {
        return new DomaindbInfoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.brewpage.enabled", havingValue = "true", matchIfMissing = true)
    public BrewpageClient brewpageClient(BrewpageProperties properties) {
        return new BrewpageClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.bitbucket.enabled", havingValue = "true", matchIfMissing = true)
    public BitbucketClient bitbucketClient(BitbucketProperties properties) {
        return new BitbucketClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.googlefonts.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleFontsClient googlefontsClient(GoogleFontsProperties properties) {
        return new GoogleFontsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.agifyio.enabled", havingValue = "true", matchIfMissing = true)
    public AgifyIoClient agifyioClient(AgifyIoProperties properties) {
        return new AgifyIoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.gitlab.enabled", havingValue = "true", matchIfMissing = true)
    public GitlabClient gitlabClient(GitlabProperties properties) {
        return new GitlabClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.browshot.enabled", havingValue = "true", matchIfMissing = true)
    public BrowshotClient browshotClient(BrowshotProperties properties) {
        return new BrowshotClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.api24pullrequests.enabled", havingValue = "true", matchIfMissing = true)
    public Api24PullRequestsClient api24pullrequestsClient(Api24PullRequestsProperties properties) {
        return new Api24PullRequestsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.digitaloceanstatus.enabled", havingValue = "true", matchIfMissing = true)
    public DigitaloceanStatusClient digitaloceanstatusClient(DigitaloceanStatusProperties properties) {
        return new DigitaloceanStatusClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.hostio.enabled", havingValue = "true", matchIfMissing = true)
    public HostIoClient hostioClient(HostIoProperties properties) {
        return new HostIoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.googlefirebase.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleFirebaseClient googlefirebaseClient(GoogleFirebaseProperties properties) {
        return new GoogleFirebaseClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.extendsclassjsonstorage.enabled", havingValue = "true", matchIfMissing = true)
    public ExtendsclassJsonStorageClient extendsclassjsonstorageClient(ExtendsclassJsonStorageProperties properties) {
        return new ExtendsclassJsonStorageClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.apisguru.enabled", havingValue = "true", matchIfMissing = true)
    public ApisGuruClient apisguruClient(ApisGuruProperties properties) {
        return new ApisGuruClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.googledocs.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleDocsClient googledocsClient(GoogleDocsProperties properties) {
        return new GoogleDocsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.jsdelivr.enabled", havingValue = "true", matchIfMissing = true)
    public JsdelivrClient jsdelivrClient(JsdelivrProperties properties) {
        return new JsdelivrClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.googlesheets.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleSheetsClient googlesheetsClient(GoogleSheetsProperties properties) {
        return new GoogleSheetsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.googlekeep.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleKeepClient googlekeepClient(GoogleKeepProperties properties) {
        return new GoogleKeepClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.ipify.enabled", havingValue = "true", matchIfMissing = true)
    public IpifyClient ipifyClient(IpifyProperties properties) {
        return new IpifyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.hasura.enabled", havingValue = "true", matchIfMissing = true)
    public HasuraClient hasuraClient(HasuraProperties properties) {
        return new HasuraClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.googleslides.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleSlidesClient googleslidesClient(GoogleSlidesProperties properties) {
        return new GoogleSlidesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.ibmtexttospeech.enabled", havingValue = "true", matchIfMissing = true)
    public IbmTextToSpeechClient ibmtexttospeechClient(IbmTextToSpeechProperties properties) {
        return new IbmTextToSpeechClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.ipinfo.enabled", havingValue = "true", matchIfMissing = true)
    public IpinfoClient ipinfoClient(IpinfoProperties properties) {
        return new IpinfoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.jsonplaceholder.enabled", havingValue = "true", matchIfMissing = true)
    public JsonplaceholderClient jsonplaceholderClient(JsonplaceholderProperties properties) {
        return new JsonplaceholderClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.getping.enabled", havingValue = "true", matchIfMissing = true)
    public GetpingClient getpingClient(GetpingProperties properties) {
        return new GetpingClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.licenseapi.enabled", havingValue = "true", matchIfMissing = true)
    public LicenseApiClient licenseapiClient(LicenseApiProperties properties) {
        return new LicenseApiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.gorest.enabled", havingValue = "true", matchIfMissing = true)
    public GorestClient gorestClient(GorestProperties properties) {
        return new GorestClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.ip2whoisinformationlookup.enabled", havingValue = "true", matchIfMissing = true)
    public Ip2WhoisInformationLookupClient ip2whoisinformationlookupClient(Ip2WhoisInformationLookupProperties properties) {
        return new Ip2WhoisInformationLookupClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.icanhazip.enabled", havingValue = "true", matchIfMissing = true)
    public IcanhazipClient icanhazipClient(IcanhazipProperties properties) {
        return new IcanhazipClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.ipfindio.enabled", havingValue = "true", matchIfMissing = true)
    public IpfindIoClient ipfindioClient(IpfindIoProperties properties) {
        return new IpfindIoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.hunter.enabled", havingValue = "true", matchIfMissing = true)
    public HunterClient hunterClient(HunterProperties properties) {
        return new HunterClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.httpbin.enabled", havingValue = "true", matchIfMissing = true)
    public HttpbinClient httpbinClient(HttpbinProperties properties) {
        return new HttpbinClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.npmregistry.enabled", havingValue = "true", matchIfMissing = true)
    public NpmRegistryClient npmregistryClient(NpmRegistryProperties properties) {
        return new NpmRegistryClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.imagecharts.enabled", havingValue = "true", matchIfMissing = true)
    public ImageChartsClient imagechartsClient(ImageChartsProperties properties) {
        return new ImageChartsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.jsonbinio.enabled", havingValue = "true", matchIfMissing = true)
    public JsonbinIoClient jsonbinioClient(JsonbinIoProperties properties) {
        return new JsonbinIoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.genderizeio.enabled", havingValue = "true", matchIfMissing = true)
    public GenderizeIoClient genderizeioClient(GenderizeIoProperties properties) {
        return new GenderizeIoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.myip.enabled", havingValue = "true", matchIfMissing = true)
    public MyIpClient myipClient(MyIpProperties properties) {
        return new MyIpClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.httpbincloudflare.enabled", havingValue = "true", matchIfMissing = true)
    public HttpbinCloudflareClient httpbincloudflareClient(HttpbinCloudflareProperties properties) {
        return new HttpbinCloudflareClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.postman.enabled", havingValue = "true", matchIfMissing = true)
    public PostmanClient postmanClient(PostmanProperties properties) {
        return new PostmanClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.logsto.enabled", havingValue = "true", matchIfMissing = true)
    public LogsToClient logstoClient(LogsToProperties properties) {
        return new LogsToClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.geekflare.enabled", havingValue = "true", matchIfMissing = true)
    public GeekflareClient geekflareClient(GeekflareProperties properties) {
        return new GeekflareClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.qrcodemonkey.enabled", havingValue = "true", matchIfMissing = true)
    public QrcodeMonkeyClient qrcodemonkeyClient(QrcodeMonkeyProperties properties) {
        return new QrcodeMonkeyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.json2jsonp.enabled", havingValue = "true", matchIfMissing = true)
    public Json2JsonpClient json2jsonpClient(Json2JsonpProperties properties) {
        return new Json2JsonpClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.mocky.enabled", havingValue = "true", matchIfMissing = true)
    public MockyClient mockyClient(MockyProperties properties) {
        return new MockyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.kroki.enabled", havingValue = "true", matchIfMissing = true)
    public KrokiClient krokiClient(KrokiProperties properties) {
        return new KrokiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.quickchart.enabled", havingValue = "true", matchIfMissing = true)
    public QuickchartClient quickchartClient(QuickchartProperties properties) {
        return new QuickchartClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.macaddressvendorlookup.enabled", havingValue = "true", matchIfMissing = true)
    public MacAddressVendorLookupClient macaddressvendorlookupClient(MacAddressVendorLookupProperties properties) {
        return new MacAddressVendorLookupClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.openapihub.enabled", havingValue = "true", matchIfMissing = true)
    public OpenapihubClient openapihubClient(OpenapihubProperties properties) {
        return new OpenapihubClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.ifttt.enabled", havingValue = "true", matchIfMissing = true)
    public IftttClient iftttClient(IftttProperties properties) {
        return new IftttClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.icanhazepoch.enabled", havingValue = "true", matchIfMissing = true)
    public IcanhazepochClient icanhazepochClient(IcanhazepochProperties properties) {
        return new IcanhazepochClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.reqres.enabled", havingValue = "true", matchIfMissing = true)
    public ReqresClient reqresClient(ReqresProperties properties) {
        return new ReqresClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.pagecdn.enabled", havingValue = "true", matchIfMissing = true)
    public PagecdnClient pagecdnClient(PagecdnProperties properties) {
        return new PagecdnClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.microdb.enabled", havingValue = "true", matchIfMissing = true)
    public MicroDbClient microdbClient(MicroDbProperties properties) {
        return new MicroDbClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.scraperapi.enabled", havingValue = "true", matchIfMissing = true)
    public ScraperapiClient scraperapiClient(ScraperapiProperties properties) {
        return new ScraperapiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.importio.enabled", havingValue = "true", matchIfMissing = true)
    public ImportIoClient importioClient(ImportIoProperties properties) {
        return new ImportIoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.sonar.enabled", havingValue = "true", matchIfMissing = true)
    public SonarClient sonarClient(SonarProperties properties) {
        return new SonarClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.screenshot.enabled", havingValue = "true", matchIfMissing = true)
    public ScreenshotClient screenshotClient(ScreenshotProperties properties) {
        return new ScreenshotClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.scrapingdog.enabled", havingValue = "true", matchIfMissing = true)
    public ScrapingdogClient scrapingdogClient(ScrapingdogProperties properties) {
        return new ScrapingdogClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.rssfeedtojson.enabled", havingValue = "true", matchIfMissing = true)
    public RssFeedToJsonClient rssfeedtojsonClient(RssFeedToJsonProperties properties) {
        return new RssFeedToJsonClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.qrbarcode.enabled", havingValue = "true", matchIfMissing = true)
    public QrBarcodeClient qrbarcodeClient(QrBarcodeProperties properties) {
        return new QrBarcodeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.onesignal.enabled", havingValue = "true", matchIfMissing = true)
    public OnesignalClient onesignalClient(OnesignalProperties properties) {
        return new OnesignalClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.networkcalc.enabled", havingValue = "true", matchIfMissing = true)
    public NetworkcalcClient networkcalcClient(NetworkcalcProperties properties) {
        return new NetworkcalcClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.microenv.enabled", havingValue = "true", matchIfMissing = true)
    public MicroenvClient microenvClient(MicroenvProperties properties) {
        return new MicroenvClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.hosttcom.enabled", havingValue = "true", matchIfMissing = true)
    public HostTComClient hosttcomClient(HostTComProperties properties) {
        return new HostTComClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.screenshotapinet.enabled", havingValue = "true", matchIfMissing = true)
    public ScreenshotapiNetClient screenshotapinetClient(ScreenshotapiNetProperties properties) {
        return new ScreenshotapiNetClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.netlify.enabled", havingValue = "true", matchIfMissing = true)
    public NetlifyClient netlifyClient(NetlifyProperties properties) {
        return new NetlifyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.scrapeninja.enabled", havingValue = "true", matchIfMissing = true)
    public ScrapeninjaClient scrapeninjaClient(ScrapeninjaProperties properties) {
        return new ScrapeninjaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.wandbox.enabled", havingValue = "true", matchIfMissing = true)
    public WandboxClient wandboxClient(WandboxProperties properties) {
        return new WandboxClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.scrapestack.enabled", havingValue = "true", matchIfMissing = true)
    public ScrapestackClient scrapestackClient(ScrapestackProperties properties) {
        return new ScrapestackClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.nationalizeio.enabled", havingValue = "true", matchIfMissing = true)
    public NationalizeIoClient nationalizeioClient(NationalizeIoProperties properties) {
        return new NationalizeIoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.openpagerank.enabled", havingValue = "true", matchIfMissing = true)
    public OpenPageRankClient openpagerankClient(OpenPageRankProperties properties) {
        return new OpenPageRankClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.pusherbeams.enabled", havingValue = "true", matchIfMissing = true)
    public PusherBeamsClient pusherbeamsClient(PusherBeamsProperties properties) {
        return new PusherBeamsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.proxykingdom.enabled", havingValue = "true", matchIfMissing = true)
    public ProxykingdomClient proxykingdomClient(ProxykingdomProperties properties) {
        return new ProxykingdomClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.scrapingant.enabled", havingValue = "true", matchIfMissing = true)
    public ScrapingantClient scrapingantClient(ScrapingantProperties properties) {
        return new ScrapingantClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.statically.enabled", havingValue = "true", matchIfMissing = true)
    public StaticallyClient staticallyClient(StaticallyProperties properties) {
        return new StaticallyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.heroku.enabled", havingValue = "true", matchIfMissing = true)
    public HerokuClient herokuClient(HerokuProperties properties) {
        return new HerokuClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.sonarqube.enabled", havingValue = "true", matchIfMissing = true)
    public SonarqubeClient sonarqubeClient(SonarqubeProperties properties) {
        return new SonarqubeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.github.enabled", havingValue = "true", matchIfMissing = true)
    public GithubClient githubClient(GithubProperties properties) {
        return new GithubClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.stackexchange.enabled", havingValue = "true", matchIfMissing = true)
    public StackexchangeClient stackexchangeClient(StackexchangeProperties properties) {
        return new StackexchangeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.serpstack.enabled", havingValue = "true", matchIfMissing = true)
    public SerpstackClient serpstackClient(SerpstackProperties properties) {
        return new SerpstackClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.qrcode.enabled", havingValue = "true", matchIfMissing = true)
    public QrCodeClient qrcodeClient(QrCodeProperties properties) {
        return new QrCodeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.zenrows.enabled", havingValue = "true", matchIfMissing = true)
    public ZenrowsClient zenrowsClient(ZenrowsProperties properties) {
        return new ZenrowsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.qrcode2.enabled", havingValue = "true", matchIfMissing = true)
    public QrCode2Client qrcode2Client(QrCode2Properties properties) {
        return new QrCode2Client(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.talordata.enabled", havingValue = "true", matchIfMissing = true)
    public TalordataClient talordataClient(TalordataProperties properties) {
        return new TalordataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.serialifcolor.enabled", havingValue = "true", matchIfMissing = true)
    public SerialifColorClient serialifcolorClient(SerialifColorProperties properties) {
        return new SerialifColorClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.supportivekoala.enabled", havingValue = "true", matchIfMissing = true)
    public SupportivekoalaClient supportivekoalaClient(SupportivekoalaProperties properties) {
        return new SupportivekoalaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.thunderbit.enabled", havingValue = "true", matchIfMissing = true)
    public ThunderbitClient thunderbitClient(ThunderbitProperties properties) {
        return new ThunderbitClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.savepageio.enabled", havingValue = "true", matchIfMissing = true)
    public SavepageIoClient savepageioClient(SavepageIoProperties properties) {
        return new SavepageIoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.ipfastcom.enabled", havingValue = "true", matchIfMissing = true)
    public IpFastComClient ipfastcomClient(IpFastComProperties properties) {
        return new IpFastComClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.suprsonic.enabled", havingValue = "true", matchIfMissing = true)
    public SuprsonicClient suprsonicClient(SuprsonicProperties properties) {
        return new SuprsonicClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.proxycrawl.enabled", havingValue = "true", matchIfMissing = true)
    public ProxycrawlClient proxycrawlClient(ProxycrawlProperties properties) {
        return new ProxycrawlClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.shoutcloud.enabled", havingValue = "true", matchIfMissing = true)
    public ShoutcloudClient shoutcloudClient(ShoutcloudProperties properties) {
        return new ShoutcloudClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.webscrapingai.enabled", havingValue = "true", matchIfMissing = true)
    public WebscrapingAiClient webscrapingaiClient(WebscrapingAiProperties properties) {
        return new WebscrapingAiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.scraperbox.enabled", havingValue = "true", matchIfMissing = true)
    public ScraperboxClient scraperboxClient(ScraperboxProperties properties) {
        return new ScraperboxClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.changelogsmd.enabled", havingValue = "true", matchIfMissing = true)
    public ChangelogsMdClient changelogsmdClient(ChangelogsMdProperties properties) {
        return new ChangelogsMdClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.http2pro.enabled", havingValue = "true", matchIfMissing = true)
    public Http2ProClient http2proClient(Http2ProProperties properties) {
        return new Http2ProClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.sheetsu.enabled", havingValue = "true", matchIfMissing = true)
    public SheetsuClient sheetsuClient(SheetsuProperties properties) {
        return new SheetsuClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.tyk.enabled", havingValue = "true", matchIfMissing = true)
    public TykClient tykClient(TykProperties properties) {
        return new TykClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.isitdownstatus.enabled", havingValue = "true", matchIfMissing = true)
    public IsitdownstatusClient isitdownstatusClient(IsitdownstatusProperties properties) {
        return new IsitdownstatusClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.opengraphr.enabled", havingValue = "true", matchIfMissing = true)
    public OpengraphrClient opengraphrClient(OpengraphrProperties properties) {
        return new OpengraphrClient(properties.getUrl());
    }

}
