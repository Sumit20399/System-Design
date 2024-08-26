package behavioral.command.concreteCommand;

import behavioral.command.commandInterface.Command;
import behavioral.command.receiver.Device;

public class TurnOnCommand implements Command {

    private Device device;

    public TurnOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
