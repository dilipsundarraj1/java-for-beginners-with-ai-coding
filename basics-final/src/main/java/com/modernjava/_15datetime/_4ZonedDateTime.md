# _4ZonedDateTime.md

<!-- TOC -->
* [_4ZonedDateTime.md](#_4zoneddatetimemd)
  * [ZonedDateTime Basics in Java](#zoneddatetime-basics-in-java)
    * [1. Creating ZonedDateTime Instances](#1-creating-zoneddatetime-instances)
    * [2. Comparing ZonedDateTime Instances](#2-comparing-zoneddatetime-instances)
    * [3. Retrieving Values from ZonedDateTime](#3-retrieving-values-from-zoneddatetime)
    * [4. Modifying ZonedDateTime Instances](#4-modifying-zoneddatetime-instances)
    * [5. Handling Time Zone Conversions](#5-handling-time-zone-conversions)
    * [6. Dealing with Daylight Savings Time](#6-dealing-with-daylight-savings-time)
  * [Key Concepts Explained](#key-concepts-explained)
    * [What is ZonedDateTime?](#what-is-zoneddatetime)
    * [Why Use ZonedDateTime?](#why-use-zoneddatetime)
    * [Best Practices](#best-practices)
  * [Summary](#summary)
<!-- TOC -->

## ZonedDateTime Basics in Java

This document demonstrates the usage of `ZonedDateTime` in Java, including creation, retrieval, comparison, modification, and time zone handling. Each section provides a prompt to replicate a specific ZonedDateTime operation, with clear requirements and code patterns.

---

### 1. Creating ZonedDateTime Instances
**Prompt:** Create methods to demonstrate different ways to create ZonedDateTime instances.

**Requirements:**
- Print section header: "Creating ZonedDateTime Instances"
- Show creation for:
  - Current date and time in system default zone: `ZonedDateTime.now()`
  - Current date and time in specific zone: `ZonedDateTime.now(ZoneId.of("America/New_York"))`
  - From LocalDateTime with zone: `LocalDateTime.now().atZone(ZoneId.of("Europe/London"))`
  - Specific date and time with zone: `ZonedDateTime.of(2025, 12, 25, 20, 30, 45, 0, ZoneId.of("Asia/Tokyo"))`
  - From string: `ZonedDateTime.parse("2025-12-25T20:30:45+09:00[Asia/Tokyo]")`
- Print each result and demonstrate available time zones

**Example:**
```java
System.out.println("Creating ZonedDateTime Instances");

ZonedDateTime nowLocal = ZonedDateTime.now();
System.out.println("Current date and time (system default zone): " + nowLocal);

ZonedDateTime nowNY = ZonedDateTime.now(ZoneId.of("America/New_York"));
System.out.println("Current date and time in New York: " + nowNY);

LocalDateTime local = LocalDateTime.now();
ZonedDateTime fromLocal = local.atZone(ZoneId.of("Europe/London"));
System.out.println("From LocalDateTime in London: " + fromLocal);

ZonedDateTime specific = ZonedDateTime.of(2025, 12, 25, 20, 30, 45, 0, ZoneId.of("Asia/Tokyo"));
System.out.println("Specific date and time in Tokyo: " + specific);

ZonedDateTime parsed = ZonedDateTime.parse("2025-12-25T20:30:45+09:00[Asia/Tokyo]");
System.out.println("Parsed date and time: " + parsed);
```

### 2. Comparing ZonedDateTime Instances
**Prompt:** Create methods to demonstrate comparing ZonedDateTime instances across different time zones.

**Requirements:**
- Print section header: "Comparing ZonedDateTime Instances"
- Compare ZonedDateTime instances using:
  - `isBefore()`
  - `isAfter()`
  - `toInstant().equals()` for same instant comparison
- Print results of each comparison

**Example:**
```java
System.out.println("Comparing ZonedDateTime Instances");

ZonedDateTime tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
ZonedDateTime nyTime = ZonedDateTime.now(ZoneId.of("America/New_York"));

System.out.println("Tokyo time: " + tokyoTime);
System.out.println("New York time: " + nyTime);
System.out.println("Is Tokyo before NY? " + tokyoTime.isBefore(nyTime));
System.out.println("Is Tokyo after NY? " + tokyoTime.isAfter(nyTime));
System.out.println("Are they at the same instant? " + tokyoTime.toInstant().equals(nyTime.toInstant()));
```

### 3. Retrieving Values from ZonedDateTime
**Prompt:** Create methods to demonstrate retrieving various components from ZonedDateTime.

**Requirements:**
- Print section header: "Retrieving Values from ZonedDateTime"
- Show how to get:
  - Time Zone and Zone Offset information
  - Year, Month, Day components
  - Hour, Minute, Second components
  - Convert to LocalDateTime and Instant
- Print each component

**Example:**
```java
System.out.println("Retrieving Values from ZonedDateTime");

ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
System.out.println("Complete ZonedDateTime: " + dateTime);

System.out.println("Time Zone: " + dateTime.getZone());
System.out.println("Zone Offset: " + dateTime.getOffset());

System.out.println("Year: " + dateTime.getYear());
System.out.println("Month: " + dateTime.getMonth());
System.out.println("Day of Month: " + dateTime.getDayOfMonth());
System.out.println("Day of Week: " + dateTime.getDayOfWeek());

System.out.println("Hour: " + dateTime.getHour());
System.out.println("Minute: " + dateTime.getMinute());
System.out.println("Second: " + dateTime.getSecond());

System.out.println("As LocalDateTime: " + dateTime.toLocalDateTime());
System.out.println("As Instant: " + dateTime.toInstant());
```

### 4. Modifying ZonedDateTime Instances
**Prompt:** Create methods to demonstrate modifying ZonedDateTime instances.

**Requirements:**
- Print section header: "Modifying ZonedDateTime Instances"
- Show modifications using:
  - Plus/minus operations for various time units
  - With methods for changing specific fields
  - Zone changes with same instant vs. same local time
- Print results of each modification

**Example:**
```java
System.out.println("Modifying ZonedDateTime Instances");

ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
System.out.println("Original DateTime (Paris): " + dateTime);

System.out.println("Plus 1 year: " + dateTime.plusYears(1));
System.out.println("Minus 1 month: " + dateTime.minusMonths(1));
System.out.println("Plus 1 week: " + dateTime.plusWeeks(1));
System.out.println("Plus 2 days: " + dateTime.plusDays(2));
System.out.println("Plus 3 hours: " + dateTime.plusHours(3));

System.out.println("With different year: " + dateTime.withYear(2030));
System.out.println("With different zone: " + dateTime.withZoneSameInstant(ZoneId.of("America/New_York")));
System.out.println("With different zone (same local time): " + dateTime.withZoneSameLocal(ZoneId.of("America/New_York")));
```

### 5. Handling Time Zone Conversions
**Prompt:** Create methods to demonstrate time zone conversion capabilities.

**Requirements:**
- Print section header: "Handling Time Zone Conversions"
- Show how to:
  - Convert between different time zones
  - Calculate time differences between zones
  - Handle same instant in different zones
- Print results of conversions

**Example:**
```java
System.out.println("Handling Time Zone Conversions");

ZonedDateTime sydneyTime = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
System.out.println("Time in Sydney: " + sydneyTime);

System.out.println("Same instant in:");
System.out.println("- London: " + sydneyTime.withZoneSameInstant(ZoneId.of("Europe/London")));
System.out.println("- New York: " + sydneyTime.withZoneSameInstant(ZoneId.of("America/New_York")));
System.out.println("- Tokyo: " + sydneyTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo")));

ZonedDateTime londonTime = sydneyTime.withZoneSameInstant(ZoneId.of("Europe/London"));
long hoursDiff = ChronoUnit.HOURS.between(londonTime, sydneyTime);
System.out.println("Hours difference between Sydney and London: " + hoursDiff);
```

### 6. Dealing with Daylight Savings Time
**Prompt:** Create methods to demonstrate handling of Daylight Savings Time (DST) transitions.

**Requirements:**
- Print section header: "Dealing with Daylight Savings Time (DST)"
- Show handling of:
  - Spring forward transition
  - Fall back transition
  - DST status checks
- Print results of DST operations

**Example:**
```java
System.out.println("Dealing with Daylight Savings Time (DST)");

// Example with US DST transition (2nd Sunday in March)
ZonedDateTime beforeDst = ZonedDateTime.of(2025, 3, 10, 1, 30, 0, 0, ZoneId.of("America/New_York"));
System.out.println("Before DST transition: " + beforeDst);
System.out.println("After adding 1 hour: " + beforeDst.plusHours(1));

// Example with fall back (1st Sunday in November)
ZonedDateTime beforeFallBack = ZonedDateTime.of(2025, 11, 3, 1, 30, 0, 0, ZoneId.of("America/New_York"));
System.out.println("\nBefore fall back: " + beforeFallBack);
System.out.println("After adding 1 hour: " + beforeFallBack.plusHours(1));

System.out.println("\nIs March time in DST? " + beforeDst.getZone().getRules().isDaylightSavings(beforeDst.toInstant()));
System.out.println("Is November time in DST? " + beforeFallBack.getZone().getRules().isDaylightSavings(beforeFallBack.toInstant()));
```

### 7. Simple Real-World Example: Flight Travel
**Prompt:** Create a simple example demonstrating flight travel across time zones.

**Requirements:**
- Print section header: "Simple Example: Flight Travel Times"
- Show a flight scenario with:
  - Departure time in origin timezone
  - Arrival time in destination timezone after adding flight duration
  - What time it is back home when you land
- Print clear explanations of the time differences

**Example:**
```java
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
System.out.println("- You left at 6:30 PM New York time");
System.out.println("- You arrived at 1:30 AM London time (next day)");
System.out.println("- Back home it was 8:30 PM when you landed");
```

## Key Concepts Explained

### What is ZonedDateTime?
ZonedDateTime is a class in Java's Date-Time API that represents a complete date-time with time zone information. It stores:
- All date components (year, month, day)
- All time components (hour, minute, second, nanosecond)
- Time zone (region-based like "America/New_York")
- Zone offset (like +05:30 or -04:00)

### Why Use ZonedDateTime?
Use ZonedDateTime when you need to:
- Work with dates and times in different time zones
- Handle time zone conversions
- Deal with daylight savings time transitions
- Store or process global timestamps
- Schedule international events or meetings

### Best Practices
1. Always use region-based time zone IDs (e.g., "America/New_York") instead of fixed offsets
2. Be careful with DST transitions when adding or subtracting time
3. Use `withZoneSameInstant()` when converting between time zones to maintain the exact moment in time
4. Store timestamps in UTC (using `toInstant()`) when persisting to database
5. Consider using `ZonedDateTime` for any application dealing with international users or cross-time-zone operations

## Summary
ZonedDateTime is a powerful class for handling date-time values with time zone context. It's essential for:
- International applications
- Scheduling across time zones
- Handling timezone conversions
- Managing daylight savings transitions
- Global event coordination

The examples above demonstrate the key operations you'll commonly use with ZonedDateTime, including creation, modification, comparison, and time zone handling. Understanding these concepts is crucial for developing applications that work correctly across different time zones.
