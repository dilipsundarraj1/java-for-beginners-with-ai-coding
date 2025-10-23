package com.modernjava._15datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * Demonstrates Duration class concepts with simple examples
 * Duration represents a time-based amount of time (hours, minutes, seconds, nanoseconds)
 * It's used for time arithmetic and calculating differences between times
 */
public class _5Duration {

    public static void main(String[] args) {
        System.out.println("=== Java Duration Examples ===\n");

        // Example 1: Creating durations in different ways
        createDurationExamples();

        // Example 2: Time arithmetic with Duration
        timeArithmeticExample();

        // Example 3: Duration between two times
        durationBetweenTimesExample();

        // Example 4: Real-world timing examples
        realWorldTimingExample();

        // Example 5: Using ISO 8601 Duration strings
        iso8601DurationExample();
    }

    /**
     * Demonstrates different ways to create Duration objects
     */
    private static void createDurationExamples() {
        System.out.println("1. Creating Durations:");

        // Create durations using static factory methods
        Duration oneHour = Duration.ofHours(1);
        Duration thirtyMinutes = Duration.ofMinutes(30);
        Duration fortyFiveSeconds = Duration.ofSeconds(45);
        Duration twoMillis = Duration.ofMillis(2000);
        Duration fiveNanos = Duration.ofNanos(5000000000L);

        // Create duration using of() method
        Duration combined = Duration.of(90, ChronoUnit.MINUTES); // 90 minutes

        System.out.println("One hour: " + oneHour);
        System.out.println("Thirty minutes: " + thirtyMinutes);
        System.out.println("Forty-five seconds: " + fortyFiveSeconds);
        System.out.println("Two seconds (as millis): " + twoMillis);
        System.out.println("Five seconds (as nanos): " + fiveNanos);
        System.out.println("90 minutes using ChronoUnit: " + combined);

        // Duration with negative values
        Duration negativeHour = Duration.ofHours(-1);
        System.out.println("Negative one hour: " + negativeHour);
        System.out.println();
    }

    /**
     * Demonstrates adding and subtracting durations from times
     */
    private static void timeArithmeticExample() {
        System.out.println("2. Time Arithmetic with Durations:");

        LocalTime startTime = LocalTime.of(9, 0, 0); // 9:00 AM
        Duration workingHours = Duration.ofHours(8);
        Duration lunchBreak = Duration.ofMinutes(60);
        Duration shortBreak = Duration.ofMinutes(15);

        LocalTime lunchTime = startTime.plus(Duration.ofHours(4));
        LocalTime afterLunch = lunchTime.plus(lunchBreak);
        LocalTime endTime = startTime.plus(workingHours);

        System.out.println("Work day schedule:");
        System.out.println("Start time: " + startTime);
        System.out.println("Lunch time (after 4 hours): " + lunchTime);
        System.out.println("Back from lunch: " + afterLunch);
        System.out.println("End time (after 8 hours): " + endTime);

        // Calculate total break time
        Duration totalBreaks = lunchBreak.plus(shortBreak.multipliedBy(2)); // 2 short breaks
        System.out.println("Total break time: " + totalBreaks);
        System.out.println("Total break time in minutes: " + totalBreaks.toMinutes());
        System.out.println();
    }

    /**
     * Demonstrates calculating duration between two times
     */
    private static void durationBetweenTimesExample() {
        System.out.println("3. Duration Between Times:");

        LocalTime startTime = LocalTime.of(14, 30, 0); // 2:30 PM
        LocalTime endTime = LocalTime.of(17, 45, 30);  // 5:45:30 PM

        Duration difference = Duration.between(startTime, endTime);

        System.out.println("Start time: " + startTime);
        System.out.println("End time: " + endTime);
        System.out.println("Duration: " + difference);
        System.out.println("Duration in hours: " + difference.toHours());
        System.out.println("Duration in minutes: " + difference.toMinutes());
        System.out.println("Duration in seconds: " + difference.getSeconds());

        // Using LocalDateTime for more precise calculations
        LocalDateTime meetingStart = LocalDateTime.of(2024, 10, 2, 10, 0, 0);
        LocalDateTime meetingEnd = LocalDateTime.of(2024, 10, 2, 11, 30, 45);
        Duration meetingDuration = Duration.between(meetingStart, meetingEnd);

        System.out.println("\nMeeting Example:");
        System.out.println("Meeting start: " + meetingStart);
        System.out.println("Meeting end: " + meetingEnd);
        System.out.println("Meeting duration: " + meetingDuration);
        System.out.println("Meeting length: " + meetingDuration.toHours() + "h " +
                          (meetingDuration.toMinutes() % 60) + "m " +
                          (meetingDuration.getSeconds() % 60) + "s");
        System.out.println();
    }

    /**
     * Demonstrates real-world timing scenarios
     */
    private static void realWorldTimingExample() {
        System.out.println("4. Real-world Timing Examples:");

        // Video/Movie duration
        Duration movieLength = Duration.ofMinutes(142); // 2h 22m movie
        System.out.println("Movie duration: " + movieLength);
        System.out.println("Movie length: " + movieLength.toHours() + "h " +
                          (movieLength.toMinutes() % 60) + "m");

        // Cooking timer
        Duration bakingTime = Duration.ofMinutes(25);
        Duration prepTime = Duration.ofMinutes(15);
        Duration totalCookingTime = prepTime.plus(bakingTime);

        System.out.println("\nCooking Example:");
        System.out.println("Prep time: " + prepTime.toMinutes() + " minutes");
        System.out.println("Baking time: " + bakingTime.toMinutes() + " minutes");
        System.out.println("Total cooking time: " + totalCookingTime.toMinutes() + " minutes");

        // Exercise duration
        Duration warmUp = Duration.ofMinutes(10);
        Duration workout = Duration.ofMinutes(45);
        Duration coolDown = Duration.ofMinutes(5);
        Duration totalExercise = warmUp.plus(workout).plus(coolDown);

        System.out.println("\nExercise Example:");
        System.out.println("Warm-up: " + warmUp.toMinutes() + " minutes");
        System.out.println("Main workout: " + workout.toMinutes() + " minutes");
        System.out.println("Cool-down: " + coolDown.toMinutes() + " minutes");
        System.out.println("Total exercise time: " + totalExercise.toMinutes() + " minutes");

        // Performance timing
        Instant processingStart = Instant.now();
        // Simulate some processing time
        try {
            Thread.sleep(100); // 100ms
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        Instant processingEnd = Instant.now();
        Duration processingTime = Duration.between(processingStart, processingEnd);

        System.out.println("\nPerformance Timing:");
        System.out.println("Processing time: " + processingTime.toMillis() + " milliseconds");
        System.out.println();
    }

    /**
     * Demonstrates using ISO 8601 Duration strings like "PT2H30M15S"
     * PT = Period Time
     * H = Hours
     * M = Minutes
     * S = Seconds
     */
    private static void iso8601DurationExample() {
        System.out.println("5. ISO 8601 Duration Strings:");

        // Parse duration strings using Duration.parse()
        Duration duration1 = Duration.parse("PT2H30M");      // 2 hours 30 minutes
        Duration duration2 = Duration.parse("PT1H");         // 1 hour
        Duration duration3 = Duration.parse("PT45M");        // 45 minutes
        Duration duration4 = Duration.parse("PT30S");        // 30 seconds
        Duration duration5 = Duration.parse("PT2H15M30S");   // 2 hours 15 minutes 30 seconds

        System.out.println("Parsing 'PT2H30M': " + duration1);
        System.out.println("Parsing 'PT1H': " + duration2);
        System.out.println("Parsing 'PT45M': " + duration3);
        System.out.println("Parsing 'PT30S': " + duration4);
        System.out.println("Parsing 'PT2H15M30S': " + duration5);

        // Converting Duration back to string format
        Duration customDuration = Duration.ofHours(3).plusMinutes(45).plusSeconds(20);
        String durationString = customDuration.toString();
        System.out.println("3h 45m 20s as string: " + durationString);

        // Real-world example: Flight duration
        System.out.println("\nReal-world example:");
        LocalDateTime departure = LocalDateTime.of(2024, 10, 2, 14, 30);
        Duration flightDuration = Duration.parse("PT8H45M");  // 8 hours 45 minutes
        LocalDateTime arrival = departure.plus(flightDuration);

        System.out.println("Flight departure: " + departure);
        System.out.println("Flight duration: " + flightDuration + " (" + flightDuration.toString() + ")");
        System.out.println("Flight arrival: " + arrival);

        // Breaking down the duration
        System.out.println("Duration breakdown:");
        System.out.println("  Hours: " + flightDuration.toHours());
        System.out.println("  Minutes (total): " + flightDuration.toMinutes());
        System.out.println("  Minutes (remaining): " + (flightDuration.toMinutes() % 60));
        System.out.println("  Seconds: " + flightDuration.getSeconds());

        // Using the duration for calculations
        LocalDateTime boarding = departure.minus(Duration.parse("PT45M"));    // 45 minutes before
        LocalDateTime checkin = departure.minus(Duration.parse("PT2H"));      // 2 hours before

        System.out.println("\nFlight schedule:");
        System.out.println("Check-in time: " + checkin);
        System.out.println("Boarding time: " + boarding);
        System.out.println("Departure time: " + departure);
        System.out.println("Arrival time: " + arrival);
        System.out.println();
    }
}
