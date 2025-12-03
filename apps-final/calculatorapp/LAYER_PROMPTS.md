# 🏗️ Calculator App - Layer-by-Layer Prompts

This document contains AI prompts for each layer of the Calculator App architecture. Use these prompts to understand, teach, or replicate the application layer by layer.

---

## 📋 Table of Contents

1. [Domain Layer](#1-domain-layer-prompt)
2. [Core/Business Logic Layer](#2-corebusiness-logic-layer-prompt)
3. [UI Layer](#3-ui-layer-prompt)
4. [Application Layer](#4-application-layer-prompt)
5. [Integration Prompts](#5-integration-prompts)

---

## 1. Domain Layer Prompt

### Domain Layer Overview
**Package:** `com.calculator.domain`  
**Purpose:** Define domain models and enums  
**Responsibility:** Provide type-safe operation definitions

---

### Prompt 1.1: Create CalculatorOperation Enum

```
Create a Java enum called CalculatorOperation that represents all available arithmetic operations.

Requirements:
1. Create an enum with 4 constants: ADD, SUBTRACT, MULTIPLY, DIVIDE
2. Each enum constant should have:
   - A symbol (String): "+", "-", "*", "/"
   - A displayName (String): "Add", "Subtract", "Multiply", "Divide"
3. Provide a constructor that accepts symbol and displayName
4. Add methods:
   - getSymbol() - returns the operation symbol
   - getDisplayName() - returns the user-friendly name
5. Add comprehensive Javadoc comments for the enum and all methods
6. Package: com.calculator.domain

Example usage:
- CalculatorOperation.ADD.getSymbol() → "+"
- CalculatorOperation.ADD.getDisplayName() → "Add"
```

**Expected Output:**
- File: `CalculatorOperation.java`
- Size: ~35 lines
- Key Features: Enum with 2 fields, constructor, 2 getter methods, Javadoc

---

## 2. Core/Business Logic Layer Prompt

### Core Layer Overview
**Package:** `com.calculator.core`  
**Purpose:** Implement pure business logic (calculations)  
**Responsibility:** Perform arithmetic operations and route operations

---

### Prompt 2.1: Create Calculator Class - Basic Operations

```
Create a Java class called Calculator that performs basic arithmetic operations.

Requirements:
1. Create public methods for each operation:
   - add(double num1, double num2) → returns sum
   - subtract(double num1, double num2) → returns difference
   - multiply(double num1, double num2) → returns product
   - divide(double num1, double num2) → returns quotient
2. Validation:
   - divide() method must check if num2 == 0
   - If dividing by zero, throw ArithmeticException("Cannot divide by zero!")
3. All methods should return double
4. Add comprehensive Javadoc comments for each method
5. Include @param and @return tags in Javadoc
6. Package: com.calculator.core

Example usage:
- calculator.add(10, 5) → 15.0
- calculator.divide(10, 0) → throws ArithmeticException
```

**Expected Output:**
- File: `Calculator.java`
- Size: ~50 lines
- Key Features: 4 operation methods, division by zero check, Javadoc

---

### Prompt 2.2: Add Operation Routing to Calculator Class

```
Extend the Calculator class with an operation routing method.

Requirements:
1. Add a public method: performCalculation(double num1, double num2, CalculatorOperation operation)
2. Use a modern Java switch expression to route to the correct method:
   - case ADD → call add()
   - case SUBTRACT → call subtract()
   - case MULTIPLY → call multiply()
   - case DIVIDE → call divide()
3. Return the result as double
4. This method should delegate to the individual operation methods (not duplicate logic)
5. Add comprehensive Javadoc explaining the method
6. Import CalculatorOperation from com.calculator.domain

Why this matters: Separates operation routing logic from UI orchestration

Example usage:
- calculator.performCalculation(10, 5, CalculatorOperation.ADD) → 15.0
```

**Expected Output:**
- Addition to: `Calculator.java`
- New method: performCalculation() with switch expression
- Size: ~15 additional lines

---

## 3. UI Layer Prompt

### UI Layer Overview
**Package:** `com.calculator.ui`  
**Purpose:** Handle user input and menu display  
**Responsibility:** Collect and validate user choices

---

### Prompt 3.1: Create OperationSelector Class - Menu Display and Selection

```
Create a Java class called OperationSelector that handles operation selection from user input.

Requirements:
1. Constructor:
   - Accept Scanner as parameter (dependency injection)
   - Store as private final field
2. Method: getOperation()
   - Returns: CalculatorOperation enum
   - Logic:
     a. Use a do-while loop to keep asking until valid choice
     b. Call displayOperationMenu() to show menu
     c. Read user input with scanner.nextInt()
     d. Consume the newline with scanner.nextLine()
     e. Use a switch expression to map 1-5 to operations:
        - 1 → CalculatorOperation.ADD
        - 2 → CalculatorOperation.SUBTRACT
        - 3 → CalculatorOperation.MULTIPLY
        - 4 → CalculatorOperation.DIVIDE
        - 5 → Exit application with System.exit(0)
        - default → Show error message and retry
     f. Return valid operation or null for invalid
3. Method: displayOperationMenu() (private)
   - Shows menu with options 1-5
   - Displays: Add, Subtract, Multiply, Divide, Exit
4. Add comprehensive Javadoc comments
5. Package: com.calculator.ui
6. Import: CalculatorOperation from com.calculator.domain

Why this matters: Separates UI concerns from business logic

Example usage:
- OperationSelector selector = new OperationSelector(scanner);
- CalculatorOperation op = selector.getOperation(); // Shows menu, gets choice
```

**Expected Output:**
- File: `OperationSelector.java`
- Size: ~60 lines
- Key Features: Menu display, input validation, switch expression, do-while loop, Javadoc

---

## 4. Application Layer Prompt

### Application Layer Overview
**Package:** `com.calculator.app`  
**Purpose:** Entry point and orchestration  
**Responsibility:** Coordinate between layers, manage main loop

---

### Prompt 4.1: Create CalculatorApp Class - Constructor and Main Method

```
Create a Java class called CalculatorApp that serves as the application entry point.

Requirements:
1. Private final fields:
   - Calculator calculator (dependency injection)
   - Scanner scanner (dependency injection)
   - OperationSelector operationSelector (created in constructor)

2. Constructor:
   - Accept Calculator and Scanner as parameters
   - Store both as final fields
   - Create OperationSelector instance and store it

3. Static main() method:
   - Signature: static void main(String[] args)
   - Create Calculator instance: new Calculator()
   - Create Scanner instance: new Scanner(System.in)
   - Create CalculatorApp instance with both
   - Call orchestration() method

4. Add Javadoc comments for:
   - Class (describe purpose)
   - Constructor (describe parameters)
   - main() method (describe what it does)

5. Package: com.calculator.app
6. Import: All necessary classes from other layers

Why this matters: Demonstrates dependency injection pattern

Example structure:
```java
public class CalculatorApp {
    private final Calculator calculator;
    private final Scanner scanner;
    private final OperationSelector operationSelector;
    
    public CalculatorApp(Calculator calculator, Scanner scanner) {
        // Initialize fields
    }
    
    static void main(String[] args) {
        // Create instances and start app
    }
}
```
```

**Expected Output:**
- File: `CalculatorApp.java` (partial)
- Size: ~35 lines (for this part)
- Key Features: Dependency injection, main method, constructor

---

### Prompt 4.2: Add orchestration() - Main Application Loop

```
Add the orchestration() method to CalculatorApp class that implements the main application loop.

Requirements:
1. Method signature: public void orchestration()
2. Loop flow (correct order):
   a. Print welcome message: "=== Welcome to Calculator App ==="
   b. Initialize boolean continueCalculation = true
   c. While loop that continues while continueCalculation is true:
      i. Inside try block:
         - Call operationSelector.getOperation() to get operation (FIRST!)
         - Prompt and read first number: "Enter first number: "
         - Prompt and read second number: "Enter second number: "
         - Call calculator.performCalculation(num1, num2, operation)
         - Display result: "Result: num1 symbol num2 = result"
         - Call askToContinue() to get user response
      ii. Catch ArithmeticException: print error message
      iii. Catch general Exception: print invalid input message and clear buffer with scanner.nextLine()
   d. After loop exits:
      - Print "Thank you for using Calculator App!"
      - Close scanner with scanner.close()

3. Add comprehensive Javadoc explaining the method flow

Why this matters: Core application logic that coordinates all layers

Key points:
- Operation selection comes FIRST, before entering numbers
- Proper error handling for both math errors and input errors
- Scanner buffer management
- Clean resource management
```

**Expected Output:**
- Addition to: `CalculatorApp.java`
- New method: orchestration() with complete loop
- Size: ~45 additional lines

---

### Prompt 4.3: Add askToContinue() - Input Validation

```
Add the askToContinue() method to CalculatorApp class for validating the continue prompt.

Requirements:
1. Method signature: private boolean askToContinue()
2. Logic:
   a. Use while(true) loop for input validation
   b. Prompt: "Do you want to perform another calculation? (y/n): "
   c. Read response with scanner.next() and convert to lowercase
   d. If response equals "y": return true
   e. If response equals "n": return false
   f. Else: print "Invalid option! Please enter 'y' or 'n'." and loop continues
3. Only accepts single character 'y' or 'n' (case-insensitive)
4. Add comprehensive Javadoc

Why this matters: Strict input validation improves user experience

Key points:
- Only accepts 'y' or 'n', nothing else
- Case-insensitive
- Shows error message for invalid input
- Keeps asking until valid input
```

**Expected Output:**
- Addition to: `CalculatorApp.java`
- New method: askToContinue()
- Size: ~15 additional lines

---

## 5. Integration Prompts

### Prompt 5.1: Create All Layers Together

```
Create a complete Calculator Application with 4 layers:

Architecture:
- Domain Layer (com.calculator.domain): CalculatorOperation enum
- Core Layer (com.calculator.core): Calculator class
- UI Layer (com.calculator.ui): OperationSelector class
- Application Layer (com.calculator.app): CalculatorApp class

Requirements:
1. Domain Layer:
   - CalculatorOperation enum with ADD, SUBTRACT, MULTIPLY, DIVIDE
   - Each with symbol and displayName
   - getSymbol() and getDisplayName() methods

2. Core Layer:
   - Calculator class with add(), subtract(), multiply(), divide()
   - divide() throws ArithmeticException for division by zero
   - performCalculation(num1, num2, operation) method with switch expression

3. UI Layer:
   - OperationSelector class
   - getOperation() method with do-while loop and switch expression
   - displayOperationMenu() private method
   - Consumes newline after nextInt()

4. Application Layer:
   - CalculatorApp class with dependency injection
   - main() method
   - orchestration() main loop (operation FIRST, then numbers)
   - askToContinue() with y/n validation

5. All classes must have:
   - Comprehensive Javadoc comments
   - @param and @return tags
   - Proper error handling
   - Clean code principles

Application Flow:
1. Show welcome message
2. Loop until user exits:
   a. Show operation menu
   b. Get operation choice
   c. Get first number
   d. Get second number
   e. Calculate result
   f. Display result
   g. Ask to continue (y/n only)
3. Exit cleanly

Example Execution:
```
=== Welcome to Calculator App ===

Select operation:
1. Add
2. Subtract
3. Multiply
4. Divide
5. Exit
Enter your choice (1-5): 1
Enter first number: 10
Enter second number: 5
Result: 10.0 + 5.0 = 15.0

Do you want to perform another calculation? (y/n): n
Thank you for using Calculator App!
```
```

**Expected Output:**
- 4 complete files
- ~200 total lines of code
- Fully functional calculator app
- Demonstrating all architecture patterns

---

### Prompt 5.2: Extend with New Operations

```
Extend the Calculator App with a new operation (e.g., Power or Modulo).

Starting point: Fully functional 4-layer calculator app

Requirements:
1. Add to CalculatorOperation enum:
   - New constant (e.g., POWER("^", "Power"))

2. Update Calculator class:
   - Add new method (e.g., power(double num1, double num2))
   - Update performCalculation() switch expression to handle new operation

3. Update OperationSelector class:
   - Update displayOperationMenu() to show new operation
   - Update switch expression to handle new choice

4. No changes needed to CalculatorApp orchestration logic

This demonstrates the extensibility of the layered architecture.
```

---

## 📊 Layer Interaction Diagram

```
User Input
    ↓
┌─────────────────────────────────┐
│  APPLICATION LAYER              │
│  (CalculatorApp)                │
│  • main()                       │
│  • orchestration()              │
│  • askToContinue()              │
└────────────┬──────────────────┬─┘
             │                  │
             ↓                  ↓
        ┌─────────────┐  ┌──────────────────┐
        │ UI LAYER    │  │ CORE LAYER       │
        │ (Operation  │  │ (Calculator)     │
        │  Selector)  │  │ • add()          │
        │ • getOp()   │  │ • subtract()     │
        │ • display() │  │ • multiply()     │
        └──────┬──────┘  │ • divide()       │
               │         │ • performCalc()  │
               │         └──────┬───────────┘
               │                │
               └────────┬───────┘
                        ↓
                ┌────────────────────┐
                │ DOMAIN LAYER       │
                │ (CalculatorOp)     │
                │ • ADD              │
                │ • SUBTRACT         │
                │ • MULTIPLY         │
                │ • DIVIDE           │
                └────────────────────┘
```

---

## 🎯 Using These Prompts

### Option 1: Build Layer by Layer
1. Start with Prompt 1.1 (Domain Layer)
2. Follow with Prompt 2.1 and 2.2 (Core Layer)
3. Continue with Prompt 3.1 (UI Layer)
4. Finish with Prompts 4.1, 4.2, 4.3 (Application Layer)

### Option 2: Build Complete App
Use Prompt 5.1 to create the entire app at once

### Option 3: Extend Existing App
Use Prompt 5.2 to add new features

---

## 📚 Key Concepts Demonstrated

| Layer | Concept | Prompt |
|-------|---------|--------|
| Domain | Enums, type safety | 1.1 |
| Core | Business logic, error handling | 2.1, 2.2 |
| UI | Input validation, menu display | 3.1 |
| App | Main loop, orchestration, DI | 4.1, 4.2, 4.3 |
| All | Architecture, design patterns | 5.1, 5.2 |

---

## ✅ Validation Checklist

After implementing each prompt, verify:

- [ ] Code compiles without errors
- [ ] All Javadoc comments are present
- [ ] Proper error handling for edge cases
- [ ] Code follows naming conventions
- [ ] Classes have appropriate visibility (public/private)
- [ ] Dependencies are injected (not hardcoded)
- [ ] Switch expressions used (not if-else chains)
- [ ] Scanner buffer managed properly
- [ ] Application handles user errors gracefully

---

## 🔄 Complete Application Workflow

```
CalculatorApp.main()
    ↓
    Creates Calculator + Scanner + CalculatorApp
    ↓
    Calls orchestration()
    ↓
    ┌─ Loop: continueCalculation = true
    │  ├─ operationSelector.getOperation()
    │  │  ├─ displayOperationMenu()
    │  │  ├─ Read choice (1-5)
    │  │  ├─ Switch expression
    │  │  └─ Return CalculatorOperation
    │  ├─ Read num1
    │  ├─ Read num2
    │  ├─ calculator.performCalculation(num1, num2, op)
    │  │  └─ Switch expression routes to correct method
    │  ├─ Display result
    │  ├─ askToContinue()
    │  │  └─ Loop until 'y' or 'n'
    │  └─ Update continueCalculation
    └─ End loop
    ↓
    Close scanner + Exit
```

---

**Use these prompts to understand, teach, or replicate the Calculator App architecture!** 🚀

