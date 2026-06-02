package com.bzz.miniapis.sdk.sciencemath;

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
        ArcsecondIoProperties.class,
        ArxivProperties.class,
        CodecogsProperties.class,
        CoreProperties.class,
        GbifProperties.class,
        IdigbioProperties.class,
        InspirehepNetProperties.class,
        IsevenHumorProperties.class,
        IsroProperties.class,
        ItisProperties.class,
        LaunchLibrary2Properties.class,
        MaterialsPlatformForDataScienceProperties.class,
        MinorPlanetCenterProperties.class,
        NasaProperties.class,
        NasaAdsProperties.class,
        NewtonProperties.class,
        NoctuaProperties.class,
        NumbersProperties.class,
        NumbersProperties.class,
        OceanFactsProperties.class,
        OpenNotifyProperties.class,
        OpenScienceFrameworkProperties.class,
        OpenalexProperties.class,
        PurpleAirProperties.class,
        RemoteCalcProperties.class,
        ShareProperties.class,
        SunriseAndSunsetProperties.class,
        TimesAdderProperties.class,
        TleProperties.class,
        UsgsEarthquakeHazardsProgramProperties.class,
        UsgsWaterServicesProperties.class,
        WorldBankProperties.class,
        XmathProperties.class
})
public class ScienceMathAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.arcsecondio.enabled", havingValue = "true", matchIfMissing = true)
    public ArcsecondIoClient arcsecondioClient(ArcsecondIoProperties properties) {
        return createClient(ArcsecondIoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.arxiv.enabled", havingValue = "true", matchIfMissing = true)
    public ArxivClient arxivClient(ArxivProperties properties) {
        return createClient(ArxivClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.codecogs.enabled", havingValue = "true", matchIfMissing = true)
    public CodecogsClient codecogsClient(CodecogsProperties properties) {
        return createClient(CodecogsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.core.enabled", havingValue = "true", matchIfMissing = true)
    public CoreClient coreClient(CoreProperties properties) {
        return createClient(CoreClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.gbif.enabled", havingValue = "true", matchIfMissing = true)
    public GbifClient gbifClient(GbifProperties properties) {
        return createClient(GbifClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.idigbio.enabled", havingValue = "true", matchIfMissing = true)
    public IdigbioClient idigbioClient(IdigbioProperties properties) {
        return createClient(IdigbioClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.inspirehepnet.enabled", havingValue = "true", matchIfMissing = true)
    public InspirehepNetClient inspirehepnetClient(InspirehepNetProperties properties) {
        return createClient(InspirehepNetClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.isevenhumor.enabled", havingValue = "true", matchIfMissing = true)
    public IsevenHumorClient isevenhumorClient(IsevenHumorProperties properties) {
        return createClient(IsevenHumorClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.isro.enabled", havingValue = "true", matchIfMissing = true)
    public IsroClient isroClient(IsroProperties properties) {
        return createClient(IsroClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.itis.enabled", havingValue = "true", matchIfMissing = true)
    public ItisClient itisClient(ItisProperties properties) {
        return createClient(ItisClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.launchlibrary2.enabled", havingValue = "true", matchIfMissing = true)
    public LaunchLibrary2Client launchlibrary2Client(LaunchLibrary2Properties properties) {
        return createClient(LaunchLibrary2Client.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.materialsplatformfordatascience.enabled", havingValue = "true", matchIfMissing = true)
    public MaterialsPlatformForDataScienceClient materialsplatformfordatascienceClient(MaterialsPlatformForDataScienceProperties properties) {
        return createClient(MaterialsPlatformForDataScienceClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.minorplanetcenter.enabled", havingValue = "true", matchIfMissing = true)
    public MinorPlanetCenterClient minorplanetcenterClient(MinorPlanetCenterProperties properties) {
        return createClient(MinorPlanetCenterClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.nasa.enabled", havingValue = "true", matchIfMissing = true)
    public NasaClient nasaClient(NasaProperties properties) {
        return createClient(NasaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.nasaads.enabled", havingValue = "true", matchIfMissing = true)
    public NasaAdsClient nasaadsClient(NasaAdsProperties properties) {
        return createClient(NasaAdsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.newton.enabled", havingValue = "true", matchIfMissing = true)
    public NewtonClient newtonClient(NewtonProperties properties) {
        return createClient(NewtonClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.noctua.enabled", havingValue = "true", matchIfMissing = true)
    public NoctuaClient noctuaClient(NoctuaProperties properties) {
        return createClient(NoctuaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.numbers.enabled", havingValue = "true", matchIfMissing = true)
    public NumbersClient numbersClient(NumbersProperties properties) {
        return createClient(NumbersClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.numbers2.enabled", havingValue = "true", matchIfMissing = true)
    public NumbersClient numbers2Client(NumbersProperties properties) {
        return createClient(NumbersClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.oceanfacts.enabled", havingValue = "true", matchIfMissing = true)
    public OceanFactsClient oceanfactsClient(OceanFactsProperties properties) {
        return createClient(OceanFactsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.opennotify.enabled", havingValue = "true", matchIfMissing = true)
    public OpenNotifyClient opennotifyClient(OpenNotifyProperties properties) {
        return createClient(OpenNotifyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.openscienceframework.enabled", havingValue = "true", matchIfMissing = true)
    public OpenScienceFrameworkClient openscienceframeworkClient(OpenScienceFrameworkProperties properties) {
        return createClient(OpenScienceFrameworkClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.openalex.enabled", havingValue = "true", matchIfMissing = true)
    public OpenalexClient openalexClient(OpenalexProperties properties) {
        return createClient(OpenalexClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.purpleair.enabled", havingValue = "true", matchIfMissing = true)
    public PurpleAirClient purpleairClient(PurpleAirProperties properties) {
        return createClient(PurpleAirClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.remotecalc.enabled", havingValue = "true", matchIfMissing = true)
    public RemoteCalcClient remotecalcClient(RemoteCalcProperties properties) {
        return createClient(RemoteCalcClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.share.enabled", havingValue = "true", matchIfMissing = true)
    public ShareClient shareClient(ShareProperties properties) {
        return createClient(ShareClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.sunriseandsunset.enabled", havingValue = "true", matchIfMissing = true)
    public SunriseAndSunsetClient sunriseandsunsetClient(SunriseAndSunsetProperties properties) {
        return createClient(SunriseAndSunsetClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.timesadder.enabled", havingValue = "true", matchIfMissing = true)
    public TimesAdderClient timesadderClient(TimesAdderProperties properties) {
        return createClient(TimesAdderClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.tle.enabled", havingValue = "true", matchIfMissing = true)
    public TleClient tleClient(TleProperties properties) {
        return createClient(TleClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.usgsearthquakehazardsprogram.enabled", havingValue = "true", matchIfMissing = true)
    public UsgsEarthquakeHazardsProgramClient usgsearthquakehazardsprogramClient(UsgsEarthquakeHazardsProgramProperties properties) {
        return createClient(UsgsEarthquakeHazardsProgramClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.usgswaterservices.enabled", havingValue = "true", matchIfMissing = true)
    public UsgsWaterServicesClient usgswaterservicesClient(UsgsWaterServicesProperties properties) {
        return createClient(UsgsWaterServicesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.worldbank.enabled", havingValue = "true", matchIfMissing = true)
    public WorldBankClient worldbankClient(WorldBankProperties properties) {
        return createClient(WorldBankClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.xmath.enabled", havingValue = "true", matchIfMissing = true)
    public XmathClient xmathClient(XmathProperties properties) {
        return createClient(XmathClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
