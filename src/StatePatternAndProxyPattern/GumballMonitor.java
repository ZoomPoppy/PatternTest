package StatePatternAndProxyPattern;

/**
 * Created by zz on 2015/4/29.
 */
public class GumballMonitor {
    GumballMachine gumballMachine;
    public GumballMonitor(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public void report(){
        System.out.println("Gumball Machine : "+gumballMachine.getLocation());
        System.out.println("Current inventory: "+gumballMachine.getCount());
        System.out.println("Current state: "+gumballMachine.getState());
    }
}
