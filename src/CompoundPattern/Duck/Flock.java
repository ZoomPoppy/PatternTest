package CompoundPattern.Duck;

import CompoundPattern.Observable.Observable;
import CompoundPattern.Observable.Observer;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * Created by zz on 2015/5/8.
 */
public class Flock implements Quackable {
    Observable obserable;
    public Flock(){
        obserable = new Observable(this);
    }
    ArrayList quackers = new ArrayList();
    public void add(Quackable quackable ){
        quackers.add(quackable);
    }
    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while(iterator.hasNext()){
            Quackable quackable = (Quackable)iterator.next();
            quackable.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator  iterator = quackers.iterator();
        while (iterator.hasNext()){
            Quackable quackable = (Quackable) iterator.next();
            quackable.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        obserable.notifyObservers();
    }
}
