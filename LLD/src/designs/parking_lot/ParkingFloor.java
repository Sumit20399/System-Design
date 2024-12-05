package designs.parking_lot;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloor {
    private String name;
    private Map<String, ParkingSpot> spots;

    public ParkingFloor(String name) {
        this.name = name;
        this.spots = new HashMap<>();
    }

    public void addSpot(ParkingSpot spot) {
        spots.put(spot.getId(), spot);
    }

    public ParkingSpot findSpotForVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : spots.values()) {
            if (spot.isAvailable() && spot.canPark(vehicle)) {
                return spot;
            }
        }
        return null;
    }

    public ParkingSpot getSpotById(String spotId) {
        return spots.get(spotId);
    }
}

