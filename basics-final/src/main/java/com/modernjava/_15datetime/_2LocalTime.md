# _1LocalTime.md

<!-- TOC -->
* [_1LocalTime.md](#_1localtimemd)
  * [LocalTime Basics in Java](#localtime-basics-in-java)
    * [1. Creating LocalTime Instances](#1-creating-localtime-instances)
    * [2. Comparing LocalTime Instances](#2-comparing-localtime-instances)
    * [3. Retrieving Values from LocalTime](#3-retrieving-values-from-localtime)
    * [4. Modifying LocalTime Instances](#4-modifying-localtime-instances)
    * [5. Using LocalTime in a Domain Model (ShowTime)](#5-using-localtime-in-a-domain-model-showtime)
  * [Key Concepts Explained](#key-concepts-explained)
    * [What is LocalTime?](#what-is-localtime)
    * [Why Use LocalTime?](#why-use-localtime)
    * [Best Practices](#best-practices)
  * [Summary](#summary)
<!-- TOC -->

## LocalTime Basics in Java

This document demonstrates the usage of `LocalTime` in Java, including creation, retrieval, comparison, and modification. Each section provides a prompt to replicate a specific LocalTime operation, with clear requirements and code patterns.

---

### 1. Creating LocalTime Instances
**Prompt:** Create methods to demonstrate different ways to create LocalTime instances.

**Requirements:**
- Print section header: "Creating LocalTime Instances"
- Show creation for:
  - Current time: `LocalTime.now()`
  - Noon: `LocalTime.NOON`
  - Midnight: `LocalTime.MIDNIGHT`
  - Specific time: `LocalTime.of(15, 30, 45)`
  - From string: `LocalTime.parse("08:20:15")`
- Print each result

**Example:**
```java
System.out.println("Creating LocalTime Instances");
LocalTime now = LocalTime.now();
System.out.println("Current time: " + now);
LocalTime noon = LocalTime.NOON;
System.out.println("Noon: " + noon);
LocalTime midnight = LocalTime.MIDNIGHT;
System.out.println("Midnight: " + midnight);
LocalTime specific = LocalTime.of(15, 30, 45);
System.out.println("Specific time: " + specific);
LocalTime parsed = LocalTime.parse("08:20:15");
System.out.println("Parsed time: " + parsed);
```

---

### 2. Comparing LocalTime Instances
**Prompt:** Create methods to compare LocalTime instances.

**Requirements:**
- Print section header: "Comparing LocalTime Instances"
- Compare now with another time using `isBefore`, `isAfter`, `equals`
- Print results

**Example:**
```java
System.out.println("Comparing LocalTime Instances");
LocalTime now = LocalTime.now();
LocalTime otherTime = LocalTime.of(23, 59, 59);
System.out.println("Is now before " + otherTime + "? " + now.isBefore(otherTime));
System.out.println("Is now after " + otherTime + "? " + now.isAfter(otherTime));
System.out.println("Is now equal to " + otherTime + "? " + now.equals(otherTime));
```

---

### 3. Retrieving Values from LocalTime
**Prompt:** Create a method to retrieve and print all possible values from a LocalTime.

**Requirements:**
- Print section header: "Retrieving Values from LocalTime"
- Retrieve and print:
  - Hour, minute, second, nano

**Example:**
```java
System.out.println("Retrieving Values from LocalTime");
System.out.println("Hour: " + time.getHour());
System.out.println("Minute: " + time.getMinute());
System.out.println("Second: " + time.getSecond());
System.out.println("Nano: " + time.getNano());
```

---

### 4. Modifying LocalTime Instances
**Prompt:** Create a method to demonstrate different ways to modify a LocalTime.

**Requirements:**
- Print section header: "Modifying LocalTime Instances"
- Show usage of:
  - plusHours, minusMinutes, plusSeconds, minusNanos
  - withHour, withMinute, withSecond, withNano
- Print results

**Example:**
```java
System.out.println("Modifying LocalTime Instances");
System.out.println("Original time: " + time);
System.out.println("Plus 2 hours: " + time.plusHours(2));
System.out.println("Minus 30 minutes: " + time.minusMinutes(30));
System.out.println("Plus 45 seconds: " + time.plusSeconds(45));
System.out.println("Minus 1000000 nanos: " + time.minusNanos(1_000_000));
System.out.println("With hour 6: " + time.withHour(6));
System.out.println("With minute 0: " + time.withMinute(0));
System.out.println("With second 0: " + time.withSecond(0));
System.out.println("With nano 0: " + time.withNano(0));
```

---

### 5. Using LocalTime in a Domain Model (ShowTime)
**Prompt:** Demonstrate how to use LocalTime in a domain model, such as a ShowTime record.

**Requirements:**
- Create a ShowTime instance using LocalDate and LocalTime
- Print the show time and related details

**Example:**
```java
System.out.println("ShowTime demonstration:");
ShowTime show = new ShowTime(
    LocalDate.now(),
    LocalTime.of(19, 30), // 7:30 PM
    screen,
    movie
);
System.out.println("Movie: " + show.movie().title());
System.out.println("Screen: " + show.screen().name());
System.out.println("Date: " + show.date());
System.out.println("Time: " + show.time());
```

---

## Key Concepts Explained

### What is LocalTime?
- Represents a time (hour, minute, second, nano) without date or time zone.
- Immutable and thread-safe.

### Why Use LocalTime?
- Clear, type-safe time handling.
- Avoids legacy pitfalls of java.util.Date for time-only values.

### Best Practices
- Use plus/minus/with methods for time arithmetic.
- Use immutability to avoid bugs in concurrent code.
- Always print or log LocalTime in a clear format for debugging.

---

## Summary

This markdown provides prompts to replicate all key LocalTime operations in Java, including creation, retrieval, comparison, and modification. Each prompt includes requirements and code patterns for hands-on learning and practice.
