# AccessModifierDemo.java - Guided Prompts

This markdown file provides a step-by-step prompt for each object creation and access scenario in the `AccessModifierDemo.java` class. Use these prompts to guide learners through the concept of Java access modifiers.

---

## 1. Public Access Modifier

**Prompt:**

- Create an object of `PublicExample`.
- Try to access its public field and call its public method.
- What do you observe? Are both accessible?

```java
PublicExample pub = new PublicExample();
System.out.println(pub.publicField); // Accessible
pub.publicMethod(); // Accessible
```

---

## 2. Protected Access Modifier

**Prompt:**

- Create an object of `ProtectedExample`.
- Try to access its protected field and call its protected method.
- What do you observe? Are both accessible in the same package?

```java
ProtectedExample prot = new ProtectedExample();
System.out.println(prot.protectedField); // Accessible in same package
prot.protectedMethod(); // Accessible in same package
```

---

## 3. Default (Package-Private) Access Modifier

**Prompt:**

- Create an object of `DefaultExample`.
- Try to access its default field and call its default method.
- What do you observe? Are both accessible in the same package?

```java
DefaultExample def = new DefaultExample();
System.out.println(def.defaultField); // Accessible in same package
def.defaultMethod(); // Accessible in same package
```

---

## 4. Private Access Modifier

**Prompt:**

- Create an object of `PrivateExample`.
- Try to access its private field and call its private method directly. What happens?
- Now, call the public method `showPrivateAccess()` and observe the result.

```java
PrivateExample priv = new PrivateExample();
// System.out.println(priv.privateField); // Not accessible
// priv.privateMethod(); // Not accessible
priv.showPrivateAccess(); // Accesses private members internally
```

---

## Summary

- Which access modifiers allow access from the same package?
- Which restrict access to within the class only?
- Try moving the object creation and access code to a different package and observe what changes.

