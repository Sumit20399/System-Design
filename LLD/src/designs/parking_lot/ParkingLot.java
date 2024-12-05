package designs.parking_lot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private String id;
    private List<ParkingFloor> floors;

    public ParkingLot(String id) {
        this.id = id;
        this.floors = new ArrayList<>();
    }

    public void addFloor(ParkingFloor floor) {
        floors.add(floor);
    }

    public ParkingSpot parkVehicle(Vehicle vehicle) {
        for (ParkingFloor floor : floors) {
            ParkingSpot spot = floor.findSpotForVehicle(vehicle);
            if (spot != null) {
                spot.parkVehicle(vehicle);
                return spot;
            }
        }
        return null;
    }

    public void vacateSpot(String spotId) {
        for (ParkingFloor floor : floors) {
            ParkingSpot spot = floor.getSpotById(spotId);
            if (spot != null) {
                spot.removeVehicle();
                break;
            }
        }
    }
}
