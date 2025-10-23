# IntegerExamples.java - Understanding Integer Primitive Data Types

<!-- TOC -->
* [IntegerExamples.java - Understanding Integer Primitive Data Types](#integerexamplesjava---understanding-integer-primitive-data-types)
  * [Overview](#overview)
  * [Prompts for Replication](#prompts-for-replication)
    * [Prompt 1: BYTE Type Demonstration](#prompt-1-byte-type-demonstration)
    * [Prompt 2: SHORT Type Demonstration](#prompt-2-short-type-demonstration)
    * [Prompt 3: INT Type Demonstration](#prompt-3-int-type-demonstration)
    * [Prompt 4: LONG Type Demonstration](#prompt-4-long-type-demonstration)
    * [Prompt 5: Overflow/Underflow Examples](#prompt-5-overflowunderflow-examples)
    * [Prompt 6: Type Casting Examples with Detailed Explanation](#prompt-6-type-casting-examples-with-detailed-explanation)
  * [Key Concepts Covered](#key-concepts-covered)
    * [1. Integer Primitive Types Hierarchy](#1-integer-primitive-types-hierarchy)
    * [2. Choosing the Right Type](#2-choosing-the-right-type)
    * [3. Overflow and Underflow](#3-overflow-and-underflow)
    * [4. Type Casting and Data Loss](#4-type-casting-and-data-loss)
    * [5. Long Literal Suffix](#5-long-literal-suffix)
  * [Memory Behavior](#memory-behavior)
  * [Common Mistakes to Avoid](#common-mistakes-to-avoid)
    * [1. Forgetting 'L' suffix for long literals](#1-forgetting-l-suffix-for-long-literals)
    * [2. Not handling overflow](#2-not-handling-overflow)
    * [3. Unsafe narrowing casts](#3-unsafe-narrowing-casts)
    * [4. Using wrong type for the use case](#4-using-wrong-type-for-the-use-case)
    * [5. Assuming no data loss in casting](#5-assuming-no-data-loss-in-casting)
  * [Running the Code](#running-the-code)
  * [Expected Output](#expected-output)
  * [Next Steps](#next-steps)
  * [Summary](#summary)
<!-- TOC -->

## Overview
This file demonstrates all integer primitive data types in Java: byte, short, int, and long. It covers their ranges, use cases, overflow/underflow behavior, and type casting with detailed explanations of why values change during casting.

## Prompts for Replication

### Prompt 1: BYTE Type Demonstration
**Task**: Create a section that demonstrates the byte data type with practical examples.

**Expected Code Structure**: Variable declarations and print statements in main method

**Requirements**:
- Print section header: "1. BYTE (8-bit signed integer):"
- Display the range: "Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE
- Create byte variable `age` with value 25
- Create byte variable `temperature` with value -15
- Create byte variable `percentage` with value 100
- Print each variable with descriptive labels:
  - "Age: " + age
  - "Temperature: " + temperature + "°C"
  - "Percentage: " + percentage + "%"
- Add empty line at the end

**Key Points**:
- Byte is an 8-bit signed integer
- Range: -128 to 127
- Use for small numbers to save memory
- Ideal for age, percentages, small counters

---

### Prompt 2: SHORT Type Demonstration
**Task**: Create a section that demonstrates the short data type with practical examples.

**Expected Code Structure**: Variable declarations and print statements in main method

**Requirements**:
- Print section header: "2. SHORT (16-bit signed integer):"
- Display the range: "Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE
- Create short variable `year` with value 2025
- Create short variable `elevation` with value -1500 and comment "// meters below sea level"
- Create short variable `pixels` with value 1920 and comment "// screen width"
- Create short variable `port` with value 8080 and comment "// network port"
- Print each variable with descriptive labels:
  - "Year: " + year
  - "Elevation: " + elevation + " meters"
  - "Screen width: " + pixels + " pixels"
  - "Server port: " + port
- Add empty line at the end

**Key Points**:
- Short is a 16-bit signed integer
- Range: -32,768 to 32,767
- Use for medium-sized numbers
- Common for years, ports, screen dimensions, elevations

---

### Prompt 3: INT Type Demonstration
**Task**: Create a section that demonstrates the int data type with practical examples.

**Expected Code Structure**: Variable declarations and print statements in main method

**Requirements**:
- Print section header: "3. INT (32-bit signed integer) - Most Common:"
- Display the range: "Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE
- Create int variable `population` with value 1500000
- Create int variable `salary` with value 75000
- Create int variable `studentId` with value 12345
- Create int variable `distance` with value -500000 and comment "// negative for debt/deficit"
- Print each variable with descriptive labels:
  - "City population: " + population
  - "Annual salary: $" + salary
  - "Student ID: " + studentId
  - "Distance/Deficit: " + distance
- Add empty line at the end

**Key Points**:
- Int is a 32-bit signed integer
- Range: -2,147,483,648 to 2,147,483,647
- **Most commonly used integer type in Java**
- Default choice for integer values
- Use for populations, salaries, IDs, general counting

---

### Prompt 4: LONG Type Demonstration
**Task**: Create a section that demonstrates the long data type with practical examples.

**Expected Code Structure**: Variable declarations and print statements in main method

**Requirements**:
- Print section header: "4. LONG (64-bit signed integer):"
- Display the range: "Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE
- Create long variable `worldPopulation` with value 8000000000L and comment "// Note the 'L' suffix"
- Create long variable `nationalDebt` with value 31000000000000L
- Create long variable `milliseconds` with value System.currentTimeMillis()
- Create long variable `fileSize` with value 2147483648L and comment "// File larger than int can hold"
- Print each variable with descriptive labels:
  - "World population: " + worldPopulation
  - "National debt: $" + nationalDebt
  - "Current time (milliseconds): " + milliseconds
  - "Large file size: " + fileSize + " bytes"
- Add empty line at the end

**Key Points**:
- Long is a 64-bit signed integer
- Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
- **Must use 'L' suffix for long literals** (e.g., 8000000000L)
- Use for very large numbers that exceed int capacity
- Common for timestamps, file sizes, large populations, financial data

---

### Prompt 5: Overflow/Underflow Examples
**Task**: Create a section that demonstrates integer overflow and underflow behavior.

**Expected Code Structure**: Variable declarations and arithmetic operations with print statements

**Requirements**:
- Print section header: "5. Overflow/Underflow Examples:"
- Create byte variable `maxByte` with value Byte.MAX_VALUE
- Print "Max byte value: " + maxByte
- Print "Max byte + 1 (overflow): " + (byte)(maxByte + 1)
- Add empty line
- Create int variable `maxInt` with value Integer.MAX_VALUE
- Print "Max int value: " + maxInt
- Print "Max int + 1 (overflow): " + (maxInt + 1)
- Add empty line at the end

**Key Points**:
- Overflow occurs when a value exceeds the maximum limit
- The value wraps around to the minimum value
- For byte: 127 + 1 = -128
- For int: 2,147,483,647 + 1 = -2,147,483,648
- **No automatic overflow detection** - Java silently wraps around

---

### Prompt 6: Type Casting Examples with Detailed Explanation
**Task**: Create a comprehensive section demonstrating type casting between integer types with detailed explanations of why values change.

**Expected Code Structure**: Variable declarations, casting operations, and detailed print statements

**Requirements**:
- Print section header: "6. Type Casting Examples:"
- Create long variable `bigNumber` with value 1000000L
- Cast to int: `int castedToInt = (int) bigNumber` with comment "// Explicit casting"
- Cast to short: `short castedToShort = (short) castedToInt`
- Cast to byte: `byte castedToByte = (byte) castedToShort`
- Print all casted values:
  - "Original long: " + bigNumber
  - "Casted to int: " + castedToInt
  - "Casted to short: " + castedToShort
  - "Casted to byte: " + castedToByte
- Print detailed explanation header: "\n🔍 WHY DO VALUES CHANGE DURING CASTING?"
- Print separator line
- Show binary representation:
  - "Binary representation of 1000000:"
  - Show 32-bit, 16-bit, and 8-bit representations using String.format
- Print mathematical explanation:
  - "Mathematical explanation:"
  - "1000000 in binary = 11110100001001000000"
  - "For short (16 bits): 1000000 % 65536 = " + (1000000 % 65536) + " = 16960"
  - "For byte (8 bits): 1000000 % 256 = " + (1000000 % 256) + " = 64"
- Print more examples header: "\n📊 More Casting Examples:"
- Create int array with test numbers: {300, 1000, 70000}
- Loop through test numbers and show casting results with data loss indicators
- Print safe casting example header: "\n✅ Safe Casting Example:"
- Demonstrate safe casting with range checking before casting

**Key Points**:
- Casting from larger to smaller types can lose data
- Only the least significant bits are kept
- Formula: value % (2^bits) determines the result
- Always check range before downcasting to avoid data loss
- Use explicit casting syntax for narrowing conversions

## Key Concepts Covered

### 1. Integer Primitive Types Hierarchy

**What you'll learn:**
- Four integer primitive types in Java
- Memory size and range for each type
- When to use each type

**Type Specifications:**
```java
// byte: 8-bit signed integer
byte age = 25;
// Range: -128 to 127

// short: 16-bit signed integer  
short year = 2025;
// Range: -32,768 to 32,767

// int: 32-bit signed integer (MOST COMMON)
int population = 1500000;
// Range: -2,147,483,648 to 2,147,483,647

// long: 64-bit signed integer
long worldPopulation = 8000000000L; // Note the 'L' suffix
// Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
```

**Key Points:**
- **int** is the default and most commonly used integer type
- **byte** saves memory for small numbers (-128 to 127)
- **short** is for medium-sized numbers (-32K to 32K)
- **long** is for very large numbers (requires 'L' suffix)
- All are signed (can be negative)

### 2. Choosing the Right Type

**Practical Guidelines:**

| Type | Use Case | Examples |
|------|----------|----------|
| **byte** | Very small numbers, memory-critical | Age, percentage, small counters |
| **short** | Medium numbers, legacy systems | Year, port numbers, screen dimensions |
| **int** | General purpose (DEFAULT) | Populations, salaries, IDs, loop counters |
| **long** | Very large numbers | Timestamps, file sizes, large populations |

**Code Examples:**
```java
// byte: Small values
byte age = 25;
byte temperature = -15;
byte percentage = 100;

// short: Medium values
short year = 2025;
short port = 8080;
short pixels = 1920;

// int: Most common - general purpose
int population = 1500000;
int salary = 75000;
int studentId = 12345;

// long: Large values (note the 'L' suffix)
long worldPopulation = 8000000000L;
long nationalDebt = 31000000000000L;
long milliseconds = System.currentTimeMillis();
long fileSize = 2147483648L; // Larger than int can hold
```

### 3. Overflow and Underflow

**What you'll learn:**
- What happens when values exceed their type's limit
- How Java handles overflow (wrapping behavior)
- Why overflow can be dangerous

**Code Examples:**
```java
// Byte overflow
byte maxByte = Byte.MAX_VALUE; // 127
System.out.println("Max byte value: " + maxByte);
System.out.println("Max byte + 1 (overflow): " + (byte)(maxByte + 1)); // -128

// Int overflow
int maxInt = Integer.MAX_VALUE; // 2,147,483,647
System.out.println("Max int value: " + maxInt);
System.out.println("Max int + 1 (overflow): " + (maxInt + 1)); // -2,147,483,648
```

**Key Points:**
- **Overflow**: When a value exceeds the maximum, it wraps to the minimum
- **Underflow**: When a value goes below the minimum, it wraps to the maximum
- Java does NOT throw exceptions for overflow - it silently wraps around
- 127 + 1 = -128 for byte (wraps around)
- Can cause serious bugs if not handled properly
- Always validate input ranges for critical calculations

### 4. Type Casting and Data Loss

**What you'll learn:**
- How to cast between integer types
- Why and how data loss occurs during casting
- Binary representation of casting operations
- Safe casting practices

**Code Examples:**
```java
// Casting demonstration
long bigNumber = 1000000L;
int castedToInt = (int) bigNumber;     // 1000000 (no loss)
short castedToShort = (short) castedToInt; // 16960 (data loss!)
byte castedToByte = (byte) castedToShort;  // 64 (more data loss!)

System.out.println("Original long: " + bigNumber);      // 1000000
System.out.println("Casted to int: " + castedToInt);    // 1000000
System.out.println("Casted to short: " + castedToShort); // 16960
System.out.println("Casted to byte: " + castedToByte);   // 64
```

**Why Values Change - Binary Explanation:**
```
1000000 in binary = 11110100001001000000 (20 bits needed)

When casting to short (16 bits):
- Only the last 16 bits are kept: 0100001001000000
- Value becomes: 16960
- Formula: 1000000 % 65536 = 16960

When casting to byte (8 bits):
- Only the last 8 bits are kept: 01000000
- Value becomes: 64
- Formula: 1000000 % 256 = 64
```

**Safe Casting Practice:**
```java
int safeNumber = 100;
if (safeNumber >= Byte.MIN_VALUE && safeNumber <= Byte.MAX_VALUE) {
    byte safeByte = (byte) safeNumber;
    System.out.println(safeNumber + " safely casts to byte: " + safeByte);
} else {
    System.out.println("Cannot safely cast to byte - out of range");
}
```

**Key Points:**
- **Widening** (small → large): Automatic, no data loss
  - `byte → short → int → long`
- **Narrowing** (large → small): Requires explicit cast, can lose data
  - `long → int → short → byte`
- When narrowing, only the least significant bits are kept
- Formula for result: `value % (2^bits)`
- **Always check range before casting** to avoid data loss
- Use wrapper class methods for safe conversions

### 5. Long Literal Suffix

**What you'll learn:**
- Why 'L' suffix is required for long literals
- When to use 'L' vs 'l'
- Compilation errors without suffix

**Code Examples:**
```java
// Correct - with 'L' suffix
long worldPopulation = 8000000000L;
long nationalDebt = 31000000000000L;

// WRONG - without 'L' suffix (compilation error)
// long bigNumber = 8000000000; // ERROR: integer number too large

// Use uppercase 'L' (not lowercase 'l')
long good = 1000000L;  // Good - clear
long bad = 1000000l;   // Legal but confusing (looks like 1)
```

**Key Points:**
- Numbers larger than Integer.MAX_VALUE **must** have 'L' suffix
- Use uppercase 'L' (not lowercase 'l') for clarity
- Without 'L', Java treats the literal as int
- Compilation error if int literal exceeds int range

## Memory Behavior

**Size Comparison:**
```
byte:  1 byte  = 8 bits
short: 2 bytes = 16 bits  
int:   4 bytes = 32 bits (most common)
long:  8 bytes = 64 bits
```

**Memory Efficiency:**
- Use smaller types (byte/short) only when memory is critical
- Modern JVMs optimize int operations best
- Arrays of bytes/shorts can save significant memory
- For single variables, memory savings are negligible

## Common Mistakes to Avoid

### 1. Forgetting 'L' suffix for long literals
```java
// Wrong - compilation error
// long bigNumber = 10000000000; // ERROR: integer number too large

// Correct
long bigNumber = 10000000000L;
```

### 2. Not handling overflow
```java
// Dangerous - silent overflow
int result = Integer.MAX_VALUE + 1; // Wraps to Integer.MIN_VALUE

// Better - check before operation
if (value < Integer.MAX_VALUE) {
    result = value + 1;
} else {
    // Handle overflow case
}
```

### 3. Unsafe narrowing casts
```java
// Wrong - data loss without checking
int bigValue = 50000;
short smallValue = (short) bigValue; // Data loss! Result: -15536

// Correct - check range first
if (bigValue >= Short.MIN_VALUE && bigValue <= Short.MAX_VALUE) {
    short smallValue = (short) bigValue;
} else {
    System.out.println("Value out of range for short");
}
```

### 4. Using wrong type for the use case
```java
// Inefficient - byte too small for loop counter in most cases
for (byte i = 0; i < 200; i++) { // byte max is 127, infinite loop!
    System.out.println(i);
}

// Correct - use int for loop counters
for (int i = 0; i < 200; i++) {
    System.out.println(i);
}
```

### 5. Assuming no data loss in casting
```java
// Wrong assumption
long bigNumber = 1000000L;
byte smallNumber = (byte) bigNumber; // Results in 64, not 1000000!

// Always be aware of potential data loss
```

## Running the Code

Execute the `IntegerExamples.java` file to see:
- All four integer types with practical examples
- Range display for each type
- Overflow/underflow behavior demonstration
- Type casting with detailed explanations
- Binary representations showing why values change
- Safe casting examples with range checking

## Expected Output

```
=== Integer Primitive Types Examples ===

1. BYTE (8-bit signed integer):
Range: -128 to 127
Age: 25
Temperature: -15°C
Percentage: 100%

2. SHORT (16-bit signed integer):
Range: -32768 to 32767
Year: 2025
Elevation: -1500 meters
Screen width: 1920 pixels
Server port: 8080

3. INT (32-bit signed integer) - Most Common:
Range: -2147483648 to 2147483647
City population: 1500000
Annual salary: $75000
Student ID: 12345
Distance/Deficit: -500000

4. LONG (64-bit signed integer):
Range: -9223372036854775808 to 9223372036854775807
World population: 8000000000
National debt: $31000000000000
Current time (milliseconds): 1729439257294
Large file size: 2147483648 bytes

5. Overflow/Underflow Examples:
Max byte value: 127
Max byte + 1 (overflow): -128
Max int value: 2147483647
Max int + 1 (overflow): -2147483648

6. Type Casting Examples:
Original long: 1000000
Casted to int: 1000000
Casted to short: 16960
Casted to byte: 64

🔍 WHY DO VALUES CHANGE DURING CASTING?
==========================================
Binary representation of 1000000:
Original (32-bit): 00000000000011110100001001000000
Short keeps only last 16 bits: 0100001001000000
Byte keeps only last 8 bits:   01000000

Mathematical explanation:
1000000 in binary = 11110100001001000000
For short (16 bits): 1000000 % 65536 = 16960 = 16960
For byte (8 bits):   1000000 % 256 = 64 = 64

📊 More Casting Examples:

Testing number: 300
  As short: 300 (lost data: NO)
  As byte:  44 (lost data: YES)

Testing number: 1000
  As short: 1000 (lost data: NO)
  As byte:  -24 (lost data: YES)

Testing number: 70000
  As short: 4464 (lost data: YES)
  As byte:  112 (lost data: YES)

✅ Safe Casting Example:
100 safely casts to byte: 100
```

## Next Steps

- **FloatingPointExamples.java**: Learn about float and double types
- **BooleanExamples.java**: Understand boolean primitive type
- **CharExamples.java**: Explore character data type
- **TypeConversion.java**: Master automatic and explicit type conversion

## Summary

- **byte, short, int, long** are the four integer primitive types
- **int** is the default choice for integer values
- **long** requires 'L' suffix for large literals
- Overflow wraps around silently - always validate ranges
- Casting from large to small types can lose data
- Check ranges before narrowing casts to prevent data loss

