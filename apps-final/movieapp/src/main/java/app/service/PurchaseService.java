package app.service;

import java.util.List;

import app.domain.PurchaseSummary;
import app.domain.SeatType;
import app.domain.Ticket;

public class PurchaseService {
    public Ticket createTicket(int age, boolean member, SeatType seatType) {
        int price = PricingEngine.calculateTicketPrice(age, member, seatType);
        return new Ticket(age, member, seatType, price);
    }
    public PurchaseSummary summarize(List<Ticket> tickets) {
        int subtotal = tickets.stream().mapToInt(Ticket::getPrice).sum();
        int finalTotal = PricingEngine.calculateBulkDiscount(subtotal, tickets.size());
        int discount = subtotal - finalTotal;
        return new PurchaseSummary(tickets.size(), subtotal, discount, finalTotal);
    }
}

