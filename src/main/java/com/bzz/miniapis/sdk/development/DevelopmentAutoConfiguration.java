package com.bzz.miniapis.sdk.development;

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
        UserstackProperties.class,
        Api24PullRequestsProperties.class,
        AgifyIoProperties.class,
        ApiGrTisProperties.class,
        ApicagentProperties.class,
        ApiflashProperties.class,
        ApisGuruProperties.class,
        AzureDevopsProperties.class,
        BaseProperties.class,
        BitbucketProperties.class,
        BlitappProperties.class,
        BlynkCloudProperties.class,
        BrewpageProperties.class,
        BrowshotProperties.class,
        CdnjsProperties.class,
        ChangelogsMdProperties.class,
        CiprandProperties.class,
        CloudflareTraceProperties.class,
        CodexProperties.class,
        ContentfulImagesProperties.class,
        CorsProxyProperties.class,
        DatabricksProperties.class,
        DigitaloceanStatusProperties.class,
        DockerHubProperties.class,
        DomaindbInfoProperties.class,
        ExtendsclassJsonStorageProperties.class,
        GeekflareProperties.class,
        GenderizeIoProperties.class,
        GetpingProperties.class,
        GhostProperties.class,
        GithubProperties.class,
        GitlabProperties.class,
        GoogleDocsProperties.class,
        GoogleFirebaseProperties.class,
        GoogleFontsProperties.class,
        GoogleKeepProperties.class,
        GoogleSheetsProperties.class,
        GoogleSlidesProperties.class,
        GorestProperties.class,
        HasuraProperties.class,
        HerokuProperties.class,
        HostTComProperties.class,
        HostIoProperties.class,
        Http2ProProperties.class,
        HttpbinProperties.class,
        HttpbinCloudflareProperties.class,
        HunterProperties.class,
        IbmTextToSpeechProperties.class,
        IcanhazepochProperties.class,
        IcanhazipProperties.class,
        IftttProperties.class,
        ImageChartsProperties.class,
        ImportIoProperties.class,
        IpFastComProperties.class,
        Ip2WhoisInformationLookupProperties.class,
        IpfindIoProperties.class,
        IpifyProperties.class,
        IpinfoProperties.class,
        IsitdownstatusProperties.class,
        JsdelivrProperties.class,
        Json2JsonpProperties.class,
        JsonbinIoProperties.class,
        JsonplaceholderProperties.class,
        KrokiProperties.class,
        LicenseApiProperties.class,
        LogsToProperties.class,
        MacAddressVendorLookupProperties.class,
        MicroDbProperties.class,
        MicroenvProperties.class,
        MockyProperties.class,
        MyIpProperties.class,
        NationalizeIoProperties.class,
        NetlifyProperties.class,
        NetworkcalcProperties.class,
        NpmRegistryProperties.class,
        OnesignalProperties.class,
        OpenPageRankProperties.class,
        OpenapihubProperties.class,
        OpengraphrProperties.class,
        PagecdnProperties.class,
        PostmanProperties.class,
        ProxycrawlProperties.class,
        ProxykingdomProperties.class,
        PusherBeamsProperties.class,
        QrBarcodeProperties.class,
        QrCodeProperties.class,
        QrCodeProperties.class,
        QrcodeMonkeyProperties.class,
        QuickchartProperties.class,
        ReqresProperties.class,
        RssFeedToJsonProperties.class,
        SavepageIoProperties.class,
        ScrapeninjaProperties.class,
        ScraperapiProperties.class,
        ScraperboxProperties.class,
        ScrapestackProperties.class,
        ScrapingantProperties.class,
        ScrapingdogProperties.class,
        ScreenshotProperties.class,
        ScreenshotapiNetProperties.class,
        SerialifColorProperties.class,
        SerpstackProperties.class,
        SheetsuProperties.class,
        ShoutcloudProperties.class,
        SonarProperties.class,
        SonarqubeProperties.class,
        StackexchangeProperties.class,
        StaticallyProperties.class,
        SupportivekoalaProperties.class,
        SuprsonicProperties.class,
        TalordataProperties.class,
        ThunderbitProperties.class,
        TykProperties.class,
        WandboxProperties.class,
        WebscrapingAiProperties.class,
        ZenrowsProperties.class
})
public class DevelopmentAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.userstack.enabled", havingValue = "true", matchIfMissing = true)
    public UserstackClient userstackClient(UserstackProperties properties) {
        return createClient(UserstackClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.api24pullrequests.enabled", havingValue = "true", matchIfMissing = true)
    public Api24PullRequestsClient api24pullrequestsClient(Api24PullRequestsProperties properties) {
        return createClient(Api24PullRequestsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.agifyio.enabled", havingValue = "true", matchIfMissing = true)
    public AgifyIoClient agifyioClient(AgifyIoProperties properties) {
        return createClient(AgifyIoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.apigrtis.enabled", havingValue = "true", matchIfMissing = true)
    public ApiGrTisClient apigrtisClient(ApiGrTisProperties properties) {
        return createClient(ApiGrTisClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.apicagent.enabled", havingValue = "true", matchIfMissing = true)
    public ApicagentClient apicagentClient(ApicagentProperties properties) {
        return createClient(ApicagentClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.apiflash.enabled", havingValue = "true", matchIfMissing = true)
    public ApiflashClient apiflashClient(ApiflashProperties properties) {
        return createClient(ApiflashClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.apisguru.enabled", havingValue = "true", matchIfMissing = true)
    public ApisGuruClient apisguruClient(ApisGuruProperties properties) {
        return createClient(ApisGuruClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.azuredevops.enabled", havingValue = "true", matchIfMissing = true)
    public AzureDevopsClient azuredevopsClient(AzureDevopsProperties properties) {
        return createClient(AzureDevopsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.base.enabled", havingValue = "true", matchIfMissing = true)
    public BaseClient baseClient(BaseProperties properties) {
        return createClient(BaseClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.bitbucket.enabled", havingValue = "true", matchIfMissing = true)
    public BitbucketClient bitbucketClient(BitbucketProperties properties) {
        return createClient(BitbucketClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.blitapp.enabled", havingValue = "true", matchIfMissing = true)
    public BlitappClient blitappClient(BlitappProperties properties) {
        return createClient(BlitappClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.blynkcloud.enabled", havingValue = "true", matchIfMissing = true)
    public BlynkCloudClient blynkcloudClient(BlynkCloudProperties properties) {
        return createClient(BlynkCloudClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.brewpage.enabled", havingValue = "true", matchIfMissing = true)
    public BrewpageClient brewpageClient(BrewpageProperties properties) {
        return createClient(BrewpageClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.browshot.enabled", havingValue = "true", matchIfMissing = true)
    public BrowshotClient browshotClient(BrowshotProperties properties) {
        return createClient(BrowshotClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.cdnjs.enabled", havingValue = "true", matchIfMissing = true)
    public CdnjsClient cdnjsClient(CdnjsProperties properties) {
        return createClient(CdnjsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.changelogsmd.enabled", havingValue = "true", matchIfMissing = true)
    public ChangelogsMdClient changelogsmdClient(ChangelogsMdProperties properties) {
        return createClient(ChangelogsMdClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.ciprand.enabled", havingValue = "true", matchIfMissing = true)
    public CiprandClient ciprandClient(CiprandProperties properties) {
        return createClient(CiprandClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.cloudflaretrace.enabled", havingValue = "true", matchIfMissing = true)
    public CloudflareTraceClient cloudflaretraceClient(CloudflareTraceProperties properties) {
        return createClient(CloudflareTraceClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.codex.enabled", havingValue = "true", matchIfMissing = true)
    public CodexClient codexClient(CodexProperties properties) {
        return createClient(CodexClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.contentfulimages.enabled", havingValue = "true", matchIfMissing = true)
    public ContentfulImagesClient contentfulimagesClient(ContentfulImagesProperties properties) {
        return createClient(ContentfulImagesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.corsproxy.enabled", havingValue = "true", matchIfMissing = true)
    public CorsProxyClient corsproxyClient(CorsProxyProperties properties) {
        return createClient(CorsProxyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.databricks.enabled", havingValue = "true", matchIfMissing = true)
    public DatabricksClient databricksClient(DatabricksProperties properties) {
        return createClient(DatabricksClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.digitaloceanstatus.enabled", havingValue = "true", matchIfMissing = true)
    public DigitaloceanStatusClient digitaloceanstatusClient(DigitaloceanStatusProperties properties) {
        return createClient(DigitaloceanStatusClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.dockerhub.enabled", havingValue = "true", matchIfMissing = true)
    public DockerHubClient dockerhubClient(DockerHubProperties properties) {
        return createClient(DockerHubClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.domaindbinfo.enabled", havingValue = "true", matchIfMissing = true)
    public DomaindbInfoClient domaindbinfoClient(DomaindbInfoProperties properties) {
        return createClient(DomaindbInfoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.extendsclassjsonstorage.enabled", havingValue = "true", matchIfMissing = true)
    public ExtendsclassJsonStorageClient extendsclassjsonstorageClient(ExtendsclassJsonStorageProperties properties) {
        return createClient(ExtendsclassJsonStorageClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.geekflare.enabled", havingValue = "true", matchIfMissing = true)
    public GeekflareClient geekflareClient(GeekflareProperties properties) {
        return createClient(GeekflareClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.genderizeio.enabled", havingValue = "true", matchIfMissing = true)
    public GenderizeIoClient genderizeioClient(GenderizeIoProperties properties) {
        return createClient(GenderizeIoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.getping.enabled", havingValue = "true", matchIfMissing = true)
    public GetpingClient getpingClient(GetpingProperties properties) {
        return createClient(GetpingClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.ghost.enabled", havingValue = "true", matchIfMissing = true)
    public GhostClient ghostClient(GhostProperties properties) {
        return createClient(GhostClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.github.enabled", havingValue = "true", matchIfMissing = true)
    public GithubClient githubClient(GithubProperties properties) {
        return createClient(GithubClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.gitlab.enabled", havingValue = "true", matchIfMissing = true)
    public GitlabClient gitlabClient(GitlabProperties properties) {
        return createClient(GitlabClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.googledocs.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleDocsClient googledocsClient(GoogleDocsProperties properties) {
        return createClient(GoogleDocsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.googlefirebase.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleFirebaseClient googlefirebaseClient(GoogleFirebaseProperties properties) {
        return createClient(GoogleFirebaseClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.googlefonts.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleFontsClient googlefontsClient(GoogleFontsProperties properties) {
        return createClient(GoogleFontsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.googlekeep.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleKeepClient googlekeepClient(GoogleKeepProperties properties) {
        return createClient(GoogleKeepClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.googlesheets.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleSheetsClient googlesheetsClient(GoogleSheetsProperties properties) {
        return createClient(GoogleSheetsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.googleslides.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleSlidesClient googleslidesClient(GoogleSlidesProperties properties) {
        return createClient(GoogleSlidesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.gorest.enabled", havingValue = "true", matchIfMissing = true)
    public GorestClient gorestClient(GorestProperties properties) {
        return createClient(GorestClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.hasura.enabled", havingValue = "true", matchIfMissing = true)
    public HasuraClient hasuraClient(HasuraProperties properties) {
        return createClient(HasuraClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.heroku.enabled", havingValue = "true", matchIfMissing = true)
    public HerokuClient herokuClient(HerokuProperties properties) {
        return createClient(HerokuClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.hosttcom.enabled", havingValue = "true", matchIfMissing = true)
    public HostTComClient hosttcomClient(HostTComProperties properties) {
        return createClient(HostTComClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.hostio.enabled", havingValue = "true", matchIfMissing = true)
    public HostIoClient hostioClient(HostIoProperties properties) {
        return createClient(HostIoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.http2pro.enabled", havingValue = "true", matchIfMissing = true)
    public Http2ProClient http2proClient(Http2ProProperties properties) {
        return createClient(Http2ProClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.httpbin.enabled", havingValue = "true", matchIfMissing = true)
    public HttpbinClient httpbinClient(HttpbinProperties properties) {
        return createClient(HttpbinClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.httpbincloudflare.enabled", havingValue = "true", matchIfMissing = true)
    public HttpbinCloudflareClient httpbincloudflareClient(HttpbinCloudflareProperties properties) {
        return createClient(HttpbinCloudflareClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.hunter.enabled", havingValue = "true", matchIfMissing = true)
    public HunterClient hunterClient(HunterProperties properties) {
        return createClient(HunterClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.ibmtexttospeech.enabled", havingValue = "true", matchIfMissing = true)
    public IbmTextToSpeechClient ibmtexttospeechClient(IbmTextToSpeechProperties properties) {
        return createClient(IbmTextToSpeechClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.icanhazepoch.enabled", havingValue = "true", matchIfMissing = true)
    public IcanhazepochClient icanhazepochClient(IcanhazepochProperties properties) {
        return createClient(IcanhazepochClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.icanhazip.enabled", havingValue = "true", matchIfMissing = true)
    public IcanhazipClient icanhazipClient(IcanhazipProperties properties) {
        return createClient(IcanhazipClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.ifttt.enabled", havingValue = "true", matchIfMissing = true)
    public IftttClient iftttClient(IftttProperties properties) {
        return createClient(IftttClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.imagecharts.enabled", havingValue = "true", matchIfMissing = true)
    public ImageChartsClient imagechartsClient(ImageChartsProperties properties) {
        return createClient(ImageChartsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.importio.enabled", havingValue = "true", matchIfMissing = true)
    public ImportIoClient importioClient(ImportIoProperties properties) {
        return createClient(ImportIoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.ipfastcom.enabled", havingValue = "true", matchIfMissing = true)
    public IpFastComClient ipfastcomClient(IpFastComProperties properties) {
        return createClient(IpFastComClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.ip2whoisinformationlookup.enabled", havingValue = "true", matchIfMissing = true)
    public Ip2WhoisInformationLookupClient ip2whoisinformationlookupClient(Ip2WhoisInformationLookupProperties properties) {
        return createClient(Ip2WhoisInformationLookupClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.ipfindio.enabled", havingValue = "true", matchIfMissing = true)
    public IpfindIoClient ipfindioClient(IpfindIoProperties properties) {
        return createClient(IpfindIoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.ipify.enabled", havingValue = "true", matchIfMissing = true)
    public IpifyClient ipifyClient(IpifyProperties properties) {
        return createClient(IpifyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.ipinfo.enabled", havingValue = "true", matchIfMissing = true)
    public IpinfoClient ipinfoClient(IpinfoProperties properties) {
        return createClient(IpinfoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.isitdownstatus.enabled", havingValue = "true", matchIfMissing = true)
    public IsitdownstatusClient isitdownstatusClient(IsitdownstatusProperties properties) {
        return createClient(IsitdownstatusClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.jsdelivr.enabled", havingValue = "true", matchIfMissing = true)
    public JsdelivrClient jsdelivrClient(JsdelivrProperties properties) {
        return createClient(JsdelivrClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.json2jsonp.enabled", havingValue = "true", matchIfMissing = true)
    public Json2JsonpClient json2jsonpClient(Json2JsonpProperties properties) {
        return createClient(Json2JsonpClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.jsonbinio.enabled", havingValue = "true", matchIfMissing = true)
    public JsonbinIoClient jsonbinioClient(JsonbinIoProperties properties) {
        return createClient(JsonbinIoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.jsonplaceholder.enabled", havingValue = "true", matchIfMissing = true)
    public JsonplaceholderClient jsonplaceholderClient(JsonplaceholderProperties properties) {
        return createClient(JsonplaceholderClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.kroki.enabled", havingValue = "true", matchIfMissing = true)
    public KrokiClient krokiClient(KrokiProperties properties) {
        return createClient(KrokiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.licenseapi.enabled", havingValue = "true", matchIfMissing = true)
    public LicenseApiClient licenseapiClient(LicenseApiProperties properties) {
        return createClient(LicenseApiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.logsto.enabled", havingValue = "true", matchIfMissing = true)
    public LogsToClient logstoClient(LogsToProperties properties) {
        return createClient(LogsToClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.macaddressvendorlookup.enabled", havingValue = "true", matchIfMissing = true)
    public MacAddressVendorLookupClient macaddressvendorlookupClient(MacAddressVendorLookupProperties properties) {
        return createClient(MacAddressVendorLookupClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.microdb.enabled", havingValue = "true", matchIfMissing = true)
    public MicroDbClient microdbClient(MicroDbProperties properties) {
        return createClient(MicroDbClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.microenv.enabled", havingValue = "true", matchIfMissing = true)
    public MicroenvClient microenvClient(MicroenvProperties properties) {
        return createClient(MicroenvClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.mocky.enabled", havingValue = "true", matchIfMissing = true)
    public MockyClient mockyClient(MockyProperties properties) {
        return createClient(MockyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.myip.enabled", havingValue = "true", matchIfMissing = true)
    public MyIpClient myipClient(MyIpProperties properties) {
        return createClient(MyIpClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.nationalizeio.enabled", havingValue = "true", matchIfMissing = true)
    public NationalizeIoClient nationalizeioClient(NationalizeIoProperties properties) {
        return createClient(NationalizeIoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.netlify.enabled", havingValue = "true", matchIfMissing = true)
    public NetlifyClient netlifyClient(NetlifyProperties properties) {
        return createClient(NetlifyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.networkcalc.enabled", havingValue = "true", matchIfMissing = true)
    public NetworkcalcClient networkcalcClient(NetworkcalcProperties properties) {
        return createClient(NetworkcalcClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.npmregistry.enabled", havingValue = "true", matchIfMissing = true)
    public NpmRegistryClient npmregistryClient(NpmRegistryProperties properties) {
        return createClient(NpmRegistryClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.onesignal.enabled", havingValue = "true", matchIfMissing = true)
    public OnesignalClient onesignalClient(OnesignalProperties properties) {
        return createClient(OnesignalClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.openpagerank.enabled", havingValue = "true", matchIfMissing = true)
    public OpenPageRankClient openpagerankClient(OpenPageRankProperties properties) {
        return createClient(OpenPageRankClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.openapihub.enabled", havingValue = "true", matchIfMissing = true)
    public OpenapihubClient openapihubClient(OpenapihubProperties properties) {
        return createClient(OpenapihubClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.opengraphr.enabled", havingValue = "true", matchIfMissing = true)
    public OpengraphrClient opengraphrClient(OpengraphrProperties properties) {
        return createClient(OpengraphrClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.pagecdn.enabled", havingValue = "true", matchIfMissing = true)
    public PagecdnClient pagecdnClient(PagecdnProperties properties) {
        return createClient(PagecdnClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.postman.enabled", havingValue = "true", matchIfMissing = true)
    public PostmanClient postmanClient(PostmanProperties properties) {
        return createClient(PostmanClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.proxycrawl.enabled", havingValue = "true", matchIfMissing = true)
    public ProxycrawlClient proxycrawlClient(ProxycrawlProperties properties) {
        return createClient(ProxycrawlClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.proxykingdom.enabled", havingValue = "true", matchIfMissing = true)
    public ProxykingdomClient proxykingdomClient(ProxykingdomProperties properties) {
        return createClient(ProxykingdomClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.pusherbeams.enabled", havingValue = "true", matchIfMissing = true)
    public PusherBeamsClient pusherbeamsClient(PusherBeamsProperties properties) {
        return createClient(PusherBeamsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.qrbarcode.enabled", havingValue = "true", matchIfMissing = true)
    public QrBarcodeClient qrbarcodeClient(QrBarcodeProperties properties) {
        return createClient(QrBarcodeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.qrcode.enabled", havingValue = "true", matchIfMissing = true)
    public QrCodeClient qrcodeClient(QrCodeProperties properties) {
        return createClient(QrCodeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.qrcode2.enabled", havingValue = "true", matchIfMissing = true)
    public QrCodeClient qrcode2Client(QrCodeProperties properties) {
        return createClient(QrCodeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.qrcodemonkey.enabled", havingValue = "true", matchIfMissing = true)
    public QrcodeMonkeyClient qrcodemonkeyClient(QrcodeMonkeyProperties properties) {
        return createClient(QrcodeMonkeyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.quickchart.enabled", havingValue = "true", matchIfMissing = true)
    public QuickchartClient quickchartClient(QuickchartProperties properties) {
        return createClient(QuickchartClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.reqres.enabled", havingValue = "true", matchIfMissing = true)
    public ReqresClient reqresClient(ReqresProperties properties) {
        return createClient(ReqresClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.rssfeedtojson.enabled", havingValue = "true", matchIfMissing = true)
    public RssFeedToJsonClient rssfeedtojsonClient(RssFeedToJsonProperties properties) {
        return createClient(RssFeedToJsonClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.savepageio.enabled", havingValue = "true", matchIfMissing = true)
    public SavepageIoClient savepageioClient(SavepageIoProperties properties) {
        return createClient(SavepageIoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.scrapeninja.enabled", havingValue = "true", matchIfMissing = true)
    public ScrapeninjaClient scrapeninjaClient(ScrapeninjaProperties properties) {
        return createClient(ScrapeninjaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.scraperapi.enabled", havingValue = "true", matchIfMissing = true)
    public ScraperapiClient scraperapiClient(ScraperapiProperties properties) {
        return createClient(ScraperapiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.scraperbox.enabled", havingValue = "true", matchIfMissing = true)
    public ScraperboxClient scraperboxClient(ScraperboxProperties properties) {
        return createClient(ScraperboxClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.scrapestack.enabled", havingValue = "true", matchIfMissing = true)
    public ScrapestackClient scrapestackClient(ScrapestackProperties properties) {
        return createClient(ScrapestackClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.scrapingant.enabled", havingValue = "true", matchIfMissing = true)
    public ScrapingantClient scrapingantClient(ScrapingantProperties properties) {
        return createClient(ScrapingantClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.scrapingdog.enabled", havingValue = "true", matchIfMissing = true)
    public ScrapingdogClient scrapingdogClient(ScrapingdogProperties properties) {
        return createClient(ScrapingdogClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.screenshot.enabled", havingValue = "true", matchIfMissing = true)
    public ScreenshotClient screenshotClient(ScreenshotProperties properties) {
        return createClient(ScreenshotClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.screenshotapinet.enabled", havingValue = "true", matchIfMissing = true)
    public ScreenshotapiNetClient screenshotapinetClient(ScreenshotapiNetProperties properties) {
        return createClient(ScreenshotapiNetClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.serialifcolor.enabled", havingValue = "true", matchIfMissing = true)
    public SerialifColorClient serialifcolorClient(SerialifColorProperties properties) {
        return createClient(SerialifColorClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.serpstack.enabled", havingValue = "true", matchIfMissing = true)
    public SerpstackClient serpstackClient(SerpstackProperties properties) {
        return createClient(SerpstackClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.sheetsu.enabled", havingValue = "true", matchIfMissing = true)
    public SheetsuClient sheetsuClient(SheetsuProperties properties) {
        return createClient(SheetsuClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.shoutcloud.enabled", havingValue = "true", matchIfMissing = true)
    public ShoutcloudClient shoutcloudClient(ShoutcloudProperties properties) {
        return createClient(ShoutcloudClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.sonar.enabled", havingValue = "true", matchIfMissing = true)
    public SonarClient sonarClient(SonarProperties properties) {
        return createClient(SonarClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.sonarqube.enabled", havingValue = "true", matchIfMissing = true)
    public SonarqubeClient sonarqubeClient(SonarqubeProperties properties) {
        return createClient(SonarqubeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.stackexchange.enabled", havingValue = "true", matchIfMissing = true)
    public StackexchangeClient stackexchangeClient(StackexchangeProperties properties) {
        return createClient(StackexchangeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.statically.enabled", havingValue = "true", matchIfMissing = true)
    public StaticallyClient staticallyClient(StaticallyProperties properties) {
        return createClient(StaticallyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.supportivekoala.enabled", havingValue = "true", matchIfMissing = true)
    public SupportivekoalaClient supportivekoalaClient(SupportivekoalaProperties properties) {
        return createClient(SupportivekoalaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.suprsonic.enabled", havingValue = "true", matchIfMissing = true)
    public SuprsonicClient suprsonicClient(SuprsonicProperties properties) {
        return createClient(SuprsonicClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.talordata.enabled", havingValue = "true", matchIfMissing = true)
    public TalordataClient talordataClient(TalordataProperties properties) {
        return createClient(TalordataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.thunderbit.enabled", havingValue = "true", matchIfMissing = true)
    public ThunderbitClient thunderbitClient(ThunderbitProperties properties) {
        return createClient(ThunderbitClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.tyk.enabled", havingValue = "true", matchIfMissing = true)
    public TykClient tykClient(TykProperties properties) {
        return createClient(TykClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.wandbox.enabled", havingValue = "true", matchIfMissing = true)
    public WandboxClient wandboxClient(WandboxProperties properties) {
        return createClient(WandboxClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.webscrapingai.enabled", havingValue = "true", matchIfMissing = true)
    public WebscrapingAiClient webscrapingaiClient(WebscrapingAiProperties properties) {
        return createClient(WebscrapingAiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.development.zenrows.enabled", havingValue = "true", matchIfMissing = true)
    public ZenrowsClient zenrowsClient(ZenrowsProperties properties) {
        return createClient(ZenrowsClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
