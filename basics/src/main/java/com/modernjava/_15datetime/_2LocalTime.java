package com.modernjava._15datetime;

import java.time.LocalTime;

/**
 * Lecture: LocalTime
 * - Overview of java.time.LocalTime
 * - LocalTime creation, retrieval, modification, comparison
 */
public class _2LocalTime {

    static void main(String[] args) {
        // Demonstrate LocalTime creation
        createLocalTimeExamples();

        // Demonstrate retrieving values from LocalTime
        System.out.println("\nRetrieving values from current time:");
        retrieveLocalTimeValues(LocalTime.now());

        // Compare now with a specific time
        compareWithNow(LocalTime.of(23, 59, 59));

        // Demonstrate modifying LocalTime
        System.out.println("\nModifying current time:");
        modifyLocalTimeExamples(LocalTime.now());

        demonstrateShowTimeWithLocalTime();
    }

    /**
     * Demonstrates creation of LocalTime for now, a specific time, and from string.
     */
    public static void createLocalTimeExamples() {
        // Create LocalTime for current time using now() method, store it in a variable, and print it

        // Create LocalTime for noon using NOON constant, store it in a variable, and print it

        // Create LocalTime for midnight using MIDNIGHT constant, store it in a variable, and print it

        // Create LocalTime for a specific time using of() method, store it in a variable, and print it

        // Create LocalTime by parsing a string in HH:MM:SS format, store it in a variable, and print it
    }

    /**
     * Demonstrates all possible ways of retrieving values from a LocalTime.
     * Prints hour, minute, second, nano, etc.
     * @param time the LocalTime to extract values from
     */
    public static void retrieveLocalTimeValues(LocalTime time) {
        // Get the hour from the LocalTime, store it in a variable, and print it

        // Get the minute from the LocalTime, store it in a variable, and print it

        // Get the second from the LocalTime, store it in a variable, and print it

        // Get the nanosecond from the LocalTime, store it in a variable, and print it

        // Check if the time is midnight, store it in a variable, and print it

        // Check if the time is noon, store it in a variable, and print it

        // Get the total seconds from the start of day, store it in a variable, and print it

        // Get the total nanoseconds from the start of day, store it in a variable, and print it
    }

    /**
     * Compares the current time with a given LocalTime and prints the results.
     * @param otherTime the LocalTime to compare with now
     */
    public static void compareWithNow(LocalTime otherTime) {
        // Check if now is before the other time, store it in a variable, and print it

        // Check if now is after the other time, store it in a variable, and print it

        // Check if now is equal to the other time, store it in a variable, and print it
    }

    /**
     * Demonstrates different ways of modifying a LocalTime.
     * Shows plus, minus, and with methods for hours, minutes, seconds, nanos, and specific fields.
     * @param time the LocalTime to modify
     */
    public static void modifyLocalTimeExamples(LocalTime time) {
        // Store original time in variable and print it

        // Add 2 hours to the time, store in variable, and print it

        // Subtract 30 minutes from the time, store in variable, and print it

        // Add 45 seconds to the time, store in variable, and print it

        // Subtract 1000000 nanoseconds from the time, store in variable, and print it

        // Set hour to 6, store in variable, and print it

        // Set minute to 0, store in variable, and print it

        // Set second to 0, store in variable, and print it

        // Set nanosecond to 0, store in variable, and print it

        // Set hour to 23 using ChronoField, store in variable, and print it

        // Add 24 hours which wraps to same time, store in variable, and print it
    }
    /**
     * Demonstrates the use of LocalTime with the ShowTime record class.
     */
    public static void demonstrateShowTimeWithLocalTime() {
        // Create a dummy Movie with title, duration, genre, rating, year, and director

        // Create a dummy Theatre with name, location, and empty screens list

        // Create a dummy Screen with name, capacity, and associated theatre

        // Create LocalDate for today's date using now() method

        // Create LocalTime for 7:30 PM (19:30) using of() method

        // Create ShowTimeWithSeats record with date, time, screen, movie, and list of seats

        // Print a blank line and the ShowTime demonstration header

        // Get and print the movie title from the ShowTime record

        // Get and print the screen name from the ShowTime record

        // Get and print the show date from the ShowTime record

        // Get and print the show time from the ShowTime record
    }
}




