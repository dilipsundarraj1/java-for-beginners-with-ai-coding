package app.domain;

import app.util.AgeCategoryUtil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Record representing a purchased movie ticket.
 * Uses a compact constructor to auto-generate ID and timestamp.
 * Compact constructor allows custom initialization logic while keeping record benefits.
 */
public record Ticket(
    int id,
    int age,
    boolean member,
    SeatType seatType,
    int price,
    LocalDateTime purchasedAt
) {
    private static final AtomicInteger COUNTER = new AtomicInteger(1);

    /**
     * Compact constructor for Ticket record.
     * Auto-generates ID and timestamp on record creation.
     * Note: This constructor is called instead of the generated one.
     */
    public Ticket(int age, boolean member, SeatType seatType, int price) {
        this(
            COUNTER.getAndIncrement(),  // Auto-generate ID
            age,
            member,
            seatType,
            price,
            LocalDateTime.now()         // Auto-generate timestamp
        );
    }

    /**
     * Returns the age category for this ticket holder.
     */
    public String ageCategory() {
        return AgeCategoryUtil.getAgeCategoryName(age);
    }

    /**
     * Returns the purchase timestamp formatted as a string.
     */
    public String formattedTimestamp() {
        return purchasedAt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    /**
     * Override toString to use custom formatting including formattedTimestamp.
     */
    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", age=" + age +
                ", member=" + member +
                ", seatType=" + seatType +
                ", price=" + price +
                ", purchasedAt=" + formattedTimestamp() +
                '}';
    }
}
