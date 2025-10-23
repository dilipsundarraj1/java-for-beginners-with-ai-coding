# StackOverflowSimulationDemo.md

## Simulating StackOverflowError in Java

This file demonstrates the concept of StackOverflowError in Java, including typical scenarios, how it can be triggered, and how to handle such errors gracefully. The class provides a clear example of infinite recursion and explains the fundamental principles of error handling for JVM stack issues.

## Prompts for Replication
---

### Prompt 1: Simulate Stack Overflow with Infinite Recursion
**Task**: Demonstrate StackOverflowError by calling a method recursively without a base condition.

**Expected Function Signature**: `static void recursiveCall()`

**Requirements**:
- Print section header: "--- Stack Overflow Demo ---"
- Call a method recursively with no base case
- Catch and print error
- Print message from finally block
- Print success message confirming program continues

**Implementation Pattern**:
```java
try {
    System.out.println("--- Stack Overflow Demo ---");
    recursiveCall();
} catch (StackOverflowError e) {
    System.out.println("StackOverflowError caught during recursion: " + e);
} finally {
    System.out.println("Finally block for stack overflow always executes.\n");
}
System.out.println("Program continues after stack overflow.");
```

---

## Key Concepts Explained

### What is StackOverflowError?
- **StackOverflowError**: A runtime error thrown by the JVM when the call stack is exhausted, typically due to deep or infinite recursion.
- Not a subclass of Exception; it is an Error, indicating serious problems that applications should not try to catch under normal circumstances.

### Why Simulate StackOverflowError?
- Helps understand JVM stack limits and error handling
- Useful for testing robustness and recursion management

### Best Practices
- Always ensure recursive methods have a base condition
- Avoid deep recursion unless necessary
- Prefer iteration for large computations when possible

