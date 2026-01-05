package com.modernjava._15datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class _4ZonedDateTime {

    static void main(String[] args) {
        createZonedDateTimeInstances();
        System.out.println("\n-------------------\n");
        retrievingValuesFromZonedDateTime();
        System.out.println("\n-------------------\n");

        modifyingZonedDateTimeInstances();
        System.out.println("\n-------------------\n");
        comparingZonedDateTimeInstances();
        System.out.println("\n-------------------\n");

        System.out.println("\n-------------------\n");
        understandingInstant();
        compareAndModifyInstants();

        handlingTimeZoneConversions();
        System.out.println("\n-------------------\n");
        dealingWithDaylightSavings();
        System.out.println("\n-------------------\n");
        flightTravelExample();
    }

    private static void createZonedDateTimeInstances() {
        System.out.println("Creating ZonedDateTime Instances");

        // Create ZonedDateTime for current date and time in system default zone using now() method, store it in a variable, and print it

        // Create ZonedDateTime for current date and time in specific zone "America/New_York" using now(ZoneId) method, store it in a variable, and print it

        // Create ZonedDateTime from LocalDateTime with zone "Europe/London" using atZone() method, store it in a variable, and print it

        // Create ZonedDateTime for specific date and time with zone using of() method - Asia/Tokyo, store it in a variable, and print it

        // Create ZonedDateTime by parsing a string in ISO-8601 format with zone, store it in a variable, and print it

        // Get and display all available time zones using getAvailableZoneIds(), filter, and print them
    }

    private static void comparingZonedDateTimeInstances() {
        System.out.println("Comparing ZonedDateTime Instances");

        // Create ZonedDateTime for current date and time in Tokyo zone using now(ZoneId) method, store it in a variable, and print it

        // Create ZonedDateTime for current date and time in New York zone using now(ZoneId) method, store it in a variable, and print it

        // Compare if tokyoTime is before nyTime using isBefore() method, store result in a variable, and print it

        // Compare if tokyoTime is after nyTime using isAfter() method, store result in a variable, and print it

        // Compare if tokyoTime and nyTime represent the same instant using toInstant().equals() method, store result in a variable, and print it
    }

    private static void retrievingValuesFromZonedDateTime() {
        System.out.println("Retrieving Values from ZonedDateTime");

        // Create current date and time in specific zone using now(ZoneId) method, store it in a variable, and print it

        // Get the time zone from the ZonedDateTime using getZone() method, store it in a variable, and print it

        // Get the zone offset from the ZonedDateTime using getOffset() method, store it in a variable, and print it

        // Get the year from the ZonedDateTime using getYear() method, store it in a variable, and print it

        // Get the month from the ZonedDateTime using getMonth() method, store it in a variable, and print it

        // Get the day of month from the ZonedDateTime using getDayOfMonth() method, store it in a variable, and print it

        // Get the day of week from the ZonedDateTime using getDayOfWeek() method, store it in a variable, and print it

        // Get the hour from the ZonedDateTime using getHour() method, store it in a variable, and print it

        // Get the minute from the ZonedDateTime using getMinute() method, store it in a variable, and print it

        // Get the second from the ZonedDateTime using getSecond() method, store it in a variable, and print it

        // Convert ZonedDateTime to LocalDateTime using toLocalDateTime() method, store it in a variable, and print it

        // Convert ZonedDateTime to Instant using toInstant() method, store it in a variable, and print it
    }

    private static void modifyingZonedDateTimeInstances() {
        System.out.println("Modifying ZonedDateTime Instances");

        // Create current date and time in Paris zone using now(ZoneId) method, store it in a variable, and print it

        // Add 1 year to the original ZonedDateTime using plusYears() method, store result in a variable, and print it

        // Subtract 1 month from the original ZonedDateTime using minusMonths() method, store result in a variable, and print it

        // Add 1 week to the original ZonedDateTime using plusWeeks() method, store result in a variable, and print it

        // Add 2 days to the original ZonedDateTime using plusDays() method, store result in a variable, and print it

        // Add 3 hours to the original ZonedDateTime using plusHours() method, store result in a variable, and print it

        // Replace the year with 2030 using withYear() method, store result in a variable, and print it

        // Convert to New York zone while keeping the same instant using withZoneSameInstant() method, store result in a variable, and print it
        //withZoneSameInstant :
            //  In other words, it answers the question: "What time is it in a different timezone at this exact same moment?"
            //For example, if it's 3:00 PM in Paris, withZoneSameInstant() will calculate what time it is in New York at that exact same instant (which would be earlier in the day due to the time zone difference).

        // Convert to New York zone while keeping the same local time using withZoneSameLocal() method, store result in a variable, and print it
    }

    private static void understandingInstant() {
        System.out.println("Understanding Instant");
        System.out.println("==========================================");
        System.out.println("Instant represents a single point in time (UTC/GMT)");
        System.out.println("It is timezone-agnostic and cannot be displayed in local time directly");
        System.out.println("Instant is useful for logging, measuring durations, and comparing timestamps");

        System.out.println("\n--- Creating Instant Instances ---");

        // Create an Instant for the current moment using now() method, store it in a variable, and print it

        // Create an Instant by parsing an ISO-8601 string using parse() method, store it in a variable, and print it

        // Create an Instant from a specific epoch using ofEpochSecond() method with seconds since Jan 1, 1970, store it in a variable, and print it

        // Create an Instant from a specific epoch using ofEpochMilli() method with milliseconds since Jan 1, 1970, store it in a variable, and print it

        System.out.println("\n--- Converting Between Instant and ZonedDateTime ---");

        // Create a ZonedDateTime for a specific date and time using of() method for "America/New_York", store it in a variable

        // Convert ZonedDateTime to Instant using toInstant() method, store it in a variable, and print it

        // Convert Instant back to ZonedDateTime in London zone using atZone() method, store it in a variable, and print it

        // Convert Instant back to ZonedDateTime in Tokyo zone using atZone() method, store it in a variable, and print it

        System.out.println("\n--- Retrieving Values from Instant ---");

        // Create a current instant using now() method, store it in a variable, and print it

        // Get the number of seconds since epoch (Jan 1, 1970 UTC) using getEpochSecond() method, store it in a variable, and print it

        // Get the nanosecond adjustment from the epoch second using getNano() method, store it in a variable, and print it

        // Get the number of milliseconds since epoch using toEpochMilli() method, store it in a variable, and print it

    }

    private static void compareAndModifyInstants() {
        System.out.println("\n--- Comparing Instant Instances ---");

        // Create two Instant objects using now() method with a small delay, store them in variables

        // Compare if instant1 is before instant2 using isBefore() method, store result in a variable, and print it

        // Compare if instant1 is after instant2 using isAfter() method, store result in a variable, and print it

        // Check if two instants are equal using equals() method, store result in a variable, and print it

        System.out.println("\n--- Modifying Instant Instances ---");

        // Create a current instant using now() method, store it in a variable, and print it

        // Add 1 hour (3600 seconds) to the instant using plusSeconds() method, store result in a variable, and print it

        // Subtract 1 day (86400 seconds) from the instant using minusSeconds() method, store result in a variable, and print it

        // Add 30 days using plusSeconds() method (30 * 86400 seconds), store result in a variable, and print it
    }

    private static void handlingTimeZoneConversions() {
        System.out.println("Handling Time Zone Conversions");

        // Create a time in Sydney zone using now(ZoneId) method, store it in a variable, and print it

        // Convert Sydney time to London zone keeping the same instant using withZoneSameInstant() method, store it in a variable, and print it

        // Convert Sydney time to New York zone keeping the same instant using withZoneSameInstant() method, store it in a variable, and print it

        // Convert Sydney time to Tokyo zone keeping the same instant using withZoneSameInstant() method, store it in a variable, and print it

        // Calculate the hours difference between London and Sydney using ChronoUnit.HOURS.between() method, store result in a variable, and print it
    }

    private static void dealingWithDaylightSavings() {
        System.out.println("Dealing with Daylight Savings Time (DST)");

        // Create a ZonedDateTime before DST transition (2nd Sunday in March) using of() method, store it in a variable, and print it

        // Add 1 hour to the time before DST using plusHours() method, store result in a variable, and print it

        // Create a ZonedDateTime before fall back transition (1st Sunday in November) using of() method, store it in a variable, and print it

        // Add 1 hour to the time before fall back using plusHours() method, store result in a variable, and print it

        // Check if March time is in DST using getZone().getRules().isDaylightSavings() method, store result in a variable, and print it

        // Check if November time is in DST using getZone().getRules().isDaylightSavings() method, store result in a variable, and print it
    }


    private static void flightTravelExample() {
        System.out.println("Simple Example: Flight Travel Times");
        System.out.println("----------------------------------");

        // Create a departure time from New York using of() method, store it in a variable, and print it

        // Calculate arrival time in London by adding 7 hours and converting to London zone using plusHours() and withZoneSameInstant() methods, store result in a variable, and print it

        // Convert the landing time back to New York timezone to see what time it is at home using withZoneSameInstant() method, store it in a variable, and print it

        System.out.println("\nTime difference:");
        System.out.println("\nTime difference (computed):");

        // Extract the local time from departure in New York using toLocalTime() method, store it in a variable, and print it with zone

        // Extract the local time from arrival in London using toLocalTime() method, store it in a variable, and print it with zone

        // Extract the local time from landing in New York using toLocalTime() method, store it in a variable, and print it with zone
    }
}
