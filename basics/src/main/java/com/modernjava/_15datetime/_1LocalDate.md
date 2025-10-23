# _1LocalDate.md

<!-- TOC -->
* [_1LocalDate.md](#_1localdatemd)
  * [LocalDate Basics in Java](#localdate-basics-in-java)
    * [1. Creating LocalDate Instances](#1-creating-localdate-instances)
    * [1.1 Update the Movie Record with LocalDate](#11-update-the-movie-record-with-localdate-)
    * [2. Comparing LocalDate Instances](#2-comparing-localdate-instances)
    * [3. Retrieving Values from LocalDate](#3-retrieving-values-from-localdate)
    * [4. Leap Year and Length Functions](#4-leap-year-and-length-functions)
    * [5. Modifying LocalDate Instances](#5-modifying-localdate-instances)
  * [Key Concepts Explained](#key-concepts-explained)
    * [What is LocalDate?](#what-is-localdate)
    * [Why Use LocalDate?](#why-use-localdate)
    * [Best Practices](#best-practices)
  * [Summary](#summary)
<!-- TOC -->
## LocalDate Basics in Java

This document demonstrates the usage of `LocalDate` in Java, including creation, retrieval, comparison, and modification. Each section provides a prompt to replicate a specific LocalDate operation, with clear requirements and code patterns.

---

### 1. Creating LocalDate Instances
**Prompt:** Create methods to demonstrate different ways to create LocalDate instances.

**Requirements:**
- Print section header: "Creating LocalDate Instances"
- Show creation for:
  - Today’s date: `LocalDate.now()`
  - Specific date: `LocalDate.of(1947, 8, 15)`
  - From zone: `LocalDate.now(ZoneId.of("America/New_York"))`
- Print each result

**Example:**
```java
System.out.println("Creating LocalDate Instances");
LocalDate today = LocalDate.now();
System.out.println("Today's date: " + today);
LocalDate independenceDay = LocalDate.of(1947, 8, 15);
System.out.println("Independence Day: " + independenceDay);
LocalDate newYorkDate = LocalDate.now(ZoneId.of("America/New_York"));
System.out.println("Date in New York: " + newYorkDate);
```

### 1.1 Update the Movie Record with LocalDate 

- Create a new Movie Record class named MovieWIthLocalDate it should have the LocalDate also to represent the date when that movie was released.
- Just keep the record class simple and it does not need to have additional functions.

---

### 2. Comparing LocalDate Instances
**Prompt:** Create methods to compare LocalDate instances.

**Requirements:**
- Print section header: "Comparing LocalDate Instances"
- Compare today with another date using `isBefore`, `isAfter`, `isEqual`
- Print results

**Example:**
```java
System.out.println("Comparing LocalDate Instances");
LocalDate today = LocalDate.now();
LocalDate otherDate = LocalDate.of(2025, 9, 29);
System.out.println("Is today before " + otherDate + "? " + today.isBefore(otherDate));
System.out.println("Is today after " + otherDate + "? " + today.isAfter(otherDate));
System.out.println("Is today equal to " + otherDate + "? " + today.isEqual(otherDate));
```

---

### 3. Retrieving Values from LocalDate
**Prompt:** Create a method to retrieve and print all possible values from a LocalDate.

**Requirements:**
- Print section header: "Retrieving Values from LocalDate"
- Retrieve and print:
  - Year, month (enum and number), day of month, day of week, day of year

**Example:**
```java
System.out.println("Retrieving Values from LocalDate");
System.out.println("Year: " + date.getYear());
System.out.println("Month (enum): " + date.getMonth());
System.out.println("Month (number): " + date.getMonthValue());
System.out.println("Day of Month: " + date.getDayOfMonth());
System.out.println("Day of Week: " + date.getDayOfWeek());
System.out.println("Day of Year: " + date.getDayOfYear());
```

---

### 4. Leap Year and Length Functions
**Prompt:** Create a method to check leap year status and get the length of the month and year.

**Requirements:**
- Print section header: "Leap Year and Length Functions"
- Print:
  - Is leap year: `isLeapYear()`
  - Length of month: `lengthOfMonth()`
  - Length of year: `lengthOfYear()`

**Example:**
```java
System.out.println("Leap Year and Length Functions");
System.out.println("Is Leap Year: " + date.isLeapYear());
System.out.println("Length of Month: " + date.lengthOfMonth());
System.out.println("Length of Year: " + date.lengthOfYear());
```

---

### 5. Modifying LocalDate Instances
**Prompt:** Create a method to demonstrate different ways to modify a LocalDate.

**Requirements:**
- Print section header: "Modifying LocalDate Instances"
- Show usage of:
  - plusDays, minusWeeks, plusMonths, minusYears
  - withDayOfMonth, withMonth, withYear, withDayOfYear
  - TemporalAdjusters (first/last day of month, next/previous day of week, etc.)

**Example:**
```java
System.out.println("Modifying LocalDate Instances");
System.out.println("Original date: " + date);
System.out.println("Plus 5 days: " + date.plusDays(5));
System.out.println("Minus 2 weeks: " + date.minusWeeks(2));
System.out.println("Plus 3 months: " + date.plusMonths(3));
System.out.println("Minus 1 year: " + date.minusYears(1));
System.out.println("With day of month 1: " + date.withDayOfMonth(1));
System.out.println("With month December: " + date.withMonth(12));
System.out.println("With year 2000: " + date.withYear(2000));
System.out.println("With day of year 100: " + date.withDayOfYear(100));
System.out.println("With first day of next month: " + date.with(date.plusMonths(1).withDayOfMonth(1)));
System.out.println("With first day of year: " + date.withDayOfYear(1));
System.out.println("With next Sunday: " + date.with(java.time.temporal.TemporalAdjusters.next(java.time.DayOfWeek.SUNDAY)));
System.out.println("With previous Monday: " + date.with(java.time.temporal.TemporalAdjusters.previous(java.time.DayOfWeek.MONDAY)));
System.out.println("With first day of month: " + date.with(java.time.temporal.TemporalAdjusters.firstDayOfMonth()));
System.out.println("With last day of month: " + date.with(java.time.temporal.TemporalAdjusters.lastDayOfMonth()));
System.out.println("With first day of next year: " + date.with(java.time.temporal.TemporalAdjusters.firstDayOfNextYear()));
```

---

## Key Concepts Explained

### What is LocalDate?
- Represents a date (year, month, day) without time or time zone.
- Immutable and thread-safe.

### Why Use LocalDate?
- Clear, type-safe date handling.
- Avoids legacy pitfalls of java.util.Date.

### Best Practices
- Use plus/minus/with methods for date arithmetic.
- Use TemporalAdjusters for advanced date calculations.
- Always check for leap years and month/year lengths when needed.

---

## Summary

This markdown provides prompts to replicate all key LocalDate operations in Java, including creation, retrieval, comparison, and modification. Each prompt includes requirements and code patterns for hands-on learning and practice.

