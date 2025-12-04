package com.calculator.ui;

import com.calculator.domain.CalculatorOperation;
import java.util.Scanner;

/**
 * OperationSelectorDemo class demonstrates the OperationSelector functionality.
 * This class allows you to test the operation selection process interactively.
 */
public class OperationSelectorDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperationSelector operationSelector = new OperationSelector(scanner);

        System.out.println("=== Operation Selector Demo ===");
        System.out.println("This demo will help you test the operation selection feature.\n");

        boolean continueDemo = true;

        while (continueDemo) {
            CalculatorOperation operation = operationSelector.getOperation();

            if (operation == null) {
                System.out.println("\n✅ You selected: Exit");
                System.out.println("Thank you for using the Calculator!");
                continueDemo = false;
            } else {
                System.out.println("\n✅ You selected: " + operation.getDisplayName());
                System.out.println("   Symbol: " + operation.getSymbol());
                System.out.println("   Option Number: " + operation.getOptionNumber());
                System.out.println("\nWould you like to select another operation?\n");
            }
        }

        scanner.close();
    }
}

