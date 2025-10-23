# BooleanExamples.java - Understanding Boolean Primitive Data Type

<!-- TOC -->
* [BooleanExamples.java - Understanding Boolean Primitive Data Type](#booleanexamplesjava---understanding-boolean-primitive-data-type)
  * [Overview](#overview)
  * [Prompts for Replication](#prompts-for-replication)
    * [Prompt 1: Basic Boolean Values and Characteristics](#prompt-1-basic-boolean-values-and-characteristics)
    * [Prompt 2: AND Operator (&&)](#prompt-2-and-operator-)
    * [Prompt 3: OR Operator (||)](#prompt-3-or-operator-)
    * [Prompt 4: NOT Operator (!)](#prompt-4-not-operator-)
    * [Prompt 5: Complex Boolean Expressions](#prompt-5-complex-boolean-expressions)
    * [Prompt 6: Short-Circuit Evaluation](#prompt-6-short-circuit-evaluation)
    * [Prompt 7: Boolean with Comparison Operations](#prompt-7-boolean-with-comparison-operations)
  * [Key Concepts Covered](#key-concepts-covered)
    * [1. Boolean Primitive Type](#1-boolean-primitive-type)
    * [2. Logical Operators](#2-logical-operators)
    * [3. Comparison Operations](#3-comparison-operations)
    * [4. Short-Circuit Evaluation](#4-short-circuit-evaluation)
    * [5. Boolean Naming Conventions](#5-boolean-naming-conventions)
  * [Memory Behavior](#memory-behavior)
  * [Common Mistakes to Avoid](#common-mistakes-to-avoid)
    * [1. Using == true or == false](#1-using--true-or--false)
    * [2. Confusing assignment (=) with comparison (==)](#2-confusing-assignment--with-comparison-)
    * [3. Not understanding short-circuit evaluation](#3-not-understanding-short-circuit-evaluation)
    * [4. Complex conditions without parentheses](#4-complex-conditions-without-parentheses)
    * [5. Poor boolean variable naming](#5-poor-boolean-variable-naming)
  * [Running the Code](#running-the-code)
  * [Expected Output](#expected-output)
  * [Next Steps](#next-steps)
  * [Summary](#summary)
<!-- TOC -->

## Overview
This file demonstrates the boolean primitive data type in Java. It covers basic boolean values, logical operators (AND, OR, NOT), comparison operations, short-circuit evaluation, and best practices for working with boolean values in Java programs.

## Prompts for Replication

### Prompt 1: Basic Boolean Values and Characteristics
**Task**: Create a section that demonstrates the boolean data type with basic declarations and characteristics.

**Expected Code Structure**: Variable declarations and print statements in main method

**Requirements**:
- Print section header: "1. BASIC BOOLEAN VALUES"
- Print section divider: "========================"
- Create boolean variable `isJavaFun` with value true
- Create boolean variable `isRaining` with value false
- Create boolean variable `hasPermission` with value true
- Create boolean variable `isComplete` with value false
- Print label: "📝 Basic Boolean Declarations:"
- Print each variable with descriptive labels:
    - "isJavaFun: " + isJavaFun
    - "isRaining: " + isRaining
    - "hasPermission: " + hasPermission
    - "isComplete: " + isComplete
- Add empty line after section

**Exact Code to Implement**:
```java
System.out.println("1. BASIC BOOLEAN VALUES");
System.out.println("========================");

// Basic boolean declarations - only two possible values
boolean isJavaFun = true;
boolean isRaining = false;
boolean hasPermission = true;
boolean isComplete = false;

System.out.println("📝 Basic Boolean Declarations:");
System.out.println("isJavaFun: " + isJavaFun);
System.out.println("isRaining: " + isRaining);
System.out.println("hasPermission: " + hasPermission);
System.out.println("isComplete: " + isComplete);
```

**Key Points**:
- Boolean is the simplest primitive type with only two values: `true` or `false`
- Size: 1 bit logically, but typically 1 byte (8 bits) in memory implementation
- No numeric representation (unlike C where 0 is false and non-zero is true)
- Default value: `false` for instance variables
- **Best naming convention**: Start with `is`, `has`, `can`, `should`, `needs`, `must`
- Use descriptive names that read like questions (isJavaFun answers "Is Java fun?")
- Boolean variables are often called "flags" or "switches"
- Cannot cast boolean to numeric types or vice versa (unlike other primitive types)

**Expected Output**:
```
1. BASIC BOOLEAN VALUES
========================
📝 Basic Boolean Declarations:
isJavaFun: true
isRaining: false
hasPermission: true
isComplete: false
```

---

### Prompt 2: AND Operator (&&)
**Task**: Create a section demonstrating the AND logical operator with practical examples.

**Expected Code Structure**: Variable declarations and print statements in main method

**Requirements**:
- Print section header: "2. BOOLEAN OPERATIONS & LOGICAL OPERATORS"
- Print section divider: "=========================================="
- Print subsection header: "🔴 AND Operator (&&) - Both must be true:"
- Create boolean `sunny` with value true
- Create boolean `warm` with value true
- Create boolean `goodWeather` with value sunny && warm
- Print "sunny (" + sunny + ") && warm (" + warm + ") = " + goodWeather

**Exact Code to Implement**:
```java
System.out.println("\n2. BOOLEAN OPERATIONS & LOGICAL OPERATORS");
System.out.println("==========================================");

// AND operator (&&) - Both conditions must be true
System.out.println("🔴 AND Operator (&&) - Both must be true:");
boolean sunny = true;
boolean warm = true;
boolean goodWeather = sunny && warm;
System.out.println("sunny (" + sunny + ") && warm (" + warm + ") = " + goodWeather);
```

**Key Points**:
- **AND (&&)**: Returns true only if BOTH operands are true
- Truth table: 
  - true && true = true
  - true && false = false
  - false && true = false
  - false && false = false
- Use for: "Must have both conditions" (e.g., sunny AND warm for good weather)
- Real-world examples: isLoggedIn && hasPermission, isAdult && hasTicket
- Both conditions must evaluate to true for the result to be true

**Expected Output**:
```
2. BOOLEAN OPERATIONS & LOGICAL OPERATORS
==========================================
🔴 AND Operator (&&) - Both must be true:
sunny (true) && warm (true) = true
```

---

### Prompt 3: OR Operator (||)
**Task**: Create a section demonstrating the OR logical operator with practical examples.

**Expected Code Structure**: Variable declarations and print statements in main method

**Requirements**:
- Print subsection header with newline: "\n🔵 OR Operator (||) - At least one must be true:"
- Create boolean `weekend` with value false
- Create boolean `holiday` with value false
- Create boolean `dayOff` with value weekend || holiday
- Print "weekend (" + weekend + ") || holiday (" + holiday + ") = " + dayOff

**Exact Code to Implement**:
```java
// OR operator (||) - At least one condition must be true
System.out.println("\n🔵 OR Operator (||) - At least one must be true:");
boolean weekend = false;
boolean holiday = false;
boolean dayOff = weekend || holiday;
System.out.println("weekend (" + weekend + ") || holiday (" + holiday + ") = " + dayOff);
```

**Key Points**:
- **OR (||)**: Returns true if AT LEAST ONE operand is true
- Truth table:
  - true || true = true
  - true || false = true
  - false || true = true
  - false || false = false
- Use for: "Need at least one condition" (e.g., weekend OR holiday for day off)
- Real-world examples: hasCard || hasCash, isStudent || isSenior
- Only one condition needs to be true for the result to be true

**Expected Output**:
```
🔵 OR Operator (||) - At least one must be true:
weekend (false) || holiday (false) = false
```

---

### Prompt 4: NOT Operator (!)
**Task**: Create a section demonstrating the NOT logical operator with practical examples.

**Expected Code Structure**: Variable declarations and print statements in main method

**Requirements**:
- Print subsection header with newline: "\n🟡 NOT Operator (!) - Inverts the value:"
- Create boolean `isWorking` with value true
- Create boolean `isNotWorking` with value !isWorking
- Print "isWorking: " + isWorking + " → !isWorking: " + isNotWorking
- Create boolean `isLoggedIn` with value false
- Create boolean `needsLogin` with value !isLoggedIn
- Print "isLoggedIn: " + isLoggedIn + " → needsLogin: " + needsLogin

**Exact Code to Implement**:
```java
// NOT operator (!) - Inverts the boolean value
System.out.println("\n🟡 NOT Operator (!) - Inverts the value:");
boolean isWorking = true;
boolean isNotWorking = !isWorking;
System.out.println("isWorking: " + isWorking + " → !isWorking: " + isNotWorking);

boolean isLoggedIn = false;
boolean needsLogin = !isLoggedIn;
System.out.println("isLoggedIn: " + isLoggedIn + " → needsLogin: " + needsLogin);
```

**Key Points**:
- **NOT (!)**: Inverts the boolean value (true becomes false, false becomes true)
- Truth table:
  - !true = false
  - !false = true
- Use for: Negating conditions or toggling states
- Real-world examples: !isVisible, !isEnabled, !hasErrors
- Unary operator (operates on single operand)
- Can be combined with other operators: !(a && b) or !isValid

**Expected Output**:
```
🟡 NOT Operator (!) - Inverts the value:
isWorking: true → !isWorking: false
isLoggedIn: false → needsLogin: true
```

---

### Prompt 5: Complex Boolean Expressions
**Task**: Create a section demonstrating complex boolean expressions with multiple operators combined.

**Expected Code Structure**: Variable declarations with complex expressions and print statements

**Requirements**:
- Print subsection header with newline: "\n🟢 Complex Boolean Expressions:"
- Create boolean `isStudent` with value true
- Create boolean `hasDiscount` with value true
- Create boolean `isVip` with value false
- Create int `purchaseAmount` with value 150
- Create boolean `qualifiesForDiscount` with value (isStudent || isVip) && hasDiscount && (purchaseAmount > 100)
- Print "Complex expression breakdown:"
- Print "(isStudent || isVip): " + (isStudent || isVip)
- Print "hasDiscount: " + hasDiscount
- Print "purchaseAmount > 100: " + (purchaseAmount > 100)
- Print "Final result: " + qualifiesForDiscount

**Exact Code to Implement**:
```java
// Complex boolean expressions
System.out.println("\n🟢 Complex Boolean Expressions:");
boolean isStudent = true;
boolean hasDiscount = true;
boolean isVip = false;
int purchaseAmount = 150;

boolean qualifiesForDiscount = (isStudent || isVip) && hasDiscount && (purchaseAmount > 100);
System.out.println("Complex expression breakdown:");
System.out.println("(isStudent || isVip): " + (isStudent || isVip));
System.out.println("hasDiscount: " + hasDiscount);
System.out.println("purchaseAmount > 100: " + (purchaseAmount > 100));
System.out.println("Final result: " + qualifiesForDiscount);
```

**Key Points**:
- **Operator Precedence**: ! (highest) → && → || (lowest)
- Use parentheses for clarity: (a || b) && c
- Complex expressions can combine multiple logical and comparison operators
- Break down complex logic into smaller, named boolean variables for readability
- Real-world business rules often require complex conditions
- Useful for validation, permissions, business logic, state management

**Expected Output**:
```
🟢 Complex Boolean Expressions:
Complex expression breakdown:
(isStudent || isVip): true
hasDiscount: true
purchaseAmount > 100: true
Final result: true
```

---

### Prompt 6: Short-Circuit Evaluation
**Task**: Create a section demonstrating short-circuit evaluation behavior with AND and OR operators.

**Expected Code Structure**: Variable declarations with short-circuit examples and print statements

**Requirements**:
- Print subsection header with newline: "\n⚡ Short-Circuit Evaluation:"
- Print "With &&: If first is false, second is not evaluated"
- Print "With ||: If first is true, second is not evaluated"
- Create int `zero` with value 0
- Create boolean `result1` with value false && (5/zero == 1) with comment "// No ArithmeticException because 5/0 is not evaluated"
- Create boolean `result2` with value true || (5/zero == 1) with comment "// No ArithmeticException because 5/0 is not evaluated"
- Print "Short-circuit results: " + result1 + ", " + result2
- Add empty line after section

**Exact Code to Implement**:
```java
// Short-circuit evaluation - very important concept!
System.out.println("\n⚡ Short-Circuit Evaluation:");
System.out.println("With &&: If first is false, second is not evaluated");
System.out.println("With ||: If first is true, second is not evaluated");

int zero = 0;
boolean result1 = false && (5/zero == 1); // No ArithmeticException because 5/0 is not evaluated
boolean result2 = true || (5/zero == 1);  // No ArithmeticException because 5/0 is not evaluated
System.out.println("Short-circuit results: " + result1 + ", " + result2);
System.out.println();
```

**Key Points**:
- **Short-Circuit Evaluation** (CRITICAL CONCEPT):
  - With &&: If left side is false, right side is NOT evaluated (already know result is false)
  - With ||: If left side is true, right side is NOT evaluated (already know result is true)
- Prevents errors: false && (5/0 == 1) doesn't throw exception
- Performance optimization: expensive operations can be skipped
- Order matters: Put simpler/faster conditions first
- **Non-Short-Circuit Operators**: & and | evaluate both sides (rarely used for booleans)
- Real-world usage: object != null && object.getValue() > 0 (null safety)

**Expected Output**:
```
⚡ Short-Circuit Evaluation:
With &&: If first is false, second is not evaluated
With ||: If first is true, second is not evaluated
Short-circuit results: false, true
```

---

### Prompt 7: Boolean with Comparison Operations
**Task**: Create a section demonstrating how comparison operators produce boolean results and practical usage.

**Expected Code Structure**: Variable declarations with comparison operations and print statements

**Requirements**:
- Print section header with newline: "\n3. BOOLEAN WITH COMPARISONS"
- Print section divider: "============================"
- Print subsection label: "🔢 Comparison Operators that Return Boolean:"
- Create int variable `age` with value 20
- Create double variable `price` with value 29.99
- Create char variable `grade` with value 'A'
- Add comment: "// Numeric comparisons"
- Create boolean `isAdult` with value age >= 18
- Create boolean `isTeenager` with value age >= 13 && age <= 19
- Create boolean `canVote` with value age >= 18
- Create boolean `isSenior` with value age >= 65
- Print "Age: " + age
- Print "isAdult (age >= 18): " + isAdult
- Print "isTeenager (age 13-19): " + isTeenager
- Print "canVote (age >= 18): " + canVote
- Print "isSenior (age >= 65): " + isSenior

**Exact Code to Implement**:
```java
System.out.println("\n3. BOOLEAN WITH COMPARISONS");
System.out.println("============================");

System.out.println("🔢 Comparison Operators that Return Boolean:");
int age = 20;
double price = 29.99;
char grade = 'A';

// Numeric comparisons
boolean isAdult = age >= 18;
boolean isTeenager = age >= 13 && age <= 19;
boolean canVote = age >= 18;
boolean isSenior = age >= 65;

System.out.println("Age: " + age);
System.out.println("isAdult (age >= 18): " + isAdult);
System.out.println("isTeenager (age 13-19): " + isTeenager);
System.out.println("canVote (age >= 18): " + canVote);
System.out.println("isSenior (age >= 65): " + isSenior);
```

**Key Points**:
- **Comparison operators return boolean values**:
    - `==` (equal to): Checks if two values are equal
    - `!=` (not equal to): Checks if two values are different
    - `<` (less than): Left value is smaller than right
    - `<=` (less than or equal to): Left value is smaller or equal
    - `>` (greater than): Left value is larger than right
    - `>=` (greater than or equal to): Left value is larger or equal
- All comparison operators work with numeric types (byte, short, int, long, float, double)
- char comparisons use ASCII/Unicode values ('A' < 'B' is true)
- Can chain comparisons with logical operators: age >= 13 && age <= 19
- **Common pattern**: Store comparison results in well-named boolean variables
    - Makes code more readable: if (isAdult) vs if (age >= 18)
    - Self-documenting code: variable name explains the business logic
    - Can reuse the boolean value multiple times
- **Warning**: Don't confuse = (assignment) with == (comparison)
    - if (x = 5) is a compilation error (can't assign in condition)
    - This prevents common C/C++ bug
- Comparison results are often used in if statements, while loops, and ternary operators
- Range checks commonly use combined comparisons: min <= value && value <= max

**Expected Output**:
```
3. BOOLEAN WITH COMPARISONS
============================
🔢 Comparison Operators that Return Boolean:
Age: 20
isAdult (age >= 18): true
isTeenager (age 13-19): true
canVote (age >= 18): true
isSenior (age >= 65): false
```

---

## Key Concepts Covered

### 1. Boolean Primitive Type

**What you'll learn:**
- The boolean primitive type with only two values: true and false
- Memory characteristics (1 bit logical, typically 1 byte physical)
- Boolean is not numeric (unlike C where 0 is false)
- Default value is false for instance variables
- Best practices for naming boolean variables

**Real-world usage:**
- Feature flags (isDarkModeEnabled, showNotifications)
- User permissions (canEdit, hasAdminAccess, isAuthenticated)
- Validation states (isValid, isComplete, hasErrors)
- Status tracking (isRunning, isConnected, isActive)
- Conditional logic in business rules

### 2. Logical Operators

**What you'll learn:**
- AND operator (&&): Both conditions must be true
- OR operator (||): At least one condition must be true
- NOT operator (!): Inverts the boolean value
- Operator precedence: ! > && > ||
- Complex boolean expressions with multiple operators

**Real-world usage:**
- Permission checks: isLoggedIn && hasPermission
- Eligibility criteria: isStudent || isSenior
- Inverting states: !isVisible, !isEnabled
- Business rules: (isPremium || hasPromoCode) && isEligible

### 3. Comparison Operations

**What you'll learn:**
- Six comparison operators that return boolean values
- Comparing numeric types (int, double, long, etc.)
- Character comparisons using Unicode values
- Range checking with combined comparisons
- Storing comparison results in boolean variables

**Real-world usage:**
- Age validation: age >= 18 for adult content
- Price filtering: price <= maxBudget
- Range checks: temperature >= 60 && temperature <= 80
- Status verification: errorCount == 0

### 4. Short-Circuit Evaluation

**What you'll learn:**
- How && stops evaluation when left side is false
- How || stops evaluation when left side is true
- Prevention of runtime errors (division by zero)
- Performance optimization by ordering conditions
- Difference from non-short-circuit operators (& and |)

**Real-world usage:**
- Null safety: object != null && object.getValue() > 0
- Performance: cheapCheck() && expensiveCheck()
- Error prevention: divisor != 0 && (total / divisor > 10)
- Optional validation: hasData || loadData()

### 5. Boolean Naming Conventions

**What you'll learn:**
- Prefixes: is, has, can, should, must, needs, contains, supports
- Question-based naming: isVisible (Is it visible?)
- Avoiding negative names: use isEnabled instead of isNotDisabled
- Descriptive names that express intent clearly

**Real-world usage:**
- isActive, hasPermission, canEdit, shouldSave
- isValidEmail, hasMinimumLength, canProceed
- needsRefresh, mustLogin, containsErrors
- supportsFeature, allowsAnonymous

---

## Memory Behavior

**Boolean Storage:**
- **Logical Size**: 1 bit (only need to store 0 or 1)
- **Physical Size**: Typically 1 byte (8 bits) in JVM
    - Reason: Most systems can't address individual bits
    - Arrays of booleans use 1 byte per element
- **In Collections**: Boolean objects use much more memory (~16 bytes with object overhead)

**Performance:**
- Boolean operations are extremely fast (CPU level)
- Short-circuit evaluation can improve performance significantly
- No type conversion overhead (unlike C where int is used)

**Stack vs Heap:**
- Local boolean variables: stored on stack
- Instance boolean variables: stored in heap with object
- Static boolean variables: stored in method area

---

## Common Mistakes to Avoid

### 1. Using == true or == false
**❌ Bad:**
```java
if (isActive == true) {
    // code
}
if (isComplete == false) {
    // code
}
```

**✅ Good:**
```java
if (isActive) {
    // code
}
if (!isComplete) {
    // code
}
```
**Why?** The variable is already boolean, comparing to true/false is redundant.

---

### 2. Confusing assignment (=) with comparison (==)
**❌ Bad (won't compile in Java, but shows the concept):**
```java
// In Java, this is a compile error - good!
// In C/C++, this would be a bug
if (isActive = true) {  // Assignment, not comparison
    // code
}
```

**✅ Good:**
```java
if (isActive == true) {  // Though just 'isActive' is better
    // code
}
```
**Why?** Java prevents assignment in conditions to avoid this common bug from C/C++.

---

### 3. Not understanding short-circuit evaluation
**❌ Bad:**
```java
// Will throw NullPointerException if user is null
if (user.isActive() && user != null) {
    // code
}
```

**✅ Good:**
```java
// Check null first, then call method
if (user != null && user.isActive()) {
    // code
}
```
**Why?** Order matters! Put the null check first to prevent NullPointerException.

---

### 4. Complex conditions without parentheses
**❌ Bad:**
```java
boolean result = a || b && c;  // Unclear precedence
```

**✅ Good:**
```java
boolean result = a || (b && c);  // Clear intent
// or
boolean result = (a || b) && c;  // Different logic, but clear
```
**Why?** Even though && has higher precedence than ||, explicit parentheses improve readability.

---

### 5. Poor boolean variable naming
**❌ Bad:**
```java
boolean active;           // Not clear it's a question
boolean notDisabled;      // Double negative - confusing
boolean flag;             // Too generic
boolean status;           // Not boolean-like name
```

**✅ Good:**
```java
boolean isActive;         // Clear question: "Is it active?"
boolean isEnabled;        // Positive form
boolean hasPermission;    // Descriptive
boolean canEdit;          // Clear capability check
```
**Why?** Good names make code self-documenting and easier to understand.

---

## Running the Code

**From IDE:**
1. Open the BooleanExamples.java file in your IDE
2. Right-click and select "Run BooleanExamples.main()"
3. View the output in the console

**From Command Line:**
```bash
# Navigate to the basics-final directory
cd basics-final

# Compile
javac src/main/java/com/modernjava/_2primitives/BooleanExamples.java

# Run
java -cp src/main/java com.modernjava._2primitives.BooleanExamples
```

**Using Gradle:**
```bash
# From the project root
./gradlew :basics-final:run

# Or specifically run this class
./gradlew :basics-final:run --args="BooleanExamples"
```

---

## Expected Output

```
=== COMPREHENSIVE BOOLEAN GUIDE ===

1. BASIC BOOLEAN VALUES
========================
📝 Basic Boolean Declarations:
isJavaFun: true
isRaining: false
hasPermission: true
isComplete: false

2. BOOLEAN OPERATIONS & LOGICAL OPERATORS
==========================================
🔴 AND Operator (&&) - Both must be true:
sunny (true) && warm (true) = true

🔵 OR Operator (||) - At least one must be true:
weekend (false) || holiday (false) = false

🟡 NOT Operator (!) - Inverts the value:
isWorking: true → !isWorking: false
isLoggedIn: false → needsLogin: true

🟢 Complex Boolean Expressions:
Complex expression breakdown:
(isStudent || isVip): true
hasDiscount: true
purchaseAmount > 100: true
Final result: true

⚡ Short-Circuit Evaluation:
With &&: If first is false, second is not evaluated
With ||: If first is true, second is not evaluated
Short-circuit results: false, true

3. BOOLEAN WITH COMPARISONS
============================
🔢 Comparison Operators that Return Boolean:
Age: 20
isAdult (age >= 18): true
isTeenager (age 13-19): true
canVote (age >= 18): true
isSenior (age >= 65): false

=== END OF BOOLEAN GUIDE ===
```

---

## Next Steps

After mastering boolean primitives, explore:

1. **Control Flow with Booleans:**
    - if-else statements with boolean conditions
    - while loops with boolean termination conditions
    - do-while loops and boolean flags
    - for loops with boolean break conditions

2. **Boolean in Methods:**
    - Methods that return boolean values
    - Boolean parameters for method behavior control
    - Validation methods (isValid, hasError)

3. **Ternary Operator:**
    - Conditional expressions: condition ? trueValue : falseValue
    - Compact alternative to simple if-else

4. **Boolean Wrapper Class:**
    - Boolean class for collections
    - Autoboxing and unboxing
    - Utility methods: Boolean.parseBoolean(), Boolean.valueOf()

5. **Advanced Patterns:**
    - State machines with boolean flags
    - Bit flags for multiple boolean states
    - Boolean algebra and De Morgan's laws

---

## Summary

**Key Takeaways:**

1. **Boolean is the simplest primitive type** with only two values: true and false
2. **Three logical operators**: && (AND), || (OR), ! (NOT)
3. **Short-circuit evaluation** is critical for performance and error prevention
4. **Comparison operators** produce boolean results for decision making
5. **Name boolean variables as questions** using is, has, can, should prefixes
6. **Never compare with == true or == false** - use the boolean directly
7. **Order matters in short-circuit evaluation** - put null checks and simple conditions first
8. **Use parentheses** for complex boolean expressions to improve readability
9. **Boolean values are fundamental** to control flow and conditional logic
10. **Store comparison results** in well-named boolean variables for code clarity

**Best Practices:**
- Always use descriptive names: isActive, hasPermission, canEdit
- Leverage short-circuit evaluation: nullCheck && methodCall()
- Put simpler/faster conditions first in logical expressions
- Use parentheses for complex expressions
- Avoid double negatives: use isEnabled instead of isNotDisabled
- Never use == true or == false
- Store reusable comparisons in boolean variables
- Comment complex boolean logic for future maintainers

**Common Use Cases:**
- Feature flags and toggles
- User permissions and access control
- Validation results
- State tracking (isRunning, isConnected)
- Conditional program flow
- Business rule evaluation
- Form validation
- Error checking

Boolean is the foundation of program logic and decision-making in Java. Master these concepts, and you'll write clearer, more maintainable conditional code!
