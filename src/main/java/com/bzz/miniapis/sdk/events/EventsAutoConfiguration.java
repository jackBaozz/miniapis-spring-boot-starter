package com.bzz.miniapis.sdk.events;

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
        EventbriteProperties.class,
        SeatgeekProperties.class,
        TicketmasterProperties.class
})
public class EventsAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.events.eventbrite.enabled", havingValue = "true", matchIfMissing = true)
    public EventbriteClient eventbriteClient(EventbriteProperties properties) {
        return createClient(EventbriteClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.events.seatgeek.enabled", havingValue = "true", matchIfMissing = true)
    public SeatgeekClient seatgeekClient(SeatgeekProperties properties) {
        return createClient(SeatgeekClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.events.ticketmaster.enabled", havingValue = "true", matchIfMissing = true)
    public TicketmasterClient ticketmasterClient(TicketmasterProperties properties) {
        return createClient(TicketmasterClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
