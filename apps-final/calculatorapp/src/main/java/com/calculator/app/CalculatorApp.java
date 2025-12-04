package com.calculator.app;

import com.calculator.core.Calculator;
import com.calculator.domain.CalculatorOperation;
import com.calculator.ui.OperationSelector;
import java.util.Scanner;

/**
 * CalculatorApp is the main orchestrator for the calculator application.
 * It coordinates between the UI layer, domain layer, and core business logic.
 */
public class CalculatorApp {

    private Scanner scanner;
    private OperationSelector operationSelector;
    private Calculator calculator;

    /**
     * Constructor to initialize all dependencies.
     * Creates instances of Scanner, OperationSelector, and Calculator.
     */
    public CalculatorApp() {
        this.scanner = new Scanner(System.in);
        this.operationSelector = new OperationSelector(scanner);
        this.calculator = new Calculator();
    }

    /**
     * Main method to start the calculator application.
     *
     * @param args command line arguments (not used)
     */
    static void main(String[] args) {
        CalculatorApp app = new CalculatorApp();
        app.orchestrate();
    }

    /**
     * Orchestrates the entire calculator workflow.
     * This method handles:
     * 1. Getting the operation from the user
     * 2. Getting two numbers from the user
     * 3. Performing the calculation
     * 4. Displaying the result
     * 5. Asking if user wants to perform another calculation
     */
    private void orchestrate() {
        System.out.println("=== Welcome to Calculator App ===\n");

        boolean continueCalculating = true;

        while (continueCalculating) {
            // 1. Get the operation from user
            CalculatorOperation operation = operationSelector.getOperation();
            if (operation == null) {
                System.out.println("\n✅ Exiting Calculator. Goodbye!");
                break;
            }

            // 2. Get two numbers from user
            double num1 = getNumberInput("Enter first number: ");
            double num2 = getNumberInput("Enter second number: ");

            // 3. Perform calculation
            try {
                double result = calculator.performCalculation(num1, num2, operation);

                // 4. Display result
                System.out.printf("\n📊 Result: %.2f %s %.2f = %.2f\n",
                        num1, operation.getSymbol(), num2, result);
            } catch (ArithmeticException e) {
                System.out.println("\n❌ Error: " + e.getMessage());
            }

            // 5. Ask if user wants to continue
            continueCalculating = askToContinue();
        }

        scanner.close();
    }

    /**
     * Gets a numeric input from the user with validation.
     *
     * @param prompt the message to display to the user
     * @return the numeric input entered by the user
     */
    private double getNumberInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    /**
     * Asks the user if they want to perform another calculation.
     *
     * @return true if user enters 'y' or 'Y', false otherwise
     */
    private boolean askToContinue() {
        System.out.print("\nDo you want to perform another calculation? (y/n): ");
        return scanner.next().equalsIgnoreCase("y");
    }
}

