package com.bzz.miniapis.sdk.cryptocurrency;

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
        CoinlayerProperties.class,
        Api0XProperties.class,
        Api1InchProperties.class,
        AlchemyEthereumProperties.class,
        AlphaMosslandProperties.class,
        BinanceProperties.class,
        BitcambioProperties.class,
        BitfinexProperties.class,
        BitmexProperties.class,
        BittrexProperties.class,
        BlockProperties.class,
        BlockchainProperties.class,
        BlockfrostCardanoProperties.class,
        BraveNewcoinProperties.class,
        BtcturkProperties.class,
        BybitProperties.class,
        CoinapiProperties.class,
        CoinbaseProperties.class,
        CoinbaseProProperties.class,
        CoincapProperties.class,
        CoindcxProperties.class,
        CoingeckoProperties.class,
        CoinigyProperties.class,
        CoinlibProperties.class,
        CoinloreProperties.class,
        CoinmarketcapProperties.class,
        CoinpaprikaProperties.class,
        CoinrankingProperties.class,
        CoinremitterProperties.class,
        CoinstatsProperties.class,
        CryptapiProperties.class,
        CryptingupProperties.class,
        CryptocompareProperties.class,
        DydxProperties.class,
        EthplorerProperties.class,
        ExmoProperties.class,
        FtxProperties.class,
        GateioProperties.class,
        GeminiProperties.class,
        HirakExchangeRatesProperties.class,
        HuobiProperties.class,
        IcyToolsProperties.class,
        IndodaxProperties.class,
        InfuraEthereumProperties.class,
        KrakenProperties.class,
        KucoinProperties.class,
        LocalbitcoinsProperties.class,
        MempoolProperties.class,
        MercadobitcoinProperties.class,
        MessariProperties.class,
        NexchangeProperties.class,
        NovadaxProperties.class,
        PoloniexProperties.class,
        PumpfundataProperties.class,
        SolanaJsonRpcProperties.class,
        TechnicalAnalysisProperties.class,
        ValrProperties.class,
        WorldcoinindexProperties.class,
        ZmokProperties.class
})
public class CryptocurrencyAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coinlayer.enabled", havingValue = "true", matchIfMissing = true)
    public CoinlayerClient coinlayerClient(CoinlayerProperties properties) {
        return createClient(CoinlayerClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.api0x.enabled", havingValue = "true", matchIfMissing = true)
    public Api0XClient api0xClient(Api0XProperties properties) {
        return createClient(Api0XClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.api1inch.enabled", havingValue = "true", matchIfMissing = true)
    public Api1InchClient api1inchClient(Api1InchProperties properties) {
        return createClient(Api1InchClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.alchemyethereum.enabled", havingValue = "true", matchIfMissing = true)
    public AlchemyEthereumClient alchemyethereumClient(AlchemyEthereumProperties properties) {
        return createClient(AlchemyEthereumClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.alphamossland.enabled", havingValue = "true", matchIfMissing = true)
    public AlphaMosslandClient alphamosslandClient(AlphaMosslandProperties properties) {
        return createClient(AlphaMosslandClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.binance.enabled", havingValue = "true", matchIfMissing = true)
    public BinanceClient binanceClient(BinanceProperties properties) {
        return createClient(BinanceClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.bitcambio.enabled", havingValue = "true", matchIfMissing = true)
    public BitcambioClient bitcambioClient(BitcambioProperties properties) {
        return createClient(BitcambioClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.bitfinex.enabled", havingValue = "true", matchIfMissing = true)
    public BitfinexClient bitfinexClient(BitfinexProperties properties) {
        return createClient(BitfinexClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.bitmex.enabled", havingValue = "true", matchIfMissing = true)
    public BitmexClient bitmexClient(BitmexProperties properties) {
        return createClient(BitmexClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.bittrex.enabled", havingValue = "true", matchIfMissing = true)
    public BittrexClient bittrexClient(BittrexProperties properties) {
        return createClient(BittrexClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.block.enabled", havingValue = "true", matchIfMissing = true)
    public BlockClient blockClient(BlockProperties properties) {
        return createClient(BlockClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.blockchain.enabled", havingValue = "true", matchIfMissing = true)
    public BlockchainClient blockchainClient(BlockchainProperties properties) {
        return createClient(BlockchainClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.blockfrostcardano.enabled", havingValue = "true", matchIfMissing = true)
    public BlockfrostCardanoClient blockfrostcardanoClient(BlockfrostCardanoProperties properties) {
        return createClient(BlockfrostCardanoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.bravenewcoin.enabled", havingValue = "true", matchIfMissing = true)
    public BraveNewcoinClient bravenewcoinClient(BraveNewcoinProperties properties) {
        return createClient(BraveNewcoinClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.btcturk.enabled", havingValue = "true", matchIfMissing = true)
    public BtcturkClient btcturkClient(BtcturkProperties properties) {
        return createClient(BtcturkClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.bybit.enabled", havingValue = "true", matchIfMissing = true)
    public BybitClient bybitClient(BybitProperties properties) {
        return createClient(BybitClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coinapi.enabled", havingValue = "true", matchIfMissing = true)
    public CoinapiClient coinapiClient(CoinapiProperties properties) {
        return createClient(CoinapiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coinbase.enabled", havingValue = "true", matchIfMissing = true)
    public CoinbaseClient coinbaseClient(CoinbaseProperties properties) {
        return createClient(CoinbaseClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coinbasepro.enabled", havingValue = "true", matchIfMissing = true)
    public CoinbaseProClient coinbaseproClient(CoinbaseProProperties properties) {
        return createClient(CoinbaseProClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coincap.enabled", havingValue = "true", matchIfMissing = true)
    public CoincapClient coincapClient(CoincapProperties properties) {
        return createClient(CoincapClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coindcx.enabled", havingValue = "true", matchIfMissing = true)
    public CoindcxClient coindcxClient(CoindcxProperties properties) {
        return createClient(CoindcxClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coingecko.enabled", havingValue = "true", matchIfMissing = true)
    public CoingeckoClient coingeckoClient(CoingeckoProperties properties) {
        return createClient(CoingeckoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coinigy.enabled", havingValue = "true", matchIfMissing = true)
    public CoinigyClient coinigyClient(CoinigyProperties properties) {
        return createClient(CoinigyClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coinlib.enabled", havingValue = "true", matchIfMissing = true)
    public CoinlibClient coinlibClient(CoinlibProperties properties) {
        return createClient(CoinlibClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coinlore.enabled", havingValue = "true", matchIfMissing = true)
    public CoinloreClient coinloreClient(CoinloreProperties properties) {
        return createClient(CoinloreClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coinmarketcap.enabled", havingValue = "true", matchIfMissing = true)
    public CoinmarketcapClient coinmarketcapClient(CoinmarketcapProperties properties) {
        return createClient(CoinmarketcapClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coinpaprika.enabled", havingValue = "true", matchIfMissing = true)
    public CoinpaprikaClient coinpaprikaClient(CoinpaprikaProperties properties) {
        return createClient(CoinpaprikaClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coinranking.enabled", havingValue = "true", matchIfMissing = true)
    public CoinrankingClient coinrankingClient(CoinrankingProperties properties) {
        return createClient(CoinrankingClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coinremitter.enabled", havingValue = "true", matchIfMissing = true)
    public CoinremitterClient coinremitterClient(CoinremitterProperties properties) {
        return createClient(CoinremitterClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coinstats.enabled", havingValue = "true", matchIfMissing = true)
    public CoinstatsClient coinstatsClient(CoinstatsProperties properties) {
        return createClient(CoinstatsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.cryptapi.enabled", havingValue = "true", matchIfMissing = true)
    public CryptapiClient cryptapiClient(CryptapiProperties properties) {
        return createClient(CryptapiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.cryptingup.enabled", havingValue = "true", matchIfMissing = true)
    public CryptingupClient cryptingupClient(CryptingupProperties properties) {
        return createClient(CryptingupClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.cryptocompare.enabled", havingValue = "true", matchIfMissing = true)
    public CryptocompareClient cryptocompareClient(CryptocompareProperties properties) {
        return createClient(CryptocompareClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.dydx.enabled", havingValue = "true", matchIfMissing = true)
    public DydxClient dydxClient(DydxProperties properties) {
        return createClient(DydxClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.ethplorer.enabled", havingValue = "true", matchIfMissing = true)
    public EthplorerClient ethplorerClient(EthplorerProperties properties) {
        return createClient(EthplorerClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.exmo.enabled", havingValue = "true", matchIfMissing = true)
    public ExmoClient exmoClient(ExmoProperties properties) {
        return createClient(ExmoClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.ftx.enabled", havingValue = "true", matchIfMissing = true)
    public FtxClient ftxClient(FtxProperties properties) {
        return createClient(FtxClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.gateio.enabled", havingValue = "true", matchIfMissing = true)
    public GateioClient gateioClient(GateioProperties properties) {
        return createClient(GateioClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.gemini.enabled", havingValue = "true", matchIfMissing = true)
    public GeminiClient geminiClient(GeminiProperties properties) {
        return createClient(GeminiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.hirakexchangerates.enabled", havingValue = "true", matchIfMissing = true)
    public HirakExchangeRatesClient hirakexchangeratesClient(HirakExchangeRatesProperties properties) {
        return createClient(HirakExchangeRatesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.huobi.enabled", havingValue = "true", matchIfMissing = true)
    public HuobiClient huobiClient(HuobiProperties properties) {
        return createClient(HuobiClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.icytools.enabled", havingValue = "true", matchIfMissing = true)
    public IcyToolsClient icytoolsClient(IcyToolsProperties properties) {
        return createClient(IcyToolsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.indodax.enabled", havingValue = "true", matchIfMissing = true)
    public IndodaxClient indodaxClient(IndodaxProperties properties) {
        return createClient(IndodaxClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.infuraethereum.enabled", havingValue = "true", matchIfMissing = true)
    public InfuraEthereumClient infuraethereumClient(InfuraEthereumProperties properties) {
        return createClient(InfuraEthereumClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.kraken.enabled", havingValue = "true", matchIfMissing = true)
    public KrakenClient krakenClient(KrakenProperties properties) {
        return createClient(KrakenClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.kucoin.enabled", havingValue = "true", matchIfMissing = true)
    public KucoinClient kucoinClient(KucoinProperties properties) {
        return createClient(KucoinClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.localbitcoins.enabled", havingValue = "true", matchIfMissing = true)
    public LocalbitcoinsClient localbitcoinsClient(LocalbitcoinsProperties properties) {
        return createClient(LocalbitcoinsClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.mempool.enabled", havingValue = "true", matchIfMissing = true)
    public MempoolClient mempoolClient(MempoolProperties properties) {
        return createClient(MempoolClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.mercadobitcoin.enabled", havingValue = "true", matchIfMissing = true)
    public MercadobitcoinClient mercadobitcoinClient(MercadobitcoinProperties properties) {
        return createClient(MercadobitcoinClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.messari.enabled", havingValue = "true", matchIfMissing = true)
    public MessariClient messariClient(MessariProperties properties) {
        return createClient(MessariClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.nexchange.enabled", havingValue = "true", matchIfMissing = true)
    public NexchangeClient nexchangeClient(NexchangeProperties properties) {
        return createClient(NexchangeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.novadax.enabled", havingValue = "true", matchIfMissing = true)
    public NovadaxClient novadaxClient(NovadaxProperties properties) {
        return createClient(NovadaxClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.poloniex.enabled", havingValue = "true", matchIfMissing = true)
    public PoloniexClient poloniexClient(PoloniexProperties properties) {
        return createClient(PoloniexClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.pumpfundata.enabled", havingValue = "true", matchIfMissing = true)
    public PumpfundataClient pumpfundataClient(PumpfundataProperties properties) {
        return createClient(PumpfundataClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.solanajsonrpc.enabled", havingValue = "true", matchIfMissing = true)
    public SolanaJsonRpcClient solanajsonrpcClient(SolanaJsonRpcProperties properties) {
        return createClient(SolanaJsonRpcClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.technicalanalysis.enabled", havingValue = "true", matchIfMissing = true)
    public TechnicalAnalysisClient technicalanalysisClient(TechnicalAnalysisProperties properties) {
        return createClient(TechnicalAnalysisClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.valr.enabled", havingValue = "true", matchIfMissing = true)
    public ValrClient valrClient(ValrProperties properties) {
        return createClient(ValrClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.worldcoinindex.enabled", havingValue = "true", matchIfMissing = true)
    public WorldcoinindexClient worldcoinindexClient(WorldcoinindexProperties properties) {
        return createClient(WorldcoinindexClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.zmok.enabled", havingValue = "true", matchIfMissing = true)
    public ZmokClient zmokClient(ZmokProperties properties) {
        return createClient(ZmokClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
