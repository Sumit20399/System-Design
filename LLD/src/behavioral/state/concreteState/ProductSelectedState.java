package behavioral.state.concreteState;

import behavioral.state.stateInterface.VendingMachineState;

public class ProductSelectedState implements VendingMachineState {
    @Override
    public void handleRequest() {
        System.out.println("Product selected state: Processing payment.");
    }
}
