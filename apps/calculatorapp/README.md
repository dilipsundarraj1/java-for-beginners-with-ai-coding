# 🧮 Calculator App

A professional, well-structured command-line calculator application demonstrating modern Java architecture patterns and best practices.

## 🎯 Quick Start

### Build & Run

```bash
# Build the project
gradle build

# Run the application
gradle run
```

### Usage

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

## 📁 Project Structure

```
calculatorapp/
├── src/main/java/com/calculator/
│   ├── app/                    # Application Layer
│   │   └── CalculatorApp.java
│   ├── core/                   # Business Logic Layer
│   │   └── Calculator.java
│   ├── ui/                     # User Interface Layer
│   │   └── OperationSelector.java
│   └── domain/                 # Domain Model Layer
│       └── CalculatorOperation.java
├── build.gradle.kts
└── CALCULATOR_APP_DOCUMENTATION.md
```

## 🏗️ Architecture

The application follows a **4-layer architecture pattern**:

```
┌─────────────────────────────────────┐
│   APPLICATION LAYER (app)           │  ← Entry point & orchestration
├─────────────────────────────────────┤
│   USER INTERFACE LAYER (ui)         │  ← Input/Output handling
├─────────────────────────────────────┤
│   BUSINESS LOGIC LAYER (core)       │  ← Calculations
├─────────────────────────────────────┤
│   DOMAIN MODEL LAYER (domain)       │  ← Enums & Constants
└─────────────────────────────────────┘
```

## 🔧 Key Features

✅ **Arithmetic Operations**
- Addition, Subtraction, Multiplication, Division
- Division by zero protection

✅ **User-Friendly Interface**
- Menu-driven operation selection
- Input validation and error handling
- Multiple calculation support

✅ **Professional Architecture**
- Clean separation of concerns
- Dependency injection pattern
- Type-safe operations (enums)
- Modern Java features (switch expressions)

## 📚 Documentation

For detailed documentation, see: **[CALCULATOR_APP_DOCUMENTATION.md](./CALCULATOR_APP_DOCUMENTATION.md)**

This comprehensive guide includes:
- Application overview
- Architecture explanation
- Component responsibilities
- Data flow diagrams
- Design patterns used
- Usage examples
- Future enhancement ideas

## 🎓 Learning Objectives

This project demonstrates:

- **Architecture Patterns:** Layered architecture
- **Design Patterns:** Dependency injection, enum pattern, switch expressions
- **Java Concepts:** Packages, classes, enums, exception handling
- **Code Organization:** Package structure, separation of concerns
- **Best Practices:** Javadoc, immutability, error handling

## 🛠️ Technologies

- **Language:** Java 25+
- **Build Tool:** Gradle
- **Dependencies:** None (standard library only)
- **IDE:** JetBrains IntelliJ IDEA (or any Java IDE)

## 📋 Package Overview

| Package | Purpose | Main Class |
|---------|---------|-----------|
| `com.calculator.app` | Entry point & orchestration | `CalculatorApp` |
| `com.calculator.core` | Business logic & calculations | `Calculator` |
| `com.calculator.ui` | User input & menu handling | `OperationSelector` |
| `com.calculator.domain` | Domain models & enums | `CalculatorOperation` |

## 🚀 Running the Application

```bash
# Terminal/Command Line
cd calculatorapp
gradle run

# Or directly with Java
java -cp "build/classes/java/main" com.calculator.app.CalculatorApp
```

## 🔄 Application Flow

```
1. Start Application (main)
   ↓
2. Display Welcome Message
   ↓
3. Enter Main Loop
   ├─ Get first number
   ├─ Get second number
   ├─ Show operation menu
   ├─ Perform calculation
   ├─ Display result
   ├─ Ask to continue
   └─ Loop or exit
   ↓
4. Close Resources & Exit
```

## 🎯 Design Patterns

### 1. Layered Architecture
Separation of concerns into distinct layers for maintainability.

### 2. Dependency Injection
Constructor-based injection for loose coupling and testability.

### 3. Enum Pattern
Type-safe alternative to string constants.

### 4. Switch Expressions
Modern Java 14+ syntax for cleaner code.

### 5. Exception Handling
Graceful error handling with recovery mechanisms.

## 📊 Component Interaction

```
CalculatorApp (Orchestration)
    │
    ├─→ OperationSelector (Get user choice)
    │
    ├─→ Calculator (Perform calculation)
    │
    └─→ CalculatorOperation (Operation metadata)
```

## ✅ Error Handling

The application handles:
- ✅ Invalid number inputs
- ✅ Invalid operation choices
- ✅ Division by zero
- ✅ Scanner input buffer clearing

## 🔮 Future Enhancements

Possible additions:
- Additional operations (power, modulo, square root)
- Calculation history
- Alternative UI (GUI, web, mobile)
- Unit tests
- Configuration file support

## 📝 Code Quality

- ✅ Comprehensive Javadoc comments
- ✅ Clean, readable code
- ✅ Proper naming conventions
- ✅ DRY (Don't Repeat Yourself) principle
- ✅ SOLID principles
- ✅ No hardcoded strings

## 🤝 Contributing

To extend this application:

1. **Add New Operation:**
   - Add to `CalculatorOperation` enum
   - Add method to `Calculator` class
   - Update `performCalculation()` switch

2. **Change UI:**
   - Create alternative `OperationSelector` implementation
   - Implement same interface pattern

3. **Add Features:**
   - Create new packages under `com.calculator`
   - Follow the same architecture pattern

## 📚 References

- [Java Documentation](https://docs.oracle.com/javase/)
- [Effective Java](https://www.oreilly.com/library/view/effective-java-3rd/9780134685991/)
- [Clean Architecture](https://www.amazon.com/Clean-Architecture-Craftsmans-Software-Structure/dp/0134494164/)

## 📄 License

This is an educational project for learning Java best practices.

---

**Happy Calculating! 🧮**

For detailed information, see [CALCULATOR_APP_DOCUMENTATION.md](./CALCULATOR_APP_DOCUMENTATION.md)

