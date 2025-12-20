package com.modernjava._12polymorohism.payment.ui;

import com.modernjava._12polymorohism.payment.PaymentService;
import com.modernjava._12polymorohism.payment.PaymentType;
import java.util.Scanner;

// Command-line interface for processing payments interactively
public class PaymentCLI {
    private PaymentService paymentService;

    // Constructor to initialize the PaymentCLI with a PaymentService instance
    public PaymentCLI() {
        this.paymentService = new PaymentService();
    }

    // Display menu options for available payment types
    private void displayMenu() {
        System.out.println("\n===== Payment Processing System =====");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("0. Exit");
        System.out.println("=====================================");
    }

    // Get payment type from user input and return corresponding PaymentType enum
    private PaymentType getPaymentType(int choice) {
        return switch (choice) {
            case 1 -> PaymentType.CREDITCARD;
            case 2 -> PaymentType.PAYPAL;
            default -> null;
        };
    }

    // Get payment amount from user input with validation
    private double getPaymentAmount(Scanner scanner) {
        System.out.print("Enter payment amount: $");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a valid amount: $");
            scanner.next();
        }
        double amount = scanner.nextDouble();
        scanner.nextLine();
        return amount;
    }

    // Get payment details from user input
    private String getPaymentDetails(Scanner scanner) {
        System.out.print("Enter payment details (e.g., account number, email, wallet address): ");
        return scanner.nextLine();
    }

    // Start the interactive command-line payment processing loop
    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();
            System.out.print("Select payment type: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("Thank you for using Payment Processing System. Goodbye!");
                running = false;
                continue;
            }

            PaymentType type = getPaymentType(choice);
            if (type == null) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            double amount = getPaymentAmount(scanner);
            String detail = getPaymentDetails(scanner);

            System.out.println("\nProcessing payment...");
            paymentService.processPayment(type, amount, detail);
        }

        scanner.close();
    }

    // Main method to run the Payment CLI application
    public static void main(String[] args) {
        PaymentCLI cli = new PaymentCLI();
        cli.start();
    }
}

