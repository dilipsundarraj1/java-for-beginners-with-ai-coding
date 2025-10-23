package com.modernjava._2primitives;

/**
 * This class demonstrates arithmetic operators in Java.
 * Arithmetic operators: +, -, *, /, %, ++, --
 *
 * Covers:
 * - Basic arithmetic operations (addition, subtraction, multiplication, division)
 * - Modulus operator for remainder calculations
 * - Increment and decrement operators
 * - Operator precedence and order of operations
 */
public class ArithmeticOperatorsExamples {

    static void main(String[] args) {
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

    }
}
