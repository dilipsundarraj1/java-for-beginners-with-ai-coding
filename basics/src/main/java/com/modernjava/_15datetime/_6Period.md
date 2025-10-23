# _6Period.md

<!-- TOC -->
* [_6Period.md](#_6periodmd)
  * [Period Basics in Java](#period-basics-in-java)
    * [1. Creating Period Instances](#1-creating-period-instances)
    * [2. Calculating Age using Period](#2-calculating-age-using-period)
    * [3. Date Arithmetic with Periods](#3-date-arithmetic-with-periods)
    * [4. Period Between Dates](#4-period-between-dates)
    * [5. ISO 8601 Period Strings](#5-iso-8601-period-strings)
  * [Key Concepts Explained](#key-concepts-explained)
    * [What is Period?](#what-is-period)
    * [Period vs Duration](#period-vs-duration)
    * [ISO 8601 Format](#iso-8601-format)
    * [Best Practices](#best-practices)
  * [Common Use Cases](#common-use-cases)
    * [Business Applications](#business-applications)
    * [Financial Applications](#financial-applications)
    * [Educational/Healthcare](#educationalhealthcare)
  * [Summary](#summary)
<!-- TOC -->

## Period Basics in Java

This document demonstrates the usage of `Period` in Java, a class that represents a date-based amount of time in years, months, and days. Period is ideal for date arithmetic and calculating differences between dates without considering time zones or time of day.

---

### 1. Creating Period Instances

**Prompt:** Create methods to demonstrate different ways to create Period instances.

**Requirements:**
- Print section header: "Creating Periods"
- Show creation using static factory methods:
  - `Period.ofYears(1)` - One year
  - `Period.ofMonths(3)` - Three months  
  - `Period.ofDays(10)` - Ten days
  - `Period.of(2, 6, 15)` - Combined: 2 years, 6 months, 15 days
- Print each result with descriptive labels

**Example:**
```java
System.out.println("Creating Periods:");
Period oneYear = Period.ofYears(1);
Period threeMonths = Period.ofMonths(3);
Period tenDays = Period.ofDays(10);
Period combined = Period.of(2, 6, 15); // 2 years, 6 months, 15 days

System.out.println("One year: " + oneYear);
System.out.println("Three months: " + threeMonths);
System.out.println("Ten days: " + tenDays);
System.out.println("Combined (2y 6m 15d): " + combined);
```

---

### 2. Calculating Age using Period

**Prompt:** Create a method to calculate a person's age using Period.between().

**Requirements:**
- Print section header: "Calculating Age"
- Define a birth date (e.g., `LocalDate.of(1990, 5, 15)`)
- Get current date using `LocalDate.now()`
- Calculate age using `Period.between(birthDate, currentDate)`
- Display birth date, current date, and formatted age
- Show both individual components and Period string representation

**Example:**
```java
System.out.println("Calculating Age:");
LocalDate birthDate = LocalDate.of(1990, 5, 15);
LocalDate currentDate = LocalDate.now();
Period age = Period.between(birthDate, currentDate);

System.out.println("Birth date: " + birthDate);
System.out.println("Current date: " + currentDate);
System.out.println("Age: " + age.getYears() + " years, " + 
                  age.getMonths() + " months, " + 
                  age.getDays() + " days");
System.out.println("Age as Period: " + age);
```

---

### 3. Date Arithmetic with Periods

**Prompt:** Demonstrate adding and subtracting periods from dates for project planning.

**Requirements:**
- Print section header: "Date Arithmetic with Periods"
- Create a project start date
- Define project duration as a Period (e.g., 1 year, 3 months, 10 days)
- Calculate project end date using `startDate.plus(duration)`
- Calculate milestone dates using period addition
- Show period subtraction for review dates
- Include examples with `Period.ofWeeks()` for shorter durations

**Example:**
```java
System.out.println("Date Arithmetic with Periods:");
LocalDate startDate = LocalDate.of(2024, 1, 1);
Period projectDuration = Period.of(1, 3, 10); // 1 year, 3 months, 10 days

LocalDate endDate = startDate.plus(projectDuration);
LocalDate halfwayDate = startDate.plus(Period.ofMonths(6));
LocalDate reviewDate = endDate.minus(Period.ofWeeks(2)); // 2 weeks before end

System.out.println("Project start date: " + startDate);
System.out.println("Project duration: " + projectDuration);
System.out.println("Project end date: " + endDate);
System.out.println("Halfway point: " + halfwayDate);
System.out.println("Review date (2 weeks before end): " + reviewDate);
```

---

### 4. Period Between Dates

**Prompt:** Calculate the period between two specific dates for various scenarios.

**Requirements:**
- Print section header: "Period Between Dates"
- Calculate difference between two arbitrary dates
- Show employment duration calculation (real-world example)
- Display both the Period object and breakdown of components
- Include practical examples like project duration, employment length

**Example:**
```java
System.out.println("Period Between Dates:");
LocalDate startDate = LocalDate.of(2023, 3, 15);
LocalDate endDate = LocalDate.of(2024, 8, 22);
Period difference = Period.between(startDate, endDate);

System.out.println("Start date: " + startDate);
System.out.println("End date: " + endDate);
System.out.println("Difference: " + difference);
System.out.println("Time elapsed: " + difference.getYears() + " years, " +
                  difference.getMonths() + " months, " +
                  difference.getDays() + " days");

// Employment duration example
LocalDate hireDate = LocalDate.of(2020, 9, 1);
LocalDate currentDate = LocalDate.now();
Period employment = Period.between(hireDate, currentDate);
System.out.println("Employment duration: " + employment);
```

---

### 5. ISO 8601 Period Strings

**Prompt:** Demonstrate parsing and using ISO 8601 period strings like "P2Y6M15D".

**Requirements:**
- Print section header: "ISO 8601 Period Strings"
- Explain the format: P = Period, Y = Years, M = Months, D = Days
- Parse various period strings using `Period.parse()`
- Show conversion from Period back to string using `toString()`
- Include real-world project timeline example using "P2Y6M15D"
- Demonstrate milestone calculations using parsed periods

**Example:**
```java
System.out.println("ISO 8601 Period Strings:");

// Parse period strings using Period.parse()
Period period1 = Period.parse("P2Y6M15D");  // 2 years, 6 months, 15 days
Period period2 = Period.parse("P1Y");       // 1 year
Period period3 = Period.parse("P6M");       // 6 months
Period period4 = Period.parse("P30D");      // 30 days

System.out.println("Parsing 'P2Y6M15D': " + period1);
System.out.println("Parsing 'P1Y': " + period2);
System.out.println("Parsing 'P6M': " + period3);
System.out.println("Parsing 'P30D': " + period4);

// Real-world project timeline
LocalDate projectStart = LocalDate.of(2024, 1, 15);
Period projectDuration = Period.parse("P2Y6M15D");
LocalDate projectEnd = projectStart.plus(projectDuration);

System.out.println("Project start: " + projectStart);
System.out.println("Project duration: " + projectDuration);
System.out.println("Project end: " + projectEnd);

// Calculate milestones
LocalDate milestone1 = projectStart.plus(Period.parse("P1Y"));      // 1 year
LocalDate milestone2 = projectStart.plus(Period.parse("P1Y6M"));    // 1.5 years
LocalDate review = projectEnd.minus(Period.parse("P1M"));           // 1 month before end

System.out.println("1 year milestone: " + milestone1);
System.out.println("1.5 year milestone: " + milestone2);
System.out.println("Final review: " + review);
```

---

## Key Concepts Explained

### What is Period?

`Period` is a Java class that represents a date-based amount of time in the ISO-8601 calendar system. It stores years, months, and days separately and is designed for date arithmetic without considering time zones or time of day.

**Key characteristics:**
- Immutable - all operations return new Period instances
- Date-based only (no hours, minutes, seconds)
- Human-readable units (years, months, days)
- Perfect for business logic involving dates

### Period vs Duration

| Period | Duration |
|--------|----------|
| Date-based (years, months, days) | Time-based (hours, minutes, seconds, nanoseconds) |
| Used with LocalDate | Used with LocalTime, LocalDateTime |
| Human calendar concepts | Precise time measurements |
| Example: "2 years, 3 months" | Example: "5 hours, 30 minutes" |

### ISO 8601 Format

The ISO 8601 standard defines period representation as:
- **P** - Indicates this is a Period
- **nY** - n years
- **nM** - n months  
- **nD** - n days

**Examples:**
- `P1Y` = 1 year
- `P6M` = 6 months
- `P30D` = 30 days
- `P2Y6M15D` = 2 years, 6 months, 15 days
- `P0D` = Zero period

### Best Practices

1. **Use Period for date arithmetic**: When working with dates and need to add/subtract years, months, or days
2. **Prefer factory methods**: Use `Period.ofYears()`, `Period.ofMonths()`, etc. for clarity
3. **Parse ISO strings carefully**: Always handle potential parsing exceptions
4. **Remember immutability**: Period operations return new instances
5. **Choose Period over Duration**: For date-based calculations, Period is more appropriate than Duration

---

## Common Use Cases

### Business Applications
- **Age calculation**: Determining customer age for eligibility
- **Project planning**: Calculating project timelines and milestones
- **Employment duration**: Tracking service length
- **Subscription periods**: Managing recurring billing cycles
- **Contract terms**: Defining agreement durations

### Financial Applications
- **Loan terms**: Calculating payment periods
- **Investment maturity**: Determining investment time horizons
- **Insurance coverage**: Defining policy periods
- **Warranty periods**: Tracking product warranties

### Educational/Healthcare
- **Academic semesters**: Planning course durations
- **Treatment periods**: Medical treatment timelines
- **Training programs**: Course and certification periods

---

## Summary

The `Period` class is essential for date-based calculations in Java applications. Key takeaways:

1. **Creation**: Use factory methods (`ofYears`, `ofMonths`, `ofDays`) or `Period.of()` for combined periods
2. **Parsing**: Use `Period.parse()` for ISO 8601 strings like "P2Y6M15D"
3. **Arithmetic**: Add/subtract periods from dates using `plus()` and `minus()`
4. **Components**: Access individual parts with `getYears()`, `getMonths()`, `getDays()`
5. **Immutability**: All operations return new Period instances

Period provides a clean, intuitive way to work with date ranges and is particularly valuable in business applications where human-readable time periods are important.
