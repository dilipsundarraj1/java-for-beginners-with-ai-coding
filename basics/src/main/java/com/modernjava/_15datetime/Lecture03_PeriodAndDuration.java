package com.modernjava._15datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

/**
 * Lecture 03: Period & Duration
 * - Period: comparing dates
 * - Duration: comparing times
 */
public class Lecture03_PeriodAndDuration {
    public static void main(String[] args) {
        // Period example
        LocalDate start = LocalDate.of(2020, 1, 1);
        LocalDate end = LocalDate.of(2025, 9, 29);
        Period period = Period.between(start, end);
        System.out.println("Period: " + period + " (Years: " + period.getYears() + ", Months: " + period.getMonths() + ", Days: " + period.getDays() + ")");

        // Duration example
        LocalTime t1 = LocalTime.of(9, 0);
        LocalTime t2 = LocalTime.of(17, 30);
        Duration duration = Duration.between(t1, t2);
        System.out.println("Duration: " + duration.toHours() + " hours, " + duration.toMinutes() + " minutes");
    }
}

