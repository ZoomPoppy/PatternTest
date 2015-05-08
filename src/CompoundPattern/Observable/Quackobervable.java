package CompoundPattern.Observable;

/**
 * Created by zz on 2015/5/8.
 */
public interface Quackobervable  {
    public void registerObserver(CompoundPattern.Observable.Observer observer);
    public void notifyObservers();
}
