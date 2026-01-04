package com.modernjava._15datetime;

import com.modernjava.domain.Appointment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _3LocalDateTime {

    public static void main(String[] args) {
        createLocalDateTimeInstances();
        System.out.println("\n-------------------\n");

        retrievingValuesFromLocalDateTime();
        System.out.println("\n-------------------\n");

        comparingLocalDateTimeInstances();
        System.out.println("\n-------------------\n");

        modifyingLocalDateTimeInstances();
        System.out.println("\n-------------------\n");

        usingLocalDateTimeInDomainModel();
    }

    private static void createLocalDateTimeInstances() {
        System.out.println("Creating LocalDateTime Instances");

        // Create LocalDateTime for current date and time using now() method, store it in a variable, and print it

        // Create LocalDateTime from LocalDate and LocalTime components using of() method, store it in a variable, and print it

        // Create LocalDateTime for a specific date and time using of() method, store it in a variable, and print it

        // Create LocalDateTime by parsing a string in ISO_LOCAL_DATE_TIME format, store it in a variable, and print it

        // Get the minimum possible LocalDateTime value using MIN constant, store it in a variable, and print it

        // Get the maximum possible LocalDateTime value using MAX constant, store it in a variable, and print it
    }

    private static void comparingLocalDateTimeInstances() {
        System.out.println("Comparing LocalDateTime Instances");

        // Create current date and time using now() method, store it in a variable, and print it

        // Create a specific future date and time using of() method, store it in a variable, and print it

        // Compare if now is before futureDateTime using isBefore() method, store result in a variable, and print it

        // Compare if now is after futureDateTime using isAfter() method, store result in a variable, and print it

        // Check if now equals futureDateTime using equals() method, store result in a variable, and print it
    }

    private static void retrievingValuesFromLocalDateTime() {
        System.out.println("Retrieving Values from LocalDateTime");

        // Create current date and time using now() method, store it in a variable, and print it

        // Get the year from the LocalDateTime, store it in a variable, and print it

        // Get the month from the LocalDateTime, store it in a variable, and print it

        // Get the day of month from the LocalDateTime, store it in a variable, and print it

        // Get the day of week from the LocalDateTime, store it in a variable, and print it

        // Get the day of year from the LocalDateTime, store it in a variable, and print it

        // Get the hour from the LocalDateTime, store it in a variable, and print it

        // Get the minute from the LocalDateTime, store it in a variable, and print it

        // Get the second from the LocalDateTime, store it in a variable, and print it

        // Get the nanosecond from the LocalDateTime, store it in a variable, and print it

        // Extract the date part from LocalDateTime using toLocalDate() method, store it in a variable, and print it

        // Extract the time part from LocalDateTime using toLocalTime() method, store it in a variable, and print it
    }

    private static void modifyingLocalDateTimeInstances() {
        System.out.println("Modifying LocalDateTime Instances");

        // Create current date and time using now() method, store it in a variable, and print it

        // Add 1 year to the original DateTime using plusYears() method, store result in a variable, and print it

        // Subtract 1 month from the original DateTime using minusMonths() method, store result in a variable, and print it

        // Add 1 week to the original DateTime using plusWeeks() method, store result in a variable, and print it

        // Add 2 days to the original DateTime using plusDays() method, store result in a variable, and print it

        // Add 3 hours to the original DateTime using plusHours() method, store result in a variable, and print it

        // Subtract 30 minutes from the original DateTime using minusMinutes() method, store result in a variable, and print it

        // Add 45 seconds to the original DateTime using plusSeconds() method, store result in a variable, and print it

        // Replace the year with 2030 using withYear() method, store result in a variable, and print it

        // Replace the month with 12 (December) using withMonth() method, store result in a variable, and print it

        // Replace the day of month with 25 using withDayOfMonth() method, store result in a variable, and print it

        // Replace the hour with 10 using withHour() method, store result in a variable, and print it

        // Replace the minute with 30 using withMinute() method, store result in a variable, and print it
    }

    private static void usingLocalDateTimeInDomainModel() {
        System.out.println("Using LocalDateTime in Domain Model");

        // Create a LocalDateTime for a specific appointment date and time using of() method, store it in a variable

        // Create an Appointment object with doctor name, purpose, and appointment date/time using constructor, store it in a variable

        // Retrieve the doctor name from the Appointment object using doctor() method, store it in a variable, and print it

        // Retrieve the appointment purpose from the Appointment object using purpose() method, store it in a variable, and print it

        // Retrieve the appointment date and time from the Appointment object using dateTime() method, store it in a variable, and print it
    }
}
