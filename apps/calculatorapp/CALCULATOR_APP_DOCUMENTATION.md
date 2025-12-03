# Calculator App - Complete Documentation

## 📋 Table of Contents
1. [Application Overview](#application-overview)
2. [Architecture & Structure](#architecture--structure)
3. [Package Organization](#package-organization)
4. [Code Structure & Components](#code-structure--components)
5. [Class Responsibilities](#class-responsibilities)
6. [Data Flow](#data-flow)
7. [How to Use](#how-to-use)
8. [Design Patterns Used](#design-patterns-used)

---

## 🎯 Application Overview

### What is the Calculator App?

The **Calculator App** is a command-line calculator application that allows users to perform basic arithmetic operations (addition, subtraction, multiplication, and division) in an interactive, user-friendly interface.

### Key Features

✅ **Basic Arithmetic Operations**
- Addition (+)
- Subtraction (-)
- Multiplication (*)
- Division (/) with zero-division protection

✅ **User-Friendly Interface**
- Clear menu-driven operation selection
- Input validation and error handling
- Ability to perform multiple calculations without restarting

✅ **Robust Error Handling**
- Handles invalid user inputs gracefully
- Prevents division by zero
- Clears input buffer on errors
- Provides meaningful error messages

✅ **Professional Architecture**
- Clean separation of concerns
- Layered architecture pattern
- Dependency injection
- Type-safe operations using enums

### Example Usage

```
=== Welcome to Calculator App ===
Select operation:
1. Add
2. Subtract
3. Multiply
4. Divide
5. Exit
Enter your choice (1-5): 1
Enter first number: 15
Enter second number: 3
Result: 15.0 + 3.0 = 18.0

Do you want to perform another calculation? (y/n): y

Select operation:
1. Add
2. Subtract
3. Multiply
4. Divide
5. Exit
Enter your choice (1-5): 2
Enter first number: 20
Enter second number: 4
Result: 20.0 - 4.0 = 16.0

Do you want to perform another calculation? (y/n): n
Thank you for using Calculator App!
```

---

## 🏗️ Architecture & Structure

### Layered Architecture Pattern

The application follows a **4-layer architecture** pattern:

```
┌─────────────────────────────────────┐
│     APPLICATION LAYER (app)         │  ← Entry point & orchestration
├─────────────────────────────────────┤
│     USER INTERFACE LAYER (ui)       │  ← Input/Output handling
├─────────────────────────────────────┤
│     BUSINESS LOGIC LAYER (core)     │  ← Calculations
├─────────────────────────────────────┤
│     DOMAIN MODEL LAYER (domain)     │  ← Enums & Constants
└─────────────────────────────────────┘
```

### Benefits of This Architecture

| Benefit | Description |
|---------|-------------|
| **Separation of Concerns** | Each layer has a specific, focused responsibility |
| **Maintainability** | Changes in one layer don't affect others |
| **Testability** | Each component can be tested independently |
| **Scalability** | Easy to add new features or replace components |
| **Reusability** | Core logic can be used in different contexts (GUI, web, etc.) |

---

## 📦 Package Organization

### Directory Structure

```
src/main/java/com/calculator/
│
├── app/
│   └── CalculatorApp.java
│       ├── Main entry point (main() method)
│       ├── Application orchestration loop
│       └── Coordinates between all layers
│
├── core/
│   └── Calculator.java
│       ├── Pure arithmetic operations
│       ├── No UI or external dependencies
│       └── Business logic only
│
├── ui/
│   └── OperationSelector.java
│       ├── Menu display
│       ├── User input handling
│       └── Input validation
│
└── domain/
    └── CalculatorOperation.java
        ├── Enum of available operations
        ├── Operation symbols & names
        └── Shared across all layers
```

### Package Responsibilities

| Package | Layer | Purpose | Key Classes |
|---------|-------|---------|------------|
| `com.calculator.app` | Application | Entry point, orchestration, error handling | `CalculatorApp` |
| `com.calculator.core` | Business Logic | Pure arithmetic calculations | `Calculator` |
| `com.calculator.ui` | User Interface | Menu display, user input collection | `OperationSelector` |
| `com.calculator.domain` | Domain Model | Operation definitions and constants | `CalculatorOperation` |

---

## 🔧 Code Structure & Components

### 1. **CalculatorApp.java** (Application Layer)

**Responsibilities:**
- Application entry point
- Main event loop orchestration
- Coordinate interaction between layers
- Error handling and user communication
- Resource management (Scanner)

**Key Methods:**

```java
main(String[] args)
  ↓ Creates instance and starts app

orchestration()
  ↓ Main application loop
  ├─ Get operation via UI layer (FIRST)
  ├─ Get num1 from user
  ├─ Get num2 from user
  ├─ Perform calculation via core layer
  ├─ Display result
  ├─ Ask to continue
  └─ Loop or exit

performCalculation(num1, num2, operation)
  ↓ Routes to appropriate calculator method

askToContinue()
  ↓ Prompts user for continuation
```

**Error Handling:**
```java
try {
    // User input and calculations
} catch (ArithmeticException e) {
    // Handle math errors (e.g., division by zero)
} catch (Exception e) {
    // Handle invalid input
    scanner.nextLine(); // Clear input buffer
}
```

---

### 2. **OperationSelector.java** (UI Layer)

**Responsibilities:**
- Display operation menu to user
- Collect and validate user choice
- Handle invalid inputs
- Support graceful exit

**Key Methods:**

```java
getOperation()
  ↓ Main method for operation selection
  ├─ Loop until valid choice
  ├─ Display menu
  ├─ Read user input
  ├─ Validate input (1-5)
  ├─ Return CalculatorOperation enum
  └─ Handle exit (choice 5)

displayOperationMenu()
  ↓ Formats and displays menu options
```

**Menu Selection Logic:**
- 1-4: Returns corresponding operation
- 5: Exits application
- Invalid: Shows error and asks again

---

### 3. **Calculator.java** (Core/Business Logic Layer)

**Responsibilities:**
- Perform arithmetic calculations
- Validate inputs (e.g., division by zero)
- Pure business logic (no UI dependency)

**Key Methods:**

```java
add(num1, num2)
  ↓ Returns: num1 + num2

subtract(num1, num2)
  ↓ Returns: num1 - num2

multiply(num1, num2)
  ↓ Returns: num1 * num2

divide(num1, num2)
  ↓ Validates: num2 ≠ 0
  ↓ Returns: num1 / num2
  ↓ Throws: ArithmeticException if num2 == 0
```

**Example:**
```java
Calculator calc = new Calculator();
double result = calc.add(10, 5);      // Returns 15.0
double result = calc.divide(10, 0);   // Throws ArithmeticException
```

---

### 4. **CalculatorOperation.java** (Domain Layer)

**Responsibilities:**
- Define available operations
- Provide operation metadata (symbol, name)
- Serve as type-safe alternative to strings

**Enum Constants:**

```java
ADD("+", "Add")
SUBTRACT("-", "Subtract")
MULTIPLY("*", "Multiply")
DIVIDE("/", "Divide")
```

**Methods:**

```java
getSymbol()
  ↓ Returns mathematical symbol ("+", "-", "*", "/")

getDisplayName()
  ↓ Returns user-friendly name ("Add", "Subtract", etc.)
```

**Example Usage:**
```java
CalculatorOperation op = CalculatorOperation.ADD;
op.getSymbol();        // Returns "+"
op.getDisplayName();   // Returns "Add"
```

---

## 👥 Class Responsibilities

### Dependency Graph

```
┌──────────────────────────────┐
│    CalculatorApp (app)       │ ← ENTRY POINT
│ - Orchestrates all layers    │
│ - Handles user interaction   │
│ - Manages application flow   │
└────────────┬─────────────────┘
             │
      ┌──────┴───────────┬──────────────────┐
      ▼                  ▼                  ▼
┌──────────────┐  ┌─────────────────┐  ┌──────────────────┐
│ Calculator   │  │OperationSelector│  │CalculatorOperation│
│   (core)     │  │     (ui)        │  │    (domain)      │
├──────────────┤  ├─────────────────┤  ├──────────────────┤
│ - add()      │  │ - getOperation()│  │ - ADD            │
│ - subtract() │  │ - display()     │  │ - SUBTRACT       │
│ - multiply() │  │                 │  │ - MULTIPLY       │
│ - divide()   │  │ Responsibilities│  │ - DIVIDE         │
│              │  │ - Collect input │  │                  │
│Pure logic    │  │ - Validate      │  │Type-safe enums   │
│No UI deps    │  │ - Show menu     │  │No dependencies   │
└──────────────┘  └─────────────────┘  └──────────────────┘
     ↑                     ▲                     ▲
     │                     │                     │
     └─────────────────────┴─────────────────────┘
          Used by CalculatorApp
```

### Import Map

| Class | Imports From | Reason |
|-------|--------------|--------|
| `CalculatorApp` | `Calculator`, `OperationSelector`, `CalculatorOperation` | Orchestrates all layers |
| `OperationSelector` | `CalculatorOperation` | Returns operation enum |
| `Calculator` | (Nothing) | Pure business logic, no dependencies |
| `CalculatorOperation` | (Nothing) | Standalone enum, independent |

---

## 🔄 Data Flow

### Complete Application Flow

```
START
  │
  ▼
main() creates CalculatorApp instance
  │
  ▼
app.orchestration() starts
  │
  ┌─────────────────────────────────────┐
  │   MAIN CALCULATION LOOP             │
  │                                     │
  ├─ Input: Show menu & get operation  │
  │   → OperationSelector.getOperation()
  │   → Show: 1-4 operations + 5 Exit   │
  │   → User selects: 1 (Add)          │
  │   → Returns: CalculatorOperation.ADD
  │                                     │
  ├─ Input: Ask for first number       │
  │   User: 10                         │
  │                                     │
  ├─ Input: Ask for second number      │
  │   User: 5                          │
  │                                     │
  ├─ Calculate: performCalculation()   │
  │   → Switch on operation            │
  │   → Call calculator.add(10, 5)     │
  │   → Returns: 15.0                  │
  │                                     │
  ├─ Display: Show result              │
  │   Output: "Result: 10.0 + 5.0 = 15.0"
  │                                     │
  ├─ Query: Ask to continue?           │
  │   User: y (yes)                    │
  │   → Loop back to choose operation  │
  │                                     │
  │   OR User: n (no)                  │
  │   → Break loop, proceed to cleanup │
  │                                     │
  └─────────────────────────────────────┘
  │
  ▼
Close resources
  │
  ├─ Close scanner
  ├─ Print goodbye message
  │
  ▼
END
```

### State Transitions

```
INITIALIZATION
    ↓
    Create CalculatorApp(Calculator, Scanner)
    ↓
MAIN LOOP (continueCalculation = true)
    ↓
    ├─ Read inputs ──→ Valid? ──→ No ──→ Error message ──→ Clear buffer
    │                           ↓ Yes
    ├─ Get operation ──→ Valid? ──→ No ──→ Show menu again
    │                           ↓ Yes
    ├─ Calculate ────→ No error? ──→ No ──→ Show error message
    │                           ↓ Yes
    ├─ Display result
    │  ↓
    ├─ Ask continue? ──→ Yes ──→ Loop back to Read inputs
    │                ↓ No
    ↓
CLEANUP & EXIT
    ├─ Close scanner
    ├─ Print goodbye
    ↓
END
```

---

## 🎮 How to Use

### Running the Application

```bash
# Navigate to project directory
cd apps-final/calculatorapp

# Build the project
gradle build

# Run the application
gradle run
```

### Interactive Usage Example

```
=== Welcome to Calculator App ===

Select operation:
1. Add
2. Subtract
3. Multiply
4. Divide
5. Exit
Enter your choice (1-5): 3
Enter first number: 100
Enter second number: 25
Result: 100.0 * 25.0 = 2500.0

Do you want to perform another calculation? (y/n): y

Select operation:
1. Add
2. Subtract
3. Multiply
4. Divide
5. Exit
Enter your choice (1-5): 4
Enter first number: 50
Enter second number: 0
Error: Cannot divide by zero!

Do you want to perform another calculation? (y/n): y

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

### Error Handling Examples

**Invalid Number Input:**
```
Enter first number: abc
Invalid input! Please try again.
Enter first number: 10  ← Try again
```

**Invalid Operation Choice:**
```
Enter your choice (1-5): 7
Invalid choice! Please select 1-5.
Enter your choice (1-5): 2  ← Try again
```

**Division by Zero:**
```
Error: Cannot divide by zero!
Do you want to perform another calculation? (y/n): y
```

**Invalid Continue Option:**
```
Do you want to perform another calculation? (y/n): yes
Invalid option! Please enter 'y' or 'n'.
Do you want to perform another calculation? (y/n): y  ← Try again
```

---

## 🎨 Design Patterns Used

### 1. **Layered Architecture Pattern**
Separates concerns into distinct layers:
- **Presentation/UI Layer:** User interaction
- **Application Layer:** Orchestration
- **Business Logic Layer:** Core calculations
- **Domain Layer:** Data models

**Benefit:** Each layer can be modified independently

---

### 2. **Dependency Injection Pattern**
Dependencies are injected via constructor:

```java
// Instead of this (tightly coupled):
public CalculatorApp() {
    this.calculator = new Calculator();
    this.scanner = new Scanner(System.in);
}

// We do this (loosely coupled):
public CalculatorApp(Calculator calculator, Scanner scanner) {
    this.calculator = calculator;
    this.scanner = scanner;
}
```

**Benefit:** Easy to test with mock objects, flexible implementation

---

### 3. **Enum Pattern**
Type-safe alternative to strings:

```java
// Instead of this (error-prone):
String operation = "add";  // Can misspell as "ad" or "Add"
if (operation.equals("add")) { ... }

// We do this (type-safe):
CalculatorOperation op = CalculatorOperation.ADD;
switch (op) {
    case ADD -> { ... }
}
```

**Benefit:** Compiler catches errors, IDE provides autocomplete

---

### 4. **Switch Expression Pattern (Modern Java)**
Concise and expressive operation routing:

```java
// Instead of if-else chains:
if (op.equals("add")) { ... }
else if (op.equals("subtract")) { ... }
else if (op.equals("multiply")) { ... }
else if (op.equals("divide")) { ... }

// We use switch expression:
return switch (calculatorOperation) {
    case ADD -> calculator.add(num1, num2);
    case SUBTRACT -> calculator.subtract(num1, num2);
    case MULTIPLY -> calculator.multiply(num1, num2);
    case DIVIDE -> calculator.divide(num1, num2);
};
```

**Benefit:** More readable, exhaustiveness checking by compiler

---

### 5. **Try-Catch Pattern**
Graceful error handling:

```java
try {
    // User input and calculations
    double num1 = scanner.nextDouble();
} catch (ArithmeticException e) {
    // Handle math errors
} catch (Exception e) {
    // Handle input errors
    scanner.nextLine();  // Clear buffer
}
```

**Benefit:** Application continues running after errors

---

## 📊 Sequence Diagram

```
User    CalculatorApp    OperationSelector    Calculator    CalculatorOperation
│          │                   │                  │                │
├─ Start ──→│                   │                  │                │
│           │                   │                  │                │
│           │ Input num1, num2  │                  │                │
├─ Nums ───→│                   │                  │                │
│           │                   │                  │                │
│           │ getOperation()    │                  │                │
│           ├──────────────────→│                  │                │
│           │                   │ Display menu    │                │
│           │◄─ Choice: 1 ──────┤                  │                │
│           │                   │                  │                │
│           │ performCalculation()                │                │
│           │ (num1, num2, op) ├─────────────────→│                │
│           │                  │                  │ add(10, 5)     │
│           │◄─ Result: 15.0 ──┤                  │                │
│           │                  │                  │                │
│ Display ◄─┤ "Result: 10+5=15"                   │                │
│           │                   │                  │                │
│ Continue? →│                  │                  │                │
│     yes    │ Continue = true   │                  │                │
│           │ (Loop back)       │                  │                │
```

---

## 🔍 Key Concepts Demonstrated

| Concept | Where Used | Purpose |
|---------|-----------|---------|
| **Classes & Objects** | All files | Organize code into reusable units |
| **Packages** | `com.calculator.*` | Organize classes by responsibility |
| **Encapsulation** | `private` fields | Hide internal state |
| **Dependency Injection** | Constructor | Loose coupling |
| **Enums** | `CalculatorOperation` | Type-safe constants |
| **Switch Expressions** | `performCalculation()` | Modern Java syntax |
| **Try-Catch-Finally** | `orchestration()` | Exception handling |
| **While Loops** | `orchestration()` | Repeat until exit condition |
| **Do-While Loops** | `getOperation()` | Validate input |
| **Method Overloading** | N/A | (Not used in this app) |
| **Inheritance** | N/A | (Not needed - good design!) |

---

## 📈 Scalability & Future Enhancements

### Possible Extensions

1. **Add More Operations**
   - Power: `2 ^ 3 = 8`
   - Modulo: `10 % 3 = 1`
   - Square Root: `√16 = 4`

   *Implementation:* Just add new constants to `CalculatorOperation` enum and methods to `Calculator`

2. **Add Different UI Implementations**
   - GUI using Swing or JavaFX
   - Web interface
   - Mobile app

   *Implementation:* Create new `ui` package with alternative `OperationSelector` implementations

3. **Add Calculation History**
   - Track previous calculations
   - Display calculation history
   - Load/save to file

   *Implementation:* Add new `service` package with `HistoryService` class

4. **Add Unit Tests**
   ```
   src/test/java/com/calculator/
   ├── core/
   │   └── CalculatorTest.java
   ├── ui/
   │   └── OperationSelectorTest.java
   └── app/
       └── CalculatorAppTest.java
   ```

---

## ✅ Summary

The Calculator App demonstrates:

✅ **Clean Architecture** - Clear separation of concerns across 4 layers  
✅ **Professional Design Patterns** - Dependency injection, enums, modern Java features  
✅ **Robust Error Handling** - Graceful handling of invalid inputs and math errors  
✅ **Good Practices** - Immutable fields, proper javadoc, meaningful names  
✅ **Maintainability** - Easy to understand, modify, and extend  
✅ **Type Safety** - Using enums instead of strings for operations  

This is a excellent teaching example of how to structure a real-world Java application!

---

## 📝 Notes

- **Java Version:** Java 14+ (uses switch expressions)
- **Build Tool:** Gradle
- **Dependencies:** None (standard library only)
- **Entry Point:** `com.calculator.app.CalculatorApp.main()`
- **Configuration:** `build.gradle.kts` in project root

