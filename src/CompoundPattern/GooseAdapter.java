package CompoundPattern;

import CompoundPattern.Duck.Quackable;

/**
 * Created by zz on 2015/5/6.
 */
public class GooseAdapter implements Quackable {
    Goose goose;
    public GooseAdapter(Goose goose){
        this.goose = goose;
    }
    @Override
    public void quack() {
        goose.hoke();
    }
}
