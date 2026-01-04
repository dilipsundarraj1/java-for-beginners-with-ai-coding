package com.modernjava._15datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class _4ZonedDateTime {

    static void main(String[] args) {
        createZonedDateTimeInstances();
        System.out.println("\n-------------------\n");
        retrievingValuesFromZonedDateTime();
        System.out.println("\n-------------------\n");

        comparingZonedDateTimeInstances();
        System.out.println("\n-------------------\n");
        modifyingZonedDateTimeInstances();
        System.out.println("\n-------------------\n");

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

        // Convert to New York zone while keeping the same local time using withZoneSameLocal() method, store result in a variable, and print it
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
