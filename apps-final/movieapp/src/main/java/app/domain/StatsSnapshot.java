package app.domain;

/**
 * Immutable snapshot of kiosk statistics at a point in time.
 * Record provides automatic equals(), hashCode(), toString(), and constructor.
 */
public record StatsSnapshot(
    int ticketsSold,
    int totalRevenue,
    double averageTicketPrice,
    long memberTickets,
    int memberPercentage
) {}
