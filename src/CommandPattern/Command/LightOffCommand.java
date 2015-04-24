package CommandPattern.Command;

import CommandPattern.RemoteObject.Light;

/**
 * Created by zz on 2015/4/20.
 */
public class LightOffCommand implements Command {
    Light light;
    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}