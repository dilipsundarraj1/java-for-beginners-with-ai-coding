package com.modernjava._15datetime;

import com.modernjava.domain.Movie;
import com.modernjava.domain.MovieGenre;
import com.modernjava.domain.ticketapp.Screen;
import com.modernjava.domain.ticketapp.ShowTimeV2;
import com.modernjava.domain.ticketapp.Theatre;

import java.time.LocalDate;
import java.util.Collections;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 * Lecture: LocalTime
 * - Overview of java.time.LocalTime
 * - LocalTime creation, retrieval, modification, comparison
 */
public class _2LocalTime {

    public static void main(String[] args) {
        // Demonstrate LocalTime creation
        createLocalTimeExamples();

        // Compare now with a specific time
        compareWithNow(LocalTime.of(23, 59, 59));

        // Demonstrate retrieving values from LocalTime
        System.out.println("\nRetrieving values from current time:");
        printLocalTimeValues(LocalTime.now());

        // Demonstrate modifying LocalTime
        System.out.println("\nModifying current time:");
        modifyLocalTimeExamples(LocalTime.now());

        demonstrateShowTimeWithLocalTime();
    }

    /**
     * Demonstrates creation of LocalTime for now, a specific time, and from string.
        */
    public static void createLocalTimeExamples() {
        LocalTime now = LocalTime.now();
        System.out.println("Current time: " + now);

        LocalTime noon = LocalTime.NOON;
        System.out.println("Noon: " + noon);

        LocalTime midnight = LocalTime.MIDNIGHT;
        System.out.println("Midnight: " + midnight);

        LocalTime specific = LocalTime.of(15, 30, 45);
        System.out.println("Specific time: " + specific);

        LocalTime parsed = LocalTime.parse("08:20:15");
        System.out.println("Parsed time: " + parsed);
    }

    /**
     * Demonstrates all possible ways of retrieving values from a LocalTime.
     * Prints hour, minute, second, nano, etc.
     * @param time the LocalTime to extract values from
     */
    public static void printLocalTimeValues(LocalTime time) {
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());
        System.out.println("Nano: " + time.getNano());
        System.out.println("Is midnight: " + time.equals(LocalTime.MIDNIGHT));
        System.out.println("Is noon: " + time.equals(LocalTime.NOON));
        System.out.println("toSecondOfDay: " + time.toSecondOfDay());
        System.out.println("toNanoOfDay: " + time.toNanoOfDay());
    }

    /**
     * Compares the current time with a given LocalTime and prints the results.
     * @param otherTime the LocalTime to compare with now
     */
    public static void compareWithNow(LocalTime otherTime) {
        LocalTime now = LocalTime.now();
        boolean isBefore = now.isBefore(otherTime);
        boolean isAfter = now.isAfter(otherTime);
        boolean isEqual = now.equals(otherTime);
        System.out.println("Is now before " + otherTime + "? " + isBefore);
        System.out.println("Is now after " + otherTime + "? " + isAfter);
        System.out.println("Is now equal to " + otherTime + "? " + isEqual);
    }

    /**
     * Demonstrates different ways of modifying a LocalTime.
     * Shows plus, minus, and with methods for hours, minutes, seconds, nanos, and specific fields.
     * @param time the LocalTime to modify
     */
    public static void modifyLocalTimeExamples(LocalTime time) {
        System.out.println("Original time: " + time);
        System.out.println("Plus 2 hours: " + time.plusHours(2));
        System.out.println("Minus 30 minutes: " + time.minusMinutes(30));
        System.out.println("Plus 45 seconds: " + time.plusSeconds(45));
        System.out.println("Minus 1000000 nanos: " + time.minusNanos(1_000_000));
        System.out.println("With hour 6: " + time.withHour(6));
        System.out.println("With minute 0: " + time.withMinute(0));
        System.out.println("With second 0: " + time.withSecond(0));
        System.out.println("With nano 0: " + time.withNano(0));
        // Using with(ChronoField)
        System.out.println("With hour set to 23 (ChronoField): " + time.with(ChronoField.HOUR_OF_DAY, 23));
        // Edge case: wrap around midnight
        System.out.println("Plus 24 hours (wraps to same time): " + time.plusHours(24));

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
                showDate, showTime, screen, movie);
        // Print details
        System.out.println("\nShowTime demonstration:");
        System.out.println("Movie: " + show.movie().title());
        System.out.println("Screen: " + show.screen().name());
        System.out.println("Date: " + show.date());
        System.out.println("Time: " + show.time());
    }
}




