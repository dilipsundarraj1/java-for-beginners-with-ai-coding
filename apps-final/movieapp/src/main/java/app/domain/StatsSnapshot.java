package app.domain;

public class StatsSnapshot {
    private final int ticketsSold;
    private final int totalRevenue;
    private final double averageTicketPrice;
    private final long memberTickets;
    private final int memberPercentage;

    public StatsSnapshot(int ticketsSold, int totalRevenue, double averageTicketPrice, long memberTickets, int memberPercentage) {
        this.ticketsSold = ticketsSold;
        this.totalRevenue = totalRevenue;
        this.averageTicketPrice = averageTicketPrice;
        this.memberTickets = memberTickets;
        this.memberPercentage = memberPercentage;
    }
    public int getTicketsSold() { return ticketsSold; }
    public int getTotalRevenue() { return totalRevenue; }
    public double getAverageTicketPrice() { return averageTicketPrice; }
    public long getMemberTickets() { return memberTickets; }
    public int getMemberPercentage() { return memberPercentage; }
}

