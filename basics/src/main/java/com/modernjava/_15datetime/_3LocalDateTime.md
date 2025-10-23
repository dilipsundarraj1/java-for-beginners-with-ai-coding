# _3LocalDateTime.md

<!-- TOC -->
* [_3LocalDateTime.md](#_3localdatetimemd)
  * [LocalDateTime Basics in Java](#localdatetime-basics-in-java)
    * [1. Creating LocalDateTime Instances](#1-creating-localdatetime-instances)
    * [2. Comparing LocalDateTime Instances](#2-comparing-localdatetime-instances)
    * [3. Retrieving Values from LocalDateTime](#3-retrieving-values-from-localdatetime)
    * [4. Modifying LocalDateTime Instances](#4-modifying-localdatetime-instances)
    * [5. Practice Exercise: Creating an Appointment Record](#5-practice-exercise-creating-an-appointment-record)
    * [6. Using LocalDateTime in a Domain Model](#6-using-localdatetime-in-a-domain-model)
  * [Key Concepts Explained](#key-concepts-explained)
    * [What is LocalDateTime?](#what-is-localdatetime)
    * [Why Use LocalDateTime?](#why-use-localdatetime)
    * [Best Practices](#best-practices)
  * [Summary](#summary)
<!-- TOC -->

## LocalDateTime Basics in Java

This document demonstrates the usage of `LocalDateTime` in Java, including creation, retrieval, comparison, and modification. Each section provides a prompt to replicate a specific LocalDateTime operation, with clear requirements and code patterns.

---

### 1. Creating LocalDateTime Instances
**Prompt:** Create methods to demonstrate different ways to create LocalDateTime instances.

**Requirements:**
- Print section header: "Creating LocalDateTime Instances"
- Show creation for:
  - Current date and time: `LocalDateTime.now()`
  - From LocalDate and LocalTime components: `LocalDateTime.of(LocalDate.now(), LocalTime.NOON)`
  - Specific date and time: `LocalDateTime.of(2025, 12, 25, 20, 30, 45)`
  - From string: `LocalDateTime.parse("2025-12-25T20:30:45")`
  - Min and Max values: `LocalDateTime.MIN` and `LocalDateTime.MAX`
- Print each result

**Example:**
```java
System.out.println("Creating LocalDateTime Instances");

LocalDateTime now = LocalDateTime.now();
System.out.println("Current date and time: " + now);

LocalDateTime fromComponents = LocalDateTime.of(LocalDate.now(), LocalTime.NOON);
System.out.println("From date and time components: " + fromComponents);

LocalDateTime specific = LocalDateTime.of(2025, 12, 25, 20, 30, 45);
System.out.println("Specific date and time: " + specific);

LocalDateTime parsed = LocalDateTime.parse("2025-12-25T20:30:45");
System.out.println("Parsed date and time: " + parsed);

System.out.println("Minimum possible DateTime: " + LocalDateTime.MIN);
System.out.println("Maximum possible DateTime: " + LocalDateTime.MAX);
```

### 2. Comparing LocalDateTime Instances
**Prompt:** Create methods to demonstrate comparing LocalDateTime instances.

**Requirements:**
- Print section header: "Comparing LocalDateTime Instances"
- Compare two LocalDateTime instances using:
  - `isBefore()`
  - `isAfter()`
  - `equals()`
- Print results of each comparison

**Example:**
```java
System.out.println("Comparing LocalDateTime Instances");

LocalDateTime now = LocalDateTime.now();
LocalDateTime futureDateTime = LocalDateTime.of(2025, 12, 31, 23, 59, 59);

System.out.println("Current DateTime: " + now);
System.out.println("Future DateTime: " + futureDateTime);
System.out.println("Is now before future? " + now.isBefore(futureDateTime));
System.out.println("Is now after future? " + now.isAfter(futureDateTime));
System.out.println("Are they equal? " + now.equals(futureDateTime));
```

### 3. Retrieving Values from LocalDateTime
**Prompt:** Create methods to demonstrate retrieving various components from LocalDateTime.

**Requirements:**
- Print section header: "Retrieving Values from LocalDateTime"
- Show how to get:
  - Year, Month, Day of Month
  - Day of Week, Day of Year
  - Hour, Minute, Second, Nano
  - Extract LocalDate and LocalTime parts
- Print each component

**Example:**
```java
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

// Extracting parts
System.out.println("Date part: " + dateTime.toLocalDate());
System.out.println("Time part: " + dateTime.toLocalTime());
```

### 4. Modifying LocalDateTime Instances
**Prompt:** Create methods to demonstrate modifying LocalDateTime instances.

**Requirements:**
- Print section header: "Modifying LocalDateTime Instances"
- Show how to:
  - Add/subtract years, months, weeks, days
  - Add/subtract hours, minutes, seconds
  - Set specific year, month, day, hour, minute values
- Print results of each modification

**Example:**
```java
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
```

### 5. Practice Exercise: Creating an Appointment Record
**Prompt:** Create a record class named `Appointment` to represent a doctor's appointment using LocalDateTime.

**Requirements:**
- Create a record named `Appointment` in the `com.modernjava.domain` package
- The record should have the following components:
  - `doctor` - String representing the doctor's name
  - `purpose` - String describing the purpose of the appointment
  - `dateTime` - LocalDateTime for the appointment date and time
- The record should be simple and immutable
- No additional validation is required

**Expected Solution:**
```java
package com.modernjava.domain;

import java.time.LocalDateTime;

public record Appointment(String doctor, String purpose, LocalDateTime dateTime) {}
```

**Usage Example:**
```java
// Creating an appointment
Appointment checkup = new Appointment(
    "Dr. Smith",
    "Annual Physical",
    LocalDateTime.of(2025, 10, 15, 14, 30)
);

// Accessing appointment details
System.out.println("Doctor: " + checkup.doctor());
System.out.println("Purpose: " + checkup.purpose());
System.out.println("Date/Time: " + checkup.dateTime());
```

**Key Points:**
- Records automatically provide getters (accessed using component names)
- All fields are final (immutable)
- toString(), equals(), and hashCode() are automatically generated
- Perfect for representing immutable data like appointments

### 6. Using LocalDateTime in a Domain Model
**Prompt:** Create an example showing how to use LocalDateTime in a domain model.

**Requirements:**
- Print section header: "Using LocalDateTime in Domain Model"
- Use the previously created Appointment record
- Show how to:
  - Create multiple instances with different LocalDateTime values
  - Access and compare appointment times
  - Print appointment details in a formatted way

**Example:**
```java
System.out.println("Using LocalDateTime in Domain Model");

// Creating multiple appointments
Appointment checkup = new Appointment(
    "Dr. Smith",
    "Regular Checkup",
    LocalDateTime.of(2025, 10, 15, 14, 30)
);

Appointment followUp = new Appointment(
    "Dr. Smith",
    "Follow-up Visit",
    LocalDateTime.of(2025, 10, 22, 15, 00)
);

// Compare appointments
System.out.println("Appointment Details:");
System.out.println("First Appointment: " + checkup.dateTime());
System.out.println("Follow-up Appointment: " + followUp.dateTime());
System.out.println("Is follow-up after checkup? " + 
    followUp.dateTime().isAfter(checkup.dateTime()));

// Calculate days between appointments
long daysBetween = ChronoUnit.DAYS.between(
    checkup.dateTime(),
    followUp.dateTime()
);
System.out.println("Days between appointments: " + daysBetween);
```

## Key Concepts Explained

### What is LocalDateTime?
LocalDateTime is a class that represents both a date and time without a time zone in the ISO-8601 calendar system. It combines the functionality of LocalDate and LocalTime into a single class, making it perfect for representing date-time values like appointments, events, or schedules that don't need time zone information.

### Why Use LocalDateTime?
- **Complete Date-Time Information:** When you need both date and time components together
- **Time Zone Independence:** When your application deals with local date-time values without time zone concerns
- **Immutability:** All operations create new instances, making it thread-safe and reliable
- **Rich API:** Comprehensive set of methods for date-time manipulations and calculations

### Best Practices
1. Use LocalDateTime when you need both date and time but don't care about time zones
2. Always validate input when parsing strings to LocalDateTime
3. Use appropriate methods (plus/minus vs with) depending on your needs
4. Consider using formatting patterns when displaying LocalDateTime values
5. Remember that LocalDateTime is immutable - operations return new instances

## Summary
LocalDateTime is a powerful class in Java's Date-Time API that combines date and time functionality. It's perfect for representing local date-time values without time zone concerns. This guide covered creation, comparison, value retrieval, modification, and practical usage in domain models. Understanding these concepts helps in building robust date-time handling in Java applications.
