package com.bzz.miniapis.sdk.currencyexchange;

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
        CurrencylayerProperties.class,
        ExchangerateHostProperties.class,
        ExchangeratesapiIoProperties.class,
        FixerProperties.class,
        Api1ForgeProperties.class,
        AmdorenProperties.class,
        BankOfRussiaProperties.class,
        CurrencyApiProperties.class,
        CurrencyfreaksProperties.class,
        CurrencyscoopProperties.class,
        CzechNationalBankProperties.class,
        EconomiaAwesomeProperties.class,
        ExchangerateApiProperties.class,
        FrankfurterProperties.class,
        NationalBankOfPolandProperties.class,
        ParaleloBoProperties.class,
        VatcomplyComProperties.class
})
public class CurrencyExchangeAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.currencylayer.enabled", havingValue = "true", matchIfMissing = true)
    public CurrencylayerClient currencylayerClient(CurrencylayerProperties properties) {
        return createClient(CurrencylayerClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.exchangeratehost.enabled", havingValue = "true", matchIfMissing = true)
    public ExchangerateHostClient exchangeratehostClient(ExchangerateHostProperties properties) {
        return createClient(ExchangerateHostClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.exchangeratesapiio.enabled", havingValue = "true", matchIfMissing = true)
    public ExchangeratesapiIoClient exchangeratesapiioClient(ExchangeratesapiIoProperties properties) {
        return createClient(ExchangeratesapiIoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.fixer.enabled", havingValue = "true", matchIfMissing = true)
    public FixerClient fixerClient(FixerProperties properties) {
        return createClient(FixerClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.api1forge.enabled", havingValue = "true", matchIfMissing = true)
    public Api1ForgeClient api1forgeClient(Api1ForgeProperties properties) {
        return createClient(Api1ForgeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.amdoren.enabled", havingValue = "true", matchIfMissing = true)
    public AmdorenClient amdorenClient(AmdorenProperties properties) {
        return createClient(AmdorenClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.bankofrussia.enabled", havingValue = "true", matchIfMissing = true)
    public BankOfRussiaClient bankofrussiaClient(BankOfRussiaProperties properties) {
        return createClient(BankOfRussiaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.currencyapi.enabled", havingValue = "true", matchIfMissing = true)
    public CurrencyApiClient currencyapiClient(CurrencyApiProperties properties) {
        return createClient(CurrencyApiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.currencyfreaks.enabled", havingValue = "true", matchIfMissing = true)
    public CurrencyfreaksClient currencyfreaksClient(CurrencyfreaksProperties properties) {
        return createClient(CurrencyfreaksClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.currencyscoop.enabled", havingValue = "true", matchIfMissing = true)
    public CurrencyscoopClient currencyscoopClient(CurrencyscoopProperties properties) {
        return createClient(CurrencyscoopClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.czechnationalbank.enabled", havingValue = "true", matchIfMissing = true)
    public CzechNationalBankClient czechnationalbankClient(CzechNationalBankProperties properties) {
        return createClient(CzechNationalBankClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.economiaawesome.enabled", havingValue = "true", matchIfMissing = true)
    public EconomiaAwesomeClient economiaawesomeClient(EconomiaAwesomeProperties properties) {
        return createClient(EconomiaAwesomeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.exchangerateapi.enabled", havingValue = "true", matchIfMissing = true)
    public ExchangerateApiClient exchangerateapiClient(ExchangerateApiProperties properties) {
        return createClient(ExchangerateApiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.frankfurter.enabled", havingValue = "true", matchIfMissing = true)
    public FrankfurterClient frankfurterClient(FrankfurterProperties properties) {
        return createClient(FrankfurterClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.nationalbankofpoland.enabled", havingValue = "true", matchIfMissing = true)
    public NationalBankOfPolandClient nationalbankofpolandClient(NationalBankOfPolandProperties properties) {
        return createClient(NationalBankOfPolandClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.paralelobo.enabled", havingValue = "true", matchIfMissing = true)
    public ParaleloBoClient paraleloboClient(ParaleloBoProperties properties) {
        return createClient(ParaleloBoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.vatcomplycom.enabled", havingValue = "true", matchIfMissing = true)
    public VatcomplyComClient vatcomplycomClient(VatcomplyComProperties properties) {
        return createClient(VatcomplyComClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
