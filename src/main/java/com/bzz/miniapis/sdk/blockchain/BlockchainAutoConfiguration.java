package com.bzz.miniapis.sdk.blockchain;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        EtherscanProperties.class,
        SteemProperties.class,
        TheGraphProperties.class,
        WatchdataProperties.class,
        ChainpointProperties.class,
        NownodesProperties.class,
        ChainlinkProperties.class,
        HeliumProperties.class,
        BitqueryProperties.class,
        CovalentProperties.class
})
public class BlockchainAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.blockchain.etherscan.enabled", havingValue = "true", matchIfMissing = true)
    public EtherscanClient etherscanClient(EtherscanProperties properties) {
        return new EtherscanClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.blockchain.steem.enabled", havingValue = "true", matchIfMissing = true)
    public SteemClient steemClient(SteemProperties properties) {
        return new SteemClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.blockchain.thegraph.enabled", havingValue = "true", matchIfMissing = true)
    public TheGraphClient thegraphClient(TheGraphProperties properties) {
        return new TheGraphClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.blockchain.watchdata.enabled", havingValue = "true", matchIfMissing = true)
    public WatchdataClient watchdataClient(WatchdataProperties properties) {
        return new WatchdataClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.blockchain.chainpoint.enabled", havingValue = "true", matchIfMissing = true)
    public ChainpointClient chainpointClient(ChainpointProperties properties) {
        return new ChainpointClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.blockchain.nownodes.enabled", havingValue = "true", matchIfMissing = true)
    public NownodesClient nownodesClient(NownodesProperties properties) {
        return new NownodesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.blockchain.chainlink.enabled", havingValue = "true", matchIfMissing = true)
    public ChainlinkClient chainlinkClient(ChainlinkProperties properties) {
        return new ChainlinkClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.blockchain.helium.enabled", havingValue = "true", matchIfMissing = true)
    public HeliumClient heliumClient(HeliumProperties properties) {
        return new HeliumClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.blockchain.bitquery.enabled", havingValue = "true", matchIfMissing = true)
    public BitqueryClient bitqueryClient(BitqueryProperties properties) {
        return new BitqueryClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.blockchain.covalent.enabled", havingValue = "true", matchIfMissing = true)
    public CovalentClient covalentClient(CovalentProperties properties) {
        return new CovalentClient(properties.getUrl());
    }

}
