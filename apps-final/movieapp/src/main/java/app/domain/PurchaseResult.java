package app.domain;

import java.util.Collections;
import java.util.List;

public class PurchaseResult {
    private final List<Ticket> tickets;
    private final PurchaseSummary summary; // nullable when not confirmed
    private final boolean confirmed;

    public PurchaseResult(List<Ticket> tickets, PurchaseSummary summary, boolean confirmed) {
        this.tickets = tickets == null ? List.of() : Collections.unmodifiableList(tickets);
        this.summary = summary;
        this.confirmed = confirmed;
    }
    public List<Ticket> getTickets() { return tickets; }
    public PurchaseSummary getSummary() { return summary; }
    public boolean isConfirmed() { return confirmed; }
}

