- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
   - Enhanced for loops are generally as fast as traditional for loops
## Key Learning Points
- **User Experience**: Processes multiple items seamlessly
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
2. **Enhanced For Loop (For-Each):**
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
   - Cleaner, more readable syntax
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
   - Automatic type inference in the loop variable
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

   - Compiler optimizes both types similarly

   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
}
```java
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
```
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---

## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
```java
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
```java
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points

1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior

2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns

4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
```
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points

1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior

2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections

3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns

4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
```java
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
```java
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
---
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
## 4. Complex For Loop Example - Seat Availability System
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
for (int i = 1; i <= numberOfTickets; i++) {
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
4. **Data Type Compatibility:**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - **Visual Display**: Use traditional for loop when you need position information
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
---
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
   - Enhanced for loops are generally as fast as traditional for loops
## Key Learning Points
- **User Experience**: Processes multiple items seamlessly
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
2. **Enhanced For Loop (For-Each):**
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
   - Cleaner, more readable syntax
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
   - Automatic type inference in the loop variable
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

   - Compiler optimizes both types similarly

   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
   - Basic counter-controlled for loop
1. Include package declaration: com.modernjava._4controlstatements._for
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16
**Prompt:**
=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
Create a complete Java class that demonstrates various for loop patterns:
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loop with doubles
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
5. Show progression from simple to complex for loop usage
---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Enter age for ticket 2: 8
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
**Answer:** Yes! For loops are perfect for processing multiple tickets. Here's how to create a TicketCalculatorV2 version that demonstrates practical for loop usage.
---
**Prompt:**
## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
```java
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
```java
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
for (int i = 1; i <= numberOfTickets; i++) {
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
4. **Data Type Compatibility:**
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - **Visual Display**: Use traditional for loop when you need position information
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
---
---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points

1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior

2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns

4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loops are generally as fast as traditional for loops
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
- **User Experience**: Processes multiple items seamlessly
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
2. **Enhanced For Loop (For-Each):**
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
   - Cleaner, more readable syntax
---
}
## Key Learning Points
4. **Data Type Compatibility:**
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Automatic type inference in the loop variable
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
---

## Key Learning Points

1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior

2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections

3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns

4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

   - Compiler optimizes both types similarly

   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
   - Basic counter-controlled for loop
1. Include package declaration: com.modernjava._4controlstatements._for
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16
**Prompt:**
=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
Create a complete Java class that demonstrates various for loop patterns:
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loop with doubles
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
5. Show progression from simple to complex for loop usage
---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Enter age for ticket 2: 8
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
**Answer:** Yes! For loops are perfect for processing multiple tickets. Here's how to create a TicketCalculatorV2 version that demonstrates practical for loop usage.
---
**Prompt:**
## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
```
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---

## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
```java
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
```java
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
```java
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
for (int i = 1; i <= numberOfTickets; i++) {
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
4. **Data Type Compatibility:**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - **Visual Display**: Use traditional for loop when you need position information
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
---
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
   - Enhanced for loops are generally as fast as traditional for loops
## Key Learning Points
- **User Experience**: Processes multiple items seamlessly
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
2. **Enhanced For Loop (For-Each):**
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
   - Cleaner, more readable syntax
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
   - Automatic type inference in the loop variable
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

   - Compiler optimizes both types similarly

   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
}
```java
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
Enter age for ticket 1: 25
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---

## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
```java
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
```java
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points

1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior

2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns

4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loops are generally as fast as traditional for loops
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
- **User Experience**: Processes multiple items seamlessly
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
2. **Enhanced For Loop (For-Each):**
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
   - Cleaner, more readable syntax
---
}
## Key Learning Points
4. **Data Type Compatibility:**
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Automatic type inference in the loop variable
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
---

## Key Learning Points

1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior

2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections

3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns

4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

   - Compiler optimizes both types similarly

   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
   - Basic counter-controlled for loop
1. Include package declaration: com.modernjava._4controlstatements._for
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16
**Prompt:**
=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
Create a complete Java class that demonstrates various for loop patterns:
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loop with doubles
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
5. Show progression from simple to complex for loop usage
---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Enter age for ticket 2: 8
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
**Answer:** Yes! For loops are perfect for processing multiple tickets. Here's how to create a TicketCalculatorV2 version that demonstrates practical for loop usage.
---
**Prompt:**
## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
Position :  1   2   3   4   5   6   7   8
1. Create a private static method called showSeatAvailability()
2. Create a char array representing seat status: {'A', 'X', 'A', 'A', 'X', 'A', 'X', 'A'}
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---
   - 'A' = available, 'X' = booked
## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
4. Use if-else statements inside the loop to categorize seats
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
   - Basic counter-controlled for loop
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
1. Include package declaration: com.modernjava._4controlstatements._for
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16
**Prompt:**
=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
Create a complete Java class that demonstrates various for loop patterns:
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loop with doubles
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
5. Show progression from simple to complex for loop usage
---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Enter age for ticket 2: 8
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
**Answer:** Yes! For loops are perfect for processing multiple tickets. Here's how to create a TicketCalculatorV2 version that demonstrates practical for loop usage.
---
**Prompt:**
## Key Learning Points
```java
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
for (int i = 1; i <= numberOfTickets; i++) {
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
4. **Data Type Compatibility:**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - **Visual Display**: Use traditional for loop when you need position information
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
---
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
   - Enhanced for loops are generally as fast as traditional for loops
## Key Learning Points
- **User Experience**: Processes multiple items seamlessly
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
2. **Enhanced For Loop (For-Each):**
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
   - Cleaner, more readable syntax
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
   - Automatic type inference in the loop variable
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

   - Compiler optimizes both types similarly

   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
}
```java
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
Enter age for ticket 1: 25
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---
2. Add Scanner import for user input
## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
```java
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
```java
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points

1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior

2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns

4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loops are generally as fast as traditional for loops
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
- **User Experience**: Processes multiple items seamlessly
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
2. **Enhanced For Loop (For-Each):**
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
   - Cleaner, more readable syntax
---
}
## Key Learning Points
4. **Data Type Compatibility:**
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Automatic type inference in the loop variable
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
---

## Key Learning Points

1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior

2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections

3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns

4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

   - Compiler optimizes both types similarly

   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
   - Basic counter-controlled for loop
1. Include package declaration: com.modernjava._4controlstatements._for
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16
**Prompt:**
=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
Create a complete Java class that demonstrates various for loop patterns:
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loop with doubles
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
5. Show progression from simple to complex for loop usage
---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Enter age for ticket 2: 8
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
**Answer:** Yes! For loops are perfect for processing multiple tickets. Here's how to create a TicketCalculatorV2 version that demonstrates practical for loop usage.
---
**Prompt:**
## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
```
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---
   - Accumulate total price using accumulator pattern
## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
```java
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
```java
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
```java
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
for (int i = 1; i <= numberOfTickets; i++) {
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
4. **Data Type Compatibility:**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - **Visual Display**: Use traditional for loop when you need position information
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
---
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
   - Enhanced for loops are generally as fast as traditional for loops
## Key Learning Points
- **User Experience**: Processes multiple items seamlessly
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
2. **Enhanced For Loop (For-Each):**
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
   - Cleaner, more readable syntax
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
   - Automatic type inference in the loop variable
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

   - Compiler optimizes both types similarly

   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
}
```java
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
   - Enhanced for loops are generally as fast as traditional for loops
## Key Learning Points
- **User Experience**: Processes multiple items seamlessly
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
2. **Enhanced For Loop (For-Each):**
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
   - Cleaner, more readable syntax
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
   - Automatic type inference in the loop variable
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - **Complex Logic**: Traditional for loop for conditional processing
   - Compiler optimizes both types similarly

   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
   - Basic counter-controlled for loop
1. Include package declaration: com.modernjava._4controlstatements._for
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16
**Prompt:**
=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
Create a complete Java class that demonstrates various for loop patterns:
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loop with doubles
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
5. Show progression from simple to complex for loop usage
---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Enter age for ticket 2: 8
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
**Answer:** Yes! For loops are perfect for processing multiple tickets. Here's how to create a TicketCalculatorV2 version that demonstrates practical for loop usage.
---
**Prompt:**
## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
```
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---

## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
```java
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
```java
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
```java
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
for (int i = 1; i <= numberOfTickets; i++) {
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
4. **Data Type Compatibility:**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - **Visual Display**: Use traditional for loop when you need position information
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
---
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
   - Enhanced for loops are generally as fast as traditional for loops
## Key Learning Points
- **User Experience**: Processes multiple items seamlessly
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
2. **Enhanced For Loop (For-Each):**
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
   - Cleaner, more readable syntax
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
   - Automatic type inference in the loop variable
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

   - Compiler optimizes both types similarly

   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
}
```java
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - Accumulate total price using accumulator pattern
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Enter age for ticket 2: 8
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
**Answer:** Yes! For loops are perfect for processing multiple tickets. Here's how to create a TicketCalculatorV2 version that demonstrates practical for loop usage.
---
**Prompt:**
## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
```
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---
   - Accumulate total price using accumulator pattern
## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
```java
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
```java
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
```java
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
for (int i = 1; i <= numberOfTickets; i++) {
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
4. **Data Type Compatibility:**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - **Visual Display**: Use traditional for loop when you need position information
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
---
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
   - Enhanced for loops are generally as fast as traditional for loops
## Key Learning Points
- **User Experience**: Processes multiple items seamlessly
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
2. **Enhanced For Loop (For-Each):**
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
   - Cleaner, more readable syntax
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
   - Automatic type inference in the loop variable
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

   - Compiler optimizes both types similarly

   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
}
```java
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
```
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---

## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
```java
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
```java
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3
2. Add Scanner import for user input
--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
## 4. Complex For Loop Example - Seat Availability System
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
for (int i = 1; i <= numberOfTickets; i++) {
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
4. **Data Type Compatibility:**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - **Visual Display**: Use traditional for loop when you need position information
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
---
---
}
## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
```java
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
```java
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3
4. **Data Type Compatibility:**
--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16
**Prompt:**
=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
Create a complete Java class that demonstrates various for loop patterns:
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loop with doubles
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
5. Show progression from simple to complex for loop usage
---
2. **Enhanced For Loop (For-Each):**
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
   - Cleaner, more readable syntax
---
}
## Key Learning Points
4. **Data Type Compatibility:**
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Automatic type inference in the loop variable
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
---

## Key Learning Points

## Key Learning Points

1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior

2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns

4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loops are generally as fast as traditional for loops
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
   - No risk of index out of bounds errors
   - Works with arrays and collections
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
   - Cleaner, more readable syntax
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
    int surcharge = // calculate surcharge
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
}
## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
   - Use when you only need to read values: `for (type item : collection)`
---
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
Enter age for ticket 2: 8
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
## 6. Real-World For Loop Application - Ticket Calculator
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
   - Enhanced for loops are generally as fast as traditional for loops
## Key Learning Points
- **User Experience**: Processes multiple items seamlessly
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
2. **Enhanced For Loop (For-Each):**
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
   - Cleaner, more readable syntax
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
   - Automatic type inference in the loop variable
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
6. **Performance Considerations:**
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
Create a complete Java class that demonstrates various for loop patterns:
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
=== ORDER SUMMARY ===
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
Create a complete Java class that demonstrates various for loop patterns:
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - 'A' = available, 'X' = booked
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
4. In main method:
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loop with doubles
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
5. Show progression from simple to complex for loop usage
---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Enter age for ticket 2: 8
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
**Answer:** Yes! For loops are perfect for processing multiple tickets. Here's how to create a TicketCalculatorV2 version that demonstrates practical for loop usage.
---
**Prompt:**
## Key Learning Points
4. Use if-else statements inside the loop to categorize seats
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
for (int i = 1; i <= numberOfTickets; i++) {
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
4. **Data Type Compatibility:**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - **Visual Display**: Use traditional for loop when you need position information
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
---
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
5. Include these additional for loop examples:
## 2. Enhanced For Loop with Integer Array
```
## 3. Enhanced For Loop with Double Array
   - Enhanced for loop with doubles
**Prompt:**
```
Create a Java method that demonstrates enhanced for loop with double values:
```
1. Create a private static method called showPrices()
2. Initialize a double array with prices: {12.50, 15.75, 8.99}
3. Use enhanced for loop to iterate through the prices
4. Print "Price: $" followed by each price value
5. Demonstrate how enhanced for loops work with different data types
```
```
**Expected Output:**
   - Enhanced for loop with doubles
**Console Output:**
```
=== SEAT AVAILABILITY STATUS ===
Available: 5
Booked   : 3
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
Position :  1   2   3   4   5   6   7   8
```
**Console Output:**
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Prompt:**
    }
Create a Java method that demonstrates enhanced for loop (for-each) with an integer array:
## 6. Real-World For Loop Application - Ticket Calculator
1. Create a private static method called showSeats()
2. Initialize an integer array with values {1, 2, 3}
3. Use enhanced for loop syntax: for (int seat : seats)
4. Print "Seat: " followed by each seat number
5. Show how enhanced for loop simplifies array iteration when you don't need indices
Position :  1   2   3   4   5   6   7   8
   - Accumulate total price using accumulator pattern
**Expected Output:**
   - Display order summary with totals and averages
**Prompt:**
**Prompt:**
```
Create a Java method that demonstrates enhanced for loop with double values:
Create a complete Java class that demonstrates various for loop patterns:
1. Create a private static method called showPrices()
2. Initialize a double array with prices: {12.50, 15.75, 8.99}
3. Use enhanced for loop to iterate through the prices
4. Print "Price: $" followed by each price value
5. Demonstrate how enhanced for loops work with different data types
**Expected Output:**
   - Enhanced for loop with doubles
**Console Output:**
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
=== SEAT AVAILABILITY STATUS ===
Available: 5
Booked   : 3
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
Position :  1   2   3   4   5   6   7   8
```
**Console Output:**
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
**Expected Output:**
4. Create a main method that calls all demonstration methods in sequence
## 5. Complete Class Structure
// Main processing loop
**Console Output:**
   - Enhanced: for (SeatType seat : SeatType.values())
## 4. Complex For Loop Example - Seat Availability System
Create a Java method that demonstrates enhanced for loop (for-each) with an integer array:
**Prompt:**
```
Create a Java method that demonstrates both enhanced and traditional for loops in a practical scenario:
Position :  1   2   3   4   5   6   7   8
1. Create a private static method called showSeatAvailability()
2. Create a char array representing seat status: {'A', 'X', 'A', 'A', 'X', 'A', 'X', 'A'}
   - 'A' = available, 'X' = booked
3. Use enhanced for loop to count available and booked seats
4. Use if-else statements inside the loop to categorize seats
5. Use traditional for loops to display visual representation with positions
6. Print a formatted header: "=== SEAT AVAILABILITY STATUS ==="
7. Show both counting and visual display functionality
2. Create a public class called ForDemo
3. Include all four methods demonstrating different for loop concepts:
   - Basic counter-controlled for loop
   - Enhanced for loop with integers
Create a complete Java class that demonstrates various for loop patterns:
   - Enhanced for loop with doubles
1. Include package declaration: com.modernjava._4controlstatements._for
2. Create a public class called ForDemo
3. Include all four methods demonstrating different for loop concepts:
   - Basic counter-controlled for loop
   - Enhanced for loop with integers
   - Enhanced for loop with doubles
**Console Output:**
    System.out.println("\n--- Ticket #" + i + " ---");
**Prompt:**
```
Create a complete Java class that demonstrates various for loop patterns:
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
1. Include package declaration: com.modernjava._4controlstatements._for
2. Create a public class called ForDemo
3. Include all four methods demonstrating different for loop concepts:
   - Basic counter-controlled for loop
   - Enhanced for loop with integers
   - Enhanced for loop with doubles
   - Complex example with both enhanced and traditional for loops
4. Create a main method that calls all demonstration methods in sequence
5. Show progression from simple to complex for loop usage
Create a complete Java class that demonstrates various for loop patterns:
   - Step-based: for (int i = 5; i <= count; i += 5)
1. Include package declaration: com.modernjava._4controlstatements._for
2. Create a public class called ForDemo
Enter age for ticket 1: 25
**Expected Output:**
## 4. Complex For Loop Example - Seat Availability System
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
   - **Counting/Accumulation**: Use enhanced for loop with counters
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Answer:** Yes! For loops are perfect for processing multiple tickets. Here's how to create a TicketCalculatorV2 version that demonstrates practical for loop usage.
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
## 4. Complex For Loop Example - Seat Availability System
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
}
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
---
1. Create a private static method called showSeatAvailability()
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Cleaner, more readable syntax
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
   - Same syntax regardless of data type
## Key Learning Points
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
4. Use if-else statements inside the loop to categorize seats
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 1: 25
1. **Traditional For Loop:**
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
5. Include these additional for loop examples:
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
## 3. Enhanced For Loop with Double Array
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
**Prompt:**
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
4. Print "Price: $" followed by each price value
5. Demonstrate how enhanced for loops work with different data types
}
## Key Learning Points
   - Basic counter-controlled for loop
1. Include package declaration: com.modernjava._4controlstatements._for
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3
```
--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14
   - Enhanced for loop with doubles
--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16
**Prompt:**
=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
Create a complete Java class that demonstrates various for loop patterns:
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
```
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
**Console Output:**
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Create a Java method that demonstrates enhanced for loop (for-each) with an integer array:
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loop with doubles
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
5. Show progression from simple to complex for loop usage
Position :  1   2   3   4   5   6   7   8
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Enter age for ticket 2: 8
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
**Answer:** Yes! For loops are perfect for processing multiple tickets. Here's how to create a TicketCalculatorV2 version that demonstrates practical for loop usage.
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Prompt:**
## Key Learning Points
**Expected Output:**
## 4. Complex For Loop Example - Seat Availability System
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
Position :  1   2   3   4   5   6   7   8
1. Create a private static method called showSeatAvailability()
2. Create a char array representing seat status: {'A', 'X', 'A', 'A', 'X', 'A', 'X', 'A'}
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---
   - 'A' = available, 'X' = booked
## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
4. Use if-else statements inside the loop to categorize seats
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
   - Basic counter-controlled for loop
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
1. Create a private static method called showSeatAvailability()
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
1. Include package declaration: com.modernjava._4controlstatements._for
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3
**Expected Output:**
--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14
**Console Output:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
**Expected Output:**
        basicForLoop();
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
## 2. Enhanced For Loop with Integer Array
```
## 3. Enhanced For Loop with Double Array
   - Enhanced for loop with doubles
**Prompt:**
```
Create a Java method that demonstrates enhanced for loop with double values:
```
1. Create a private static method called showPrices()
2. Initialize a double array with prices: {12.50, 15.75, 8.99}
3. Use enhanced for loop to iterate through the prices
4. Print "Price: $" followed by each price value
5. Demonstrate how enhanced for loops work with different data types
```
```
**Expected Output:**
   - Enhanced for loop with doubles
**Console Output:**
```
=== SEAT AVAILABILITY STATUS ===
Available: 5
Booked   : 3
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
Position :  1   2   3   4   5   6   7   8
```
**Console Output:**
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Prompt:**
    }
Create a Java method that demonstrates enhanced for loop (for-each) with an integer array:
## 6. Real-World For Loop Application - Ticket Calculator
1. Create a private static method called showSeats()
2. Initialize an integer array with values {1, 2, 3}
3. Use enhanced for loop syntax: for (int seat : seats)
4. Print "Seat: " followed by each seat number
5. Show how enhanced for loop simplifies array iteration when you don't need indices
Position :  1   2   3   4   5   6   7   8
   - Accumulate total price using accumulator pattern
**Expected Output:**
   - Display order summary with totals and averages
**Prompt:**
**Prompt:**
```
Create a Java method that demonstrates enhanced for loop with double values:
Create a complete Java class that demonstrates various for loop patterns:
1. Create a private static method called showPrices()
2. Initialize a double array with prices: {12.50, 15.75, 8.99}
3. Use enhanced for loop to iterate through the prices
4. Print "Price: $" followed by each price value
5. Demonstrate how enhanced for loops work with different data types
**Expected Output:**
   - Enhanced for loop with doubles
**Console Output:**
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
=== SEAT AVAILABILITY STATUS ===
Available: 5
Booked   : 3
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
Position :  1   2   3   4   5   6   7   8
```
**Console Output:**
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
**Expected Output:**
4. Create a main method that calls all demonstration methods in sequence
## 5. Complete Class Structure
// Main processing loop
**Console Output:**
   - Enhanced: for (SeatType seat : SeatType.values())
## 4. Complex For Loop Example - Seat Availability System
Create a Java method that demonstrates enhanced for loop (for-each) with an integer array:
**Prompt:**
```
Create a Java method that demonstrates both enhanced and traditional for loops in a practical scenario:
Position :  1   2   3   4   5   6   7   8
1. Create a private static method called showSeatAvailability()
2. Create a char array representing seat status: {'A', 'X', 'A', 'A', 'X', 'A', 'X', 'A'}
   - 'A' = available, 'X' = booked
3. Use enhanced for loop to count available and booked seats
4. Use if-else statements inside the loop to categorize seats
5. Use traditional for loops to display visual representation with positions
6. Print a formatted header: "=== SEAT AVAILABILITY STATUS ==="
7. Show both counting and visual display functionality
2. Create a public class called ForDemo
3. Include all four methods demonstrating different for loop concepts:
   - Basic counter-controlled for loop
   - Enhanced for loop with integers
Create a complete Java class that demonstrates various for loop patterns:
   - Enhanced for loop with doubles
1. Include package declaration: com.modernjava._4controlstatements._for
2. Create a public class called ForDemo
3. Include all four methods demonstrating different for loop concepts:
   - Basic counter-controlled for loop
   - Enhanced for loop with integers
   - Enhanced for loop with doubles
**Console Output:**
    System.out.println("\n--- Ticket #" + i + " ---");
**Prompt:**
```
Create a complete Java class that demonstrates various for loop patterns:
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
1. Include package declaration: com.modernjava._4controlstatements._for
2. Create a public class called ForDemo
3. Include all four methods demonstrating different for loop concepts:
   - Basic counter-controlled for loop
   - Enhanced for loop with integers
   - Enhanced for loop with doubles
   - Complex example with both enhanced and traditional for loops
4. Create a main method that calls all demonstration methods in sequence
5. Show progression from simple to complex for loop usage
Create a complete Java class that demonstrates various for loop patterns:
   - Step-based: for (int i = 5; i <= count; i += 5)
1. Include package declaration: com.modernjava._4controlstatements._for
2. Create a public class called ForDemo
Enter age for ticket 1: 25
**Expected Output:**
## 4. Complex For Loop Example - Seat Availability System
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
   - **Counting/Accumulation**: Use enhanced for loop with counters
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Answer:** Yes! For loops are perfect for processing multiple tickets. Here's how to create a TicketCalculatorV2 version that demonstrates practical for loop usage.
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
## 4. Complex For Loop Example - Seat Availability System
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
}
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
---
1. Create a private static method called showSeatAvailability()
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Cleaner, more readable syntax
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
   - Same syntax regardless of data type
## Key Learning Points
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
4. Use if-else statements inside the loop to categorize seats
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 1: 25
1. **Traditional For Loop:**
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
5. Include these additional for loop examples:
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
## 3. Enhanced For Loop with Double Array
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
**Prompt:**
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
4. Print "Price: $" followed by each price value
5. Demonstrate how enhanced for loops work with different data types
}
## Key Learning Points
   - Basic counter-controlled for loop
1. Include package declaration: com.modernjava._4controlstatements._for
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3
```
--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14
   - Enhanced for loop with doubles
--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16
**Prompt:**
=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
Create a complete Java class that demonstrates various for loop patterns:
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
```
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
**Console Output:**
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Create a Java method that demonstrates enhanced for loop (for-each) with an integer array:
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loop with doubles
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
5. Show progression from simple to complex for loop usage
Position :  1   2   3   4   5   6   7   8
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Enter age for ticket 2: 8
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
**Answer:** Yes! For loops are perfect for processing multiple tickets. Here's how to create a TicketCalculatorV2 version that demonstrates practical for loop usage.
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Prompt:**
## Key Learning Points
**Expected Output:**
## 4. Complex For Loop Example - Seat Availability System
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
Position :  1   2   3   4   5   6   7   8
1. Create a private static method called showSeatAvailability()
2. Create a char array representing seat status: {'A', 'X', 'A', 'A', 'X', 'A', 'X', 'A'}
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---
   - 'A' = available, 'X' = booked
## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
4. Use if-else statements inside the loop to categorize seats
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
   - Basic counter-controlled for loop
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
1. Create a private static method called showSeatAvailability()
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
1. Include package declaration: com.modernjava._4controlstatements._for
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16
**Prompt:**
=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
Create a complete Java class that demonstrates various for loop patterns:
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - 'A' = available, 'X' = booked
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loop with doubles
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
5. Show progression from simple to complex for loop usage
---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Enter age for ticket 2: 8
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
**Answer:** Yes! For loops are perfect for processing multiple tickets. Here's how to create a TicketCalculatorV2 version that demonstrates practical for loop usage.
---
**Prompt:**
## Key Learning Points
4. Use if-else statements inside the loop to categorize seats
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
for (int i = 1; i <= numberOfTickets; i++) {
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
4. **Data Type Compatibility:**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - **Visual Display**: Use traditional for loop when you need position information
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
---
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
   - Basic counter-controlled for loop
---
1. Include package declaration: com.modernjava._4controlstatements._for
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
**Console Output:**
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
   - Enhanced for loops are generally as fast as traditional for loops
## Key Learning Points
- **User Experience**: Processes multiple items seamlessly
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
2. **Enhanced For Loop (For-Each):**
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
   - Cleaner, more readable syntax
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
   - Automatic type inference in the loop variable
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
**Prompt:**
   - Compiler optimizes both types similarly
Create a complete Java class that demonstrates various for loop patterns:
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
}
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14
   - Enhanced for loop with doubles
--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16
5. Show progression from simple to complex for loop usage
=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
Enter age for ticket 2: 8
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
## 6. Real-World For Loop Application - Ticket Calculator
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
Enter age for ticket 1: 25
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---
2. Add Scanner import for user input
## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
```java
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
```java
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points

1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior

2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns

4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loops are generally as fast as traditional for loops
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
- **User Experience**: Processes multiple items seamlessly
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
2. **Enhanced For Loop (For-Each):**
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
   - Cleaner, more readable syntax
---
}
## Key Learning Points
4. **Data Type Compatibility:**
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Automatic type inference in the loop variable
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
---

## Key Learning Points

1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior

2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections

3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns

4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

   - Compiler optimizes both types similarly

   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
   - Basic counter-controlled for loop
1. Include package declaration: com.modernjava._4controlstatements._for
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16
**Prompt:**
=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
Create a complete Java class that demonstrates various for loop patterns:
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loop with doubles
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
5. Show progression from simple to complex for loop usage
---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Enter age for ticket 2: 8
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
**Answer:** Yes! For loops are perfect for processing multiple tickets. Here's how to create a TicketCalculatorV2 version that demonstrates practical for loop usage.
---
**Prompt:**
## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
```
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---
   - Accumulate total price using accumulator pattern
## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
```java
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
```java
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
```java
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
for (int i = 1; i <= numberOfTickets; i++) {
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
4. **Data Type Compatibility:**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - **Visual Display**: Use traditional for loop when you need position information
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
---
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
   - Enhanced for loops are generally as fast as traditional for loops
## Key Learning Points
- **User Experience**: Processes multiple items seamlessly
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
2. **Enhanced For Loop (For-Each):**
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
   - Cleaner, more readable syntax
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
   - Automatic type inference in the loop variable
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

   - Compiler optimizes both types similarly

   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
}
```java
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
```
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---

## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
```java
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
```java
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3
2. Add Scanner import for user input
--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
## 4. Complex For Loop Example - Seat Availability System
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
for (int i = 1; i <= numberOfTickets; i++) {
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
4. **Data Type Compatibility:**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - **Visual Display**: Use traditional for loop when you need position information
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
---
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
   - Enhanced for loops are generally as fast as traditional for loops
## Key Learning Points
- **User Experience**: Processes multiple items seamlessly
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
2. **Enhanced For Loop (For-Each):**
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
   - Cleaner, more readable syntax
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
   - Automatic type inference in the loop variable
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

   - Compiler optimizes both types similarly

   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
   - Basic counter-controlled for loop
1. Include package declaration: com.modernjava._4controlstatements._for
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16
**Prompt:**
=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
Create a complete Java class that demonstrates various for loop patterns:
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loop with doubles
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
5. Show progression from simple to complex for loop usage
---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Enter age for ticket 2: 8
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
**Answer:** Yes! For loops are perfect for processing multiple tickets. Here's how to create a TicketCalculatorV2 version that demonstrates practical for loop usage.
---
**Prompt:**
## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
```
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---

## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
```java
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
```java
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
```java
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
for (int i = 1; i <= numberOfTickets; i++) {
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
4. **Data Type Compatibility:**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - **Visual Display**: Use traditional for loop when you need position information
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
---
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
   - Enhanced for loops are generally as fast as traditional for loops
## Key Learning Points
- **User Experience**: Processes multiple items seamlessly
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
2. **Enhanced For Loop (For-Each):**
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
   - Cleaner, more readable syntax
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
   - Automatic type inference in the loop variable
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

   - Compiler optimizes both types similarly

   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
}
```java
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - Accumulate total price using accumulator pattern
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
Enter age for ticket 1: 25
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---

## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
```java
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
```java
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16
## 4. Complex For Loop Example - Seat Availability System
=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
for (int i = 1; i <= numberOfTickets; i++) {
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
4. **Data Type Compatibility:**
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - **Visual Display**: Use traditional for loop when you need position information
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
---
---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points

1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior

2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns

4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loops are generally as fast as traditional for loops
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
- **User Experience**: Processes multiple items seamlessly
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
2. **Enhanced For Loop (For-Each):**
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
   - Cleaner, more readable syntax
---
}
## Key Learning Points
4. **Data Type Compatibility:**
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Automatic type inference in the loop variable
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
---

## Key Learning Points

1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior

2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections

3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns

4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

   - Compiler optimizes both types similarly

   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
   - Basic counter-controlled for loop
1. Include package declaration: com.modernjava._4controlstatements._for
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16
**Prompt:**
=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
Create a complete Java class that demonstrates various for loop patterns:
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loop with doubles
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
5. Show progression from simple to complex for loop usage
---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Enter age for ticket 2: 8
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
**Answer:** Yes! For loops are perfect for processing multiple tickets. Here's how to create a TicketCalculatorV2 version that demonstrates practical for loop usage.
---
**Prompt:**
## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
```
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---

## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
```java
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
```java
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
```java
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
for (int i = 1; i <= numberOfTickets; i++) {
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
4. **Data Type Compatibility:**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - **Visual Display**: Use traditional for loop when you need position information
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
---
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
   - Enhanced for loops are generally as fast as traditional for loops
## Key Learning Points
- **User Experience**: Processes multiple items seamlessly
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
2. **Enhanced For Loop (For-Each):**
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
   - Cleaner, more readable syntax
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
   - Automatic type inference in the loop variable
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

   - Compiler optimizes both types similarly

   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
}
```java
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
Enter age for ticket 1: 25
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---

## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
```java
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
```java
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points

1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior

2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns

4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loops are generally as fast as traditional for loops
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
- **User Experience**: Processes multiple items seamlessly
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
2. **Enhanced For Loop (For-Each):**
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
   - Cleaner, more readable syntax
---
}
## Key Learning Points
4. **Data Type Compatibility:**
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Automatic type inference in the loop variable
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
---

## Key Learning Points

1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior

2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections

3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns

4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

   - Compiler optimizes both types similarly

   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
   - Basic counter-controlled for loop
1. Include package declaration: com.modernjava._4controlstatements._for
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16
**Prompt:**
=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
Create a complete Java class that demonstrates various for loop patterns:
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loop with doubles
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
5. Show progression from simple to complex for loop usage
---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Enter age for ticket 2: 8
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
**Answer:** Yes! For loops are perfect for processing multiple tickets. Here's how to create a TicketCalculatorV2 version that demonstrates practical for loop usage.
---
**Prompt:**
## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
Position :  1   2   3   4   5   6   7   8
1. Create a private static method called showSeatAvailability()
2. Create a char array representing seat status: {'A', 'X', 'A', 'A', 'X', 'A', 'X', 'A'}
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---
   - 'A' = available, 'X' = booked
## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
4. Use if-else statements inside the loop to categorize seats
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
   - Basic counter-controlled for loop
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
1. Include package declaration: com.modernjava._4controlstatements._for
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16
**Prompt:**
=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
Create a complete Java class that demonstrates various for loop patterns:
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loop with doubles
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
5. Show progression from simple to complex for loop usage
---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Enter age for ticket 2: 8
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
**Answer:** Yes! For loops are perfect for processing multiple tickets. Here's how to create a TicketCalculatorV2 version that demonstrates practical for loop usage.
---
**Prompt:**
## Key Learning Points
```java
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
for (int i = 1; i <= numberOfTickets; i++) {
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
4. **Data Type Compatibility:**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - **Visual Display**: Use traditional for loop when you need position information
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
---
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
   - Enhanced for loops are generally as fast as traditional for loops
## Key Learning Points
- **User Experience**: Processes multiple items seamlessly
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
2. **Enhanced For Loop (For-Each):**
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
   - Cleaner, more readable syntax
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
   - Automatic type inference in the loop variable
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

   - Compiler optimizes both types similarly

   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
}
```java
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
Enter age for ticket 1: 25
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---
2. Add Scanner import for user input
## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
```java
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
```java
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points

1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior

2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns

4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loops are generally as fast as traditional for loops
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
- **User Experience**: Processes multiple items seamlessly
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
2. **Enhanced For Loop (For-Each):**
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
   - Cleaner, more readable syntax
---
}
## Key Learning Points
4. **Data Type Compatibility:**
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Automatic type inference in the loop variable
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
---

## Key Learning Points

1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior

2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections

3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns

4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

   - Compiler optimizes both types similarly

   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
   - Basic counter-controlled for loop
1. Include package declaration: com.modernjava._4controlstatements._for
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16
**Prompt:**
=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
Create a complete Java class that demonstrates various for loop patterns:
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loop with doubles
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
5. Show progression from simple to complex for loop usage
---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Enter age for ticket 2: 8
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
**Answer:** Yes! For loops are perfect for processing multiple tickets. Here's how to create a TicketCalculatorV2 version that demonstrates practical for loop usage.
---
**Prompt:**
## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
```
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---
   - Accumulate total price using accumulator pattern
## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
```java
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
```java
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
```java
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
for (int i = 1; i <= numberOfTickets; i++) {
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
4. **Data Type Compatibility:**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - **Visual Display**: Use traditional for loop when you need position information
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
---
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
   - Enhanced for loops are generally as fast as traditional for loops
## Key Learning Points
- **User Experience**: Processes multiple items seamlessly
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
2. **Enhanced For Loop (For-Each):**
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
   - Cleaner, more readable syntax
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
   - Automatic type inference in the loop variable
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

   - Compiler optimizes both types similarly

   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
}
```java
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
```
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---

## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
```java
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
```java
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
## 4. Complex For Loop Example - Seat Availability System
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
for (int i = 1; i <= numberOfTickets; i++) {
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
4. **Data Type Compatibility:**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - **Visual Display**: Use traditional for loop when you need position information
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
---
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
   - Enhanced for loops are generally as fast as traditional for loops
## Key Learning Points
- **User Experience**: Processes multiple items seamlessly
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
2. **Enhanced For Loop (For-Each):**
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
   - Cleaner, more readable syntax
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
   - Automatic type inference in the loop variable
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

   - Compiler optimizes both types similarly

   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
   - Basic counter-controlled for loop
1. Include package declaration: com.modernjava._4controlstatements._for
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16
**Prompt:**
=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
Create a complete Java class that demonstrates various for loop patterns:
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loop with doubles
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
5. Show progression from simple to complex for loop usage
---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Enter age for ticket 2: 8
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
**Answer:** Yes! For loops are perfect for processing multiple tickets. Here's how to create a TicketCalculatorV2 version that demonstrates practical for loop usage.
---
**Prompt:**
## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
```
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---

## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
```java
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
```java
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
```java
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
for (int i = 1; i <= numberOfTickets; i++) {
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
4. **Data Type Compatibility:**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - **Visual Display**: Use traditional for loop when you need position information
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
---
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
   - Enhanced for loops are generally as fast as traditional for loops
## Key Learning Points
- **User Experience**: Processes multiple items seamlessly
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
2. **Enhanced For Loop (For-Each):**
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
   - Cleaner, more readable syntax
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
   - Automatic type inference in the loop variable
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

   - Compiler optimizes both types similarly

   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
}
```java
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
Enter age for ticket 1: 25
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---

## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
```java
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
```java
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points

1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior

2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns

4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loops are generally as fast as traditional for loops
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
- **User Experience**: Processes multiple items seamlessly
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
2. **Enhanced For Loop (For-Each):**
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
   - Cleaner, more readable syntax
---
}
## Key Learning Points
4. **Data Type Compatibility:**
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Automatic type inference in the loop variable
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
---

## Key Learning Points

1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior

2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections

3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns

4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

   - Compiler optimizes both types similarly

   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
   - Basic counter-controlled for loop
1. Include package declaration: com.modernjava._4controlstatements._for
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16
**Prompt:**
=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
Create a complete Java class that demonstrates various for loop patterns:
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
Seats    : [A] [X] [A] [A] [X] [A] [X] [A]
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - Enhanced for loop with doubles
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
5. Show progression from simple to complex for loop usage
---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Enter age for ticket 2: 8
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
**Answer:** Yes! For loops are perfect for processing multiple tickets. Here's how to create a TicketCalculatorV2 version that demonstrates practical for loop usage.
---
**Prompt:**
## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
```
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---

## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
```java
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
```java
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
```java
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
for (int i = 1; i <= numberOfTickets; i++) {
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
4. **Data Type Compatibility:**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
   - **Visual Display**: Use traditional for loop when you need position information
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
---
---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
2. **Enhanced For Loop (For-Each):**
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3
   - Enhanced for loops are generally as fast as traditional for loops
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
---
   - Enhanced for loops are generally as fast as traditional for loops
## Key Learning Points
- **User Experience**: Processes multiple items seamlessly
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
2. **Enhanced For Loop (For-Each):**
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
   - Cleaner, more readable syntax
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
   - Automatic type inference in the loop variable
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

   - Compiler optimizes both types similarly

   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
}
```java
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points
**Expected Output:**
```java
package com.modernjava._4controlstatements._for;
Enter age for ticket 2: 8
public class ForDemo {
    // All methods from above prompts
        showPrices();
    public static void main(String[] args) {
        basicForLoop();
        showSeats();
        showPrices();
        showSeatAvailability();
    }
}
```
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
---

## 6. Real-World For Loop Application - Ticket Calculator
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
**Question:** *Is there a way that I can use for loop in this example TicketCalculatorV1?*
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
**Prompt:**
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
Create a TicketCalculatorV2 that demonstrates for loops in a real-world ticket booking scenario:
   - Display order summary with totals and averages
1. Create a Java class called TicketCalculatorV2 in package com.modernjava._4controlstatements.ifelse
2. Add Scanner import for user input
3. Define SeatType enum with REGULAR, PREMIUM, RECLINER
4. In main method:
   - Ask "How many tickets do you want to calculate?"
   - Use a for loop to process each ticket individually: for (int i = 1; i <= numberOfTickets; i++)
   - For each ticket, collect: age, membership status, seat type
   - Calculate individual ticket price using existing methods
   - Accumulate total price using accumulator pattern
   - Display order summary with totals and averages
   - Display order summary with totals and averages
5. Include these additional for loop examples:
   - calculateBulkDiscount: Use step-based for loop (i += 5) for bulk discounts
   - demonstrateAgePricing: Use traditional for loop with array processing
   - demonstrateSeatPricing: Use enhanced for loop with enum.values()
5. Include these additional for loop examples:
6. Show different for loop patterns:
   - Counter-controlled: for (int i = 1; i <= count; i++)
   - Step-based: for (int i = 5; i <= count; i += 5)
   - Array processing: for (int i = 0; i < array.length; i++)
   - Enhanced: for (SeatType seat : SeatType.values())
   - demonstrateAgePricing: Use traditional for loop with array processing
5. Include these additional for loop examples:
**Expected Key Methods:**
```java
// Main processing loop
for (int i = 1; i <= numberOfTickets; i++) {
    System.out.println("\n--- Ticket #" + i + " ---");
    // Collect input and calculate price
    totalPrice += ticketPrice;
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Bulk discount with step-based loop
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
}
   - Step-based: for (int i = 5; i <= count; i += 5)
// Age analysis with traditional loop
int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    System.out.println("Age " + age + ": $" + basePrice);
}
// Main processing loop
// Seat analysis with enhanced loop
for (SeatType seat : SeatType.values()) {
    int surcharge = // calculate surcharge
    System.out.println(seat + " seat: +$" + surcharge);
}
```java
// Main processing loop
**Console Output Example:**
    System.out.println("\n--- Ticket #" + i + " ---");
How many tickets do you want to calculate? 3

--- Ticket #1 ---
Enter age for ticket 1: 25
Is ticket 1 for a member? true
Enter seat type for ticket 1: PREMIUM
Ticket #1 Price: $14

--- Ticket #2 ---
Enter age for ticket 2: 8
Is ticket 2 for a member? false
Enter seat type for ticket 2: REGULAR
Ticket #2 Price: $8
Enter seat type for ticket 2: REGULAR
--- Ticket #3 ---
Enter age for ticket 3: 65
Is ticket 3 for a member? true
Enter seat type for ticket 3: RECLINER
Ticket #3 Price: $16

=== ORDER SUMMARY ===
Total tickets: 3
Final Price: $38
Average price per ticket: $12
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
Is ticket 3 for a member? true
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points

1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior

2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 3: RECLINER
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns

4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Total tickets: 3
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
for (int i = 5; i <= numberOfTickets; i += 5) {
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
    discount += 2; // $2 discount for every group of 5 tickets
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes
}
---
```java
## Key Learning Points
Enter age for ticket 1: 25
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 2: 8
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter seat type for ticket 2: REGULAR
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 3: RECLINER
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing
Total tickets: 3
6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly

    discount += 2; // $2 discount for every group of 5 tickets
**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---
}
## Key Learning Points
```
1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior
Enter age for ticket 1: 25
2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections
Enter age for ticket 2: 8
3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns
Enter seat type for ticket 2: REGULAR
4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable
Enter seat type for ticket 3: RECLINER
5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
Total tickets: 3

**Learning Points:**
- **Practical Application**: For loops handle real-world bulk processing scenarios
- **Accumulator Pattern**: `totalPrice += ticketPrice` accumulates running totals
- **User Experience**: Processes multiple items seamlessly
- **Step-Based Loops**: `i += 5` for bulk discount calculations
- **Mixed Loop Types**: Traditional and enhanced loops serving different purposes

---

## Key Learning Points

1. **Traditional For Loop:**
   - Use when you need a counter or index: `for (int i = 0; i < length; i++)`
   - Three parts: initialization, condition, increment
   - Full control over loop behavior

2. **Enhanced For Loop (For-Each):**
   - Use when you only need to read values: `for (type item : collection)`
   - Cleaner, more readable syntax
   - No risk of index out of bounds errors
   - Works with arrays and collections

3. **When to Use Each:**
   - **Enhanced for loop**: When you need to process all elements and don't need indices
   - **Traditional for loop**: When you need indices, specific ranges, or complex iteration patterns

4. **Data Type Compatibility:**
   - Enhanced for loops work with any array type (int, double, char, String, etc.)
   - Same syntax regardless of data type
   - Automatic type inference in the loop variable

5. **Practical Applications:**
   - **Counting/Accumulation**: Use enhanced for loop with counters
   - **Visual Display**: Use traditional for loop when you need position information
   - **Data Processing**: Enhanced for loop for simple data transformation
   - **Complex Logic**: Traditional for loop for conditional processing

6. **Performance Considerations:**
   - Enhanced for loops are generally as fast as traditional for loops
   - Enhanced for loops prevent common mistakes like off-by-one errors
   - Compiler optimizes both types similarly
