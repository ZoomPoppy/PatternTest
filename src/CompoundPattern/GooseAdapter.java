package CompoundPattern;

import CompoundPattern.Duck.Quackable;
import CompoundPattern.Observable.Observable;
import CompoundPattern.Observable.Observer;

/**
 * Created by zz on 2015/5/6.
 */
public class GooseAdapter implements Quackable {
    Goose goose;
    Observable mObservable;
    public GooseAdapter(Goose goose){
        this.goose = goose;
        mObservable = new Observable(this);

    }
    @Override
    public void quack() {
        goose.hoke();
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
