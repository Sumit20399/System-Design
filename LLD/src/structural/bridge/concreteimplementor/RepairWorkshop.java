package structural.bridge.concreteimplementor;

import structural.bridge.implementor.Workshop;

public class RepairWorkshop implements Workshop {
    @Override
    public void work() {
        System.out.println("Repairing the vehicle...");
    }
}
