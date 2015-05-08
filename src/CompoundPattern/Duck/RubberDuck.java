package CompoundPattern.Duck;


import CompoundPattern.Observable.Observable;
import CompoundPattern.Observable.Observer;

/**
 * Created by zz on 2015/5/6.
 */
public class RubberDuck implements Quackable{
    Observable mObservable;
    public RubberDuck(){
        mObservable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("RubberDuck Squeak");
        notifyObservers();

    }

    @Override
    public void registerObserver(Observer observer) {
        mObservable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        mObservable.notifyObservers();
    }
}
