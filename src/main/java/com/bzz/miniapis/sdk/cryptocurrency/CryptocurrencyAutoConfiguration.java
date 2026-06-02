package com.bzz.miniapis.sdk.cryptocurrency;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        BinanceProperties.class,
        BitmexProperties.class,
        Api0XProperties.class,
        BitcambioProperties.class,
        AlphaMosslandProperties.class,
        BitfinexProperties.class,
        BybitProperties.class,
        CoinmarketcapProperties.class,
        CoinlayerProperties.class,
        BittrexProperties.class,
        BlockchainProperties.class,
        CoindcxProperties.class,
        EthplorerProperties.class,
        BlockfrostCardanoProperties.class,
        CoinigyProperties.class,
        CoinloreProperties.class,
        Api1InchProperties.class,
        BtcturkProperties.class,
        GateioProperties.class,
        IndodaxProperties.class,
        HuobiProperties.class,
        CoinstatsProperties.class,
        CoinlibProperties.class,
        MessariProperties.class,
        BraveNewcoinProperties.class,
        CryptingupProperties.class,
        LocalbitcoinsProperties.class,
        ExmoProperties.class,
        MempoolProperties.class,
        CoinpaprikaProperties.class,
        NexchangeProperties.class,
        CoinbaseProperties.class,
        PumpfundataProperties.class,
        CoinapiProperties.class,
        MercadobitcoinProperties.class,
        BlockProperties.class,
        FtxProperties.class,
        CoinrankingProperties.class,
        CryptapiProperties.class,
        KrakenProperties.class,
        WorldcoinindexProperties.class,
        DydxProperties.class,
        GeminiProperties.class,
        InfuraEthereumProperties.class,
        NovadaxProperties.class,
        AlchemyEthereumProperties.class,
        ValrProperties.class,
        KucoinProperties.class,
        TechnicalAnalysisProperties.class,
        SolanaJsonRpcProperties.class,
        CoincapProperties.class,
        CoinbaseProProperties.class,
        ZmokProperties.class,
        CoinremitterProperties.class,
        IcyToolsProperties.class,
        PoloniexProperties.class,
        CryptocompareProperties.class,
        HirakExchangeRatesProperties.class,
        CoingeckoProperties.class
})
public class CryptocurrencyAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.binance.enabled", havingValue = "true", matchIfMissing = true)
    public BinanceClient binanceClient(BinanceProperties properties) {
        return new BinanceClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.bitmex.enabled", havingValue = "true", matchIfMissing = true)
    public BitmexClient bitmexClient(BitmexProperties properties) {
        return new BitmexClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.api0x.enabled", havingValue = "true", matchIfMissing = true)
    public Api0XClient api0xClient(Api0XProperties properties) {
        return new Api0XClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.bitcambio.enabled", havingValue = "true", matchIfMissing = true)
    public BitcambioClient bitcambioClient(BitcambioProperties properties) {
        return new BitcambioClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.alphamossland.enabled", havingValue = "true", matchIfMissing = true)
    public AlphaMosslandClient alphamosslandClient(AlphaMosslandProperties properties) {
        return new AlphaMosslandClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.bitfinex.enabled", havingValue = "true", matchIfMissing = true)
    public BitfinexClient bitfinexClient(BitfinexProperties properties) {
        return new BitfinexClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.bybit.enabled", havingValue = "true", matchIfMissing = true)
    public BybitClient bybitClient(BybitProperties properties) {
        return new BybitClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coinmarketcap.enabled", havingValue = "true", matchIfMissing = true)
    public CoinmarketcapClient coinmarketcapClient(CoinmarketcapProperties properties) {
        return new CoinmarketcapClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coinlayer.enabled", havingValue = "true", matchIfMissing = true)
    public CoinlayerClient coinlayerClient(CoinlayerProperties properties) {
        return new CoinlayerClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.bittrex.enabled", havingValue = "true", matchIfMissing = true)
    public BittrexClient bittrexClient(BittrexProperties properties) {
        return new BittrexClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.blockchain.enabled", havingValue = "true", matchIfMissing = true)
    public BlockchainClient blockchainClient(BlockchainProperties properties) {
        return new BlockchainClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coindcx.enabled", havingValue = "true", matchIfMissing = true)
    public CoindcxClient coindcxClient(CoindcxProperties properties) {
        return new CoindcxClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.ethplorer.enabled", havingValue = "true", matchIfMissing = true)
    public EthplorerClient ethplorerClient(EthplorerProperties properties) {
        return new EthplorerClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.blockfrostcardano.enabled", havingValue = "true", matchIfMissing = true)
    public BlockfrostCardanoClient blockfrostcardanoClient(BlockfrostCardanoProperties properties) {
        return new BlockfrostCardanoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coinigy.enabled", havingValue = "true", matchIfMissing = true)
    public CoinigyClient coinigyClient(CoinigyProperties properties) {
        return new CoinigyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coinlore.enabled", havingValue = "true", matchIfMissing = true)
    public CoinloreClient coinloreClient(CoinloreProperties properties) {
        return new CoinloreClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.api1inch.enabled", havingValue = "true", matchIfMissing = true)
    public Api1InchClient api1inchClient(Api1InchProperties properties) {
        return new Api1InchClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.btcturk.enabled", havingValue = "true", matchIfMissing = true)
    public BtcturkClient btcturkClient(BtcturkProperties properties) {
        return new BtcturkClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.gateio.enabled", havingValue = "true", matchIfMissing = true)
    public GateioClient gateioClient(GateioProperties properties) {
        return new GateioClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.indodax.enabled", havingValue = "true", matchIfMissing = true)
    public IndodaxClient indodaxClient(IndodaxProperties properties) {
        return new IndodaxClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.huobi.enabled", havingValue = "true", matchIfMissing = true)
    public HuobiClient huobiClient(HuobiProperties properties) {
        return new HuobiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coinstats.enabled", havingValue = "true", matchIfMissing = true)
    public CoinstatsClient coinstatsClient(CoinstatsProperties properties) {
        return new CoinstatsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coinlib.enabled", havingValue = "true", matchIfMissing = true)
    public CoinlibClient coinlibClient(CoinlibProperties properties) {
        return new CoinlibClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.messari.enabled", havingValue = "true", matchIfMissing = true)
    public MessariClient messariClient(MessariProperties properties) {
        return new MessariClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.bravenewcoin.enabled", havingValue = "true", matchIfMissing = true)
    public BraveNewcoinClient bravenewcoinClient(BraveNewcoinProperties properties) {
        return new BraveNewcoinClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.cryptingup.enabled", havingValue = "true", matchIfMissing = true)
    public CryptingupClient cryptingupClient(CryptingupProperties properties) {
        return new CryptingupClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.localbitcoins.enabled", havingValue = "true", matchIfMissing = true)
    public LocalbitcoinsClient localbitcoinsClient(LocalbitcoinsProperties properties) {
        return new LocalbitcoinsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.exmo.enabled", havingValue = "true", matchIfMissing = true)
    public ExmoClient exmoClient(ExmoProperties properties) {
        return new ExmoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.mempool.enabled", havingValue = "true", matchIfMissing = true)
    public MempoolClient mempoolClient(MempoolProperties properties) {
        return new MempoolClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coinpaprika.enabled", havingValue = "true", matchIfMissing = true)
    public CoinpaprikaClient coinpaprikaClient(CoinpaprikaProperties properties) {
        return new CoinpaprikaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.nexchange.enabled", havingValue = "true", matchIfMissing = true)
    public NexchangeClient nexchangeClient(NexchangeProperties properties) {
        return new NexchangeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coinbase.enabled", havingValue = "true", matchIfMissing = true)
    public CoinbaseClient coinbaseClient(CoinbaseProperties properties) {
        return new CoinbaseClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.pumpfundata.enabled", havingValue = "true", matchIfMissing = true)
    public PumpfundataClient pumpfundataClient(PumpfundataProperties properties) {
        return new PumpfundataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coinapi.enabled", havingValue = "true", matchIfMissing = true)
    public CoinapiClient coinapiClient(CoinapiProperties properties) {
        return new CoinapiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.mercadobitcoin.enabled", havingValue = "true", matchIfMissing = true)
    public MercadobitcoinClient mercadobitcoinClient(MercadobitcoinProperties properties) {
        return new MercadobitcoinClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.block.enabled", havingValue = "true", matchIfMissing = true)
    public BlockClient blockClient(BlockProperties properties) {
        return new BlockClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.ftx.enabled", havingValue = "true", matchIfMissing = true)
    public FtxClient ftxClient(FtxProperties properties) {
        return new FtxClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coinranking.enabled", havingValue = "true", matchIfMissing = true)
    public CoinrankingClient coinrankingClient(CoinrankingProperties properties) {
        return new CoinrankingClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.cryptapi.enabled", havingValue = "true", matchIfMissing = true)
    public CryptapiClient cryptapiClient(CryptapiProperties properties) {
        return new CryptapiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.kraken.enabled", havingValue = "true", matchIfMissing = true)
    public KrakenClient krakenClient(KrakenProperties properties) {
        return new KrakenClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.worldcoinindex.enabled", havingValue = "true", matchIfMissing = true)
    public WorldcoinindexClient worldcoinindexClient(WorldcoinindexProperties properties) {
        return new WorldcoinindexClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.dydx.enabled", havingValue = "true", matchIfMissing = true)
    public DydxClient dydxClient(DydxProperties properties) {
        return new DydxClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.gemini.enabled", havingValue = "true", matchIfMissing = true)
    public GeminiClient geminiClient(GeminiProperties properties) {
        return new GeminiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.infuraethereum.enabled", havingValue = "true", matchIfMissing = true)
    public InfuraEthereumClient infuraethereumClient(InfuraEthereumProperties properties) {
        return new InfuraEthereumClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.novadax.enabled", havingValue = "true", matchIfMissing = true)
    public NovadaxClient novadaxClient(NovadaxProperties properties) {
        return new NovadaxClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.alchemyethereum.enabled", havingValue = "true", matchIfMissing = true)
    public AlchemyEthereumClient alchemyethereumClient(AlchemyEthereumProperties properties) {
        return new AlchemyEthereumClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.valr.enabled", havingValue = "true", matchIfMissing = true)
    public ValrClient valrClient(ValrProperties properties) {
        return new ValrClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.kucoin.enabled", havingValue = "true", matchIfMissing = true)
    public KucoinClient kucoinClient(KucoinProperties properties) {
        return new KucoinClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.technicalanalysis.enabled", havingValue = "true", matchIfMissing = true)
    public TechnicalAnalysisClient technicalanalysisClient(TechnicalAnalysisProperties properties) {
        return new TechnicalAnalysisClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.solanajsonrpc.enabled", havingValue = "true", matchIfMissing = true)
    public SolanaJsonRpcClient solanajsonrpcClient(SolanaJsonRpcProperties properties) {
        return new SolanaJsonRpcClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coincap.enabled", havingValue = "true", matchIfMissing = true)
    public CoincapClient coincapClient(CoincapProperties properties) {
        return new CoincapClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coinbasepro.enabled", havingValue = "true", matchIfMissing = true)
    public CoinbaseProClient coinbaseproClient(CoinbaseProProperties properties) {
        return new CoinbaseProClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.zmok.enabled", havingValue = "true", matchIfMissing = true)
    public ZmokClient zmokClient(ZmokProperties properties) {
        return new ZmokClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coinremitter.enabled", havingValue = "true", matchIfMissing = true)
    public CoinremitterClient coinremitterClient(CoinremitterProperties properties) {
        return new CoinremitterClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.icytools.enabled", havingValue = "true", matchIfMissing = true)
    public IcyToolsClient icytoolsClient(IcyToolsProperties properties) {
        return new IcyToolsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.poloniex.enabled", havingValue = "true", matchIfMissing = true)
    public PoloniexClient poloniexClient(PoloniexProperties properties) {
        return new PoloniexClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.cryptocompare.enabled", havingValue = "true", matchIfMissing = true)
    public CryptocompareClient cryptocompareClient(CryptocompareProperties properties) {
        return new CryptocompareClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.hirakexchangerates.enabled", havingValue = "true", matchIfMissing = true)
    public HirakExchangeRatesClient hirakexchangeratesClient(HirakExchangeRatesProperties properties) {
        return new HirakExchangeRatesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.cryptocurrency.coingecko.enabled", havingValue = "true", matchIfMissing = true)
    public CoingeckoClient coingeckoClient(CoingeckoProperties properties) {
        return new CoingeckoClient(properties.getUrl());
    }

}
