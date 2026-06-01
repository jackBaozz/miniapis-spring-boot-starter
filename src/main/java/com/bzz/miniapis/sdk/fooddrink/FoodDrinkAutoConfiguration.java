package com.bzz.miniapis.sdk.fooddrink;

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
        BaconmockupProperties.class,
        ChompProperties.class,
        CoffeeProperties.class,
        EdamamNutritionProperties.class,
        EdamamRecipesProperties.class,
        FoodishProperties.class,
        FruityviceProperties.class,
        KrogerProperties.class,
        LcboProperties.class,
        OpenBreweryDbProperties.class,
        OpenFoodFactsProperties.class,
        PunkapiProperties.class,
        RecipeapiProperties.class,
        RustybeerProperties.class,
        SpoonacularProperties.class,
        SystembolagetProperties.class,
        TacofancyProperties.class,
        TastyProperties.class,
        TheReportOfTheWeekProperties.class,
        ThecocktaildbProperties.class,
        ThemealdbProperties.class,
        UntappdProperties.class,
        WhatSOnTheMenuProperties.class,
        WhiskyhunterProperties.class,
        ZestfulProperties.class
})
public class FoodDrinkAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.baconmockup.enabled", havingValue = "true", matchIfMissing = true)
    public BaconmockupClient baconmockupClient(BaconmockupProperties properties) {
        return createClient(BaconmockupClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.chomp.enabled", havingValue = "true", matchIfMissing = true)
    public ChompClient chompClient(ChompProperties properties) {
        return createClient(ChompClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.coffee.enabled", havingValue = "true", matchIfMissing = true)
    public CoffeeClient coffeeClient(CoffeeProperties properties) {
        return createClient(CoffeeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.edamamnutrition.enabled", havingValue = "true", matchIfMissing = true)
    public EdamamNutritionClient edamamnutritionClient(EdamamNutritionProperties properties) {
        return createClient(EdamamNutritionClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.edamamrecipes.enabled", havingValue = "true", matchIfMissing = true)
    public EdamamRecipesClient edamamrecipesClient(EdamamRecipesProperties properties) {
        return createClient(EdamamRecipesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.foodish.enabled", havingValue = "true", matchIfMissing = true)
    public FoodishClient foodishClient(FoodishProperties properties) {
        return createClient(FoodishClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.fruityvice.enabled", havingValue = "true", matchIfMissing = true)
    public FruityviceClient fruityviceClient(FruityviceProperties properties) {
        return createClient(FruityviceClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.kroger.enabled", havingValue = "true", matchIfMissing = true)
    public KrogerClient krogerClient(KrogerProperties properties) {
        return createClient(KrogerClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.lcbo.enabled", havingValue = "true", matchIfMissing = true)
    public LcboClient lcboClient(LcboProperties properties) {
        return createClient(LcboClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.openbrewerydb.enabled", havingValue = "true", matchIfMissing = true)
    public OpenBreweryDbClient openbrewerydbClient(OpenBreweryDbProperties properties) {
        return createClient(OpenBreweryDbClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.openfoodfacts.enabled", havingValue = "true", matchIfMissing = true)
    public OpenFoodFactsClient openfoodfactsClient(OpenFoodFactsProperties properties) {
        return createClient(OpenFoodFactsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.punkapi.enabled", havingValue = "true", matchIfMissing = true)
    public PunkapiClient punkapiClient(PunkapiProperties properties) {
        return createClient(PunkapiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.recipeapi.enabled", havingValue = "true", matchIfMissing = true)
    public RecipeapiClient recipeapiClient(RecipeapiProperties properties) {
        return createClient(RecipeapiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.rustybeer.enabled", havingValue = "true", matchIfMissing = true)
    public RustybeerClient rustybeerClient(RustybeerProperties properties) {
        return createClient(RustybeerClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.spoonacular.enabled", havingValue = "true", matchIfMissing = true)
    public SpoonacularClient spoonacularClient(SpoonacularProperties properties) {
        return createClient(SpoonacularClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.systembolaget.enabled", havingValue = "true", matchIfMissing = true)
    public SystembolagetClient systembolagetClient(SystembolagetProperties properties) {
        return createClient(SystembolagetClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.tacofancy.enabled", havingValue = "true", matchIfMissing = true)
    public TacofancyClient tacofancyClient(TacofancyProperties properties) {
        return createClient(TacofancyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.tasty.enabled", havingValue = "true", matchIfMissing = true)
    public TastyClient tastyClient(TastyProperties properties) {
        return createClient(TastyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.thereportoftheweek.enabled", havingValue = "true", matchIfMissing = true)
    public TheReportOfTheWeekClient thereportoftheweekClient(TheReportOfTheWeekProperties properties) {
        return createClient(TheReportOfTheWeekClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.thecocktaildb.enabled", havingValue = "true", matchIfMissing = true)
    public ThecocktaildbClient thecocktaildbClient(ThecocktaildbProperties properties) {
        return createClient(ThecocktaildbClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.themealdb.enabled", havingValue = "true", matchIfMissing = true)
    public ThemealdbClient themealdbClient(ThemealdbProperties properties) {
        return createClient(ThemealdbClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.untappd.enabled", havingValue = "true", matchIfMissing = true)
    public UntappdClient untappdClient(UntappdProperties properties) {
        return createClient(UntappdClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.whatsonthemenu.enabled", havingValue = "true", matchIfMissing = true)
    public WhatSOnTheMenuClient whatsonthemenuClient(WhatSOnTheMenuProperties properties) {
        return createClient(WhatSOnTheMenuClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.whiskyhunter.enabled", havingValue = "true", matchIfMissing = true)
    public WhiskyhunterClient whiskyhunterClient(WhiskyhunterProperties properties) {
        return createClient(WhiskyhunterClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.zestful.enabled", havingValue = "true", matchIfMissing = true)
    public ZestfulClient zestfulClient(ZestfulProperties properties) {
        return createClient(ZestfulClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
