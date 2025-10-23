package app.domain;

/** Immutable summary of a purchase session. */
public class PurchaseSummary {
    private final int ticketCount;
    private final int subtotal;
    private final int discount;
    private final int finalTotal;

    public PurchaseSummary(int ticketCount, int subtotal, int discount, int finalTotal) {
        this.ticketCount = ticketCount;
        this.subtotal = subtotal;
        this.discount = discount;
        this.finalTotal = finalTotal;
    }
    public int getTicketCount() { return ticketCount; }
    public int getSubtotal() { return subtotal; }
    public int getDiscount() { return discount; }
    public int getFinalTotal() { return finalTotal; }
}

