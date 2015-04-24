package CommandPattern.Command;

import CommandPattern.RemoteObject.CeilingFan;

import javax.swing.*;

/**
 * Created by zz on 2015/4/24.
 */
public class CeilfingFanCommand implements Command{
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilfingFanCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();

    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH){
            ceilingFan.high();
        }
        else if (prevSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium();
        }
        else if (prevSpeed == CeilingFan.LOW){
            ceilingFan.low();
        }
        else if (prevSpeed == CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}
