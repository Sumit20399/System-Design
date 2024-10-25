package creational.builder;

public class BuilderPattern {
    public static void main(String[] args) {
        // Building a house with a garage and garden
        House house1 = new House.HouseBuilder(2, 4)
                .setGarage(true)
                .setGarden(true)
                .build();
        System.out.println(house1);

        // Building a house with all optional features
        House house2 = new House.HouseBuilder(3, 5)
                .setGarage(true)
                .setGarden(true)
                .setSwimmingPool(true)
                .build();
        System.out.println(house2);

        // Building a basic house with no optional features
        House house3 = new House.HouseBuilder(1, 2).build();
        System.out.println(house3);
    }
}

