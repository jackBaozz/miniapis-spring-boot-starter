package com.bzz.miniapis.sdk.shopping;

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
        BestBuyProperties.class,
        DigiKeyProperties.class,
        DummyProductsProperties.class,
        EtsyProperties.class,
        LazadaProperties.class,
        MercadolibreProperties.class,
        OctopartProperties.class,
        OlxPolandProperties.class,
        RappiProperties.class,
        ShopeeProperties.class,
        TokopediaProperties.class,
        WoocommerceProperties.class
})
public class ShoppingAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.shopping.bestbuy.enabled", havingValue = "true", matchIfMissing = true)
    public BestBuyClient bestbuyClient(BestBuyProperties properties) {
        return createClient(BestBuyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.shopping.digikey.enabled", havingValue = "true", matchIfMissing = true)
    public DigiKeyClient digikeyClient(DigiKeyProperties properties) {
        return createClient(DigiKeyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.shopping.dummyproducts.enabled", havingValue = "true", matchIfMissing = true)
    public DummyProductsClient dummyproductsClient(DummyProductsProperties properties) {
        return createClient(DummyProductsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.shopping.etsy.enabled", havingValue = "true", matchIfMissing = true)
    public EtsyClient etsyClient(EtsyProperties properties) {
        return createClient(EtsyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.shopping.lazada.enabled", havingValue = "true", matchIfMissing = true)
    public LazadaClient lazadaClient(LazadaProperties properties) {
        return createClient(LazadaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.shopping.mercadolibre.enabled", havingValue = "true", matchIfMissing = true)
    public MercadolibreClient mercadolibreClient(MercadolibreProperties properties) {
        return createClient(MercadolibreClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.shopping.octopart.enabled", havingValue = "true", matchIfMissing = true)
    public OctopartClient octopartClient(OctopartProperties properties) {
        return createClient(OctopartClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.shopping.olxpoland.enabled", havingValue = "true", matchIfMissing = true)
    public OlxPolandClient olxpolandClient(OlxPolandProperties properties) {
        return createClient(OlxPolandClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.shopping.rappi.enabled", havingValue = "true", matchIfMissing = true)
    public RappiClient rappiClient(RappiProperties properties) {
        return createClient(RappiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.shopping.shopee.enabled", havingValue = "true", matchIfMissing = true)
    public ShopeeClient shopeeClient(ShopeeProperties properties) {
        return createClient(ShopeeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.shopping.tokopedia.enabled", havingValue = "true", matchIfMissing = true)
    public TokopediaClient tokopediaClient(TokopediaProperties properties) {
        return createClient(TokopediaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.shopping.woocommerce.enabled", havingValue = "true", matchIfMissing = true)
    public WoocommerceClient woocommerceClient(WoocommerceProperties properties) {
        return createClient(WoocommerceClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
