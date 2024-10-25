package creational.builder;

public class House {
    // Required parameters
    private final int floors;
    private final int rooms;

    // Optional parameters
    private final boolean hasGarage;
    private final boolean hasGarden;
    private final boolean hasSwimmingPool;

    // Private constructor only accessible by the Builder
    private House(HouseBuilder builder) {
        this.floors = builder.floors;
        this.rooms = builder.rooms;
        this.hasGarage = builder.hasGarage;
        this.hasGarden = builder.hasGarden;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    // Getters for the parameters
    public int getFloors() {
        return floors;
    }

    public int getRooms() {
        return rooms;
    }

    public boolean hasGarage() {
        return hasGarage;
    }

    public boolean hasGarden() {
        return hasGarden;
    }

    public boolean hasSwimmingPool() {
        return hasSwimmingPool;
    }

    @Override
    public String toString() {
        return "House [floors=" + floors + ", rooms=" + rooms + ", hasGarage=" + hasGarage +
                ", hasGarden=" + hasGarden + ", hasSwimmingPool=" + hasSwimmingPool + "]";
    }

    // Static nested builder class
    public static class HouseBuilder {
        // Required parameters
        private final int floors;
        private final int rooms;

        // Optional parameters with default values
        private boolean hasGarage = false;
        private boolean hasGarden = false;
        private boolean hasSwimmingPool = false;

        // Constructor for required parameters
        public HouseBuilder(int floors, int rooms) {
            this.floors = floors;
            this.rooms = rooms;
        }

        // Setter-like methods for optional parameters, returning the builder
        public HouseBuilder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public HouseBuilder setSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        // Build method to create the House object
        public House build() {
            return new House(this);
        }
    }
}
