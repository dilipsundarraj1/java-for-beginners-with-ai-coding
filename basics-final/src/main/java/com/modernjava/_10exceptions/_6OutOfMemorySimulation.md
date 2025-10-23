# OutOfMemorySimulationDemo.md

## Simulating OutOfMemoryError in Java

This file demonstrates the concept of OutOfMemoryError in Java, including typical scenarios, how it can be triggered, and how to handle such errors gracefully. The class provides clear examples of memory exhaustion and explains the fundamental principles of error handling for JVM memory issues.

## Prompts for Replication
---

### Prompt 1: Simulate Heap Exhaustion with List
**Task**: Demonstrate OutOfMemoryError by continuously adding objects to a list.

**Expected Function Signature**: `static void demoHeapExhaustion()`

**Requirements**:
- Print section header: "--- Heap Exhaustion Demo ---"
- Create a list and add objects in a loop until OutOfMemoryError occurs
- Add a million integers new int[1_000_000]
- Catch and print error
- Print message from finally block
- Print success message confirming program continues

**Implementation Pattern**:
```java
try {
    List<byte[]> list = new ArrayList<>();
    while (true) {
        list.add(new byte[1024 * 1024]); // Add 1MB blocks
    }
} catch (OutOfMemoryError e) {
    System.out.println("OutOfMemoryError caught during heap exhaustion: " + e);
} finally {
    System.out.println("Finally block for heap exhaustion always executes.\n");
}
System.out.println("Program continues after heap exhaustion.");
```

---

## Key Concepts Explained

### What is OutOfMemoryError?
- **OutOfMemoryError**: A runtime error thrown by the JVM when it cannot allocate memory for an object because the heap is full.
- Not a subclass of Exception; it is an Error, indicating serious problems that applications should not try to catch under normal circumstances.

### Why Simulate OutOfMemoryError?
- Helps understand JVM memory limits and error handling
- Useful for testing robustness and resource management

### Best Practices
- Avoid catching Errors unless for logging or cleanup
- Monitor memory usage and optimize data structures
- Use finally blocks for cleanup actions

---

## Summary
This class demonstrates OutOfMemoryError in Java, with dedicated methods that show how the error can be triggered and handled. The examples illustrate best practices for error handling and confirm that the program continues after each scenario.

---

Next: Learn about StackOverflowError simulation.

