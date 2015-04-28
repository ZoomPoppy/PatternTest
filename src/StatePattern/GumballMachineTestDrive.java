package StatePattern;

import StatePattern.DefectDesign.GumballMachine;

/**
 * Created by zz on 2015/4/28.
 */
public class GumballMachineTestDrive {
    public static void main(String args[]){
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();


    }
}
