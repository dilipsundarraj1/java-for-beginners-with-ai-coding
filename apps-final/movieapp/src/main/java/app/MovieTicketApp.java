package app;

import app.service.StatisticsService;
import app.service.TicketPurchaseService;

/**
 * Entry point for the Movie Ticket Kiosk application.
 */
public class MovieTicketApp {
    public static void main(String[] args) {
        System.out.println("\n🎬 Welcome to the Movie Ticket Kiosk! 🎬");
        System.out.println("---------------------------------------");
        TicketPurchaseService ticketPurchaseService = new TicketPurchaseService();
        StatisticsService statisticsService = new StatisticsService();
        MovieTicketKiosk kiosk = new MovieTicketKiosk(ticketPurchaseService, statisticsService);
        kiosk.run();
        System.out.println("\nThank you for using the Movie Ticket Kiosk. Goodbye! 🍿");
    }
}

