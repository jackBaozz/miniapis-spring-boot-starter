package com.bzz.miniapis.sdk.sciencemath;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        IdigbioProperties.class,
        InspirehepNetProperties.class,
        GbifProperties.class,
        CoreProperties.class,
        IsroProperties.class,
        NewtonProperties.class,
        SpacexProperties.class,
        CodecogsProperties.class,
        TimesAdderProperties.class,
        RemoteCalcProperties.class,
        OpenScienceFrameworkProperties.class,
        ArcsecondIoProperties.class,
        MinorPlanetCenterProperties.class,
        NumbersProperties.class,
        OpenNotifyProperties.class,
        IsevenHumorProperties.class,
        ItisProperties.class,
        NasaAdsProperties.class,
        ShareProperties.class,
        Numbers2Properties.class,
        NasaProperties.class,
        PurpleAirProperties.class,
        ArxivProperties.class,
        XmathProperties.class,
        OceanFactsProperties.class,
        MaterialsPlatformForDataScienceProperties.class,
        UsgsEarthquakeHazardsProgramProperties.class,
        NoctuaProperties.class,
        LaunchLibrary2Properties.class,
        WorldBankProperties.class,
        SunriseAndSunsetProperties.class,
        UsgsWaterServicesProperties.class,
        TleProperties.class,
        OpenalexProperties.class
})
public class ScienceMathAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.idigbio.enabled", havingValue = "true", matchIfMissing = true)
    public IdigbioClient idigbioClient(IdigbioProperties properties) {
        return new IdigbioClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.inspirehepnet.enabled", havingValue = "true", matchIfMissing = true)
    public InspirehepNetClient inspirehepnetClient(InspirehepNetProperties properties) {
        return new InspirehepNetClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.gbif.enabled", havingValue = "true", matchIfMissing = true)
    public GbifClient gbifClient(GbifProperties properties) {
        return new GbifClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.core.enabled", havingValue = "true", matchIfMissing = true)
    public CoreClient coreClient(CoreProperties properties) {
        return new CoreClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.isro.enabled", havingValue = "true", matchIfMissing = true)
    public IsroClient isroClient(IsroProperties properties) {
        return new IsroClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.newton.enabled", havingValue = "true", matchIfMissing = true)
    public NewtonClient newtonClient(NewtonProperties properties) {
        return new NewtonClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.spacex.enabled", havingValue = "true", matchIfMissing = true)
    public SpacexClient spacexClient(SpacexProperties properties) {
        return new SpacexClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.codecogs.enabled", havingValue = "true", matchIfMissing = true)
    public CodecogsClient codecogsClient(CodecogsProperties properties) {
        return new CodecogsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.timesadder.enabled", havingValue = "true", matchIfMissing = true)
    public TimesAdderClient timesadderClient(TimesAdderProperties properties) {
        return new TimesAdderClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.remotecalc.enabled", havingValue = "true", matchIfMissing = true)
    public RemoteCalcClient remotecalcClient(RemoteCalcProperties properties) {
        return new RemoteCalcClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.openscienceframework.enabled", havingValue = "true", matchIfMissing = true)
    public OpenScienceFrameworkClient openscienceframeworkClient(OpenScienceFrameworkProperties properties) {
        return new OpenScienceFrameworkClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.arcsecondio.enabled", havingValue = "true", matchIfMissing = true)
    public ArcsecondIoClient arcsecondioClient(ArcsecondIoProperties properties) {
        return new ArcsecondIoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.minorplanetcenter.enabled", havingValue = "true", matchIfMissing = true)
    public MinorPlanetCenterClient minorplanetcenterClient(MinorPlanetCenterProperties properties) {
        return new MinorPlanetCenterClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.numbers.enabled", havingValue = "true", matchIfMissing = true)
    public NumbersClient numbersClient(NumbersProperties properties) {
        return new NumbersClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.opennotify.enabled", havingValue = "true", matchIfMissing = true)
    public OpenNotifyClient opennotifyClient(OpenNotifyProperties properties) {
        return new OpenNotifyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.isevenhumor.enabled", havingValue = "true", matchIfMissing = true)
    public IsevenHumorClient isevenhumorClient(IsevenHumorProperties properties) {
        return new IsevenHumorClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.itis.enabled", havingValue = "true", matchIfMissing = true)
    public ItisClient itisClient(ItisProperties properties) {
        return new ItisClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.nasaads.enabled", havingValue = "true", matchIfMissing = true)
    public NasaAdsClient nasaadsClient(NasaAdsProperties properties) {
        return new NasaAdsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.share.enabled", havingValue = "true", matchIfMissing = true)
    public ShareClient shareClient(ShareProperties properties) {
        return new ShareClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.numbers2.enabled", havingValue = "true", matchIfMissing = true)
    public Numbers2Client numbers2Client(Numbers2Properties properties) {
        return new Numbers2Client(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.nasa.enabled", havingValue = "true", matchIfMissing = true)
    public NasaClient nasaClient(NasaProperties properties) {
        return new NasaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.purpleair.enabled", havingValue = "true", matchIfMissing = true)
    public PurpleAirClient purpleairClient(PurpleAirProperties properties) {
        return new PurpleAirClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.arxiv.enabled", havingValue = "true", matchIfMissing = true)
    public ArxivClient arxivClient(ArxivProperties properties) {
        return new ArxivClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.xmath.enabled", havingValue = "true", matchIfMissing = true)
    public XmathClient xmathClient(XmathProperties properties) {
        return new XmathClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.oceanfacts.enabled", havingValue = "true", matchIfMissing = true)
    public OceanFactsClient oceanfactsClient(OceanFactsProperties properties) {
        return new OceanFactsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.materialsplatformfordatascience.enabled", havingValue = "true", matchIfMissing = true)
    public MaterialsPlatformForDataScienceClient materialsplatformfordatascienceClient(MaterialsPlatformForDataScienceProperties properties) {
        return new MaterialsPlatformForDataScienceClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.usgsearthquakehazardsprogram.enabled", havingValue = "true", matchIfMissing = true)
    public UsgsEarthquakeHazardsProgramClient usgsearthquakehazardsprogramClient(UsgsEarthquakeHazardsProgramProperties properties) {
        return new UsgsEarthquakeHazardsProgramClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.noctua.enabled", havingValue = "true", matchIfMissing = true)
    public NoctuaClient noctuaClient(NoctuaProperties properties) {
        return new NoctuaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.launchlibrary2.enabled", havingValue = "true", matchIfMissing = true)
    public LaunchLibrary2Client launchlibrary2Client(LaunchLibrary2Properties properties) {
        return new LaunchLibrary2Client(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.worldbank.enabled", havingValue = "true", matchIfMissing = true)
    public WorldBankClient worldbankClient(WorldBankProperties properties) {
        return new WorldBankClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.sunriseandsunset.enabled", havingValue = "true", matchIfMissing = true)
    public SunriseAndSunsetClient sunriseandsunsetClient(SunriseAndSunsetProperties properties) {
        return new SunriseAndSunsetClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.usgswaterservices.enabled", havingValue = "true", matchIfMissing = true)
    public UsgsWaterServicesClient usgswaterservicesClient(UsgsWaterServicesProperties properties) {
        return new UsgsWaterServicesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.tle.enabled", havingValue = "true", matchIfMissing = true)
    public TleClient tleClient(TleProperties properties) {
        return new TleClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.sciencemath.openalex.enabled", havingValue = "true", matchIfMissing = true)
    public OpenalexClient openalexClient(OpenalexProperties properties) {
        return new OpenalexClient(properties.getUrl());
    }

}
