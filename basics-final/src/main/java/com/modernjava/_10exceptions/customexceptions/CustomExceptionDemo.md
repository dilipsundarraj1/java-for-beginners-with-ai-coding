# CustomExceptionDemo.md

## Custom Exceptions in Java

### Why Custom Exceptions?
- Sometimes, built-in exceptions are not enough.
- You can create your own exception classes for specific error cases.

### Example
```java
class InvalidUserException extends Exception {
    public InvalidUserException(String message) {
        super(message);
    }
}

static void checkUser(String username) throws InvalidUserException {
    if ("guest".equals(username)) {
        throw new InvalidUserException("Guest users are not allowed.");
    }
    System.out.println("Welcome, " + username);
}

try {
    checkUser("guest");
} catch (InvalidUserException e) {
    System.out.println("Custom exception caught: " + e.getMessage());
}
```

### Output
```
--- Custom Exception Demo ---
Custom exception caught: Guest users are not allowed.
```

### Key Points
- Custom exceptions make your code more readable and maintainable.
- Use them for domain-specific error handling.

---

Next: See Real-World Exception Handling Examples.

