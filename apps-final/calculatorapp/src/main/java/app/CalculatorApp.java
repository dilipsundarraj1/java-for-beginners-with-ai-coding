package app;

import java.util.Scanner;

/**
 * Main Calculator Application class that provides command line interface
 * for performing basic arithmetic operations
 */
public class CalculatorApp {

    private Calculator calculator;
    private Scanner scanner;

    public CalculatorApp() {
        this.calculator = new Calculator();
        this.scanner = new Scanner(System.in);
    }

    /**
     * Main method to start the calculator application
     */
    public static void main(String[] args) {
        CalculatorApp app = new CalculatorApp();
        app.run();
    }

    /**
     * Main application loop
     */
    public void run() {
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

                // Get operation
                String operation = getOperation();

                // Perform calculation
                double result = performCalculation(num1, num2, operation);

                // Display result
                System.out.println("Result: " + num1 + " " + getOperationSymbol(operation) + " " + num2 + " = " + result);

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
     * Gets the operation choice from user
     */
    private String getOperation() {
        String operation;
        boolean validOperation = false;

        do {
            System.out.println("\nSelect operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    operation = "add";
                    validOperation = true;
                    break;
                case 2:
                    operation = "subtract";
                    validOperation = true;
                    break;
                case 3:
                    operation = "multiply";
                    validOperation = true;
                    break;
                case 4:
                    operation = "divide";
                    validOperation = true;
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    return null;
                default:
                    System.out.println("Invalid choice! Please select 1-5.");
                    operation = "";
                    validOperation = false;
            }
        } while (!validOperation);

        return operation;
    }

    /**
     * Performs the calculation based on operation
     */
    private double performCalculation(double num1, double num2, String operation) {
        // Using if-else if structure as requested
        if (operation.equals("add")) {
            return calculator.add(num1, num2);
        } else if (operation.equals("subtract")) {
            return calculator.subtract(num1, num2);
        } else if (operation.equals("multiply")) {
            return calculator.multiply(num1, num2);
        } else if (operation.equals("divide")) {
            return calculator.divide(num1, num2);
        } else {
            throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }

    /**
     * Gets the symbol for display purposes
     */
    private String getOperationSymbol(String operation) {
        // Using ternary operators as requested
        return operation.equals("add") ? "+" :
               operation.equals("subtract") ? "-" :
               operation.equals("multiply") ? "*" :
               operation.equals("divide") ? "/" : "?";
    }

    /**
     * Asks user if they want to continue with more calculations
     */
    private boolean askToContinue() {
        System.out.print("\nDo you want to perform another calculation? (y/n): ");
        String response = scanner.next().toLowerCase();

        // Using ternary operator
        return response.equals("y") || response.equals("yes") ? true : false;
    }
}
