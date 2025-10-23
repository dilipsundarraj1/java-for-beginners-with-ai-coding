package app;

/**
 * Calculator class that performs basic arithmetic operations
 */
public class Calculator {

    /**
     * Performs addition of two numbers
     */
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Performs subtraction of two numbers
     */
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Performs multiplication of two numbers
     */
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Performs division of two numbers
     */
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return num1 / num2;
    }
}
