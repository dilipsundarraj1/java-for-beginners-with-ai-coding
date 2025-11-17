package app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.domain.PurchaseResult;
import app.domain.PurchaseSummary;
import app.domain.SeatType;
import app.domain.Ticket;

public class TicketPurchaseService {
    PurchaseService purchaseService = new PurchaseService();

    /**
     * Orchestrates the ticket purchase process.
     * Guides the user through selecting tickets, viewing a summary, and confirming the purchase.
     *
     * @param scanner The Scanner object used to read user input
     * @return A PurchaseResult object containing the list of purchased tickets, purchase summary, and confirmation status
     */
    public PurchaseResult run(Scanner scanner) {
        System.out.println("\n=== Ticket Purchase ===");
        List<Ticket> sessionTickets = new ArrayList<>();
        boolean addMore = true;

        // Loop to allow user to add multiple tickets
        while (addMore) {
            // Collect ticket details from the user
            int age = readIntInRange(scanner, "Enter age (0-120): ", 0, 120);
            boolean member = readYesNo(scanner, "Are you a member? (y/n): ");
            SeatType seatType = readSeatType(scanner);

            // Create ticket and add to session list
            Ticket ticket = purchaseService.createTicket(age, member, seatType);
            sessionTickets.add(ticket);
            System.out.println("Ticket added: ID " + ticket.id() + ", Price $" + ticket.price() + ", Category: " + PricingEngine.determineTicketCategory(age, member, seatType));

            // Ask if user wants to add another ticket
            addMore = readYesNo(scanner, "Add another ticket? (y/n): ");
        }

        // Check if no tickets were selected
        if (sessionTickets.isEmpty()) {
            System.out.println("No tickets selected.");
            return new PurchaseResult(List.of(), null, false);
        }

        // Generate purchase summary
        PurchaseSummary summary = purchaseService.summarize(sessionTickets);
        printSummary(sessionTickets, summary);

        // Ask for purchase confirmation
        boolean confirm = readYesNo(scanner, "Confirm purchase? (y/n): ");
        if (confirm) {
            System.out.println("Purchase completed. Enjoy the show!\n");
            return new PurchaseResult(sessionTickets, summary, true);
        }

        // Purchase was cancelled
        System.out.println("Purchase cancelled.");
        return new PurchaseResult(List.of(), null, false);
    }

    /**
     * Displays a formatted summary of the selected tickets and pricing information.
     * Shows individual ticket details and the total cost breakdown.
     *
     * @param sessionTickets The list of Ticket objects to display
     * @param summary The PurchaseSummary object containing pricing and discount information
     */
    private void printSummary(List<Ticket> sessionTickets, PurchaseSummary summary) {
        System.out.println("\n--- Order Summary ---");

        // Display details for each ticket
        for (Ticket t : sessionTickets) {
            System.out.printf("Ticket #%d | Age %d (%s) | %s | %s | $%d%n", t.id(), t.age(), t.ageCategory(), t.member() ? "Member" : "Non-Member", t.seatType(), t.price());
        }

        // Display pricing breakdown
        System.out.println("Tickets: " + summary.ticketCount());
        System.out.println("Subtotal: $" + summary.subtotal());
        System.out.println(summary.discount() > 0 ? ("Bulk Discount: -$" + summary.discount()) : "No bulk discount");
        System.out.println("Final Total: $" + summary.finalTotal());
    }

    /**
     * Validates and reads an integer input from the user within a specified range.
     * Continuously prompts the user until a valid input within range is provided.
     *
     * @param scanner The Scanner object used to read user input
     * @param prompt The message to display when prompting the user
     * @param min The minimum allowed value (inclusive)
     * @param max The maximum allowed value (inclusive)
     * @return The validated integer input from the user
     */
    private int readIntInRange(Scanner scanner, String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine();
            try {
                // Parse user input as integer
                int val = Integer.parseInt(line.trim());

                // Validate that value is within range
                if (val < min || val > max) {
                    System.out.printf("Enter a number between %d and %d.%n", min, max);
                } else {
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
     *
     * @param scanner The Scanner object used to read user input
     * @param prompt The message to display when prompting the user
     * @return true if user answers yes, false if user answers no
     */
    private boolean readYesNo(Scanner scanner, String prompt) {
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

            // Invalid input - prompt again
            System.out.println("Please answer y or n.");
        }
    }

    /**
     * Reads and validates a seat type selection from the user.
     * Continues to prompt until a valid seat type is provided.
     *
     * @param scanner The Scanner object used to read user input
     * @return The validated SeatType selected by the user
     */
    private SeatType readSeatType(Scanner scanner) {
        while (true) {
            System.out.print("Seat type (REGULAR, PREMIUM, RECLINER): ");
            String raw = scanner.nextLine();

            // Convert user input to SeatType enum
            SeatType st = SeatType.fromString(raw);
            if (st != null) {
                return st;
            }

            // Invalid seat type - prompt again
            System.out.println("Invalid seat type. Try again.");
        }
    }
}
