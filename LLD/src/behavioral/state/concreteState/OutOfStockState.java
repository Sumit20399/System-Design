package behavioral.state.concreteState;

import behavioral.state.stateInterface.VendingMachineState;

public class OutOfStockState implements VendingMachineState {
    @Override
    public void handleRequest() {
        System.out.println("Out of stock state: Product unavailable. Please select another product.");
    }
}
