# _5Duration.java - Duration Class Concepts

<!-- TOC -->
* [_5Duration.java - Duration Class Concepts](#_5durationjava---duration-class-concepts)
  * [Prompts for Replication](#prompts-for-replication)
    * [Prompt 1: Creating Duration Objects](#prompt-1-creating-duration-objects)
    * [Prompt 2: Time Arithmetic with Duration](#prompt-2-time-arithmetic-with-duration)
    * [Prompt 3: Duration Between Times](#prompt-3-duration-between-times)
    * [Prompt 4: Real-world Timing Examples](#prompt-4-real-world-timing-examples)
    * [Prompt 5: ISO 8601 Duration Strings](#prompt-5-iso-8601-duration-strings)
  * [Key Concepts Demonstrated](#key-concepts-demonstrated)
<!-- TOC -->


This file demonstrates the Duration class concepts with practical examples. Duration represents a time-based amount of time (hours, minutes, seconds, nanoseconds) and is used for time arithmetic and calculating differences between times.

## Prompts for Replication

### Prompt 1: Creating Duration Objects
**Task**: Create a method that demonstrates different ways to create Duration objects using various factory methods.

**Expected Function Signature**: `private static void createDurationExamples()`

**Requirements**:
- Print section header: "1. Creating Durations:"
- Create durations using static factory methods:
  - `Duration oneHour = Duration.ofHours(1)`
  - `Duration thirtyMinutes = Duration.ofMinutes(30)`
  - `Duration fortyFiveSeconds = Duration.ofSeconds(45)`
  - `Duration twoMillis = Duration.ofMillis(2000)`
  - `Duration fiveNanos = Duration.ofNanos(5000000000L)`
- Create duration using of() method: `Duration combined = Duration.of(90, ChronoUnit.MINUTES)` with comment `// 90 minutes`
- Print each duration with appropriate labels
- Create and print negative duration: `Duration negativeHour = Duration.ofHours(-1)`
- Print empty line at end

---

### Prompt 2: Time Arithmetic with Duration
**Task**: Create a method that demonstrates adding and subtracting durations from times to create work schedules.

**Expected Function Signature**: `private static void timeArithmeticExample()`

**Requirements**:
- Print section header: "2. Time Arithmetic with Durations:"
- Create base time: `LocalTime startTime = LocalTime.of(9, 0, 0)` with comment `// 9:00 AM`
- Create duration objects for work schedule:
  - `Duration workingHours = Duration.ofHours(8)`
  - `Duration lunchBreak = Duration.ofMinutes(60)`
  - `Duration shortBreak = Duration.ofMinutes(15)`
- Calculate schedule times:
  - `LocalTime lunchTime = startTime.plus(Duration.ofHours(4))`
  - `LocalTime afterLunch = lunchTime.plus(lunchBreak)`
  - `LocalTime endTime = startTime.plus(workingHours)`
- Print work day schedule with labels for each time
- Calculate total breaks: `Duration totalBreaks = lunchBreak.plus(shortBreak.multipliedBy(2))` with comment `// 2 short breaks`
- Print total break time and convert to minutes using `totalBreaks.toMinutes()`
- Print empty line at end

---

### Prompt 3: Duration Between Times
**Task**: Create a method that demonstrates calculating duration between different time objects.

**Expected Function Signature**: `private static void durationBetweenTimesExample()`

**Requirements**:
- Print section header: "3. Duration Between Times:"
- Create time range: `LocalTime startTime = LocalTime.of(14, 30, 0)` and `LocalTime endTime = LocalTime.of(17, 45, 30)` with comments
- Calculate difference: `Duration difference = Duration.between(startTime, endTime)`
- Print start time, end time, and duration
- Show duration conversions: `toHours()`, `toMinutes()`, `getSeconds()`
- Create meeting example with LocalDateTime:
  - `LocalDateTime meetingStart = LocalDateTime.of(2024, 10, 2, 10, 0, 0)`
  - `LocalDateTime meetingEnd = LocalDateTime.of(2024, 10, 2, 11, 30, 45)`
  - `Duration meetingDuration = Duration.between(meetingStart, meetingEnd)`
- Print meeting details and formatted duration showing hours, minutes, and seconds
- Print empty line at end

---

### Prompt 4: Real-world Timing Examples
**Task**: Create a method that demonstrates practical Duration usage in real-world scenarios.

**Expected Function Signature**: `private static void realWorldTimingExample()`

**Requirements**:
- Print section header: "4. Real-world Timing Examples:"
- **Movie Example**: Create `Duration movieLength = Duration.ofMinutes(142)` with comment `// 2h 22m movie`
- Print movie duration and formatted length showing hours and minutes
- **Cooking Example**: 
  - Create `Duration bakingTime = Duration.ofMinutes(25)` and `Duration prepTime = Duration.ofMinutes(15)`
  - Calculate `Duration totalCookingTime = prepTime.plus(bakingTime)`
  - Print cooking times with labels
- **Exercise Example**:
  - Create durations for warmUp (10 min), workout (45 min), coolDown (5 min)
  - Calculate total exercise time by adding all durations
  - Print exercise schedule with labels
- **Performance Timing Example**:
  - Record `Instant processingStart = Instant.now()`
  - Add Thread.sleep(100) with try-catch for InterruptedException
  - Record `Instant processingEnd = Instant.now()`
  - Calculate and print processing time in milliseconds
- Print empty line at end

---

### Prompt 5: ISO 8601 Duration Strings
**Task**: Create a method that demonstrates parsing and formatting ISO 8601 duration strings.

**Expected Function Signature**: `private static void iso8601DurationExample()`

**Requirements**:
- Print section header: "5. ISO 8601 Duration Strings:"
- Parse various duration strings:
  - `Duration.parse("PT2H30M")` with comment `// 2 hours 30 minutes`
  - `Duration.parse("PT1H")` with comment `// 1 hour`
  - `Duration.parse("PT45M")` with comment `// 45 minutes`
  - `Duration.parse("PT30S")` with comment `// 30 seconds`
  - `Duration.parse("PT2H15M30S")` with comment `// 2 hours 15 minutes 30 seconds`
- Print each parsed duration with labels
- Create custom duration and convert to string: `Duration.ofHours(3).plusMinutes(45).plusSeconds(20).toString()`
- **Flight Example**:
  - Create departure: `LocalDateTime.of(2024, 10, 2, 14, 30)`
  - Parse flight duration: `Duration.parse("PT8H45M")` with comment `// 8 hours 45 minutes`
  - Calculate arrival time: `departure.plus(flightDuration)`
  - Show duration breakdown: hours, total minutes, remaining minutes, seconds
  - Calculate check-in and boarding times using duration subtraction
  - Print complete flight schedule
- Print empty line at end

---

## Key Concepts Demonstrated

1. **Duration Creation**: Factory methods (ofHours, ofMinutes, ofSeconds, ofMillis, ofNanos)
2. **Time Arithmetic**: Adding/subtracting durations from LocalTime and LocalDateTime
3. **Duration Calculations**: Between temporal objects using Duration.between()
4. **Real-world Applications**: Movies, cooking, exercise, performance timing
5. **ISO 8601 Format**: Parsing "PT2H30M15S" format and string conversion
6. **Duration Operations**: plus(), minus(), multipliedBy(), dividedBy()
7. **Unit Conversions**: toHours(), toMinutes(), getSeconds(), toMillis()
