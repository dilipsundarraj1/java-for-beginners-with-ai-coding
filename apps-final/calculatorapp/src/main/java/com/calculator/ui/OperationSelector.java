package com.calculator.ui;

import java.util.Scanner;
import com.calculator.domain.CalculatorOperation;

/**
 * Handles user input for selecting arithmetic operations.
 * Responsible for displaying operation menu and getting valid user choice.
 */
public class OperationSelector {

    private final Scanner scanner;

    /**
     * Constructor for OperationSelector
     * @param scanner the Scanner instance to use for reading user input
     */
    public OperationSelector(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Gets the operation choice from user via interactive menu.
     * Displays available operations and validates user input.
     *
     * @return the selected CalculatorOperation enum
     */
    public CalculatorOperation getOperation() {
        CalculatorOperation calculatorOperation;
        boolean validOperation = false;

        do {
            displayOperationMenu();
            int choice = scanner.nextInt();

            calculatorOperation = switch (choice) {
                case 1 -> CalculatorOperation.ADD;
                case 2 -> CalculatorOperation.SUBTRACT;
                case 3 -> CalculatorOperation.MULTIPLY;
                case 4 -> CalculatorOperation.DIVIDE;
                case 5 -> {
                    System.out.println("Goodbye!");
                    System.exit(0);
                    yield null;
                }
                default -> {
                    System.out.println("Invalid choice! Please select 1-5.");
                    yield null;
                }
            };

            if (calculatorOperation != null) {
                validOperation = true;
            }
        } while (!validOperation);

        return calculatorOperation;
    }

    /**
     * Displays the operation menu to the user
     */
    private void displayOperationMenu() {
        System.out.println("\nSelect operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");
    }
}

