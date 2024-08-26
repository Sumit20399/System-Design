package behavioral.command.concreteCommand;

import behavioral.command.commandInterface.Command;
import behavioral.command.receiver.TV;

public class ChangeChannelCommand implements Command {

    private TV tv;

    public ChangeChannelCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }
}
