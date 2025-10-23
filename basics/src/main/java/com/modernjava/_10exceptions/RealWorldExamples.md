# RealWorldExamples.md

## Real-World Exception Handling in Java

### Example 1: File Reading
```java
try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
    String line = br.readLine();
    System.out.println("File content: " + line);
} catch (IOException e) {
    System.out.println("File error: " + e.getMessage());
}
```
- Handles missing file or read errors gracefully.

### Example 2: User Input Validation
```java
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
try {
    int num = Integer.parseInt(scanner.nextLine());
    System.out.println("You entered: " + num);
} catch (NumberFormatException e) {
    System.out.println("Invalid number entered.");
}
```
- Prevents program crash on invalid input.

### Output (Sample)
```
--- Real-World Exception Handling Examples ---
File error: data.txt (No such file or directory)
Enter a number: abc
Invalid number entered.
```

### Key Points
- Exception handling is essential for robust, user-friendly programs.
- Always anticipate and handle possible errors in real-world scenarios.

---

End of Exceptions Topic Lectures.

