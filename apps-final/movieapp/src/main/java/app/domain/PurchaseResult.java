package app.domain;

import java.util.Collections;
import java.util.List;

/**
 * Immutable record wrapping the result of a purchase transaction.
 * Provides unmodifiable list and automatic accessor methods.
 */
public record PurchaseResult(
    List<Ticket> tickets,
    PurchaseSummary summary,
    boolean confirmed
) {
    /**
     * Compact constructor ensures tickets list is unmodifiable.
     */
    public PurchaseResult {
        tickets = tickets == null ? List.of() : Collections.unmodifiableList(tickets);
    }
}
