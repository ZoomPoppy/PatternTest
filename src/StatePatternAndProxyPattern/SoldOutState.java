package StatePatternAndProxyPattern;

/**
 * Created by zz on 2015/4/28.
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;
    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("Sorry,this machine is sold out ");
    }

    @Override
    public void ejectQuater() {
        System.out.println("Sorry, you didn't insert quarter ");
    }

    @Override
    public void turnCrank() {
        System.out.println("this machine is sold out");
    }

    @Override
    public void dispense() {
        System.out.println("this machine is sold out");

    }
}
