package com.bzz.miniapis.sdk.shopping;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        DigiKeyProperties.class,
        BestBuyProperties.class,
        ShopeeProperties.class,
        LazadaProperties.class,
        WoocommerceProperties.class,
        RappiProperties.class,
        OctopartProperties.class,
        MercadolibreProperties.class,
        DummyProductsProperties.class,
        OlxPolandProperties.class,
        EtsyProperties.class,
        TokopediaProperties.class
})
public class ShoppingAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.shopping.digikey.enabled", havingValue = "true", matchIfMissing = true)
    public DigiKeyClient digikeyClient(DigiKeyProperties properties) {
        return new DigiKeyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.shopping.bestbuy.enabled", havingValue = "true", matchIfMissing = true)
    public BestBuyClient bestbuyClient(BestBuyProperties properties) {
        return new BestBuyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.shopping.shopee.enabled", havingValue = "true", matchIfMissing = true)
    public ShopeeClient shopeeClient(ShopeeProperties properties) {
        return new ShopeeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.shopping.lazada.enabled", havingValue = "true", matchIfMissing = true)
    public LazadaClient lazadaClient(LazadaProperties properties) {
        return new LazadaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.shopping.woocommerce.enabled", havingValue = "true", matchIfMissing = true)
    public WoocommerceClient woocommerceClient(WoocommerceProperties properties) {
        return new WoocommerceClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.shopping.rappi.enabled", havingValue = "true", matchIfMissing = true)
    public RappiClient rappiClient(RappiProperties properties) {
        return new RappiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.shopping.octopart.enabled", havingValue = "true", matchIfMissing = true)
    public OctopartClient octopartClient(OctopartProperties properties) {
        return new OctopartClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.shopping.mercadolibre.enabled", havingValue = "true", matchIfMissing = true)
    public MercadolibreClient mercadolibreClient(MercadolibreProperties properties) {
        return new MercadolibreClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.shopping.dummyproducts.enabled", havingValue = "true", matchIfMissing = true)
    public DummyProductsClient dummyproductsClient(DummyProductsProperties properties) {
        return new DummyProductsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.shopping.olxpoland.enabled", havingValue = "true", matchIfMissing = true)
    public OlxPolandClient olxpolandClient(OlxPolandProperties properties) {
        return new OlxPolandClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.shopping.etsy.enabled", havingValue = "true", matchIfMissing = true)
    public EtsyClient etsyClient(EtsyProperties properties) {
        return new EtsyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.shopping.tokopedia.enabled", havingValue = "true", matchIfMissing = true)
    public TokopediaClient tokopediaClient(TokopediaProperties properties) {
        return new TokopediaClient(properties.getUrl());
    }

}
