package CommandPattern;

import CommandPattern.Command.Command;
import CommandPattern.Command.NoCommand;

/**
 * Created by zz on 2015/4/19.
 */
public class RemoteCotrol {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteCotrol(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0;i<7;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }
    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    public void onButtonPress(int slot){
        onCommands[slot].execute();
    }
    public void offButtonPress(int slot){
        offCommands[slot].execute();
    }

    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n--------- remote Control ---------\n");
        for (int i = 0;i<onCommands.length;i++){
            stringBuffer.append("[slot "+i+"]"+onCommands[i].getClass().getName()+"  "+offCommands[i].getClass().getName()+"\n");
        }
        return stringBuffer.toString();
    }
}
