package app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.domain.PurchaseResult;
import app.domain.PurchaseSummary;
import app.domain.SeatType;
import app.domain.Ticket;

public class TicketPurchaseService {


    public PurchaseResult run(Scanner scanner, PurchaseService purchaseService) {
        System.out.println("\n=== Ticket Purchase ===");
        List<Ticket> sessionTickets = new ArrayList<>();
        boolean addMore = true;
        while (addMore) {
            int age = readIntInRange(scanner, "Enter age (0-120): ", 0, 120);
            boolean member = readYesNo(scanner, "Are you a member? (y/n): ");
            SeatType seatType = readSeatType(scanner);
            Ticket ticket = purchaseService.createTicket(age, member, seatType);
            sessionTickets.add(ticket);
            System.out.println("Ticket added: ID " + ticket.getId() + ", Price $" + ticket.getPrice() + ", Category: " + PricingEngine.determineTicketCategory(age, member, seatType));
            addMore = readYesNo(scanner, "Add another ticket? (y/n): ");
        }
        if (sessionTickets.isEmpty()) {
            System.out.println("No tickets selected.");
            return new PurchaseResult(List.of(), null, false);
        }
        PurchaseSummary summary = purchaseService.summarize(sessionTickets);
        printSummary(sessionTickets, summary);
        boolean confirm = readYesNo(scanner, "Confirm purchase? (y/n): ");
        if (confirm) {
            System.out.println("Purchase completed. Enjoy the show!\n");
            return new PurchaseResult(sessionTickets, summary, true);
        }
        System.out.println("Purchase cancelled.");
        return new PurchaseResult(List.of(), null, false);
    }

    private void printSummary(List<Ticket> sessionTickets, PurchaseSummary summary) {
        System.out.println("\n--- Order Summary ---");
        for (Ticket t : sessionTickets) {
            System.out.printf("Ticket #%d | Age %d (%s) | %s | %s | $%d%n", t.getId(), t.getAge(), t.ageCategory(), t.isMember() ? "Member" : "Non-Member", t.getSeatType(), t.getPrice());
        }
        System.out.println("Tickets: " + summary.getTicketCount());
        System.out.println("Subtotal: $" + summary.getSubtotal());
        System.out.println(summary.getDiscount() > 0 ? ("Bulk Discount: -$" + summary.getDiscount()) : "No bulk discount");
        System.out.println("Final Total: $" + summary.getFinalTotal());
    }

    private int readIntInRange(Scanner scanner, String prompt, int min, int max) {
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

    private boolean readYesNo(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String in = scanner.nextLine().trim().toLowerCase();
            if (in.equals("y") || in.equals("yes")) return true;
            if (in.equals("n") || in.equals("no")) return false;
            System.out.println("Please answer y or n.");
        }
    }

    private SeatType readSeatType(Scanner scanner) {
        while (true) {
            System.out.print("Seat type (REGULAR, PREMIUM, RECLINER): ");
            String raw = scanner.nextLine();
            SeatType st = SeatType.fromString(raw);
            if (st != null) return st;
            System.out.println("Invalid seat type. Try again.");
        }
    }
}

