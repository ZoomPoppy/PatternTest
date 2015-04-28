package StatePattern.DefectDesign;

import StatePattern.*;

import java.util.Stack;

/**
 * Created by zz on 2015/4/28.
 */
//这种模式下，如果想添加一种状态，哪么你必须给每一个方法加一种状态，失败
public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State state = soldOutState;
    int count = 0;
    public GumballMachine(int numberGumballs){
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count =numberGumballs;
        if (numberGumballs > 0){
            state = noQuarterState;
        }
    }
    public void insertQuarter(){
        state.insertQuarter();
    }
    public void ejectQuarter(){
        state.ejectQuater();
    }
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }
    public void setState(State state){
        this.state = state;
    }
    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot");
        if (count!= 0){
            count = count - 1;
        }

    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }
}
