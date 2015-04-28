package StatePattern;

import StatePattern.DefectDesign.GumballMachine;

/**
 * Created by zz on 2015/4/28.
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine ;
    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuater() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned ,but there is no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
