package CompoundPattern.Observable;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * Created by zz on 2015/5/8.
 */
public class Observable implements Quackobervable {
    ArrayList observers = new ArrayList();
    Quackobervable duck;
    public Observable(Quackobervable duck){
        this.duck = duck;
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
            }
    }
}
