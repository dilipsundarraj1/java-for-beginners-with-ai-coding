package com.modernjava._15datetime;

import com.modernjava.domain.ticketapp.MovieWithLocalDate;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * Lecture 01: Introduction & LocalDate
 * - Overview of java.time
 * - LocalDate creation, retrieval, modification
 */
public class _1LocalDate {

    public static void main(String[] args) {
        // Demonstrate LocalDate creation
        createLocalDateExamples();

        // Compare today with a specific date
        compareWithToday(LocalDate.of(2025, 9, 29));

        // Demonstrate retrieving values from LocalDate
        System.out.println("\nRetrieving values from today's date:");
        printLocalDateValues(LocalDate.now());

        // Demonstrate leap year and length functions
        System.out.println("\nLeap year and length info for today's date:");
        printLeapYearAndLengths(LocalDate.now());

        // Demonstrate modifying LocalDate
        System.out.println("\nModifying today's date:");
        modifyLocalDateExamples(LocalDate.now());

        // Demonstrate MovieWithLocalDate creation
        System.out.println("\nCreating sample movies:");
        createMovieWithLocalDateExamples();
    }

    /**
     * Returns the LocalDate for the given zoneId string.
     *
     * @param zoneId the time zone ID (e.g., "Asia/Kolkata", "America/New_York")
     * @return LocalDate in the specified time zone
     */
    public static LocalDate getLocalDateForZone(String zoneId) {
        return LocalDate.now(java.time.ZoneId.of(zoneId));
    }

    /**
     * Compares two LocalDate objects and returns true if the first date is after the second date.
     *
     * @param date1 the first LocalDate
     * @param date2 the second LocalDate
     * @return true if date1 is after date2, false otherwise
     */
    public static boolean isAfter(LocalDate date1, LocalDate date2) {
        return date1.isAfter(date2);
    }

    /**
     * Demonstrates all possible ways of retrieving values from a LocalDate.
     * Prints year, month, day, day of week, day of year, month value, etc.
     * @param date the LocalDate to extract values from
     */
    public static void printLocalDateValues(LocalDate date) {
        System.out.println("Year: " + date.getYear());
        System.out.println("Month (enum): " + date.getMonth());
        System.out.println("Month (number): " + date.getMonthValue());
        System.out.println("Day of Month: " + date.getDayOfMonth());
        System.out.println("Day of Week: " + date.getDayOfWeek());
        System.out.println("Day of Year: " + date.getDayOfYear());
    }

    /**
     * Compares the current date with a given LocalDate and prints the results.
     * @param otherDate the LocalDate to compare with today
     */
    public static void compareWithToday(LocalDate otherDate) {
        boolean isBeforeResult = LocalDate.now().isBefore(otherDate);
        boolean isAfterResult = LocalDate.now().isAfter(otherDate);
        boolean isEqualResult = LocalDate.now().isEqual(otherDate);
        System.out.println("Is today before " + otherDate + "? " + isBeforeResult);
        System.out.println("Is today after " + otherDate + "? " + isAfterResult);
        System.out.println("Is today equal to " + otherDate + "? " + isEqualResult);
    }

    /**
     * Prints leap year status and length of month/year for the given LocalDate.
     * @param date the LocalDate to check
     */
    public static void printLeapYearAndLengths(LocalDate date) {
        System.out.println("Is Leap Year: " + date.isLeapYear());
        System.out.println("Length of Month: " + date.lengthOfMonth());
        System.out.println("Length of Year: " + date.lengthOfYear());
    }

    /**
     * Demonstrates different ways of modifying a LocalDate.
     * Shows plus, minus, and with methods for days, weeks, months, years, and specific fields.
     * @param date the LocalDate to modify
     */
    public static void modifyLocalDateExamples(LocalDate date) {
        System.out.println("Original date: " + date);
        System.out.println("Plus 5 days: " + date.plusDays(5));
        System.out.println("Minus 2 weeks: " + date.minusWeeks(2));
        System.out.println("Plus 3 months: " + date.plusMonths(3));
        System.out.println("Minus 1 year: " + date.minusYears(1));
        System.out.println("With day of month 1: " + date.withDayOfMonth(1));
        System.out.println("With month December: " + date.withMonth(12));
        System.out.println("With year 2000: " + date.withYear(2000));
        // Additional with functions
        System.out.println("With day of year 100: " + date.withDayOfYear(100));
        System.out.println("With first day of next month: " + date.with(date.plusMonths(1).withDayOfMonth(1)));
        System.out.println("With first day of year: " + date.withDayOfYear(1));

        // Using TemporalAdjusters
        System.out.println("With next Sunday: " + date.with(TemporalAdjusters.next(java.time.DayOfWeek.SUNDAY)));
        System.out.println("With previous Monday: " + date.with(TemporalAdjusters.previous(java.time.DayOfWeek.MONDAY)));
        System.out.println("With first day of month: " + date.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println("With last day of month: " + date.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println("With first day of next year: " + date.with(TemporalAdjusters.firstDayOfNextYear()));

    }

    /**
     * Demonstrates creation of LocalDate for today and a specific date.
     */
    public static void createLocalDateExamples() {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        LocalDate independenceDay = LocalDate.of(1947, 8, 15);
        System.out.println("Independence Day: " + independenceDay);

        var parsedDate = LocalDate.parse("2025-09-29");
        System.out.println("parsedDate: " + parsedDate);
    }

    /**
     * Demonstrates creation of MovieWithLocalDate instances.
     */
    public static void createMovieWithLocalDateExamples() {
        // Example movies (assuming MovieGenre is an enum in your project)
        var movie1 = new MovieWithLocalDate(
                "Inception", 148, com.modernjava.domain.MovieGenre.SCI_FI, 8.8, 2010, "Christopher Nolan", true, LocalDate.of(2010, 7, 16));
        var movie2 = new MovieWithLocalDate(
                "The Godfather", 175, com.modernjava.domain.MovieGenre.DRAMA, 9.2, 1972, "Francis Ford Coppola", false, LocalDate.of(1972, 3, 24));
        var movie3 = new MovieWithLocalDate(
                "Interstellar", 169, com.modernjava.domain.MovieGenre.SCI_FI, 8.6, 2014, "Christopher Nolan", true, LocalDate.of(2014, 11, 7));
        System.out.println("Movie 1: " + movie1);
        System.out.println("Movie 2: " + movie2);
        System.out.println("Movie 3: " + movie3);
    }


}