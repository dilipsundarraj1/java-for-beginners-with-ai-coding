<!-- TOC -->
* [Switch Statement Examples](#switch-statement-examples)
  * [Overview](#overview)
  * [Prompts for Replication](#prompts-for-replication)
    * [Prompt 1: SeatType Enum and Modern Switch Expression](#prompt-1-seattype-enum-and-modern-switch-expression)
    * [Prompt 2: Traditional Switch Statement with Break](#prompt-2-traditional-switch-statement-with-break)
    * [Prompt 3: If-Else Equivalent Pattern](#prompt-3-if-else-equivalent-pattern)
    * [Prompt 4: Day Enum with Multiple Case Values](#prompt-4-day-enum-with-multiple-case-values)
    * [Prompt 5: Main Method Integration](#prompt-5-main-method-integration)
<!-- /TOC -->

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
