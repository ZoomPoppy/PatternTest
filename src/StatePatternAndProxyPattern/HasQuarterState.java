package StatePatternAndProxyPattern;

import java.util.Random;

/**
 * Created by zz on 2015/4/28.
 */
public class HasQuarterState implements State {
    Random random = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;
    public HasQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuater() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = random.nextInt(10);
        if ((winner==0)&&(gumballMachine.getCount()>0)){
            gumballMachine.setState(gumballMachine.getWinnerState());
        }
        else
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
