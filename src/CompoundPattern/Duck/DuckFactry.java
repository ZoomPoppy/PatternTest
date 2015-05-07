package CompoundPattern.Duck;

/**
 * Created by zz on 2015/5/7.
 */
//this is a factory did't hava decorator
public class DuckFactry extends AbstractDuckFactory {
    @Override
    public Quackable createMallarDuck() {
        return new MallerDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RedheadDuck();
    }
}
