package com.bzz.miniapis.sdk.animals;

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
        AdoptapetProperties.class,
        AxolotlProperties.class,
        CatFactsProperties.class,
        CataasProperties.class,
        CatsProperties.class,
        DogFactsProperties.class,
        DogsProperties.class,
        EbirdProperties.class,
        FishwatchProperties.class,
        HttpCatProperties.class,
        HttpDogProperties.class,
        IucnProperties.class,
        MeowfactsProperties.class,
        MovebankProperties.class,
        PetfinderProperties.class,
        PlacebearProperties.class,
        PlacedogProperties.class,
        PlacekittenProperties.class,
        RandomdogProperties.class,
        RandomduckProperties.class,
        RandomfoxProperties.class,
        RescuegroupsProperties.class,
        ShibeOnlineProperties.class,
        TheDogProperties.class,
        XenoCantoProperties.class,
        ZooAnimalsProperties.class
})
public class AnimalsAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.adoptapet.enabled", havingValue = "true", matchIfMissing = true)
    public AdoptapetClient adoptapetClient(AdoptapetProperties properties) {
        return createClient(AdoptapetClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.axolotl.enabled", havingValue = "true", matchIfMissing = true)
    public AxolotlClient axolotlClient(AxolotlProperties properties) {
        return createClient(AxolotlClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.catfacts.enabled", havingValue = "true", matchIfMissing = true)
    public CatFactsClient catfactsClient(CatFactsProperties properties) {
        return createClient(CatFactsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.cataas.enabled", havingValue = "true", matchIfMissing = true)
    public CataasClient cataasClient(CataasProperties properties) {
        return createClient(CataasClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.cats.enabled", havingValue = "true", matchIfMissing = true)
    public CatsClient catsClient(CatsProperties properties) {
        return createClient(CatsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.dogfacts.enabled", havingValue = "true", matchIfMissing = true)
    public DogFactsClient dogfactsClient(DogFactsProperties properties) {
        return createClient(DogFactsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.dogs.enabled", havingValue = "true", matchIfMissing = true)
    public DogsClient dogsClient(DogsProperties properties) {
        return createClient(DogsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.ebird.enabled", havingValue = "true", matchIfMissing = true)
    public EbirdClient ebirdClient(EbirdProperties properties) {
        return createClient(EbirdClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.fishwatch.enabled", havingValue = "true", matchIfMissing = true)
    public FishwatchClient fishwatchClient(FishwatchProperties properties) {
        return createClient(FishwatchClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.httpcat.enabled", havingValue = "true", matchIfMissing = true)
    public HttpCatClient httpcatClient(HttpCatProperties properties) {
        return createClient(HttpCatClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.httpdog.enabled", havingValue = "true", matchIfMissing = true)
    public HttpDogClient httpdogClient(HttpDogProperties properties) {
        return createClient(HttpDogClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.iucn.enabled", havingValue = "true", matchIfMissing = true)
    public IucnClient iucnClient(IucnProperties properties) {
        return createClient(IucnClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.meowfacts.enabled", havingValue = "true", matchIfMissing = true)
    public MeowfactsClient meowfactsClient(MeowfactsProperties properties) {
        return createClient(MeowfactsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.movebank.enabled", havingValue = "true", matchIfMissing = true)
    public MovebankClient movebankClient(MovebankProperties properties) {
        return createClient(MovebankClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.petfinder.enabled", havingValue = "true", matchIfMissing = true)
    public PetfinderClient petfinderClient(PetfinderProperties properties) {
        return createClient(PetfinderClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.placebear.enabled", havingValue = "true", matchIfMissing = true)
    public PlacebearClient placebearClient(PlacebearProperties properties) {
        return createClient(PlacebearClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.placedog.enabled", havingValue = "true", matchIfMissing = true)
    public PlacedogClient placedogClient(PlacedogProperties properties) {
        return createClient(PlacedogClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.placekitten.enabled", havingValue = "true", matchIfMissing = true)
    public PlacekittenClient placekittenClient(PlacekittenProperties properties) {
        return createClient(PlacekittenClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.randomdog.enabled", havingValue = "true", matchIfMissing = true)
    public RandomdogClient randomdogClient(RandomdogProperties properties) {
        return createClient(RandomdogClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.randomduck.enabled", havingValue = "true", matchIfMissing = true)
    public RandomduckClient randomduckClient(RandomduckProperties properties) {
        return createClient(RandomduckClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.randomfox.enabled", havingValue = "true", matchIfMissing = true)
    public RandomfoxClient randomfoxClient(RandomfoxProperties properties) {
        return createClient(RandomfoxClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.rescuegroups.enabled", havingValue = "true", matchIfMissing = true)
    public RescuegroupsClient rescuegroupsClient(RescuegroupsProperties properties) {
        return createClient(RescuegroupsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.shibeonline.enabled", havingValue = "true", matchIfMissing = true)
    public ShibeOnlineClient shibeonlineClient(ShibeOnlineProperties properties) {
        return createClient(ShibeOnlineClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.thedog.enabled", havingValue = "true", matchIfMissing = true)
    public TheDogClient thedogClient(TheDogProperties properties) {
        return createClient(TheDogClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.xenocanto.enabled", havingValue = "true", matchIfMissing = true)
    public XenoCantoClient xenocantoClient(XenoCantoProperties properties) {
        return createClient(XenoCantoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.zooanimals.enabled", havingValue = "true", matchIfMissing = true)
    public ZooAnimalsClient zooanimalsClient(ZooAnimalsProperties properties) {
        return createClient(ZooAnimalsClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
