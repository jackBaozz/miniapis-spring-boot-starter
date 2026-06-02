package com.bzz.miniapis.sdk.finance;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        AletheiaProperties.class,
        FinancialModelingPrepProperties.class,
        AlphaVantageProperties.class,
        BinlistProperties.class,
        BillplzProperties.class,
        EcondbProperties.class,
        MarketstackProperties.class,
        IgProperties.class,
        BankDataProperties.class,
        IntrinioProperties.class,
        RealTimeFinanceProperties.class,
        FinageProperties.class,
        HeliumProperties.class,
        RazorpayIfscProperties.class,
        BoletoCloudProperties.class,
        MercadopagoProperties.class,
        HotstoksProperties.class,
        MonoProperties.class,
        TradierProperties.class,
        PortfolioOptimizerProperties.class,
        FedTreasuryProperties.class,
        VatValidationProperties.class,
        KlarnaProperties.class,
        IbanforgeProperties.class,
        MoovProperties.class,
        SmartapiProperties.class,
        TwelveDataProperties.class,
        StockdataProperties.class,
        TaxDataProperties.class,
        AlpacaProperties.class,
        OpenfigiProperties.class,
        EconpulseProperties.class,
        FrontAccountingApisProperties.class,
        IndianMutualFundProperties.class,
        YnabProperties.class,
        StyvioProperties.class,
        ZohoBooksProperties.class,
        PolygonProperties.class,
        WallstreetbetsProperties.class,
        CitiProperties.class,
        PlaidProperties.class,
        BancoDoBrasilProperties.class
})
public class FinanceAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.aletheia.enabled", havingValue = "true", matchIfMissing = true)
    public AletheiaClient aletheiaClient(AletheiaProperties properties) {
        return new AletheiaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.financialmodelingprep.enabled", havingValue = "true", matchIfMissing = true)
    public FinancialModelingPrepClient financialmodelingprepClient(FinancialModelingPrepProperties properties) {
        return new FinancialModelingPrepClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.alphavantage.enabled", havingValue = "true", matchIfMissing = true)
    public AlphaVantageClient alphavantageClient(AlphaVantageProperties properties) {
        return new AlphaVantageClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.binlist.enabled", havingValue = "true", matchIfMissing = true)
    public BinlistClient binlistClient(BinlistProperties properties) {
        return new BinlistClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.billplz.enabled", havingValue = "true", matchIfMissing = true)
    public BillplzClient billplzClient(BillplzProperties properties) {
        return new BillplzClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.econdb.enabled", havingValue = "true", matchIfMissing = true)
    public EcondbClient econdbClient(EcondbProperties properties) {
        return new EcondbClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.marketstack.enabled", havingValue = "true", matchIfMissing = true)
    public MarketstackClient marketstackClient(MarketstackProperties properties) {
        return new MarketstackClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.ig.enabled", havingValue = "true", matchIfMissing = true)
    public IgClient igClient(IgProperties properties) {
        return new IgClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.bankdata.enabled", havingValue = "true", matchIfMissing = true)
    public BankDataClient bankdataClient(BankDataProperties properties) {
        return new BankDataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.intrinio.enabled", havingValue = "true", matchIfMissing = true)
    public IntrinioClient intrinioClient(IntrinioProperties properties) {
        return new IntrinioClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.realtimefinance.enabled", havingValue = "true", matchIfMissing = true)
    public RealTimeFinanceClient realtimefinanceClient(RealTimeFinanceProperties properties) {
        return new RealTimeFinanceClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.finage.enabled", havingValue = "true", matchIfMissing = true)
    public FinageClient finageClient(FinageProperties properties) {
        return new FinageClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.helium.enabled", havingValue = "true", matchIfMissing = true)
    public HeliumClient heliumClient(HeliumProperties properties) {
        return new HeliumClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.razorpayifsc.enabled", havingValue = "true", matchIfMissing = true)
    public RazorpayIfscClient razorpayifscClient(RazorpayIfscProperties properties) {
        return new RazorpayIfscClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.boletocloud.enabled", havingValue = "true", matchIfMissing = true)
    public BoletoCloudClient boletocloudClient(BoletoCloudProperties properties) {
        return new BoletoCloudClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.mercadopago.enabled", havingValue = "true", matchIfMissing = true)
    public MercadopagoClient mercadopagoClient(MercadopagoProperties properties) {
        return new MercadopagoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.hotstoks.enabled", havingValue = "true", matchIfMissing = true)
    public HotstoksClient hotstoksClient(HotstoksProperties properties) {
        return new HotstoksClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.mono.enabled", havingValue = "true", matchIfMissing = true)
    public MonoClient monoClient(MonoProperties properties) {
        return new MonoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.tradier.enabled", havingValue = "true", matchIfMissing = true)
    public TradierClient tradierClient(TradierProperties properties) {
        return new TradierClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.portfoliooptimizer.enabled", havingValue = "true", matchIfMissing = true)
    public PortfolioOptimizerClient portfoliooptimizerClient(PortfolioOptimizerProperties properties) {
        return new PortfolioOptimizerClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.fedtreasury.enabled", havingValue = "true", matchIfMissing = true)
    public FedTreasuryClient fedtreasuryClient(FedTreasuryProperties properties) {
        return new FedTreasuryClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.vatvalidation.enabled", havingValue = "true", matchIfMissing = true)
    public VatValidationClient vatvalidationClient(VatValidationProperties properties) {
        return new VatValidationClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.klarna.enabled", havingValue = "true", matchIfMissing = true)
    public KlarnaClient klarnaClient(KlarnaProperties properties) {
        return new KlarnaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.ibanforge.enabled", havingValue = "true", matchIfMissing = true)
    public IbanforgeClient ibanforgeClient(IbanforgeProperties properties) {
        return new IbanforgeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.moov.enabled", havingValue = "true", matchIfMissing = true)
    public MoovClient moovClient(MoovProperties properties) {
        return new MoovClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.smartapi.enabled", havingValue = "true", matchIfMissing = true)
    public SmartapiClient smartapiClient(SmartapiProperties properties) {
        return new SmartapiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.twelvedata.enabled", havingValue = "true", matchIfMissing = true)
    public TwelveDataClient twelvedataClient(TwelveDataProperties properties) {
        return new TwelveDataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.stockdata.enabled", havingValue = "true", matchIfMissing = true)
    public StockdataClient stockdataClient(StockdataProperties properties) {
        return new StockdataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.taxdata.enabled", havingValue = "true", matchIfMissing = true)
    public TaxDataClient taxdataClient(TaxDataProperties properties) {
        return new TaxDataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.alpaca.enabled", havingValue = "true", matchIfMissing = true)
    public AlpacaClient alpacaClient(AlpacaProperties properties) {
        return new AlpacaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.openfigi.enabled", havingValue = "true", matchIfMissing = true)
    public OpenfigiClient openfigiClient(OpenfigiProperties properties) {
        return new OpenfigiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.econpulse.enabled", havingValue = "true", matchIfMissing = true)
    public EconpulseClient econpulseClient(EconpulseProperties properties) {
        return new EconpulseClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.frontaccountingapis.enabled", havingValue = "true", matchIfMissing = true)
    public FrontAccountingApisClient frontaccountingapisClient(FrontAccountingApisProperties properties) {
        return new FrontAccountingApisClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.indianmutualfund.enabled", havingValue = "true", matchIfMissing = true)
    public IndianMutualFundClient indianmutualfundClient(IndianMutualFundProperties properties) {
        return new IndianMutualFundClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.ynab.enabled", havingValue = "true", matchIfMissing = true)
    public YnabClient ynabClient(YnabProperties properties) {
        return new YnabClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.styvio.enabled", havingValue = "true", matchIfMissing = true)
    public StyvioClient styvioClient(StyvioProperties properties) {
        return new StyvioClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.zohobooks.enabled", havingValue = "true", matchIfMissing = true)
    public ZohoBooksClient zohobooksClient(ZohoBooksProperties properties) {
        return new ZohoBooksClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.polygon.enabled", havingValue = "true", matchIfMissing = true)
    public PolygonClient polygonClient(PolygonProperties properties) {
        return new PolygonClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.wallstreetbets.enabled", havingValue = "true", matchIfMissing = true)
    public WallstreetbetsClient wallstreetbetsClient(WallstreetbetsProperties properties) {
        return new WallstreetbetsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.citi.enabled", havingValue = "true", matchIfMissing = true)
    public CitiClient citiClient(CitiProperties properties) {
        return new CitiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.plaid.enabled", havingValue = "true", matchIfMissing = true)
    public PlaidClient plaidClient(PlaidProperties properties) {
        return new PlaidClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.finance.bancodobrasil.enabled", havingValue = "true", matchIfMissing = true)
    public BancoDoBrasilClient bancodobrasilClient(BancoDoBrasilProperties properties) {
        return new BancoDoBrasilClient(properties.getUrl());
    }

}
