package CommandPattern;

import CommandPattern.Command.Command;

/**
 * Created by zz on 2015/4/19.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){}

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
