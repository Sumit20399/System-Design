package behavioral.mediator.colleagueInterface;

// Colleague Interface
public interface Airplane {
    void requestTakeoff();
    void requestLanding();
    void notifyAirTrafficControl(String message);
}

