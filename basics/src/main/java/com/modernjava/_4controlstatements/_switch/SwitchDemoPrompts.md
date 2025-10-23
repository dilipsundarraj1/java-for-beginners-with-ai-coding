<!-- TOC -->
* [Switch Statement Examples](#switch-statement-examples)
  * [Overview](#overview)
  * [Prompts for Replication](#prompts-for-replication)
    * [Prompt 1: SeatType Enum and Modern Switch Expression](#prompt-1-seattype-enum-and-modern-switch-expression)
    * [Prompt 2: Traditional Switch Statement with Break](#prompt-2-traditional-switch-statement-with-break)
    * [Prompt 3: If-Else Equivalent Pattern](#prompt-3-if-else-equivalent-pattern)
    * [Prompt 4: Day Enum with Multiple Case Values](#prompt-4-day-enum-with-multiple-case-values)
    * [Prompt 5: Main Method Integration](#prompt-5-main-method-integration)
  * [Basic Switch Examples](#basic-switch-examples)
    * [Modern Switch Expression](#modern-switch-expression)
    * [Traditional Switch Statement](#traditional-switch-statement)
    * [If-Else Equivalent](#if-else-equivalent)
  * [Real-World Application: Cinema Pricing System](#real-world-application-cinema-pricing-system)
    * [Modern Switch Expression - Seat Surcharge Calculator](#modern-switch-expression---seat-surcharge-calculator)
    * [Traditional Switch Statement - Day of Week Pricing](#traditional-switch-statement---day-of-week-pricing)
  * [How to Replicate](#how-to-replicate)
  * [Expected Output](#expected-output)
    * [Modern Switch Expression Output:](#modern-switch-expression-output)
    * [Traditional Switch Statement Output:](#traditional-switch-statement-output)
    * [If-Else Equivalent Output:](#if-else-equivalent-output)
    * [Multiple Case Values Output:](#multiple-case-values-output)
  * [Key Differences](#key-differences)
    * [Modern Switch vs Traditional Switch:](#modern-switch-vs-traditional-switch)
    * [Switch vs If-Else:](#switch-vs-if-else)
    * [When to Use Each Pattern:](#when-to-use-each-pattern)
  * [Running the Code](#running-the-code)
  * [Practical Applications](#practical-applications)
<!-- TOC -->

# Switch Statement Examples

This document provides examples of different switch statement patterns in Java: modern switch expressions, traditional switch statements, and if-else equivalents, including practical real-world applications with cinema pricing systems.

## Overview

Switch statements are used to execute different blocks of code based on the value of a variable. Java provides multiple ways to implement switch logic:
- **Modern Switch Expression (Java 14+)**: Concise arrow syntax with direct value returns
- **Traditional Switch Statement**: Classic colon syntax with break statements
- **If-Else Chains**: Alternative approach for complex conditions

## Prompts for Replication

### Prompt 1: SeatType Enum and Modern Switch Expression
**Task**: Create an enum and demonstrate modern switch expressions with arrow syntax.

**Expected Function Signature**: `public static int seatSurchargeCents(SeatType seat)`

**Requirements**:
- Create enum `SeatType` with values: REGULAR, PREMIUM, VIP
- Use modern switch expression with arrow syntax (`->`)
- Return surcharge in cents:
  - REGULAR: 0 cents
  - PREMIUM: 200 cents
  - VIP: 500 cents
- No break statements needed with arrow syntax

---

### Prompt 2: Traditional Switch Statement with Break
**Task**: Create a function that demonstrates traditional switch statement with break statements.

**Expected Function Signature**: `public static void traditionalSwitchDemo(SeatType seat)`

**Requirements**:
- Use traditional switch statement with colon syntax (`:`)
- Include break statements after each case
- Print appropriate messages:
  - REGULAR: "Standard seat selected. No surcharge."
  - PREMIUM: "Premium seat selected. Extra $2.00 surcharge."
  - VIP: "VIP seat selected. Extra $5.00 surcharge."
- Include a default case that prints "Unknown seat type."

---

### Prompt 3: If-Else Equivalent Pattern
**Task**: Create a function that demonstrates if-else equivalent to switch logic.

**Expected Function Signature**: `public static String ifElseEquivalent(SeatType seat)`

**Requirements**:
- Use if-else-if chain instead of switch
- Return seat description strings:
  - REGULAR: "Economy seating"
  - PREMIUM: "Enhanced comfort seating"
  - VIP: "Luxury experience seating"
- Handle null/unknown cases with "Unknown seat category"

---

### Prompt 4: Day Enum with Multiple Case Values
**Task**: Create a Day enum and demonstrate switch with multiple case values for weekday/weekend logic.

**Expected Function Signature**: `public static String getDayType(Day day)`

**Requirements**:
- Create enum `Day` with all seven days: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
- Use modern switch expression with multiple values per case
- Group weekdays (MONDAY through FRIDAY) to return "Weekday"
- Group weekends (SATURDAY, SUNDAY) to return "Weekend"

---

### Prompt 5: Main Method Integration
**Task**: Create a main method that demonstrates all the switch examples with clear section headers.

**Expected Function Signature**: `public static void main(String[] args)`

**Requirements**:
- Demonstrate each switch type with all enum values
- Use descriptive headers:
  - "=== Modern Switch Expression Demo ==="
  - "\n=== Traditional Switch Statement Demo ==="
  - "\n=== If-Else Equivalent Demo ==="
  - "\n=== Multiple Case Values Demo ==="
- Show results for all enum values in each section
- Add appropriate spacing between sections

## Basic Switch Examples

### Modern Switch Expression
```java
public static int seatSurchargeCents(SeatType seat) {
    return switch (seat) {
        case REGULAR -> 0;
        case PREMIUM -> 200;
        case VIP -> 500;
    };
}
```

### Traditional Switch Statement
```java
public static void traditionalSwitchDemo(SeatType seat) {
    switch (seat) {
        case REGULAR:
            System.out.println("Standard seat selected. No surcharge.");
            break;
        case PREMIUM:
            System.out.println("Premium seat selected. Extra $2.00 surcharge.");
            break;
        case VIP:
            System.out.println("VIP seat selected. Extra $5.00 surcharge.");
            break;
        default:
            System.out.println("Unknown seat type.");
    }
}
```

### If-Else Equivalent
```java
public static String ifElseEquivalent(SeatType seat) {
    if (seat == SeatType.REGULAR) {
        return "Economy seating";
    } else if (seat == SeatType.PREMIUM) {
        return "Enhanced comfort seating";
    } else if (seat == SeatType.VIP) {
        return "Luxury experience seating";
    } else {
        return "Unknown seat category";
    }
}
```

## Real-World Application: Cinema Pricing System

### Modern Switch Expression - Seat Surcharge Calculator
```java
enum SeatType {
    REGULAR, PREMIUM, VIP
}

public static int seatSurchargeCents(SeatType seat) {
    return switch (seat) {
        case REGULAR -> 0;           // No extra charge
        case PREMIUM -> 200;         // $2.00 surcharge
        case VIP -> 500;            // $5.00 surcharge
    };
}
```

### Traditional Switch Statement - Day of Week Pricing
```java
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public static String getDayType(Day day) {
    return switch (day) {
        case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Weekday";
        case SATURDAY, SUNDAY -> "Weekend";
    };
}
```

## How to Replicate

1. **Create the Enums**: Start by creating the `SeatType` and `Day` enums as shown above
2. **Implement Modern Switch**: Use arrow syntax (`->`) for concise expressions
3. **Implement Traditional Switch**: Use colon syntax (`:`) with break statements
4. **Create If-Else Alternative**: Convert switch logic to if-else chains
5. **Test All Scenarios**: Create a main method to test all enum values
6. **Run and Verify**: Execute the program and verify output matches expected results

## Expected Output

### Modern Switch Expression Output:
```
=== Modern Switch Expression Demo ===
REGULAR seat surcharge: 0 cents
PREMIUM seat surcharge: 200 cents
VIP seat surcharge: 500 cents
```

### Traditional Switch Statement Output:
```
=== Traditional Switch Statement Demo ===
Standard seat selected. No surcharge.
Premium seat selected. Extra $2.00 surcharge.
VIP seat selected. Extra $5.00 surcharge.
```

### If-Else Equivalent Output:
```
=== If-Else Equivalent Demo ===
REGULAR: Economy seating
PREMIUM: Enhanced comfort seating
VIP: Luxury experience seating
```

### Multiple Case Values Output:
```
=== Multiple Case Values Demo ===
MONDAY: Weekday
TUESDAY: Weekday
WEDNESDAY: Weekday
THURSDAY: Weekday
FRIDAY: Weekday
SATURDAY: Weekend
SUNDAY: Weekend
```

## Key Differences

### Modern Switch vs Traditional Switch:
- **Modern Switch Expression**: Returns values directly, no break statements needed, more concise
- **Traditional Switch Statement**: Requires break statements, more verbose, executes statements

### Switch vs If-Else:
- **Switch**: Better for multiple discrete values, more readable for enums
- **If-Else**: Better for complex conditions, ranges, or boolean logic

### When to Use Each Pattern:
- **Modern Switch Expression**: When you need to return a value based on discrete cases (Java 14+)
- **Traditional Switch Statement**: When you need to execute multiple statements per case
- **If-Else**: When dealing with complex conditions or when switch isn't applicable

## Running the Code

To run this code:

1. **Compile**: `javac SwitchDemo.java`
2. **Execute**: `java SwitchDemo`
3. **Interactive Testing**: Modify the main method to test different scenarios
4. **Debugging**: Add print statements to trace execution flow

Expected runtime behavior:
- All switch patterns produce consistent results for the same inputs
- Modern switch expressions are evaluated and return values immediately
- Traditional switch statements execute line by line until break is encountered

## Practical Applications

Switch statements are commonly used in:

1. **Menu Systems**: Handling user menu selections in console applications
2. **State Machines**: Managing different states in game development or workflow systems
3. **Configuration**: Processing different configuration options or settings
4. **HTTP Response Handling**: Processing different HTTP status codes
5. **Enum Processing**: Working with enumerated types for type-safe operations
6. **Calculator Applications**: Handling different mathematical operations
7. **Game Development**: Managing different game states, player actions, or enemy behaviors
8. **File Type Processing**: Handling different file extensions or MIME types
