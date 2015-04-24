package CommandPattern;

import CommandPattern.Command.GarageDoorOpenCommand;
import CommandPattern.Command.LightOnCommand;
import CommandPattern.RemoteObject.GarageDoor;
import CommandPattern.RemoteObject.Light;

/**
 * Created by zz on 2015/4/19.
 */
public class RemoteControlTest {
    public static void main(String [] args ){
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("light");
         LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }
}
