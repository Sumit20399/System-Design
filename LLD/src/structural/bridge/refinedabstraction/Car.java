package structural.bridge.refinedabstraction;

import structural.bridge.abstraction.Vehicle;
import structural.bridge.implementor.Workshop;

public class Car extends Vehicle {
    public Car(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        System.out.println("Car manufacturing in progress:");
        workshop1.work();
        workshop2.work();
    }
}
