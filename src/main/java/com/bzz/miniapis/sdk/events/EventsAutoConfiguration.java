package com.bzz.miniapis.sdk.events;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
        return new EventbriteClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.events.seatgeek.enabled", havingValue = "true", matchIfMissing = true)
    public SeatgeekClient seatgeekClient(SeatgeekProperties properties) {
        return new SeatgeekClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.events.ticketmaster.enabled", havingValue = "true", matchIfMissing = true)
    public TicketmasterClient ticketmasterClient(TicketmasterProperties properties) {
        return new TicketmasterClient(properties.getUrl());
    }

}
