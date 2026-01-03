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

    static void main(String[] args) {
        // Demonstrate LocalDate creation
        createLocalDateExamples();

        // Demonstrate MovieWithLocalDate creation
        System.out.println("\nCreating sample movies:");
        createMovieWithLocalDateExamples();

        // Demonstrate retrieving values from LocalDate
        System.out.println("\nRetrieving values from today's date:");
        printLocalDateValues(LocalDate.now());

        // Compare today with a specific date
        compareWithToday(LocalDate.of(2025, 9, 29));

        // Demonstrate leap year and length functions
        System.out.println("\nLeap year and length info for today's date:");
        printLeapYearAndLengths(LocalDate.now());

        // Demonstrate modifying LocalDate
        System.out.println("\nModifying today's date:");
        modifyLocalDateExamples(LocalDate.now());


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
        // Get the year from the LocalDate and print it
        System.out.println("Year: " + date.getYear());
        // Get the month as an enum value and print it
        System.out.println("Month (enum): " + date.getMonth());
        // Get the month as a numeric value (1-12) and print it
        System.out.println("Month (number): " + date.getMonthValue());
        // Get the day of the month and print it
        System.out.println("Day of Month: " + date.getDayOfMonth());
        // Get the day of the week and print it
        System.out.println("Day of Week: " + date.getDayOfWeek());
        // Get the day of the year (1-365/366) and print it
        System.out.println("Day of Year: " + date.getDayOfYear());
    }

    /**
     * Compares the current date with a given LocalDate and prints the results.
     * @param otherDate the LocalDate to compare with today
     */
    public static void compareWithToday(LocalDate otherDate) {
        // Check if today is before the other date, store it in a variable, and print it
        boolean isBeforeResult = LocalDate.now().isBefore(otherDate);
        System.out.println("Is today before " + otherDate + "? " + isBeforeResult);

        // Check if today is after the other date, store it in a variable, and print it
        boolean isAfterResult = LocalDate.now().isAfter(otherDate);
        System.out.println("Is today after " + otherDate + "? " + isAfterResult);

        // Check if today is equal to the other date, store it in a variable, and print it
        boolean isEqualResult = LocalDate.now().isEqual(otherDate);
        System.out.println("Is today equal to " + otherDate + "? " + isEqualResult);
    }

    /**
     * Prints leap year status and length of month/year for the given LocalDate.
     * @param date the LocalDate to check
     */
    public static void printLeapYearAndLengths(LocalDate date) {
        // Check if the year is a leap year, store it in a variable, and print it
        boolean isLeapYear = date.isLeapYear();
        System.out.println("Is Leap Year: " + isLeapYear);

        // Get the number of days in the month, store it in a variable, and print it
        int lengthOfMonth = date.lengthOfMonth();
        System.out.println("Length of Month: " + lengthOfMonth);

        // Get the number of days in the year, store it in a variable, and print it
        int lengthOfYear = date.lengthOfYear();
        System.out.println("Length of Year: " + lengthOfYear);
    }

    /**
     * Demonstrates different ways of modifying a LocalDate.
     * Shows plus, minus, and with methods for days, weeks, months, years, and specific fields.
     * @param date the LocalDate to modify
     */
    public static void modifyLocalDateExamples(LocalDate date) {
        // Store original date in variable and print it
        System.out.println("Original date: " + date);
        // Add 5 days to the date, store in variable, and print it
        LocalDate plus5Days = date.plusDays(5);
        System.out.println("Plus 5 days: " + plus5Days);
        // Subtract 2 weeks from the date, store in variable, and print it
        LocalDate minus2Weeks = date.minusWeeks(2);
        System.out.println("Minus 2 weeks: " + minus2Weeks);
        // Add 3 months to the date, store in variable, and print it
        LocalDate plus3Months = date.plusMonths(3);
        System.out.println("Plus 3 months: " + plus3Months);
        // Subtract 1 year from the date, store in variable, and print it
        LocalDate minus1Year = date.minusYears(1);
        System.out.println("Minus 1 year: " + minus1Year);
        // Set day of month to 1, store in variable, and print it
        LocalDate dayOfMonth1 = date.withDayOfMonth(1);
        System.out.println("With day of month 1: " + dayOfMonth1);
        // Set month to December, store in variable, and print it
        LocalDate monthDecember = date.withMonth(12);
        System.out.println("With month December: " + monthDecember);
        // Set year to 2000, store in variable, and print it
        LocalDate year2000 = date.withYear(2000);
        System.out.println("With year 2000: " + year2000);
        // Set day of year to 100, store in variable, and print it
        LocalDate dayOfYear100 = date.withDayOfYear(100);
        System.out.println("With day of year 100: " + dayOfYear100);
        // Set date to first day of next month, store in variable, and print it
        LocalDate firstDayNextMonth = date.with(date.plusMonths(1).withDayOfMonth(1));
        System.out.println("With first day of next month: " + firstDayNextMonth);
        // Set date to first day of year, store in variable, and print it
        LocalDate firstDayYear = date.withDayOfYear(1);
        System.out.println("With first day of year: " + firstDayYear);

        // Get next Sunday from the date, store in variable, and print it
        LocalDate nextSunday = date.with(TemporalAdjusters.next(java.time.DayOfWeek.SUNDAY));
        System.out.println("With next Sunday: " + nextSunday);
        // Get previous Monday from the date, store in variable, and print it
        LocalDate previousMonday = date.with(TemporalAdjusters.previous(java.time.DayOfWeek.MONDAY));
        System.out.println("With previous Monday: " + previousMonday);
        // Get first day of month, store in variable, and print it
        LocalDate firstDayOfMonth = date.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("With first day of month: " + firstDayOfMonth);
        // Get last day of month, store in variable, and print it
        LocalDate lastDayOfMonth = date.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("With last day of month: " + lastDayOfMonth);
        // Get first day of next year, store in variable, and print it
        LocalDate firstDayNextYear = date.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println("With first day of next year: " + firstDayNextYear);
    }

    /**
     * Demonstrates creation of LocalDate for today and a specific date.
     */
    public static void createLocalDateExamples() {
        // Create LocalDate for today using now() method, store it in a variable, and print the today's date
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        // Create LocalDate for a specific date using of() method, store it in a variable, and print the Independence Day
        LocalDate independenceDay = LocalDate.of(1947, 8, 15);
        System.out.println("Independence Day: " + independenceDay);

        // Create LocalDate by parsing a string in ISO format, store it in a variable, and print the parsed date
        LocalDate parsedDate = LocalDate.parse("2025-09-29");
        System.out.println("parsedDate: " + parsedDate);
    }

    /**
     * Demonstrates creation of MovieWithLocalDate instances.
     */
    public static void createMovieWithLocalDateExamples() {
        // Create Inception movie with release date July 16, 2010, store it in a variable, and print it
        MovieWithLocalDate movie1 = new MovieWithLocalDate(
                "Inception", 148, com.modernjava.domain.MovieGenre.SCI_FI, 8.8, 2010, "Christopher Nolan", true, LocalDate.of(2010, 7, 16));
        System.out.println("Movie 1: " + movie1);

        // Create The Godfather movie with release date March 24, 1972, store it in a variable, and print it
        MovieWithLocalDate movie2 = new MovieWithLocalDate(
                "The Godfather", 175, com.modernjava.domain.MovieGenre.DRAMA, 9.2, 1972, "Francis Ford Coppola", false, LocalDate.of(1972, 3, 24));
        System.out.println("Movie 2: " + movie2);

        // Create Interstellar movie with release date November 7, 2014, store it in a variable, and print it
        MovieWithLocalDate movie3 = new MovieWithLocalDate(
                "Interstellar", 169, com.modernjava.domain.MovieGenre.SCI_FI, 8.6, 2014, "Christopher Nolan", true, LocalDate.of(2014, 11, 7));
        System.out.println("Movie 3: " + movie3);
    }


}