package behavioral.command.concreteCommand;

import behavioral.command.commandInterface.Command;
import behavioral.command.receiver.Stereo;

public class AdjustVolumeCommand implements Command {

    private Stereo stereo;

    public AdjustVolumeCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.adjustVolume();
    }
}
