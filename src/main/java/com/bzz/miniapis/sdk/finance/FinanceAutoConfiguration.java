package com.bzz.miniapis.sdk.finance;

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
        MarketstackProperties.class,
        AletheiaProperties.class,
        AlpacaProperties.class,
        AlphaVantageProperties.class,
        BancoDoBrasilProperties.class,
        BankDataProperties.class,
        BillplzProperties.class,
        BinlistProperties.class,
        BoletoCloudProperties.class,
        CitiProperties.class,
        EcondbProperties.class,
        EconpulseProperties.class,
        FedTreasuryProperties.class,
        FinageProperties.class,
        FinancialModelingPrepProperties.class,
        FinnhubProperties.class,
        FredProperties.class,
        FrontAccountingApisProperties.class,
        HeliumProperties.class,
        HotstoksProperties.class,
        IbanforgeProperties.class,
        IexCloudProperties.class,
        IgProperties.class,
        IndianMutualFundProperties.class,
        IntrinioProperties.class,
        KlarnaProperties.class,
        MercadopagoProperties.class,
        MonoProperties.class,
        MoovProperties.class,
        NordigenProperties.class,
        OpenfigiProperties.class,
        PlaidProperties.class,
        PolygonProperties.class,
        PortfolioOptimizerProperties.class,
        RazorpayIfscProperties.class,
        RealTimeFinanceProperties.class,
        SecEdgarDataProperties.class,
        SmartapiProperties.class,
        StockdataProperties.class,
        StyvioProperties.class,
        TaxDataProperties.class,
        TradierProperties.class,
        TwelveDataProperties.class,
        VatValidationProperties.class,
        WallstreetbetsProperties.class,
        YahooFinanceProperties.class,
        YnabProperties.class,
        ZohoBooksProperties.class
})
public class FinanceAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.marketstack.enabled", havingValue = "true", matchIfMissing = true)
    public MarketstackClient marketstackClient(MarketstackProperties properties) {
        return createClient(MarketstackClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.aletheia.enabled", havingValue = "true", matchIfMissing = true)
    public AletheiaClient aletheiaClient(AletheiaProperties properties) {
        return createClient(AletheiaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.alpaca.enabled", havingValue = "true", matchIfMissing = true)
    public AlpacaClient alpacaClient(AlpacaProperties properties) {
        return createClient(AlpacaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.alphavantage.enabled", havingValue = "true", matchIfMissing = true)
    public AlphaVantageClient alphavantageClient(AlphaVantageProperties properties) {
        return createClient(AlphaVantageClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.bancodobrasil.enabled", havingValue = "true", matchIfMissing = true)
    public BancoDoBrasilClient bancodobrasilClient(BancoDoBrasilProperties properties) {
        return createClient(BancoDoBrasilClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.bankdata.enabled", havingValue = "true", matchIfMissing = true)
    public BankDataClient bankdataClient(BankDataProperties properties) {
        return createClient(BankDataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.billplz.enabled", havingValue = "true", matchIfMissing = true)
    public BillplzClient billplzClient(BillplzProperties properties) {
        return createClient(BillplzClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.binlist.enabled", havingValue = "true", matchIfMissing = true)
    public BinlistClient binlistClient(BinlistProperties properties) {
        return createClient(BinlistClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.boletocloud.enabled", havingValue = "true", matchIfMissing = true)
    public BoletoCloudClient boletocloudClient(BoletoCloudProperties properties) {
        return createClient(BoletoCloudClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.citi.enabled", havingValue = "true", matchIfMissing = true)
    public CitiClient citiClient(CitiProperties properties) {
        return createClient(CitiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.econdb.enabled", havingValue = "true", matchIfMissing = true)
    public EcondbClient econdbClient(EcondbProperties properties) {
        return createClient(EcondbClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.econpulse.enabled", havingValue = "true", matchIfMissing = true)
    public EconpulseClient econpulseClient(EconpulseProperties properties) {
        return createClient(EconpulseClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.fedtreasury.enabled", havingValue = "true", matchIfMissing = true)
    public FedTreasuryClient fedtreasuryClient(FedTreasuryProperties properties) {
        return createClient(FedTreasuryClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.finage.enabled", havingValue = "true", matchIfMissing = true)
    public FinageClient finageClient(FinageProperties properties) {
        return createClient(FinageClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.financialmodelingprep.enabled", havingValue = "true", matchIfMissing = true)
    public FinancialModelingPrepClient financialmodelingprepClient(FinancialModelingPrepProperties properties) {
        return createClient(FinancialModelingPrepClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.finnhub.enabled", havingValue = "true", matchIfMissing = true)
    public FinnhubClient finnhubClient(FinnhubProperties properties) {
        return createClient(FinnhubClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.fred.enabled", havingValue = "true", matchIfMissing = true)
    public FredClient fredClient(FredProperties properties) {
        return createClient(FredClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.frontaccountingapis.enabled", havingValue = "true", matchIfMissing = true)
    public FrontAccountingApisClient frontaccountingapisClient(FrontAccountingApisProperties properties) {
        return createClient(FrontAccountingApisClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.helium.enabled", havingValue = "true", matchIfMissing = true)
    public HeliumClient heliumClient(HeliumProperties properties) {
        return createClient(HeliumClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.hotstoks.enabled", havingValue = "true", matchIfMissing = true)
    public HotstoksClient hotstoksClient(HotstoksProperties properties) {
        return createClient(HotstoksClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.ibanforge.enabled", havingValue = "true", matchIfMissing = true)
    public IbanforgeClient ibanforgeClient(IbanforgeProperties properties) {
        return createClient(IbanforgeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.iexcloud.enabled", havingValue = "true", matchIfMissing = true)
    public IexCloudClient iexcloudClient(IexCloudProperties properties) {
        return createClient(IexCloudClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.ig.enabled", havingValue = "true", matchIfMissing = true)
    public IgClient igClient(IgProperties properties) {
        return createClient(IgClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.indianmutualfund.enabled", havingValue = "true", matchIfMissing = true)
    public IndianMutualFundClient indianmutualfundClient(IndianMutualFundProperties properties) {
        return createClient(IndianMutualFundClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.intrinio.enabled", havingValue = "true", matchIfMissing = true)
    public IntrinioClient intrinioClient(IntrinioProperties properties) {
        return createClient(IntrinioClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.klarna.enabled", havingValue = "true", matchIfMissing = true)
    public KlarnaClient klarnaClient(KlarnaProperties properties) {
        return createClient(KlarnaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.mercadopago.enabled", havingValue = "true", matchIfMissing = true)
    public MercadopagoClient mercadopagoClient(MercadopagoProperties properties) {
        return createClient(MercadopagoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.mono.enabled", havingValue = "true", matchIfMissing = true)
    public MonoClient monoClient(MonoProperties properties) {
        return createClient(MonoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.moov.enabled", havingValue = "true", matchIfMissing = true)
    public MoovClient moovClient(MoovProperties properties) {
        return createClient(MoovClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.nordigen.enabled", havingValue = "true", matchIfMissing = true)
    public NordigenClient nordigenClient(NordigenProperties properties) {
        return createClient(NordigenClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.openfigi.enabled", havingValue = "true", matchIfMissing = true)
    public OpenfigiClient openfigiClient(OpenfigiProperties properties) {
        return createClient(OpenfigiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.plaid.enabled", havingValue = "true", matchIfMissing = true)
    public PlaidClient plaidClient(PlaidProperties properties) {
        return createClient(PlaidClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.polygon.enabled", havingValue = "true", matchIfMissing = true)
    public PolygonClient polygonClient(PolygonProperties properties) {
        return createClient(PolygonClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.portfoliooptimizer.enabled", havingValue = "true", matchIfMissing = true)
    public PortfolioOptimizerClient portfoliooptimizerClient(PortfolioOptimizerProperties properties) {
        return createClient(PortfolioOptimizerClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.razorpayifsc.enabled", havingValue = "true", matchIfMissing = true)
    public RazorpayIfscClient razorpayifscClient(RazorpayIfscProperties properties) {
        return createClient(RazorpayIfscClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.realtimefinance.enabled", havingValue = "true", matchIfMissing = true)
    public RealTimeFinanceClient realtimefinanceClient(RealTimeFinanceProperties properties) {
        return createClient(RealTimeFinanceClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.secedgardata.enabled", havingValue = "true", matchIfMissing = true)
    public SecEdgarDataClient secedgardataClient(SecEdgarDataProperties properties) {
        return createClient(SecEdgarDataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.smartapi.enabled", havingValue = "true", matchIfMissing = true)
    public SmartapiClient smartapiClient(SmartapiProperties properties) {
        return createClient(SmartapiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.stockdata.enabled", havingValue = "true", matchIfMissing = true)
    public StockdataClient stockdataClient(StockdataProperties properties) {
        return createClient(StockdataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.styvio.enabled", havingValue = "true", matchIfMissing = true)
    public StyvioClient styvioClient(StyvioProperties properties) {
        return createClient(StyvioClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.taxdata.enabled", havingValue = "true", matchIfMissing = true)
    public TaxDataClient taxdataClient(TaxDataProperties properties) {
        return createClient(TaxDataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.tradier.enabled", havingValue = "true", matchIfMissing = true)
    public TradierClient tradierClient(TradierProperties properties) {
        return createClient(TradierClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.twelvedata.enabled", havingValue = "true", matchIfMissing = true)
    public TwelveDataClient twelvedataClient(TwelveDataProperties properties) {
        return createClient(TwelveDataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.vatvalidation.enabled", havingValue = "true", matchIfMissing = true)
    public VatValidationClient vatvalidationClient(VatValidationProperties properties) {
        return createClient(VatValidationClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.wallstreetbets.enabled", havingValue = "true", matchIfMissing = true)
    public WallstreetbetsClient wallstreetbetsClient(WallstreetbetsProperties properties) {
        return createClient(WallstreetbetsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.yahoofinance.enabled", havingValue = "true", matchIfMissing = true)
    public YahooFinanceClient yahoofinanceClient(YahooFinanceProperties properties) {
        return createClient(YahooFinanceClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.ynab.enabled", havingValue = "true", matchIfMissing = true)
    public YnabClient ynabClient(YnabProperties properties) {
        return createClient(YnabClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.zohobooks.enabled", havingValue = "true", matchIfMissing = true)
    public ZohoBooksClient zohobooksClient(ZohoBooksProperties properties) {
        return createClient(ZohoBooksClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
