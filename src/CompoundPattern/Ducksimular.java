package CompoundPattern;

import CompoundPattern.Duck.*;

/**
 * Created by zz on 2015/5/6.
 */
public class Ducksimular {
    public static void main(String args[]){
        Ducksimular ducksimulator = new Ducksimular();

    }
    public void simulate(){
        Quackable mallerDuck = new MallerDuck();
        Quackable reaheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable goose = new GooseAdapter(new Goose());

        System.out.println("\nDuck Siumlator");
        simuator(mallerDuck);
        simuator(reaheadDuck);
        simuator(duckCall);
        simuator(rubberDuck);
        simuator(goose);
    }
    public void simuator(Quackable duck){
        duck.quack();
    }
}
