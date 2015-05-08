package CompoundPattern.Duck;


import CompoundPattern.Observable.Observable;
import CompoundPattern.Observable.Observer;

/**
 * Created by zz on 2015/5/6.
 */
public class RedheadDuck implements Quackable {
    Observable mObservable;
    public RedheadDuck(){
        mObservable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("RedheadDuck quack");
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
