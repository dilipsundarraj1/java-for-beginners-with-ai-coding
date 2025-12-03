package com.calculator.app;

import java.util.Scanner;
import com.calculator.core.Calculator;
import com.calculator.domain.CalculatorOperation;
import com.calculator.ui.OperationSelector;

/**
 * Main Calculator Application class that provides command line interface
 * for performing basic arithmetic operations.
 * This class orchestrates the interaction between all layers of the application.
 */
public class CalculatorApp {

    private final Calculator calculator;
    private final Scanner scanner;
    private final OperationSelector operationSelector;

    /**
     * Constructor for CalculatorApp
     * @param calculator the Calculator instance to use for computations
     * @param scanner the Scanner instance to use for user input
     */
    public CalculatorApp(Calculator calculator, Scanner scanner) {
        this.calculator = calculator;
        this.scanner = scanner;
        this.operationSelector = new OperationSelector(scanner);
    }

    /**
     * Main method to start the calculator application
     */
    static void main(@SuppressWarnings("unused") String[] args) {
        CalculatorApp app = new CalculatorApp(new Calculator(), new Scanner(System.in));
        app.orchestration();
    }

    /**
     * Main application loop.
     * Continuously processes user calculations until they choose to exit.
     */
    public void orchestration() {
        System.out.println("=== Welcome to Calculator App ===");

        boolean continueCalculation = true;

        while (continueCalculation) {
            try {
                // Get first number
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();

                // Get second number
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                // Get operation from user
                CalculatorOperation calculatorOperation = operationSelector.getOperation();

                // Perform calculation
                double result = calculator.performCalculation(num1, num2, calculatorOperation);

                // Display result
                System.out.println("Result: " + num1 + " " + calculatorOperation.getSymbol() + " " + num2 + " = " + result);

                // Ask if user wants to continue
                continueCalculation = askToContinue();

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input! Please try again.");
                scanner.nextLine(); // Clear invalid input
            }
        }

        System.out.println("Thank you for using Calculator App!");
        scanner.close();
    }


    /**
     * Asks user if they want to continue with more calculations.
     * Accepts "y", "yes", "n", "no" (case-insensitive).
     *
     * @return true if user wants to continue, false otherwise
     */
    private boolean askToContinue() {
        System.out.print("\nDo you want to perform another calculation? (y/n): ");
        String response = scanner.next().toLowerCase();
        return response.equals("y") || response.equals("yes");
    }
}

