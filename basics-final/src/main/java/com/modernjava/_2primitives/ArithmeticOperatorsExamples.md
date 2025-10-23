# ArithmeticOperatorsExamples.java - Understanding Arithmetic Operators

<!-- TOC -->
* [ArithmeticOperatorsExamples.java - Understanding Arithmetic Operators](#arithmeticoperatorsexamplesjava---understanding-arithmetic-operators)
  * [Overview](#overview)
  * [Prompts for Replication](#prompts-for-replication)
    * [Prompt 1: Addition Operator (+)](#prompt-1-addition-operator-)
    * [Prompt 2: Subtraction Operator (-)](#prompt-2-subtraction-operator--)
    * [Prompt 3: Multiplication Operator (*)](#prompt-3-multiplication-operator-)
    * [Prompt 4: Division Operator (/)](#prompt-4-division-operator-)
    * [Prompt 5: Modulus Operator (%)](#prompt-5-modulus-operator-)
    * [Prompt 6: Operator Precedence](#prompt-6-operator-precedence)
    * [Prompt 7: Increment Operators (++)](#prompt-7-increment-operators-)
    * [Prompt 8: Decrement Operators (--)](#prompt-8-decrement-operators---)
    * [Prompt 9: Compound Assignment Operators](#prompt-9-compound-assignment-operators)
<!-- TOC -->

## Overview
This file demonstrates arithmetic operators in Java. It covers basic arithmetic operations (addition, subtraction, multiplication, division), modulus operator, increment and decrement operators, operator precedence, compound assignment operators, and practical real-world examples.

## Prompts for Replication

### Prompt 1: Addition Operator (+)
**Task**: Create a section that demonstrates the addition operator with basic and real-world examples.

**Expected Code Structure**: Variable declarations and print statements in main method

**Requirements**:
- Print section header: "=== ARITHMETIC OPERATORS IN JAVA ===\n"
- Print subsection: "➕ ADDITION OPERATOR (+)"
- Print divider: "--------------------"
- Create int variables `a` = 15, `b` = 7
- Calculate sum: `sum` = a + b
- Print basic addition result
- Create double variables for shopping cart: item1 = 12.99, item2 = 8.50, item3 = 15.75
- Calculate cartTotal
- Print shopping cart calculation

**Exact Code to Implement**:
```java
System.out.println("=== ARITHMETIC OPERATORS IN JAVA ===\n");

// ===== ADDITION OPERATOR (+) =====
System.out.println("➕ ADDITION OPERATOR (+)");
System.out.println("--------------------");

// Basic addition examples
int a = 15;
int b = 7;
int sum = a + b;
System.out.println("Basic addition: " + a + " + " + b + " = " + sum);

// Real-world example: Shopping cart calculation
double item1 = 12.99;
double item2 = 8.50;
double item3 = 15.75;
double cartTotal = item1 + item2 + item3;
System.out.println("Shopping cart total: $" + item1 + " + $" + item2 + " + $" + item3 + " = $" + cartTotal);
```

**Key Points**:
- Addition operator (+) adds two operands
- Works with all numeric types: int, long, float, double, byte, short
- Result type is promoted to larger type when mixing types
- Commonly used for: totals, sums, accumulations, counters
- Real-world uses: shopping carts, budgets, scores, distances

**Expected Output**:
```
=== ARITHMETIC OPERATORS IN JAVA ===

➕ ADDITION OPERATOR (+)
--------------------
Basic addition: 15 + 7 = 22
Shopping cart total: $12.99 + $8.5 + $15.75 = $37.24
```

---

### Prompt 2: Subtraction Operator (-)
**Task**: Create a section demonstrating the subtraction operator with practical examples.

**Expected Code Structure**: Variable declarations and print statements

**Requirements**:
- Print subsection header: "➖ SUBTRACTION OPERATOR (-)"
- Print divider: "------------------------"
- Create int variables: total = 100, spent = 35
- Calculate remaining = total - spent
- Print money remaining calculation
- Create double variables: bankBalance = 1500.75, withdrawal = 200.25
- Calculate newBalance
- Print withdrawal calculation

**Exact Code to Implement**:
```java
// ===== SUBTRACTION OPERATOR (-) =====
System.out.println("➖ SUBTRACTION OPERATOR (-)");
System.out.println("------------------------");

// Basic subtraction
int total = 100;
int spent = 35;
int remaining = total - spent;
System.out.println("Money remaining: $" + total + " - $" + spent + " = $" + remaining);

double bankBalance = 1500.75;
double withdrawal = 200.25;
double newBalance = bankBalance - withdrawal;
System.out.println("After withdrawal: $" + bankBalance + " - $" + withdrawal + " = $" + newBalance);
```

**Key Points**:
- Subtraction operator (-) subtracts the second operand from the first
- Works with all numeric types
- Order matters: a - b ≠ b - a
- Commonly used for: differences, remainders, reductions, comparisons
- Real-world uses: account balances, inventory, age calculations, expense tracking

**Expected Output**:
```
➖ SUBTRACTION OPERATOR (-)
------------------------
Money remaining: $100 - $35 = $65
After withdrawal: $1500.75 - $200.25 = $1300.5
```

---

### Prompt 3: Multiplication Operator (*)
**Task**: Create a section demonstrating the multiplication operator with practical calculations.

**Expected Code Structure**: Variable declarations and print statements

**Requirements**:
- Print subsection header: "✖️ MULTIPLICATION OPERATOR (*)"
- Print divider: "----------------------------"
- Create int variables: itemPrice = 12, quantity = 5
- Calculate totalCost = itemPrice * quantity
- Print total cost calculation
- Create double hourlyRate = 25.50, int hoursWorked = 8
- Calculate dailyPay
- Print salary calculation

**Exact Code to Implement**:
```java
// ===== MULTIPLICATION OPERATOR (*) =====
System.out.println("✖️ MULTIPLICATION OPERATOR (*)");
System.out.println("----------------------------");

// Basic multiplication
int itemPrice = 12;
int quantity = 5;
int totalCost = itemPrice * quantity;
System.out.println("Total cost: $" + itemPrice + " × " + quantity + " = $" + totalCost);

// Salary calculation
double hourlyRate = 25.50;
int hoursWorked = 8;
double dailyPay = hourlyRate * hoursWorked;
System.out.println("Daily pay: $" + hourlyRate + "/hr × " + hoursWorked + " hrs = $" + dailyPay);
```

**Key Points**:
- Multiplication operator (*) multiplies two operands
- Works with all numeric types
- Order doesn't matter: a * b = b * a (commutative)
- Result can be larger than operands (potential overflow)
- Commonly used for: scaling, area calculations, unit conversions
- Real-world uses: price × quantity, salary calculations, recipe scaling, area/volume

**Expected Output**:
```
✖️ MULTIPLICATION OPERATOR (*)
----------------------------
Total cost: $12 × 5 = $60
Daily pay: $25.5/hr × 8 hrs = $204.0
```

---

### Prompt 4: Division Operator (/)
**Task**: Create a section demonstrating division with focus on integer vs floating-point division.

**Expected Code Structure**: Variable declarations and print statements

**Requirements**:
- Print subsection header: "➗ DIVISION OPERATOR (/)"
- Print divider: "---------------------"
- Create int variables: totalAmount = 60, people = 4
- Calculate amountPerPerson (integer division)
- Print split bill calculation
- Create int variables: score1 = 85, score2 = 92, score3 = 78
- Calculate average using division by 3.0 (floating-point)
- Print average score calculation

**Exact Code to Implement**:
```java
// ===== DIVISION OPERATOR (/) =====
System.out.println("➗ DIVISION OPERATOR (/)");
System.out.println("---------------------");

// Integer division (truncates decimal part)
int totalAmount = 60;
int people = 4;
int amountPerPerson = totalAmount / people;
System.out.println("Split bill (integer): $" + totalAmount + " ÷ " + people + " people = $" + amountPerPerson + " each");

// Average calculation
int score1 = 85;
int score2 = 92;
int score3 = 78;
double average = (score1 + score2 + score3) / 3.0;
System.out.println("Average score: (" + score1 + " + " + score2 + " + " + score3 + ") ÷ 3 = " + average);
```

**Key Points**:
- Division operator (/) divides first operand by second
- **Integer division**: truncates decimal (17 / 5 = 3, not 3.4)
- **Floating-point division**: keeps decimal (17.0 / 5.0 = 3.4)
- At least one operand must be floating-point for decimal result
- Division by zero causes ArithmeticException (runtime error)
- Commonly used for: averages, rates, splits, ratios
- Real-world uses: splitting costs, calculating speeds, finding averages

**Expected Output**:
```
➗ DIVISION OPERATOR (/)
---------------------
Split bill (integer): $60 ÷ 4 people = $15 each
Average score: (85 + 92 + 78) ÷ 3 = 85.0
```

---

### Prompt 5: Modulus Operator (%)
**Task**: Create a section demonstrating the modulus operator for remainder calculations.

**Expected Code Structure**: Variable declarations with if statements and print statements

**Requirements**:
- Print subsection header: "📐 MODULUS OPERATOR (%)"
- Print divider: "--------------------"
- Create int variables: dividend = 17, divisor = 5
- Calculate remainder = dividend % divisor
- Print remainder with explanation
- Create int variables: number1 = 14, number2 = 15
- Use if statements to check even/odd using modulus
- Print even/odd results

**Exact Code to Implement**:
```java
// ===== MODULUS OPERATOR (%) =====
System.out.println("📐 MODULUS OPERATOR (%)");
System.out.println("--------------------");

// Basic modulus
int dividend = 17;
int divisor = 5;
int remainder = dividend % divisor;
System.out.println("Remainder: " + dividend + " % " + divisor + " = " + remainder);
System.out.println("(" + dividend + " ÷ " + divisor + " = " + (dividend/divisor) + " remainder " + remainder + ")");

// Even/odd checking
int number1 = 14;
int number2 = 15;
if (number1 % 2 == 0) {
    System.out.println(number1 + " is even (remainder when divided by 2: " + (number1 % 2) + ")");
}
if (number2 % 2 != 0) {
    System.out.println(number2 + " is odd (remainder when divided by 2: " + (number2 % 2) + ")");
}
```

**Key Points**:
- Modulus operator (%) returns remainder of division
- 17 % 5 = 2 (because 17 ÷ 5 = 3 remainder 2)
- Even numbers: n % 2 == 0
- Odd numbers: n % 2 == 1 (or != 0)
- Works with negative numbers (sign follows dividend)
- Commonly used for: even/odd checks, circular arrays, time conversions
- Real-world uses: time calculations, pagination, cyclic patterns, validation

**Expected Output**:
```
📐 MODULUS OPERATOR (%)
--------------------
Remainder: 17 % 5 = 2
(17 ÷ 5 = 3 remainder 2)
14 is even (remainder when divided by 2: 0)
15 is odd (remainder when divided by 2: 1)
```

---

### Prompt 6: Operator Precedence
**Task**: Create a section demonstrating operator precedence and use of parentheses.

**Expected Code Structure**: Variable declarations with calculations and print statements

**Requirements**:
- Print subsection header: "🎯 OPERATOR PRECEDENCE (Order of Operations)"
- Print divider: "------------------------------------------"
- Calculate result1 = 2 + 3 * 4 (without parentheses)
- Calculate result2 = (2 + 3) * 4 (with parentheses)
- Print both results showing multiplication first vs addition first
- Calculate result3 = 10 - 6 / 2 (without parentheses)
- Calculate result4 = (10 - 6) / 2 (with parentheses)
- Print both results
- Create complex calculation example with finalPrice
- Add empty line after section

**Exact Code to Implement**:
```java
// ===== OPERATOR PRECEDENCE =====
System.out.println("🎯 OPERATOR PRECEDENCE (Order of Operations)");
System.out.println("------------------------------------------");

int result1 = 2 + 3 * 4;
int result2 = (2 + 3) * 4;
System.out.println("Without parentheses: 2 + 3 * 4 = " + result1 + " (multiplication first)");
System.out.println("With parentheses: (2 + 3) * 4 = " + result2 + " (addition first)");

int result3 = 10 - 6 / 2;
int result4 = (10 - 6) / 2;
System.out.println("Without parentheses: 10 - 6 / 2 = " + result3 + " (division first)");
System.out.println("With parentheses: (10 - 6) / 2 = " + result4 + " (subtraction first)");

// Complex calculation example
double finalPrice = 100.0 * 1.2 + 15.0 - 5.0;
double finalPriceWithParens = (100.0 * 1.2) + 15.0 - 5.0;
System.out.println("Complex: 100.0 * 1.2 + 15.0 - 5.0 = $" + finalPrice);
System.out.println("Same with parentheses: (100.0 * 1.2) + 15.0 - 5.0 = $" + finalPriceWithParens);
System.out.println();
```

**Key Points**:
- Java follows PEMDAS/BODMAS order: Parentheses, Multiplication/Division, Addition/Subtraction
- Multiplication and division have same precedence (left to right)
- Addition and subtraction have same precedence (left to right)
- Use parentheses to explicitly control order of operations
- Parentheses make code more readable and intentions clear
- Without parentheses: 2 + 3 * 4 = 14 (multiply first)
- With parentheses: (2 + 3) * 4 = 20 (add first)

**Expected Output**:
```
🎯 OPERATOR PRECEDENCE (Order of Operations)
------------------------------------------
Without parentheses: 2 + 3 * 4 = 14 (multiplication first)
With parentheses: (2 + 3) * 4 = 20 (addition first)
Without parentheses: 10 - 6 / 2 = 7 (division first)
With parentheses: (10 - 6) / 2 = 2 (subtraction first)
Complex: 100.0 * 1.2 + 15.0 - 5.0 = $130.0
Same with parentheses: (100.0 * 1.2) + 15.0 - 5.0 = $130.0

```

---

### Prompt 7: Increment Operators (++)
**Task**: Create a section demonstrating pre-increment and post-increment operators.

**Expected Code Structure**: Variable declarations and print statements showing increment behavior

**Requirements**:
- Print subsection header: "⬆️ INCREMENT OPERATORS (++)"
- Print divider: "-------------------------"
- Create int counter1 = 5, demonstrate pre-increment: preResult = ++counter1
- Print pre-increment explanation and results
- Create int counter2 = 5, demonstrate post-increment: postResult = counter2++
- Print post-increment explanation and results
- Create int score = 100, demonstrate compound assignment with score += 50
- Print game score example with empty line after

**Exact Code to Implement**:
```java
// ===== INCREMENT OPERATORS (++) =====
System.out.println("⬆️ INCREMENT OPERATORS (++)");
System.out.println("-------------------------");

// Pre-increment (++variable)
int counter1 = 5;
int preResult = ++counter1;
System.out.println("Pre-increment: ++counter (was 5)");
System.out.println("counter is now: " + counter1 + ", result: " + preResult);

// Post-increment (variable++)
int counter2 = 5;
int postResult = counter2++;
System.out.println("Post-increment: counter++ (was 5)");
System.out.println("counter is now: " + counter2 + ", result: " + postResult);

int score = 100;
System.out.println("Game score: " + score);
score += 50; // Using compound assignment (equivalent to score = score + 50)
System.out.println("After bonus: " + score);
System.out.println();
```

**Key Points**:
- Increment operator (++) increases value by 1
- **Pre-increment (++var)**: increments BEFORE using value
- **Post-increment (var++)**: increments AFTER using value
- Pre-increment: ++counter1 → counter1 = 6, result = 6
- Post-increment: counter2++ → counter2 = 6, result = 5
- Commonly used in: loops, counters, score increments
- Can be standalone statement or part of expression
- Real-world uses: page numbers, attempt counters, progress tracking

**Expected Output**:
```
⬆️ INCREMENT OPERATORS (++)
-------------------------
Pre-increment: ++counter (was 5)
counter is now: 6, result: 6
Post-increment: counter++ (was 5)
counter is now: 6, result: 5
Game score: 100
After bonus: 150

```

---

### Prompt 8: Decrement Operators (--)
**Task**: Create a section demonstrating pre-decrement and post-decrement operators.

**Expected Code Structure**: Variable declarations and print statements showing decrement behavior

**Requirements**:
- Print subsection header: "⬇️ DECREMENT OPERATORS (--)"
- Print divider: "-------------------------"
- Create int lives1 = 3, demonstrate pre-decrement: preDecResult = --lives1
- Print pre-decrement explanation and results
- Create int lives2 = 3, demonstrate post-decrement: postDecResult = lives2--
- Print post-decrement explanation and results
- Create int inventory = 50, demonstrate inventory--
- Print inventory example
- Create int countdown = 10, demonstrate countdown--
- Print countdown examples

**Exact Code to Implement**:
```java
// ===== DECREMENT OPERATORS (--) =====
System.out.println("⬇️ DECREMENT OPERATORS (--)");
System.out.println("-------------------------");

// Pre-decrement (--variable)
int lives1 = 3;
int preDecResult = --lives1;
System.out.println("Pre-decrement: --lives (was 3)");
System.out.println("lives is now: " + lives1 + ", result: " + preDecResult);

// Post-decrement (variable--)
int lives2 = 3;
int postDecResult = lives2--;
System.out.println("Post-decrement: lives-- (was 3)");
System.out.println("lives is now: " + lives2 + ", result: " + postDecResult);

// Real-world examples
int inventory = 50;
System.out.println("Inventory: " + inventory + " items");
inventory--;
System.out.println("After sale: " + inventory + " items");

int countdown = 10;
System.out.println("Countdown: " + countdown);
countdown--;
System.out.println("Countdown: " + countdown);
```

**Key Points**:
- Decrement operator (--) decreases value by 1
- **Pre-decrement (--var)**: decrements BEFORE using value
- **Post-decrement (var--)**: decrements AFTER using value
- Pre-decrement: --lives1 → lives1 = 2, result = 2
- Post-decrement: lives2-- → lives2 = 2, result = 3
- Commonly used in: countdown timers, lives/health reduction, inventory
- Real-world uses: resource consumption, retry counters, stock depletion

**Expected Output**:
```
⬇️ DECREMENT OPERATORS (--)
-------------------------
Pre-decrement: --lives (was 3)
lives is now: 2, result: 2
Post-decrement: lives-- (was 3)
lives is now: 2, result: 3
Inventory: 50 items
After sale: 49 items
Countdown: 10
Countdown: 9
```

---

### Prompt 9: Compound Assignment Operators
**Task**: Create a section demonstrating all compound assignment operators with practical examples.

**Expected Code Structure**: Variable declarations and print statements showing compound assignments

**Requirements**:
- Print subsection header: "🔄 COMPOUND ASSIGNMENT OPERATORS"
- Print divider: "------------------------------"
- Demonstrate += with balance: balance = 100, balance += 50
- Demonstrate -= with balance: balance -= 30
- Demonstrate *= with points: points = 100, points *= 2
- Demonstrate /= with cookies: cookies = 24, cookies /= 4
- Demonstrate %= with timeMinutes: timeMinutes = 150, timeMinutes %= 60
- Print each compound assignment with descriptive labels
- Add empty line after section

**Exact Code to Implement**:
```java
// ===== COMPOUND ASSIGNMENT OPERATORS =====
System.out.println("🔄 COMPOUND ASSIGNMENT OPERATORS");
System.out.println("------------------------------");

// Addition assignment (+=)
int balance = 100;
System.out.println("Bank balance: $" + balance);
balance += 50;
System.out.println("After deposit (+= 50): $" + balance);

// Subtraction assignment (-=)
balance -= 30;
System.out.println("After withdrawal (-= 30): $" + balance);

// Multiplication assignment (*=)
int points = 100;
System.out.println("Game points: " + points);
points *= 2;
System.out.println("After double points (*= 2): " + points);

// Division assignment (/=)
int cookies = 24;
System.out.println("Total cookies: " + cookies);
cookies /= 4;
System.out.println("Cookies per person (/= 4): " + cookies);

// Modulus assignment (%=)
int timeMinutes = 150;
System.out.println("Total minutes: " + timeMinutes);
timeMinutes %= 60;
System.out.println("Remaining minutes (%= 60): " + timeMinutes);
System.out.println();
```

**Key Points**:
- Compound assignment combines operation with assignment
- **+=**: x += 5 is equivalent to x = x + 5
- **-=**: x -= 3 is equivalent to x = x - 3
- **\*=**: x *= 2 is equivalent to x = x * 2
- **/=**: x /= 4 is equivalent to x = x / 4
- **%=**: x %= 10 is equivalent to x = x % 10
- More concise than long form
- Less error-prone (variable name typed once)
- Real-world uses: account updates, score modifications, inventory changes

**Expected Output**:
```
🔄 COMPOUND ASSIGNMENT OPERATORS
------------------------------
Bank balance: $100
After deposit (+= 50): $150
After withdrawal (-= 30): $120
Game points: 100
After double points (*= 2): 200
Total cookies: 24
Cookies per person (/= 4): 6
Total minutes: 150
Remaining minutes (%= 60): 30

```

---
