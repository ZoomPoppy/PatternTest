package StatePattern;

import StatePattern.DefectDesign.GumballMachine;

/**
 * Created by zz on 2015/4/28.
 */
public class WinnerState implements State{
    GumballMachine gumballMachine;
    public WinnerState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        throw new  UnsupportedOperationException();
    }

    @Override
    public void ejectQuater() {
        throw new  UnsupportedOperationException();
    }

    @Override
    public void turnCrank() {
        throw new  UnsupportedOperationException();
    }

    @Override
    public void dispense() {
        System.out.println("YOU'RE WINNER! YOU GET TWO GUMBALLS FOR YOUR QUARTER");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount()==0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
        else{
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
}
