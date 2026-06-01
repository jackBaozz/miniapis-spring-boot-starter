package com.bzz.miniapis.sdk.blockchain;

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
        BitqueryProperties.class,
        ChainlinkProperties.class,
        ChainpointProperties.class,
        CovalentProperties.class,
        EtherscanProperties.class,
        HeliumProperties.class,
        NownodesProperties.class,
        SteemProperties.class,
        TheGraphProperties.class,
        WalltimeProperties.class,
        WatchdataProperties.class
})
public class BlockchainAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.blockchain.bitquery.enabled", havingValue = "true", matchIfMissing = true)
    public BitqueryClient bitqueryClient(BitqueryProperties properties) {
        return createClient(BitqueryClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.blockchain.chainlink.enabled", havingValue = "true", matchIfMissing = true)
    public ChainlinkClient chainlinkClient(ChainlinkProperties properties) {
        return createClient(ChainlinkClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.blockchain.chainpoint.enabled", havingValue = "true", matchIfMissing = true)
    public ChainpointClient chainpointClient(ChainpointProperties properties) {
        return createClient(ChainpointClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.blockchain.covalent.enabled", havingValue = "true", matchIfMissing = true)
    public CovalentClient covalentClient(CovalentProperties properties) {
        return createClient(CovalentClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.blockchain.etherscan.enabled", havingValue = "true", matchIfMissing = true)
    public EtherscanClient etherscanClient(EtherscanProperties properties) {
        return createClient(EtherscanClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.blockchain.helium.enabled", havingValue = "true", matchIfMissing = true)
    public HeliumClient heliumClient(HeliumProperties properties) {
        return createClient(HeliumClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.blockchain.nownodes.enabled", havingValue = "true", matchIfMissing = true)
    public NownodesClient nownodesClient(NownodesProperties properties) {
        return createClient(NownodesClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.blockchain.steem.enabled", havingValue = "true", matchIfMissing = true)
    public SteemClient steemClient(SteemProperties properties) {
        return createClient(SteemClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.blockchain.thegraph.enabled", havingValue = "true", matchIfMissing = true)
    public TheGraphClient thegraphClient(TheGraphProperties properties) {
        return createClient(TheGraphClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.blockchain.walltime.enabled", havingValue = "true", matchIfMissing = true)
    public WalltimeClient walltimeClient(WalltimeProperties properties) {
        return createClient(WalltimeClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.blockchain.watchdata.enabled", havingValue = "true", matchIfMissing = true)
    public WatchdataClient watchdataClient(WatchdataProperties properties) {
        return createClient(WatchdataClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
