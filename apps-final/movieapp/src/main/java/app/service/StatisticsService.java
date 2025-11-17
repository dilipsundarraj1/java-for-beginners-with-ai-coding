package app.service;

import java.util.ArrayList;
import java.util.List;

import app.domain.StatsSnapshot;
import app.domain.Ticket;

/**
 * StatisticsService is a utility class responsible for calculating and aggregating ticket sales statistics.
 * It provides methods to create snapshots of sales data including ticket counts, revenue, average prices,
 * and member participation metrics. It also manages the recording of ticket sales and revenue updates.
 */
public class StatisticsService {

    // Data persistence for the kiosk session
    private final List<Ticket> soldTickets = new ArrayList<>();
    // Updated after each finalized purchase batch
    private int totalRevenue = 0;

    /**
     * Records a batch of purchased tickets, updates total revenue, and creates a statistics snapshot.
     * This method orchestrates the complete tracking workflow:
     * 1. Adds all tickets from the purchase session to the persistent sold tickets list
     * 2. Accumulates the purchase amount to the total revenue
     * 3. Calculates and returns a comprehensive statistics snapshot
     *
     * This single method handles all data persistence and statistics calculation,
     * consolidating the complete tracking logic in one place.
     *
     * @param sessionTickets The list of tickets purchased in the current transaction
     * @param purchaseAmount The final amount paid for this transaction (including discounts)
     * @return A StatsSnapshot object containing all updated statistics after recording the purchase
     */
    public StatsSnapshot snapshot(List<Ticket> sessionTickets, int purchaseAmount) {
        // Add all tickets from this purchase session to the persistent soldTickets list
        soldTickets.addAll(sessionTickets);

        // Accumulate the purchase amount to the total revenue
        totalRevenue += purchaseAmount;

        // Calculate the total number of tickets sold
        int ticketsSold = soldTickets.size();

        // Calculate the average ticket price, defaulting to 0.0 if no tickets exist
        double average = ticketsSold == 0 ? 0.0 : soldTickets.stream().mapToInt(Ticket::price).average().orElse(0.0);

        // Count the number of member tickets
        long memberTickets = soldTickets.stream().filter(Ticket::member).count();

        // Calculate the percentage of member tickets, defaulting to 0 if no tickets exist
        int memberPct = ticketsSold == 0 ? 0 : (int)(memberTickets * 100 / ticketsSold);

        // Create and return a new statistics snapshot with all calculated metrics
        return new StatsSnapshot(ticketsSold, totalRevenue, average, memberTickets, memberPct);
    }

    /**
     * Creates a statistics snapshot for displaying current statistics without recording new purchases.
     * This method is used for displaying statistics without modifying the persistent data.
     * Calculates key metrics including:
     * - Total number of tickets sold
     * - Total revenue generated
     * - Average ticket price
     * - Total number of member tickets
     * - Percentage of member tickets
     *
     * @return A StatsSnapshot object containing aggregated statistics
     */
    public StatsSnapshot getSnapshot() {
        // Calculate the total number of tickets sold
        int ticketsSold = soldTickets.size();

        // Calculate the average ticket price, defaulting to 0.0 if no tickets exist
        double average = ticketsSold == 0 ? 0.0 : soldTickets.stream().mapToInt(Ticket::price).average().orElse(0.0);

        // Count the number of member tickets
        long memberTickets = soldTickets.stream().filter(Ticket::member).count();

        // Calculate the percentage of member tickets, defaulting to 0 if no tickets exist
        int memberPct = ticketsSold == 0 ? 0 : (int)(memberTickets * 100 / ticketsSold);

        // Create and return a new statistics snapshot with all calculated metrics
        return new StatsSnapshot(ticketsSold, totalRevenue, average, memberTickets, memberPct);
    }

    /**
     * Displays comprehensive kiosk statistics for the current session.
     * Shows:
     * 1. Total tickets sold
     * 2. Total revenue generated
     * 3. Average ticket price (if tickets exist)
     * 4. Number and percentage of member tickets (if tickets exist)
     *
     * This method handles all display logic for statistics, separating presentation
     * concerns from business logic.
     */
    public void displayStatistics() {
        System.out.println("\n=== Kiosk Statistics ===");

        // Get the current statistics snapshot
        StatsSnapshot snapshot = getSnapshot();

        // Display basic counts and revenue
        System.out.println("Tickets sold: " + snapshot.ticketsSold());
        System.out.println("Total revenue: $" + snapshot.totalRevenue());

        // Only display averages and percentages if tickets have been sold
        if (snapshot.ticketsSold() > 0) {
            // Display average ticket price from snapshot
            System.out.printf("Average ticket price: $%.2f%n", snapshot.averageTicketPrice());

            // Display member tickets and percentage
            System.out.println("Member tickets: " + snapshot.memberTickets() + " (" + snapshot.memberPercentage() + "%)");
        } else {
            // No sales yet, display informational message
            System.out.println("No tickets sold yet.");
        }
    }
}
