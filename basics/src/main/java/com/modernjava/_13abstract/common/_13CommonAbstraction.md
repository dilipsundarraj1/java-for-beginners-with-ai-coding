# Common Abstraction Example

This lecture demonstrates the concept of abstraction and interface conflict resolution in Java using a simple printing scenario. Each section introduces a new file and concept, allowing for incremental explanation and discussion.

---

## 1. PrintableA.java
**Prompt:**

Create an interface named `PrintableA` with:
- A default method: `void info()` that prints "PrintableA info".

---

## 2. PrintableB.java
**Prompt:**

Create an interface named `PrintableB` with:
- A default method: `void info()` that prints "PrintableB info".

---

## 3. DualPrintable.java
**Prompt:**

Create a class named `DualPrintable` that implements both `PrintableA` and `PrintableB`.
- Override the `info()` method to resolve the conflict between the two interfaces.
- In the overridden method, print a custom message, call one of the super interface methods (e.g., `PrintableA.super.info()`), and indicate that the conflict has been resolved.

---

## 4. Demo: DualPrintable in Action
**Prompt:**

Create a `main` method in `DualPrintable` that:
- Instantiates a `DualPrintable` object.
- Calls its `info()` method to demonstrate interface conflict resolution.

---

Use these prompts to guide your lecture, introducing each file and concept step by step for a clear and incremental explanation of interface abstraction and conflict resolution in Java.

