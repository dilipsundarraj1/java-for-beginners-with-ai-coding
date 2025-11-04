# TicketCalculatorV2 - Code Flow Documentation

<!-- TOC -->
* [TicketCalculatorV2 - Code Flow Documentation](#ticketcalculatorv2---code-flow-documentation)
  * [Overview](#overview)
  * [Program Flow Architecture](#program-flow-architecture)
  * [Main Method Execution Flow](#main-method-execution-flow)
  * [Visual Code Flow - Single Ticket Example](#visual-code-flow---single-ticket-example)
  * [Step-by-Step Execution](#step-by-step-execution)
    * [Step 1: Calculate Base Price by Age (if/else if/else chain)](#step-1-calculate-base-price-by-age-ifelse-ifelse-chain)
    * [Step 2: Apply Member Discount (simple if with boolean)](#step-2-apply-member-discount-simple-if-with-boolean)
    * [Step 3: Apply Seat Surcharge (switch expression with enum)](#step-3-apply-seat-surcharge-switch-expression-with-enum)
    * [Step 4: Validate Minimum Price (defensive programming)](#step-4-validate-minimum-price-defensive-programming)
  * [For Loop Examples in the Code](#for-loop-examples-in-the-code)
  * [Complete Execution Trace](#complete-execution-trace)
  * [Key Concepts Demonstrated](#key-concepts-demonstrated)
<!-- /TOC -->

## Overview

TicketCalculatorV2 is a sophisticated ticket pricing system that demonstrates:

- **Multiple Control Flow Patterns**: if/else chains, switch expressions, and for loops
- **Real-World Business Logic**: Age-based pricing, member discounts, seat surcharges, bulk discounts
- **Enum Usage**: Type-safe seat category selection
- **Loop Applications**: Processing multiple tickets, array iteration, validation
- **Data Transformation Pipeline**: Input data flows through multiple processing stages

The application calculates ticket prices for multiple customers, applies various discounts, and provides detailed pricing analysis.

## Program Flow Architecture

```
┌─────────────────────────────────────────────────────────────┐
│                     MAIN METHOD START                       │
├─────────────────────────────────────────────────────────────┤
│                                                              │
│  1. Get number of tickets from user                         │
│  2. FOR LOOP: Process each ticket (for i=1 to n)           │
│     ├─ Get age, membership, seat type                       │
│     └─ Calculate price through pipeline                     │
│  3. Calculate bulk discount                                 │
│  4. Display order summary                                   │
│  5. Demonstrate analysis functions                          │
│                                                              │
└─────────────────────────────────────────────────────────────┘
           ↓
┌─────────────────────────────────────────────────────────────┐
│           PRICING CALCULATION PIPELINE                      │
├─────────────────────────────────────────────────────────────┤
│                                                              │
│  calculateBasePriceByAge(age)                               │
│         ↓                                                    │
│  applyMemberDiscount(price, isMember)                       │
│         ↓                                                    │
│  applySeatSurcharge(price, seatType)                        │
│         ↓                                                    │
│  ensureMinimumPrice(price)                                  │
│         ↓                                                    │
│  FINAL TICKET PRICE                                         │
│                                                              │
└─────────────────────────────���───────────────────────────────┘
```

## Main Method Execution Flow

```
START: TicketCalculatorV2 main()
│
├─ INPUT: "How many tickets do you want to calculate?"
│  └─ numberOfTickets = user input (e.g., 3)
│
├─ totalPrice = 0
│
├─────────────────────────────────────────────────────────────
│  FOR LOOP: for (int i = 1; i <= numberOfTickets; i++)
│  ────────────────────────────────────────────────────────
│  
│  Iteration 1 (i=1):
│  ├─ INPUT: age, isMember, seatType for ticket #1
│  ├─ CALCULATE: ticketPrice through pipeline
│  ├─ OUTPUT: Ticket #1 Price: $X
│  └─ totalPrice += ticketPrice
│  
│  Iteration 2 (i=2):
│  ├─ INPUT: age, isMember, seatType for ticket #2
│  ├─ CALCULATE: ticketPrice through pipeline
│  ├─ OUTPUT: Ticket #2 Price: $X
│  └─ totalPrice += ticketPrice
│  
│  ... (repeat for remaining tickets)
│
├─────────────────────────────���─────────────────────────────���─
│  BULK DISCOUNT: calculateBulkDiscount(totalPrice, n)
│  
│  FOR LOOP with STEP: for (int i = 5; i <= numberOfTickets; i += 5)
│  └─ Apply $2 discount for every 5 tickets
│  └─ finalPrice = totalPrice - totalDiscount
│
├─────────────────────────────────────────────────────────────
│  DISPLAY: Order Summary
│  ├─ Total tickets
│  ├─ Subtotal
│  ├─ Final Price (after bulk discount)
│  └─ Average price per ticket
│
├─────────────────────────────────────────────────────────────
│  ANALYSIS DEMONSTRATIONS:
│  ├─ demonstrateAgePricing() - Show price by age categories
│  └─ demonstrateSeatPricing() - Show surcharge by seat type
│
└─ END: Close scanner
```

## Visual Code Flow - Single Ticket Example

```
INPUT: age = 28, isMember = true, seatType = PREMIUM

├─────────────────────────────────────────────────────────────
│  STEP 1: calculateBasePriceByAge(28)
│  ─────────────────────────────────────────────────────────
│  
│  Function Logic (if/else if/else chain):
│  ├─ if (age < 3) ❌ No (28 is not < 3)
│  ├─ else if (age < 12) ❌ No (28 is not < 12)
│  ├─ else if (age < 60) ✅ YES (28 IS < 60) ← EXECUTES
│  │  └─ price = 12 (Adult price)
│  └─ else → (not reached)
│  
│  Input:  age = 28
│  Output: price = 12
│  ┌──────────────┐
│  │ RESULT: $12  │
│  └──────────────┘
│
├─────────────────────────────���───────────────────────────────
│  STEP 2: applyMemberDiscount(12, true)
│  ─────────────────────────────────────────────────────────
│  
│  Function Logic (if with compound boolean):
│  ├─ if (isMember && currentPrice > 0)
│  │  ├─ isMember = true ✅ YES
│  │  ├─ currentPrice > 0 = (12 > 0) ✅ YES
│  │  └─ Both conditions true (AND) → EXECUTE block
│  │     └─ currentPrice = 12 - 1 = 11
│  └─ else → (not executed)
│  
│  Input:  currentPrice = 12, isMember = true
│  Output: currentPrice = 11
│  ┌──────────────┐
│  │ RESULT: $11  │
│  └──────────────┘
│
├─────────────────────────────────────────────────────────────
│  STEP 3: applySeatSurcharge(11, PREMIUM)
│  ─────────────────────────────────────────────────────────
│  
│  Function Logic (switch expression with enum):
│  ├─ switch (seatType)
│  │  ├─ case REGULAR -> 0 ❌
│  │  ├─ case PREMIUM -> 3 ✅ EXECUTES ← seatType IS PREMIUM
│  │  └─ case RECLINER -> 5 ❌
│  │  
│  │  surcharge = 3
│  │  currentPrice = 11 + 3 = 14
│  
│  Input:  currentPrice = 11, seatType = PREMIUM
│  Output: currentPrice = 14
│  ┌──────────────┐
│  │ RESULT: $14  │
│  └──────────────┘
│
├─────────────────────────────────────────────────────────────
│  STEP 4: ensureMinimumPrice(14)
│  ──────────────────────────────���───────────────────────────
│  
│  Function Logic (validation guard clause):
│  ├─ if (price < 0) ❌ No (14 is not < 0)
│  │  └─ price = 0 (not executed)
│  └─ return price (unchanged)
│  
│  Input:  price = 14
│  Output: price = 14 (validation passed)
│  ┌──────────────┐
│  │ RESULT: $14  │
│  └──────────────┘
│
└─────────────────────────────────────────────────────────────
  
  FINAL OUTPUT FOR THIS TICKET:
  ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
  ┃ Ticket #1 Price: $14       ┃
  ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
```

## Step-by-Step Execution

### Step 1: Calculate Base Price by Age (if/else if/else chain)

**Function**: `calculateBasePriceByAge(int age)`

**Purpose**: Determine base ticket price based on customer age category

**Input**: `age = 28`

**Control Flow**:
```
age = 28

Is age < 3?           ❌ No  (28 is not less than 3)
  → Skip this block (Toddler free tier)

Is age < 12?          ❌ No  (28 is not less than 12)
  → Skip this block (Child: $8)

Is age < 60?          ✅ YES (28 IS less than 60)
  → EXECUTE THIS BLOCK
  → price = 12 (Adult price)
  → Stop checking (don't evaluate else)

else:                 (not reached)
  → price = 9 (Senior price - not executed)

Return: 12
```

**Age Categories**:
- < 3 years: $0 (Toddler - free)
- 3-11 years: $8 (Child)
- 12-59 years: $12 (Adult)
- 60+ years: $9 (Senior)

**Key Concept**: In an if/else if/else chain, **only ONE branch executes**. Once a condition is true, the JVM stops evaluating and exits the chain. This is efficient and prevents multiple branches from executing.

**Output**: `$12`

---

### Step 2: Apply Member Discount (simple if with boolean)

**Function**: `applyMemberDiscount(int currentPrice, boolean isMember)`

**Purpose**: Apply $1 discount if customer is a member

**Input**: `currentPrice = 12, isMember = true`

**Control Flow**:
```
isMember = true
currentPrice = 12

Condition: if (isMember && currentPrice > 0)
  ├─ First part: isMember = true ✅
  ├─ Second part: currentPrice > 0 = (12 > 0) ✅
  └─ Both parts true (AND operator) → EXECUTE
     └─ currentPrice = currentPrice - 1
     └─ currentPrice = 12 - 1 = 11

Return: 11
```

**Key Concepts**:
- **Boolean parameter**: `isMember` is a true/false flag
- **Compound condition**: Uses `&&` (AND operator) - BOTH conditions must be true
- **Short-circuit evaluation**: Prevents unnecessary evaluation of complex expressions
- **Guard logic**: `currentPrice > 0` prevents discount on free tickets

**Output**: `$11`

---

### Step 3: Apply Seat Surcharge (switch expression with enum)

**Function**: `applySeatSurcharge(int currentPrice, SeatType seatType)`

**Purpose**: Add surcharge based on seat category using modern switch expression

**Input**: `currentPrice = 11, seatType = PREMIUM`

**Control Flow**:
```
seatType = PREMIUM (enum value)
currentPrice = 11

Switch Expression:
  switch (seatType) {
    case REGULAR   -> 0      ❌ Not this
    case PREMIUM   -> 3      ✅ MATCH! Execute this branch
    case RECLINER  -> 5      ❌ Not this
  }

  surcharge = 3
  currentPrice = 11 + 3 = 14

Return: 14
```

**Seat Type Surcharges**:
- REGULAR: $0 (no surcharge)
- PREMIUM: $3 (elevated comfort)
- RECLINER: $5 (luxury seating)

**Key Concepts**:
- **Enum type**: `SeatType` is a type-safe enumeration (REGULAR, PREMIUM, RECLINER only)
- **Switch expression**: Modern Java syntax that returns a value (not traditional switch statement)
- **Type safety**: Compiler ensures only valid seat types are used
- **Single evaluation**: Only ONE branch executes based on the exact match
- **Advantage over string comparison**: No case-sensitivity issues, compile-time safety

**Output**: `$14`

---

### Step 4: Validate Minimum Price (defensive programming)

**Function**: `ensureMinimumPrice(int price)`

**Purpose**: Ensure price never goes negative (validation guard clause)

**Input**: `price = 14`

**Control Flow**:
```
price = 14

Guard Clause: if (price < 0)
  ├─ Is 14 < 0? ❌ NO
  └─ Skip the block (no correction needed)

Return: 14 (unchanged - validation passed)
```

**Key Concept**: This is a **guard clause** - a defensive programming pattern that:
- ✅ Validates data integrity
- ✅ Corrects invalid states before returning
- ✅ Prevents bad data from propagating
- ✅ Acts as a safety net for edge cases

**Output**: `$14`

---

## For Loop Examples in the Code

The TicketCalculatorV2 application demonstrates **5 different for loop patterns**:

### FOR LOOP EXAMPLE 1: Traditional For Loop Processing Multiple Tickets
**Location**: `main()` method
```java
for (int i = 1; i <= numberOfTickets; i++) {
    // Process each ticket
    // Get input, calculate price, accumulate total
}
```
**Pattern**: Process multiple items sequentially
**Use case**: Iterating a known number of times
**Result**: `totalPrice` accumulates with each iteration

---

### FOR LOOP EXAMPLE 2: Step-Based For Loop with Bulk Discount
**Location**: `calculateBulkDiscount()` method
```java
for (int i = 5; i <= numberOfTickets; i += 5) {
    discount += 2; // $2 for every 5 tickets
}
```
**Pattern**: Skip iterations (i += 5 means increment by 5, not 1)
**Use case**: Process groups or ranges (every 5th ticket)
**Result**: Progressive bulk discount calculation

---

### FOR LOOP EXAMPLE 3: Traditional For Loop with Array and Index
**Location**: `demonstrateAgePricing()` method
```java
for (int i = 0; i < sampleAges.length; i++) {
    int age = sampleAges[i];
    int basePrice = calculateBasePriceByAge(age);
    // Analyze and display
}
```
**Pattern**: Access array elements by index
**Use case**: Need index information (position, length calculations)
**Result**: Display price for each age category

---

### FOR LOOP EXAMPLE 4: Enhanced For Loop (For-Each) with Enum
**Location**: `demonstrateSeatPricing()` method
```java
for (SeatType seat : allSeatTypes) {
    int surcharge = switch(seat) { ... };
    // Display analysis
}
```
**Pattern**: Enhanced for loop - simple iteration
**Use case**: Read-only iteration when you don't need the index
**Result**: Iterate through all enum values naturally

---

### FOR LOOP EXAMPLE 5: Nested For Loops for Validation
**Location**: `getSeatTypeWithValidation()` method
```java
// FOR LOOP 1: Display valid options
for (int i = 0; i < validTypes.length; i++) {
    System.out.print(validTypes[i]);
}

// FOR LOOP 2: Validate user input
for (SeatType type : validTypes) {
    if (type.name().equals(input)) {
        return type;
    }
}
```
**Pattern**: Multiple loops working together
**Use case**: Display options and validate against them
**Result**: User input validation with helpful feedback

---

## Complete Execution Trace

### Example Scenario: 2 Tickets, Bulk Discount Applied

**Customer Input**:
```
Ticket #1:
  age = 28
  isMember = true
  seatType = PREMIUM

Ticket #2:
  age = 65
  isMember = false
  seatType = REGULAR
```

**Execution Trace**:

```
TICKET #1 CALCULATION:
│
├─ calculateBasePriceByAge(28) → 12 (Adult)
├─ applyMemberDiscount(12, true) → 11 (Member discount)
├─ applySeatSurcharge(11, PREMIUM) → 14 (Premium surcharge)
├─ ensureMinimumPrice(14) → 14 (Validation passed)
├─ Ticket #1 Price: $14
└─ totalPrice = 0 + 14 = 14

TICKET #2 CALCULATION:
│
├─ calculateBasePriceByAge(65) → 9 (Senior)
├─ applyMemberDiscount(9, false) → 9 (No discount - not a member)
├─ applySeatSurcharge(9, REGULAR) → 9 (Regular seat, no surcharge)
├─ ensureMinimumPrice(9) → 9 (Validation passed)
├─ Ticket #2 Price: $9
└─ totalPrice = 14 + 9 = 23

BULK DISCOUNT CALCULATION:
│
├─ numberOfTickets = 2
├─ FOR LOOP: for (i = 5; i <= 2; i += 5)
│  └─ Condition i <= 2 is false (5 is not <= 2)
│  └─ Loop doesn't execute (no bulk discount for 2 tickets)
├─ discount = 0
└─ finalPrice = 23 - 0 = 23

ORDER SUMMARY:
├─ Total tickets: 2
├─ Subtotal: $23
├─ Final Price: $23
└─ Average per ticket: $11.50
```

---

## Key Concepts Demonstrated

### 1. If/Else If/Else Chain (Age-Based Pricing)
- **When to use**: Multiple mutually exclusive conditions
- **Behavior**: Only ONE branch executes; subsequent conditions not evaluated
- **Example**: Age < 3, < 12, < 60, else (60+)
- **Benefit**: Efficient categorization of continuous data ranges
- **Common mistake**: Using multiple separate if statements instead of else if

### 2. Simple If with Compound Boolean Condition
- **When to use**: Optional logic based on multiple conditions
- **Operator**: `&&` (AND) requires both conditions true; `||` (OR) requires one true
- **Pattern**: Useful for optional features (member status, validation checks)
- **Short-circuit evaluation**: Prevents unnecessary evaluation of complex expressions
- **Example**: `if (isMember && currentPrice > 0)` - ensures member check runs first

### 3. Switch Expression with Enum
- **When to use**: Single variable has multiple distinct types/values
- **Type safety**: Enum restricts values to REGULAR, PREMIUM, RECLINER only
- **Advantage**: Compile-time checking vs runtime string comparisons
- **Modern syntax**: Returns a value directly (not traditional switch statement)
- **Exhaustiveness**: Compiler ensures all cases are handled

### 4. Guard Clause (Validation If)
- **Purpose**: Ensure data integrity and prevent invalid states
- **Pattern**: Simple if statement checking for invalid conditions
- **Benefit**: Catches edge cases and prevents bad data propagation
- **Example**: `if (price < 0) price = 0;` - prevents negative prices

### 5. For Loop - Traditional (Index-Based)
- **When to use**: When you need the index or know exact iteration count
- **Components**: Initialization, condition, increment
- **Pattern**: `for (int i = 0; i < limit; i++)` 
- **Advantage**: Can access array by index, supports counting, skip patterns
- **Example**: `for (int i = 1; i <= numberOfTickets; i++)`

### 6. For Loop - Enhanced (For-Each)
- **When to use**: Simple iteration without needing index
- **Syntax**: `for (Type item : collection)`
- **Advantage**: Cleaner code, no index out of bounds errors
- **Limitation**: Cannot get index position
- **Example**: `for (SeatType seat : allSeatTypes)`

### 7. For Loop - Step Pattern
- **When to use**: Process every nth item or in groups
- **Syntax**: `for (int i = start; i <= end; i += step)`
- **Example**: `for (int i = 5; i <= numberOfTickets; i += 5)` - every 5 tickets
- **Use case**: Bulk discount application, periodic processing

### 8. Function Composition & Data Pipeline
- **Concept**: Small focused functions transform data sequentially
- **Pattern**: Each function takes input, processes, returns output for next function
- **Benefit**: Easy to understand, test, and modify individual stages
- **Analogy**: Assembly line where each station adds value
- **Example**: price → applyDiscount → applySurcharge → validate

---

## Summary

TicketCalculatorV2 demonstrates a complete real-world system combining:

✅ **If/Else chains** for age-based categorization
✅ **Boolean logic** for conditional discounts
✅ **Switch expressions** with enums for type-safe seat selection
✅ **Guard clauses** for data validation
✅ **Multiple for loop patterns** for processing and analysis
✅ **Function composition** for clean data transformation
✅ **Modern Java features** (enums, switch expressions)

The result is a maintainable, scalable pricing engine that:
- Calculates accurate ticket prices
- Applies multiple discount types
- Validates data integrity
- Provides business analysis
- Demonstrates multiple programming patterns

This architecture is foundational to real-world systems: e-commerce pricing, subscription management, booking systems, and financial calculations all follow similar patterns.
