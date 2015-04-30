package StatePatternAndProxyPattern;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * Created by zz on 2015/4/28.
 */
public class GumballMachineTestDrive {
    public static void main(String args[]){
        GumballMachine gumballMachine = null;
        int count;
        try {
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine("asdfa",count);
            Naming.rebind("//"+args[0]+"/gumballmachine",gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
        gumballMonitor.report();


    }
}
