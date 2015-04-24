package CommandPattern.Command;

import CommandPattern.RemoteObject.GarageDoor;

/**
 * Created by zz on 2015/4/20.
 */
public class GarageDoorCloseCommand implements Command {
    GarageDoor garageDoor;
    public GarageDoorCloseCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;

    }
    @Override
    public void execute() {
        garageDoor.down();
        garageDoor.lightOff();
        garageDoor.stop();
    }

    @Override
    public void undo() {
        garageDoor.up();
        garageDoor.lightOn();
        garageDoor.stop();
    }
}
