package structural.bridge.refinedabstraction;

import structural.bridge.abstraction.Vehicle;
import structural.bridge.implementor.Workshop;

public class Bike extends Vehicle {
    public Bike(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        System.out.println("Bike manufacturing in progress:");
        workshop1.work();
        workshop2.work();
    }
}
