# TryCatchFinallyDemo.md

## Try-Catch-Finally in Java

This file demonstrates the concept of try-catch-finally blocks in Java, including common scenarios, how the finally block behaves, and why it is important for robust programs. The class provides clear examples of typical try-catch-finally patterns and explains the fundamental principles of exception handling and resource management.

## Prompts for Replication

### Prompt 1: Try-Catch-Finally with Exception
**Task**: Demonstrate a try-catch-finally block where an exception occurs in the try block.

**Expected Function Signature**: `static void demoTryCatchFinally()`

**Requirements**:
- Print section header: "--- Try-Catch-Finally Demo ---"
- Show division by zero: `int result = 20 / 0;`
- Catch and print exception
- Print message from finally block
- Print success message confirming program continues

**Implementation Pattern**:
```java
try {
    int result = 20 / 0;
    System.out.println("Result: " + result);
} catch (ArithmeticException e) {
    System.out.println("Exception caught: " + e);
} finally {
    System.out.println("Finally block always executes.");
}
System.out.println("Program continues after try-catch-finally.");
```

---

### Prompt 2: Finally with No Exception
**Task**: Demonstrate a try-catch-finally block where no exception occurs in the try block.

**Expected Function Signature**: `static void demoFinallyNoException()`

**Requirements**:
- Print section header: "--- Finally with No Exception Demo ---"
- Show safe division: `int result = 20 / 4;`
- Print result
- Print message from finally block
- Print success message confirming program continues

**Implementation Pattern**:
```java
try {
    int result = 20 / 4;
    System.out.println("Result: " + result);
} catch (ArithmeticException e) {
    System.out.println("Exception caught: " + e);
} finally {
    System.out.println("Finally block always executes (no exception).\n");
}
System.out.println("Program continues after try-catch-finally.");
```

---

### Prompt 3: Finally with Return Statement
**Task**: Demonstrate a try-catch-finally block where the try block returns a value, but the finally block still executes.

**Expected Function Signature**: `static void demoFinallyWithReturn()`

**Requirements**:
- Print section header: "--- Finally with Return Statement Demo ---"
- Return from try block
- Print message from finally block
- Print returned value
- Print success message confirming program continues

**Implementation Pattern**:
```java
static int getValueWithFinally() {
    try {
        System.out.println("In try block, returning 42.");
        return 42;
    } finally {
        System.out.println("Finally block executes even after return statement.\n");
    }
}

int value = getValueWithFinally();
System.out.println("Returned value: " + value);
System.out.println("Program continues after try-catch-finally.");
```

---

## Key Concepts Explained

### What is Try-Catch-Finally?
- `try`: Contains code that may throw an exception.
- `catch`: Handles the exception if one occurs.
- `finally`: Always executes, used for cleanup actions (e.g., closing files, releasing resources).

### Why Use Finally?
- Ensures important cleanup code runs regardless of exceptions.
- Improves robustness and reliability of programs.

### Best Practices
- Use finally for resource management (closing streams, files, etc.).
- Avoid placing return statements in finally blocks (can override try/catch returns).
- Keep finally blocks concise and focused on cleanup.

---

## Summary
This class demonstrates three common try-catch-finally scenarios in Java, each with a dedicated method that shows how the finally block behaves. The examples illustrate best practices for exception handling and confirm that the program continues after each scenario.

---

Next: Learn about Throwing Exceptions.
