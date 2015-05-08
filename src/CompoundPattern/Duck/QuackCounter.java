package CompoundPattern.Duck;


import CompoundPattern.Observable.Observer;

/**
 * Created by zz on 2015/5/7.
 */
public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;
    public QuackCounter(Quackable duck){
        this.duck = duck;
    }
    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }
    public static int  getQuack(){
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
            duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {

    }
}
