package com.modernjava._15datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class _4ZonedDateTime {

    public static void main(String[] args) {
        createZonedDateTimeInstances();
        System.out.println("\n-------------------\n");
        comparingZonedDateTimeInstances();
        System.out.println("\n-------------------\n");
        retrievingValuesFromZonedDateTime();
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

        // Current date and time in system default zone
        ZonedDateTime nowLocal = ZonedDateTime.now();
        System.out.println("Current date and time (system default zone): " + nowLocal);

        // Current date and time in specific zone
        ZonedDateTime nowNY = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current date and time in New York: " + nowNY);

        // From LocalDateTime with zone
        LocalDateTime local = LocalDateTime.now();
        ZonedDateTime fromLocal = local.atZone(ZoneId.of("Europe/London"));
        System.out.println("From LocalDateTime in London: " + fromLocal);

        // Specific date and time with zone
        ZonedDateTime specific = ZonedDateTime.of(
            2025, 12, 25, 20, 30, 45, 0,
            ZoneId.of("Asia/Tokyo")
        );
        System.out.println("Specific date and time in Tokyo: " + specific);

        // From string
        ZonedDateTime parsed = ZonedDateTime.parse("2025-12-25T20:30:45+09:00[Asia/Tokyo]");
        System.out.println("Parsed date and time: " + parsed);

        // Available zones
        System.out.println("\nSome available time zones:");
        ZoneId.getAvailableZoneIds().stream()
            .filter(zone -> zone.startsWith("America/") || zone.startsWith("Europe/") || zone.startsWith("Asia/"))
            .limit(5)
            .forEach(zone -> System.out.println("- " + zone));
    }

    private static void comparingZonedDateTimeInstances() {
        System.out.println("Comparing ZonedDateTime Instances");

        ZonedDateTime tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime nyTime = ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println("Tokyo time: " + tokyoTime);
        System.out.println("New York time: " + nyTime);
        System.out.println("Is Tokyo before NY? " + tokyoTime.isBefore(nyTime));
        System.out.println("Is Tokyo after NY? " + tokyoTime.isAfter(nyTime));
        System.out.println("Are they at the same instant? " + tokyoTime.toInstant().equals(nyTime.toInstant()));
    }

    private static void retrievingValuesFromZonedDateTime() {
        System.out.println("Retrieving Values from ZonedDateTime");

        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Complete ZonedDateTime: " + dateTime);

        // Zone information
        System.out.println("Time Zone: " + dateTime.getZone());
        System.out.println("Zone Offset: " + dateTime.getOffset());

        // Date components
        System.out.println("Year: " + dateTime.getYear());
        System.out.println("Month: " + dateTime.getMonth());
        System.out.println("Day of Month: " + dateTime.getDayOfMonth());
        System.out.println("Day of Week: " + dateTime.getDayOfWeek());

        // Time components
        System.out.println("Hour: " + dateTime.getHour());
        System.out.println("Minute: " + dateTime.getMinute());
        System.out.println("Second: " + dateTime.getSecond());

        // Converting to other types
        System.out.println("As LocalDateTime: " + dateTime.toLocalDateTime());
        System.out.println("As Instant: " + dateTime.toInstant());
    }

    private static void modifyingZonedDateTimeInstances() {
        System.out.println("Modifying ZonedDateTime Instances");

        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Original DateTime (Paris): " + dateTime);

        // Adding and subtracting
        System.out.println("Plus 1 year: " + dateTime.plusYears(1));
        System.out.println("Minus 1 month: " + dateTime.minusMonths(1));
        System.out.println("Plus 1 week: " + dateTime.plusWeeks(1));
        System.out.println("Plus 2 days: " + dateTime.plusDays(2));
        System.out.println("Plus 3 hours: " + dateTime.plusHours(3));

        // Using with methods
        System.out.println("With different year: " + dateTime.withYear(2030));
        System.out.println("With different zone: " + dateTime.withZoneSameInstant(ZoneId.of("America/New_York")));
        System.out.println("With different zone (same local time): " + dateTime.withZoneSameLocal(ZoneId.of("America/New_York")));
    }

    private static void handlingTimeZoneConversions() {
        System.out.println("Handling Time Zone Conversions");

        // Create a time in one zone
        ZonedDateTime sydneyTime = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println("Time in Sydney: " + sydneyTime);

        // Convert to other zones
        System.out.println("Same instant in:");
        System.out.println("- London: " + sydneyTime.withZoneSameInstant(ZoneId.of("Europe/London")));
        System.out.println("- New York: " + sydneyTime.withZoneSameInstant(ZoneId.of("America/New_York")));
        System.out.println("- Tokyo: " + sydneyTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo")));

        // Calculate time differences
        ZonedDateTime londonTime = sydneyTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        long hoursDiff = ChronoUnit.HOURS.between(londonTime, sydneyTime);
        System.out.println("Hours difference between Sydney and London: " + hoursDiff);
    }

    private static void dealingWithDaylightSavings() {
        System.out.println("Dealing with Daylight Savings Time (DST)");

        // Example with US DST transition (2nd Sunday in March)
        ZonedDateTime beforeDst = ZonedDateTime.of(
            2025, 3, 10, 1, 30, 0, 0,
            ZoneId.of("America/New_York")
        );
        System.out.println("Before DST transition: " + beforeDst);
        System.out.println("After adding 1 hour: " + beforeDst.plusHours(1));

        // Example with fall back (1st Sunday in November)
        ZonedDateTime beforeFallBack = ZonedDateTime.of(
            2025, 11, 3, 1, 30, 0, 0,
            ZoneId.of("America/New_York")
        );
        System.out.println("\nBefore fall back: " + beforeFallBack);
        System.out.println("After adding 1 hour: " + beforeFallBack.plusHours(1));

        // Check if time is in DST
        System.out.println("\nIs March time in DST? " + beforeDst.getZone().getRules().isDaylightSavings(beforeDst.toInstant()));
        System.out.println("Is November time in DST? " + beforeFallBack.getZone().getRules().isDaylightSavings(beforeFallBack.toInstant()));
    }


    private static void flightTravelExample() {
        System.out.println("Simple Example: Flight Travel Times");
        System.out.println("----------------------------------");

        // Flight from New York to London
        ZonedDateTime departureNY = ZonedDateTime.of(2025, 10, 15, 18, 30, 0, 0, ZoneId.of("America/New_York"));
        System.out.println("Departure from New York: " + departureNY);

        // Flight duration: 7 hours
        ZonedDateTime arrivalLondon = departureNY.plusHours(7).withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println("Arrival in London: " + arrivalLondon);

        // What time is it back home when you land?
        ZonedDateTime landingTimeInNY = arrivalLondon.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Landing time in New York timezone: " + landingTimeInNY);

        System.out.println("\nTime difference:");
        System.out.println("\nTime difference (computed):");
        System.out.println("- Departure (New York): " + departureNY.toLocalTime() + " " + departureNY.getZone());
        System.out.println("- Arrival (London): " + arrivalLondon.toLocalTime() + " " + arrivalLondon.getZone());
        System.out.println("- At that instant in New York: " + landingTimeInNY.toLocalTime() + " " + landingTimeInNY.getZone());
    }
}
