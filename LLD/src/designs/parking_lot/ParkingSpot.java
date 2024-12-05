package designs.parking_lot;

public class ParkingSpot {
    private String id;
    private ParkingSpotType type;
    private boolean isAvailable;
    private Vehicle parkedVehicle;

    public ParkingSpot(String id, ParkingSpotType type) {
        this.id = id;
        this.type = type;
        this.isAvailable = true;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        if (!isAvailable || !canPark(vehicle)) return false;
        this.parkedVehicle = vehicle;
        this.isAvailable = false;
        return true;
    }

    public void removeVehicle() {
        this.parkedVehicle = null;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getId() {
        return id;
    }

    public boolean canPark(Vehicle vehicle) {
        switch (vehicle.getType()) {
            case BIKE:
                return type == ParkingSpotType.SMALL || type == ParkingSpotType.MEDIUM || type == ParkingSpotType.LARGE;
            case CAR:
                return type == ParkingSpotType.MEDIUM || type == ParkingSpotType.LARGE;
            case TRUCK:
                return type == ParkingSpotType.LARGE;
            default:
                return false;
        }
    }
}

