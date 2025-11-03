````markdown
// filepath: /Users/Z001QGD/Dilip/code-with-dilip/java-for-beginners-with-ai-coding/basics-final/src/main/java/com/modernjava/_4controlstatements/_for/ForDemoPrompts.md

# For Loop Examples

<!-- TOC -->
* [For Loop Examples](#for-loop-examples)
  * [Overview](#overview)
  * [Prompts for Replication](#prompts-for-replication)
    * [Prompt 1: Basic For Loop](#prompt-1-basic-for-loop)
    * [Prompt 2: Sum For Loop with Accumulator](#prompt-2-sum-for-loop-with-accumulator)
    * [Prompt 3: Enhanced For Loop with Integer Array](#prompt-3-enhanced-for-loop-with-integer-array)
    * [Prompt 4: Enhanced For Loop with Double Array](#prompt-4-enhanced-for-loop-with-double-array)
    * [Prompt 5: Enhanced For Loop with Char Array and Counting](#prompt-5-enhanced-for-loop-with-char-array-and-counting)
    * [Prompt 6: Main Method Integration](#prompt-6-main-method-integration)
<!-- /TOC -->

# For Loop Examples

This document provides examples of different for loop patterns in Java: basic traditional for loops, accumulators with loops, and enhanced for loops (for-each) with various data types including counting and visual display.

## Overview

For loops are used to execute a block of code repeatedly. Java provides multiple ways to implement for loops:
- **Traditional For Loop**: Use when you need a counter or index: `for (int i = 0; i < length; i++)`
- **Enhanced For Loop (For-Each)**: Use when you only need to read values: `for (type item : collection)`
- **For Loop with Step**: Skip iterations: `for (int i = 0; i < 10; i += 2)`
- **For Loop with Countdown**: Iterate backwards: `for (int i = 5; i > 0; i--)`

---

## Prompts for Replication

### Prompt 1: Basic For Loop
**Concept**: Traditional for loop with counter from 0 to 4

**Task**: Create a function that demonstrates a basic traditional for loop that prints iterations.

**Expected Function Signature**: `public static void basicForLoop()`

**Context**: A simple counting loop is the foundation for understanding loop control (initialization, condition, increment).

**Requirements**:
1. Create a traditional for loop with:
   - Initialization: `int i = 0`
   - Condition: `i < 5`
   - Increment: `i++`
2. Print each iteration: `"Iteration: " + i`
3. Loop will execute 5 times (0, 1, 2, 3, 4)

**Why This Matters**:
- ✅ Shows the **three components** of a traditional for loop (init, condition, increment)
- ✅ Demonstrates how **counter variable** controls loop execution
- ✅ Foundation for understanding **loop control flow**
- ✅ Real-world pattern: processing a fixed number of items

**Expected Output**:
```
Iteration: 0
Iteration: 1
Iteration: 2
Iteration: 3
Iteration: 4
```

---

### Prompt 2: Sum For Loop with Accumulator
**Concept**: Traditional for loop with accumulator pattern

**Task**: Create a function that calculates the sum of numbers 1 to 5 using a for loop and accumulator.

**Expected Function Signature**: `public static void sumForLoop()`

**Context**: The accumulator pattern is fundamental to many calculations: totals, averages, products, etc.

**Requirements**:
1. Declare an integer variable `sum = 0` (accumulator)
2. Create a traditional for loop with:
   - Initialization: `int i = 1`
   - Condition: `i <= 5`
   - Increment: `i++`
3. Inside loop: `sum += i` (add current value to accumulator)
4. After loop: Print result: `"Sum from 1 to 5: " + sum`

**Why This Matters**:
- ✅ Demonstrates the **accumulator pattern** (collecting/summing values)
- ✅ Shows how to **modify loop variable** within the loop
- ✅ Practical application: calculating totals, averages, running sums
- ✅ Foundation for financial, statistical, and data processing applications

**Expected Output**:
```
Sum from 1 to 5: 15
```

**Test Cases**:
- What would the sum be for 1 to 10? (Answer: 55)
- What would the sum be for 1 to 1? (Answer: 1)

---

### Prompt 3: Enhanced For Loop with Integer Array
**Concept**: Enhanced for loop (for-each) to iterate over integer array

**Task**: Create a function that displays seat numbers using an enhanced for loop with an integer array.

**Expected Function Signature**: `public static void showSeats()`

**Context**: Enhanced for loops are cleaner and simpler when you don't need the index.

**Requirements**:
1. Create an integer array: `int[] seats = {1, 2, 3}`
2. Use enhanced for loop: `for (int seat : seats)`
3. Print each seat: `"Seat: " + seat`
4. No need for index variable or manual increment

**Why This Matters**:
- ✅ Shows **enhanced for loop syntax** (simpler, more readable)
- ✅ Demonstrates **automatic iteration** over array elements
- ✅ **No index out of bounds** errors possible
- ✅ Cleaner code when you only need the values, not the positions

**Expected Output**:
```
Seat: 1
Seat: 2
Seat: 3
```

---

### Prompt 4: Enhanced For Loop with Double Array
**Concept**: Enhanced for loop with double array for decimal values

**Task**: Create a function that displays prices using an enhanced for loop with a double array.

**Expected Function Signature**: `public static void showPrices()`

**Context**: Enhanced for loops work with any data type, including floating-point numbers.

**Requirements**:
1. Create a double array: `double[] prices = {12.50, 15.75, 8.99}`
2. Use enhanced for loop: `for (double price : prices)`
3. Print each price: `"Price: $" + price`
4. Demonstrates type flexibility of enhanced for loops

**Why This Matters**:
- ✅ Shows that **enhanced for works with any data type** (int, double, String, etc.)
- ✅ Demonstrates **practical real-world data** (prices with decimals)
- ✅ Shows **automatic type inference** in loop variable
- ✅ Same simple syntax regardless of array element type

**Expected Output**:
```
Price: $12.5
Price: $15.75
Price: $8.99
```

---

### Prompt 5: Enhanced For Loop with Char Array and Counting
**Concept**: Enhanced for loop with char array and conditional counting logic

**Task**: Create a function that displays seat availability status using enhanced for loop and counts available/booked seats.

**Expected Function Signature**: `public static void showSeatAvailability()`

**Context**: Combining loops with conditions to analyze data is a common real-world pattern (inventory management, status tracking, etc.).

**Requirements**:
1. Create a char array: `char[] seats = {'A', 'X', 'A', 'A', 'X', 'A', 'X', 'A'}`
   - 'A' = available, 'X' = booked
2. Declare counters: `int availableCount = 0`, `int bookedCount = 0`
3. Use enhanced for loop to read each seat status
4. Count available seats ('A') and booked seats ('X') using if-else conditions
5. Print section header: `"=== SEAT AVAILABILITY STATUS ==="`
6. Print counts: `"Available: " + availableCount` and `"Booked   : " + bookedCount`
7. Display visual representation:
   - Print each seat with its status in brackets: `[A] [X] [A]...`
   - Print position numbers below: `1   2   3...`

**Why This Matters**:
- ✅ Shows **combining loops with conditionals** for data analysis
- ✅ Demonstrates **counter/accumulator pattern** within conditional logic
- ✅ Shows **practical application**: seat/inventory management system
- ✅ Illustrates **visual display** of data using traditional for loop for formatting

**Expected Output**:
```
=== SEAT AVAILABILITY STATUS ===
Available: 5
Booked   : 3
Seats    : [A] [X] [A] [A] [X] [A] [X] [A] 
Position :  1   2   3   4   5   6   7   8  
```

---

### Prompt 6: Main Method Integration
**Concept**: Orchestrating all for loop examples in a coordinated main method

**Task**: Create a main method that demonstrates all the for loop examples with proper organization.

**Expected Function Signature**: `public static void main(String[] args)`

**Context**: A well-organized main method shows the flow of a complete program and how different functions work together.

**Requirements**:
1. Call functions in logical order:
   - First section: Traditional for loops
     - `basicForLoop()`
     - `sumForLoop()`
   - Second section: Enhanced for loops
     - `showSeats()`
     - `showPrices()`
     - `showSeatAvailability()`
2. Use clear section comments:
   - `// for loop` before traditional for loop calls
   - `// enhanced-for loop` before enhanced for loop calls
3. Results should flow naturally from one function to the next

**Why This Pattern Matters**:
- ✅ Shows how **small focused functions** work together
- ✅ Demonstrates **program organization** with comments
- ✅ Shows **logical flow** from simpler to more complex concepts
- ✅ Real-world pattern: main method as program orchestrator

**Expected Output**:
```
Iteration: 0
Iteration: 1
Iteration: 2
Iteration: 3
Iteration: 4
Sum from 1 to 5: 15
Seat: 1
Seat: 2
Seat: 3
Price: $12.5
Price: $15.75
Price: $8.99

=== SEAT AVAILABILITY STATUS ===
Available: 5
Booked   : 3
Seats    : [A] [X] [A] [A] [X] [A] [X] [A] 
Position :  1   2   3   4   5   6   7   8  
```

---

## Key Concepts

### Traditional For Loop Syntax
```
for (initialization; condition; increment) {
    // code to execute
}
```
- **Initialization**: Runs once before loop starts
- **Condition**: Checked before each iteration
- **Increment**: Runs after each iteration
- Use when you need: counter, index, specific ranges, or complex iteration patterns

### Enhanced For Loop Syntax (For-Each)
```
for (type variable : array/collection) {
    // code to execute
}
```
- Automatically iterates through all elements
- Variable holds current element
- No index available (but also no index errors)
- Use when you only need to read values, not modify or access by index

### Common Loop Variations

**Countdown Loop**:
```java
for (int i = 5; i > 0; i--) {
    System.out.println(i);  // 5, 4, 3, 2, 1
}
```

**Step Loop (Skip Elements)**:
```java
for (int i = 0; i < 10; i += 2) {
    System.out.println(i);  // 0, 2, 4, 6, 8
}
```

**Infinite Loop (Be Careful!)**:
```java
for (int i = 0; ; i++) {
    // This runs forever!
}
```

---

## Summary

### What We Learned
- ✅ **Traditional for loops** for counter-based iteration
- ✅ **Accumulator pattern** for collecting/summing values
- ✅ **Enhanced for loops** for simple iteration over arrays
- ✅ **Data type flexibility** in loops (int, double, char, etc.)
- ✅ **Combining loops with conditionals** for data analysis
- ✅ **Practical applications**: displaying data, counting, analyzing inventory

### Key Takeaways
1. Use **traditional for loop** when you need: counter, index, specific ranges
2. Use **enhanced for loop** when you only need to read all values
3. **Accumulator pattern** is essential for totals, averages, and running counts
4. **Conditional logic inside loops** enables complex data processing
5. **Visual display patterns** require traditional loops (for index information)

### Practice Strategies
- Trace through loops manually to understand execution
- Modify loop conditions to see different iteration patterns
- Add print statements to track accumulator values
- Combine different loop types for different purposes
- Experiment with different data types in enhanced for loops

````

