package com.modernjava._15datetime;

import com.modernjava.domain.Appointment;

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
        handlingTimeZoneConversions();

        flightTravelExample();

        System.out.println("\n-------------------\n");
        understandingInstant();

        convertInstantToZonedDateTimes();
        compareAndModifyInstants();


        System.out.println("\n-------------------\n");

        System.out.println("\n-------------------\n");
        dealingWithDaylightSavings();
        System.out.println("\n-------------------\n");


    }

    private static void createZonedDateTimeInstances() {
        System.out.println("Creating ZonedDateTime Instances");

        // Create ZonedDateTime for current date and time in system default zone using now() method, store it in a variable, and print it
        ZonedDateTime nowLocal = ZonedDateTime.now();
        System.out.println("Current date and time (system default zone): " + nowLocal);


        // Create ZonedDateTime for current date and time in specific zone using now(ZoneId) method, store it in a variable, and print it
        ZonedDateTime nowNY = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current date and time in New York: " + nowNY);

        // Create ZonedDateTime from LocalDateTime with zone using atZone() method, store it in a variable, and print it
        // This just attached the zone information to the local date-time without changing the actual date-time values.
        LocalDateTime local = LocalDateTime.now();
        ZonedDateTime fromLocal = local.atZone(ZoneId.of("Europe/London"));
        System.out.println("From LocalDateTime in London: " + fromLocal);

        // Create ZonedDateTime for specific date and time with zone using of() method, store it in a variable, and print it
        ZonedDateTime specific = ZonedDateTime.of(
                2025, 12, 25, 20, 30, 45, 0,
                ZoneId.of("Asia/Tokyo")
        );
        System.out.println("Specific date and time in Tokyo: " + specific);

        // Create ZonedDateTime by parsing a string in ISO-8601 format with zone, store it in a variable, and print it
        ZonedDateTime parsed = ZonedDateTime.parse("2025-12-25T20:30:45+09:00[Asia/Tokyo]");
        System.out.println("Parsed date and time: " + parsed);

        // Get and display some available time zones using getAvailableZoneIds(), filter, and print them
        System.out.println("\nSome available time zones:");
        ZoneId.getAvailableZoneIds().stream()
                .filter(zone -> zone.startsWith("America/") || zone.startsWith("Europe/") || zone.startsWith("Asia/"))
                .limit(5)
                .forEach(zone -> System.out.println("- " + zone));
    }

    private static void comparingZonedDateTimeInstances() {
        System.out.println("Comparing ZonedDateTime Instances");

        // Create ZonedDateTime for current date and time in Tokyo zone using now(ZoneId) method, store it in a variable, and print it
        ZonedDateTime tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Tokyo time: " + tokyoTime);

        // Create ZonedDateTime for current date and time in New York zone using now(ZoneId) method, store it in a variable, and print it
        ZonedDateTime nyTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("New York time: " + nyTime);

        // Compare if tokyoTime is before nyTime using isBefore() method, store result in a variable, and print it
        boolean isTokyoBefore = tokyoTime.isBefore(nyTime);
        System.out.println("Is Tokyo before NY? " + isTokyoBefore);

        // Compare if tokyoTime is after nyTime using isAfter() method, store result in a variable, and print it
        boolean isTokyoAfter = tokyoTime.isAfter(nyTime);
        System.out.println("Is Tokyo after NY? " + isTokyoAfter);

        // Compare if tokyoTime and nyTime are same using the equals() method, store result in a variable, and print it
        boolean areSameInstant = tokyoTime.toInstant().equals(nyTime.toInstant());
        System.out.println("Are they at the same instant? " + areSameInstant);


    }

    private static void retrievingValuesFromZonedDateTime() {
        System.out.println("Retrieving Values from ZonedDateTime");

        // Create current date and time in specific zone using now(ZoneId) method, store it in a variable, and print it
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Complete ZonedDateTime: " + dateTime);

        // Get the time zone from the ZonedDateTime using getZone() method, store it in a variable, and print it
        ZoneId zone = dateTime.getZone();
        System.out.println("Time Zone: " + zone);

        // Get the zone offset from the ZonedDateTime using getOffset() method, store it in a variable, and print it
        ZoneOffset offset = dateTime.getOffset();
        System.out.println("Zone Offset: " + offset);

        // Get the year from the ZonedDateTime using getYear() method, store it in a variable, and print it
        int year = dateTime.getYear();
        System.out.println("Year: " + year);

        // Get the month from the ZonedDateTime using getMonth() method, store it in a variable, and print it
        Object month = dateTime.getMonth();
        System.out.println("Month: " + month);

        // Get the day of month from the ZonedDateTime using getDayOfMonth() method, store it in a variable, and print it
        int dayOfMonth = dateTime.getDayOfMonth();
        System.out.println("Day of Month: " + dayOfMonth);

        // Get the day of week from the ZonedDateTime using getDayOfWeek() method, store it in a variable, and print it
        Object dayOfWeek = dateTime.getDayOfWeek();
        System.out.println("Day of Week: " + dayOfWeek);

        // Get the hour from the ZonedDateTime using getHour() method, store it in a variable, and print it
        int hour = dateTime.getHour();
        System.out.println("Hour: " + hour);

        // Get the minute from the ZonedDateTime using getMinute() method, store it in a variable, and print it
        int minute = dateTime.getMinute();
        System.out.println("Minute: " + minute);

        // Get the second from the ZonedDateTime using getSecond() method, store it in a variable, and print it
        int second = dateTime.getSecond();
        System.out.println("Second: " + second);

        // Convert ZonedDateTime to LocalDateTime using toLocalDateTime() method, store it in a variable, and print it
        LocalDateTime localDateTime = dateTime.toLocalDateTime();
        System.out.println("As LocalDateTime: " + localDateTime);

    }

    private static void modifyingZonedDateTimeInstances() {
        System.out.println("Modifying ZonedDateTime Instances");

        // Create current date and time in Paris zone using now(ZoneId) method, store it in a variable, and print it
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Original DateTime (Paris): " + dateTime);

        // Add 1 year to the original ZonedDateTime using plusYears() method, store result in a variable, and print it
        ZonedDateTime plusOneYear = dateTime.plusYears(1);
        System.out.println("Plus 1 year: " + plusOneYear);

        // Subtract 1 month from the original ZonedDateTime using minusMonths() method, store result in a variable, and print it
        ZonedDateTime minusOneMonth = dateTime.minusMonths(1);
        System.out.println("Minus 1 month: " + minusOneMonth);

        // Add 1 week to the original ZonedDateTime using plusWeeks() method, store result in a variable, and print it
        ZonedDateTime plusOneWeek = dateTime.plusWeeks(1);
        System.out.println("Plus 1 week: " + plusOneWeek);

        // Add 2 days to the original ZonedDateTime using plusDays() method, store result in a variable, and print it
        ZonedDateTime plusTwoDays = dateTime.plusDays(2);
        System.out.println("Plus 2 days: " + plusTwoDays);

        // Add 3 hours to the original ZonedDateTime using plusHours() method, store result in a variable, and print it
        ZonedDateTime plusThreeHours = dateTime.plusHours(3);
        System.out.println("Plus 3 hours: " + plusThreeHours);

        // Replace the year with 2030 using withYear() method, store result in a variable, and print it
        ZonedDateTime withYear2030 = dateTime.withYear(2030);
        System.out.println("With different year: " + withYear2030);

    }

    private static void handlingTimeZoneConversions() {
        System.out.println("Handling Time Zone Conversions");

        // Create a time in Sydney zone using now(ZoneId) method, store it in a variable, and print it
        ZonedDateTime parisTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Time in Sydney: " + parisTime);

        // Convert to New York zone while keeping the same instant using withZoneSameInstant() method, store result in a variable, and print it
        //withZoneSameInstant :
        //  In other words, it answers the question: "What time is it in a different timezone at this exact same moment?"
        //For example, if it's 3:00 PM in Paris, withZoneSameInstant() will calculate what time it is in New York at that exact same instant (which would be earlier in the day due to the time zone difference).
        ZonedDateTime withZoneNY = parisTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("With different zone: " + withZoneNY);


        // Convert Sydney time to London zone keeping the same instant using withZoneSameInstant() method, store it in a variable, and print it
        ZonedDateTime londonTime = parisTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println("Same instant in London: " + londonTime);

        // Convert Sydney time to Tokyo zone keeping the same instant using withZoneSameInstant() method, store it in a variable, and print it
        ZonedDateTime tokyoTime = parisTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println("Same instant in Tokyo: " + tokyoTime);


        // Calculate the hours difference between London and Sydney using ChronoUnit.HOURS.between() method, store result in a variable, and print it
        long hoursDiff = ChronoUnit.HOURS.between(londonTime, parisTime);
        System.out.println("Hours difference between paris and London: " + hoursDiff);

        // Convert to New York zone while keeping the same local time using withZoneSameLocal() method, store result in a variable, and print it
        ZonedDateTime withZoneNYLocal = parisTime.withZoneSameLocal(ZoneId.of("America/New_York"));
        System.out.println("With different zone (same local time): " + withZoneNYLocal);
    }

    private static void dealingWithDaylightSavings() {
        System.out.println("Dealing with Daylight Savings Time (DST)");

        // Create a ZonedDateTime before DST transition (2nd Sunday in March) using of() method, store it in a variable, and print it
        ZonedDateTime beforeDst = ZonedDateTime.of(
                2025, 3, 10, 1, 30, 0, 0,
                ZoneId.of("America/New_York")
        );
        System.out.println("Before DST transition: " + beforeDst);

        // Add 1 hour to the time before DST using plusHours() method, store result in a variable, and print it
        ZonedDateTime afterDstHour = beforeDst.plusHours(1);
        System.out.println("After adding 1 hour: " + afterDstHour);

        // Create a ZonedDateTime before fall back transition (1st Sunday in November) using of() method, store it in a variable, and print it
        ZonedDateTime beforeFallBack = ZonedDateTime.of(
                2025, 11, 3, 1, 30, 0, 0,
                ZoneId.of("America/New_York")
        );
        System.out.println("\nBefore fall back: " + beforeFallBack);

        // Add 1 hour to the time before fall back using plusHours() method, store result in a variable, and print it
        ZonedDateTime afterFallBackHour = beforeFallBack.plusHours(1);
        System.out.println("After adding 1 hour: " + afterFallBackHour);

        // Check if March time is in DST using getZone().getRules().isDaylightSavings() method, store result in a variable, and print it
        boolean isMarchInDst = beforeDst.getZone().getRules().isDaylightSavings(beforeDst.toInstant());
        System.out.println("\nIs March time in DST? " + isMarchInDst);

        // Check if November time is in DST using getZone().getRules().isDaylightSavings() method, store result in a variable, and print it
        boolean isNovemberInDst = beforeFallBack.getZone().getRules().isDaylightSavings(beforeFallBack.toInstant());
        System.out.println("Is November time in DST? " + isNovemberInDst);
    }


    private static void flightTravelExample() {
        System.out.println("Simple Example: Flight Travel Times");
        System.out.println("----------------------------------");

        // Create a departure time from New York using of() method, store it in a variable, and print it
        ZonedDateTime departureNY = ZonedDateTime.of(2025, 10, 15, 18, 30, 0, 0, ZoneId.of("America/New_York"));
        System.out.println("Departure from New York: " + departureNY);

        // Calculate arrival time in London by adding 7 hours and converting to London zone using plusHours() and withZoneSameInstant() methods, store result in a variable, and print it
        ZonedDateTime arrivalLondon = departureNY.plusHours(7).withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println("Arrival in London: " + arrivalLondon);

        // Convert the landing time back to New York timezone to see what time it is at home using withZoneSameInstant() method, store it in a variable, and print it
        ZonedDateTime landingTimeInNY = arrivalLondon.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Landing time in New York timezone: " + landingTimeInNY);

        // Calculate the time difference in hours between departure and arrival using ChronoUnit.HOURS.between() method, store result in a variable, and print it
        long hoursDifference = ChronoUnit.HOURS.between(departureNY, arrivalLondon);
        System.out.println("Time difference (hours): " + hoursDifference);



        System.out.println("\nTime difference:");
        System.out.println("\nTime difference (computed):");

        // Extract the local time from departure in New York using toLocalTime() method, store it in a variable, and print it with zone
        System.out.println("- Departure (New York): " + departureNY.toLocalTime() + " " + departureNY.getZone());

        // Extract the local time from arrival in London using toLocalTime() method, store it in a variable, and print it with zone
        System.out.println("- Arrival (London): " + arrivalLondon.toLocalTime() + " " + arrivalLondon.getZone());

        // Extract the local time from landing in New York using toLocalTime() method, store it in a variable, and print it with zone
        System.out.println("- At that instant in New York: " + landingTimeInNY.toLocalTime() + " " + landingTimeInNY.getZone());
    }

    private static void understandingInstant() {
        System.out.println("Understanding Instant");
        System.out.println("==========================================");
        System.out.println("Instant represents a single point in time (UTC/GMT)");
        System.out.println("It is timezone-agnostic and cannot be displayed in local time directly");
        System.out.println("Instant is useful for logging, measuring durations, and comparing timestamps");

        System.out.println("\n--- Creating Instant Instances ---");

        // Create an Instant for the current moment using now() method, store it in a variable, and print it
        Instant currentInstant = Instant.now();
        System.out.println("Current instant: " + currentInstant);

        // Create an Instant by parsing an ISO-8601 string using parse() method, store it in a variable, and print it
        Instant parsed = Instant.parse("2025-12-25T20:30:45Z");
        System.out.println("Parsed instant: " + parsed);

        // Create an Instant from a specific epoch using ofEpochSecond() method with seconds since Jan 1, 1970, store it in a variable, and print it
        Instant fromEpochSecond = Instant.ofEpochSecond(1234567890);
        System.out.println("From epoch seconds (1234567890): " + fromEpochSecond);

        // Create an Instant from a specific epoch using ofEpochMilli() method with milliseconds since Jan 1, 1970, store it in a variable, and print it
        Instant fromEpochMilli = Instant.ofEpochMilli(1234567890123L);
        System.out.println("From epoch milliseconds: " + fromEpochMilli);


        System.out.println("\n--- Retrieving Values from Instant ---");

        // Create a current instant using now() method, store it in a variable, and print it
        Instant now = Instant.now();
        System.out.println("Current instant: " + now);

        // Get the number of seconds since epoch (Jan 1, 1970 UTC) using getEpochSecond() method, store it in a variable, and print it
        long epochSeconds = now.getEpochSecond();
        System.out.println("Seconds since epoch: " + epochSeconds);

        // Get the nanosecond adjustment from the epoch second using getNano() method, store it in a variable, and print it
        int nanoAdjustment = now.getNano();
        System.out.println("Nanosecond adjustment: " + nanoAdjustment);

        // Get the number of milliseconds since epoch using toEpochMilli() method, store it in a variable, and print it
        long epochMillis = now.toEpochMilli();
        System.out.println("Milliseconds since epoch: " + epochMillis);




    }

    private static void convertInstantToZonedDateTimes() {
        System.out.println("\n--- Converting Between Instant and ZonedDateTime ---");

        // Create a ZonedDateTime for a specific date and time using of() method, store it in a variable
        ZonedDateTime dateTimeNY = ZonedDateTime.of(2025, 10, 15, 18, 30, 0, 0, ZoneId.of("America/New_York"));
        System.out.println("Original ZonedDateTime (New York): " + dateTimeNY);

        // Convert ZonedDateTime to Instant using toInstant() method, store it in a variable, and print it
        Instant instantFromZDT = dateTimeNY.toInstant();
        System.out.println("As instant: " + instantFromZDT);

        // Convert Instant back to ZonedDateTime in London zone using atZone() method, store it in a variable, and print it
        ZonedDateTime dateTimeLondon = instantFromZDT.atZone(ZoneId.of("Europe/London"));
        System.out.println("Same instant in London: " + dateTimeLondon);

        // Convert Instant back to ZonedDateTime in Tokyo zone using atZone() method, store it in a variable, and print it
        ZonedDateTime dateTimeTokyo = instantFromZDT.atZone(ZoneId.of("Asia/Tokyo"));
        System.out.println("Same instant in Tokyo: " + dateTimeTokyo);
    }

    private static void compareAndModifyInstants() {
        System.out.println("\n--- Comparing Instant Instances ---");

        // Create two Instant objects using now() method with a small delay, store them in variables
        Instant instant1 = Instant.now();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Instant instant2 = Instant.now();

        // Compare if instant1 is before instant2 using isBefore() method, store result in a variable, and print it
        boolean isBefore = instant1.isBefore(instant2);
        System.out.println("Is instant1 before instant2? " + isBefore);

        // Compare if instant1 is after instant2 using isAfter() method, store result in a variable, and print it
        boolean isAfter = instant1.isAfter(instant2);
        System.out.println("Is instant1 after instant2? " + isAfter);

        // Check if two instants are equal using equals() method, store result in a variable, and print it
        boolean areEqual = instant1.equals(instant2);
        System.out.println("Are instant1 and instant2 equal? " + areEqual);

        System.out.println("\n--- Modifying Instant Instances ---");

        // Create a current instant using now() method, store it in a variable, and print it
        Instant baseInstant = Instant.now();
        System.out.println("Original instant: " + baseInstant);

        // Add 1 hour (3600 seconds) to the instant using plusSeconds() method, store result in a variable, and print it
        Instant plusOneHour = baseInstant.plusSeconds(3600);
        System.out.println("Plus 1 hour: " + plusOneHour);

        // Subtract 1 day (86400 seconds) from the instant using minusSeconds() method, store result in a variable, and print it
        Instant minusOneDay = baseInstant.minusSeconds(86400);
        System.out.println("Minus 1 day: " + minusOneDay);

        // Add 30 days using plusSeconds() method (30 * 86400 seconds), store result in a variable, and print it
        Instant plusThirtyDays = baseInstant.plusSeconds(30 * 86400);
        System.out.println("Plus 30 days: " + plusThirtyDays);
    }
}
