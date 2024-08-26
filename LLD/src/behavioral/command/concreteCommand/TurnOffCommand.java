package behavioral.command.concreteCommand;

import behavioral.command.commandInterface.Command;
import behavioral.command.receiver.Device;

public class TurnOffCommand implements Command {

    private Device device;

    public TurnOffCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}
