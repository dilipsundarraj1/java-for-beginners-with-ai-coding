package app.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicInteger;

public class Ticket {
    private static final AtomicInteger COUNTER = new AtomicInteger(1);
    private final int id;
    private final int age;
    private final boolean member;
    private final SeatType seatType;
    private final int price;
    private final LocalDateTime purchasedAt;

    public Ticket(int age, boolean member, SeatType seatType, int price) {
        this.id = COUNTER.getAndIncrement();
        this.age = age;
        this.member = member;
        this.seatType = seatType;
        this.price = price;
        this.purchasedAt = LocalDateTime.now();
    }

    public int getId() { return id; }
    public int getAge() { return age; }
    public boolean isMember() { return member; }
    public SeatType getSeatType() { return seatType; }
    public int getPrice() { return price; }
    public LocalDateTime getPurchasedAt() { return purchasedAt; }
    public String ageCategory() { return AgeCategoryUtil.getAgeCategoryName(age); }
    public String formattedTimestamp() { return purchasedAt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")); }

    @Override public String toString() {
        return "Ticket{" + "id=" + id + ", age=" + age + ", member=" + member + ", seatType=" + seatType + ", price=" + price + ", purchasedAt=" + formattedTimestamp() + '}';
    }
}

