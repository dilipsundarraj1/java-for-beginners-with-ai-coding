# ExceptionBasics.md

## Exception Basics in Java

This file demonstrates the concept of exceptions in Java, including common types, how to handle them, and why exception handling is important for robust programs. The class provides clear examples of typical exception scenarios and explains the fundamental principles of exception handling.

## Prompts for Replication

### Prompt 1: ArithmeticException - Division by Zero
**Task**: Create a method demonstrating how dividing by zero throws an ArithmeticException.

**Expected Function Signature**: `static void demoArithmeticException()`

**Requirements**:
- Print section header: "Example 1: ArithmeticException (Division by Zero)"
- Show division by zero: `int result = 10 / 0;`
- Catch and print exception
- Print success message confirming program continues

**Implementation Pattern**:
```java
try {
    int result = 10 / 0; // This will cause ArithmeticException
    System.out.println("Result: " + result);
} catch (ArithmeticException e) {
    System.out.println("Caught an exception: " + e);
}
System.out.println("Program continues after exception handling.");
```

---

### Prompt 2: NullPointerException - Accessing Null Reference
**Task**: Create a method showing how accessing a method on a null reference throws a NullPointerException.

**Expected Function Signature**: `static void demoNullPointerException()`

**Requirements**:
- Print section header: "Example 2: NullPointerException (Null Reference Access)"
- Show null reference: `String text = null;`
- Access method: `text.length();`
- Catch and print exception
- Print success message confirming program continues

**Implementation Pattern**:
```java
try {
    String text = null;
    System.out.println(text.length()); // This will cause NullPointerException
} catch (NullPointerException e) {
    System.out.println("Caught a null pointer exception: " + e);
}
System.out.println("Program continues after exception handling.");
```

---

### Prompt 3: ArrayIndexOutOfBoundsException - Invalid Index Access
**Task**: Create a method showing how accessing an invalid index in an array throws an ArrayIndexOutOfBoundsException.

**Expected Function Signature**: `static void demoArrayIndexOutOfBoundsException()`

**Requirements**:
- Print section header: "Example 3: ArrayIndexOutOfBoundsException (Invalid Index Access)"
- Show invalid index: `int[] arr = {1, 2, 3}; arr[5];`
- Catch and print exception
- Print success message confirming program continues

**Implementation Pattern**:
```java
try {
    int[] arr = {1, 2, 3};
    System.out.println(arr[5]); // Invalid index
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Caught array index out of bounds exception: " + e);
}
System.out.println("Program continues after exception handling.");
```

---

### Prompt 4: ClassCastException - Invalid Type Casting
**Task**: Create a method showing how casting an object to an incompatible type throws a ClassCastException.

**Expected Function Signature**: `static void demoClassCastException()`

**Requirements**:
- Print section header: "Example 4: ClassCastException (Invalid Type Casting)"
- Show invalid cast: `Object obj = "Hello"; Integer num = (Integer) obj;`
- Catch and print exception
- Print success message confirming program continues

**Implementation Pattern**:
```java
try {
    Object obj = "Hello";
    Integer num = (Integer) obj; // Invalid cast
    System.out.println(num);
} catch (ClassCastException e) {
    System.out.println("Caught class cast exception: " + e);
}
System.out.println("Program continues after exception handling.");
```

---

### Prompt 5: IllegalArgumentException - Invalid Argument
**Task**: Create a method showing how passing an invalid argument to a method throws an IllegalArgumentException.

**Expected Function Signature**: `static void demoIllegalArgumentException()`

**Requirements**:
- Print section header: "Example 5: IllegalArgumentException (Invalid Argument)"
- Show invalid argument: `printSquareRoot(-4);`
- Catch and print exception
- Print success message confirming program continues

**Implementation Pattern**:
```java
try {
    printSquareRoot(-4); // Invalid argument
} catch (IllegalArgumentException e) {
    System.out.println("Caught illegal argument exception: " + e);
}
System.out.println("Program continues after exception handling.");

private static double printSquareRoot(int num) {
    if (num < 0) {
        throw new IllegalArgumentException("Number must be non-negative");
    }
    double result = Math.sqrt(num);
    System.out.println("Square root: " + result);
    return result;
}
```

---

## Key Concepts Explained

### What is an Exception?
- An event that disrupts the normal flow of a program
- Occurs due to errors like dividing by zero, accessing null references, invalid array indices, or file not found

### Why Exception Handling Exists
- **Robustness**: Prevents program crashes and allows graceful error recovery
- **User Experience**: Provides meaningful error messages and feedback
- **Maintainability**: Centralizes error handling logic

### Important Distinctions
1. **Checked vs Unchecked Exceptions**:
   - Checked: Must be handled or declared (e.g., IOException)
   - Unchecked: Occur at runtime, not required to be handled (e.g., NullPointerException, ArithmeticException)
2. **Try-Catch-Finally**:
   - Use try-catch to handle exceptions
   - Use finally for cleanup actions

### Best Practices
- Always anticipate and handle possible errors
- Use specific exception types for clarity
- Avoid catching generic Exception unless necessary
- Log or display meaningful error messages

## Common Compilation Errors
```java
// This would cause a NullPointerException:
String text = null;
System.out.println(text.length()); // ❌ Throws NullPointerException
```

## Real-World Applications
- Validating user input
- File operations (reading/writing)
- Network communication
- Resource management (closing files, streams)

---

## Summary
This class demonstrates five common Java exceptions, each with a dedicated method that shows how the exception is thrown, caught, and handled. The examples illustrate best practices for exception handling and confirm that the program continues after each exception scenario.

---

Next: Learn about Checked vs Unchecked Exceptions.
