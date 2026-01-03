package com.modernjava._15datetime;

import com.modernjava.domain.Movie;
import com.modernjava.domain.MovieGenre;
import com.modernjava.domain.ticketapp.Screen;
import com.modernjava.domain.ticketapp.Seat;
import com.modernjava.domain.ticketapp.ShowTimeV2;
import com.modernjava.domain.ticketapp.Theatre;

import java.time.LocalDate;
import java.util.Collections;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.List;

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
        printLocalTimeValues(LocalTime.now());

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
        LocalTime now = LocalTime.now();
        System.out.println("Current time: " + now);

        // Create LocalTime for noon using NOON constant, store it in a variable, and print it
        LocalTime noon = LocalTime.NOON;
        System.out.println("Noon: " + noon);

        // Create LocalTime for midnight using MIDNIGHT constant, store it in a variable, and print it
        LocalTime midnight = LocalTime.MIDNIGHT;
        System.out.println("Midnight: " + midnight);

        // Create LocalTime for a specific time using of() method, store it in a variable, and print it
        LocalTime specific = LocalTime.of(15, 30, 45);
        System.out.println("Specific time: " + specific);

        // Create LocalTime by parsing a string in HH:MM:SS format, store it in a variable, and print it
        LocalTime parsed = LocalTime.parse("08:20:15");
        System.out.println("Parsed time: " + parsed);
    }

    /**
     * Demonstrates all possible ways of retrieving values from a LocalTime.
     * Prints hour, minute, second, nano, etc.
     * @param time the LocalTime to extract values from
     */
    public static void printLocalTimeValues(LocalTime time) {
        // Get the hour from the LocalTime, store it in a variable, and print it
        int hour = time.getHour();
        System.out.println("Hour: " + hour);

        // Get the minute from the LocalTime, store it in a variable, and print it
        int minute = time.getMinute();
        System.out.println("Minute: " + minute);

        // Get the second from the LocalTime, store it in a variable, and print it
        int second = time.getSecond();
        System.out.println("Second: " + second);

        // Get the nanosecond from the LocalTime, store it in a variable, and print it
        int nano = time.getNano();
        System.out.println("Nano: " + nano);

        // Check if the time is midnight, store it in a variable, and print it
        boolean isMidnight = time.equals(LocalTime.MIDNIGHT);
        System.out.println("Is midnight: " + isMidnight);

        // Check if the time is noon, store it in a variable, and print it
        boolean isNoon = time.equals(LocalTime.NOON);
        System.out.println("Is noon: " + isNoon);

        // Get the total seconds from the start of day, store it in a variable, and print it
        int secondOfDay = time.toSecondOfDay();
        System.out.println("toSecondOfDay: " + secondOfDay);

        // Get the total nanoseconds from the start of day, store it in a variable, and print it
        long nanoOfDay = time.toNanoOfDay();
        System.out.println("toNanoOfDay: " + nanoOfDay);
    }

    /**
     * Compares the current time with a given LocalTime and prints the results.
     * @param otherTime the LocalTime to compare with now
     */
    public static void compareWithNow(LocalTime otherTime) {
        // Check if now is before the other time, store it in a variable, and print it
        boolean isBefore = LocalTime.now().isBefore(otherTime);
        System.out.println("Is now before " + otherTime + "? " + isBefore);

        // Check if now is after the other time, store it in a variable, and print it
        boolean isAfter = LocalTime.now().isAfter(otherTime);
        System.out.println("Is now after " + otherTime + "? " + isAfter);

        // Check if now is equal to the other time, store it in a variable, and print it
        boolean isEqual = LocalTime.now().equals(otherTime);
        System.out.println("Is now equal to " + otherTime + "? " + isEqual);
    }

    /**
     * Demonstrates different ways of modifying a LocalTime.
     * Shows plus, minus, and with methods for hours, minutes, seconds, nanos, and specific fields.
     * @param time the LocalTime to modify
     */
    public static void modifyLocalTimeExamples(LocalTime time) {
        // Store original time in variable and print it
        System.out.println("Original time: " + time);

        // Add 2 hours to the time, store in variable, and print it
        LocalTime plus2Hours = time.plusHours(2);
        System.out.println("Plus 2 hours: " + plus2Hours);

        // Subtract 30 minutes from the time, store in variable, and print it
        LocalTime minus30Minutes = time.minusMinutes(30);
        System.out.println("Minus 30 minutes: " + minus30Minutes);

        // Add 45 seconds to the time, store in variable, and print it
        LocalTime plus45Seconds = time.plusSeconds(45);
        System.out.println("Plus 45 seconds: " + plus45Seconds);

        // Subtract 1000000 nanoseconds from the time, store in variable, and print it
        LocalTime minus1MNanos = time.minusNanos(1_000_000);
        System.out.println("Minus 1000000 nanos: " + minus1MNanos);

        // Set hour to 6, store in variable, and print it
        LocalTime hour6 = time.withHour(6);
        System.out.println("With hour 6: " + hour6);

        // Set minute to 0, store in variable, and print it
        LocalTime min0 = time.withMinute(0);
        System.out.println("With minute 0: " + min0);

        // Set second to 0, store in variable, and print it
        LocalTime sec0 = time.withSecond(0);
        System.out.println("With second 0: " + sec0);

        // Set nanosecond to 0, store in variable, and print it
        LocalTime nano0 = time.withNano(0);
        System.out.println("With nano 0: " + nano0);

        // Set hour to 23 using ChronoField, store in variable, and print it
        LocalTime hour23 = time.with(ChronoField.HOUR_OF_DAY, 23);
        System.out.println("With hour set to 23 (ChronoField): " + hour23);

        // Add 24 hours which wraps to same time, store in variable, and print it
        LocalTime plus24Hours = time.plusHours(24);
        System.out.println("Plus 24 hours (wraps to same time): " + plus24Hours);
    }
    /**
     * Demonstrates the use of LocalTime with the ShowTime record class.
     */
    public static void demonstrateShowTimeWithLocalTime() {
        // Create a dummy Movie
        Movie movie = new Movie(
                "Inception", 148, MovieGenre.SCI_FI, 8.8, 2010, "Christopher Nolan");
        // Create a dummy Theatre (as Screen requires it)
        Theatre theatre = new Theatre(
                "IMAX", "Downtown", Collections.emptyList());
        // Create a dummy Screen
        Screen screen = new Screen(
                "Screen 1", 200, theatre);
        // Use LocalDate and LocalTime for show date and time
        var showDate = LocalDate.now();
        var showTime = LocalTime.of(19, 30); // 7:30 PM
        // Create ShowTime record
        var show = new ShowTimeV2(
                showDate, showTime, screen, movie, List.of(new Seat("A", 1), new Seat("A", 2)));
        // Print details
        System.out.println("\nShowTime demonstration:");
        System.out.println("Movie: " + show.movie().title());
        System.out.println("Screen: " + show.screen().name());
        System.out.println("Date: " + show.date());
        System.out.println("Time: " + show.time());
    }
}




