package designs.parking_lot;

import java.util.HashMap;
import java.util.Map;

public class TicketManager {
    private static Map<String, Ticket> tickets = new HashMap<>();

    public static void addTicket(Ticket ticket) {
        tickets.put(ticket.getTicketId(), ticket);
    }

    public static Ticket getTicket(String ticketId) {
        return tickets.get(ticketId);
    }

    public static void removeTicket(String ticketId) {
        tickets.remove(ticketId);
    }
}

