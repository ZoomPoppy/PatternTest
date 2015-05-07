package CompoundPattern;

import CompoundPattern.Duck.*;

/**
 * Created by zz on 2015/5/6.
 */
public class Ducksimular {
    public static void main(String args[]){
        Ducksimular ducksimulator = new Ducksimular();
        ducksimulator.simulate();
    }
    public void simulate(){
        Quackable mallerDuck =new QuackCounter(new MallerDuck());
        Quackable reaheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter( new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable goose = new GooseAdapter(new Goose());

        System.out.println("Duck Siumlator: with Decorator\n");
        simuator(mallerDuck);
        simuator(reaheadDuck);
        simuator(duckCall);
        simuator(rubberDuck);
        simuator(goose);
        System.out.println("The ducks quacked "+QuackCounter.getQuack()+"times");
    }
    public void simuator(Quackable duck){
        duck.quack();
    }
}
