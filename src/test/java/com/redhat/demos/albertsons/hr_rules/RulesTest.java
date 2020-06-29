package com.redhat.demos.albertsons.hr_rules;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Date;

import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.date.HolidayCalendar;
import com.opengamma.strata.basics.date.HolidayCalendarId;
import com.opengamma.strata.basics.date.HolidayCalendarIds;

import org.junit.Test;
import org.kie.api.runtime.KieSession;

public class RulesTest extends RulesBaseTest {

    @Test
    public void RulesTest() {
        KieSession kSession = createSession("stateful-session");
        assertNotNull(kSession);


        // kSession.insert(loan);
        // kSession.insert(loan2);
        // kSession.insert(naturalDisasterEvent);
        int fired = kSession.fireAllRules();

        System.out.println("1st Fire");
        System.out.println("Fired Rules: " + fired);
        System.out.println("Results: ");
        // System.out.println(loan);
        // System.out.println(loan2);
    }

    @Test
    public void holidayTest(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM-dd(EEEE)-YYYY");
        HolidayCalendarId holCalId = HolidayCalendarIds.NYSE;
        HolidayCalendar holCal = holCalId.resolve(ReferenceData.standard());
        System.out.println("Calendar name: " + holCal.getName());

        LocalDate mondayUSMemorialDay = LocalDate.of(2020, 5, 25);
        System.out.println("Day of the week: " + mondayUSMemorialDay.getDayOfWeek());
        System.out.println("Date formated: " + mondayUSMemorialDay.format(dtf));
        LocalDate fridayJuly10 = LocalDate.of(2020, 7, 10);

        BigDecimal pay = new BigDecimal(8.32);
        System.out.println( "8.32 * 1.25 = " + pay.multiply(BigDecimal.valueOf(1.25)).setScale(2, RoundingMode.UP) );

        LocalDate todayPlus6Months = LocalDate.now().plus(6, ChronoUnit.MONTHS);
        System.out.println("Today plus 6 months: " + todayPlus6Months);
        // LocalDate.now().minus(LocalDate.of(2020, 6, 30))
        System.out.println("is after? " + LocalDate.of(2020, 6, 30).isAfter(LocalDate.now().plusDays(2)));
        LocalDateTime todayPlusXHours = LocalDateTime.now().plus(2080, ChronoUnit.HOURS);
        System.out.println("Today plus 2080 hours: " + todayPlusXHours);

        assertNotNull(holCal);

        // is the date a holiday/weekend or a business day
        boolean holiday = holCal.isHoliday(mondayUSMemorialDay);
        System.out.println("is Holiday: " + holiday);        
        boolean busday  = holCal.isBusinessDay(mondayUSMemorialDay);
        System.out.println("is Buzz Day: " + busday);        
            
        // next/previous business day
        // LocalDate nextDay = holCal.next(mondayUSMemorialDay);
        LocalDate nextDay = holCal.nextOrSame(mondayUSMemorialDay);
        System.out.println("next Buzz day: " + nextDay);        
        // LocalDate prevDay = holCal.previous(mondayUSMemorialDay);
        LocalDate prevDay = holCal.previousOrSame(mondayUSMemorialDay);
        System.out.println("Previous Day: " + prevDay);        
            
        // last business day of month
        boolean isLastBusDay   = holCal.isLastBusinessDayOfMonth(mondayUSMemorialDay);
        System.out.println("isLastBusDay: " + isLastBusDay);        
        LocalDate lastBusDay = holCal.lastBusinessDayOfMonth(mondayUSMemorialDay);
        System.out.println("lastBusDay: " + lastBusDay);        
            
        // number of business days
        int days = holCal.daysBetween(mondayUSMemorialDay, fridayJuly10);
        System.out.println("Days between: " + days);        
    }
}