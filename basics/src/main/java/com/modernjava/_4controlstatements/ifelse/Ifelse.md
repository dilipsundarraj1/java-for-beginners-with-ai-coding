# If-Else Statements - Control Flow Fundamentals

<!-- TOC -->
* [If-Else Statements - Control Flow Fundamentals](#if-else-statements---control-flow-fundamentals)
  * [High-Level Code Flow](#high-level-code-flow)
  * [Prompts for Replication](#prompts-for-replication)
    * [Prompt 1: Basic If-Else If-Else Chain](#prompt-1-basic-if-else-if-else-chain)
    * [Prompt 2: Simple If with Boolean Condition](#prompt-2-simple-if-with-boolean-condition)
    * [Prompt 3: If with String Comparison](#prompt-3-if-with-string-comparison)
    * [Prompt 4: Validation If Statement](#prompt-4-validation-if-statement)
    * [Prompt 5: Complete TicketCalculator Integration](#prompt-5-complete-ticketcalculator-integration)
<!-- /TOC -->

## High-Level Code Flow

### Real-World Scenario: Movie Theater Ticket Pricing System

Imagine you're building a pricing system for a movie theater. The ticket price depends on:
1. **Customer's age** (determines base price)
2. **Membership status** (may qualify for discount)
3. **Seat type** (premium seats cost more)
4. **Price validation** (ensuring no negative prices)

### Visual Code Flow

```
START: Create Customer Variables
│
├─ age = 34 (integer)
├─ isMember = true (boolean)
└─ seatType = "PREMIUM" (string)
│
├─────────────────────────────────────────────────────────────
│  STEP 1: Calculate Base Price by Age (if/else if/else chain)
│  ─────────────────────────────────────────────────────────
│  age = 34
│  ├─ if (age < 3) → price = 0 (toddler) ❌ No
│  ├─ else if (age < 12) → price = 8 (child) ❌ No
│  ├─ else if (age < 60) → price = 12 (adult) ✅ YES
│  └─ else → price = 9 (senior)
│  
│  Result: price = 12
│
├───────────────────────────────────────────────────────────���─
│  STEP 2: Apply Member Discount (simple if with boolean)
��  ────────────────────────────────────────────────────────
│  isMember = true, price = 12
│  ├─ if (isMember && price > 0) ✅ YES (both conditions true)
│  │  └─ price = price - 1 → price = 11
│  └─ else (not executed)
│  
│  Result: price = 11
│
├─────────────────────────────────────────────────────────────
│  STEP 3: Apply Seat Surcharge (if with string comparison)
│  ────────────────────────────────────────────────────────
│  seatType = "PREMIUM", price = 11
│  ├─ if ("PREMIUM".equalsIgnoreCase(seatType)) ✅ YES
│  │  └─ price = price + 3 → price = 14
│  └─ else (not executed)
│  
│  Result: price = 14
│
├───────────────────────────────────────────────────────────���─
│  STEP 4: Validate Minimum Price (defensive programming)
│  ──────────────────────────────────────────────────────────
│  price = 14
│  ├─ if (price < 0) ❌ No
│  │  └─ price = 0 (not executed)
│  └─ else (implicitly true, price stays as is)
│  
│  Result: price = 14
│
└─────────────────────────────────────────────────────────────
OUTPUT: "Final Ticket Price: $14"
END
```

## Prompts for Replication

### Prompt 1: Basic If-Else If-Else Chain
**Concept**: Mutually Exclusive Conditions with Multiple Branches

**Task**: Create a function that calculates ticket base price based on customer age using an if/else if/else chain.

**Context**: Different age groups qualify for different ticket prices at a movie theater:
- Toddlers (under 3): Free
- Children (3-11): $8
- Adults (12-59): $12
- Seniors (60+): $9

**Function Signature**:
```java
public static int calculateBasePriceByAge(int age)
```

**Requirements**:
1. Accept an integer parameter `age`
2. Declare an integer variable `price` to store the calculated price
3. Use if/else if/else chain with these conditions:
   - `if (age < 3)` → set `price = 0`
   - `else if (age < 12)` → set `price = 8`
   - `else if (age < 60)` → set `price = 12`
   - `else` → set `price = 9`
4. Return the calculated price
5. Add JavaDoc comment explaining:
   - What the function does
   - Parameter description (age range implications)
   - Return value description
   - The if/else if/else chain pattern used

**Why This Matters**:
- ✅ Demonstrates how if/else if/else works with **multiple mutually exclusive conditions**
- ✅ Shows that only **ONE branch** executes in a chain
- ✅ Each condition is checked **only if previous conditions were false**
- ✅ Real-world application: age-based pricing tiers

**Test Cases to Consider**:
- `calculateBasePriceByAge(2)` → 0 (toddler)
- `calculateBasePriceByAge(10)` → 8 (child)
- `calculateBasePriceByAge(34)` → 12 (adult)
- `calculateBasePriceByAge(65)` → 9 (senior)

---

### Prompt 2: Simple If with Boolean Condition
**Concept**: Boolean Operators and Compound Conditions

**Task**: Create a function that applies a member discount to the ticket price using a simple if statement with a compound boolean condition.

**Context**: The movie theater offers a $1 discount to members, but only if they're actually buying a ticket (price > 0). We want to ensure:
- Customer is a member (boolean flag)
- AND the ticket costs something (price > 0)

**Function Signature**:
```java
public static int applyMemberDiscount(int currentPrice, boolean isMember)
```

**Requirements**:
1. Accept an integer parameter `currentPrice` and a boolean parameter `isMember`
2. Use a **simple if statement** (not if/else) with a **compound condition**:
   - Condition: `if (isMember && currentPrice > 0)`
   - Action: subtract 1 from `currentPrice` using `currentPrice -= 1`
3. Return the modified price
4. Add JavaDoc comment explaining:
   - What the function does
   - The compound boolean condition (both must be true)
   - Why both conditions are necessary
   - Parameter descriptions

**Why This Matters**:
- ✅ Shows how to use **boolean variables** in conditions
- ✅ Demonstrates **compound conditions** with the AND operator (`&&`)
- ✅ Shows **short-circuit evaluation**: if `isMember` is false, `currentPrice > 0` is never checked
- ✅ Practical example: applying conditional business logic

**Test Cases to Consider**:
- `applyMemberDiscount(12, true)` → 11 (member gets discount)
- `applyMemberDiscount(12, false)` → 12 (non-member, no discount)
- `applyMemberDiscount(0, true)` → 0 (free ticket, no discount applied)
- `applyMemberDiscount(0, false)` → 0 (free ticket, non-member)

---

### Prompt 3: If with String Comparison
**Concept**: String Comparison in Conditional Statements

**Task**: Create a function that applies a surcharge to the ticket price based on the seat type using string comparison.

**Context**: Different seat types have different surcharges:
- Regular seats: No surcharge ($0)
- Premium seats: $3 surcharge
- Recliner seats: $5 surcharge

We need to compare the `seatType` string case-insensitively because users might input "premium", "PREMIUM", or "Premium".

**Function Signature**:
```java
public static int applySeatSurcharge(int currentPrice, String seatType)
```

**Requirements**:
1. Accept an integer parameter `currentPrice` and a String parameter `seatType`
2. Use if/else if/else chain to check seat type:
   - `if ("PREMIUM".equalsIgnoreCase(seatType))` → add 3 to price
   - `else if ("RECLINER".equalsIgnoreCase(seatType))` → add 5 to price
   - `else` → add 0 (or just return currentPrice)
3. Return the modified price
4. Add JavaDoc comment explaining:
   - What the function does
   - Why `.equalsIgnoreCase()` is used (case-insensitive comparison)
   - Why we use `.equalsIgnoreCase()` instead of `==`
   - Parameter descriptions

**Why This Matters**:
- ✅ Shows **CORRECT way** to compare strings (never use `==` for strings!)
- ✅ Demonstrates `.equalsIgnoreCase()` for user-friendly input handling
- ✅ Real-world pattern: handling user input variations
- ✅ Shows different surcharge tiers based on seat quality

**Common Mistakes**:
- ❌ **DON'T** use `if (seatType == "PREMIUM")` ← Compares memory addresses, not content
- ✅ **DO** use `if ("PREMIUM".equalsIgnoreCase(seatType))` ← Compares string content

**Test Cases to Consider**:
- `applySeatSurcharge(12, "PREMIUM")` → 15
- `applySeatSurcharge(12, "premium")` → 15 (case-insensitive)
- `applySeatSurcharge(12, "Premium")` → 15 (case-insensitive)
- `applySeatSurcharge(12, "RECLINER")` → 17
- `applySeatSurcharge(12, "REGULAR")` → 12

---

### Prompt 4: Validation If Statement
**Concept**: Defensive Programming and Guard Clauses

**Task**: Create a function that validates and ensures the ticket price never goes below zero using a simple if statement (guard clause pattern).

**Context**: After applying discounts, the price might theoretically go negative (if we had high discounts). We want to ensure:
- Price never becomes negative
- Set price to 0 if it would go below zero
- This is called a "guard clause" or "validation check"

**Function Signature**:
```java
public static int ensureMinimumPrice(int price)
```

**Requirements**:
1. Accept an integer parameter `price`
2. Use a simple if statement (no else needed):
   - `if (price < 0)` → set `price = 0`
3. Return the validated price
4. Add JavaDoc comment explaining:
   - What the function does
   - The guard clause pattern
   - Why this validation is important (defensive programming)
   - Return value description

**Why This Matters**:
- ✅ Shows **guard clause pattern**: early validation and correction
- ✅ Demonstrates **defensive programming**: protecting against invalid data
- ✅ Shows that not all if statements need else branches
- ✅ Real-world practice: input validation and data integrity

**Guard Clause Pattern**:
```
if (condition indicates error or invalid state) {
    take corrective action
    return
}
// continue with valid data
```

**Test Cases to Consider**:
- `ensureMinimumPrice(14)` → 14 (valid price, unchanged)
- `ensureMinimumPrice(0)` → 0 (zero is valid minimum)
- `ensureMinimumPrice(-5)` → 0 (negative corrected to 0)

---

### Prompt 5: Complete TicketCalculator Integration
**Concept**: Combining Multiple If Patterns in a Real Application

**Task**: Create the complete `TicketCalculator` class that uses all four if-related concepts in a working application.

**Application Overview**:
The `TicketCalculator` class orchestrates the ticket pricing logic by:
1. Storing customer information (age, membership, seat type)
2. Calling functions in sequence to calculate final price
3. Displaying the result

**Function Signatures**:
```java
public static void main(String[] args)
public static int calculateBasePriceByAge(int age)
public static int applyMemberDiscount(int currentPrice, boolean isMember)
public static int applySeatSurcharge(int currentPrice, String seatType)
public static int ensureMinimumPrice(int price)
```

**Requirements**:
1. **Main Method**:
   - Declare variable: `int age = 34`
   - Declare variable: `boolean isMember = true`
   - Declare variable: `String seatType = "PREMIUM"`
   - Call `calculateBasePriceByAge(age)` and store result in `price`
   - Call `applyMemberDiscount(price, isMember)` and update `price`
   - Call `applySeatSurcharge(price, seatType)` and update `price`
   - Call `ensureMinimumPrice(price)` and update `price`
   - Print: `"Final Ticket Price: $" + price`

2. **All Four Functions**:
   - Implement each function from Prompts 1-4 above
   - Add comprehensive JavaDoc comments
   - Each function should have clear, single responsibility

3. **Code Quality**:
   - Use meaningful variable names
   - Add comments explaining the logic flow
   - Follow Java naming conventions (camelCase for methods/variables)
   - Use proper indentation

**Execution Flow**:
```
Customer Input:
  age = 34
  isMember = true
  seatType = "PREMIUM"

Processing:
  1. calculateBasePriceByAge(34) → 12
  2. applyMemberDiscount(12, true) → 11
  3. applySeatSurcharge(11, "PREMIUM") → 14
  4. ensureMinimumPrice(14) → 14

Output:
  Final Ticket Price: $14
```

**Why This Pattern Matters**:
- ✅ Shows how small, focused functions work together
- ✅ Demonstrates composition of if-related logic
- ✅ Introduces step-by-step transformation of data
- ✅ Real-world software design pattern: single responsibility principle

