package behavioral.command.client;

import behavioral.command.commandInterface.Command;
import behavioral.command.concreteCommand.AdjustVolumeCommand;
import behavioral.command.concreteCommand.ChangeChannelCommand;
import behavioral.command.concreteCommand.TurnOffCommand;
import behavioral.command.concreteCommand.TurnOnCommand;
import behavioral.command.invoker.RemoteControl;
import behavioral.command.receiver.Stereo;
import behavioral.command.receiver.TV;

public class Client {

    public static void main(String[] args) {
        // Create devices
        TV tv = new TV();
        Stereo stereo = new Stereo();

        // Create command objects
        Command turnOnTVCommand = new TurnOnCommand(tv);
        Command turnOffTVCommand = new TurnOffCommand(tv);
        Command adjustVolumeStereoCommand = new AdjustVolumeCommand(stereo);
        Command changeChannelTVCommand = new ChangeChannelCommand(tv);

        // Create remote control
        RemoteControl remote = new RemoteControl();

        // Set and execute commands
        remote.setCommand(turnOnTVCommand);
        remote.pressButton(); // Outputs: TV is now on

        remote.setCommand(adjustVolumeStereoCommand);
        remote.pressButton(); // Outputs: Volume adjusted

        remote.setCommand(changeChannelTVCommand);
        remote.pressButton(); // Outputs: Channel changed

        remote.setCommand(turnOffTVCommand);
        remote.pressButton(); // Outputs: TV is now off
    }
}
