package CompoundPattern.Duck;

/**
 * Created by zz on 2015/5/7.
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallarDuck() {
        return new QuackCounter(new MallerDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RedheadDuck());
    }
}
