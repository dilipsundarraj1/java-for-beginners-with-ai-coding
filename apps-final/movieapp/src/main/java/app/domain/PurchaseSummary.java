package app.domain;

/**
 * Immutable summary of a purchase session.
 * Record provides automatic equals(), hashCode(), toString(), and constructor.
 */
public record PurchaseSummary(
    int ticketCount,
    int subtotal,
    int discount,
    int finalTotal
) {}
