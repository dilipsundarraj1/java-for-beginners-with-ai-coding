package app;

import app.domain.PurchaseResult;
import app.domain.SeatType;
import app.domain.Ticket;
import app.domain.StatsSnapshot;
import app.service.PricingEngine;
import app.service.StatisticsService;
import app.service.TicketPurchaseService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Interactive Movie Ticket Kiosk that allows users to:
 * 1. Buy tickets (multiple in one session)
 * 2. View pricing information
 * 3. View kiosk statistics
 * 4. Exit
 *
 * Uses Ticket objects to store sold tickets and maintains total revenue.
 * This is the main entry point for the movie ticket purchase system.
 */
public class MovieTicketKiosk {

    // Instance variables for managing user interaction and business logic
    private final Scanner scanner;
    private final TicketPurchaseService ticketPurchaseService;
    private final StatisticsService statisticsService;

    /**
     * Constructs a MovieTicketKiosk with required service dependencies.
     * Initializes the scanner for user input and injects the ticket purchase
     * and statistics services needed for kiosk operations.
     *
     * @param ticketPurchaseService Service responsible for handling ticket purchase flow
     * @param statisticsService Service responsible for calculating sales statistics and maintaining data persistence
     */
    public MovieTicketKiosk(TicketPurchaseService ticketPurchaseService, StatisticsService statisticsService) {
        this.scanner = new Scanner(System.in);
        this.ticketPurchaseService = ticketPurchaseService;
        this.statisticsService = statisticsService;
    }

    /**
     * Main execution loop for the kiosk application.
     * Continuously displays the main menu, reads user choice, and routes to appropriate functions
     * until the user chooses to exit. Maintains state across multiple transactions including
     * sold tickets and revenue totals.
     */
    public void run() {
        boolean keepRunning = true;
        // Continue running until user selects exit option
        while (keepRunning) {
            // Display menu and get user choice
            showMainMenu();
            int choice = readIntInRange("Select option (1-4): ", 1, 4);

            // Route to appropriate function based on user choice
            switch (choice) {
                case 1 -> buyTicketsFlow();
                case 2 -> showPricingInformation();
                case 3 -> statisticsService.displayStatistics();
                case 4 -> {
                    // User selected exit
                    keepRunning = false;
                    System.out.println("Exiting kiosk... Goodbye!");
                }
                default -> System.out.println("Invalid choice. Try again.");
            }

            // Wait for user confirmation before returning to main menu
            if (keepRunning) waitForEnter();
        }
    }

    /**
     * Displays the main menu options for the kiosk.
     * Shows all available actions a user can perform in the system.
     */
    private void showMainMenu() {
        System.out.println();
        System.out.println("==============================");
        System.out.println("      MOVIE TICKET KIOSK");
        System.out.println("==============================");
        System.out.println("1. Buy Tickets");
        System.out.println("2. View Pricing Information");
        System.out.println("3. View Kiosk Statistics");
        System.out.println("4. Exit");
    }

    /**
     * Orchestrates the complete ticket purchase flow.
     * Handles:
     * 1. Ticket selection and purchase via TicketPurchaseService
     * 2. Display of order summary
     * 3. Purchase confirmation from user
     * 4. Recording of tickets and revenue if confirmed
     * 5. Display of updated kiosk statistics
     */
    // ===== BUY TICKETS FLOW =====
    private void buyTicketsFlow() {
        System.out.println("\n=== Ticket Purchase ===");

        // Delegate to TicketPurchaseService to handle ticket selection
        PurchaseResult purchaseResult = ticketPurchaseService.buyTicket(scanner);

        // Display order summary with all ticket details
        System.out.println("\n--- Order Summary ---");
        for (Ticket t : purchaseResult.tickets()) {
            System.out.printf("Ticket #%d | Age %d (%s) | %s | %s | $%d%n",
                    t.id(), t.age(), t.ageCategory(), t.member() ? "Member" : "Non-Member", t.seatType(), t.price());
        }

        // Extract purchase details for display
        var sessionTickets = purchaseResult.tickets();
        var discount = purchaseResult.summary().discount();

        // Display pricing breakdown
        System.out.println("Tickets: " + sessionTickets.size());
        System.out.println("Subtotal: $" + purchaseResult.summary().subtotal());
        System.out.println(discount > 0 ? ("Bulk Discount: -$" + purchaseResult.summary().discount()) : "No bulk discount");
        System.out.println("Final Total: $" + purchaseResult.summary().finalTotal());

        // Ask user for final confirmation
        boolean confirm = readYesNo("Confirm purchase? (y/n): ");
        if (confirm) {
            // Record purchase and get updated statistics snapshot all in one call
            StatsSnapshot snapshot = statisticsService.snapshot(sessionTickets, purchaseResult.summary().finalTotal());

            System.out.println("Purchase completed. Enjoy the show!\n");

            // Display the updated statistics snapshot
            System.out.printf("Updated Stats -> Tickets Sold: %d | Revenue: $%d | Avg Price: %.2f | Member %%: %d%%%n",
                    snapshot.ticketsSold(), snapshot.totalRevenue(), snapshot.averageTicketPrice(), snapshot.memberPercentage());
        } else {
            // Purchase was cancelled, no changes to kiosk state
            System.out.println("Purchase cancelled.");
        }
    }

    /**
     * Displays comprehensive pricing information including:
     * 1. Age-based pricing tiers
     * 2. Seat type surcharges
     * 3. Member discount information
     * 4. Bulk discount details
     * 5. Example ticket categories
     */
    // ===== PRICING INFO =====
    private void showPricingInformation() {
        System.out.println("\n=== Pricing Information ===");

        // Show age-based pricing tiers
        demonstrateAgePricing();

        // Show seat type surcharges
        demonstrateSeatPricing();

        // Display discount information
        System.out.println("Member Discount: $1 off base price (not below $0)");
        System.out.println("Bulk Discount: $2 off for every 5 tickets in a single order.");

        // Show example ticket categories with different combinations
        System.out.println("\nCategory Examples:");
        System.out.println("Child Member Premium: " + PricingEngine.determineTicketCategory(8, true, SeatType.PREMIUM));
        System.out.println("Adult Regular Standard: " + PricingEngine.determineTicketCategory(30, false, SeatType.REGULAR));
        System.out.println("Senior Member Luxury: " + PricingEngine.determineTicketCategory(65, true, SeatType.RECLINER));
    }

    /**
     * Demonstrates age-based ticket pricing for various ages.
     * Shows how prices vary across different age categories (Toddler, Child, Adult, Senior).
     */
    private void demonstrateAgePricing() {
        System.out.println("Age-based pricing:");
        // Test ages covering all pricing tiers
        int[] ages = {2, 8, 15, 25, 59, 60, 75};
        for (int age : ages) {
            // Calculate base price for the age
            int price = PricingEngine.calculateBasePriceByAge(age);
            // Format price display (FREE for $0, otherwise show amount)
            String label = price == 0 ? "FREE" : "$" + price;
            System.out.printf("Age %d (%s): %s%n", age, PricingEngine.getAgeCategoryName(age), label);
        }
    }

    /**
     * Demonstrates seat type surcharges added to base ticket prices.
     * Shows how each seat type (REGULAR, PREMIUM, RECLINER) affects the final price
     * by applying surcharges to a base adult ticket price.
     */
    private void demonstrateSeatPricing() {
        System.out.println("\nSeat surcharges:");
        // Iterate through all available seat types
        for (SeatType st : SeatType.values()) {
            // Use adult base price as reference
            int baseAdult = PricingEngine.calculateBasePriceByAge(30);
            // Apply seat surcharge to calculate final price
            int price = PricingEngine.applySeatSurcharge(baseAdult, st);
            System.out.printf("%s seat -> $%d (including surcharge)%n", st, price);
        }
    }

    /**
     * Validates and reads an integer input from the user within a specified range.
     * Continuously prompts the user until a valid integer within the specified range is provided.
     * Handles invalid input gracefully with error messages.
     *
     * @param prompt The message to display when prompting the user
     * @param min The minimum allowed value (inclusive)
     * @param max The maximum allowed value (inclusive)
     * @return The validated integer input from the user
     */
    // ===== INPUT HELPERS =====
    private int readIntInRange(String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine();
            try {
                // Attempt to parse user input as integer
                int val = Integer.parseInt(line.trim());

                // Validate value is within acceptable range
                if (val < min || val > max) {
                    System.out.printf("Enter a number between %d and %d.%n", min, max);
                } else {
                    // Valid input, return the value
                    return val;
                }
            } catch (NumberFormatException e) {
                // Handle non-numeric input
                System.out.println("Invalid number. Try again.");
            }
        }
    }

    /**
     * Reads and validates a yes/no response from the user.
     * Accepts 'y', 'yes', 'n', or 'no' (case-insensitive).
     * Continuously prompts until a valid response is provided.
     *
     * @param prompt The message to display when prompting the user
     * @return true if user answers yes, false if user answers no
     */
    private boolean readYesNo(String prompt) {
        while (true) {
            System.out.print(prompt);
            String in = scanner.nextLine().trim().toLowerCase();

            // Check for affirmative responses
            if (in.equals("y") || in.equals("yes")) {
                return true;
            }
            // Check for negative responses
            if (in.equals("n") || in.equals("no")) {
                return false;
            }

            // Invalid response, prompt again
            System.out.println("Please answer y or n.");
        }
    }

    /**
     * Pauses execution and waits for the user to press Enter.
     * Used to allow users to review information before returning to the main menu.
     */
    private void waitForEnter() {
        System.out.print("\nPress Enter to continue...");
        scanner.nextLine();
    }
}
