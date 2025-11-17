package app.service;

import java.util.List;

import app.domain.PurchaseSummary;
import app.domain.SeatType;
import app.domain.Ticket;

public class PurchaseService {
    /**
     * Creates a new Ticket object with the specified parameters.
     * Calculates the ticket price based on age, membership status, and seat type,
     * then instantiates a new Ticket with all the details.
     *
     * @param age The age of the ticket holder (0-120)
     * @param member Whether the ticket holder is a member (true/false)
     * @param seatType The type of seat selected (REGULAR, PREMIUM, RECLINER)
     * @return A new Ticket object with the calculated price and provided parameters
     */
    public Ticket createTicket(int age, boolean member, SeatType seatType) {
        // Calculate the ticket price based on age, membership, and seat type
        int price = PricingEngine.calculateTicketPrice(age, member, seatType);
        // Create and return a new ticket with the calculated price
        return new Ticket(age, member, seatType, price);
    }

    /**
     * Generates a purchase summary for a list of tickets.
     * Calculates the subtotal, applies bulk discounts if applicable, and creates
     * a summary object containing ticket count, pricing, and discount information.
     *
     * @param tickets The list of Ticket objects to summarize
     * @return A PurchaseSummary object containing ticket count, subtotal, discount, and final total
     */
    public PurchaseSummary summarize(List<Ticket> tickets) {
        // Calculate the subtotal by summing all ticket prices
        int subtotal = tickets.stream().mapToInt(Ticket::price).sum();
        // Apply bulk discount calculation based on subtotal and ticket quantity
        int finalTotal = PricingEngine.calculateBulkDiscount(subtotal, tickets.size());
        // Calculate the discount amount as the difference between subtotal and final total
        int discount = subtotal - finalTotal;
        // Create and return a summary object with all pricing information
        return new PurchaseSummary(tickets.size(), subtotal, discount, finalTotal);
    }
}
