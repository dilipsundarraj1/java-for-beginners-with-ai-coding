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

        // Get the month as an enum value and print it

        // Get the month as a numeric value (1-12) and print it

        // Get the day of the month and print it

        // Get the day of the week and print it

        // Get the day of the year (1-365/366) and print it
    }

    /**
     * Compares the current date with a given LocalDate and prints the results.
     * @param otherDate the LocalDate to compare with today
     */
    public static void compareWithToday(LocalDate otherDate) {
        // Check if today is before the other date, store it in a variable, and print it

        // Check if today is after the other date, store it in a variable, and print it

        // Check if today is equal to the other date, store it in a variable, and print it
    }

    /**
     * Prints leap year status and length of month/year for the given LocalDate.
     * @param date the LocalDate to check
     */
    public static void printLeapYearAndLengths(LocalDate date) {
        // Check if the year is a leap year, store it in a variable, and print it

        // Get the number of days in the month, store it in a variable, and print it

        // Get the number of days in the year, store it in a variable, and print it
    }

    /**
     * Demonstrates different ways of modifying a LocalDate.
     * Shows plus, minus, and with methods for days, weeks, months, years, and specific fields.
     * @param date the LocalDate to modify
     */
    public static void modifyLocalDateExamples(LocalDate date) {
        // Store original date in variable and print it

        // Add 5 days to the date, store in variable, and print it

        // Subtract 2 weeks from the date, store in variable, and print it

        // Add 3 months to the date, store in variable, and print it

        // Subtract 1 year from the date, store in variable, and print it

        // Set day of month to 1, store in variable, and print it

        // Set month to December, store in variable, and print it

        // Set year to 2000, store in variable, and print it

        // Set day of year to 100, store in variable, and print it

        // Set date to first day of next month, store in variable, and print it

        // Set date to first day of year, store in variable, and print it

        // Get next Sunday from the date, store in variable, and print it

        // Get previous Monday from the date, store in variable, and print it

        // Get first day of month, store in variable, and print it

        // Get last day of month, store in variable, and print it

        // Get first day of next year, store in variable, and print it
    }

    /**
     * Demonstrates creation of LocalDate for today and a specific date.
     */
    public static void createLocalDateExamples() {
        // Create LocalDate for today using now() method, store it in a variable, and print the today's date

        // Create LocalDate for a specific date using of() method, store it in a variable, and print the Independence Day

        // Create LocalDate by parsing a string in ISO format, store it in a variable, and print the parsed date
    }

    /**
     * Demonstrates creation of MovieWithLocalDate instances.
     */
    public static void createMovieWithLocalDateExamples() {
        // Create Inception movie with release date July 16, 2010, store it in a variable, and print it

        // Create The Godfather movie with release date March 24, 1972, store it in a variable, and print it

        // Create Interstellar movie with release date November 7, 2014, store it in a variable, and print it
    }


}