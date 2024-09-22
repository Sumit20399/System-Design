package behavioral.state.concreteState;

import behavioral.state.stateInterface.VendingMachineState;

public class PaymentPendingState implements VendingMachineState {
    @Override
    public void handleRequest() {
        System.out.println("Payment pending state: Dispensing product.");
    }
}
