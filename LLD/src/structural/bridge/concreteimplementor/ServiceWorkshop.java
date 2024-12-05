package structural.bridge.concreteimplementor;

import structural.bridge.implementor.Workshop;

public class ServiceWorkshop implements Workshop {
    @Override
    public void work() {
        System.out.println("Servicing the vehicle...");
    }
}
