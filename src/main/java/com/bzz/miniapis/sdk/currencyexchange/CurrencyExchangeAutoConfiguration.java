package com.bzz.miniapis.sdk.currencyexchange;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        CurrencyApiProperties.class,
        ExchangerateApiProperties.class,
        CurrencylayerProperties.class,
        CurrencyfreaksProperties.class,
        ExchangeratesapiIoProperties.class,
        ExchangerateHostProperties.class,
        CzechNationalBankProperties.class,
        FixerProperties.class,
        VatcomplyComProperties.class,
        AmdorenProperties.class,
        BankOfRussiaProperties.class,
        Api1ForgeProperties.class,
        ParaleloBoProperties.class,
        NationalBankOfPolandProperties.class,
        CurrencyscoopProperties.class,
        FrankfurterProperties.class,
        EconomiaAwesomeProperties.class
})
public class CurrencyExchangeAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.currencyapi.enabled", havingValue = "true", matchIfMissing = true)
    public CurrencyApiClient currencyapiClient(CurrencyApiProperties properties) {
        return new CurrencyApiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.exchangerateapi.enabled", havingValue = "true", matchIfMissing = true)
    public ExchangerateApiClient exchangerateapiClient(ExchangerateApiProperties properties) {
        return new ExchangerateApiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.currencylayer.enabled", havingValue = "true", matchIfMissing = true)
    public CurrencylayerClient currencylayerClient(CurrencylayerProperties properties) {
        return new CurrencylayerClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.currencyfreaks.enabled", havingValue = "true", matchIfMissing = true)
    public CurrencyfreaksClient currencyfreaksClient(CurrencyfreaksProperties properties) {
        return new CurrencyfreaksClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.exchangeratesapiio.enabled", havingValue = "true", matchIfMissing = true)
    public ExchangeratesapiIoClient exchangeratesapiioClient(ExchangeratesapiIoProperties properties) {
        return new ExchangeratesapiIoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.exchangeratehost.enabled", havingValue = "true", matchIfMissing = true)
    public ExchangerateHostClient exchangeratehostClient(ExchangerateHostProperties properties) {
        return new ExchangerateHostClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.czechnationalbank.enabled", havingValue = "true", matchIfMissing = true)
    public CzechNationalBankClient czechnationalbankClient(CzechNationalBankProperties properties) {
        return new CzechNationalBankClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.fixer.enabled", havingValue = "true", matchIfMissing = true)
    public FixerClient fixerClient(FixerProperties properties) {
        return new FixerClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.vatcomplycom.enabled", havingValue = "true", matchIfMissing = true)
    public VatcomplyComClient vatcomplycomClient(VatcomplyComProperties properties) {
        return new VatcomplyComClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.amdoren.enabled", havingValue = "true", matchIfMissing = true)
    public AmdorenClient amdorenClient(AmdorenProperties properties) {
        return new AmdorenClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.bankofrussia.enabled", havingValue = "true", matchIfMissing = true)
    public BankOfRussiaClient bankofrussiaClient(BankOfRussiaProperties properties) {
        return new BankOfRussiaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.api1forge.enabled", havingValue = "true", matchIfMissing = true)
    public Api1ForgeClient api1forgeClient(Api1ForgeProperties properties) {
        return new Api1ForgeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.paralelobo.enabled", havingValue = "true", matchIfMissing = true)
    public ParaleloBoClient paraleloboClient(ParaleloBoProperties properties) {
        return new ParaleloBoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.nationalbankofpoland.enabled", havingValue = "true", matchIfMissing = true)
    public NationalBankOfPolandClient nationalbankofpolandClient(NationalBankOfPolandProperties properties) {
        return new NationalBankOfPolandClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.currencyscoop.enabled", havingValue = "true", matchIfMissing = true)
    public CurrencyscoopClient currencyscoopClient(CurrencyscoopProperties properties) {
        return new CurrencyscoopClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.frankfurter.enabled", havingValue = "true", matchIfMissing = true)
    public FrankfurterClient frankfurterClient(FrankfurterProperties properties) {
        return new FrankfurterClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.currencyexchange.economiaawesome.enabled", havingValue = "true", matchIfMissing = true)
    public EconomiaAwesomeClient economiaawesomeClient(EconomiaAwesomeProperties properties) {
        return new EconomiaAwesomeClient(properties.getUrl());
    }

}
