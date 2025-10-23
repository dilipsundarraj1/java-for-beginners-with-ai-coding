package app;

import app.domain.PurchaseResult;
import app.domain.SeatType;
import app.domain.Ticket;
import app.domain.StatsSnapshot;
import app.service.PricingEngine;
import app.service.PurchaseService;
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
 */
public class MovieTicketKiosk {

    private final PurchaseService purchaseService = new PurchaseService();
    private final Scanner scanner;
    private final TicketPurchaseService ticketPurchaseService;
    private final StatisticsService statisticsService;
    private final List<Ticket> soldTickets = new ArrayList<>();
    private int totalRevenue = 0; // Updated after each finalized purchase batch

    public MovieTicketKiosk(TicketPurchaseService ticketPurchaseService, StatisticsService statisticsService) {
        this.scanner = new Scanner(System.in);
        this.ticketPurchaseService = ticketPurchaseService;
        this.statisticsService = statisticsService;
    }

    public void run() {
        boolean keepRunning = true;
        while (keepRunning) {
            showMainMenu();
            int choice = readIntInRange("Select option (1-4): ", 1, 4);
            switch (choice) {
                case 1 -> buyTicketsFlow();
                case 2 -> showPricingInformation();
                case 3 -> showStatistics();
                case 4 -> {
                    keepRunning = false;
                    System.out.println("Exiting kiosk... Goodbye!");
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
            if (keepRunning) waitForEnter();
        }
    }

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

    // ===== BUY TICKETS FLOW =====
    private void buyTicketsFlow() {
        System.out.println("\n=== Ticket Purchase ===");
        PurchaseResult purchaseResult = ticketPurchaseService.run(scanner, purchaseService);

        System.out.println("\n--- Order Summary ---");
        for (Ticket t : purchaseResult.getTickets()) {
            System.out.printf("Ticket #%d | Age %d (%s) | %s | %s | $%d%n",
                    t.getId(), t.getAge(), t.ageCategory(), t.isMember() ? "Member" : "Non-Member", t.getSeatType(), t.getPrice());
        }
        var sessionTickets = purchaseResult.getTickets();
        var discount = purchaseResult.getSummary().getDiscount();
        System.out.println("Tickets: " + sessionTickets.size());
        System.out.println("Subtotal: $" + purchaseResult.getSummary().getSubtotal());
        System.out.println(discount > 0 ? ("Bulk Discount: -$" + purchaseResult.getSummary().getDiscount()) : "No bulk discount");
        System.out.println("Final Total: $" + purchaseResult.getSummary().getFinalTotal());

        boolean confirm = readYesNo("Confirm purchase? (y/n): ");
        if (confirm) {
            soldTickets.addAll(sessionTickets);
            totalRevenue += purchaseResult.getSummary().getFinalTotal();
            System.out.println("Purchase completed. Enjoy the show!\n");

            // Display updated statistics snapshot
            StatsSnapshot snapshot = statisticsService.snapshot(soldTickets, totalRevenue);
            System.out.printf("Updated Stats -> Tickets Sold: %d | Revenue: $%d | Avg Price: %.2f | Member %%: %d%%%n",
                    snapshot.getTicketsSold(), snapshot.getTotalRevenue(), snapshot.getAverageTicketPrice(), snapshot.getMemberPercentage());
        } else {
            System.out.println("Purchase cancelled.");
        }
    }

    // ===== PRICING INFO =====
    private void showPricingInformation() {
        System.out.println("\n=== Pricing Information ===");
        demonstrateAgePricing();
        demonstrateSeatPricing();
        System.out.println("Member Discount: $1 off base price (not below $0)");
        System.out.println("Bulk Discount: $2 off for every 5 tickets in a single order.");
        System.out.println("\nCategory Examples:");
        System.out.println("Child Member Premium: " + PricingEngine.determineTicketCategory(8, true, SeatType.PREMIUM));
        System.out.println("Adult Regular Standard: " + PricingEngine.determineTicketCategory(30, false, SeatType.REGULAR));
        System.out.println("Senior Member Luxury: " + PricingEngine.determineTicketCategory(65, true, SeatType.RECLINER));
    }

    private void demonstrateAgePricing() {
        System.out.println("Age-based pricing:");
        int[] ages = {2, 8, 15, 25, 59, 60, 75};
        for (int age : ages) {
            int price = PricingEngine.calculateBasePriceByAge(age);
            String label = price == 0 ? "FREE" : "$" + price;
            System.out.printf("Age %d (%s): %s%n", age, PricingEngine.getAgeCategoryName(age), label);
        }
    }

    private void demonstrateSeatPricing() {
        System.out.println("\nSeat surcharges:");
        for (SeatType st : SeatType.values()) {
            int baseAdult = PricingEngine.calculateBasePriceByAge(30);
            int price = PricingEngine.applySeatSurcharge(baseAdult, st);
            System.out.printf("%s seat -> $%d (including surcharge)%n", st, price);
        }
    }

    // ===== STATS =====
    private void showStatistics() {
        System.out.println("\n=== Kiosk Statistics ===");
        System.out.println("Tickets sold: " + soldTickets.size());
        System.out.println("Total revenue: $" + totalRevenue);
        if (!soldTickets.isEmpty()) {
            double avg = soldTickets.stream().mapToInt(Ticket::getPrice).average().orElse(0);
            System.out.printf("Average ticket price: $%.2f%n", avg);
            long members = soldTickets.stream().filter(Ticket::isMember).count();
            System.out.println("Member tickets: " + members + " (" + (members * 100 / soldTickets.size()) + "%)");
        } else {
            System.out.println("No tickets sold yet.");
        }
    }

    // ===== INPUT HELPERS =====
    private int readIntInRange(String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine();
            try {
                int val = Integer.parseInt(line.trim());
                if (val < min || val > max) {
                    System.out.printf("Enter a number between %d and %d.%n", min, max);
                } else return val;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
            }
        }
    }

    private boolean readYesNo(String prompt) {
        while (true) {
            System.out.print(prompt);
            String in = scanner.nextLine().trim().toLowerCase();
            if (in.equals("y") || in.equals("yes")) return true;
            if (in.equals("n") || in.equals("no")) return false;
            System.out.println("Please answer y or n.");
        }
    }

    private SeatType readSeatType() {
        while (true) {
            System.out.print("Seat type (REGULAR, PREMIUM, RECLINER): ");
            String raw = scanner.nextLine();
            SeatType st = SeatType.fromString(raw);
            if (st != null) return st;
            System.out.println("Invalid seat type. Try again.");
        }
    }

    private void waitForEnter() {
        System.out.print("\nPress Enter to continue...");
        scanner.nextLine();
    }
}
