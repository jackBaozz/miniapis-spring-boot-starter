package com.bzz.miniapis.sdk.animals;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        MeowfactsProperties.class,
        MovebankProperties.class,
        CatFactsProperties.class,
        EbirdProperties.class,
        AxolotlProperties.class,
        DogFactsProperties.class,
        DogFacts2Properties.class,
        PetfinderProperties.class,
        CatFacts2Properties.class,
        AdoptapetProperties.class,
        DogsProperties.class,
        HttpDogProperties.class,
        HttpCatProperties.class,
        XenoCantoProperties.class,
        RandomduckProperties.class,
        RandomfoxProperties.class,
        PlacedogProperties.class,
        ZooAnimalsProperties.class,
        CataasProperties.class,
        PlacebearProperties.class,
        RandomdogProperties.class,
        CatsProperties.class,
        TheDogProperties.class,
        FishwatchProperties.class,
        RescuegroupsProperties.class
})
public class AnimalsAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.meowfacts.enabled", havingValue = "true", matchIfMissing = true)
    public MeowfactsClient meowfactsClient(MeowfactsProperties properties) {
        return new MeowfactsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.movebank.enabled", havingValue = "true", matchIfMissing = true)
    public MovebankClient movebankClient(MovebankProperties properties) {
        return new MovebankClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.catfacts.enabled", havingValue = "true", matchIfMissing = true)
    public CatFactsClient catfactsClient(CatFactsProperties properties) {
        return new CatFactsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.ebird.enabled", havingValue = "true", matchIfMissing = true)
    public EbirdClient ebirdClient(EbirdProperties properties) {
        return new EbirdClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.axolotl.enabled", havingValue = "true", matchIfMissing = true)
    public AxolotlClient axolotlClient(AxolotlProperties properties) {
        return new AxolotlClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.dogfacts.enabled", havingValue = "true", matchIfMissing = true)
    public DogFactsClient dogfactsClient(DogFactsProperties properties) {
        return new DogFactsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.dogfacts2.enabled", havingValue = "true", matchIfMissing = true)
    public DogFacts2Client dogfacts2Client(DogFacts2Properties properties) {
        return new DogFacts2Client(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.petfinder.enabled", havingValue = "true", matchIfMissing = true)
    public PetfinderClient petfinderClient(PetfinderProperties properties) {
        return new PetfinderClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.catfacts2.enabled", havingValue = "true", matchIfMissing = true)
    public CatFacts2Client catfacts2Client(CatFacts2Properties properties) {
        return new CatFacts2Client(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.adoptapet.enabled", havingValue = "true", matchIfMissing = true)
    public AdoptapetClient adoptapetClient(AdoptapetProperties properties) {
        return new AdoptapetClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.dogs.enabled", havingValue = "true", matchIfMissing = true)
    public DogsClient dogsClient(DogsProperties properties) {
        return new DogsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.httpdog.enabled", havingValue = "true", matchIfMissing = true)
    public HttpDogClient httpdogClient(HttpDogProperties properties) {
        return new HttpDogClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.httpcat.enabled", havingValue = "true", matchIfMissing = true)
    public HttpCatClient httpcatClient(HttpCatProperties properties) {
        return new HttpCatClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.xenocanto.enabled", havingValue = "true", matchIfMissing = true)
    public XenoCantoClient xenocantoClient(XenoCantoProperties properties) {
        return new XenoCantoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.randomduck.enabled", havingValue = "true", matchIfMissing = true)
    public RandomduckClient randomduckClient(RandomduckProperties properties) {
        return new RandomduckClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.randomfox.enabled", havingValue = "true", matchIfMissing = true)
    public RandomfoxClient randomfoxClient(RandomfoxProperties properties) {
        return new RandomfoxClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.placedog.enabled", havingValue = "true", matchIfMissing = true)
    public PlacedogClient placedogClient(PlacedogProperties properties) {
        return new PlacedogClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.zooanimals.enabled", havingValue = "true", matchIfMissing = true)
    public ZooAnimalsClient zooanimalsClient(ZooAnimalsProperties properties) {
        return new ZooAnimalsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.cataas.enabled", havingValue = "true", matchIfMissing = true)
    public CataasClient cataasClient(CataasProperties properties) {
        return new CataasClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.placebear.enabled", havingValue = "true", matchIfMissing = true)
    public PlacebearClient placebearClient(PlacebearProperties properties) {
        return new PlacebearClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.randomdog.enabled", havingValue = "true", matchIfMissing = true)
    public RandomdogClient randomdogClient(RandomdogProperties properties) {
        return new RandomdogClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.cats.enabled", havingValue = "true", matchIfMissing = true)
    public CatsClient catsClient(CatsProperties properties) {
        return new CatsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.thedog.enabled", havingValue = "true", matchIfMissing = true)
    public TheDogClient thedogClient(TheDogProperties properties) {
        return new TheDogClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.fishwatch.enabled", havingValue = "true", matchIfMissing = true)
    public FishwatchClient fishwatchClient(FishwatchProperties properties) {
        return new FishwatchClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.animals.rescuegroups.enabled", havingValue = "true", matchIfMissing = true)
    public RescuegroupsClient rescuegroupsClient(RescuegroupsProperties properties) {
        return new RescuegroupsClient(properties.getUrl());
    }

}
