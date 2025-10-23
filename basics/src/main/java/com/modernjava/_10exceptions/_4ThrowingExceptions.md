# ThrowingExceptionsDemo.md

## Throwing Exceptions in Java

This file demonstrates the concept of throwing exceptions in Java, including both the `throw` and `throws` keywords, typical scenarios, how they are handled, and why understanding these mechanisms is important for robust programs. The class provides clear examples of both approaches and explains the fundamental principles of exception handling.

## Prompts for Replication

### Prompt 1: Throw Example (Unchecked Exception)
**Task**: Demonstrate manually throwing an unchecked exception using the `throw` keyword and handling it.

**Expected Function Signature**: `static void demoThrowExample()`

**Requirements**:
- Print section header: "--- Throw Example Demo ---"
- Call a method that throws an unchecked exception: `validateAge(15);`
- Catch and print exception
- Print success message confirming program continues

**Implementation Pattern**:
```java
static void demoThrowExample() {
    System.out.println("--- Throw Example Demo ---");
    try {
        validateAge(15);
    } catch (IllegalArgumentException e) {
        System.out.println("Exception thrown: " + e.getMessage());
    }
}

static void validateAge(int age) {
    if (age < 18) {
        throw new IllegalArgumentException("Age must be 18 or above.");
    }
    System.out.println("Valid age: " + age);
}
System.out.println("Program continues after throw example.");
```

---

### Prompt 2: Throws Example (Checked Exception)
**Task**: Demonstrate declaring a checked exception using the `throws` keyword and handling it.

**Expected Function Signature**: `static void demoThrowsExample() throws IOException`

**Requirements**:
- Print section header: "--- Throws Example Demo ---"
- Declare method with `throws IOException`
- Read input from user using `System.in.read()`
- Catch and print exception in main
- Print success message confirming program continues

**Implementation Pattern**:
```java
static void demoThrowsExample() throws IOException {
    System.out.println("--- Throws Example Demo ---");
    System.out.print("Enter a character: ");
    int ch = System.in.read(); // This can throw IOException
    System.out.println("You entered: " + (char) ch);
}

try {
    demoThrowsExample();
} catch (IOException e) {
    System.out.println("Checked exception thrown using throws: " + e.getMessage());
}
System.out.println("Program continues after throws example.");
```

---

## Key Concepts Explained

### What is `throw`?
- Used to manually throw an exception in code
- Commonly used for input validation and custom error handling

### What is `throws`?
- Used in method signatures to declare that a method may throw a checked exception
- Caller must handle or declare the exception

### Why Use `throw` and `throws`?
- Ensures proper error signaling and handling
- Improves code robustness and clarity

### Best Practices
- Use `throw` for input validation and custom exceptions
- Use `throws` to propagate checked exceptions up the call stack
- Always handle exceptions appropriately

---

## Summary
This class demonstrates both the `throw` and `throws` mechanisms in Java, each with a dedicated method that shows how exceptions are thrown, declared, and handled. The examples illustrate best practices for exception handling and confirm that the program continues after each scenario.

---

Next: Learn about Custom Exceptions and Exception Hierarchy.
