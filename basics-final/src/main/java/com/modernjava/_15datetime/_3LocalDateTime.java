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
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);

        // Create LocalDateTime from LocalDate and LocalTime components using of() method, store it in a variable, and print it
        LocalDateTime fromComponents = LocalDateTime.of(LocalDate.now(), LocalTime.NOON);
        System.out.println("From date and time components: " + fromComponents);

        // Create LocalDateTime for a specific date and time using of() method, store it in a variable, and print it
        LocalDateTime specific = LocalDateTime.of(2025, 12, 25, 20, 30, 45);
        System.out.println("Specific date and time: " + specific);

        // Create LocalDateTime by parsing a string in ISO_LOCAL_DATE_TIME format, store it in a variable, and print it
        LocalDateTime parsed = LocalDateTime.parse("2025-12-25T20:30:45");
        System.out.println("Parsed date and time: " + parsed);

        // Get the minimum possible LocalDateTime value using MIN constant, store it in a variable, and print it
        LocalDateTime minDateTime = LocalDateTime.MIN;
        System.out.println("Minimum possible DateTime: " + minDateTime);

        // Get the maximum possible LocalDateTime value using MAX constant, store it in a variable, and print it
        LocalDateTime maxDateTime = LocalDateTime.MAX;
        System.out.println("Maximum possible DateTime: " + maxDateTime);
    }

    private static void comparingLocalDateTimeInstances() {
        System.out.println("Comparing LocalDateTime Instances");

        // Create current date and time using now() method, store it in a variable, and print it
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current DateTime: " + now);

        // Create a specific future date and time using of() method, store it in a variable, and print it
        LocalDateTime futureDateTime = LocalDateTime.of(2025, 12, 31, 23, 59, 59);
        System.out.println("Future DateTime: " + futureDateTime);

        // Compare if now is before futureDateTime using isBefore() method, store result in a variable, and print it
        boolean isNowBefore = now.isBefore(futureDateTime);
        System.out.println("Is now before future? " + isNowBefore);

        // Compare if now is after futureDateTime using isAfter() method, store result in a variable, and print it
        boolean isNowAfter = now.isAfter(futureDateTime);
        System.out.println("Is now after future? " + isNowAfter);

        // Check if now equals futureDateTime using equals() method, store result in a variable, and print it
        boolean areEqual = now.equals(futureDateTime);
        System.out.println("Are they equal? " + areEqual);
    }

    private static void retrievingValuesFromLocalDateTime() {
        System.out.println("Retrieving Values from LocalDateTime");

        // Create current date and time using now() method, store it in a variable, and print it
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Complete DateTime: " + dateTime);

        // Get the year from the LocalDateTime, store it in a variable, and print it
        int year = dateTime.getYear();
        System.out.println("Year: " + year);

        // Get the month from the LocalDateTime, store it in a variable, and print it
        Object month = dateTime.getMonth();
        System.out.println("Month: " + month);

        // Get the day of month from the LocalDateTime, store it in a variable, and print it
        int dayOfMonth = dateTime.getDayOfMonth();
        System.out.println("Day of Month: " + dayOfMonth);

        // Get the day of week from the LocalDateTime, store it in a variable, and print it
        Object dayOfWeek = dateTime.getDayOfWeek();
        System.out.println("Day of Week: " + dayOfWeek);

        // Get the day of year from the LocalDateTime, store it in a variable, and print it
        int dayOfYear = dateTime.getDayOfYear();
        System.out.println("Day of Year: " + dayOfYear);

        // Get the hour from the LocalDateTime, store it in a variable, and print it
        int hour = dateTime.getHour();
        System.out.println("Hour: " + hour);

        // Get the minute from the LocalDateTime, store it in a variable, and print it
        int minute = dateTime.getMinute();
        System.out.println("Minute: " + minute);

        // Get the second from the LocalDateTime, store it in a variable, and print it
        int second = dateTime.getSecond();
        System.out.println("Second: " + second);

        // Get the nanosecond from the LocalDateTime, store it in a variable, and print it
        int nano = dateTime.getNano();
        System.out.println("Nano: " + nano);

        // Extract the date part from LocalDateTime using toLocalDate() method, store it in a variable, and print it
        LocalDate datePart = dateTime.toLocalDate();
        System.out.println("Date part: " + datePart);

        // Extract the time part from LocalDateTime using toLocalTime() method, store it in a variable, and print it
        LocalTime timePart = dateTime.toLocalTime();
        System.out.println("Time part: " + timePart);
    }

    private static void modifyingLocalDateTimeInstances() {
        System.out.println("Modifying LocalDateTime Instances");

        // Create current date and time using now() method, store it in a variable, and print it
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Original DateTime: " + dateTime);

        // Add 1 year to the original DateTime using plusYears() method, store result in a variable, and print it
        LocalDateTime plusOneYear = dateTime.plusYears(1);
        System.out.println("Plus 1 year: " + plusOneYear);

        // Subtract 1 month from the original DateTime using minusMonths() method, store result in a variable, and print it
        LocalDateTime minusOneMonth = dateTime.minusMonths(1);
        System.out.println("Minus 1 month: " + minusOneMonth);

        // Add 1 week to the original DateTime using plusWeeks() method, store result in a variable, and print it
        LocalDateTime plusOneWeek = dateTime.plusWeeks(1);
        System.out.println("Plus 1 week: " + plusOneWeek);

        // Add 2 days to the original DateTime using plusDays() method, store result in a variable, and print it
        LocalDateTime plusTwoDays = dateTime.plusDays(2);
        System.out.println("Plus 2 days: " + plusTwoDays);

        // Add 3 hours to the original DateTime using plusHours() method, store result in a variable, and print it
        LocalDateTime plusThreeHours = dateTime.plusHours(3);
        System.out.println("Plus 3 hours: " + plusThreeHours);

        // Subtract 30 minutes from the original DateTime using minusMinutes() method, store result in a variable, and print it
        LocalDateTime minusThirtyMinutes = dateTime.minusMinutes(30);
        System.out.println("Minus 30 minutes: " + minusThirtyMinutes);

        // Add 45 seconds to the original DateTime using plusSeconds() method, store result in a variable, and print it
        LocalDateTime plusFortyFiveSeconds = dateTime.plusSeconds(45);
        System.out.println("Plus 45 seconds: " + plusFortyFiveSeconds);

        // Replace the year with 2030 using withYear() method, store result in a variable, and print it
        LocalDateTime withYear2030 = dateTime.withYear(2030);
        System.out.println("With different year: " + withYear2030);

        // Replace the month with 12 (December) using withMonth() method, store result in a variable, and print it
        LocalDateTime withMonthDecember = dateTime.withMonth(12);
        System.out.println("With different month: " + withMonthDecember);

        // Replace the day of month with 25 using withDayOfMonth() method, store result in a variable, and print it
        LocalDateTime withDay25 = dateTime.withDayOfMonth(25);
        System.out.println("With different day: " + withDay25);

        // Replace the hour with 10 using withHour() method, store result in a variable, and print it
        LocalDateTime withHour10 = dateTime.withHour(10);
        System.out.println("With different hour: " + withHour10);

        // Replace the minute with 30 using withMinute() method, store result in a variable, and print it
        LocalDateTime withMinute30 = dateTime.withMinute(30);
        System.out.println("With different minute: " + withMinute30);
    }

    private static void usingLocalDateTimeInDomainModel() {
        System.out.println("Using LocalDateTime in Domain Model");

        // Create a LocalDateTime for a specific appointment date and time using of() method, store it in a variable
        LocalDateTime appointmentDateTime = LocalDateTime.of(2025, 10, 15, 14, 30);

        // Create an Appointment object with doctor name, purpose, and appointment date/time using constructor, store it in a variable
        Appointment doctorAppointment = new Appointment(
            "Dr. Smith",
            "Regular Checkup",
            appointmentDateTime
        );

        // Retrieve the doctor name from the Appointment object using doctor() method, store it in a variable, and print it
        String doctorName = doctorAppointment.doctor();
        System.out.println("Appointment Details:");
        System.out.println("Doctor: " + doctorName);

        // Retrieve the appointment purpose from the Appointment object using purpose() method, store it in a variable, and print it
        String purpose = doctorAppointment.purpose();
        System.out.println("Purpose: " + purpose);

        // Retrieve the appointment date and time from the Appointment object using dateTime() method, store it in a variable, and print it
        LocalDateTime dateTime = doctorAppointment.dateTime();
        System.out.println("DateTime: " + dateTime);
    }
}
