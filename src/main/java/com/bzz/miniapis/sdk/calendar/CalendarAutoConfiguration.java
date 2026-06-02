package com.bzz.miniapis.sdk.calendar;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        NonWorkingDaysProperties.class,
        RussianCalendarProperties.class,
        NagerDateProperties.class,
        UkBankHolidaysProperties.class,
        CalendarificProperties.class,
        CzechNamedaysCalendarProperties.class,
        HolidaysProperties.class,
        GoogleCalendarProperties.class,
        NamedaysCalendarProperties.class,
        PublicHolidaysProperties.class,
        HebrewCalendarProperties.class,
        CheckidayNationalHolidayProperties.class,
        LectserveProperties.class,
        NonWorkingDays2Properties.class
})
public class CalendarAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.nonworkingdays.enabled", havingValue = "true", matchIfMissing = true)
    public NonWorkingDaysClient nonworkingdaysClient(NonWorkingDaysProperties properties) {
        return new NonWorkingDaysClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.russiancalendar.enabled", havingValue = "true", matchIfMissing = true)
    public RussianCalendarClient russiancalendarClient(RussianCalendarProperties properties) {
        return new RussianCalendarClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.nagerdate.enabled", havingValue = "true", matchIfMissing = true)
    public NagerDateClient nagerdateClient(NagerDateProperties properties) {
        return new NagerDateClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.ukbankholidays.enabled", havingValue = "true", matchIfMissing = true)
    public UkBankHolidaysClient ukbankholidaysClient(UkBankHolidaysProperties properties) {
        return new UkBankHolidaysClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.calendarific.enabled", havingValue = "true", matchIfMissing = true)
    public CalendarificClient calendarificClient(CalendarificProperties properties) {
        return new CalendarificClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.czechnamedayscalendar.enabled", havingValue = "true", matchIfMissing = true)
    public CzechNamedaysCalendarClient czechnamedayscalendarClient(CzechNamedaysCalendarProperties properties) {
        return new CzechNamedaysCalendarClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.holidays.enabled", havingValue = "true", matchIfMissing = true)
    public HolidaysClient holidaysClient(HolidaysProperties properties) {
        return new HolidaysClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.googlecalendar.enabled", havingValue = "true", matchIfMissing = true)
    public GoogleCalendarClient googlecalendarClient(GoogleCalendarProperties properties) {
        return new GoogleCalendarClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.namedayscalendar.enabled", havingValue = "true", matchIfMissing = true)
    public NamedaysCalendarClient namedayscalendarClient(NamedaysCalendarProperties properties) {
        return new NamedaysCalendarClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.publicholidays.enabled", havingValue = "true", matchIfMissing = true)
    public PublicHolidaysClient publicholidaysClient(PublicHolidaysProperties properties) {
        return new PublicHolidaysClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.hebrewcalendar.enabled", havingValue = "true", matchIfMissing = true)
    public HebrewCalendarClient hebrewcalendarClient(HebrewCalendarProperties properties) {
        return new HebrewCalendarClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.checkidaynationalholiday.enabled", havingValue = "true", matchIfMissing = true)
    public CheckidayNationalHolidayClient checkidaynationalholidayClient(CheckidayNationalHolidayProperties properties) {
        return new CheckidayNationalHolidayClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.lectserve.enabled", havingValue = "true", matchIfMissing = true)
    public LectserveClient lectserveClient(LectserveProperties properties) {
        return new LectserveClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.calendar.nonworkingdays2.enabled", havingValue = "true", matchIfMissing = true)
    public NonWorkingDays2Client nonworkingdays2Client(NonWorkingDays2Properties properties) {
        return new NonWorkingDays2Client(properties.getUrl());
    }

}
