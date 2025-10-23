package com.modernjava._15datetime;

import com.modernjava.domain.Appointment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _3LocalDateTime {

    public static void main(String[] args) {
        createLocalDateTimeInstances();
        System.out.println("\n-------------------\n");
        comparingLocalDateTimeInstances();
        System.out.println("\n-------------------\n");
        retrievingValuesFromLocalDateTime();
        System.out.println("\n-------------------\n");
        modifyingLocalDateTimeInstances();
        System.out.println("\n-------------------\n");
        usingLocalDateTimeInDomainModel();
    }

    private static void createLocalDateTimeInstances() {
        System.out.println("Creating LocalDateTime Instances");

        // Current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);

        // From LocalDate and LocalTime
        LocalDateTime fromComponents = LocalDateTime.of(LocalDate.now(), LocalTime.NOON);
        System.out.println("From date and time components: " + fromComponents);

        // Specific date and time
        LocalDateTime specific = LocalDateTime.of(2025, 12, 25, 20, 30, 45);
        System.out.println("Specific date and time: " + specific);

        // From string
        LocalDateTime parsed = LocalDateTime.parse("2025-12-25T20:30:45");
        System.out.println("Parsed date and time: " + parsed);

        // Min and Max values
        System.out.println("Minimum possible DateTime: " + LocalDateTime.MIN);
        System.out.println("Maximum possible DateTime: " + LocalDateTime.MAX);
    }

    private static void comparingLocalDateTimeInstances() {
        System.out.println("Comparing LocalDateTime Instances");

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime futureDateTime = LocalDateTime.of(2025, 12, 31, 23, 59, 59);

        System.out.println("Current DateTime: " + now);
        System.out.println("Future DateTime: " + futureDateTime);
        System.out.println("Is now before future? " + now.isBefore(futureDateTime));
        System.out.println("Is now after future? " + now.isAfter(futureDateTime));
        System.out.println("Are they equal? " + now.equals(futureDateTime));
    }

    private static void retrievingValuesFromLocalDateTime() {
        System.out.println("Retrieving Values from LocalDateTime");

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Complete DateTime: " + dateTime);

        // Date components
        System.out.println("Year: " + dateTime.getYear());
        System.out.println("Month: " + dateTime.getMonth());
        System.out.println("Day of Month: " + dateTime.getDayOfMonth());
        System.out.println("Day of Week: " + dateTime.getDayOfWeek());
        System.out.println("Day of Year: " + dateTime.getDayOfYear());

        // Time components
        System.out.println("Hour: " + dateTime.getHour());
        System.out.println("Minute: " + dateTime.getMinute());
        System.out.println("Second: " + dateTime.getSecond());
        System.out.println("Nano: " + dateTime.getNano());

        // Extracting LocalDate and LocalTime
        System.out.println("Date part: " + dateTime.toLocalDate());
        System.out.println("Time part: " + dateTime.toLocalTime());
    }

    private static void modifyingLocalDateTimeInstances() {
        System.out.println("Modifying LocalDateTime Instances");

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Original DateTime: " + dateTime);

        // Adding and subtracting
        System.out.println("Plus 1 year: " + dateTime.plusYears(1));
        System.out.println("Minus 1 month: " + dateTime.minusMonths(1));
        System.out.println("Plus 1 week: " + dateTime.plusWeeks(1));
        System.out.println("Plus 2 days: " + dateTime.plusDays(2));
        System.out.println("Plus 3 hours: " + dateTime.plusHours(3));
        System.out.println("Minus 30 minutes: " + dateTime.minusMinutes(30));
        System.out.println("Plus 45 seconds: " + dateTime.plusSeconds(45));

        // Using with methods
        System.out.println("With different year: " + dateTime.withYear(2030));
        System.out.println("With different month: " + dateTime.withMonth(12));
        System.out.println("With different day: " + dateTime.withDayOfMonth(25));
        System.out.println("With different hour: " + dateTime.withHour(10));
        System.out.println("With different minute: " + dateTime.withMinute(30));
    }

    private static void usingLocalDateTimeInDomainModel() {
        System.out.println("Using LocalDateTime in Domain Model");

        // Example of appointment scheduling
        Appointment doctorAppointment = new Appointment(
            "Dr. Smith",
            "Regular Checkup",
            LocalDateTime.of(2025, 10, 15, 14, 30)
        );

        System.out.println("Appointment Details:");
        System.out.println("Doctor: " + doctorAppointment.doctor());
        System.out.println("Purpose: " + doctorAppointment.purpose());
        System.out.println("DateTime: " + doctorAppointment.dateTime());
    }
}

// Example domain record
