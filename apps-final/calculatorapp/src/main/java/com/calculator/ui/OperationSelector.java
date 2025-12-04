package com.calculator.ui;

import com.calculator.domain.CalculatorOperation;
import java.util.Scanner;

/**
 * OperationSelector class handles user interaction for selecting calculator operations.
 * This class is responsible for displaying the operation menu and validating user input.
 */
public class OperationSelector {

    private final Scanner scanner;

    /**
     * Constructor to initialize OperationSelector with a Scanner instance.
     *
     * @param scanner the Scanner instance for reading user input
     */
    public OperationSelector(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Displays the operation menu and gets the user's operation choice.
     * Validates input and ensures a valid operation is selected or exit is chosen.
     *
     * @return the selected CalculatorOperation, or null if user chooses to exit (option 5)
     */
    public CalculatorOperation getOperation() {
        CalculatorOperation operation = null;
        boolean validChoice = false;

        while (!validChoice) {
            displayOperationMenu();
            System.out.print("Enter your choice (1-5): ");

            try {
                int userChoice = scanner.nextInt();

                if (!isValidInput(userChoice)) {
                    System.out.println("❌ Invalid choice! Please select 1-5.\n");
                    continue;
                }

                operation = convertUserInputToOperation(userChoice);
                validChoice = true;

            } catch (Exception e) {
                System.out.println("❌ Invalid input! Please enter a number between 1-5.\n");
                scanner.nextLine(); // Clear input buffer
            }
        }

        return operation;
    }

    /**
     * Displays the operation menu with all available options.
     */
    private void displayOperationMenu() {
        System.out.println("\n=== Select Operation ===");
        for (CalculatorOperation op : CalculatorOperation.values()) {
            System.out.println(op.getOptionNumber() + ". " + op.getDisplayName());
        }
        System.out.println("5. Exit");
    }

    /**
     * Converts user input (1-5) to a CalculatorOperation or signals exit.
     *
     * @param userInput the option number entered by user
     * @return the corresponding CalculatorOperation, or null if user chose to exit
     */
    private CalculatorOperation convertUserInputToOperation(int userInput) {
        if (userInput == 5) {
            return null; // Signal to exit
        }
        return CalculatorOperation.fromOptionNumber(userInput);
    }

    /**
     * Validates if the user input is within the valid range (1-5).
     *
     * @param userInput the option number to validate
     * @return true if input is valid (1-5), false otherwise
     */
    private boolean isValidInput(int userInput) {
        return userInput >= 1 && userInput <= 5;
    }
}

