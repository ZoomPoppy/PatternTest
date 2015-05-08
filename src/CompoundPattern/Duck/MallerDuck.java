package CompoundPattern.Duck;

import CompoundPattern.Observable.Observable;
import CompoundPattern.Observable.Observer;


/**
 * Created by zz on 2015/5/6.
 */
public class MallerDuck implements Quackable{
    Observable observable;
    public MallerDuck(){
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("MallerDuck quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
            observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
