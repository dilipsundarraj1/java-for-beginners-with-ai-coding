package app.service;

import java.util.List;

import app.domain.StatsSnapshot;
import app.domain.Ticket;

public class StatisticsService {
    public StatsSnapshot snapshot(List<Ticket> tickets, int totalRevenue) {
        int ticketsSold = tickets.size();
        double average = ticketsSold == 0 ? 0.0 : tickets.stream().mapToInt(Ticket::getPrice).average().orElse(0.0);
        long memberTickets = tickets.stream().filter(Ticket::isMember).count();
        int memberPct = ticketsSold == 0 ? 0 : (int)(memberTickets * 100 / ticketsSold);
        return new StatsSnapshot(ticketsSold, totalRevenue, average, memberTickets, memberPct);
    }
}

