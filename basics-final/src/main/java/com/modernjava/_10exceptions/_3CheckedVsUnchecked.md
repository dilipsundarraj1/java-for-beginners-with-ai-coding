# CheckedVsUncheckedDemo.md

## Checked vs Unchecked Exceptions in Java

This file demonstrates the concept of checked and unchecked exceptions in Java, including typical scenarios, how they are handled, and why understanding the difference is important for robust programs. The class provides clear examples of both exception types and explains the fundamental principles of exception handling.

## Prompts for Replication

### Prompt 1: Unchecked Exception Example
**Task**: Demonstrate an unchecked exception (ArrayIndexOutOfBoundsException) and how it is handled.

**Expected Function Signature**: `static void demoUncheckedException()`

**Requirements**:
- Print section header: "--- Unchecked Exception Demo ---"
- Show invalid array index: `int[] arr = {1, 2, 3}; arr[5];`
- Catch and print exception
- Print message from finally block
- Print success message confirming program continues

**Implementation Pattern**:
```java
try {
    int[] arr = {1, 2, 3};
    System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Unchecked Exception caught: " + e);
} finally {
    System.out.println("Finally block for unchecked exception always executes.\n");
}
System.out.println("Program continues after unchecked exception.");
```

---

### Prompt 2: Checked Exception Example
**Task**: Demonstrate a checked exception (IOException) and how it is handled.

**Expected Function Signature**: `static void demoCheckedException()`

**Requirements**:
- Print section header: "--- Checked Exception Demo ---"
- Read input from user
- Force IOException by closing System.in and reading again
- Catch and print exception
- Print message from finally block
- Print success message confirming program continues

**Implementation Pattern**:
```java
try {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your city: ");
    String city = scanner.nextLine();
    System.out.println("You live in: " + city);
    System.in.close();
    System.in.read(); // reading again will throw IOException
} catch (IOException e) {
    System.out.println("Checked Exception caught: " + e);
} finally {
    System.out.println("Finally block for checked exception always executes.\n");
}
System.out.println("Program continues after checked exception.");
```

---

## Key Concepts Explained

### What are Checked and Unchecked Exceptions?
- **Checked Exception**: Must be declared or handled (e.g., IOException, SQLException). Checked at compile time.
- **Unchecked Exception**: Runtime exceptions (e.g., NullPointerException, ArrayIndexOutOfBoundsException). Not required to be handled or declared.

### Why Understand the Difference?
- Ensures proper error handling and program robustness
- Helps in designing APIs and handling resources

### Best Practices
- Handle checked exceptions with try-catch or declare with `throws`
- Anticipate unchecked exceptions and validate inputs
- Use finally blocks for cleanup actions

---

## Summary
This class demonstrates both checked and unchecked exceptions in Java, each with a dedicated method that shows how the exception is thrown, caught, and handled. The examples illustrate best practices for exception handling and confirm that the program continues after each scenario.

---

Next: Learn about Custom Exceptions.
