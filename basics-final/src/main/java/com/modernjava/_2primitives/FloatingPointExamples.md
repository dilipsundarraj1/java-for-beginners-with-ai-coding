# FloatingPointExamples.java - Understanding Floating-Point Primitive Data Types

<!-- TOC -->
* [FloatingPointExamples.java - Understanding Floating-Point Primitive Data Types](#floatingpointexamplesjava---understanding-floating-point-primitive-data-types)
  * [Overview](#overview)
  * [Prompts for Replication](#prompts-for-replication)
    * [Prompt 1: FLOAT Type Demonstration](#prompt-1-float-type-demonstration)
    * [Prompt 2: DOUBLE Type Demonstration](#prompt-2-double-type-demonstration)
    * [Prompt 3: Special Floating Point Values](#prompt-3-special-floating-point-values)
    * [Prompt 4: Precision Comparison](#prompt-4-precision-comparison)
    * [Prompt 5: Type Casting Examples](#prompt-5-type-casting-examples)
    * [Prompt 6: Floating Point Precision Issues](#prompt-6-floating-point-precision-issues)
  * [Key Concepts Covered](#key-concepts-covered)
    * [1. Floating-Point Primitive Types](#1-floating-point-primitive-types)
    * [2. Choosing the Right Type](#2-choosing-the-right-type)
    * [3. Special Values (NaN and Infinity)](#3-special-values-nan-and-infinity)
    * [4. Precision Issues and Safe Comparison](#4-precision-issues-and-safe-comparison)
    * [5. Float Literal Suffix](#5-float-literal-suffix)
  * [Memory Behavior](#memory-behavior)
  * [Common Mistakes to Avoid](#common-mistakes-to-avoid)
    * [1. Forgetting 'f' suffix for float literals](#1-forgetting-f-suffix-for-float-literals)
    * [2. Using == for floating-point comparison](#2-using--for-floating-point-comparison)
    * [3. Using float/double for money calculations](#3-using-floatdouble-for-money-calculations)
    * [4. Not handling special values](#4-not-handling-special-values)
    * [5. Assuming exact decimal representation](#5-assuming-exact-decimal-representation)
  * [Running the Code](#running-the-code)
  * [Expected Output](#expected-output)
  * [Next Steps](#next-steps)
  * [Summary](#summary)
<!-- TOC -->

## Overview
This file demonstrates floating-point primitive data types in Java: float and double. It covers their ranges, precision differences, special values (NaN, Infinity), type casting, and the critical precision issues that every developer must understand.

## Prompts for Replication

### Prompt 1: FLOAT Type Demonstration
**Task**: Create a section that demonstrates the float data type with practical examples.

**Expected Code Structure**: Variable declarations and print statements in main method

**Requirements**:
- Print section header: "1. FLOAT (32-bit floating point):"
- Display the range: "Range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE
- Display the precision: "Precision: ~6-7 decimal digits"
- Create float variable `temperature` with value 98.6f and comment "// Note the 'f' suffix"
- Create float variable `price` with value 19.99f
- Create float variable `pi` with value 3.14159f
- Print each variable with descriptive labels:
    - "Body temperature: " + temperature + "°F"
    - "Product price: $" + price
    - "Pi (float): " + pi
- Add empty line at the end

**Exact Code to Implement**:
```java
System.out.println("1. FLOAT (32-bit floating point):");
System.out.println("Range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
System.out.println("Precision: ~6-7 decimal digits");

float temperature = 98.6f;          // Note the 'f' suffix
float price = 19.99f;
float pi = 3.14159f;

System.out.println("Body temperature: " + temperature + "°F");
System.out.println("Product price: $" + price);
System.out.println("Pi (float): " + pi);
System.out.println();
```

**Key Points**:
- Float is a 32-bit IEEE 754 floating point type
- Precision: approximately 6-7 decimal digits
- Range: ±3.4 × 10^38
- **Must use 'f' suffix** for float literals (e.g., 98.6f)
- Use for memory-critical situations, graphics, or when precision beyond 6-7 digits isn't needed
- Without 'f' suffix, Java treats the literal as double

**Expected Output**:
```
1. FLOAT (32-bit floating point):
Range: 1.4E-45 to 3.4028235E38
Precision: ~6-7 decimal digits
Body temperature: 98.6°F
Product price: $19.99
Pi (float): 3.14159
```

---

### Prompt 2: DOUBLE Type Demonstration
**Task**: Create a section that demonstrates the double data type with practical examples.

**Expected Code Structure**: Variable declarations and print statements in main method

**Requirements**:
- Print section header: "2. DOUBLE (64-bit floating point) - Default Choice:"
- Display the range: "Range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE
- Display the precision: "Precision: ~15-17 decimal digits"
- Create double variable `preciseTemperature` with value 98.60000000001
- Create double variable `bankBalance` with value 15432.89
- Create double variable `piPrecise` with value 3.141592653589793
- Create double variable `gpsLatitude` with value 40.712776000000001
- Print each variable with descriptive labels:
    - "Precise temperature: " + preciseTemperature + "°F"
    - "Bank balance: $" + bankBalance
    - "Pi (double): " + piPrecise
    - "GPS Latitude: " + gpsLatitude
- Add empty line at the end

**Exact Code to Implement**:
```java
System.out.println("2. DOUBLE (64-bit floating point) - Default Choice:");
System.out.println("Range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
System.out.println("Precision: ~15-17 decimal digits");

double preciseTemperature = 98.60000000001;
double bankBalance = 15432.89;
double piPrecise = 3.141592653589793;
double gpsLatitude = 40.712776000000001;

System.out.println("Precise temperature: " + preciseTemperature + "°F");
System.out.println("Bank balance: $" + bankBalance);
System.out.println("Pi (double): " + piPrecise);
System.out.println("GPS Latitude: " + gpsLatitude);
System.out.println();
```

**Key Points**:
- Double is a 64-bit IEEE 754 floating point type
- Precision: approximately 15-17 decimal digits
- Range: ±1.7 × 10^308
- **Default choice** for all floating-point operations in Java
- No suffix needed (double is the default for decimal literals)
- Use for scientific calculations, financial data, GPS coordinates, general decimal operations
- Much more precise than float

**Expected Output**:
```
2. DOUBLE (64-bit floating point) - Default Choice:
Range: 4.9E-324 to 1.7976931348623157E308
Precision: ~15-17 decimal digits
Precise temperature: 98.60000000001°F
Bank balance: $15432.89
Pi (double): 3.141592653589793
GPS Latitude: 40.712776000000001
```

---

### Prompt 3: Special Floating Point Values
**Task**: Create a section that demonstrates special floating-point values like Infinity and NaN.

**Expected Code Structure**: Variable declarations for special values and checking methods

**Requirements**:
- Print section header: "3. Special Floating Point Values:"
- Create double variable `positiveInfinity` with value Double.POSITIVE_INFINITY
- Create double variable `negativeInfinity` with value Double.NEGATIVE_INFINITY
- Create double variable `notANumber` with value Double.NaN
- Create double variable `divisionByZero` with value 5.0 / 0.0 and comment "// Infinity"
- Create double variable `zeroDivision` with value 0.0 / 0.0
- Create float variable `divisionByZeroF` with value 5.0f / 0.0f and comment "// Infinity"
- Print all special values
- Print checking methods: "Is NaN? " + Double.isNaN(notANumber)
- Print "Is Infinite? " + Double.isInfinite(positiveInfinity)
- Add empty line at the end

**Exact Code to Implement**:
```java
System.out.println("3. Special Floating Point Values:");

double positiveInfinity = Double.POSITIVE_INFINITY;
double negativeInfinity = Double.NEGATIVE_INFINITY;
double notANumber = Double.NaN;
double divisionByZero = 5.0 / 0.0; // Infinity
double zeroDivision = 0.0 / 0.0;
float divisionByZeroF = 5.0f / 0.0f; // Infinity

System.out.println("Positive Infinity: " + positiveInfinity);
System.out.println("Negative Infinity: " + negativeInfinity);
System.out.println("Not a Number (NaN): " + notANumber);
System.out.println("5.0 / 0.0 = " + divisionByZero);
System.out.println("5.0f / 0.0f = " + divisionByZeroF);
System.out.println("0.0 / 0.0 = " + zeroDivision);

// Checking for special values
System.out.println("Is NaN? " + Double.isNaN(notANumber));
System.out.println("Is Infinite? " + Double.isInfinite(positiveInfinity));
System.out.println();
```

**Key Points**:
- **Infinity**: Result of dividing a non-zero number by zero
- **NaN (Not a Number)**: Result of invalid operations (0.0 / 0.0, sqrt of negative)
- Both float and double support these special values (IEEE 754 standard)
- Use `Double.isNaN()` to check for NaN (NaN == NaN returns false!)
- Use `Double.isInfinite()` to check for infinity
- Java doesn't throw exceptions for these operations (unlike integer division by zero)
- Special values propagate through calculations

**Expected Output**:
```
3. Special Floating Point Values:
Positive Infinity: Infinity
Negative Infinity: -Infinity
Not a Number (NaN): NaN
5.0 / 0.0 = Infinity
5.0f / 0.0f = Infinity
0.0 / 0.0 = NaN
Is NaN? true
Is Infinite? true
```

---

### Prompt 4: Precision Comparison
**Task**: Create a section that demonstrates the precision differences between float and double.

**Expected Code Structure**: Variable declarations, arithmetic operations, and comparison print statements

**Requirements**:
- Print section header: "4. Precision Comparison:"
- Create float variable `floatResult` with value 1.0f / 3.0f
- Create double variable `doubleResult` with value 1.0 / 3.0
- Print "1/3 as float:  " + floatResult
- Print "1/3 as double: " + doubleResult
- Add section for large number precision loss
- Create float variable `bigFloat` with value 16777216f
- Create double variable `bigDouble` with value 16777216.0
- Print "\nLarge number precision:"
- Print "Float 16777216 + 1 = " + (bigFloat + 1) with comment "// Precision loss!"
- Print "Double 16777216 + 1 = " + (bigDouble + 1) with comment "// Still precise"
- Add empty line at the end

**Exact Code to Implement**:
```java
System.out.println("4. Precision Comparison:");

float floatResult = 1.0f / 3.0f;
double doubleResult = 1.0 / 3.0;

System.out.println("1/3 as float:  " + floatResult);
System.out.println("1/3 as double: " + doubleResult);

// Large number precision loss
float bigFloat = 16777216f;
double bigDouble = 16777216.0;

System.out.println("\nLarge number precision:");
System.out.println("Float 16777216 + 1 = " + (bigFloat + 1));  // Precision loss!
System.out.println("Double 16777216 + 1 = " + (bigDouble + 1)); // Still precise
System.out.println();
```

**Key Points**:
- Float has limited precision (~6-7 decimal digits)
- Double has much better precision (~15-17 decimal digits)
- Float loses precision with large numbers (16777216 + 1 = 16777216 due to precision loss)
- Double maintains precision for much larger numbers
- For critical calculations, always prefer double over float
- Precision loss happens because float can't represent all decimal values exactly

**Expected Output**:
```
4. Precision Comparison:
1/3 as float:  0.33333334
1/3 as double: 0.3333333333333333

Large number precision:
Float 16777216 + 1 = 1.6777216E7
Double 16777216 + 1 = 1.6777217E7
```

---

### Prompt 5: Type Casting Examples
**Task**: Create a section demonstrating type casting between floating-point types and integers.

**Expected Code Structure**: Variable declarations with casting operations

**Requirements**:
- Print section header: "6. Type Casting Examples:"
- Create double variable `doubleValue` with value 123.789
- Cast to float: `float floatFromDouble = (float) doubleValue`
- Cast to int: `int intFromDouble = (int) doubleValue` with comment "// Truncates decimal part"
- Print "Original double: " + doubleValue
- Print "Cast to float: " + floatFromDouble
- Print "Cast to int (truncated): " + intFromDouble
- Show automatic promotion example
- Create int variable `intNum` with value 10
- Create double variable `result` with value intNum / 3.0 and comment "// int promoted to double"
- Print "10 / 3.0 = " + result
- Add empty line at the end

**Exact Code to Implement**:
```java
System.out.println("6. Type Casting Examples:");

double doubleValue = 123.789;
float floatFromDouble = (float) doubleValue;
int intFromDouble = (int) doubleValue; // Truncates decimal part

System.out.println("Original double: " + doubleValue);
System.out.println("Cast to float: " + floatFromDouble);
System.out.println("Cast to int (truncated): " + intFromDouble);

// Automatic promotion
int intNum = 10;
double result = intNum / 3.0; // int promoted to double
System.out.println("10 / 3.0 = " + result);
System.out.println();
```

**Key Points**:
- Casting from double to float may lose precision
- Casting to int **truncates** the decimal part (doesn't round)
- Use Math.round() if you need rounding instead of truncation
- Automatic promotion: int → float → double (widening)
- Explicit casting required: double → float → int (narrowing)
- Mixed operations: int / double automatically promotes int to double
- Integer division (10 / 3) gives 3, but (10 / 3.0) gives 3.333...

**Expected Output**:
```
6. Type Casting Examples:
Original double: 123.789
Cast to float: 123.789
Cast to int (truncated): 123
10 / 3.0 = 3.3333333333333335
```

---

### Prompt 6: Floating Point Precision Issues
**Task**: Create a critical section demonstrating floating-point precision issues and safe comparison techniques.

**Expected Code Structure**: Variable declarations, arithmetic operations, and epsilon-based comparison

**Requirements**:
- Print section header: "7. ⚠️  Floating Point Precision Issues:"
- Create double variable `a` with value 0.1
- Create double variable `b` with value 0.2
- Create double variable `sum` with value a + b
- Print "0.1 + 0.2 = " + sum
- Print "Is 0.1 + 0.2 == 0.3? " + (sum == 0.3)
- Print "Difference from 0.3: " + Math.abs(sum - 0.3)
- Create double variable `epsilon` with value 1e-9
- Create boolean variable `isEqual` with value Math.abs(sum - 0.3) < epsilon
- Print "Safe comparison (within epsilon): " + isEqual
- Add empty line at the end

**Exact Code to Implement**:
```java
System.out.println("7. ⚠️  Floating Point Precision Issues:");

double a = 0.1;
double b = 0.2;
double sum = a + b;

System.out.println("0.1 + 0.2 = " + sum);
System.out.println("Is 0.1 + 0.2 == 0.3? " + (sum == 0.3));
System.out.println("Difference from 0.3: " + Math.abs(sum - 0.3));

// Safe comparison
double epsilon = 1e-9;
boolean isEqual = Math.abs(sum - 0.3) < epsilon;
System.out.println("Safe comparison (within epsilon): " + isEqual);
System.out.println();
```

**Key Points**:
- **The most important floating-point concept**: 0.1 + 0.2 ≠ 0.3 in binary floating-point
- Result: 0.30000000000000004 (not exactly 0.3)
- **Never use == for floating-point comparison**
- Use epsilon-based comparison: Math.abs(a - b) < epsilon
- Epsilon is a small tolerance value (e.g., 1e-9 for general use)
- This happens because many decimal numbers can't be represented exactly in binary
- Applies to both float and double (double just has better precision)
- Critical for financial, scientific, and engineering calculations

**Expected Output**:
```
7. ⚠️  Floating Point Precision Issues:
0.1 + 0.2 = 0.30000000000000004
Is 0.1 + 0.2 == 0.3? false
Difference from 0.3: 5.551115123125783E-17
Safe comparison (within epsilon): true
```

---

## Key Concepts Covered

### 1. Floating-Point Primitive Types

**What you'll learn:**
- Two floating-point primitive types in Java
- Memory size and precision for each type
- When to use each type

**Type Specifications:**
```java
// float: 32-bit IEEE 754 floating point
float temperature = 98.6f;  // Note the 'f' suffix
// Precision: ~6-7 decimal digits
// Range: ±3.4 × 10^38

// double: 64-bit IEEE 754 floating point (DEFAULT)
double preciseValue = 3.141592653589793;
// Precision: ~15-17 decimal digits
// Range: ±1.7 × 10^308
```

**Key Points:**
- **double** is the default and most commonly used floating-point type
- **float** saves memory but has limited precision
- Both follow IEEE 754 standard
- Neither can represent all decimal values exactly

### 2. Choosing the Right Type

**Practical Guidelines:**

| Type | Precision | Use Case | Examples |
|------|-----------|----------|----------|
| **float** | ~6-7 digits | Memory-critical, graphics | Game coordinates, colors, basic measurements |
| **double** | ~15-17 digits | General purpose (DEFAULT) | Scientific calculations, GPS, financial data, engineering |

**Code Examples:**
```java
// float: Memory-critical situations
float temperature = 98.6f;
float price = 19.99f;
float distance = 1000.5f;

// double: Most calculations (default choice)
double preciseTemperature = 98.60000000001;
double bankBalance = 15432.89;
double piPrecise = 3.141592653589793;
double gpsLatitude = 40.712776000000001;
```

### 3. Special Values (NaN and Infinity)

**What you'll learn:**
- How floating-point types handle special values
- When these values occur
- How to check for them

**Code Examples:**
```java
// Infinity
double positiveInf = Double.POSITIVE_INFINITY;
double negativeInf = Double.NEGATIVE_INFINITY;
double divByZero = 5.0 / 0.0;  // Infinity

// NaN (Not a Number)
double nan = Double.NaN;
double invalid = 0.0 / 0.0;  // NaN

// Checking
Double.isNaN(value);      // Check if NaN
Double.isInfinite(value); // Check if infinite
```

**Key Points**:
- Division by zero produces Infinity (not an exception)
- Invalid operations produce NaN
- NaN is not equal to anything, including itself (NaN == NaN is false!)
- Always use `Double.isNaN()` to check for NaN
- Special values propagate through calculations

### 4. Precision Issues and Safe Comparison

**What you'll learn:**
- Why 0.1 + 0.2 ≠ 0.3 in floating-point arithmetic
- How to safely compare floating-point numbers
- The epsilon technique

**Code Examples:**
```java
// The Problem
double sum = 0.1 + 0.2;
System.out.println(sum);         // 0.30000000000000004
System.out.println(sum == 0.3);  // false!

// The Solution: Epsilon-based comparison
double epsilon = 1e-9;
boolean isEqual = Math.abs(sum - 0.3) < epsilon;
System.out.println(isEqual);  // true
```

**Safe Comparison Helper:**
```java
public static boolean equals(double a, double b, double epsilon) {
    return Math.abs(a - b) < epsilon;
}

// Usage
if (equals(sum, 0.3, 1e-9)) {
    System.out.println("Values are equal within tolerance");
}
```

**Key Points**:
- **Never use == for floating-point comparison**
- Use epsilon (tolerance) for comparison: `Math.abs(a - b) < epsilon`
- Choose appropriate epsilon (1e-9 for general, 1e-6 for graphics/games)
- This is due to binary representation limitations
- Applies to all floating-point operations

### 5. Float Literal Suffix

**What you'll learn:**
- Why 'f' suffix is required for float literals
- Compilation errors without suffix
- Best practices

**Code Examples:**
```java
// Correct - with 'f' suffix
float temperature = 98.6f;
float price = 19.99f;

// WRONG - without 'f' suffix (compilation error)
// float value = 98.6; // ERROR: incompatible types (possible lossy conversion)

// Without suffix, it's treated as double
double value = 98.6;  // OK - no suffix needed for double
```

**Key Points**:
- Float literals **must** have 'f' or 'F' suffix
- Without suffix, Java treats decimal literals as double
- Use lowercase 'f' for consistency
- Double doesn't need a suffix (it's the default)

## Memory Behavior

**Size Comparison:**
```
float:  4 bytes = 32 bits
double: 8 bytes = 64 bits
```

**Precision Comparison:**
```
float:  ~6-7 decimal digits
double: ~15-17 decimal digits
```

**Memory Efficiency:**
- Use float only when memory is critical (large arrays)
- Double is preferred for most calculations
- Modern processors handle both efficiently
- For single variables, memory difference is negligible

## Common Mistakes to Avoid

### 1. Forgetting 'f' suffix for float literals
```java
// Wrong - compilation error
// float value = 98.6; // ERROR: incompatible types

// Correct
float value = 98.6f;
```

### 2. Using == for floating-point comparison
```java
// Wrong - unreliable
double sum = 0.1 + 0.2;
if (sum == 0.3) { // false!
    System.out.println("Equal");
}

// Correct - epsilon comparison
double epsilon = 1e-9;
if (Math.abs(sum - 0.3) < epsilon) {
    System.out.println("Equal");
}
```

### 3. Using float/double for money calculations
```java
// Wrong - precision errors
double money = 1.00 - 0.90;
System.out.println(money);  // 0.09999999999999998

// Correct - use BigDecimal
BigDecimal price1 = new BigDecimal("1.00");
BigDecimal price2 = new BigDecimal("0.90");
BigDecimal difference = price1.subtract(price2);  // Exactly 0.10

// Or use integers (cents)
int priceInCents = 100 - 90;  // Exactly 10 cents
```

### 4. Not handling special values
```java
// Wrong - not checking for NaN
double result = 0.0 / 0.0;
if (result == Double.NaN) { // Always false!
    System.out.println("Is NaN");
}

// Correct
if (Double.isNaN(result)) {
    System.out.println("Is NaN");
}
```

### 5. Assuming exact decimal representation
```java
// Wrong assumption
float f = 0.1f;
System.out.println(f);  // Not exactly 0.1!

// Be aware of limitations
// Use appropriate precision and comparison techniques
```

## Running the Code

Execute the `FloatingPointExamples.java` file to see:
- Float and double examples with different precision levels
- Special values (NaN, Infinity) and how to check for them
- Precision comparison between float and double
- The critical 0.1 + 0.2 problem and epsilon-based solution
- Type casting examples
- Real-world usage scenarios

## Expected Output

```
=== Floating Point Types Examples ===

1. FLOAT (32-bit floating point):
Range: 1.4E-45 to 3.4028235E38
Precision: ~6-7 decimal digits
Body temperature: 98.6°F
Product price: $19.99
Pi (float): 3.14159

2. DOUBLE (64-bit floating point) - Default Choice:
Range: 4.9E-324 to 1.7976931348623157E308
Precision: ~15-17 decimal digits
Precise temperature: 98.60000000001°F
Bank balance: $15432.89
Pi (double): 3.141592653589793
GPS Latitude: 40.712776000000001

3. Special Floating Point Values:
Positive Infinity: Infinity
Negative Infinity: -Infinity
Not a Number (NaN): NaN
5.0 / 0.0 = Infinity
5.0f / 0.0f = Infinity
0.0 / 0.0 = NaN
Is NaN? true
Is Infinite? true

4. Precision Comparison:
1/3 as float:  0.33333334
1/3 as double: 0.3333333333333333

Large number precision:
Float 16777216 + 1 = 1.6777216E7
Double 16777216 + 1 = 1.6777217E7

6. Type Casting Examples:
Original double: 123.789
Cast to float: 123.789
Cast to int (truncated): 123
10 / 3.0 = 3.3333333333333335

7. ⚠️  Floating Point Precision Issues:
0.1 + 0.2 = 0.30000000000000004
Is 0.1 + 0.2 == 0.3? false
Difference from 0.3: 5.551115123125783E-17
Safe comparison (within epsilon): true
```

## Next Steps

After mastering floating-point types, explore:
1. **BigDecimal** - For exact decimal calculations (especially money)
2. **Math class** - Mathematical functions and constants
3. **DecimalFormat** - Formatting floating-point output
4. **Scientific notation** - Working with very large/small numbers
5. **Rounding modes** - Different ways to round numbers

## Summary

**Key Takeaways:**
1. **double is the default** and preferred floating-point type
2. **float saves memory** but has limited precision (~6-7 digits)
3. **Never use == for floating-point comparison** - use epsilon technique
4. **0.1 + 0.2 ≠ 0.3** in floating-point arithmetic
5. **Special values** (NaN, Infinity) are part of IEEE 754 standard
6. **Always use 'f' suffix** for float literals
7. **For money calculations**, use BigDecimal or integers (cents)
8. **Check for NaN** using `Double.isNaN()`, not `== Double.NaN`
9. **Casting to int truncates**, doesn't round
10. **Precision matters** - choose appropriate type for your use case
