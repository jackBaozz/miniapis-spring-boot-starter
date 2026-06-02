package com.bzz.miniapis.sdk.geocoding;

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
        IpstackProperties.class,
        IpapiComProperties.class,
        ActiniaGrassGisProperties.class,
        AdministrativeDivisonsDbProperties.class,
        ApogeoapiProperties.class,
        AdresseDataGouvFrProperties.class,
        AirtelIpProperties.class,
        ApiipProperties.class,
        BattutaProperties.class,
        BdapisProperties.class,
        BigdatacloudProperties.class,
        Bng2LatlongProperties.class,
        CartesIoProperties.class,
        CepLaProperties.class,
        CitysdkProperties.class,
        CountryProperties.class,
        CountrystatecityProperties.class,
        DucksUnlimitedProperties.class,
        GeoapiProperties.class,
        GeoapifyProperties.class,
        GeocodIoProperties.class,
        GeocodeXyzProperties.class,
        GeocodifyComProperties.class,
        GeodatasourceProperties.class,
        GeodbCitiesProperties.class,
        GeographqlProperties.class,
        GeojsProperties.class,
        GeokeoProperties.class,
        GeonamesProperties.class,
        GeopluginProperties.class,
        GoogleEarthEngineProperties.class,
        GoogleMapsProperties.class,
        GraphCountriesProperties.class,
        HackmyipProperties.class,
        HellosalutProperties.class,
        HereMapsProperties.class,
        HirakIpToCountryProperties.class,
        HongKongGeodataStoreProperties.class,
        IbgeProperties.class,
        Ip2CountryProperties.class,
        IpAddressDetailsProperties.class,
        IpVigilanteProperties.class,
        IpApiProperties.class,
        IpGeolocationProperties.class,
        Ip2LocationProperties.class,
        Ip2ProxyProperties.class,
        IpapiCoProperties.class,
        IpgeoProperties.class,
        IpinfodbProperties.class,
        IpstackProperties.class,
        KakaoMapsProperties.class,
        KeycdnIpLocationFinderProperties.class,
        LocationiqProperties.class,
        LongdoMapProperties.class,
        MapboxProperties.class,
        MapquestProperties.class,
        MexicoProperties.class,
        NominatimProperties.class,
        OneMapSingaporeProperties.class,
        OnwaterProperties.class,
        OpenTopoDataProperties.class,
        OpencageProperties.class,
        OpenrouteserviceOrgProperties.class,
        OpenstreetmapProperties.class,
        PinballMapProperties.class,
        PositionstackProperties.class,
        PostaliProperties.class,
        PostcodedataNlProperties.class,
        PostcodesIoProperties.class,
        PostalcodesProperties.class,
        QueimadasInpeProperties.class,
        RestCountriesProperties.class,
        RwandaLocationsProperties.class,
        SlfProperties.class,
        TelizeProperties.class,
        TomtomProperties.class,
        UebermapsProperties.class,
        UsZipcodeProperties.class,
        UtahAgrcProperties.class,
        ViacepProperties.class,
        What3WordsProperties.class,
        YandexMapsGeocoderProperties.class,
        ZipcodeapiProperties.class,
        ZippopotamUsProperties.class,
        ZiptasticProperties.class
})
public class GeocodingAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ipstack.enabled", havingValue = "true", matchIfMissing = true)
    public IpstackClient ipstackClient(IpstackProperties properties) {
        return createClient(IpstackClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ipapicom.enabled", havingValue = "true", matchIfMissing = true)
    public IpapiComClient ipapicomClient(IpapiComProperties properties) {
        return createClient(IpapiComClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.actiniagrassgis.enabled", havingValue = "true", matchIfMissing = true)
    public ActiniaGrassGisClient actiniagrassgisClient(ActiniaGrassGisProperties properties) {
        return createClient(ActiniaGrassGisClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.administrativedivisonsdb.enabled", havingValue = "true", matchIfMissing = true)
    public AdministrativeDivisonsDbClient administrativedivisonsdbClient(AdministrativeDivisonsDbProperties properties) {
        return createClient(AdministrativeDivisonsDbClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.apogeoapi.enabled", havingValue = "true", matchIfMissing = true)
    public ApogeoapiClient apogeoapiClient(ApogeoapiProperties properties) {
        return createClient(ApogeoapiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.adressedatagouvfr.enabled", havingValue = "true", matchIfMissing = true)
    public AdresseDataGouvFrClient adressedatagouvfrClient(AdresseDataGouvFrProperties properties) {
        return createClient(AdresseDataGouvFrClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.airtelip.enabled", havingValue = "true", matchIfMissing = true)
    public AirtelIpClient airtelipClient(AirtelIpProperties properties) {
        return createClient(AirtelIpClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.apiip.enabled", havingValue = "true", matchIfMissing = true)
    public ApiipClient apiipClient(ApiipProperties properties) {
        return createClient(ApiipClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.battuta.enabled", havingValue = "true", matchIfMissing = true)
    public BattutaClient battutaClient(BattutaProperties properties) {
        return createClient(BattutaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.bdapis.enabled", havingValue = "true", matchIfMissing = true)
    public BdapisClient bdapisClient(BdapisProperties properties) {
        return createClient(BdapisClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.bigdatacloud.enabled", havingValue = "true", matchIfMissing = true)
    public BigdatacloudClient bigdatacloudClient(BigdatacloudProperties properties) {
        return createClient(BigdatacloudClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.bng2latlong.enabled", havingValue = "true", matchIfMissing = true)
    public Bng2LatlongClient bng2latlongClient(Bng2LatlongProperties properties) {
        return createClient(Bng2LatlongClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.cartesio.enabled", havingValue = "true", matchIfMissing = true)
    public CartesIoClient cartesioClient(CartesIoProperties properties) {
        return createClient(CartesIoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.cepla.enabled", havingValue = "true", matchIfMissing = true)
    public CepLaClient ceplaClient(CepLaProperties properties) {
        return createClient(CepLaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.citysdk.enabled", havingValue = "true", matchIfMissing = true)
    public CitysdkClient citysdkClient(CitysdkProperties properties) {
        return createClient(CitysdkClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.country.enabled", havingValue = "true", matchIfMissing = true)
    public CountryClient countryClient(CountryProperties properties) {
        return createClient(CountryClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.countrystatecity.enabled", havingValue = "true", matchIfMissing = true)
    public CountrystatecityClient countrystatecityClient(CountrystatecityProperties properties) {
        return createClient(CountrystatecityClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ducksunlimited.enabled", havingValue = "true", matchIfMissing = true)
    public DucksUnlimitedClient ducksunlimitedClient(DucksUnlimitedProperties properties) {
        return createClient(DucksUnlimitedClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.geoapi.enabled", havingValue = "true", matchIfMissing = true)
    public GeoapiClient geoapiClient(GeoapiProperties properties) {
        return createClient(GeoapiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.geoapify.enabled", havingValue = "true", matchIfMissing = true)
    public GeoapifyClient geoapifyClient(GeoapifyProperties properties) {
        return createClient(GeoapifyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.geocodio.enabled", havingValue = "true", matchIfMissing = true)
    public GeocodIoClient geocodioClient(GeocodIoProperties properties) {
        return createClient(GeocodIoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.geocodexyz.enabled", havingValue = "true", matchIfMissing = true)
    public GeocodeXyzClient geocodexyzClient(GeocodeXyzProperties properties) {
        return createClient(GeocodeXyzClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.geocodifycom.enabled", havingValue = "true", matchIfMissing = true)
    public GeocodifyComClient geocodifycomClient(GeocodifyComProperties properties) {
        return createClient(GeocodifyComClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.geodatasource.enabled", havingValue = "true", matchIfMissing = true)
    public GeodatasourceClient geodatasourceClient(GeodatasourceProperties properties) {
        return createClient(GeodatasourceClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.geodbcities.enabled", havingValue = "true", matchIfMissing = true)
    public GeodbCitiesClient geodbcitiesClient(GeodbCitiesProperties properties) {
        return createClient(GeodbCitiesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.geographql.enabled", havingValue = "true", matchIfMissing = true)
    public GeographqlClient geographqlClient(GeographqlProperties properties) {
        return createClient(GeographqlClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.geojs.enabled", havingValue = "true", matchIfMissing = true)
    public GeojsClient geojsClient(GeojsProperties properties) {
        return createClient(GeojsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.geokeo.enabled", havingValue = "true", matchIfMissing = true)
    public GeokeoClient geokeoClient(GeokeoProperties properties) {
        return createClient(GeokeoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.geonames.enabled", havingValue = "true", matchIfMissing = true)
    public GeonamesClient geonamesClient(GeonamesProperties properties) {
        return createClient(GeonamesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.geoplugin.enabled", havingValue = "true", matchIfMissing = true)
    public GeopluginClient geopluginClient(GeopluginProperties properties) {
        return createClient(GeopluginClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.googleearthengine.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleEarthEngineClient googleearthengineClient(GoogleEarthEngineProperties properties) {
        return createClient(GoogleEarthEngineClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.googlemaps.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleMapsClient googlemapsClient(GoogleMapsProperties properties) {
        return createClient(GoogleMapsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.graphcountries.enabled", havingValue = "true", matchIfMissing = true)
    public GraphCountriesClient graphcountriesClient(GraphCountriesProperties properties) {
        return createClient(GraphCountriesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.hackmyip.enabled", havingValue = "true", matchIfMissing = true)
    public HackmyipClient hackmyipClient(HackmyipProperties properties) {
        return createClient(HackmyipClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.hellosalut.enabled", havingValue = "true", matchIfMissing = true)
    public HellosalutClient hellosalutClient(HellosalutProperties properties) {
        return createClient(HellosalutClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.heremaps.enabled", havingValue = "true", matchIfMissing = true)
    public HereMapsClient heremapsClient(HereMapsProperties properties) {
        return createClient(HereMapsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.hirakiptocountry.enabled", havingValue = "true", matchIfMissing = true)
    public HirakIpToCountryClient hirakiptocountryClient(HirakIpToCountryProperties properties) {
        return createClient(HirakIpToCountryClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.hongkonggeodatastore.enabled", havingValue = "true", matchIfMissing = true)
    public HongKongGeodataStoreClient hongkonggeodatastoreClient(HongKongGeodataStoreProperties properties) {
        return createClient(HongKongGeodataStoreClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ibge.enabled", havingValue = "true", matchIfMissing = true)
    public IbgeClient ibgeClient(IbgeProperties properties) {
        return createClient(IbgeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ip2country.enabled", havingValue = "true", matchIfMissing = true)
    public Ip2CountryClient ip2countryClient(Ip2CountryProperties properties) {
        return createClient(Ip2CountryClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ipaddressdetails.enabled", havingValue = "true", matchIfMissing = true)
    public IpAddressDetailsClient ipaddressdetailsClient(IpAddressDetailsProperties properties) {
        return createClient(IpAddressDetailsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ipvigilante.enabled", havingValue = "true", matchIfMissing = true)
    public IpVigilanteClient ipvigilanteClient(IpVigilanteProperties properties) {
        return createClient(IpVigilanteClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ipapi.enabled", havingValue = "true", matchIfMissing = true)
    public IpApiClient ipapiClient(IpApiProperties properties) {
        return createClient(IpApiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ipgeolocation.enabled", havingValue = "true", matchIfMissing = true)
    public IpGeolocationClient ipgeolocationClient(IpGeolocationProperties properties) {
        return createClient(IpGeolocationClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ip2location.enabled", havingValue = "true", matchIfMissing = true)
    public Ip2LocationClient ip2locationClient(Ip2LocationProperties properties) {
        return createClient(Ip2LocationClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ip2proxy.enabled", havingValue = "true", matchIfMissing = true)
    public Ip2ProxyClient ip2proxyClient(Ip2ProxyProperties properties) {
        return createClient(Ip2ProxyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ipapico.enabled", havingValue = "true", matchIfMissing = true)
    public IpapiCoClient ipapicoClient(IpapiCoProperties properties) {
        return createClient(IpapiCoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ipgeo.enabled", havingValue = "true", matchIfMissing = true)
    public IpgeoClient ipgeoClient(IpgeoProperties properties) {
        return createClient(IpgeoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ipinfodb.enabled", havingValue = "true", matchIfMissing = true)
    public IpinfodbClient ipinfodbClient(IpinfodbProperties properties) {
        return createClient(IpinfodbClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ipstack2.enabled", havingValue = "true", matchIfMissing = true)
    public IpstackClient ipstack2Client(IpstackProperties properties) {
        return createClient(IpstackClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.kakaomaps.enabled", havingValue = "true", matchIfMissing = true)
    public KakaoMapsClient kakaomapsClient(KakaoMapsProperties properties) {
        return createClient(KakaoMapsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.keycdniplocationfinder.enabled", havingValue = "true", matchIfMissing = true)
    public KeycdnIpLocationFinderClient keycdniplocationfinderClient(KeycdnIpLocationFinderProperties properties) {
        return createClient(KeycdnIpLocationFinderClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.locationiq.enabled", havingValue = "true", matchIfMissing = true)
    public LocationiqClient locationiqClient(LocationiqProperties properties) {
        return createClient(LocationiqClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.longdomap.enabled", havingValue = "true", matchIfMissing = true)
    public LongdoMapClient longdomapClient(LongdoMapProperties properties) {
        return createClient(LongdoMapClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.mapbox.enabled", havingValue = "true", matchIfMissing = true)
    public MapboxClient mapboxClient(MapboxProperties properties) {
        return createClient(MapboxClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.mapquest.enabled", havingValue = "true", matchIfMissing = true)
    public MapquestClient mapquestClient(MapquestProperties properties) {
        return createClient(MapquestClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.mexico.enabled", havingValue = "true", matchIfMissing = true)
    public MexicoClient mexicoClient(MexicoProperties properties) {
        return createClient(MexicoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.nominatim.enabled", havingValue = "true", matchIfMissing = true)
    public NominatimClient nominatimClient(NominatimProperties properties) {
        return createClient(NominatimClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.onemapsingapore.enabled", havingValue = "true", matchIfMissing = true)
    public OneMapSingaporeClient onemapsingaporeClient(OneMapSingaporeProperties properties) {
        return createClient(OneMapSingaporeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.onwater.enabled", havingValue = "true", matchIfMissing = true)
    public OnwaterClient onwaterClient(OnwaterProperties properties) {
        return createClient(OnwaterClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.opentopodata.enabled", havingValue = "true", matchIfMissing = true)
    public OpenTopoDataClient opentopodataClient(OpenTopoDataProperties properties) {
        return createClient(OpenTopoDataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.opencage.enabled", havingValue = "true", matchIfMissing = true)
    public OpencageClient opencageClient(OpencageProperties properties) {
        return createClient(OpencageClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.openrouteserviceorg.enabled", havingValue = "true", matchIfMissing = true)
    public OpenrouteserviceOrgClient openrouteserviceorgClient(OpenrouteserviceOrgProperties properties) {
        return createClient(OpenrouteserviceOrgClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.openstreetmap.enabled", havingValue = "true", matchIfMissing = true)
    public OpenstreetmapClient openstreetmapClient(OpenstreetmapProperties properties) {
        return createClient(OpenstreetmapClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.pinballmap.enabled", havingValue = "true", matchIfMissing = true)
    public PinballMapClient pinballmapClient(PinballMapProperties properties) {
        return createClient(PinballMapClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.positionstack.enabled", havingValue = "true", matchIfMissing = true)
    public PositionstackClient positionstackClient(PositionstackProperties properties) {
        return createClient(PositionstackClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.postali.enabled", havingValue = "true", matchIfMissing = true)
    public PostaliClient postaliClient(PostaliProperties properties) {
        return createClient(PostaliClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.postcodedatanl.enabled", havingValue = "true", matchIfMissing = true)
    public PostcodedataNlClient postcodedatanlClient(PostcodedataNlProperties properties) {
        return createClient(PostcodedataNlClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.postcodesio.enabled", havingValue = "true", matchIfMissing = true)
    public PostcodesIoClient postcodesioClient(PostcodesIoProperties properties) {
        return createClient(PostcodesIoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.postalcodes.enabled", havingValue = "true", matchIfMissing = true)
    public PostalcodesClient postalcodesClient(PostalcodesProperties properties) {
        return createClient(PostalcodesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.queimadasinpe.enabled", havingValue = "true", matchIfMissing = true)
    public QueimadasInpeClient queimadasinpeClient(QueimadasInpeProperties properties) {
        return createClient(QueimadasInpeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.restcountries.enabled", havingValue = "true", matchIfMissing = true)
    public RestCountriesClient restcountriesClient(RestCountriesProperties properties) {
        return createClient(RestCountriesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.rwandalocations.enabled", havingValue = "true", matchIfMissing = true)
    public RwandaLocationsClient rwandalocationsClient(RwandaLocationsProperties properties) {
        return createClient(RwandaLocationsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.slf.enabled", havingValue = "true", matchIfMissing = true)
    public SlfClient slfClient(SlfProperties properties) {
        return createClient(SlfClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.telize.enabled", havingValue = "true", matchIfMissing = true)
    public TelizeClient telizeClient(TelizeProperties properties) {
        return createClient(TelizeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.tomtom.enabled", havingValue = "true", matchIfMissing = true)
    public TomtomClient tomtomClient(TomtomProperties properties) {
        return createClient(TomtomClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.uebermaps.enabled", havingValue = "true", matchIfMissing = true)
    public UebermapsClient uebermapsClient(UebermapsProperties properties) {
        return createClient(UebermapsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.uszipcode.enabled", havingValue = "true", matchIfMissing = true)
    public UsZipcodeClient uszipcodeClient(UsZipcodeProperties properties) {
        return createClient(UsZipcodeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.utahagrc.enabled", havingValue = "true", matchIfMissing = true)
    public UtahAgrcClient utahagrcClient(UtahAgrcProperties properties) {
        return createClient(UtahAgrcClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.viacep.enabled", havingValue = "true", matchIfMissing = true)
    public ViacepClient viacepClient(ViacepProperties properties) {
        return createClient(ViacepClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.what3words.enabled", havingValue = "true", matchIfMissing = true)
    public What3WordsClient what3wordsClient(What3WordsProperties properties) {
        return createClient(What3WordsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.yandexmapsgeocoder.enabled", havingValue = "true", matchIfMissing = true)
    public YandexMapsGeocoderClient yandexmapsgeocoderClient(YandexMapsGeocoderProperties properties) {
        return createClient(YandexMapsGeocoderClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.zipcodeapi.enabled", havingValue = "true", matchIfMissing = true)
    public ZipcodeapiClient zipcodeapiClient(ZipcodeapiProperties properties) {
        return createClient(ZipcodeapiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.zippopotamus.enabled", havingValue = "true", matchIfMissing = true)
    public ZippopotamUsClient zippopotamusClient(ZippopotamUsProperties properties) {
        return createClient(ZippopotamUsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.geocoding.ziptastic.enabled", havingValue = "true", matchIfMissing = true)
    public ZiptasticClient ziptasticClient(ZiptasticProperties properties) {
        return createClient(ZiptasticClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
