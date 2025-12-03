package com.calculator.core;

import com.calculator.domain.CalculatorOperation;

/**
 * Core calculator engine that performs basic arithmetic operations.
 * This class contains pure business logic independent of the user interface.
 */
public class Calculator {

    /**
     * Adds two numbers
     * @param num1 the first number
     * @param num2 the second number
     * @return the sum of num1 and num2
     */
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Subtracts two numbers
     * @param num1 the first number
     * @param num2 the second number to subtract
     * @return the difference of num1 minus num2
     */
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Multiplies two numbers
     * @param num1 the first number
     * @param num2 the second number
     * @return the product of num1 and num2
     */
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Divides two numbers
     * @param num1 the dividend
     * @param num2 the divisor
     * @return the quotient of num1 divided by num2
     * @throws ArithmeticException if num2 is zero
     */
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return num1 / num2;
    }

    /**
     * Performs the calculation based on operation.
     * Routes to the appropriate calculation method based on the operation type.
     *
     * @param num1 first operand
     * @param num2 second operand
     * @param operation the Operation enum specifying which calculation to perform
     * @return the result of the calculation
     */
    public double performCalculation(double num1, double num2, CalculatorOperation operation) {
        return switch (operation) {
            case ADD -> add(num1, num2);
            case SUBTRACT -> subtract(num1, num2);
            case MULTIPLY -> multiply(num1, num2);
            case DIVIDE -> divide(num1, num2);
        };
    }
}

