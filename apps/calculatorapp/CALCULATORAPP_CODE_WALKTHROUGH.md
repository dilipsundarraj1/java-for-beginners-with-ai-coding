# CalculatorApp.java - Detailed Code Walkthrough

## 📋 Overview

`CalculatorApp` is the **main orchestration class** that ties all components together. It manages the application flow, user interaction, and error handling.

**File Location:** `com/calculator/app/CalculatorApp.java`  
**Type:** Public class  
**Layer:** Application Layer  
**Responsibilities:** Entry point, orchestration, error handling, resource management

---

## 📦 Class Declaration & Fields

```java
public class CalculatorApp {

    private final Calculator calculator;
    private final Scanner scanner;
    private final OperationSelector operationSelector;
```

### Field Breakdown

| Field | Type | Scope | Purpose |
|-------|------|-------|---------|
| `calculator` | `Calculator` | `private final` | Performs calculations (injected) |
| `scanner` | `Scanner` | `private final` | Reads user input (injected) |
| `operationSelector` | `OperationSelector` | `private final` | Manages operation selection (created) |

**Why `final`?** Immutability - prevents accidental reassignment after initialization.

---

## 🏗️ Constructor

```java
/**
 * Constructor for CalculatorApp
 * @param calculator the Calculator instance to use for computations
 * @param scanner the Scanner instance to use for user input
 */
public CalculatorApp(Calculator calculator, Scanner scanner) {
    this.calculator = calculator;
    this.scanner = scanner;
    this.operationSelector = new OperationSelector(scanner);
}
```

### What It Does

1. **Receives Dependencies:** `Calculator` and `Scanner` are injected
2. **Assigns Fields:** Stores references to injected dependencies
3. **Creates UI Component:** Initializes `OperationSelector` with the scanner

### Example Usage

```java
// Create dependencies
Calculator calc = new Calculator();
Scanner input = new Scanner(System.in);

// Create app with dependencies
CalculatorApp app = new CalculatorApp(calc, input);

// Start the app
app.orchestration();
```

### Design Pattern: Dependency Injection

✅ **Benefits:**
- Easy to test with mock objects
- Dependencies are explicit
- Loosely coupled components

---

## 🚀 Main Method

```java
/**
 * Main method to start the calculator application
 */
static void main(@SuppressWarnings("unused") String[] args) {
    CalculatorApp app = new CalculatorApp(new Calculator(), new Scanner(System.in));
    app.orchestration();
}
```

### Breakdown

| Part | Explanation |
|------|-------------|
| `static` | Called by JVM without creating class instance |
| `void` | Returns nothing |
| `main(String[] args)` | Standard Java entry point signature |
| `@SuppressWarnings("unused")` | Tells IDE to ignore unused `args` parameter |
| `new Calculator()` | Creates calculator instance |
| `new Scanner(System.in)` | Creates scanner reading from keyboard |
| `new CalculatorApp(...)` | Creates app with dependencies |
| `app.orchestration()` | Starts the main application loop |

### Execution Flow

```
JVM calls main()
    ↓
Creates Calculator (business logic)
    ↓
Creates Scanner (reads from keyboard)
    ↓
Creates CalculatorApp with dependencies
    ↓
Calls orchestration() to start loop
```

---

## 🔄 Orchestration Method

The **orchestration() method** is the heart of the application - the main event loop.

```java
public void orchestration() {
    System.out.println("=== Welcome to Calculator App ===");

    boolean continueCalculation = true;

    while (continueCalculation) {
        try {
            // Get first number
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            // Get second number
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            // Get operation from user
            CalculatorOperation calculatorOperation = operationSelector.getOperation();

            // Perform calculation
            double result = performCalculation(num1, num2, calculatorOperation);

            // Display result
            System.out.println("Result: " + num1 + " " + calculatorOperation.getSymbol() + " " + num2 + " = " + result);

            // Ask if user wants to continue
            continueCalculation = askToContinue();

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please try again.");
            scanner.nextLine(); // Clear invalid input
        }
    }

    System.out.println("Thank you for using Calculator App!");
    scanner.close();
}
```

### Step-by-Step Walkthrough

#### Step 1: Welcome Message
```java
System.out.println("=== Welcome to Calculator App ===");
```
Prints opening banner to user.

#### Step 2: Initialize Loop Control
```java
boolean continueCalculation = true;
```
Controls the main loop - loop continues as long as this is `true`.

#### Step 3: Main Loop Begins
```java
while (continueCalculation) {
    try {
        // ... code inside
    }
}
```

#### Step 4: Get Operation (NOW FIRST!)
```java
CalculatorOperation calculatorOperation = operationSelector.getOperation();
```
Delegates to `OperationSelector` which:
- Shows menu (1-5)
- Gets user choice
- Validates input
- Returns `CalculatorOperation` enum

**Why First?** User knows what operation they're doing before entering numbers

#### Step 5: Get First Number
```java
System.out.print("Enter first number: ");
double num1 = scanner.nextDouble();
```
- Prompts user for input
- Reads next double from scanner
- If user enters non-numeric input → throws `InputMismatchException` → caught by `catch`

#### Step 6: Get Second Number
```java
System.out.print("Enter second number: ");
double num2 = scanner.nextDouble();
```
Same as first number.

#### Step 7: Perform Calculation
```java
double result = performCalculation(num1, num2, calculatorOperation);
```
Delegates to `performCalculation()` which routes to appropriate calculator method.

**Example:** If `calculatorOperation` is `ADD`:
```
performCalculation(10, 5, ADD)
    ↓
switch(ADD) → case ADD
    ↓
calculator.add(10, 5)
    ↓
returns 15.0
```

#### Step 8: Display Result
```java
System.out.println("Result: " + num1 + " " + calculatorOperation.getSymbol() + " " + num2 + " = " + result);
```

Displays formatted result:
- `num1` = first number (e.g., 10.0)
- `calculatorOperation.getSymbol()` = operation symbol from enum (e.g., "+")
- `num2` = second number (e.g., 5.0)
- `result` = calculated result (e.g., 15.0)

**Output:** `Result: 10.0 + 5.0 = 15.0`

#### Step 9: Ask to Continue
```java
continueCalculation = askToContinue();
```
Asks user if they want another calculation:
- User enters "y" or "yes" → `continueCalculation = true` → loop continues (back to operation menu)
- User enters "n" or "no" → `continueCalculation = false` → loop exits

#### Step 10: Error Handling

**ArithmeticException Handling:**
```java
catch (ArithmeticException e) {
    System.out.println("Error: " + e.getMessage());
}
```
Catches division by zero errors from `Calculator.divide()`:
- Prints error message: "Error: Cannot divide by zero!"
- Loop continues → asks for new inputs

**General Exception Handling:**
```java
catch (Exception e) {
    System.out.println("Invalid input! Please try again.");
    scanner.nextLine(); // Clear invalid input
}
```
Catches other errors (invalid input format):
- Prints error message
- `scanner.nextLine()` clears remaining invalid input from buffer
- Loop continues → asks for new inputs

#### Step 11: Cleanup & Exit
```java
System.out.println("Thank you for using Calculator App!");
scanner.close();
```
When `continueCalculation` becomes `false`:
- Prints goodbye message
- Closes scanner (releases resources)

### Flow Diagram

```
┌─ Welcome Message
│
├─ Loop Start (while continueCalculation)
│  │
│  ├─ Try Block
│  │  ├─ Get operation (FIRST - Show menu)
│  │  ├─ Read num1
│  │  ├─ Read num2
│  │  ├─ Calculate result
│  │  ├─ Display result
│  │  └─ Ask continue?
│  │     ├─ Yes → continueCalculation = true
│  │     └─ No → continueCalculation = false
│  │
│  ├─ Catch ArithmeticException
│  │  └─ Print error message
│  │
│  ├─ Catch Exception
│  │  ├─ Print error message
│  │  └─ Clear buffer
│  │
│  └─ Loop End
│
├─ Close scanner
└─ Exit
```

---

## 🧮 PerformCalculation Method

```java
/**
 * Performs the calculation based on operation.
 * Delegates to the appropriate Calculator method based on the operation type.
 *
 * @param num1 first operand
 * @param num2 second operand
 * @param calculatorOperation the Operation enum specifying which calculation to perform
 * @return the result of the calculation
 */
private double performCalculation(double num1, double num2, CalculatorOperation calculatorOperation) {
    return switch (calculatorOperation) {
        case ADD -> calculator.add(num1, num2);
        case SUBTRACT -> calculator.subtract(num1, num2);
        case MULTIPLY -> calculator.multiply(num1, num2);
        case DIVIDE -> calculator.divide(num1, num2);
    };
}
```

### What It Does

Routes calculation to the correct `Calculator` method based on operation type.

### Switch Expression Breakdown

```java
return switch (calculatorOperation) {
    case ADD -> calculator.add(num1, num2);           // 10 + 5 = 15
    case SUBTRACT -> calculator.subtract(num1, num2); // 10 - 5 = 5
    case MULTIPLY -> calculator.multiply(num1, num2); // 10 * 5 = 50
    case DIVIDE -> calculator.divide(num1, num2);    // 10 / 5 = 2
};
```

**Key Features:**
- ✅ Modern Java syntax (switch expression, not statement)
- ✅ Each case returns a value directly
- ✅ Compiler ensures all enum cases are covered
- ✅ Cleaner than if-else chains

### Example Execution

```java
performCalculation(20, 4, CalculatorOperation.DIVIDE)
    ↓
switch (DIVIDE)
    ↓
case DIVIDE matched
    ↓
calculator.divide(20, 4)
    ↓
Returns: 5.0
```

---

## ❓ AskToContinue Method

```java
/**
 * Asks user if they want to continue with more calculations.
 * Accepts only 'y' or 'n' (case-insensitive).
 * Keeps asking until user enters valid option.
 *
 * @return true if user enters 'y', false if user enters 'n'
 */
private boolean askToContinue() {
    while (true) {
        System.out.print("\nDo you want to perform another calculation? (y/n): ");
        String response = scanner.next().toLowerCase();

        if (response.equals("y")) {
            return true;
        } else if (response.equals("n")) {
            return false;
        } else {
            System.out.println("Invalid option! Please enter 'y' or 'n'.");
        }
    }
}
```

### Breakdown

| Line | Explanation |
|------|-------------|
| `while (true)` | Infinite loop until valid input received |
| `System.out.print(...)` | Shows prompt (no newline) |
| `scanner.next()` | Reads user input as string |
| `.toLowerCase()` | Converts to lowercase for case-insensitive matching |
| `response.equals("y")` | If user entered 'y' → return true (continue) |
| `response.equals("n")` | If user entered 'n' → return false (exit) |
| `else { System.out.println(...) }` | Invalid input → show error, loop continues |

### Behavior

| User Input | Result |
|-----------|--------|
| `y` or `Y` | ✅ `true` → loop continues |
| `n` or `N` | ✅ `false` → loop exits |
| `yes` or `no` | ❌ Invalid option! → ask again |
| `yt` or `maybe` | ❌ Invalid option! → ask again |
| Anything else | ❌ Invalid option! → ask again |

### Example Usage

```java
// User enters "y"
askToContinue() // Returns true, continues to next operation

// User enters "yes" (invalid)
// System: "Invalid option! Please enter 'y' or 'n'."
// System: "Do you want to perform another calculation? (y/n): "
// User enters "y"
askToContinue() // Returns true, continues

// User enters "n"
askToContinue() // Returns false, exits application
```

---

## 🔗 Method Dependencies

```
orchestration()
    │
    ├─ scanner.nextDouble()           (Read input)
    ├─ operationSelector.getOperation() (Get operation)
    ├─ performCalculation()           (Calculate)
    ├─ calculatorOperation.getSymbol() (Format output)
    └─ askToContinue()               (Continue prompt)
        │
        └─ scanner.next()            (Read input)
```

---

## 📊 State Management

### Variables Lifecycle

```
orchestration() starts
    │
    ├─ continueCalculation = true (initialized)
    │  │
    │  └─ While loop begins
    │     │
    │     ├─ num1 = scanner.nextDouble()  (scoped to iteration)
    │     ├─ num2 = scanner.nextDouble()  (scoped to iteration)
    │     ├─ calculatorOperation = ...    (scoped to iteration)
    │     ├─ result = ...                 (scoped to iteration)
    │     │
    │     ├─ continueCalculation = askToContinue()
    │     │  │
    │     │  ├─ if true → loop again (new iteration)
    │     │  └─ if false → exit loop
    │     │
    │     └─ If exception → catch block handles
    │
    └─ While loop exits
       │
       └─ Cleanup: scanner.close()
```

---

## ⚠️ Error Scenarios

### Scenario 1: Non-numeric Input

```
Console Input:
    Enter first number: abc

What Happens:
    1. scanner.nextDouble() throws InputMismatchException
    2. Exception caught by: catch (Exception e)
    3. Prints: "Invalid input! Please try again."
    4. scanner.nextLine() clears buffer
    5. Loop continues
    
Result: User can try again
```

### Scenario 2: Division by Zero

```
Console Input:
    Enter first number: 10
    Enter second number: 0
    Operation choice: 4 (Divide)

What Happens:
    1. performCalculation(10, 0, DIVIDE)
    2. calculator.divide(10, 0)
    3. Throws: ArithmeticException("Cannot divide by zero!")
    4. Exception caught by: catch (ArithmeticException e)
    5. Prints: "Error: Cannot divide by zero!"
    
Result: User can try again
```

### Scenario 3: Invalid Operation Choice

```
Console Input:
    Enter your choice (1-5): 7

What Happens:
    1. operationSelector.getOperation() validation fails
    2. Prints: "Invalid choice! Please select 1-5."
    3. Shows menu again (do-while loop in getOperation)
    
Result: User must choose valid operation
```

---

## 🎯 Best Practices Demonstrated

✅ **Immutability**
```java
private final Calculator calculator;  // Can't be reassigned
```

✅ **Dependency Injection**
```java
public CalculatorApp(Calculator calculator, Scanner scanner)
```

✅ **Separation of Concerns**
- Orchestration in `orchestration()`
- Calculation in `performCalculation()`
- User interaction in `askToContinue()`

✅ **Exception Handling**
- Specific catch blocks for different error types
- Resource cleanup in finally (via scanner.close())

✅ **Javadoc Documentation**
- Class-level documentation
- Method-level documentation with @param and @return

✅ **Switch Expressions**
- Modern Java 14+ syntax
- More readable than if-else chains

✅ **Clear Variable Names**
- `continueCalculation` (not `flag` or `c`)
- `calculatorOperation` (not `op` or `o`)

---

## 🔄 Complete Example Execution

```
=== Welcome to Calculator App ===

Select operation:
1. Add
2. Subtract
3. Multiply
4. Divide
5. Exit
Enter your choice (1-5): 3           ← User input (Choose operation first!)

Enter first number: 100              ← User input
Enter second number: 25              ← User input

Result: 100.0 * 25.0 = 2500.0        ← Output

Do you want to perform another calculation? (y/n): y  ← User input

Select operation:
1. Add
2. Subtract
3. Multiply
4. Divide
5. Exit
Enter your choice (1-5): 2           ← User input (2nd iteration)

Enter first number: 50               ← User input (2nd iteration)
Enter second number: 5               ← User input (2nd iteration)

Result: 50.0 - 5.0 = 45.0            ← Output

Do you want to perform another calculation? (y/n): n  ← User input

Thank you for using Calculator App!  ← Exit message
```

---

## 🎓 Learning Outcomes

After studying this class, you understand:

1. ✅ How to structure a main application class
2. ✅ How to use dependency injection
3. ✅ How to orchestrate multiple components
4. ✅ How to handle errors gracefully
5. ✅ How to create application loops
6. ✅ How to use modern Java switch expressions
7. ✅ How to manage user interaction flow
8. ✅ How to write clean, maintainable code


