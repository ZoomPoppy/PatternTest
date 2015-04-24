package CommandPattern.Command;

import CommandPattern.RemoteObject.GarageDoor;

/**
 * Created by zz on 2015/4/19.
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;
    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.lightOn();
        garageDoor.up();
        garageDoor.stop();
    }

    @Override
    public void undo() {
        garageDoor.down();
        garageDoor.lightOff();
        garageDoor.stop();
    }
}
