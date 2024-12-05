package structural.bridge;

import structural.bridge.abstraction.Vehicle;
import structural.bridge.concreteimplementor.RepairWorkshop;
import structural.bridge.concreteimplementor.ServiceWorkshop;
import structural.bridge.implementor.Workshop;
import structural.bridge.refinedabstraction.Bike;
import structural.bridge.refinedabstraction.Car;

public class BridgePatternExample {
    public static void main(String[] args) {
        Workshop repair = new RepairWorkshop();
        Workshop service = new ServiceWorkshop();

        Vehicle car = new Car(repair, service);
        Vehicle bike = new Bike(service, repair);

        car.manufacture();
        System.out.println();
        bike.manufacture();
    }
}
