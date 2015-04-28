package StatePattern;

import StatePattern.DefectDesign.GumballMachine;

import java.util.Stack;

/**
 * Created by zz on 2015/4/28.
 */
public class SoldState implements State {
    GumballMachine gumballMachine;
    public SoldState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuater() {
        System.out.println("Sorry, you already turned the crank ");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount()>0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
        else {
            System.out.println("Ooops,out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
