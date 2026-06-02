package com.bzz.miniapis.sdk.calendar;

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
        CalendarificProperties.class,
        CheckidayNationalHolidayProperties.class,
        CzechNamedaysCalendarProperties.class,
        GoogleCalendarProperties.class,
        HebrewCalendarProperties.class,
        HolidaysProperties.class,
        LectserveProperties.class,
        NagerDateProperties.class,
        NamedaysCalendarProperties.class,
        NonWorkingDaysProperties.class,
        NonWorkingDaysProperties.class,
        PublicHolidaysProperties.class,
        RussianCalendarProperties.class,
        UkBankHolidaysProperties.class
})
public class CalendarAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.calendarific.enabled", havingValue = "true", matchIfMissing = true)
    public CalendarificClient calendarificClient(CalendarificProperties properties) {
        return createClient(CalendarificClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.checkidaynationalholiday.enabled", havingValue = "true", matchIfMissing = true)
    public CheckidayNationalHolidayClient checkidaynationalholidayClient(CheckidayNationalHolidayProperties properties) {
        return createClient(CheckidayNationalHolidayClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.czechnamedayscalendar.enabled", havingValue = "true", matchIfMissing = true)
    public CzechNamedaysCalendarClient czechnamedayscalendarClient(CzechNamedaysCalendarProperties properties) {
        return createClient(CzechNamedaysCalendarClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.googlecalendar.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleCalendarClient googlecalendarClient(GoogleCalendarProperties properties) {
        return createClient(GoogleCalendarClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.hebrewcalendar.enabled", havingValue = "true", matchIfMissing = true)
    public HebrewCalendarClient hebrewcalendarClient(HebrewCalendarProperties properties) {
        return createClient(HebrewCalendarClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.holidays.enabled", havingValue = "true", matchIfMissing = true)
    public HolidaysClient holidaysClient(HolidaysProperties properties) {
        return createClient(HolidaysClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.lectserve.enabled", havingValue = "true", matchIfMissing = true)
    public LectserveClient lectserveClient(LectserveProperties properties) {
        return createClient(LectserveClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.nagerdate.enabled", havingValue = "true", matchIfMissing = true)
    public NagerDateClient nagerdateClient(NagerDateProperties properties) {
        return createClient(NagerDateClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.namedayscalendar.enabled", havingValue = "true", matchIfMissing = true)
    public NamedaysCalendarClient namedayscalendarClient(NamedaysCalendarProperties properties) {
        return createClient(NamedaysCalendarClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.nonworkingdays.enabled", havingValue = "true", matchIfMissing = true)
    public NonWorkingDaysClient nonworkingdaysClient(NonWorkingDaysProperties properties) {
        return createClient(NonWorkingDaysClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.nonworkingdays2.enabled", havingValue = "true", matchIfMissing = true)
    public NonWorkingDaysClient nonworkingdays2Client(NonWorkingDaysProperties properties) {
        return createClient(NonWorkingDaysClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.publicholidays.enabled", havingValue = "true", matchIfMissing = true)
    public PublicHolidaysClient publicholidaysClient(PublicHolidaysProperties properties) {
        return createClient(PublicHolidaysClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.russiancalendar.enabled", havingValue = "true", matchIfMissing = true)
    public RussianCalendarClient russiancalendarClient(RussianCalendarProperties properties) {
        return createClient(RussianCalendarClient.class, properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.ukbankholidays.enabled", havingValue = "true", matchIfMissing = true)
    public UkBankHolidaysClient ukbankholidaysClient(UkBankHolidaysProperties properties) {
        return createClient(UkBankHolidaysClient.class, properties.getUrl());
    }

    private <T> T createClient(Class<T> clientClass, String baseUrl) {
        RestClient restClient = RestClient.builder().baseUrl(baseUrl).build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(clientClass);
    }
}
