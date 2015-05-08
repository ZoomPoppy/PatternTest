package CompoundPattern.Observable;

/**
 * Created by zz on 2015/5/8.
 */
public class Quackologist implements Observer {
    @Override
    public void update(Quackobervable duck) {
        System.out.println("Quackologist: "+duck.getClass().getSimpleName() + " just quacked");
    }
}
