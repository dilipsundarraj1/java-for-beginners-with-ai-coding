package com.modernjava._2primitives;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * This class demonstrates boolean primitive data type in Java.
 * boolean: logical value (true or false)
 *
 * Covers:
 * - Basic boolean usage and values
 * - Boolean operations and logical operators
 * - Conditional statements with if control flow only
 * - Best practices for naming boolean variables
 * - Real-world practical examples (no String examples)
 * - Common mistakes and how to avoid them
 */
public class BooleanExamples {

    public static void main(String[] args) {
        System.out.println("=== COMPREHENSIVE BOOLEAN GUIDE ===\n");

        // ========================================
        // 1. BASIC BOOLEAN VALUES AND CHARACTERISTICS
        // ========================================
        System.out.println("1. BASIC BOOLEAN VALUES");
        System.out.println("========================");

        // Basic boolean declarations - only two possible values
        boolean isJavaFun = true;
        boolean isRaining = false;
        boolean hasPermission = true;
        boolean isComplete = false;

        System.out.println("📝 Basic Boolean Declarations:");
        System.out.println("isJavaFun: " + isJavaFun);
        System.out.println("isRaining: " + isRaining);
        System.out.println("hasPermission: " + hasPermission);
        System.out.println("isComplete: " + isComplete);

        // Boolean characteristics

        // ========================================
        // 2. BOOLEAN OPERATIONS & LOGICAL OPERATORS
        // ========================================
        System.out.println("\n2. BOOLEAN OPERATIONS & LOGICAL OPERATORS");
        System.out.println("==========================================");

        // AND operator (&&) - Both conditions must be true
        System.out.println("🔴 AND Operator (&&) - Both must be true:");
        boolean sunny = true;
        boolean warm = true;
        boolean goodWeather = sunny && warm;
        System.out.println("sunny (" + sunny + ") && warm (" + warm + ") = " + goodWeather);

        // OR operator (||) - At least one condition must be true
        System.out.println("\n🔵 OR Operator (||) - At least one must be true:");

        boolean weekend = false;
        boolean holiday = false;
        boolean dayOff = weekend || holiday;
        System.out.println("weekend (" + weekend + ") || holiday (" + holiday + ") = " + dayOff);

        // NOT operator (!) - Inverts the boolean value
        System.out.println("\n🟡 NOT Operator (!) - Inverts the value:");
        boolean isWorking = true;
        boolean isNotWorking = !isWorking;
        System.out.println("isWorking: " + isWorking + " → !isWorking: " + isNotWorking);

        boolean isLoggedIn = false;
        boolean needsLogin = !isLoggedIn;
        System.out.println("isLoggedIn: " + isLoggedIn + " → needsLogin: " + needsLogin);

        // Complex boolean expressions
        System.out.println("\n🟢 Complex Boolean Expressions:");
        boolean isStudent = true;
        boolean hasDiscount = true;
        boolean isVip = false;
        int purchaseAmount = 150;

        boolean qualifiesForDiscount = (isStudent || isVip) && hasDiscount && (purchaseAmount > 100);
        System.out.println("Complex expression breakdown:");
        System.out.println("(isStudent || isVip): " + (isStudent || isVip));
        System.out.println("hasDiscount: " + hasDiscount);
        System.out.println("purchaseAmount > 100: " + (purchaseAmount > 100));
        System.out.println("Final result: " + qualifiesForDiscount);

        // Short-circuit evaluation - very important concept!
        System.out.println("\n⚡ Short-Circuit Evaluation:");
        System.out.println("With &&: If first is false, second is not evaluated");
        System.out.println("With ||: If first is true, second is not evaluated");

        int zero = 0;
        boolean result1 = false && (5/zero == 1); // No ArithmeticException because 5/0 is not evaluated
        boolean result2 = true || (5/zero == 1);  // No ArithmeticException because 5/0 is not evaluated
        System.out.println("Short-circuit results: " + result1 + ", " + result2);

        // ========================================
        // 3. BOOLEAN WITH COMPARISON OPERATIONS
        // ========================================
        System.out.println("\n3. BOOLEAN WITH COMPARISONS");
        System.out.println("============================");

        System.out.println("🔢 Comparison Operators that Return Boolean:");
        int age = 20;
        double price = 29.99;
        char grade = 'A';

        // Numeric comparisons
        boolean isAdult = age >= 18;
        boolean isTeenager = age >= 13 && age <= 19;
        boolean canVote = age >= 18;
        boolean isSenior = age >= 65;

        System.out.println("Age: " + age);
        System.out.println("isAdult (age >= 18): " + isAdult);
        System.out.println("isTeenager (age 13-19): " + isTeenager);
        System.out.println("canVote (age >= 18): " + canVote);
        System.out.println("isSenior (age >= 65): " + isSenior);

        System.out.println("\n=== END OF BOOLEAN GUIDE ===");
    }
}
