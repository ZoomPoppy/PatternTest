package CompoundPattern.Duck;

/**
 * Created by zz on 2015/5/7.
 */
//abstract factory to create diff duck
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallarDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
