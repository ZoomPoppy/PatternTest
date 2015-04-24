package CommandPattern.Command;

import CommandPattern.RemoteObject.Stereo;

/**
 * Created by zz on 2015/4/24.
 */
public class SteroOnWithCDCommand implements Command {
    Stereo stereo;
    public SteroOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}
