package CommandPattern;

import CommandPattern.Command.*;
import CommandPattern.RemoteObject.GarageDoor;
import CommandPattern.RemoteObject.Light;
import CommandPattern.RemoteObject.Stereo;
import com.sun.deploy.security.CeilingPolicy;

/**
 * Created by zz on 2015/4/24.
 */
public class RemoteLoader {
    public static void main(String[] args){
        RemoteCotrol remoteCotrol = new RemoteCotrol();
        Light livingRoomLight = new Light("Living Room");
        Light kichenLight = new Light("kitchen");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo= new Stereo();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kichenLightOn = new LightOnCommand(kichenLight);
        LightOffCommand kichenLingtOff = new LightOffCommand(kichenLight);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        SteroOnWithCDCommand steroOnWithCDCommand = new SteroOnWithCDCommand(stereo);

        remoteCotrol.setCommand(0,livingRoomLightOn,livingRoomLightOff);
        remoteCotrol.setCommand(1,kichenLightOn,kichenLingtOff);
        remoteCotrol.setCommand(2,garageDoorOpenCommand,garageDoorCloseCommand);

        System.out.println(remoteCotrol);

        remoteCotrol.onButtonPress(0);
        remoteCotrol.onButtonPress(1);
        remoteCotrol.onButtonPress(2);
        remoteCotrol.offButtonPress(0);
        remoteCotrol.offButtonPress(1);
        remoteCotrol.offButtonPress(2);
        remoteCotrol.undoButtonPress();


    }

}
