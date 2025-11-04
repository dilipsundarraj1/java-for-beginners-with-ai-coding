<!-- TOC -->
* [While and Do-While Loop Examples](#while-and-do-while-loop-examples)
  * [Overview](#overview)
  * [Prompts for Replication](#prompts-for-replication)
    * [Prompt 1: Basic While Loop](#prompt-1-basic-while-loop)
    * [Prompt 2: Basic Do-While Loop](#prompt-2-basic-do-while-loop)
    * [Prompt 3: While Loop Seat Booking System](#prompt-3-while-loop-seat-booking-system)
    * [Prompt 4: Do-While Loop Seat Booking System](#prompt-4-do-while-loop-seat-booking-system)
    * [Prompt 5: Main Method Integration](#prompt-5-main-method-integration)
  * [Basic Loop Examples](#basic-loop-examples)
    * [While Loop](#while-loop)
    * [Do-While Loop](#do-while-loop)
  * [Real-World Applications: Seat Booking Systems](#real-world-applications-seat-booking-systems)
    * [While Loop - Continuous Booking Until Sold Out](#while-loop---continuous-booking-until-sold-out)
    * [Do-While Loop - User-Controlled Booking](#do-while-loop---user-controlled-booking)
  * [How to Replicate](#how-to-replicate)
  * [Expected Output](#expected-output)
    * [Basic Loops Output:](#basic-loops-output)
    * [Seat Booking Systems Output:](#seat-booking-systems-output)
  * [Key Differences](#key-differences)
    * [Basic Loops:](#basic-loops)
    * [Seat Booking Systems:](#seat-booking-systems)
  * [Running the Code](#running-the-code)
  * [Practical Applications](#practical-applications)
<!-- /TOC -->
# While and Do-While Loop Examples

This document provides examples of different loop types in Java: for loop, while loop, and do-while loop, including practical real-world applications with seat booking systems.

## Overview

Loops are used to execute a block of code repeatedly. Java provides three main types of loops:
- **For loop**: Best when you know the number of iterations in advance
- **While loop**: Best when the condition is checked before entering the loop
- **Do-while loop**: Best when you want to execute the loop body at least once

## Prompts for Replication

### Prompt 1: Basic While Loop
**Task**: Create a function that demonstrates a basic while loop that iterates 5 times and prints the iteration number.

**Expected Function Signature**: `public static void basicWhileLoop()`

**Requirements**:
- Initialize `int i = 0` before the loop
- Use while condition `i < 5`
- Print "While Iteration: " followed by the current value of i
- Don't forget to increment `i++` inside the loop body

---

### Prompt 2: Basic Do-While Loop
**Task**: Create a function that demonstrates a basic do-while loop equivalent to the while loop above.

**Expected Function Signature**: `public static void basicDoWhileLoop()`

**Requirements**:
- Initialize `int i = 0` before the loop
- Use do-while structure that executes the body first, then checks condition
- Print "Do-While Iteration: " followed by the current value of i
- Increment `i++` inside the loop body
- Loop while condition is `i < 5`

---

### Prompt 3: While Loop Seat Booking System
**Task**: Create a cinema seat booking system using a while loop that continues until all seats are sold.

**Expected Function Signature**: `public static void checkAvailableSeatsLogic()`

**Requirements**:
- Use Scanner for user input
- Initialize `availableSeats = 5`
- Print welcome message with available seats
- Use while loop that continues while `availableSeats > 0`
- Prompt user: "How many tickets would you like to buy?"
- Validate input:
  - If requested <= 0: print "Please enter at least 1." and continue
  - If requested > availableSeats: print "Only X left. Try a smaller number." and continue
- On valid input: subtract from availableSeats and show purchase confirmation
- When sold out: print "Sorry, sold out!"
- Close the Scanner

---

### Prompt 4: Do-While Loop Seat Booking System
**Task**: Create a user-controlled cinema seat booking system using a do-while loop where users decide when to stop.

**Expected Function Signature**: `public static void doWhileSeatBooking()`

**Requirements**:
- Use Scanner for user input
- Initialize `availableSeats = 3` and `String choice`
- Use do-while loop structure
- Inside the loop:
  - Print current seats left
  - Check if availableSeats == 0, if so print "Sold out. Come back later!" and break
  - Prompt: "How many tickets?"
  - Validate input: if req <= 0 OR req > availableSeats, print "Invalid amount. Try again next time."
  - On valid input: subtract from availableSeats and show purchase confirmation
  - Ask: "Would you like to buy again? (y/n):"
  - Read and process user choice (trim and lowercase)
- Continue while choice equals "y"
- Print "Thanks for visiting CineMax!" at the end
- Close the Scanner

---

### Prompt 5: Main Method Integration
**Task**: Create a main method that demonstrates all the loop examples with clear section headers.

**Expected Function Signature**: `public static void main(String[] args)`

**Requirements**:
- Call each method with descriptive headers:
  - "=== While Loop Demo ==="
  - "\n=== Do-While Loop Demo ==="
  - "\n=== While Seat Booking System Demo ==="
  - "\n=== Do-While Seat Booking System Demo ==="
- Add appropriate spacing between sections

## Basic Loop Examples

### While Loop
```java
public static void basicWhileLoop() {
    // Basic while loop
    int i = 0;
    while (i < 5) {
        System.out.println("While Iteration: " + i);
        i++;
    }
}
```

### Do-While Loop
```java
public static void basicDoWhileLoop() {
    // Basic do-while loop
    int i = 0;
    do {
        System.out.println("Do-While Iteration: " + i);
        i++;
    } while (i < 5);
}
```

## Real-World Applications: Seat Booking Systems

### While Loop - Continuous Booking Until Sold Out
```java
public static void checkAvailableSeatsLogic() {
    Scanner sc = new Scanner(System.in);

    int availableSeats = 5; // small screen :)
    System.out.println("Welcome to CineMax! Seats available: " + availableSeats);

    while (availableSeats > 0) {
        System.out.print("How many tickets would you like to buy? ");
        int requested = sc.nextInt();

        if (requested <= 0) {
            System.out.println("Please enter at least 1.");
            continue; // re-ask in the same loop
        }

        if (requested > availableSeats) {
            System.out.println("Only " + availableSeats + " left. Try a smaller number.");
            continue;
        }

        availableSeats -= requested;
        System.out.println("Purchased " + requested + " ticket(s). Remaining: " + availableSeats);
    }

    System.out.println("Sorry, sold out!");
    sc.close();
}
```

### Do-While Loop - User-Controlled Booking
```java
public static void doWhileSeatBooking() {
    Scanner sc = new Scanner(System.in);

    int availableSeats = 3;
    String choice;

    do {
        System.out.println("\nSeats left: " + availableSeats);
        if (availableSeats == 0) {
            System.out.println("Sold out. Come back later!");
            break;
        }

        System.out.print("How many tickets? ");
        int req = sc.nextInt();

        if (req <= 0 || req > availableSeats) {
            System.out.println("Invalid amount. Try again next time.");
        } else {
            availableSeats -= req;
            System.out.println("Purchased " + req + ". Remaining: " + availableSeats);
        }

        System.out.print("Would you like to buy again? (y/n): ");
        choice = sc.next().trim().toLowerCase();
    } while (choice.equals("y"));

    System.out.println("Thanks for visiting CineMax!");
    sc.close();
}
```

## How to Replicate

1. **Create the Java file**: Create a new file named `WhileDemo.java` in the package `com.modernjava._4controlstatements._while`

2. **Add the package declaration and imports**:
   ```java
   package com.modernjava._4controlstatements._while;
   import java.util.Scanner;
   ```

3. **Create the class**:
   ```java
   public class WhileDemo {
       // Methods will go here
   }
   ```

4. **Add all five methods**: 
   - `basicForLoop()` - Simple for loop demonstration
   - `basicWhileLoop()` - Simple while loop demonstration  
   - `basicDoWhileLoop()` - Simple do-while loop demonstration
   - `checkAvailableSeatsLogic()` - While loop seat booking system
   - `doWhileSeatBooking()` - Do-while loop seat booking system

5. **Add a main method** to test the loops:
   ```java
   public static void main(String[] args) {
       System.out.println("=== While Loop Demo ===");
       basicWhileLoop();
       
       System.out.println("\n=== Do-While Loop Demo ===");
       basicDoWhileLoop();
       
       System.out.println("\n=== While Seat Booking System Demo ===");
       checkAvailableSeatsLogic();

       System.out.println("\n=== Do-While Seat Booking System Demo ===");
       doWhileSeatBooking();
   }
   ```

## Expected Output

### Basic Loops Output:
```
=== While Loop Demo ===
While Iteration: 0
While Iteration: 1
While Iteration: 2
While Iteration: 3
While Iteration: 4

=== Do-While Loop Demo ===
Do-While Iteration: 0
Do-While Iteration: 1
Do-While Iteration: 2
Do-While Iteration: 3
Do-While Iteration: 4
```

### Seat Booking Systems Output:

**While Loop Version** (runs until sold out):
```
=== While Seat Booking System Demo ===
Welcome to CineMax! Seats available: 5
How many tickets would you like to buy? 2
Purchased 2 ticket(s). Remaining: 3
How many tickets would you like to buy? 3
Purchased 3 ticket(s). Remaining: 0
Sorry, sold out!
```

**Do-While Loop Version** (user controls when to stop):
```
=== Do-While Seat Booking System Demo ===

Seats left: 3
How many tickets? 1
Purchased 1. Remaining: 2
Would you like to buy again? (y/n): y

Seats left: 2
How many tickets? 2
Purchased 2. Remaining: 0
Would you like to buy again? (y/n): n
Thanks for visiting CineMax!
```

## Key Differences

### Basic Loops:
- **For loop**: Initialization, condition, and increment are all in one line
- **While loop**: Condition is checked before entering the loop; may not execute if condition is false initially
- **Do-while loop**: Condition is checked after executing the loop body; always executes at least once

### Seat Booking Systems:
- **While Loop Version (`checkAvailableSeatsLogic`)**:
  - Continues automatically until seats run out
  - Uses `continue` statements for input validation and re-prompting
  - More persistent - keeps asking until valid input or sold out
  - Better for scenarios where you want to ensure all inventory is sold

- **Do-While Loop Version (`doWhileSeatBooking`)**:
  - Always executes at least once
  - User controls when to stop via "y/n" prompt
  - Handles invalid input with a message but doesn't re-prompt
  - Better for user-friendly applications where customers control their experience
  - Uses `break` statement to exit when sold out

## Running the Code

To compile and run:
```bash
javac WhileDemo.java
java WhileDemo
```

Or if using an IDE, simply run the `main` method.

## Practical Applications

- **While loops**: Input validation, reading files until EOF, processing queues
- **Do-while loops**: Menu systems, game loops, user confirmation dialogs
- **Both**: Any scenario where you need to repeat actions based on conditions or user input
