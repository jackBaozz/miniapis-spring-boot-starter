package com.bzz.miniapis.sdk.geocoding;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        AdministrativeDivisonsDbProperties.class,
        CartesIoProperties.class,
        AirtelIpProperties.class,
        ApiipProperties.class,
        Bng2LatlongProperties.class,
        GraphCountriesProperties.class,
        IpapiComProperties.class,
        GeojsProperties.class,
        GoogleMapsProperties.class,
        GoogleEarthEngineProperties.class,
        IpAddressDetailsProperties.class,
        GeographqlProperties.class,
        CountrystatecityProperties.class,
        BattutaProperties.class,
        GeokeoProperties.class,
        IpstackProperties.class,
        AdresseDataGouvFrProperties.class,
        BigdatacloudProperties.class,
        HongKongGeodataStoreProperties.class,
        CountryProperties.class,
        HackmyipProperties.class,
        IpGeolocationProperties.class,
        IpApiProperties.class,
        IpinfodbProperties.class,
        BdapisProperties.class,
        IpapiCoProperties.class,
        GeocodifyComProperties.class,
        GeodatasourceProperties.class,
        MexicoProperties.class,
        GeocodeXyzProperties.class,
        GeonamesProperties.class,
        GeopluginProperties.class,
        Ipstack2Properties.class,
        Ipgeolocation2Properties.class,
        Ip2CountryProperties.class,
        KeycdnIpLocationFinderProperties.class,
        DucksUnlimitedProperties.class,
        ApogeoapiProperties.class,
        Ip2LocationProperties.class,
        Ip2ProxyProperties.class,
        KakaoMapsProperties.class,
        MapquestProperties.class,
        LongdoMapProperties.class,
        HereMapsProperties.class,
        GeoapifyProperties.class,
        SlfProperties.class,
        MapboxProperties.class,
        OneMapSingaporeProperties.class,
        UsZipcodeProperties.class,
        RwandaLocationsProperties.class,
        PostcodesIoProperties.class,
        OpenrouteserviceOrgProperties.class,
        PostalcodesProperties.class,
        PinballMapProperties.class,
        OpencageProperties.class,
        OpenTopoDataProperties.class,
        CepLaProperties.class,
        GeodbCitiesProperties.class,
        RestCountriesProperties.class,
        IpgeoProperties.class,
        ActiniaGrassGisProperties.class,
        TomtomProperties.class,
        PostaliProperties.class,
        TelizeProperties.class,
        IbgeProperties.class,
        PositionstackProperties.class,
        UebermapsProperties.class,
        ZippopotamUsProperties.class,
        PostcodedataNlProperties.class,
        CitysdkProperties.class,
        NominatimProperties.class,
        GeocodIoProperties.class,
        OpenstreetmapProperties.class,
        UtahAgrcProperties.class,
        ZipcodeapiProperties.class,
        GeoapiProperties.class,
        YandexMapsGeocoderProperties.class,
        ZiptasticProperties.class,
        LocationiqProperties.class,
        IpVigilanteProperties.class,
        HellosalutProperties.class,
        ViacepProperties.class,
        HirakIpToCountryProperties.class,
        OnwaterProperties.class,
        QueimadasInpeProperties.class,
        What3WordsProperties.class
})
public class GeocodingAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.administrativedivisonsdb.enabled", havingValue = "true", matchIfMissing = true)
    public AdministrativeDivisonsDbClient administrativedivisonsdbClient(AdministrativeDivisonsDbProperties properties) {
        return new AdministrativeDivisonsDbClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.cartesio.enabled", havingValue = "true", matchIfMissing = true)
    public CartesIoClient cartesioClient(CartesIoProperties properties) {
        return new CartesIoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.airtelip.enabled", havingValue = "true", matchIfMissing = true)
    public AirtelIpClient airtelipClient(AirtelIpProperties properties) {
        return new AirtelIpClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.apiip.enabled", havingValue = "true", matchIfMissing = true)
    public ApiipClient apiipClient(ApiipProperties properties) {
        return new ApiipClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.bng2latlong.enabled", havingValue = "true", matchIfMissing = true)
    public Bng2LatlongClient bng2latlongClient(Bng2LatlongProperties properties) {
        return new Bng2LatlongClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.graphcountries.enabled", havingValue = "true", matchIfMissing = true)
    public GraphCountriesClient graphcountriesClient(GraphCountriesProperties properties) {
        return new GraphCountriesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ipapicom.enabled", havingValue = "true", matchIfMissing = true)
    public IpapiComClient ipapicomClient(IpapiComProperties properties) {
        return new IpapiComClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.geojs.enabled", havingValue = "true", matchIfMissing = true)
    public GeojsClient geojsClient(GeojsProperties properties) {
        return new GeojsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.googlemaps.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleMapsClient googlemapsClient(GoogleMapsProperties properties) {
        return new GoogleMapsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.googleearthengine.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleEarthEngineClient googleearthengineClient(GoogleEarthEngineProperties properties) {
        return new GoogleEarthEngineClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ipaddressdetails.enabled", havingValue = "true", matchIfMissing = true)
    public IpAddressDetailsClient ipaddressdetailsClient(IpAddressDetailsProperties properties) {
        return new IpAddressDetailsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.geographql.enabled", havingValue = "true", matchIfMissing = true)
    public GeographqlClient geographqlClient(GeographqlProperties properties) {
        return new GeographqlClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.countrystatecity.enabled", havingValue = "true", matchIfMissing = true)
    public CountrystatecityClient countrystatecityClient(CountrystatecityProperties properties) {
        return new CountrystatecityClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.battuta.enabled", havingValue = "true", matchIfMissing = true)
    public BattutaClient battutaClient(BattutaProperties properties) {
        return new BattutaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.geokeo.enabled", havingValue = "true", matchIfMissing = true)
    public GeokeoClient geokeoClient(GeokeoProperties properties) {
        return new GeokeoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ipstack.enabled", havingValue = "true", matchIfMissing = true)
    public IpstackClient ipstackClient(IpstackProperties properties) {
        return new IpstackClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.adressedatagouvfr.enabled", havingValue = "true", matchIfMissing = true)
    public AdresseDataGouvFrClient adressedatagouvfrClient(AdresseDataGouvFrProperties properties) {
        return new AdresseDataGouvFrClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.bigdatacloud.enabled", havingValue = "true", matchIfMissing = true)
    public BigdatacloudClient bigdatacloudClient(BigdatacloudProperties properties) {
        return new BigdatacloudClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.hongkonggeodatastore.enabled", havingValue = "true", matchIfMissing = true)
    public HongKongGeodataStoreClient hongkonggeodatastoreClient(HongKongGeodataStoreProperties properties) {
        return new HongKongGeodataStoreClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.country.enabled", havingValue = "true", matchIfMissing = true)
    public CountryClient countryClient(CountryProperties properties) {
        return new CountryClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.hackmyip.enabled", havingValue = "true", matchIfMissing = true)
    public HackmyipClient hackmyipClient(HackmyipProperties properties) {
        return new HackmyipClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ipgeolocation.enabled", havingValue = "true", matchIfMissing = true)
    public IpGeolocationClient ipgeolocationClient(IpGeolocationProperties properties) {
        return new IpGeolocationClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ipapi.enabled", havingValue = "true", matchIfMissing = true)
    public IpApiClient ipapiClient(IpApiProperties properties) {
        return new IpApiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ipinfodb.enabled", havingValue = "true", matchIfMissing = true)
    public IpinfodbClient ipinfodbClient(IpinfodbProperties properties) {
        return new IpinfodbClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.bdapis.enabled", havingValue = "true", matchIfMissing = true)
    public BdapisClient bdapisClient(BdapisProperties properties) {
        return new BdapisClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ipapico.enabled", havingValue = "true", matchIfMissing = true)
    public IpapiCoClient ipapicoClient(IpapiCoProperties properties) {
        return new IpapiCoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.geocodifycom.enabled", havingValue = "true", matchIfMissing = true)
    public GeocodifyComClient geocodifycomClient(GeocodifyComProperties properties) {
        return new GeocodifyComClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.geodatasource.enabled", havingValue = "true", matchIfMissing = true)
    public GeodatasourceClient geodatasourceClient(GeodatasourceProperties properties) {
        return new GeodatasourceClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.mexico.enabled", havingValue = "true", matchIfMissing = true)
    public MexicoClient mexicoClient(MexicoProperties properties) {
        return new MexicoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.geocodexyz.enabled", havingValue = "true", matchIfMissing = true)
    public GeocodeXyzClient geocodexyzClient(GeocodeXyzProperties properties) {
        return new GeocodeXyzClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.geonames.enabled", havingValue = "true", matchIfMissing = true)
    public GeonamesClient geonamesClient(GeonamesProperties properties) {
        return new GeonamesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.geoplugin.enabled", havingValue = "true", matchIfMissing = true)
    public GeopluginClient geopluginClient(GeopluginProperties properties) {
        return new GeopluginClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ipstack2.enabled", havingValue = "true", matchIfMissing = true)
    public Ipstack2Client ipstack2Client(Ipstack2Properties properties) {
        return new Ipstack2Client(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ipgeolocation2.enabled", havingValue = "true", matchIfMissing = true)
    public Ipgeolocation2Client ipgeolocation2Client(Ipgeolocation2Properties properties) {
        return new Ipgeolocation2Client(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ip2country.enabled", havingValue = "true", matchIfMissing = true)
    public Ip2CountryClient ip2countryClient(Ip2CountryProperties properties) {
        return new Ip2CountryClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.keycdniplocationfinder.enabled", havingValue = "true", matchIfMissing = true)
    public KeycdnIpLocationFinderClient keycdniplocationfinderClient(KeycdnIpLocationFinderProperties properties) {
        return new KeycdnIpLocationFinderClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ducksunlimited.enabled", havingValue = "true", matchIfMissing = true)
    public DucksUnlimitedClient ducksunlimitedClient(DucksUnlimitedProperties properties) {
        return new DucksUnlimitedClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.apogeoapi.enabled", havingValue = "true", matchIfMissing = true)
    public ApogeoapiClient apogeoapiClient(ApogeoapiProperties properties) {
        return new ApogeoapiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ip2location.enabled", havingValue = "true", matchIfMissing = true)
    public Ip2LocationClient ip2locationClient(Ip2LocationProperties properties) {
        return new Ip2LocationClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ip2proxy.enabled", havingValue = "true", matchIfMissing = true)
    public Ip2ProxyClient ip2proxyClient(Ip2ProxyProperties properties) {
        return new Ip2ProxyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.kakaomaps.enabled", havingValue = "true", matchIfMissing = true)
    public KakaoMapsClient kakaomapsClient(KakaoMapsProperties properties) {
        return new KakaoMapsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.mapquest.enabled", havingValue = "true", matchIfMissing = true)
    public MapquestClient mapquestClient(MapquestProperties properties) {
        return new MapquestClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.longdomap.enabled", havingValue = "true", matchIfMissing = true)
    public LongdoMapClient longdomapClient(LongdoMapProperties properties) {
        return new LongdoMapClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.heremaps.enabled", havingValue = "true", matchIfMissing = true)
    public HereMapsClient heremapsClient(HereMapsProperties properties) {
        return new HereMapsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.geoapify.enabled", havingValue = "true", matchIfMissing = true)
    public GeoapifyClient geoapifyClient(GeoapifyProperties properties) {
        return new GeoapifyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.slf.enabled", havingValue = "true", matchIfMissing = true)
    public SlfClient slfClient(SlfProperties properties) {
        return new SlfClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.mapbox.enabled", havingValue = "true", matchIfMissing = true)
    public MapboxClient mapboxClient(MapboxProperties properties) {
        return new MapboxClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.onemapsingapore.enabled", havingValue = "true", matchIfMissing = true)
    public OneMapSingaporeClient onemapsingaporeClient(OneMapSingaporeProperties properties) {
        return new OneMapSingaporeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.uszipcode.enabled", havingValue = "true", matchIfMissing = true)
    public UsZipcodeClient uszipcodeClient(UsZipcodeProperties properties) {
        return new UsZipcodeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.rwandalocations.enabled", havingValue = "true", matchIfMissing = true)
    public RwandaLocationsClient rwandalocationsClient(RwandaLocationsProperties properties) {
        return new RwandaLocationsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.postcodesio.enabled", havingValue = "true", matchIfMissing = true)
    public PostcodesIoClient postcodesioClient(PostcodesIoProperties properties) {
        return new PostcodesIoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.openrouteserviceorg.enabled", havingValue = "true", matchIfMissing = true)
    public OpenrouteserviceOrgClient openrouteserviceorgClient(OpenrouteserviceOrgProperties properties) {
        return new OpenrouteserviceOrgClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.postalcodes.enabled", havingValue = "true", matchIfMissing = true)
    public PostalcodesClient postalcodesClient(PostalcodesProperties properties) {
        return new PostalcodesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.pinballmap.enabled", havingValue = "true", matchIfMissing = true)
    public PinballMapClient pinballmapClient(PinballMapProperties properties) {
        return new PinballMapClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.opencage.enabled", havingValue = "true", matchIfMissing = true)
    public OpencageClient opencageClient(OpencageProperties properties) {
        return new OpencageClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.opentopodata.enabled", havingValue = "true", matchIfMissing = true)
    public OpenTopoDataClient opentopodataClient(OpenTopoDataProperties properties) {
        return new OpenTopoDataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.cepla.enabled", havingValue = "true", matchIfMissing = true)
    public CepLaClient ceplaClient(CepLaProperties properties) {
        return new CepLaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.geodbcities.enabled", havingValue = "true", matchIfMissing = true)
    public GeodbCitiesClient geodbcitiesClient(GeodbCitiesProperties properties) {
        return new GeodbCitiesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.restcountries.enabled", havingValue = "true", matchIfMissing = true)
    public RestCountriesClient restcountriesClient(RestCountriesProperties properties) {
        return new RestCountriesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ipgeo.enabled", havingValue = "true", matchIfMissing = true)
    public IpgeoClient ipgeoClient(IpgeoProperties properties) {
        return new IpgeoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.actiniagrassgis.enabled", havingValue = "true", matchIfMissing = true)
    public ActiniaGrassGisClient actiniagrassgisClient(ActiniaGrassGisProperties properties) {
        return new ActiniaGrassGisClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.tomtom.enabled", havingValue = "true", matchIfMissing = true)
    public TomtomClient tomtomClient(TomtomProperties properties) {
        return new TomtomClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.postali.enabled", havingValue = "true", matchIfMissing = true)
    public PostaliClient postaliClient(PostaliProperties properties) {
        return new PostaliClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.telize.enabled", havingValue = "true", matchIfMissing = true)
    public TelizeClient telizeClient(TelizeProperties properties) {
        return new TelizeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ibge.enabled", havingValue = "true", matchIfMissing = true)
    public IbgeClient ibgeClient(IbgeProperties properties) {
        return new IbgeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.positionstack.enabled", havingValue = "true", matchIfMissing = true)
    public PositionstackClient positionstackClient(PositionstackProperties properties) {
        return new PositionstackClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.uebermaps.enabled", havingValue = "true", matchIfMissing = true)
    public UebermapsClient uebermapsClient(UebermapsProperties properties) {
        return new UebermapsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.zippopotamus.enabled", havingValue = "true", matchIfMissing = true)
    public ZippopotamUsClient zippopotamusClient(ZippopotamUsProperties properties) {
        return new ZippopotamUsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.postcodedatanl.enabled", havingValue = "true", matchIfMissing = true)
    public PostcodedataNlClient postcodedatanlClient(PostcodedataNlProperties properties) {
        return new PostcodedataNlClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.citysdk.enabled", havingValue = "true", matchIfMissing = true)
    public CitysdkClient citysdkClient(CitysdkProperties properties) {
        return new CitysdkClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.nominatim.enabled", havingValue = "true", matchIfMissing = true)
    public NominatimClient nominatimClient(NominatimProperties properties) {
        return new NominatimClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.geocodio.enabled", havingValue = "true", matchIfMissing = true)
    public GeocodIoClient geocodioClient(GeocodIoProperties properties) {
        return new GeocodIoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.openstreetmap.enabled", havingValue = "true", matchIfMissing = true)
    public OpenstreetmapClient openstreetmapClient(OpenstreetmapProperties properties) {
        return new OpenstreetmapClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.utahagrc.enabled", havingValue = "true", matchIfMissing = true)
    public UtahAgrcClient utahagrcClient(UtahAgrcProperties properties) {
        return new UtahAgrcClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.zipcodeapi.enabled", havingValue = "true", matchIfMissing = true)
    public ZipcodeapiClient zipcodeapiClient(ZipcodeapiProperties properties) {
        return new ZipcodeapiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.geoapi.enabled", havingValue = "true", matchIfMissing = true)
    public GeoapiClient geoapiClient(GeoapiProperties properties) {
        return new GeoapiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.yandexmapsgeocoder.enabled", havingValue = "true", matchIfMissing = true)
    public YandexMapsGeocoderClient yandexmapsgeocoderClient(YandexMapsGeocoderProperties properties) {
        return new YandexMapsGeocoderClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ziptastic.enabled", havingValue = "true", matchIfMissing = true)
    public ZiptasticClient ziptasticClient(ZiptasticProperties properties) {
        return new ZiptasticClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.locationiq.enabled", havingValue = "true", matchIfMissing = true)
    public LocationiqClient locationiqClient(LocationiqProperties properties) {
        return new LocationiqClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ipvigilante.enabled", havingValue = "true", matchIfMissing = true)
    public IpVigilanteClient ipvigilanteClient(IpVigilanteProperties properties) {
        return new IpVigilanteClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.hellosalut.enabled", havingValue = "true", matchIfMissing = true)
    public HellosalutClient hellosalutClient(HellosalutProperties properties) {
        return new HellosalutClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.viacep.enabled", havingValue = "true", matchIfMissing = true)
    public ViacepClient viacepClient(ViacepProperties properties) {
        return new ViacepClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.hirakiptocountry.enabled", havingValue = "true", matchIfMissing = true)
    public HirakIpToCountryClient hirakiptocountryClient(HirakIpToCountryProperties properties) {
        return new HirakIpToCountryClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.onwater.enabled", havingValue = "true", matchIfMissing = true)
    public OnwaterClient onwaterClient(OnwaterProperties properties) {
        return new OnwaterClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.queimadasinpe.enabled", havingValue = "true", matchIfMissing = true)
    public QueimadasInpeClient queimadasinpeClient(QueimadasInpeProperties properties) {
        return new QueimadasInpeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.what3words.enabled", havingValue = "true", matchIfMissing = true)
    public What3WordsClient what3wordsClient(What3WordsProperties properties) {
        return new What3WordsClient(properties.getUrl());
    }

}
