package com.calculator.core;

import com.calculator.domain.CalculatorOperation;

/**
 * Calculator class that performs arithmetic operations on two numbers.
 * Supports addition, subtraction, multiplication, and division.
 */
public class Calculator {

    /**
     * Adds two numbers.
     *
     * @param num1 the first number
     * @param num2 the second number
     * @return the sum of num1 and num2
     */
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Subtracts the second number from the first number.
     *
     * @param num1 the first number
     * @param num2 the second number
     * @return the difference (num1 - num2)
     */
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Multiplies two numbers.
     *
     * @param num1 the first number
     * @param num2 the second number
     * @return the product of num1 and num2
     */
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Divides the first number by the second number.
     *
     * @param num1 the dividend
     * @param num2 the divisor
     * @return the quotient (num1 / num2)
     * @throws ArithmeticException if num2 is zero
     */
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return num1 / num2;
    }

    /**
     * Performs a calculation based on the specified operation.
     *
     * @param num1 the first number
     * @param num2 the second number
     * @param operation the operation to perform
     * @return the result of the calculation
     * @throws IllegalArgumentException if operation is null
     * @throws ArithmeticException if division by zero is attempted
     */
    public double performCalculation(double num1, double num2, CalculatorOperation operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null!");
        }

        return switch (operation) {
            case ADD -> add(num1, num2);
            case SUBTRACT -> subtract(num1, num2);
            case MULTIPLY -> multiply(num1, num2);
            case DIVIDE -> divide(num1, num2);
        };
    }
}
