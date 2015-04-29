package StatePatternAndProxyPattern;

/**
 * Created by zz on 2015/4/28.
 */
public class GumballMachineTestDrive {
    public static void main(String args[]){
        GumballMachine gumballMachine = new GumballMachine("asdfa",5000);
        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
        gumballMonitor.report();


    }
}
