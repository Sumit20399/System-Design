package designs.parking_lot;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a Parking Lot
        ParkingLot lot = new ParkingLot("P1");

        // Step 2: Add a Floor with Parking Spots
        ParkingFloor floor1 = new ParkingFloor("F1");
        floor1.addSpot(new ParkingSpot("S1", ParkingSpotType.SMALL));
        floor1.addSpot(new ParkingSpot("S2", ParkingSpotType.MEDIUM));
        floor1.addSpot(new ParkingSpot("S3", ParkingSpotType.LARGE));
        lot.addFloor(floor1);

        // Step 3: Park a Vehicle
        Vehicle car = new Car("KA01AB1234");
        ParkingSpot spot = lot.parkVehicle(car);

        if (spot != null) {
            System.out.println("Vehicle parked at spot: " + spot.getId());

            // Issue a ticket
            String ticketId = UUID.randomUUID().toString(); // Generate a unique ticket ID
            Ticket ticket = new Ticket(ticketId, car);

            // Store the ticket for tracking (optional in a real-world system)
            TicketManager.addTicket(ticket);

            System.out.println("Ticket issued: " + ticket.getTicketId() + " for vehicle: " + car.getLicensePlate());

            // Simulate some parking time
            try {
                Thread.sleep(2000); // Simulate a 2-second stay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Step 4: Vacate the Spot and Calculate Charges
            lot.vacateSpot(spot.getId());
            ticket.setExitTime();
            double charges = ticket.calculateCharges();
            System.out.println("Vehicle vacated. Parking charges: Rs." + charges);
        } else {
            System.out.println("Parking full!");
        }
    }
}
