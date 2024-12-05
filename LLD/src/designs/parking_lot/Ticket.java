package designs.parking_lot;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {
    private String ticketId;
    private Vehicle vehicle;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public Ticket(String ticketId, Vehicle vehicle) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.entryTime = LocalDateTime.now();
    }

    public void setExitTime() {
        this.exitTime = LocalDateTime.now();
    }

    public double calculateCharges() {
        long durationInHours = Duration.between(entryTime, exitTime).toHours();
        return durationInHours * 10; // Example rate: Rs.10/hour
    }

    public String getTicketId() {
        return ticketId;
    }
}

