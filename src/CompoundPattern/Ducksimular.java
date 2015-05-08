package CompoundPattern;

import CompoundPattern.Duck.*;
import CompoundPattern.Observable.Quackologist;

/**
 * Created by zz on 2015/5/6.
 */
public class Ducksimular {
    public static void main(String args[]){
        Ducksimular ducksimulator = new Ducksimular();
       AbstractDuckFactory duckFactory = new CountingDuckFactory();
        ducksimulator.simulate(duckFactory);
    }
    public void simulate(AbstractDuckFactory duckFactory){
        Quackable mallerDuck =duckFactory.createMallarDuck();
        Quackable reaheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallerDuck);
        flockOfDucks.add(reaheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(goose);
        Quackologist quackologist = new Quackologist();
       flockOfDucks.registerObserver(quackologist);
       simuator(flockOfDucks);
        System.out.println("The ducks quacked "+QuackCounter.getQuack()+"times");
    }
    public void simuator(Quackable duck){
        duck.quack();
    }
}
