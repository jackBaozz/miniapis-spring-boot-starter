package com.bzz.miniapis.sdk.fooddrink;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        FoodishProperties.class,
        TheReportOfTheWeekProperties.class,
        TacofancyProperties.class,
        OpenBreweryDbProperties.class,
        WhatSOnTheMenuProperties.class,
        ChompProperties.class,
        SpoonacularProperties.class,
        BaconmockupProperties.class,
        CoffeeProperties.class,
        RustybeerProperties.class,
        ThemealdbProperties.class,
        FruityviceProperties.class,
        EdamamRecipesProperties.class,
        RecipeapiProperties.class,
        TastyProperties.class,
        EdamamNutritionProperties.class,
        ThecocktaildbProperties.class,
        OpenFoodFactsProperties.class,
        WhiskyhunterProperties.class,
        UntappdProperties.class,
        ZestfulProperties.class,
        KrogerProperties.class
})
public class FoodDrinkAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.foodish.enabled", havingValue = "true", matchIfMissing = true)
    public FoodishClient foodishClient(FoodishProperties properties) {
        return new FoodishClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.thereportoftheweek.enabled", havingValue = "true", matchIfMissing = true)
    public TheReportOfTheWeekClient thereportoftheweekClient(TheReportOfTheWeekProperties properties) {
        return new TheReportOfTheWeekClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.tacofancy.enabled", havingValue = "true", matchIfMissing = true)
    public TacofancyClient tacofancyClient(TacofancyProperties properties) {
        return new TacofancyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.openbrewerydb.enabled", havingValue = "true", matchIfMissing = true)
    public OpenBreweryDbClient openbrewerydbClient(OpenBreweryDbProperties properties) {
        return new OpenBreweryDbClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.whatsonthemenu.enabled", havingValue = "true", matchIfMissing = true)
    public WhatSOnTheMenuClient whatsonthemenuClient(WhatSOnTheMenuProperties properties) {
        return new WhatSOnTheMenuClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.chomp.enabled", havingValue = "true", matchIfMissing = true)
    public ChompClient chompClient(ChompProperties properties) {
        return new ChompClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.spoonacular.enabled", havingValue = "true", matchIfMissing = true)
    public SpoonacularClient spoonacularClient(SpoonacularProperties properties) {
        return new SpoonacularClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.baconmockup.enabled", havingValue = "true", matchIfMissing = true)
    public BaconmockupClient baconmockupClient(BaconmockupProperties properties) {
        return new BaconmockupClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.coffee.enabled", havingValue = "true", matchIfMissing = true)
    public CoffeeClient coffeeClient(CoffeeProperties properties) {
        return new CoffeeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.rustybeer.enabled", havingValue = "true", matchIfMissing = true)
    public RustybeerClient rustybeerClient(RustybeerProperties properties) {
        return new RustybeerClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.themealdb.enabled", havingValue = "true", matchIfMissing = true)
    public ThemealdbClient themealdbClient(ThemealdbProperties properties) {
        return new ThemealdbClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.fruityvice.enabled", havingValue = "true", matchIfMissing = true)
    public FruityviceClient fruityviceClient(FruityviceProperties properties) {
        return new FruityviceClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.edamamrecipes.enabled", havingValue = "true", matchIfMissing = true)
    public EdamamRecipesClient edamamrecipesClient(EdamamRecipesProperties properties) {
        return new EdamamRecipesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.recipeapi.enabled", havingValue = "true", matchIfMissing = true)
    public RecipeapiClient recipeapiClient(RecipeapiProperties properties) {
        return new RecipeapiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.tasty.enabled", havingValue = "true", matchIfMissing = true)
    public TastyClient tastyClient(TastyProperties properties) {
        return new TastyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.edamamnutrition.enabled", havingValue = "true", matchIfMissing = true)
    public EdamamNutritionClient edamamnutritionClient(EdamamNutritionProperties properties) {
        return new EdamamNutritionClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.thecocktaildb.enabled", havingValue = "true", matchIfMissing = true)
    public ThecocktaildbClient thecocktaildbClient(ThecocktaildbProperties properties) {
        return new ThecocktaildbClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.openfoodfacts.enabled", havingValue = "true", matchIfMissing = true)
    public OpenFoodFactsClient openfoodfactsClient(OpenFoodFactsProperties properties) {
        return new OpenFoodFactsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.whiskyhunter.enabled", havingValue = "true", matchIfMissing = true)
    public WhiskyhunterClient whiskyhunterClient(WhiskyhunterProperties properties) {
        return new WhiskyhunterClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.untappd.enabled", havingValue = "true", matchIfMissing = true)
    public UntappdClient untappdClient(UntappdProperties properties) {
        return new UntappdClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.zestful.enabled", havingValue = "true", matchIfMissing = true)
    public ZestfulClient zestfulClient(ZestfulProperties properties) {
        return new ZestfulClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.fooddrink.kroger.enabled", havingValue = "true", matchIfMissing = true)
    public KrogerClient krogerClient(KrogerProperties properties) {
        return new KrogerClient(properties.getUrl());
    }

}
