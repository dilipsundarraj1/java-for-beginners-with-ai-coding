# Animal Hierarchy - Understanding Object-Oriented Programming Concepts

<!-- TOC -->
* [Animal Hierarchy - Understanding Object-Oriented Programming Concepts](#animal-hierarchy---understanding-object-oriented-programming-concepts)
    * [Overview](#overview)
    * [Prompts for Replication](#prompts-for-replication)
        * [Prompt 1: Creating the Animal Class](#prompt-1-creating-the-animal-class)
        * [Prompt 2: Creating the Cat Class](#prompt-2-creating-the-cat-class)
        * [Prompt 3: Creating the Dog Class](#prompt-3-creating-the-dog-class)
    * [Key Concepts Covered](#key-concepts-covered)
        * [1. Base Class Design](#1-base-class-design)
        * [2. Inheritance and Polymorphism](#2-inheritance-and-polymorphism)
        * [3. Method Overriding](#3-method-overriding)
    * [Best Practices](#best-practices)
<!-- TOC -->

## Overview
This file introduces the core concepts of Object-Oriented Programming (OOP) in Java through the creation of an animal hierarchy. You'll learn about class design, inheritance, method overriding, and polymorphism by creating a base `Animal` class and two derived classes: `Cat` and `Dog`. Each class demonstrates key OOP principles with specific behaviors and properties.

## Prompts for Replication

### Prompt 1: Creating the Animal Class
**Task**: Create a base class named `Animal` that serves as the parent class for all animal types.

**Expected Class Name**: `Animal.java`

**Requirements**:
- Create a public class named `Animal`
- Add private instance variables:
    - `name` (String)
    - `age` (int)
    - `species` (String)
- Create a constructor that accepts `name`, `age`, and `species` parameters
- Implement getter methods for all instance variables:
    - `getName()`
    - `getAge()`
    - `getSpecies()`
- Create a method `void makeSound()` that prints a generic animal sound
- Create a method `void eat(String food)` that prints eating behavior with the food parameter
- Create a method `void sleep()` that prints sleeping behavior
- Override the `toString()` method to display animal information in a formatted way
- Include appropriate JavaDoc comments for all methods

**Key Concepts**:
- **Class Design**: Organizing related data and behavior
- **Encapsulation**: Using private variables with public getters
- **Abstraction**: Defining common behavior for all animals

---

### Prompt 2: Creating the Cat Class
**Task**: Create a derived class named `Cat` that inherits from the `Animal` class.

**Expected Class Name**: `Cat.java`

**Requirements**:
- Create a public class named `Cat` that extends `Animal`
- Add private instance variable:
    - `independenceLevel` (int, representing 1-10 scale)
- Create a constructor that accepts `name`, `age`, `independenceLevel` parameters
    - Call the parent constructor using `super()` with appropriate species value ("Cat")
- Override the `makeSound()` method to print "Meow! Meow!"
- Override the `eat(String food)` method to print cat-specific eating behavior
- Create a method `void scratch()` that prints scratching behavior
- Create a method `void getIndependenceLevel()` that returns the independence level
- Create a method `boolean isIndependent()` that returns true if independence level > 5
- Override the `toString()` method to include cat-specific information including independence level
- Include appropriate JavaDoc comments for all methods

**Key Concepts**:
- **Inheritance**: Extending the Animal class to reuse functionality
- **Method Overriding**: Providing cat-specific implementations of parent methods
- **Polymorphism**: Different types of animals behaving differently

---

### Prompt 3: Creating the Dog Class
**Task**: Create a derived class named `Dog` that inherits from the `Animal` class.

**Expected Class Name**: `Dog.java`

**Requirements**:
- Create a public class named `Dog` that extends `Animal`
- Add private instance variable:
    - `loyaltyLevel` (int, representing 1-10 scale)
- Create a constructor that accepts `name`, `age`, `loyaltyLevel` parameters
    - Call the parent constructor using `super()` with appropriate species value ("Dog")
- Override the `makeSound()` method to print "Woof! Woof!"
- Override the `eat(String food)` method to print dog-specific eating behavior
- Create a method `void fetch(String item)` that prints fetching behavior with the item parameter
- Create a method `int getLoyaltyLevel()` that returns the loyalty level
- Create a method `boolean isLoyal()` that returns true if loyalty level > 7
- Override the `toString()` method to include dog-specific information including loyalty level
- Include appropriate JavaDoc comments for all methods

**Key Concepts**:
- **Inheritance**: Extending the Animal class to reuse functionality
- **Method Overriding**: Providing dog-specific implementations of parent methods
- **Polymorphism**: Different types of animals behaving differently
- **Specific Behaviors**: Adding unique methods for dog-specific actions

---

## Key Concepts Covered

### 1. Base Class Design

**What you'll learn:**
- How to design a base class that serves as a blueprint for derived classes
- Using instance variables to store object state
- Creating constructors to initialize objects
- Implementing methods that define common behavior

**Code Examples:**
```java
public class Animal {
    private String name;
    private int age;
    private String species;
    
    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }
    
    public String getName() {
        return name;
    }
    
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}
```

**Key Points:**
- **Encapsulation**: Private variables protect data integrity
- **Getters**: Provide controlled access to object data
- **Constructor**: Ensures objects are properly initialized
- **Common behavior**: Methods defined in base class can be inherited

### 2. Inheritance and Polymorphism

**What you'll learn:**
- How to create derived classes that inherit from a base class
- Using `extends` keyword to establish inheritance relationship
- How derived classes inherit all methods and variables from parent
- Benefits of code reuse through inheritance

**Code Examples:**
```java
public class Cat extends Animal {
    private int independenceLevel;
    
    public Cat(String name, int age, int independenceLevel) {
        super(name, age, "Cat");  // Call parent constructor
        this.independenceLevel = independenceLevel;
    }
}

public class Dog extends Animal {
    private int loyaltyLevel;
    
    public Dog(String name, int age, int loyaltyLevel) {
        super(name, age, "Dog");  // Call parent constructor
        this.loyaltyLevel = loyaltyLevel;
    }
}
```

**Key Points:**
- **Inheritance**: `extends` keyword establishes parent-child relationship
- **super()**: Calls parent constructor to initialize inherited variables
- **Code reuse**: Derived classes automatically inherit parent methods
- **Polymorphism**: Parent class reference can hold derived class objects

### 3. Method Overriding

**What you'll learn:**
- How to override parent methods in derived classes
- Providing specialized implementations for subclasses
- Using `@Override` annotation for clarity
- When and why to override methods

**Code Examples:**
```java
// Parent class
public void makeSound() {
    System.out.println("The animal makes a sound");
}

// Cat override
@Override
public void makeSound() {
    System.out.println("Meow! Meow!");
}

// Dog override
@Override
public void makeSound() {
    System.out.println("Woof! Woof!");
}

// Usage demonstrating polymorphism
Animal cat = new Cat("Whiskers", 3, 8);
Animal dog = new Dog("Rex", 5, 9);

cat.makeSound();  // Output: Meow! Meow!
dog.makeSound();  // Output: Woof! Woof!
```

**Key Points:**
- **Method Overriding**: Subclass provides its own implementation of parent method
- **@Override annotation**: Helps catch errors at compile time
- **Polymorphism in action**: Same method name, different behavior based on actual object type
- **Contract**: Overridden method must have same signature as parent method

## Best Practices

1. **Design hierarchy carefully**: Base class should contain common attributes and behaviors
2. **Use meaningful names**: Class names should clearly indicate their purpose and relationships
3. **Keep it simple**: Don't over-engineer; start with what's needed
4. **Document relationships**: Use JavaDoc to explain inheritance relationships
5. **Test polymorphism**: Create instances of derived classes and assign to parent type references
6. **Use @Override annotation**: Helps prevent bugs and makes intent clear
7. **Avoid deep hierarchies**: Too many levels of inheritance makes code hard to maintain
8. **Consider composition**: Sometimes composition is better than inheritance for flexibility

