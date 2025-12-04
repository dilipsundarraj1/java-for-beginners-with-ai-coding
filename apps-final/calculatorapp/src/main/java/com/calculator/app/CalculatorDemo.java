package com.calculator.app;

import com.calculator.core.Calculator;
import com.calculator.domain.CalculatorOperation;

/**
 * CalculatorDemo class that demonstrates all calculator operations.
 * This class showcases how to use the Calculator class with different operations.
 */
public class CalculatorDemo {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Test numbers
        double num1 = 10.0;
        double num2 = 5.0;

        System.out.println("=== Calculator Operations Demo ===\n");

        // Addition
        demonstrateOperation(calculator, num1, num2, CalculatorOperation.ADD);

        // Subtraction
        demonstrateOperation(calculator, num1, num2, CalculatorOperation.SUBTRACT);

        // Multiplication
        demonstrateOperation(calculator, num1, num2, CalculatorOperation.MULTIPLY);

        // Division
        demonstrateOperation(calculator, num1, num2, CalculatorOperation.DIVIDE);

        // Division by Zero (Error Handling)
        demonstrateDivisionByZero(calculator, num1);

        System.out.println("\n=== Demo Complete ===");
    }

    /**
     * Helper method to demonstrate an operation.
     *
     * @param calculator the Calculator instance
     * @param num1 the first number
     * @param num2 the second number
     * @param operation the operation to perform
     */
    private static void demonstrateOperation(Calculator calculator, double num1, double num2, CalculatorOperation operation) {
        double result = calculator.performCalculation(num1, num2, operation);
        System.out.println(String.format(
                "Operation: %s (%s)\nExpression: %.1f %s %.1f = %.2f\n",
                operation.getDisplayName(),
                operation.getSymbol(),
                num1,
                operation.getSymbol(),
                num2,
                result
        ));
    }

    /**
     * Helper method to demonstrate division by zero error handling.
     *
     * @param calculator the Calculator instance
     * @param num1 the dividend
     */
    private static void demonstrateDivisionByZero(Calculator calculator, double num1) {
        System.out.println("Testing Division by Zero Error Handling:");
        try {
            double result = calculator.performCalculation(num1, 0, CalculatorOperation.DIVIDE);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("❌ Error caught: " + e.getMessage());
        }
        System.out.println();
    }
}

